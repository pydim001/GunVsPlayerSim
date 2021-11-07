public class person {
    public int health;
    public double dodgePercent;
    public double shieldPercent;
    public int threshold;
    public int currentHealth;
    public boolean crouch;
    public boolean alive = true;

    public person(int health, double dodgePercent, double shieldPercent, int threshold){
        this.health = health;
        this.dodgePercent = dodgePercent;
        this.shieldPercent = shieldPercent;
        this.threshold = threshold;
        this.currentHealth = health;
    }
    

    public void crouch(){
        float rand = (float) Math.random();
        if(rand <= dodgePercent){
            System.out.println("Player Crouched");
            crouch = true;
        }else crouch = false;
    }
    public void currentHealth(){
        if(crouch){
            System.out.println("Player lost no health");
        }else System.out.println("Player has " + (currentHealth));
    }
    public void alive(){
        if(currentHealth <= 0){
            alive = false;
        } else alive = true;
    }
    public void shield(){
        if (currentHealth < health - threshold){
            shieldPercent = 1.0;
        }
    }
    public void gotShot(Guns gun){
        if(!crouch && !gun.reloading){
            currentHealth -= gun.damage * shieldPercent;
        }
    }
}
