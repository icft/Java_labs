import static org.junit.jupiter.api.Assertions.*;

class MyListTest {

    @org.junit.jupiter.api.Test
    void add() {
        Object[] a = new Object[1];
        a[0] = 5;
        MyList l1 = new MyList(a);
        MyList l2 = new MyList();
        l2.add(5);
        assert l1.equals(l2);
        a = new Object[2];
        a[0] = 5;
        a[1] = "str";
        MyList l3 = new MyList(a);
        l2.add("str");
        assert l2.equals(l3);
    }

    @org.junit.jupiter.api.Test
    void remove() {
        Object[] a, b;
        a = new Object[4];
        b = new Object[3];
        a[0] = 1; a[1] = 2; a[2] = 3; a[3] = 4;
        b[0] = 1; b[1] = 3; b[2] = 4;
        MyList l = new MyList(a);
        MyList l1 = new MyList(b);
        Object r = l.remove(2);
        assert l.equals(l1);
        assert (r != null);
        r = l.remove(-10);
        b = new Object[2];
        b[0] = 3; b[1] =4;
        l1 = new MyList(b);
        assert l.equals(l1);
        assert (r != null);
        r = l.remove(11);
        b = new Object[1];
        b[0] = 3;
        l1 = new MyList(b);
        assert l.equals(l1);
        assert (r != null);
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
        Object[] a = new Object[3];
        a[0] = 5; a[1] = 7; a[2] = 3;
        MyList l = new MyList(a);
        Object[] b = new Object[4];
        b[0] = 5; b[1] = 5; b[2] = 7; b[3] = 3;
        MyList l1 = new MyList(b);
        l.add(5, -1);
        assert l.equals(l1);
        b = new Object[5];
        b[0] = 5; b[1] = 5; b[2] = 7; b[3] = 3; b[4] = "std";
        l1 = new MyList(b);
        l.add("std", 200);
        assert l.equals(l1);
        b = new Object[6];
        b[0] = 5; b[1] = 5; b[2] = 7; b[3] = "str"; b[4] = 3; b[5] = "std";
        l1 = new MyList(b);
        l.add("str", 3);
        assert l.equals(l1);
    }

    @org.junit.jupiter.api.Test
    void get() {
        Object[] a;
        a = new Object[5];
        a[0] = 1; a[1] = 5; a[2] = ""; a[3] = "std"; a[4] = 67;
        MyList l = new MyList(a);
        assert (l.get(3) != null);
        assert (l.get(21) == null);
        assert (l.get(2) != null);
    }

    @org.junit.jupiter.api.Test
    void indexOf() {
        Object[] a = new Object[5];
        a[0] = 1; a[1] = 5; a[2] = ""; a[3] = "std"; a[4] = 67;
        MyList l = new MyList(a);
        int t = l.indexOf("std");
        assert t == 4;
        t = l.indexOf(5);
        assert t == 2;
        t = l.indexOf(83948394);
        assert t == -1;
    }

    @org.junit.jupiter.api.Test
    void contains() {
        Object[] a = new Object[5];
        a[0] = 1; a[1] = 5; a[2] = ""; a[3] = "std"; a[4] = 67;
        MyList l = new MyList(a);
        assert l.contains("std");
        assert !l.contains("assert");
    }

    @org.junit.jupiter.api.Test
    void set() {
        Object[] a = new Object[5];
        a[0] = 1; a[1] = 5; a[2] = ""; a[3] = "std"; a[4] = 67;
        MyList l = new MyList(a);
        Object t = "assert";
        l.set(t, 6);
        assert t == l.get(5);
        l.set(t, -6);
        assert t == l.get(5);
        l.set(t, 2);
        assert t == l.get(2);
    }

    @org.junit.jupiter.api.Test
    void size() {
        Object[] a = new Object[5];
        a[0] = 1; a[1] = 1; a[2] = 1; a[3] = 1; a[4] = 1;
        MyList l = new MyList(a);
        assert l.size() == 5;
        MyList l1 = new MyList();
        assert l1.size() == 0;
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        Object[] a = new Object[1];
        a[0] = 5;
        MyList l = new MyList(a);
        assert !l.isEmpty();
        MyList l1 = new MyList();
        assert l1.isEmpty();
    }
}