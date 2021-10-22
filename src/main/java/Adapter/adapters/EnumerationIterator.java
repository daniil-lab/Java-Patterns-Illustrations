package Adapter.adapters;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;

public class EnumerationIterator implements Iterator<Object> {
    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

//    @Override
//    public void forEachRemaining(Consumer<? super Object> action) {
//        Iterator.super.forEachRemaining(action);
//    }

    @Override
    public boolean hasNext() {
        return this.enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return this.enumeration.nextElement();
    }
}
