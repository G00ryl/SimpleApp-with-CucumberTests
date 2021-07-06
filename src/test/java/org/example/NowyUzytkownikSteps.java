package org.example;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class NowyUzytkownikSteps {


    @Given("Użytkownik jest na stronie formularza dodawania nowego użytkownika")
    public void użytkownikJestNaStronieLogowania() {

        System.out.println("Użytkownik jest na stronie formularza rejestracji w systemie");
    }

    @When("Wprowadza poprawne dane do formularza")
    public void wprowadzaPoprawneDaneDoFormularza(DataTable dataTable) {
        Map<String,String> data = dataTable.asMap(String.class,String.class);
        System.out.println("Wpisujemy wymagane informacje do systemu:");
        System.out.println("Imie: " + data.get("imie"));
        System.out.println("Nazwisko: " + data.get("nazwisko"));
        System.out.println("Miasto: " + data.get("miasto"));
        System.out.println("Ulica: " + data.get("ulica"));
    }

    @Then("Informacja o dodaniu użytkownika pojawia się na ekranie")
    public void informacjaODodaniuUżytkownikaPojawiaSięNaEkranie() {
        System.out.println("Dodano nowego użytkownika");
    }
}
