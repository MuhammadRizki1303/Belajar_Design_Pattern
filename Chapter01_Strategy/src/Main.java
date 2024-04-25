//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck modelduck = new ModelDuck();
        modelduck.performFly(); // Akan memanggil constructor modelduck(FlyNoWay())
        modelduck.setFlyBehavior(new FlyWithRocketPower());
        modelduck.performFly();

        System.out.println(" ");
        System.out.println("Main tugas");
        System.out.println("Stratrgy pattern");
        Player Rizki = new Player();
        Rizki.pushCross(new FlyingKick());
        Rizki.pushTrianlge(new SwordPunch());

        Player jabal = new Player();
        jabal.pushCross(new FlyingKick());
        jabal.pushTrianlge(new UppercutPunch());
    }
}