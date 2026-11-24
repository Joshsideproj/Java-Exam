

// general strategy is that each assessment inherits from parent class Assessment - each contain name, cid and type
// within each subclass there are sub assessments needed to calculate overall percentage
// initiate 4x4 grid and for each row add one student in
// the final mark is calculated in the last column using previous 3 using if conditions for type of course UG or MSC

import assessments.AssessmentFeed;

import javax.swing.*;
import java.awt.*;

public static void main(String[] args){


    // ---- the grid: 5 x 7----
    JFrame frame = new JFrame("Exam Results");
    frame.setLayout(new GridLayout(5, 7));   // GridLayout(rows, cols)

    JLabel[] cells = new JLabel[AssessmentFeed.getCIDs().size()];
    for (int i = 0; i < cells.length; i++) {
        cells[i] = new JLabel("", SwingConstants.CENTER);
        cells[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
        frame.add(cells[i]);
    }
    // frame settings once, AFTER the loop
    frame.setSize(1400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);



}
