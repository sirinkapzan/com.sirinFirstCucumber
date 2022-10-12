Feature: US1005 HMC Login

  @hmc
  Scenario: TC08 positive login test
    Given kullanici "HMCUrl" anasayfasinda
    Then user login tiklar
    And user gecerli username girer
    And user gecerli password girer
    And user login2 butonuna basar
    Then user sayfaya giris yaptigini kontrol eder
    And sayfayi kapatir


