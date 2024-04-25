public interface kendaraan {
    public void berjalan ();
    public void berhenti ();
}

class sepeda implements kendaraan{

    @Override
    public void berjalan() {
        System.out.println( "Berjalan");
    }
    @Override
    public void berhenti() {
        System.out.println( "Berhenti");
    }
    public void klakson(){
        System.out.println( "Kring kring " );
    }
}

class sepeda_motor implements kendaraan{

    @Override
    public void berjalan() {
        System.out.println("Go Go Go");
    }
    @Override
    public void berhenti() {
        System.out.println("Stop");
    }
    public void klakson(){
        System.out.println("Ting Tiiing");
    }
}
