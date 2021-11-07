public class Guns {
    protected String name = "Guns";
    public int damage;
    public int magSize;
    public int bullets;
    public boolean reloading;
    

    public Guns(int damage, int magSize){
        this.damage = damage;
        this.magSize = magSize;
        this.bullets = magSize;
    }

    public void shoot(){
        if(bullets == 0){
            reloading = true;
            bullets = magSize;
            System.out.println("Reloaded");;
        }else{
            bullets--;
            reloading = false;
            System.out.println("Shot the Player");
        }
        
    }

    public int getDamage(){
        return damage;
    }

}
