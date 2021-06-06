package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {
    @Given("Konto z saldem 200zl")
    public void kontoZSaldem200Zl() {
        System.out.println("Konto z saldem");
    }

    @When("Uzytkownik probuje wyplacic 300zl")
    public void uzytkownikProbujeWyplacic300Zl() {
        System.out.println("Metoda when wyplata z konta");
    }

    @Then("Na ekranie wyswietla sie komunikat o nie wystarczajacej ilosci gotowki na koncie")
    public void naEkranieWyswietlaSieKomunikatONieWystarczajacejIlosciGotowkiNaKoncie() {
        System.out.println("Metoda when sprawdzenie konta z saldem");
    }

}
