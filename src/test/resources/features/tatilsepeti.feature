Feature:Tatil sepeti sitesinde rezervasyon oluşturma adımları

  Scenario: Kullanıcı tatilsepeti sitesine gider ve rezervasyon son basamağına gelir.

    Given Kullanıcı tatilsepeti sayfasına gider
    When Profil icon tiklanir
    And Email input alanına gecerli email girilir
    And Password input alanına gecerli password girilir
    And Login butonu tiklanir
    And ARA butonu tıklanır.
    When Detayları incele tıklanır.
    And Rezervasyon yap butonu tıklanır.
    And Yetiskin isim "ali" ve soyisim "veli" girilir
    And Ödeme için devam et tıklanır
    Then "Rezervasyon Bilgileriniz" ekranı görülür.
    And Sayfa kapatilir










