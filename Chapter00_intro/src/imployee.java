abstract public class imployee {
    public void company_info(){
        System.out.println("RizTech");
        System.out.println("Perusahaan yang berkembang dalam bidang Teknologi");
    }

    abstract void print_info();

}
class NewEmployee extends imployee {
    @Override
    public void print_info() {
        String name = "Jabal akbar";
        int age = 19;
        String jabatan = "Manager";

        System.out.println(name);
        System.out.println(age);
        System.out.println(jabatan);
    }
}

class OldEmployee extends imployee {

    @Override
    public void print_info() {
        String name = "Muhammad Rizki";
        int age = 20;
        String jabatan = "CEO of RizTech";

        System.out.println(name);
        System.out.println(age);
        System.out.println(jabatan);
    }
}