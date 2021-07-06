@QA
Feature: Wyplata pieniedzy z bankomatu

  Scenario: Proba wyplacenia wiekszej ilosci niz saldo konta

    Given Konto z saldem 200zl
    When Uzytkownik probuje wyplacic 300zl
    Then Na ekranie wyswietla sie komunikat o nie wystarczajacej ilosci gotowki na koncie