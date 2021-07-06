package org.example;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LogowanieStepsDef {

    private LogIn login;
    private String username;
    private String password;

    @Given("Użytkownik jest na stronie logowania")
    public void użytkownikJestNaStronieLogowania() {
        login = new LogIn();
    }

    @And("Użytkownik o nazwie {string} i hasle {string} istnieje w bazie danych")
    public void użytkownikONazwieIHasleIstniejeWBazieDanych(String username, String password) {
        login.setUserinDatabase(username,password);
    }

    @When("Użytkownik wprowadza  nazwę użytkownika {string} i hasło {string}")
    public void użytkownikWprowadzaNazwęUżytkownikaIHasło(String username, String password) {
        this.username = username;
        this.password = password;
        login.login(username,password);
    }

    @And("Użytkownik klika przycisk zaloguj")
    public void użytkownikKlikaPrzyciskZaloguj() {
        System.out.println("Klikamy przycisk zaloguj");
    }

    @Then("Użytkownik zostaje zalogowany na stronę domową aplikacji")
    public void użytkownikZostajeZalogowanyNaStronęDomowąAplikacji() {
        Assert.assertTrue(login.isLoggedIn());
    }

    @And("Informacja o udanym logowaniu zostanie wyświetlona")
    public void informacjaOUdanymLogowaniuZostanieWyświetlona() {
        Assert.assertTrue(login.getMsg().equals("Udało się zalogować"));
    }

    @When("Użytkownik wprowadza nazwę użytkownika {string} i błędne hasło {string}")
    public void użytkownikWprowadzaNazwęUżytkownikaIBłędneHasło(String arg0, String arg1) {
    }

    @But("Dane logowania są niepoprawne")
    public void daneLogowaniaSąNiepoprawne() {
        String databaseUsername = login.getCurrentUser();
        String databasePassword = login.getCurrentPassword();
        Assert.assertFalse(username.equals(databaseUsername)&& password.equals(databasePassword));
    }

    @Then("Użytkownik nie zostaje zalogowany na stronę domową aplikacji")
    public void użytkownikNieZostajeZalogowanyNaStronęDomowąAplikacji() {
        Assert.assertFalse(login.isLoggedIn());
    }

    @And("Informacja o nieudanej próbie zalogowania się zostaje wyświetlona.")
    public void informacjaONieudanejPróbieZalogowaniaSięZostajeWyświetlona() {
        Assert.assertTrue(login.getMsg().equals("Nie udało się Ci zalogować"));
    }
}
