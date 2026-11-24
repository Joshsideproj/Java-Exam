import assessments.*;
import java.util.*;

// name is found
public abstract class progtest extends ass{
    public progtest(){
        super("Programming Test");

    }

    // now to override methods

    // for each CID get the mark from list of CIDs


    // loop feed in and get list of marks
    @Override
    public  double[] getmarks() {
        double[] marksprog = new double[4];
        marksprog[0] = AssessmentFeed.getResult("10021", "Independent Programming Test", "Explained successfully");
        marksprog[1] = AssessmentFeed.getResult("10022", "Independent Programming Test", "Explained successfully");
        marksprog[2] = AssessmentFeed.getResult("10023", "Independent Programming Test", "Explained successfully");
        marksprog[3] = AssessmentFeed.getResult("10024", "Independent Programming Test", "Explained successfully");

        return marksprog;

    }
}
