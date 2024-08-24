/** An SLList is a list of integers, which hides the terrible truth of the nakedness within */
/** IntNode actually 对链表节点结构进行了一个封装 */
public class SLList {
    // 设定一个固定的第一个节点，这样就不会出现链表首尾衔接的情况 The first item (if it exists) is at sentinel.next
    private IntNode sentinel;
    // make it private, so that the user can't access it from outside class
    // private 就是更抽象底层的东西，通过设置private，user就不能直接访问这个变量，从而防止链表首尾衔接的情况。对于外部用户来说，they could never make IntNode
    private int size; // create size to store the size of the list

    // The function is for creating an empty SLList
    public SLList(){
        sentinel = new IntNode(5, null);
        size = 0;
    }

    // The function is for creating an SLList with an initial value
    public SLList(int x){
        sentinel = new IntNode(5, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }
    

    /** add x to the front of the list */
    /** IntNode actually 对链表节点结构进行了一个封装 */
    public void addFirst(int x){
        sentinel.next = new IntNode(x, sentinel.next); // 这里的sentinel.next就是原来的first
        size += 1;
    }

    /** return the first item in the list */
    public int getFirst(){
        return sentinel.next.item;
    }

    public void addLast(int x){
        IntNode p = sentinel;
        // scan p to the end of the list
        while(p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x, null);
        size += 1;
    }

    // public method speaks the language of people, private method speaks the language of gods
    public int size(){
        return size;
    }
    // 要让size更快，简化size的计算，可以从一开始就设置一个size变量，每次add都+1

    public static void main(String[] args){
        SLList L = new SLList();
        L.addLast(20);
        System.out.println(L.size());
    }

} 
