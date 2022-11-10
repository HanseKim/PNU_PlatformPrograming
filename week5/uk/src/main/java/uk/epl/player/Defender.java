package uk.epl.player;

public class Defender extends Player{
    private int STRENGTH_POINT = 10;

    public Defender(String name, int jerseyNumber, int speed, int stamina, int passing) {
        super(name, jerseyNumber, speed, stamina, passing);
    }

    @Override
    protected float getStamina(){
        return super.getStamina() + STRENGTH_POINT;
    }
    @Override
    public String toString() {
        return String.format("\nPlayer Name='%s, JerseyNumber=%d Position (%d , %d) Defender SPEED=%.1f, , STAMINA=%.1f, , PASSING=%.1f",super.getName(),super.getJerseyNumber(),super.position.x,super.position.y,super.getSpeed(),this.getStamina(),super.getPassing());
    }
}
