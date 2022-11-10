package uk.epl.player;

public class Forward extends Player{
    private int ACCELERATION_POINT = 10;

    public Forward(String name, int jerseyNumber, int speed, int stamina, int passing) {
        super(name, jerseyNumber, speed, stamina, passing);

    }

    @Override
    protected float getSpeed(){
        return super.getSpeed() + ACCELERATION_POINT;
    }

    @Override
    public String toString() {
        return String.format("\nPlayer Name='%s, JerseyNumber=%d Position (%d , %d) Forward SPEED=%.1f, , STAMINA=%.1f, , PASSING=%.1f",super.getName(),super.getJerseyNumber(),this.getPosition().x,this.getPosition().y,this.getSpeed(),super.getStamina(),super.getPassing());
    }
}
