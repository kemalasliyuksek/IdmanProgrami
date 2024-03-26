# IdmanProgrami

Bu proje, basit bir antrenman takip programıdır. Kullanıcıya burpee, pushup, situp ve squat hedefleri belirleme ve bu hareketlerin tamamlanma durumunu takip etme imkanı sağlar.

Nasıl Çalışır?

* Program, Idman.java dosyasında tanımlanan Idman sınıfı ile çalışır. Bu sınıf, her bir hareket türü (burpee, pushup, situp, squat) için hedef tekrar sayısını tutar.
* hareketYap metodu, hareket türünü ve tekrar sayısını parametre olarak alır ve girilen hareketi belirtilen tekrar sayısı kadar azaltır.
* idmanBittiMi metodu, tüm hedef tekrar sayılarının sıfıra ulaştığında True döndürür.
* Main.java dosyası ise programın giriş noktasıdır. Kullanıcıdan hedef tekrar sayılarını alır, bir Idman nesnesi oluşturur ve antrenman döngüsünü başlatır.
* Döngü içerisinde kullanıcıdan hareket türü ve tekrar sayısı istenir ve girilen değerler hareketYap metodu ile işlenir.
* Tüm hedefler tamamlandığında döngü sona erer ve kullanıcıya antrenmanın bittiği bilgisi verilir.

Kullanım

* Programı herhangi bir Java IDE'sine (örneğin, Eclipse, IntelliJ IDEA) import edin.
* Main.java dosyasını çalıştırın.
* Program sizden her hareket türü için hedef tekrar sayısı isteyecektir. İstediğiniz değerleri girin.
* Ardından, döngü içerisinde hangi hareketi kaç tekrar yapmak istediğinizi girebilirsiniz.
* Tüm hedefler tamamlandığında program antrenmanın bittiğini belirtecektir.
