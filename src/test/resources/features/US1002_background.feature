@wip
Feature: US1002 ortak kullanimlari Background ile calistir

  Background: Ortak adim
    Given amazon anasayfaya git

  Scenario: TC04 amazonda nutella ara
    Given kullanici nutella aramasi yapar
    Then sonuclari test eder Nutella iceriyor mu
    And sayfayi kapat

  Scenario: TC05 amazonda java ara
    Then Java aramasi yap
    Then sonuclarda Java var mi Test et
    And sayfayi kapat
