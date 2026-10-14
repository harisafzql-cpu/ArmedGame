public class Player2 extends Player1 {

    private boolean armour;
    private int health;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

   @Override
    public void damageByGun1() {
        if(armour) {
            this.health -= 20;
            if(this.health <= 0) this.health = 0;
            System.out.println("Armour ON | " + getName() + " got hit by Gun 1 | Health reduced by 20 | New Health: " + this.health);
        } else {
            this.health -= 30;
            if(this.health <= 0) this.health = 0;
            System.out.println("Armour OFF | " + getName() + " got hit by Gun 1 | Health reduced by 30 | New Health: " + this.health);
        }
        if(this.health == 0) {
            System.out.println( getName() + " has died!");
        }
    }

    @Override
    public void damageGun2() {
        if(armour) {
            this.health -= 40;
            if(this.health <= 0) this.health = 0;
            System.out.println("Armour ON | " + getName() + " got hit by Gun 2 | Health reduced by 40 | New Health: " + this.health);
        } else {
            this.health -= 50;
            if(this.health <= 0) this.health = 0;
            System.out.println("Armour OFF | " + getName() + " got hit by Gun 2 | Health reduced by 50 | New Health: " + this.health);
        }
        if(this.health == 0) {
            System.out.println( getName() + " has died!");
        }
    }
}
