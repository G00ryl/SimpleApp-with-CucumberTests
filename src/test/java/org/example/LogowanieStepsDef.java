package org.example;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogowanieStepsDef {

    @Given("Użytkownik jest na stronie logowania")
    public void użytkownik_jest_na_stronie_logowania() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
        }
        @Given("Użytkownik istnieje w bazie danych")
        public void użytkownik_istnieje_w_bazie_danych () {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        }
        @When("Użytkownik wprowadza  nazwę użytkownika i hasło")
        public void użytkownik_wprowadza_nazwę_użytkownika_i_hasło () {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        }
        @When("Użytkownik klika przycisk zaloguj")
        public void użytkownik_klika_przycisk_zaloguj () {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        }
        @Then("Użytkownik zostaje zalogowany na stronę domową aplikacji")
        public void użytkownik_zostaje_zalogowany_na_stronę_domową_aplikacji () {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        }
        @Then("Informacja o udanym logowaniu zostanie wyświetlona")
        public void informacja_o_udanym_logowaniu_zostanie_wyświetlona () {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        }

    @When("Użytkownik wprowadza  nazwę użytkownika {string} i hasło {string}")
    public void użytkownikWprowadzaNazwęUżytkownikaIHasło(String login, String haslo) {
    }

    @And("Użytkownik o nazwie {string} i hasle {string} istnieje w bazie danych")
    public void użytkownikONazwieIHasleIstniejeWBazieDanych(String login, String haslo) {
    }

    @When("Użytkownik wprowadza nazwę użytkownika {string} i błędne hasło {string}")
    public void użytkownikWprowadzaNazwęUżytkownikaIBłędneHasło(String login2, String zlehaslo) {
    }
}
