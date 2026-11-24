import assessments.*;


// please note that this name is just a shortcut for parent class assessment
// abstract the class to allow for changing + abstract methods
public abstract  class ass {
    private String student_name; // encapsulate fields so important info can't be accessed elsewhere
    private int CID;
    private String deg_type;
    private String exam;


    public ass(String student_name, int CID, String deg_type, String exam) {
        this.student_name = student_name;                // field on the LEFT, parameter on the RIGHT
        this.CID = CID;
        this.deg_type = deg_type;
        this.exam = exam;
    }

    public abstract void getCID(); // leave for each exam
    public abstract void getStudentName();
    public abstract void getStudentType();
    

}


