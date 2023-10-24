public class Specialist extends Student {

    private String diplomaName;
    private int diplomaEvaluation;

    public String getDiplomaName() {
        return diplomaName;
    }
    public int getDiplomaEvaluation() {
        return diplomaEvaluation;
    }
    public void setDiplomaName(String diplomaName) {
        this.diplomaName = diplomaName;
    }

    public void setDiplomaEvaluation(int diplomaEvaluation) {
        this.diplomaEvaluation = diplomaEvaluation;
    }


    public Specialist
            (
                    String lastName, String firstName, int age,
                    String speciality, String group, double rating, double attendance,
                    String diploma, int diplomaEvaluation
            )
    {
        super(lastName, firstName, age, speciality, group, rating, attendance);
        setDiplomaName(diploma);
        setDiplomaEvaluation(diplomaEvaluation);
        System.out.println("SConstructor:\t" + Integer.toHexString(hashCode()));
    }
    public String toString()
    {
        return super.toString() + " " + diplomaName + " " + diplomaEvaluation;
    }

}