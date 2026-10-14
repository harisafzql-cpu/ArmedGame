public class Main{
    public static void main(String[] args) {
        Player1 p1 = new Player1("Harry", "Sniper", 100);
        Player2 p2 = new Player2("Ben", "AK47", 100, true);

        p1.damageByGun1();
        p2.damageGun2();
        p2.damageByGun1();
        p1.damageGun2();
        p1.damageByGun1();
    }
}
