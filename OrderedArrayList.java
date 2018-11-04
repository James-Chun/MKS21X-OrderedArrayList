import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  //default constructor
  public OrderedArrayList() {
    super();
  }

  //constructor with starting size
  public OrderedArrayList(int initialCapacity){
    super(initialCapacity);
  }

  //helper method to find new sorted index
  private int findNewIndex(T value){
    int newIndex = 0;
    for (int i = 0; i < size(); i ++) {
      if(value.compareTo(get(i))>0 ){
        newIndex++;
      }
    }
    return newIndex;
  }

  //overridden add()
  public boolean add(T value){
    super.add(findNewIndex(value),value);
    return true;
  }

  //overridden add(index,value)
  public void add(int index, T value){
    super.add(findNewIndex(value),value);
  }

  //overridden set()
  public T set(int index,T value){
    T temp = super.get(index);
    super.remove(index);
    super.add(findNewIndex(value),value);
    return temp;
  }
}
