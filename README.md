# tdd-och-mock-AhmadAlhayel
# WeatherServiceTest
WeatherServiceTest är ett Java-projekt som fokuserar på att testa WeatherService-klassen för att säkerställa att den fungerar korrekt och ger rätt väderdata baserat på API-anrop.

## Installation
Klona projektet från GitHub-repot: git clone https://github.com/din-anvandarnamn/WeatherServiceTest.git
Öppna projektet i din favorit-IDE (t.ex. IntelliJ)
# Användning
Se till att WeatherService-klassen är korrekt konfigurerad för att anropa det riktiga API:et eller använda en mockade API-klient.
Kör testklassen WeatherServiceTest.java för att köra alla testfall.

# Libraries

Projektet är beroende av följande bibliotek och ramverk:

#### Junit
. org.junit.jupiter

#### Mockito
. org.mockito mockito-core 5.3.1

#### JUnit: 
Ett testramverk för att skapa och köra testfall i Java.
#### Mockito: 
Ett mockningsramverk för att skapa mock-objekt och simulera anrop till externa tjänster.
Dessa beroenden är redan inkluderade i projektet och kommer att laddas ner automatiskt om du använder Maven.

# Syfte 
### Översikt:

Jag har testat WeatherService-klassen för att se om den fungerar som den ska. Jag har skapat tre olika tester för att hämta väderdata: för aktuellt väder, väderprognos och historiskt väder. Jag har använt ett "mock" (fejk) väder-API för att testa klassen.
