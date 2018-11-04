import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int initialCapacity){
    super(initialCapacity);
  }
  public int findNewIndex(T value){
    int newIndex = 0;
    for (int i = 0; i < size(); i ++) {
      if(value.compareTo(get(i))>0 ){
        newIndex++;
      }
    }
    return newIndex;
  }
  public boolean add(T value){
    super.add(findNewIndex(value),value);
    return true;
  }
  public void add(int index, T value){
    super.add(findNewIndex(value),value);
  }
}
