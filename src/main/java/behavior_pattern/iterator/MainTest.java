package behavior_pattern.iterator;

/**
 * @Author   zenghzong
 * @Since 2019/8/8
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        NameRepository repository = new NameRepository();
        for (Iterator iterator = repository.getIterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}
