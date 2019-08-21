package behavior_pattern.iterator;

/**
 * @Author   zenghzong
 * @Since 2019/8/8
 * @Version 1.0
 */
public class NameRepository implements Container {
    public String names[] = {"lxh", "bob", "jim"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            return index < names.length ? true : false;
        }

        @Override
        public Object next() {
            if (this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
