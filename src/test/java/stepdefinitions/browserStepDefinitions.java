package stepdefinitions;

import io.cucumber.java.en.Given;
import utils.Driver;

public class browserStepDefinitions {
    @Given("Kullanici gerekli kurulumlari yaparak url baglantisini saglar")
    public void kullanici_gerekli_kurulumlari_yaparak_url_baglantisini_saglar() {
        Driver.getAndroidDriver().get("https://www.amazon.com");
    }
}
