class StopState implements State {

    @Override
    public void doAction() {
        System.out.println("Player is in stop state");
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}