public class Main {
    public static void main(String[] args) {
        System.out.println("Detail Hewan\n");

        Kucing kucing1 = new Kucing("Luthfi", 3, "Anggora");
        System.out.println("ini adalah " + kucing1.nama + " !");
        kucing1.suara();
        kucing1.makan();
        kucing1.makan("Whiskas");
        kucing1.infoHewan();

        System.out.println();

        Burung burung1 = new Burung("Haikal", 3, "Putih");
        System.out.println("ini adalah " + burung1.nama + " !");
        burung1.suara();
        burung1.makan();
        burung1.makan("biji-bijian");
        burung1.infoHewan();
    }
}