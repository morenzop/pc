package classes;

public class DoctorTests {
    public static void main(String[] args) {
 Doctor doc1= new Doctor("Quiverstone Manor");

 FamilyDoctor doc2= new FamilyDoctor("Johnson's Pediatric","302-555-0129");

 Surgeon doc3= new Surgeon("Myers Urgent Care", "#302-867-5309");


        System.out.println(doc3.treatPatient());


    }
}
