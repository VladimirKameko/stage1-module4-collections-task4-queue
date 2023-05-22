package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DishOrderDeterminer {

    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {

        int step = everyDishNumberToEat - 1;
        int index = 0;
        List<Integer> res = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            list.add(i);
        }

        while (!list.isEmpty()) {

            index = (index + step) % list.size();
            res.add(list.remove(index));

        }
        return res;
    }
}
