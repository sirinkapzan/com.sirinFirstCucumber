Feature: Amazon Search

  @Nutella
  Scenario: TC01 kullanici amazonda kelime aratir
    Given kullanici amazon anasayfasinda
    Then kullanici nutella aramasi yapar
    Then sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir

    @Java
    Scenario: TC02 kullanici amazonda kelime aratir
      Given kullanici amazon anasayfasinda
      Then kullanici java aramasi yapar
      And sonuclarin java icerdigini test eder
      And sayfayi kapatir




