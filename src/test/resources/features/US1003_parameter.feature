Feature: Parametre kullanarak arama yap

  @parameter
  Scenario: parametre kullanarak arama yap
    Given amazon anasayfaya git
    Then kullanici "Java" aramasi yapar
    And sonuclari test eder "Java" iceriyor mu
    And sayfayi kapat