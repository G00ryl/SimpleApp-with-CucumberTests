Feature: Logowanie do aplikacji. W tym pliku będziemy testować logowanie użytkownika do aplikacji.
  Sekcja ta jest traktowana jako opis i nie wpływa na wykonanie testu.

  Scenario: Użytkownik podaje poprawne dane;
    # given jest warunkiem wstępnym do przeprowadzenia testu
    Given Użytkownik jest na stronie logowania
    And Użytkownik istnieje w bazie danych
    # when określa akcje która zostanie wykonana
    When Użytkownik wprowadza  nazwę użytkownika i hasło
    # and opisuje dodatkową akcję lub warunek
    And Użytkownik klika przycisk zaloguj
    # then opisuje wynik poprzednich kroków
    Then Użytkownik zostaje zalogowany na stronę domową aplikacji
    And Informacja o udanym logowaniu zostanie wyświetlona

  Scenario: Użytkownik podaje błędne hasło
    Given Użytkownik jest na stronie logowania
    And Użytkownik istnieje w bazie danych
    When Użytkownik wprowadza nazwę użytkownika i błędne hasło
    And Użytkownik klika przycisk zaloguj
    #but umożliwia dodanie negatywnego komentarza, używany do negatywnych warunków
    But Dane logowania są niepoprawne
    Then Użytkownik nie zostaje zalogowany na stronę domową aplikacji
    And Informacja o nieudanej próbie zalogowania się zostaje wyświetlona.
