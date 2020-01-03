public class TowerNimPlayerTester {
    public static void main (String[] args){
        Player<TowerNim> random = new RandomPlayer<TowerNim>();
        Player<TowerNim> me = new TowerNimPlayer();
       // Player<TowerNim> perfectPlayer = new TowerNimPerfectPlayer();
        PositionFactory<TowerNim> factory = new TowerNim.PositionBuilder(8, 8);
        Referee ref = new Referee(random, me, factory);
        ref.call();
        ref.gauntlet(100000);
    }
}

