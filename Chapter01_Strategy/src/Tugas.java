//program biasa sebelum diubah menjadi strategy pattern
//public class Player{
//    public void pushTrianlge(String mode){
//        if(mode.equals("sword")){
//            System.out.println("punch with sword");
//        }
//        if(mode.equals("uppercut")){
//            System.out.println("do uppercut punch");
//        }
//    }
//    public void pushCross(String mode){
//        if(mode.equals("flying kick")){
//            System.out.println("do flying kick to opponent");
//        }
//        if(mode.equals("lower kick")){
//            System.out.println("do low kick to opponent's leg");
//        }
//    }
//}

// setelah diubah menjadi strategy
class Player{
    public void pushTrianlge(Punch punch){
        punch.punchAction();
    }
    public void pushCross(Kick kick){
        kick.kickAction();
    }
}

interface Punch{
    void punchAction();
}
class SwordPunch implements Punch{
    @Override
    public void punchAction(){
        System.out.println("punch with sword");
    }
}
class UppercutPunch implements Punch{
    @Override
    public void punchAction(){
        System.out.println("do uppercut punch");
    }
}
interface Kick{
    void kickAction();
}
class FlyingKick implements Kick{
    @Override
    public void kickAction(){
        System.out.println("do flying kick to opponent");
    }
}
class LowerKick implements Kick{
    @Override
    public void kickAction(){
        System.out.println("do low kick to opponent's leg");
    }
}
