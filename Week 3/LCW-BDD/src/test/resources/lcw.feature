Feature: LCW BDD TEST
  -Siteye login işlemi yapılır.
  -Arama kutusunda bir ürün aratılır.
  -Outlet kategorisine gidilir ve sepete eklenir.Sepete eklendiği kontrol edilir.

  Background: CerezleriKapatma
    Given cerezkapama

  Scenario: Login işlemi
    Given Login sayfasını gidilir.
    Then Kullanıcı bilgileri girilir.
    And Üye girişi kontrol edilir.



   Scenario: Ürün arama
     Given SearchFindKeywords butonuna tıklanır.
     Then  "sweat" ürünü aratılır.
     And   İlgili arama "sweat" mi diye kontrol edilir.

    Scenario: Sepete Ürün Ekleme
      Given Outlet kategorine tıklanır
      Then  Ürün seçimi yapılır.
      And   Ürün sepete eklenir.
      And   Ürün sepette mi bakılır.