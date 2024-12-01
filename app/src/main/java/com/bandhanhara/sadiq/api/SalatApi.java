package com.bandhanhara.sadiq.api;

import com.bandhanhara.sadiq.models.PrayerApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface SalatApi {
    @GET("calendar/{year}/{month}")
    Call<PrayerApiResponse> getPrayerTimesByCalendar(
            @Path("year") int year,              // Year (e.g., 2024)
            @Path("month") int month,            // Month (e.g., 12 for December)
            @Query("latitude") double latitude,  // Latitude (e.g., 23.744065)
            @Query("longitude") double longitude // Longitude (e.g., 90.393688)
    );
}
