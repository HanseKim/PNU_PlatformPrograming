public class Defender extends Player{
    private String name ;
    private int jerseyNumber ;
    protected int speed ;
    public Defender(Builder builder) {
        this.name = builder.name;
        this.jerseyNumber = builder.jerseyNumber;
        this.speed = builder.speed - 10;
    }
    @Override
    protected int getSpeed() {
        return speed;
    }
    @Override
    public String toString(){
        return String.format("Player Name='%s, JerseyNumber=%d, SPEED=%d, Defender",name,jerseyNumber,speed);
    }
}
