/** An SLList is a list of integers, which hides the terrible truth of the nakedness within */
/** IntNode actually 对链表节点结构进行了一个封装 */
public class SLList {
    private IntNode first;
    // make it private, so that the user can't access it from outside class
    // private 就是更抽象底层的东西，通过设置private，user就不能直接访问这个变量，从而防止链表首尾衔接的情况。对于外部用户来说，they could never make IntNode

    public SLList(int x){
        first = new IntNode(x, null);
    }
    public static void main(String[] args){
        SLList L = new SLList(15);
        L.addFirst(5);
        L.addFirst(10);
        L.addLast(20); 
        System.out.println(L.getFirst());
    }

    /** add x to the front of the list */
    /** IntNode actually 对链表节点结构进行了一个封装 */
    public void addFirst(int x){
        first = new IntNode(x, first);
    }

    /** return the first item in the list */
    public int getFirst(){
        return first.item;
    }

    public SLList(){
        // create an empty SLList
        first = null;
    }

    public void addLast(int x){
        IntNode p = first;
        // scan p to the end of the list
        while(p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    /** return the size starts from p */
    private static int size(IntNode p){
        if(p.next == null){
            return 1;
        }
        return 1 + size(p.next);
    }

    // public method speaks the language of people, private method speaks the language of gods
    public int size(){
        return size(first);
    }
    // 要让size更快，简化size的计算，可以从一开始就设置一个size变量，每次add都+1

} 
