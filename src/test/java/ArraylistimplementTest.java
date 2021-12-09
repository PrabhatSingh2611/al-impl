import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
//import org.junit.jupiter.api.TestInstance;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.TestInstance.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ArraylistimplementTest {

    Arraylistimplement list;

    @BeforeAll
    public  void before() {
        list = new Arraylistimplement<Integer>();
    }

    @BeforeEach
    public void init() {
        list = new Arraylistimplement<Integer>();
    }

    @Test
    void size() {
        list.add(30);
        list.add(40);
        list.add(38);
        list.add(50);
        System.out.println(list.size());
        assertTrue(list.size() == 4);
    }

    @Test
    void isEmpty() {
        assertTrue(list.isEmpty());
    }

    @Test
    void contains() {
        list.add(40);
        list.add(38);
        list.add(50);
        assertTrue(list.contains(40));
    }

    @Test
    void iterator() {
    }

    @Test
    void toArray() {
        Object arr[]=list.toArray();
        assertTrue(arr.length==list.size());

    }

    @Test
    void add() {
        list.add(30);
        list.add(40);
        list.add(38);
        list.add(50);
        assertEquals(38, list.get(2));

    }

    @Test
    void clear() {
        assertEquals(0,list.size());
        assertTrue(list.size() == 0);
        // assertThrows(RuntimeException.class,() -> {list.isEmpty();});
    }

    @Test
    void get() {
        list.add(30);
        list.add(40);
        list.add(38);
        list.add(50);
        System.out.println(list.size());
        assertEquals(30, list.get(0));
        assertEquals(list.get(3), 50);
    }

    @Test
    void set() {
        list.add(30);
        list.add(40);
        list.add(38);
        list.add(50);

        list.set(2, 90);
        assertNotNull(list.get(2));
        assertEquals(90, list.get(2));
        assertEquals(50, list.get(3));

    }


    @Test
    void remove() {
        list.add(30);
        list.add(40);
        list.add(38);
        list.add(50);
        assertEquals(30,list.remove(0));

    }

    @Test
    void indexOf() {
        list.add(30);
        list.add(40);
        list.add(38);
        list.add(50);
        assertEquals(0,list.indexOf(30));
    }



    @Test
    void subList() {
        list.add(30);list.add(40);list.add(38);
        list.add(50);list.add(30);list.add(40);
        list.add(38);list.add(50);
        List list1= list.subList(2,5);

        assertEquals(3,list1.size());
    }

    @Test
    void lastIndexOf() {
        list.add(30);list.add(40);list.add(38);
        list.add(50);list.add(30);list.add(40);
       assertEquals(4, list.lastIndexOf(30));
    }



    @Test
    void listIterator() {
    }

    @Test
    void addAll() {
    }


    @Test
    void retainAll() {
    }

    @Test
    void removeAll() {
    }

    @Test
    void containsAll() {
    }
}