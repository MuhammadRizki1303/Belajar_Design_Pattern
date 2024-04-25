interface ShapeInterface {

    // Metode untuk menghitung luas (secara implisit publik dan abstrak)
    double hitungLuas();

    // Metode untuk menggambar bentuk (secara implisit publik dan abstrak)
    void gambar();

}

class PersegiPanjang implements ShapeInterface {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Implementasi hitungLuas untuk Persegi Panjang
    public double hitungLuas() {
        return panjang * lebar;
    }

    // Implementasi gambar untuk Persegi Panjang
    public void gambar() {
        System.out.println("Menggambar persegi panjang.");
    }

    // Metode tambahan khusus untuk Persegi Panjang
    public void tampilkanInfo() {
        System.out.println("Persegi Panjang - Panjang: " + panjang + ", Lebar: " + lebar);
    }
}

class Bulat implements ShapeInterface {
    private double radius;

    public Bulat(double radius) {
        this.radius = radius;
    }

    // Implementasi hitungLuas untuk Lingkaran
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    // Implementasi gambar untuk Lingkaran
    public void gambar() {
        System.out.println("Menggambar lingkaran.");
    }

    // Metode tambahan khusus untuk Lingkaran
    public void tampilkanInfo() {
        System.out.println("Lingkaran - Jari-jari: " + radius);
    }
}