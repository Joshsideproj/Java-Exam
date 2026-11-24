import assessments.*;

// name is found
public abstract class viva extends ass{
    double mark;

    public viva(){
        super("Design Viva");

    }



    // now to override methods

    @Override
    public  double[] getmarks() {
        double[] marksprog = new double[4];
        marksprog[0] = AssessmentFeed.getResult("10021", "Software Design Viva", "Explained successfully");
        marksprog[1] = AssessmentFeed.getResult("10022", "Software Design Viva", "Explained successfully");
        marksprog[2] = AssessmentFeed.getResult("10023", "Software Design Viva", "Explained successfully");
        marksprog[3] = AssessmentFeed.getResult("10024", "Software Design Viva", "Explained successfully");

        return marksprog;

    }





}
