package bots;

import bots.wrapper.MyIceberg;
import penguin_game.PenguinGroup;

import java.util.List;

public class Constant {

    public static class Icebergs{
        public static List<MyIceberg> myIcebergs;
        public static List<MyIceberg> enemyIcebergs;
        public static List<MyIceberg> neutralIcebergs;
        public static List<MyIceberg> allIcebergs;
    }

    public static class PenguinGroups{
        public static List<PenguinGroup> myPenguinGroups;
        public static List<PenguinGroup> enemyPenguinGroups;
        public static List<PenguinGroup> allPenguinGroup;
    }

    public static class Game{
        public static int turn;
        public static int maxTurns;
    }
}