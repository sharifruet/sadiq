package com.bandhanhara.sadiq;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bandhanhara.sadiq.api.SalatApi;
import com.bandhanhara.sadiq.models.PrayerApiResponse;

import java.util.Calendar;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView todayTimingsTextView;
    private TextView tomorrowTimingsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        todayTimingsTextView = findViewById(R.id.todayTimingsTextView);
        tomorrowTimingsTextView = findViewById(R.id.tomorrowTimingsTextView);

        fetchPrayerTimes();
    }

    private void fetchPrayerTimes() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.aladhan.com/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        SalatApi api = retrofit.create(SalatApi.class);

        // Get current year and month
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Months are 0-based
        Log.i("DBG", "My LOG");
        api.getPrayerTimesByCalendar(year, month, 23.744065, 90.393688).enqueue(new Callback<PrayerApiResponse>() {
            @Override
            public void onResponse(Call<PrayerApiResponse> call, Response<PrayerApiResponse> response) {
                Log.i("DBG", "SUCCESS");
                if (response.isSuccessful() && response.body() != null) {
                    PrayerApiResponse prayerApiResponse = response.body();
                    Log.i("DBG", prayerApiResponse.toString());
                    displayPrayerTimes(prayerApiResponse);
                } else {
                    Toast.makeText(MainActivity.this, "Failed to fetch prayer times", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<PrayerApiResponse> call, Throwable t) {
                Log.i("DBG", t.getMessage());
                Toast.makeText(MainActivity.this, "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void displayPrayerTimes(PrayerApiResponse response) {
        Calendar calendar = Calendar.getInstance();
        int todayIndex = calendar.get(Calendar.DAY_OF_MONTH) - 1;
        int tomorrowIndex = todayIndex + 1;

        try {
            // Get today's timings
            PrayerApiResponse.Data todayData = response.getData().get(todayIndex);
            String todayTimings = formatTimings(todayData.getTimings());

            // Get tomorrow's timings
            PrayerApiResponse.Data tomorrowData = response.getData().get(tomorrowIndex);
            String tomorrowTimings = formatTimings(tomorrowData.getTimings());

            todayTimingsTextView.setText("Today's Salat Timings:\n" + todayTimings);
            tomorrowTimingsTextView.setText("Tomorrow's Salat Timings:\n" + tomorrowTimings);

        } catch (IndexOutOfBoundsException e) {
            Toast.makeText(this, "Error displaying timings: " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private String formatTimings(PrayerApiResponse.Timings timings) {
        return "Fajr: " + timings.getFajr() +
                "\nDhuhr: " + timings.getDhuhr() +
                "\nAsr: " + timings.getAsr() +
                "\nMaghrib: " + timings.getMaghrib() +
                "\nIsha: " + timings.getIsha();
    }
}
