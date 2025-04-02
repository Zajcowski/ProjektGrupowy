# ProjektGrupowy

## Instalacja

### Pierwsze uruchomienie
Jeśli uruchamiasz projekt po raz pierwszy, musisz utworzyć bazę danych o nazwie `savepenny`. 
Możesz to zrobić z poziomu terminala łącząc się z PostgreSQL lub poprzez narzędzia obsługi PostgreSQL jak np. PG Admin.

Do uruchomienia potrzeba Javy w wersji 17.


### Budowanie projektu
1. **Budowanie JAR dla projektu Java w Springu**
   Możesz zbudować projekt przy użyciu komendy:
    ```
    ./mvnw clean package -DskipTests
    ```
   lub za pomocą zadania Mavenowego w IDE, wpisując w sekcji "Run" komendę:
    ```
    clean package -DskipTests
    ```

2. **Uruchomienie Dockera**
   Po utworzeniu pliku JAR (w folderze `target`), możesz uruchomić projekt za pomocą Dockera. Projekt obejmuje konfiguracje wszystkich 3 kontenerów: frontendu, backendu i bazy danych.
    ```
    docker compose up --build
    ```
