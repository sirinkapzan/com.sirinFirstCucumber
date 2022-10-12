Feature: US1007 Kullanici amazonda istedigi kelimeleri aratir

  Scenario Outline: TC12 amazonda listedeki elementleri arama

    Given kullanici "amazonUrl" anasayfasinda
    Then kullanici "<istenenKelime>" icin arama yapar
    And sonuclarin "<istenenKelime>" icerdigini test eder
    And user sayfayi kapatir

    Examples:
    |istenenKelime|
    |Java         |
    |Elma         |
    |Ayva         |

