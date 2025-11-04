package org.campusmolndal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class WeatherServiceTest {
    @Mock
    private WeatherAPI weatherAPI;

    private WeatherService weatherService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        weatherService = new WeatherService(weatherAPI);
    }

    // Testmetod för att testa getCurrentWeather-metoden i WeatherService
    @Test
    public void testGetCurrentWeather() {
        String city = "Stockholm";
        String expectedWeather = "Sunny";

        // Definiera förväntat beteende för mock-objektet
        when(weatherAPI.getCurrentWeather(city)).thenReturn(expectedWeather);

        // Anropa getCurrentWeather-metoden i WeatherService och jämför resultatet med förväntat värde
        String actualWeather = weatherService.getCurrentWeather(city);
        assertEquals(expectedWeather, actualWeather);
    }

    // Testmetod för att testa getForecast-metoden i WeatherService
    @Test
    public void testGetForecast() {
        String city = "Stockholm";
        int days = 5;
        String expectedForecast = "Rainy";

        // Definiera förväntat beteende för mock-objektet
        when(weatherAPI.getForecast(city, days)).thenReturn(expectedForecast);

        // Anropa getForecast-metoden i WeatherService och jämf

        String actualForecast = weatherService.getForecast(city, days);

        assertEquals(expectedForecast, actualForecast);
    }

    @Test
    public void testGetHistoricalWeather() {
        String city = "Stockholm";
        Date date = new Date();
        String expectedWeather = "Cloudy";

        when(weatherAPI.getHistoricalWeather(city, date)).thenReturn(expectedWeather);

        String actualWeather = weatherService.getHistoricalWeather(city, date);

        assertEquals(expectedWeather, actualWeather);
    }
}
