public class App{
    public static void main(String[] args){
        System.out.println("Hello World");
        Mydog d = new Mydog(10);
        d.makeNoise();

        //create an array and set the weight of the dog
        Mydog[] dogs = new Mydog[]{
            new Mydog(20),
            new Mydog(15)
        };
        
        dogs[0].makeNoise();
        dogs[1].makeNoise();
        
        // figure out which dog is bigger
        Mydog bigger = Mydog.maxDog(dogs[0], dogs[1]);
        bigger.makeNoise();

        System.out.println(Mydog.binomen);
    }
}