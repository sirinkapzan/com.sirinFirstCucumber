Feature: US1009 editor sayfasinda giris yapilabildigini test et


  @mvn
  Scenario Outline: TC13 Edito sayfasina farkli kisiler ekleme
    When kullanici anasayfada

    Then new butonuna basar
    And kullanici 1 saniye bekler

    And isim bolumune "<firstname>" yazar
    And kullanici 1 saniye bekler

    And soyisim bolumune "<lastname>" yazar
    And kullanici 1 saniye bekler

    And position bolumune "<position>" yazar
    And kullanici 1 saniye bekler

    And office bolumune "<office>" yazar
    And kullanici 1 saniye bekler

    And extension bolumune "<extension>" yazar
    And kullanici 1 saniye bekler

    And startDate bolumune "<starDate>" yazar
    And kullanici 1 saniye bekler

    And salary bolumune "<salary>" yazar
    And kullanici 1 saniye bekler

    And Create tusuna basar
    And kullanici 1 saniye bekler

    When kullanici ilk isim ile "<firstname>" arama yapar
    And kullanici 1 saniye bekler

    Then isim bolumunde "<firstname>" oldugunu dogrular
    And kullanici 1 saniye bekler


    Examples:
      | firstname | lastname | position | office     | extension | starDate   | salary |
      | Alim      | Kemal    | QA       | diyarbakir | UI        | 2021-12-12 | 1800   |
      | Ahmet     | Orhan    | Dev      | siirt      | API       | 2021-12-12 | 1500   |
      | John      | Jack     | Devops   | batman     | DB        | 2021-12-12 | 1600   |
      | Sirin     | Kapzan   | BA       | urfa       | UI        | 2021-12-12 | 2000   |
      | Cemal     | Sureya   | PO       | bitlis     | DB        | 2021-12-12 | 7000   |

