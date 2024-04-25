//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Channel ch = new Channel("RizTech Channel");
        User user1 = new User("Agung");
        User user2 = new User("Jomok");
        User user3 = new User("Jabal");

        ch.addSubscriber(user1);
        ch.addSubscriber(user2);
        ch.notifyUser("Ada video baru buat anda! Jangan lupa di subscribe ya!");

        user3.subscribe(ch);
        ch.notifyUser("Video baru!");

        //tugas
        Penerbit penerbit = new PenerbitPembuatanPesanan()
                .tambahPelanggan(new PembaruanStok())
                .tambahPelanggan(new PembuatanFaktur());

        PembuatanPesanan pembuatanPesanan = new PembuatanPesanan(penerbit);
        pembuatanPesanan.buatPesanan();

        System.out.println();

        penerbit.hapusPelanggan(PembuatanFaktur.class);
        pembuatanPesanan.buatPesanan();

    }
}