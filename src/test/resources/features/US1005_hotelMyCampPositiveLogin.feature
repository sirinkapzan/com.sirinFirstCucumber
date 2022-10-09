Feature: US1005 HMC Login

  @hmc
  Scenario: TC108 positive login test
    Given user " " anasayfaya gider
    Then user login tiklar
    And user gecerli username girer
    And user gecerli password girer
    And user login2 butonuna basar
    Then user sayfaya giris yaptigini kontrol eder
    And user sayfayi kapatir

