public class Person {
    private String name;
    protected char sex;
    private String pronoun;

    public Person(String name){
        this.name= name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPronoun(String pronoun){
        this.pronoun=pronoun;
    }

    public String getPronoun() {
        return pronoun;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
