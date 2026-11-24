import assessments.*;

// name is found
public abstract class aitest extends ass{
    double mark;

    public aitest(){
        super("AI test");

    }

    @Override
    public  double[] getmarks() {
        double[] marksprog = new double[4];
        marksprog[0] = AssessmentFeed.getResult("10021", "AI-Assisted Programming Project", "Explained successfully");
        marksprog[1] = AssessmentFeed.getResult("10022", "AI-Assisted Programming Project", "Explained successfully");
        marksprog[2] = AssessmentFeed.getResult("10023", "AI-Assisted Programming Project", "Explained successfully");
        marksprog[3] = AssessmentFeed.getResult("10024", "AI-Assisted Programming Project", "Explained successfully");

        return marksprog;

    }

    // now to override methods




}
