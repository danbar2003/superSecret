package bots.wrapper;

import penguin_game.*;

import java.util.List;

public abstract class MyGameObject extends GameObject{

    public final GameObject gameObject;

    public MyGameObject(GameObject gameObject) {
        this.gameObject = gameObject;
    }

    public <T extends MapObject> T closestTo(List<T> arr) {
        if (arr.size() > 0) {
            T obj = arr.get(0);
            int minDistance = this.gameObject.__distance(obj);
            for (T temp : arr) {
                if (this.gameObject.__distance(temp) < minDistance) {
                    minDistance = this.gameObject.__distance(temp);
                    obj = temp;
                }
            }
            return obj;
        }
        return null;
    }

    public <T extends MapObject> T farthest(List<T> arr) {
        if (arr.size() > 0) {
            T obj = arr.get(0);
            int maxDistance = this.gameObject.__distance(obj);
            for (T temp : arr) {
                if (this.gameObject.__distance(temp) > maxDistance) {
                    maxDistance = this.gameObject.__distance(temp);
                    obj = temp;
                }
            }
            return obj;
        }
        return null;
    }

    public <T extends MapObject> double avgDistance(List<T> arr){
        double distance = 0;
        for (T obj : arr){
            distance += this.gameObject.__distance(obj);
        }
        return (distance / arr.size());
    }
}
