//import javafx.util.Pair;

class Node {
    private Object key;
    private Object value;

    Node(Object key, Object value) {this.key = key; this.value = value;}
    public Object getKey() {return this.key;}
    public Object getValue() {return this.value;}
    @Override
    public boolean equals(Object obj) {
        Node n = (Node) obj;
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        return this.key == n.key && this.value == n.value;
    }
}

public class MyMap {
    private MyList lt;

    MyMap() { this.lt = new MyList(); }
    MyMap(Object[] a) {this.lt = new MyList(a);}
    MyMap(MyList l) {this.lt = new MyList(l);}
    MyMap(MyMap m) {this.lt = new MyList(m.lt);}
    public void put(Object key, Object value) {
        for (int i = 0; i < lt.size(); i++) {
            Node node = (Node) lt.get(i+1);
            if (node.getKey() == key) {
                this.lt.set(new Node(key, value), i+1);
                return;
            }
        }
        this.lt.add(new Node(key, value));
    }
    public Object get(Object key) {
        for (int i = 0; i < this.lt.size(); i++) {
            Node n = (Node) this.lt.get(i+1);
            if (n.getKey() == key) {
                return n.getValue();
            }
        }
        return null;
    }
    public Object get(Object key, Object bydefault) {
        for (int i = 0; i < this.lt.size(); i++) {
            Node n = (Node) this.lt.get(i+1);
            if (n.getKey() == key) {
                return n.getValue();
            }
        }
        put(key, bydefault);
        return bydefault;
    }
    public Object remove(Object key) {
        for (int i = 0; i < this.lt.size(); i++) {
            Node n = (Node) this.lt.get(i+1);
            if (n.getKey() == key) {
                return this.lt.remove(i);
            }
        }
        return null;

    }
    public boolean keyContains(Object key) {
        for (int i = 0; i < this.lt.size(); i++) {
            Node n = (Node) this.lt.get(i+1);
            if (n.getKey() == key) {
                return true;
            }
        }
        return false;
    }
    public MyList getKeys() {
        if (this.lt == null) {
            return new MyList();
        }
        Object[] k = new Object[this.lt.size()];
        for (int i = 0; i < this.lt.size(); i++) {
            Node n = (Node) this.lt.get(i+1);
            k[i] = n.getKey();
        }
        return new MyList(k);
    }
    public MyList getValues() {
        if (this.lt == null) {
            return new MyList();
        }
        Object[] v = new Object[this.lt.size()];
        for (int i = 0; i < this.lt.size(); i++) {
            Node n = (Node) this.lt.get(i+1);
            v[i] = n.getValue();
        }
        return new MyList(v);
    }
    public MyList getEntries() {
        if (this.lt == null) {
            return new MyList();
        }
        Object[] v = new Object[this.lt.size()];
        for (int i = 0; i < this.lt.size(); i++) {
            v[i] = (Node) this.lt.get(i+1);
        }
        return new MyList(v);
    }
    public int size() {
        return this.lt.size();
    }
    public boolean isEmpty() {
        return this.lt.isEmpty();
    }
    @Override
    public boolean equals(Object obj) {
        MyMap m = (MyMap) obj;
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        return this.lt.equals(m.lt);
    }
}
