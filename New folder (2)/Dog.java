
import java.text.SimpleDateFormat;
public class Dog extends Animal {
    private String DogBreed;
    private String furColor;

    public Dog(String name, String Dogbreed, String furcolor) {
        super(name);
        this.DogBreed = Dogbreed;
        this.furColor = furcolor;
    }

    public String getDogBreed() {
        return DogBreed;
    }
    public String getFurColor(){
        return furColor;
    }

    @Override
    public void updateAnimal() {
        getDogBreed();
        getFurColor();
    }

    public String toString() {
        return "Dog" + "\n" + super.toString() + "\n" + "Dog Breed: " + DogBreed + "\n" + "Fur color: " + furColor;
    }
    /*
        @Override
        public String toText() {
            return "Dog\t" + name + "\t" + DogBreed + "\t" + petId;
        */
    }


