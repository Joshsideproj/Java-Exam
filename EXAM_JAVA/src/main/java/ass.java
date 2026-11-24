import assessments.*;

import java.util.List;


// please note that this name is just a shortcut for parent class assessment
// abstract the class to allow for changing + abstract methods
// the only common theme across assessments is that they contain names
// within each subclass we need to fill out method to get score from assessmnt feed
public abstract  class ass {
    protected String examname;



    public ass(String examname) {
        this.examname = examname;

    }

    // all subclasses will use the list of CIDs
    public List<String> CIDS(){
        return AssessmentFeed.getCIDs();
    }

    // all subclasses will need to calculate final
    public abstract double[] getmarks(); // all assessments will need to get marks
    public abstract double getverificationmark();

}


