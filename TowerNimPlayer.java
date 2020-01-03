public class TowerNimPlayer extends Player<TowerNim>{

    public TowerNimPlayer(){
    }

    @Override
    public String toString(){
        return "SuperMyTran";
    }

    @Override
    public TowerNim getMove(TowerNim position, int playerId) {
        PureStack<Integer> animal = position.getPiles();
        if (playerId == CombinatorialGame.LEFT){
            animal.pop();

        }else if(playerId == CombinatorialGame.RIGHT){
                animal.pop();
        }
        return new TowerNim(animal);
    }

}
