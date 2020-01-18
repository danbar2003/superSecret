package bots.tasks;

import bots.wrapper.MyIceberg;
import penguin_game.Iceberg;

public class Upgrade implements Taskable {
    private MyIceberg upgradingIceberg;

    public Upgrade(MyIceberg iceberg) {
        this.upgradingIceberg = iceberg;
    }

    @Override
    public void act() {
        if (this.upgradingIceberg.iceberg.canUpgrade()) {
            this.upgradingIceberg.iceberg.upgrade();
        } else
            System.out.println(this.upgradingIceberg.iceberg.toString() + " Can't upgrade");
    }

    @Override
    public int loss() {
        return 0;
    }
}