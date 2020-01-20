package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator {

    private ArrayList<MenuItem> items;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items){
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.size())
            return false;

        return true;
    }

    @Override
    public Object next() {
        MenuItem item = items.get(position);
        position++;
        return item;
    }
}
