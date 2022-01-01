Feature:
  -Starbucks uygulaması açılır.
  -Splash Screen ekranı geçilir.
  -Açılan PopUp kapatılır.

  -Menu sayfasına gidilir.
  -Menu sayfasında oldugu kontrol edilir.
  -"Lemon Cake" ürünü seçilir ve kontrol edilir.
  -ÜrünDetay Sayfası kapatılır.

  -Anasayfaya geri dönülür.
  -Anasayfadaki "text" kontrol edilir.

  -Card Sayfasına gidilir.
  -Card Sayfasındaki "text" kontrol edilir.


  Scenario: Test Case 1
    Given Kullanıcı uygulamayı açar
    And Splash Secreen butonlarına tıklar.
    And PopUp kapatılır.

    When Menu sayfasına gidilir.
    Then Menu sayfasında oldugu kontrol edilir.
    And "Lemon Cake" ürünü seçilir ve kontrol edilir.
    And ÜrünDetay Sayfası kapatılır.
Scenario: Test Case 2
    When Anasayfaya geri dönülür ve "Hi" yazısı kontrol edilir.
    And Card Sayfasına gidilir.
    Then Card Sayfasındaki "Starbucks Card" kontrol edilir.