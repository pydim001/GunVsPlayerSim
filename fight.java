public class fight {
    
    public void startFight(Guns gun, person player){
        gun.shoot();
        player.crouch();
        player.shield();
        player.gotShot(gun);
        player.currentHealth();
        player.alive();

    }
}
