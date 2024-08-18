public class intlist {
    public int first;
    public intlist rest;

    // what's passed in is an intlist
    public intlist(int f, intlist r){
        first = f;
        rest = r;// here we difine the intlist type rest to be a component of an intlist
    }

    // create a size method so we can easily get the size of the intlist
    public int size(){
        if (rest == null){
            return 1;
        }
        // by excute this.rest.size(), size method is continuously called until rest is null
        return 1 + this.rest.size();
    }

    public int intractiveSize(){
        intlist p = this;
        int totalSize = 0;
        while (p != null){
            totalSize += 1;
            p = p.rest;
        }
        return totalSize; 
    }   

    // return the ith item in the intlist
    public int get(int i){
        if (i == 0){
            return first;
        }
        // if i is still not zero, we need to call get method on rest
        return rest.get(i - 1);
    }

    public static void main(String[] args) {
        intlist L = new intlist(15, null);
        L = new intlist(10, L);
        L = new intlist(5, L);

        System.out.println(L.get(1));
    }   

}