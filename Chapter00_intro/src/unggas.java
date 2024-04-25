public class unggas {
    public String warna;

    public void jalan() {
        System.out.println("berlari");
    }

    public void suara() {
        System.out.println("kruak kruak");
    }
}

    class bisaterbang extends unggas {
        public void terbang() {
            System.out.println("terbang tinggi");
        }
    }

     class tidakbisaterbang extends unggas {
        public void terbang(){
            System.out.println("loncat-loncat");
        }
    }
