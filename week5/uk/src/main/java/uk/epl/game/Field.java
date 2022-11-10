package uk.epl.game;

import uk.epl.player.Player;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<Player> players = new ArrayList();


    public void add(Player newPlayer) {
        players.add(newPlayer);
    }

    public void moveUp(int choosePlayer) {
        for(Player player : players){
            if(player.getJerseyNumber() == choosePlayer){
                player.moveUp();
            }
        }
    }

    public void start() {
        int x=34, y = 25;
        for(Player player : players){
            player.setPosition(x,y);
            y+=25;
        }
    }

    public void info() {
        for(Player p : players){
            System.out.println(p);
        }
    }

    public void stop() {
        int x=0, y = 0;
        for(Player player : players){
            player.setPosition(x,y);
        }
    }

    public void moveDown(int choosePlayer) {
        for(Player player : players){
            if(player.getJerseyNumber() == choosePlayer){
                player.moveDown();
            }
        }
    }
    public void moveRight(int choosePlayer) {
        for(Player player : players){
            if(player.getJerseyNumber() == choosePlayer){
                player.moveRight();
            }
        }
    }
    public void moveLeft(int choosePlayer) {
        for(Player player : players){
            if(player.getJerseyNumber() == choosePlayer){
                player.moveLeft();
            }
        }
    }
}
