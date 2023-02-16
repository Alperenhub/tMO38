public class Main {
    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI();
        AskerKredisi askerKredisi = new AskerKredisi();
        krediUI.KrediHesapla(new OgretmenKrediManager());
        krediUI.KrediHesapla(new AskerKredisi());

    }
}