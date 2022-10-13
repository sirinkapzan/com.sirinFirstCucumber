Feature: US1003 Parametre kullanarak arama yap

  @parameter
  Scenario: kullanici parametre kullanarak arama yap
    Given kullanici amazon anasayfasinda
    Then kullanici "Java" aramasi yapar
    And sonuclarin "Java" icerdigini test eder
    And sayfayi kapatir