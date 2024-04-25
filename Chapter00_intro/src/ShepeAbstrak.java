abstract public class ShepeAbstrak {
    // Metode umum untuk menghitung luas (abstrak)
    abstract double hitungLuas();

    // Metode umum untuk menggambar bentuk (konkret)
    void gambar() {
        System.out.println("Menggambar suatu bentuk.");
    }
}

// Kelas konkret untuk Persegi Panjang
class Persegi_Panjang extends ShepeAbstrak {
    private double panjang;
    private double lebar;

    public Persegi_Panjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Implementasi hitungLuas untuk Persegi Panjang
    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    // Metode tambahan khusus untuk Persegi Panjang
    public void tampilkanInfo() {
        System.out.println("Persegi Panjang - Panjang: " + panjang + ", Lebar: " + lebar);
    }
}

// Kelas konkret untuk Lingkaran
class Lingkaran extends ShepeAbstrak {
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    // Implementasi hitungLuas untuk Lingkaran
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    // Metode tambahan khusus untuk Lingkaran
    public void tampilkanInfo() {
        System.out.println("Lingkaran - Jari-jari: " + radius);
    }
}
