Feature: US1009 editor sayfasinda giris yapilabildigini test et


  @editor3
  Scenario Outline: TC13 Edito sayfasina farkli kisiler ekleme
    Given kullanici "HMCUrl" anasayfasinda
    Then user login tiklar
    And user gecersiz username "<username>" girer
    And user gecersiz password "<password>" girer
    And user login2 butonuna basar
    Then user sayfaya giris yaptigini kontrol eder
    And sayfayi kapatir

    Examples:
      | username | password  |
      | Manager5 | Manager5! |
      | Manager6 | Manager6! |
      | Manager7 | Manager7! |
      | Manager8 | Manager8! |
      | Manager9 | Manager9! |

