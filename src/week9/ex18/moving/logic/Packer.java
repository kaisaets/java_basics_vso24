package week9.ex18.moving.logic;

import week9.ex18.moving.domain.Box;
import week9.ex18.moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    private int boxesVolume;
    public Packer (int boxesVolume){
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things){
        List<Box> boxes = new ArrayList<Box>();
        Box currentBox = new Box(boxesVolume);

        for (Thing thing : things){
            if (currentBox.addThing(thing)){
                continue;
            }

            boxes.add(currentBox);
            currentBox = new Box(boxesVolume);
            currentBox.addThing(thing);
        }
        if (currentBox.getVolume() > 0){
            boxes.add(currentBox);
        }
        return boxes;
    }
}
