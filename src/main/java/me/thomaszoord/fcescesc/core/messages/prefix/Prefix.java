package me.thomaszoord.fcescesc.core.messages.prefix;

public enum Prefix {

    MATCH_NAME,
    ARENA_NAME,
    PLAYER_NAME,
    SEEKER_NAME,
    HIDDER_NAME;


    public static String getPrefix(Prefix prefix){
        return "%s" + prefix.name().toLowerCase();
    }



}
