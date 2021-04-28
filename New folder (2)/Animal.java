import java.util.Objects;

public abstract class Animal {
    protected String Name;
    protected String Color;
    protected int petId;
    protected static int animalsAdded;

    public Animal(String name) {
        this.Name = name;

        this.petId = genneratePetid();
    }
    static int getanimalsAdded() {
        return animalsAdded;
    }
    private int genneratePetid() {

        petId = (int) ((Math.random() * 1000000000));
        animalsAdded++;
        return petId;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal1 = (Animal) o;
        return petId == animal1.petId;
    }

    public String getName() {
        return Name;
    }

    public String getColor() {
        return Color;
    }
    public int getPetid(){
        return petId;
    }
    public String toString() {
        return Name + " " + "[" + petId + "]";
    }
    public abstract void updateAccount();

    public int hashCode() {
        return Objects.hash(petId);
    }
}

