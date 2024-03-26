public class Idman {

    private int burpeeSayisi;
    private int pushupSayisi;
    private int situpSayisi;
    private int squatSayisi;

    public Idman(int burpeeSayisi, int pushupSayisi, int situpSayisi, int squatSayisi) {
        this.burpeeSayisi = burpeeSayisi;
        this.pushupSayisi = pushupSayisi;
        this.situpSayisi = situpSayisi;
        this.squatSayisi = squatSayisi;
    }

    public int getBurpeeSayisi() {
        return burpeeSayisi;
    }

    public void setBurpeeSayisi(int burpeeSayisi) {
        this.burpeeSayisi = burpeeSayisi;
    }

    public int getPushupSayisi() {
        return pushupSayisi;
    }

    public void setPushupSayisi(int pushupSayisi) {
        this.pushupSayisi = pushupSayisi;
    }

    public int getSitupSayisi() {
        return situpSayisi;
    }

    public void setSitupSayisi(int situpSayisi) {
        this.situpSayisi = situpSayisi;
    }

    public int getSquatSayisi() {
        return squatSayisi;
    }

    public void setSquatSayisi(int squatSayisi) {
        this.squatSayisi = squatSayisi;
    }
    
    public void hareketYap(String hareketTuru, int sayi) {
        if (hareketTuru.equals("Burpee")) {
            burpeeYap(sayi);
        } else if (hareketTuru.equals("Pushup")) {
            pushupYap(sayi);
        } else if (hareketTuru.equals("Situp")) {
            situpYap(sayi);
        } else if (hareketTuru.equals("Squat")) {
            squatYap(sayi);
        } else {
            System.out.println("Gecersiz hareket!");
        }
    }

    public void burpeeYap(int sayi) {
        if (burpeeSayisi == 0) {
            System.out.println("Yapacak burpee kalmadi...");
        }
        if (burpeeSayisi - sayi < 0) {
            System.out.println("Tebrikler! Hedefledigin burpee sayisini gectin.");
            burpeeSayisi = 0;
            System.out.println("Kalan Burpee: " + burpeeSayisi);
        } else {
            burpeeSayisi -= sayi;
            System.out.println("Kalan Burpee: " + burpeeSayisi);
        }
    }
    public void pushupYap(int sayi) {
        if (pushupSayisi == 0) {
            System.out.println("Yapacak pushup kalmadi...");
        }
        if (pushupSayisi - sayi < 0) {
            System.out.println("Tebrikler! Hedefledigin pushup sayisini gectin.");
            pushupSayisi = 0;
            System.out.println("Kalan Pushup: " + pushupSayisi);
        } else {
            pushupSayisi -= sayi;
            System.out.println("Kalan Pushup: " + pushupSayisi);
        }
    }
    public void situpYap(int sayi) {
        if (situpSayisi == 0) {
            System.out.println("Yapacak situp kalmadi...");
        }
        if (situpSayisi - sayi < 0) {
            System.out.println("Tebrikler! Hedefledigin situp sayisini gectin.");
            situpSayisi = 0;
            System.out.println("Kalan Situp: " + situpSayisi);
        } else {
            situpSayisi -= sayi;
            System.out.println("Kalan Situp: " + situpSayisi);
        }
    }
    public void squatYap(int sayi) {
        if (squatSayisi == 0) {
            System.out.println("Yapacak squat kalmadi...");
        }
        if (squatSayisi - sayi < 0) {
            System.out.println("Tebrikler! Hedefledigin squat sayisini gectin.");
            squatSayisi = 0;
            System.out.println("Kalan Squat: " + squatSayisi);
        } else {
            squatSayisi -= sayi;
            System.out.println("Kalan Squat: " + squatSayisi);
        }
    }

    public boolean idmanBittiMi () {
        return (burpeeSayisi == 0) && (pushupSayisi == 0) && (situpSayisi == 0) && (squatSayisi == 0);
    }
    
}
