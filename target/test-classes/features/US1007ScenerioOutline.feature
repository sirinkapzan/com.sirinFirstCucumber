Feature: US1007 Kullanici amazonda istedigi kelimeleri aratir

  Scenario Outline: TC12 amazonda listedeki elementleri arama

    Given kullanici "amazonUrl" anasayfasinda
    Then kullanici "<istenenKelime>" aramasi yapar
    And sonuclarin "<istenenKelime>" icerdigini test eder
    And sayfayi kapatir

    Examples:
      | istenenKelime |
      | Nutella       |
      | Java          |
      | Dollar        |
      | Ayva          |

