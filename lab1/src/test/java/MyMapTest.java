import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMapTest {

    @org.junit.jupiter.api.Test
    void put() {
        Object[] a = new Object[1];
        a[0] = new Node(2, "s");
        MyMap m = new MyMap();
        m.put(2, "s");
        MyMap m1 = new MyMap(a);
        assert m.equals(m1);
        m.put(2, 34);
        a[0] = new Node(2, 34);
        m1 = new MyMap(a);
        assert m.equals(m1);
        a = new Object[2];
        m.put(2, "s");
        a[0] = new Node(2, "s"); a[1] = new Node(4, "dw");
        m.put(4, "dw");
        m1 = new MyMap(a);
        assert m.equals(m1);
    }

    @org.junit.jupiter.api.Test
    void get() {
        Object[] a = new Object[2];
        a[0] = new Node(2, "s");; a[1] = new Node(4, "dw");
        MyMap m = new MyMap(a);
        assert m.get(2) == "s";
        assert m.get(4) == "dw";
        assert m.get(21) == null;
    }

    @org.junit.jupiter.api.Test
    void Get() {
        Object[] a = new Object[2];
        a[0] = new Node(2, "s");; a[1] = new Node(4, "dw");
        MyMap m = new MyMap(a);
        assert m.get(2, "return") == "s";
        assert m.get(1, "assert") == "assert";
    }

    @org.junit.jupiter.api.Test
    void remove() {
        Object[] a = new Object[2];
        Node n1 = new Node(2, "s"); Node n2 = new Node(4, "dw");
        a[0] = n1; a[1] = n2;
        MyMap m = new MyMap(a);
        Node n = (Node) m.remove(2);
        assert n.equals(n1);
        assert m.remove(21) == null;
    }

    @org.junit.jupiter.api.Test
    void keyContains() {
        Object[] a = new Object[2];
        Node n1 = new Node(2, "s"); Node n2 = new Node(4, "dw");
        a[0] = n1; a[1] = n2;
        MyMap m = new MyMap(a);
        assert m.keyContains(2);
        assert !m.keyContains(21);
    }

    @org.junit.jupiter.api.Test
    void getKeys() {
        Object[] a = new Object[2];
        Node n1 = new Node(2, "s"); Node n2 = new Node(4, "dw");
        a[0] = n1; a[1] = n2;
        Object[] b = new Object[2];
        b[0] = 2; b[1] = 4;
        MyList l = new MyList(b);
        MyMap m = new MyMap(a);
        assert l.equals(m.getKeys());
    }

    @org.junit.jupiter.api.Test
    void getValues() {
        Object[] a = new Object[2];
        Node n1 = new Node(2, "s"); Node n2 = new Node(4, "dw");
        a[0] = n1; a[1] = n2;
        Object[] b = new Object[2];
        b[0] = "s"; b[1] = "dw";
        MyList l = new MyList(b);
        MyMap m = new MyMap(a);
        assert l.equals(m.getValues());
    }

    @org.junit.jupiter.api.Test
    void getEntries() {
        Object[] a = new Object[2];
        Node n1 = new Node(2, "s"); Node n2 = new Node(4, "dw");
        a[0] = n1; a[1] = n2;
        Object[] b = new Object[2];
        b[0] = n1; b[1] = n2;
        MyList l = new MyList(b);
        MyMap m = new MyMap(a);
        assert l.equals(m.getEntries());
    }

    @org.junit.jupiter.api.Test
    void size() {
        Object[] a = new Object[2];
        Node n1 = new Node(2, "s"); Node n2 = new Node(4, "dw");
        MyMap m = new MyMap(a);
        assert m.size() == 2;
        MyMap m1 = new MyMap();
        assert m1.size() == 0;
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        Object[] a = new Object[2];
        Node n1 = new Node(2, "s"); Node n2 = new Node(4, "dw");
        MyMap m = new MyMap(a);
        assert !m.isEmpty();
        MyMap m1 = new MyMap();
        assert m1.isEmpty();
    }
}