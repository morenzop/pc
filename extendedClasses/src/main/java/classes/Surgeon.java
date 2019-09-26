package classes;

public class Surgeon extends Doctor {

    private String makesHouseCalls;

    public Surgeon(String worksAtHospital, String makesHouseCalls) {
        super(worksAtHospital);
        this.makesHouseCalls = makesHouseCalls;
    }

    @Override
    public String treatPatient() {
        String performOperation="Surgery Completed";
        return performOperation;
    }

    public String makesIncision(){
        String scalpel="Cut It";
        return scalpel;
    }

    @Override
    public String toString() {
        return "Surgeon{" +
                "makesHouseCalls='" + makesHouseCalls + '\'' +
                '}';
    }
}
