package bots;

import bots.missions.*;
import penguin_game.*;

import java.util.*;

public class MissionManager {

    /**
     * This function creates for each iceberg a List of missions in the execute order/priority.
     *
     * @param game
     * @return Map of executing Icebergs (Keys) and Lists of Missions to execute (Value).
     */
    public static Map<Iceberg, List<Mission>> createMissionsForIcebergs(Game game) {
        //Map of executing icebergs(Keys) and lists of missions(values) for each one of them to execute.
        Map<Iceberg, List<Mission>> icebergMissionMap = new HashMap<>();
        //waiting for utils Group Mission func...
        Map<Mission, List<Iceberg>> icebergsThatCanExecuteMission;
        for (Iceberg iceberg : game.getMyIcebergs()) {
            List<Mission> icebergMissions = new LinkedList<>();
            //what missions should the iceberg have.
            icebergMissionMap.put(iceberg, icebergMissions);
        }
        return icebergMissionMap;
    }
}