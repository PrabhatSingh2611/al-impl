import java.util.Scanner;

public class Arraylisttest {
    public static void main(String[] args) {
        /**
         * create object of class Arraylist of integer datatype and Test the implemented methods.
         */
        Arraylistimplement<Integer> data=new Arraylistimplement<Integer>();
        Object arr[]=new Object[data.size()];
        /**
         * Test public boolean add(T E) method.
         */
        data.add(2);
        data.add(3);
        data.add(7);
        data.add(9);
        Arraylistimplement<Integer> data1=new Arraylistimplement<Integer>();
        data1.add(19);
        data1.add(20);
        data1.add(21);



        /**
         * Test public int get(index) method
         */
       //System.out.println(data.get(2));
        /**
         * Test public boolean isEmpty() method
         */
        // System.out.println(data.isEmpty());
        /**
         * Test public boolean contains(object item)method
         */
        // System.out.println(data.contains(10));
        /**
         * Test public int size() method
         */
        System.out.println(data.size());

        /**
         * Test public Object toArray() method
         */

        /**
         * Test remove(object item) first occourence of object from list.
         */
/*

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the object to remove");
        int rm= sc.nextInt();
        System.out.println(data.remove(rm));
*/

        /**
         * Test set(index,T element) which Replaces the element at the specified position in this list with the specified element.
         */
        //System.out.println(data.set(2,10));

        /**
         *Test the add(int index, T item)method which inserts the specified element at the specified position in this list.
         */
       // data.add(3,50);

        /**
         *  to Test T remove(int i) method which Removes the element at the specified position in this list.
         */
       // System.out.println(data.remove(0));

        /**
         * To Test indexof(E item) which Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
         */
        //System.out.println(data.indexOf(3));

        for (int i=0;i<data.size();i++){
            System.out.println(data.get(i));
        }
        //data.clear();

        /**
         * Test to Removes the first occurrence of the specified element from this list, if it is present.
         */
        //data.remove(1);
        System.out.println(data.size());
        System.out.println("-----------------------------");
       // data.addAll(data1);
        for (int i=0;i<data.size();i++){
            System.out.println(data.get(i));
        }
        System.out.println("-----------------------------");
        for (int i=0;i<data.size();i++){
            System.out.println(data1.get(i));
        }
       //System.out.println( data.subList(0,3));
        System.out.println(data.lastIndexOf(9));
    }
