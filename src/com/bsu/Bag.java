package com.bsu;

import java.util.ArrayList;
import java.util.List;

public class Bag<T extends Item> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item){
        items.add(item);
    }

    public void removeItem(T item){
        items.remove(item);
    }

    public int size() {
        return items.size();
    }

    public <E extends Item> int compareTo(Bag<E> otherBag){
        int sumWeight = 0;
        for(Item item:items){
            sumWeight+=item.getWeight();
        }

        int otherSumWeight = 0;
        for(Item item:otherBag.items){
            otherSumWeight+=item.getWeight();
        }

        return sumWeight - otherSumWeight;
    }
}
