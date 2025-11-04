package org.campusmolndal;
import java.util.Date;


// WeatherService-klassen hanterar kommunikationen med WeatherAPI och hämtar data därifrån
public class WeatherService {
    private WeatherAPI weatherAPI;

    // Konstruktorn tar emot en instans av WeatherAPI
    public WeatherService(WeatherAPI weatherAPI) {
        this.weatherAPI = weatherAPI;
    }

    // Metod för att hämta aktuellt väder för en given stad genom att anropa WeatherAPI.getCurrentWeather()
    public String getCurrentWeather(String city) {
        return weatherAPI.getCurrentWeather(city);
    }

    // Metod för att hämta väderprognos för en given stad och antal dagar framåt genom att anropa WeatherAPI.getForecast()
    public String getForecast(String city, int days) {
        return weatherAPI.getForecast(city, days);
    }

    // Metod för att hämta historiskt väder för en given stad och datum genom att anropa WeatherAPI.getHistoricalWeather()
    public String getHistoricalWeather(String city, Date date) {
        return weatherAPI.getHistoricalWeather(city, date);
    }
}

