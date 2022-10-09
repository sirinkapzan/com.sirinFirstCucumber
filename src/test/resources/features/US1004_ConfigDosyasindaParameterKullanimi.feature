Feature: Parametre ile configuration file kullan

  @config
  Scenario: TC07 configuration properties dosyasindan parametre kullan
    Given "brcUrl" anasayfaya git
    Then 3 saniye bekle
    And Url "blue" iceriyor mu
    And sayfayi kapat

  Scenario: TC08 configuration properties dosyasindan parametre kullan
    Given "facebookUrl" anasayfaya git
    Then 3 saniye bekle
    And Url "book" iceriyor mu
    And sayfayi kapat