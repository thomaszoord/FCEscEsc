package me.thomaszoord.fcescesc.core;

import me.thomaszoord.fcescesc.core.messages.Messages;
import me.thomaszoord.fcescesc.core.partidas.Match;
import me.thomaszoord.fcescesc.core.partidas.enums.Status;
import org.bukkit.Bukkit;

import java.util.ArrayList;
import java.util.List;

public class MatchManager {

    public static List<Match> matches = new ArrayList<>();




    public static Match findMatch() {
        Match bestMatch = null;
        int maxPlayers = 0;

        for (Match match : matches) {
            if (match.getStatus() == Status.ESPERA && match.getPlayers().size() < match.getMaxPlayers()) {
                int playerCount = match.getPlayers().size();

                if (playerCount > maxPlayers) {
                    bestMatch = match;
                    maxPlayers = playerCount;
                }
            }
        }

        return bestMatch;
    }

    public static Match selectMatch(String nameOfMatch){

        for (Match match : matches){
            if(nameOfMatch.equalsIgnoreCase(match.getName())){
               return match;
            }
        }

        Bukkit.getConsoleSender().sendMessage(Messages.MATCH_NOT_FOUND.message);
        return null;
    }






    public static void addMatch(Match match){
        matches.add(match);
    }

    public static void removeMatch(Match match){
        matches.remove(match);
    }
}
