Feature: Amazon Search

  @Nutella
  Scenario: TC01 kullanici amazonda kelime aratir
    Given kullanici amazon anasayfasinda
    Then kullanici nutella aramasi yapar
    And sonuclari test eder Nutella iceriyor mu
    And sayfayi kapatir

  @Java
  Scenario: TestCase02 Amazonda Java ara
    Given amazon anasayfaya git
    Then Java aramasi yap
    And sonuclarda Java var mi Test et
    And sayfayi kapat

  @Iphone
  Scenario: TC03 amazonda iphone ara
    Given amazon anasayfaya git
    Then iphone aramasi yap
    And sonuclarda Iphone var mi Test et
    And sayfayi kapat
