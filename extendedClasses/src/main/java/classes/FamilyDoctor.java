package classes;

public class FamilyDoctor extends Doctor {

    private String makesHouseCalls;

    public FamilyDoctor(String worksAtHospital,String makesHouseCalls) {
        super(worksAtHospital);
        this.makesHouseCalls=makesHouseCalls;
    }

    public String giveAdvice(){
        return "Medical Consultation";
    }
}
