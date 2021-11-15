import java.util.*;

/*
 * the below class Arraylist implements all the methods of List interface.
 */
public class Arraylistimplement<T> implements List <T>{
    /**
     * private data members of class.
     */
    private int asize=0;
    private static final int INITIAL_CAPACITY=10;
    private T[] thedata;
    private int capacity=0;

    /**
    *  initializing the array and the capacity of array.
    */
    public Arraylistimplement() {
        capacity=INITIAL_CAPACITY;
        thedata=(T[])new Object[capacity];
    }

    /**
     * size() method returns the number of elements in this list.
     */
    @Override
    public int size() {

        return this.asize;
    }

    /**
     * isEmpty() method Returns true if this list contains no elements else return false.
     * @return
     */
    @Override
    public boolean isEmpty() {
        if(asize==0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * boolean contains(Object item) method Returns true if this list contains the specified element.
     * @param item
     * @return
     */
    @Override
    public boolean contains(Object item) {
        for (asize=0;asize<capacity;asize++){
                if (thedata[asize]==item) {
                    return true;
                }
            }
        return false;

    }

    @Override
    public Iterator iterator() {

        return null;
    }

    /**
     * Object[] toArray Returns an array containing all of the elements in this list in proper sequence (from first to last element).
     * @return
     */
    @Override
    public Object[] toArray() {
        int i;
        Object arr[]=new Object[capacity];
        for (asize=0;asize<capacity;asize++){
            arr[asize]=thedata[asize];
        }
        return arr;
    }

    /**
     * add(T item) method appends the specified element to the end of this list.
     * @param item
     * @return
     */
    @Override
    public boolean add(T item) {
        if(asize<capacity) {
            thedata[asize] = item;
            asize++;
            return true;
        }else {
            reAllocateCapacity();
            thedata[asize]=item;
            return true;
        }
    }

    private void reAllocateCapacity() {
        capacity*=2;
        thedata= Arrays.copyOf(thedata, capacity);
    }

    /**
     * boolean remove(Object o) Removes the first occurrence of the specified element from this list, if it is present.
     * @param item
     * @return
     */
    @Override
    public boolean remove(Object item) {
        for(asize=0;asize<capacity;asize++) {
           if(thedata[asize]==item){
               for ( int i=asize; i<size(); i++){
                   thedata[asize]=thedata[asize+1];
               }
               return true;
           }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, Collection collection) {
        return false;
    }

    /**
     * clear() method Removes all of the elements from this list.
     */
    @Override
    public void clear() {

        asize=0;

    }

    /**
     * get method Returns the element at the specified position in this list.
     */
    @Override
    public T get(int i) {
        if(i<0 && i>=asize){
           throw new ArrayIndexOutOfBoundsException(1);
        }
        return thedata[i];
    }

    /**
     * Replaces the element at the specified position in this list with the specified element.
     * @param index
     * @param item
     */
    @Override
    public T set(int index, T item) {
        thedata[index]=item;
        return item;
    }

    /**
     * add(int index, T item)method inserts the specified element at the specified position in this list.
     * @param index
     * @param item
     */
    @Override
    public void add(int index, T item) {
        if(index<asize) {
            thedata[index] = item;
        }else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /**
     * T remove(int i) method Removes the element at the specified position in this list.
     * @param index
     * @return
     */
    @Override
    public T remove(int index) {
        T data=thedata[index];
        for(int i=index+1;i<asize;i++){
            thedata[i-1]=thedata[i];
        }
        asize--;
        return data;
    }

    /**
     * Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
     * @param item
     * @return
     */
    @Override
    public int indexOf(Object item) {
        for(int i=0;i<asize;i++){
            if(thedata[i] == item){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int i) {
        return null;
    }

    @Override
    public List subList(int i, int i1) {
        return null;
    }

    @Override
    public boolean retainAll(Collection collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection collection) {
        return false;
    }

    @Override
    public boolean containsAll(Collection collection) {
        return false;
    }


    @Override
    public Object[] toArray(Object[] objects) {
        return new Object[0];
    }





}
