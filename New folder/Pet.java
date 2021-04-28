public class Pet {
    private Animal[] animals;
    private int count;

    public Pet(int size) {
        count = 0;
        animals = new Animal[size];
    }

    public int indexOf(Animal a) {
        for (int i = 0; i < count; i++) {
            if (animals[i].equals(a))
                return i;
        }
        return -1;
    }

    private void doubleCapacity() {
        Animal[] bigAni = new Animal[count * 2];
        for (int i = 0; i < count; i++) {
            bigAni[i] = animals[i];
        }
        animals = bigAni;

    }

    public boolean add(Animal a) {
        if (animals.length == count)
            doubleCapacity();

        animals[count] = a;
        count++;
        return true;
    }

    public boolean contains(Animal a) {

        int lop = indexOf(a);
        if (lop == -1) return false;
        return true;
    }

    public boolean remove(Animal a) {

        if (!contains(a)) return false;

        int lop = indexOf(a); // must be >= 0
        animals[lop] = animals[count - 1];
        animals[count - 1] = null;
        count--;
        return true;
    }

    public Animal find(int petId) {
        for (int i = 0; i < count; i++) {
            if (animals[i].getPetid() == petId)
                return animals[i];
        }
        return null;

    }

    public int getCount() {
        return count;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(animals[i].toString() + "\n********************************************\n");
        }

        return sb.toString();
    }

    public void sort(){
        for(int i=0; i < count-1; i++){

            int min_idx = i;
            for (int j = i+1;j < count; j++)
                if (animals[j].getPetid() < animals[min_idx].getPetid())
                    min_idx = j;

            Animal temp = animals[min_idx];
            animals[min_idx] = animals[i];
            animals[i] = temp;
        }
    }

}