package order.Do;

public class Node {

    //前一个站点
    private Node pre;
    private Node next;
    private String name;

    public Node(String name) {
        this.name = name;
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "pre=" + pre +
                ", next=" + next +
                ", name='" + name + '\'' +
                '}';
    }
}
