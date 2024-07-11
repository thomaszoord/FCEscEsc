package me.thomaszoord.fcescesc.core.partidas;

import me.thomaszoord.fcescesc.core.MatchManager;
import me.thomaszoord.fcescesc.minigame.obj.Arena;
import me.thomaszoord.fcescesc.core.partidas.enums.Status;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public abstract class Match {

    private final String name;
    private final Arena arena;
    private final Status status;


    //Esconde Esconde
    private final int minimumPlayers = 3;
    private final int MaxPlayers = 6;


    //Listas
    private List<Player> players, spectators = new ArrayList<>();
    private List<Player> hidders, seekers = new ArrayList<>();






    public Match(String name, Arena arena, Status status) {
        this.name = name;
        this.arena = arena;
        this.status = status;

        MatchManager.addMatch(this);
    }


    //entrar na Match
    public void joinMatch(Player p){


        switch(getStatus()){
            case ESPERA:
                players.add(p);

                break;


            case EMJOGO:
                break;




        }
    }



    //sair da Match
    public void leaveMatch(Player p){

    }


    //espectador
    public void watchMatch(Player p){

    }



    //gets & sets


    public String getName() {
        return name;
    }

    public Arena getArena() {
        return arena;
    }

    public Status getStatus() {
        return status;
    }

    public int getMinimumPlayers() {
        return minimumPlayers;
    }

    public int getMaxPlayers() {
        return MaxPlayers;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Player> getSpectators() {
        return spectators;
    }

    public List<Player> getHidders() {
        return hidders;
    }

    public List<Player> getSeekers() {
        return seekers;
    }
}
