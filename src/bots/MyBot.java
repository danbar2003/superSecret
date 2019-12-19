package bots;

import bots.wrapper.MyGame;
import penguin_game.Game;
import penguin_game.Iceberg;
import penguin_game.SkillzBot;

import java.awt.image.BufferStrategy;


/**
 * This is an example for a bot.
 */
public class MyBot implements SkillzBot {
    /**
     * Makes the bot run a single turn.
     *
     * @param game - the current game state.
     */
    @Override
    public void doTurn(Game game) {
        if (game.turn == 1){
            MyGame.init(game);
        }
        MyGame.update(game);

        handleIcebergs(game);
    }

    private void handleIcebergs(Game game) {
        for (Iceberg myIceberg : game.getMyIcebergs()){

        }
    }
}

