public class gout {
    public static void main(String[] args) throws InterruptedException {
        Guns phantom = new Guns(30, 2);
        person me = new person(150, .3, .8, 50);
        fight phanfight = new fight();
        System.out.println("Started\n");
        int turns = 0;
        while(me.alive){
            turns++;
            phanfight.startFight(phantom, me);
            System.out.println("\n");
            Thread.sleep(1500);
        }
        System.out.println("It took " + (turns) + " turns to kill the player");
    }
}
