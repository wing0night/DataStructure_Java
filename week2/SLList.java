/** An SLList is a list of integers, which hides the terrible truth of the nakedness within */
public class SLList {
    public IntNode first;

    public SLList(int x){
        first = new IntNode(x, null);
    }
    public static void main(String[] args){
        SLList L = new SLList(15);
    }
}
