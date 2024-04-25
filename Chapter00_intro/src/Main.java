//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        bisaterbang pipit = new bisaterbang();
//        pipit.warna= "putih";
//        System.out.println("warna burung pipit " + pipit.warna);
//        pipit.jalan();
//        pipit.suara();
//        pipit.terbang();
//
//        System.out.println(" ");
//
//        tidakbisaterbang burung_unta= new tidakbisaterbang();
//        burung_unta.warna="hitam";
//        System.out.println("warna burung unta " + burung_unta.warna);
//        burung_unta.jalan();
//        burung_unta.terbang();
//        burung_unta.suara();
//
//       mahasiswa mhs = new mahasiswa();
//       mhs.nama = "Muhammad Rizki";
//       mhs.nim = "2022573010023";
//       mhs.jenis_kelamin = "laki-laki";
//       mhs.alamat = "bireuen";
//       mhs.email = "muhammad.rizki1303@gmail.com";
//
//       dosen ds = new dosen();
//       ds.nama = "Reza Zulman";
//       ds.nip = "20000000000000";
//       ds.alamat = "lhokseumawe";
//       ds.email = "reza@gmail.com";
//       ds.jenis_kelamin = "laki laki";
//
//        System.out.println( " " );
//        System.out.println("nama mahasiswa " + mhs.nama);
//        System.out.println("nim mahasiswa  " + mhs.nim );
//        System.out.println("nama dosen " + ds.nama);
        System.out.println("\n class sepeda");
        sepeda ondel_ondel = new sepeda();
        ondel_ondel.berhenti();
        ondel_ondel.berjalan();
        ondel_ondel.klakson();

        System.out.println(" ");
        System.out.println("\n class sepeda method");
        sepeda_motor supra_bapack_bapack = new sepeda_motor();
        supra_bapack_bapack.berhenti();
        supra_bapack_bapack.berjalan();
        supra_bapack_bapack.klakson();

        System.out.println("Abstract Class Example");
        System.out.println("----------------------");
        imployee empBaru = new NewEmployee();
        empBaru.print_info();
        empBaru.company_info();

        System.out.println(" ");

        imployee empLama = new OldEmployee();
        empLama.print_info();
        empLama.company_info();

        System.out.println("Example of choosing between interface and abstract");
        System.out.println("---------------------------------------------------");
        System.out.println("------Abstract------");
        ShepeAbstrak bulat = new Lingkaran(2);
        ShepeAbstrak pp = new Persegi_Panjang(2,5);
        bulat.hitungLuas();
        pp.hitungLuas();
        bulat.gambar();
        pp.gambar();

        System.out.println("------Interface------");
        Bulat bulat2 = new Bulat(2);
        PersegiPanjang pp2 = new PersegiPanjang(2,5);
        bulat2.hitungLuas();
        bulat2.tampilkanInfo();
        pp2.hitungLuas();
        pp2.tampilkanInfo();
        bulat2.gambar();
        pp2.gambar();

        // Memilih antara Interface dan Kelas Abstrak

        System.out.println("\n Memilih antara Interface dan Kelas Abstrak");
        System.out.println("--------------------------------------");

        // Abstrak

        // Buat objek konkret dari kelas abstrak
        ShepeAbstrak bulat3 = new Lingkaran(2);
        ShepeAbstrak pp3 = new Persegi_Panjang(2, 5);

        // Panggil metode hitungLuas dan gambar dari objek konkret
        System.out.println("Luas lingkaran: " + bulat3.hitungLuas());
        System.out.println("Luas persegi panjang: " + pp3.hitungLuas());
        bulat3.gambar();
        pp3.gambar();


        // Interface

        // Buat objek konkret dari kelas yang mengimplementasikan interface
        ShapeInterface bulat4 = new Bulat(2);
        ShapeInterface pp4 = new PersegiPanjang(2, 5);

        // Panggil metode hitungLuas dan gambar dari objek konkret
        System.out.println("\nLuas lingkaran: " + bulat4.hitungLuas());
        System.out.println("Luas persegi panjang: " + pp4.hitungLuas());
        bulat4.gambar();
        pp4.gambar();

        System.out.println(" ");
        System.out.println("Stratrgy pattern");
        Player Rizki = new Player();
        Rizki.pushCross(new FlyingKick());
        Rizki.pushTrianlge(new SwordPunch());

        Player jabal = new Player();
        jabal.pushCross(new FlyingKick());
        jabal.pushTrianlge(new UppercutPunch());
    }

}

