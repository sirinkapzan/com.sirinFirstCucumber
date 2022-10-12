Feature: Parametre ile configuration file kullan

  @config
  Scenario: TC07 configuration properties dosyasindan parametre kullan
    Given kullanici "HMCUrl" anasayfasinda
    When  Url'in "hotel" icerdigini test eder
    Then kullanici 3 saniye bekler
    And user sayfayi kapatir



  Scenario: TC08 configuration properties dosyasindan parametre kullan
    Given "facebookUrl" anasayfaya git
    Then kullanici 3 saniye bekler
    And Url "book" iceriyor mu
    And sayfayi kapat