class KomputerPremium extends Komputer {
    protected boolean ruangPrivat;

    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat; 
    }

    public void Informasi() {
        super.Informasi();
        System.out.println("Status: " + (ruangPrivat ? "Ruang Standar Premium" : "Ruang Standar"));
        if (ruangPrivat) {
            System.out.println("Fasilitas Ruang Premium:");
            System.out.println("- Ruangan ber-AC");
            System.out.println("- Sofa nyaman untuk duduk");
            System.out.println("- Komputer spek tinggi");
            System.out.println("- Koneksi internet kecepatan 100Mbps");
        } else {
            System.out.println("Fasilitas Ruang Reguler:");
            System.out.println("-Ruangan dengan Kipas");
            System.out.println("-Sofa ruang tamu");
            System.out.println("-Komputer spek rendah");
            System.out.println("-Koneksi internet kecepatan 30Mbps");
        }
    }   

    public void Pesan(int nomorKomputer) {
            System.out.println("Pesan komputer nomor: " + nomorKomputer);
        }   

    public void TambahLayanan(String makanan) {
            System.out.println("Menambah makanan: " + makanan);
        }    
        
    public void TambahLayanan(String makanan, String minuman) {
            System.out.println("Menambah makanan: " + makanan + " dan minuman: " + minuman);
        }
    }


    // To do: Buatlah 1 variable sesuai ketentuan
    
    // To do: Buatlah constructor pada class KomputerPremium
    
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    

