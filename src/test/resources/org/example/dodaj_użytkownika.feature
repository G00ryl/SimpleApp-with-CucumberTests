Feature: Dodawanie użytkownika
  #Scenario outline is used to pass a parameters to When method
  Scenario Outline: Dodawanie użytkownika z poprawnymi danymi
    Given Użytkownik jest na stronie formularza dodawania nowego użytkownika
    When Wprowadza poprawne dane do formularza
    |imie|<imie>|
    |nazwisko|<nazwisko>|
    |miasto|<miasto>|
    |ulica|<ulica>|
    Then Informacja o dodaniu użytkownika pojawia się na ekranie

    #Examples is used to give a value for parameters
  Examples:
    |imie|nazwisko|miasto|ulica|
    |Tomasz|Kot|Warszawa|Warszawska|
    |Jan|Nowak|Gdańsk|Warszawska|