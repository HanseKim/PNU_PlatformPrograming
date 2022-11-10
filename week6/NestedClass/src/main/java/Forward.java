public class Forward extends Player{
    private String name ;
    private int jerseyNumber ;
    protected int speed ;
    public Forward(Builder builder) {
        this.name = builder.name;
        this.jerseyNumber = builder.jerseyNumber;
        this.speed = builder.speed + 10;
    }
    @Override
    public String toString(){
        return String.format("Player Name='%s, JerseyNumber=%d, SPEED=%d, Forward",name,jerseyNumber,speed);
    }
    @Override
    protected int getSpeed() {
        return speed;
    }
}
