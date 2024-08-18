public class Mydog {
    public int weightInPounds;//set the weight of the dog 
    public static String binomen = "Canis familiaris";//set the binomen of the dog(static)

    //define a constructor. so the parameter can easily be set
    public Mydog(int weight){//constructor
        weightInPounds = weight;
    }

    public void makeNoise(){// For different weight of the dog, it will make different noise
        if (weightInPounds < 10){
            System.out.println("Yip!");
        } else if (weightInPounds < 30){
            System.out.println("Bark.");
        } else {
            System.out.println("Wooof!");
        }
    }

    // create the dog comprison method(static method)
    public static Mydog maxDog(Mydog d1, Mydog d2){
        if (d1.weightInPounds > d2.weightInPounds){
            return d1;
        }
        return d2;
    }
}