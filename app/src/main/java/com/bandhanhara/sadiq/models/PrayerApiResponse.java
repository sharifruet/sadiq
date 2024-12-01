package com.bandhanhara.sadiq.models;

import java.util.List;
import java.util.Map;

public class PrayerApiResponse {
    private int code;
    private String status;
    private List<Data> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public static class Data {
        private Timings timings;
        private Date date;
        private Meta meta;

        public Timings getTimings() {
            return timings;
        }

        public void setTimings(Timings timings) {
            this.timings = timings;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public Meta getMeta() {
            return meta;
        }

        public void setMeta(Meta meta) {
            this.meta = meta;
        }
    }

    public static class Timings {
        private String Fajr;
        private String Sunrise;
        private String Dhuhr;
        private String Asr;
        private String Sunset;
        private String Maghrib;
        private String Isha;
        private String Imsak;
        private String Midnight;
        private String Firstthird;
        private String Lastthird;

        public String getFajr() {
            return Fajr;
        }

        public void setFajr(String fajr) {
            Fajr = fajr;
        }

        public String getSunrise() {
            return Sunrise;
        }

        public void setSunrise(String sunrise) {
            Sunrise = sunrise;
        }

        public String getDhuhr() {
            return Dhuhr;
        }

        public void setDhuhr(String dhuhr) {
            Dhuhr = dhuhr;
        }

        public String getAsr() {
            return Asr;
        }

        public void setAsr(String asr) {
            Asr = asr;
        }

        public String getSunset() {
            return Sunset;
        }

        public void setSunset(String sunset) {
            Sunset = sunset;
        }

        public String getMaghrib() {
            return Maghrib;
        }

        public void setMaghrib(String maghrib) {
            Maghrib = maghrib;
        }

        public String getIsha() {
            return Isha;
        }

        public void setIsha(String isha) {
            Isha = isha;
        }

        public String getImsak() {
            return Imsak;
        }

        public void setImsak(String imsak) {
            Imsak = imsak;
        }

        public String getMidnight() {
            return Midnight;
        }

        public void setMidnight(String midnight) {
            Midnight = midnight;
        }

        public String getFirstthird() {
            return Firstthird;
        }

        public void setFirstthird(String firstthird) {
            Firstthird = firstthird;
        }

        public String getLastthird() {
            return Lastthird;
        }

        public void setLastthird(String lastthird) {
            Lastthird = lastthird;
        }
    }

    public static class Date {
        private String readable;
        private String timestamp;
        private Gregorian gregorian;
        private Hijri hijri;

        public String getReadable() {
            return readable;
        }

        public void setReadable(String readable) {
            this.readable = readable;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public Gregorian getGregorian() {
            return gregorian;
        }

        public void setGregorian(Gregorian gregorian) {
            this.gregorian = gregorian;
        }

        public Hijri getHijri() {
            return hijri;
        }

        public void setHijri(Hijri hijri) {
            this.hijri = hijri;
        }
    }

    public static class Gregorian {
        private String date;
        private String format;
        private String day;
        private Weekday weekday;
        private Month month;
        private String year;
        private Designation designation;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public Weekday getWeekday() {
            return weekday;
        }

        public void setWeekday(Weekday weekday) {
            this.weekday = weekday;
        }

        public Month getMonth() {
            return month;
        }

        public void setMonth(Month month) {
            this.month = month;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public Designation getDesignation() {
            return designation;
        }

        public void setDesignation(Designation designation) {
            this.designation = designation;
        }
    }

    public static class Hijri {
        private String date;
        private String format;
        private String day;
        private Weekday weekday;
        private Month month;
        private String year;
        private Designation designation;
        private List<String> holidays;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public Weekday getWeekday() {
            return weekday;
        }

        public void setWeekday(Weekday weekday) {
            this.weekday = weekday;
        }

        public Month getMonth() {
            return month;
        }

        public void setMonth(Month month) {
            this.month = month;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public Designation getDesignation() {
            return designation;
        }

        public void setDesignation(Designation designation) {
            this.designation = designation;
        }

        public List<String> getHolidays() {
            return holidays;
        }

        public void setHolidays(List<String> holidays) {
            this.holidays = holidays;
        }
    }

    public static class Weekday {
        private String en;
        private String ar;

        public String getEn() {
            return en;
        }

        public void setEn(String en) {
            this.en = en;
        }

        public String getAr() {
            return ar;
        }

        public void setAr(String ar) {
            this.ar = ar;
        }
    }

    public static class Month {
        private int number;
        private String en;
        private String ar;

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getEn() {
            return en;
        }

        public void setEn(String en) {
            this.en = en;
        }

        public String getAr() {
            return ar;
        }

        public void setAr(String ar) {
            this.ar = ar;
        }
    }

    public static class Designation {
        private String abbreviated;
        private String expanded;

        public String getAbbreviated() {
            return abbreviated;
        }

        public void setAbbreviated(String abbreviated) {
            this.abbreviated = abbreviated;
        }

        public String getExpanded() {
            return expanded;
        }

        public void setExpanded(String expanded) {
            this.expanded = expanded;
        }
    }

    public static class Meta {
        private double latitude;
        private double longitude;
        private String timezone;
        private Method method;
        private String latitudeAdjustmentMethod;
        private String midnightMode;
        private String school;
        private Map<String, Integer> offset;

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public String getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public Method getMethod() {
            return method;
        }

        public void setMethod(Method method) {
            this.method = method;
        }

        public String getLatitudeAdjustmentMethod() {
            return latitudeAdjustmentMethod;
        }

        public void setLatitudeAdjustmentMethod(String latitudeAdjustmentMethod) {
            this.latitudeAdjustmentMethod = latitudeAdjustmentMethod;
        }

        public String getMidnightMode() {
            return midnightMode;
        }

        public void setMidnightMode(String midnightMode) {
            this.midnightMode = midnightMode;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public Map<String, Integer> getOffset() {
            return offset;
        }

        public void setOffset(Map<String, Integer> offset) {
            this.offset = offset;
        }
    }

    public static class Method {
        private int id;
        private String name;
        private Params params;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Params getParams() {
            return params;
        }

        public void setParams(Params params) {
            this.params = params;
        }
    }

    public static class Params {
        private double fajr;
        private double isha;

        public double getFajr() {
            return fajr;
        }

        public void setFajr(double fajr) {
            this.fajr = fajr;
        }

        public double getIsha() {
            return isha;
        }

        public void setIsha(double isha) {
            this.isha = isha;
        }
    }
}
