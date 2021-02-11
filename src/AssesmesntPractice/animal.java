package AssesmesntPractice;

public class animal {
    private String name;
    private String species;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    public String roar(){
        return "I am "+this.name +", hear me roar!";
    }
}
