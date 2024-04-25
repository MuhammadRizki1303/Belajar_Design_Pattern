import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

interface Pelanggan {
    void konsumsi(Pemesanan pemesanan);
}

class PembaruanStok implements Pelanggan {
    @Override
    public void konsumsi(Pemesanan pemesanan) {
        System.out.println("Stok produk " + pemesanan.getProduk() + " dari pesanan " + pemesanan.getNomorPesanan() +
                " telah diperbarui sebanyak " + pemesanan.getTotalItem() + " unit.");
    }
}

class PembuatanFaktur implements Pelanggan {
    @Override
    public void konsumsi(Pemesanan pemesanan) {
        System.out.println("Faktur untuk pesanan " + pemesanan.getNomorPesanan() + " telah dibuat.");
    }
}

interface Penerbit {
    Penerbit tambahPelanggan(Pelanggan pelanggan);
    Penerbit hapusPelanggan(Class<? extends Pelanggan> kelasPelanggan);
    void produksi(Pemesanan pemesanan);
}

class PenerbitPembuatanPesanan implements Penerbit {
    private final Map<Class<? extends Pelanggan>, Pelanggan> pelanggan = new HashMap<>();

    @Override
    public Penerbit tambahPelanggan(Pelanggan pelanggan) {
        if (pelanggan != null) {
            this.pelanggan.put(pelanggan.getClass(), pelanggan);
        }
        return this;
    }

    @Override
    public Penerbit hapusPelanggan(Class<? extends Pelanggan> kelasPelanggan) {
        if (kelasPelanggan != null) {
            this.pelanggan.remove(kelasPelanggan);
        }
        return this;
    }

    @Override
    public void produksi(Pemesanan pemesanan) {
        this.pelanggan.values().forEach(pelanggan -> pelanggan.konsumsi(pemesanan));
    }
}

class PembuatanPesanan {
    private final Penerbit penerbit;

    public PembuatanPesanan(Penerbit penerbit) {
        this.penerbit = penerbit;
    }

    public void buatPesanan() {
        Pemesanan pemesanan = new Pemesanan();
        pemesanan.setPelanggan("Tukul");
        pemesanan.setPenjual("Arwana");
        pemesanan.setNomorPesanan("xyz-888");
        pemesanan.setHarga(BigDecimal.TEN);
        pemesanan.setProduk("Susu");
        pemesanan.setTotalItem(10);
        System.out.println("Pesanan berhasil dibuat dengan nomor " + pemesanan.getNomorPesanan());
        penerbit.produksi(pemesanan);
    }
}

// Asumsikan Pemesanan didefinisikan dengan setter/getter yang diperlukan
class Pemesanan {
    private String pelanggan;
    private String penjual;
    private String nomorPesanan;
    private BigDecimal harga;
    private String produk;
    private int totalItem;

    // Getter dan Setter
    public String getProduk() {
        return produk;
    }

    public void setProduk(String produk) {
        this.produk = produk;
    }

    public int getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(int totalItem) {
        this.totalItem = totalItem;
    }

    public String getNomorPesanan() {
        return nomorPesanan;
    }

    public void setNomorPesanan(String nomorPesanan) {
        this.nomorPesanan = nomorPesanan;
    }

    public void setPelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
    }

    public String getPelanggan() {
        return pelanggan;
    }

    public void setPenjual(String penjual) {
        this.penjual = penjual;
    }

    public String getPenjual() {
        return penjual;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }

    public BigDecimal getHarga() {
        return harga;
    }
}
