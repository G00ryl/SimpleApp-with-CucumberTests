Feature: Logowanie do aplikacji. W tym pliku będziemy testować logowanie użytkownika do aplikacji.
  Sekcja ta jest traktowana jako opis i nie wpływa na wykonanie testu.

  Background:
    Given Użytkownik jest na stronie logowania

  Scenario: Użytkownik podaje poprawne dane;
    # given jest warunkiem wstępnym do przeprowadzenia testu
    And Użytkownik o nazwie "login" i hasle "haslo" istnieje w bazie danych
    # when określa akcje która zostanie wykonana
    When Użytkownik wprowadza  nazwę użytkownika "login" i hasło "haslo"
    # and opisuje dodatkową akcję lub warunek
    And Użytkownik klika przycisk zaloguj
    # then opisuje wynik poprzednich kroków
    Then Użytkownik zostaje zalogowany na stronę domową aplikacji
    And Informacja o udanym logowaniu zostanie wyświetlona


