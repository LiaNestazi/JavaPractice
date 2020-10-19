package ru.mirea.pr11;

public class ChairFactory implements AbstractChairFactory {
    public VictorianChair createVictorianChair(){
        return new VictorianChair();
    }
    public MagicChair createMagicanChair(){
        return new MagicChair();
    }
    public FunctionalChair createFunctionalChair(){
        return new FunctionalChair();
    }
}
