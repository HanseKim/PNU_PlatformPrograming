package uk.epl.player;

public class Midfielder extends Player{
    public Midfielder(String name, int jerseyNumber, int speed, int stamina, int passing) {
        super(name, jerseyNumber, speed, stamina, passing+10);
    }
    @Override
    public String toString() {
        return String.format("\nPlayer Name='%s, JerseyNumber=%d Position (%d , %d) Midfielder SPEED=%.1f, , STAMINA=%.1f, , PASSING=%.1f",super.getName(),super.getJerseyNumber(),super.position.x,super.position.y,super.getSpeed(),super.getStamina(),super.getPassing());
    }
}
