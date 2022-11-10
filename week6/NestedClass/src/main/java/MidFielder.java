public class MidFielder extends Player{
    private String name ;
    private int jerseyNumber ;
    protected int speed ;
    public MidFielder(Builder builder) {
        this.name = builder.name;
        this.jerseyNumber = builder.jerseyNumber;
        this.speed = builder.speed;
    }
    @Override
    public String toString(){
        return String.format("Player Name='%s, JerseyNumber=%d, SPEED=%d, Midfielder",name,jerseyNumber,speed);
    }
    @Override
    protected int getSpeed() {
        return speed;
    }
}
