import java.util.Arrays;

public class GradeCalc {
    public String courseName;
    public int[] arrayOfGrades;

    public GradeCalc(String courseName, int[] arrayOfGrades) {
        this.courseName = courseName;
        this.arrayOfGrades = arrayOfGrades;
    }

    public void getMinimumGrade() {
        Arrays.sort(arrayOfGrades);
        System.out.println(arrayOfGrades[0]);
    }

}