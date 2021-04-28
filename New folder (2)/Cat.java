import java.text.ParseException;

public class Cat extends Animal {
        private String CatBreed;
        private String furColor;
        private int age;

        public Cat(String name, String catbreed, String furcolor){
            super(name);
            this.CatBreed = catbreed;
            this.furColor = furcolor;
        }
        public String getCatBreed() {
            return CatBreed;
        }
        public String getFurColor(){
            return furColor;
    }

        @Override
        public void updateAccount() {
            getCatBreed();
            getFurColor();

        }

    public String toString() {
        return "Cat" + "\n" + super.toString() + "\n" + "Cat Breed: " + CatBreed + "\n" + "Fur color: " + furColor;
    }

    }