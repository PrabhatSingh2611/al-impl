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
        for ( asize=0; asize<capacity; asize++){
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
        for ( asize=0; asize<capacity; asize++){
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
        for( asize=0; asize<capacity; asize++) {
           if( thedata[asize]==item){
               for ( int i=asize; i<size(); i++){
                   thedata[asize]=thedata[asize+1];
               }
               return true;
           }
        }
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
    public  T set(int index, T item) {
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
    public Object[] toArray(Object[] objects) {
        objects = new Object[capacity];
        for (asize = 0; asize < capacity; asize++) {
            objects[asize] = thedata[asize];
        }
        return objects;
    }

    /**
     * Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
     * @param i
     * @param i1
     * @return
     */
    @Override
    public List subList(int i, int i1) {
        int x=i1;
        int x1=i;
       int cap=x-x1;
        T arr[]= (T[]) new Object[cap];
        int p=0;
        for ( int index=i; index<i1; index++){
            arr[p]=thedata[index];
            p++;
        }
        return Arrays.asList(arr);
    }

    /**
     * int lastindexOf(object o)Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
     * @param o
     * @return
     */
    @Override
    public int lastIndexOf(Object o) {
        for (int i=this.asize-1; i>=0; i--){
            if (thedata[i]==o){
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int i) {
        return null;
    }

    /**
     * Appends all of the elements in the specified collection to the end of this list, in the order that they are
     * returned by the specified collection's Iterator.
     * @param collection
     * @return
     */
    @Override
    public boolean addAll(Collection collection) {
        /*
        Object arr[]=collection.toArray();
        int newsize=this.asize+arr.length;
        for( int i=this.asize;i<newsize;i++){
            if(newsize<this.capacity){
                reAllocateCapacity();
                thedata[i]= (T) arr[i-this.asize];
            }

        }*/
        return true;
    }

    @Override
    public boolean addAll(int i, Collection collection) {
        return false;
    }
    @Override
    public boolean retainAll(Collection collection) {

        return false;
    }
    /**
     * Removes from this list all of its elements that are contained in the specified collection.
     * @param collection
     * @return
     */
    @Override
    public boolean removeAll(Collection collection) {
        return false;
    }

    @Override
    public boolean containsAll(Collection collection) {
        return false;
    }





}
