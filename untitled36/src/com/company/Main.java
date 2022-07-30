package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here



/**
 * @author 窓辺ありにゃん
 */
        class JavaSwingCalendar extends JFrame {

            public static void main(String[] args) {
                JavaSwingCalendar frame = new JavaSwingCalendar("カレンダー");
                frame.setVisible(true);
            }

            JavaSwingCalendar (String title) {
                Calendar cal = Calendar.getInstance();
                int lastday = cal.getActualMaximum(Calendar.DATE);
                cal.add(Calendar.DATE, -cal.get(Calendar.DATE) + 1);
                int offset = cal.get(Calendar.DAY_OF_WEEK) - 1;

                setTitle(title);
                setSize(250, 250);
                setLocationRelativeTo(null);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel p = new JPanel();
                p.setLayout(new GridLayout(0, 7));
                ArrayList<JLabel> labelArray = new ArrayList<JLabel>();

                for (int i = 0; i < offset; i++)
                    labelArray.add(new JLabel(" "));

                for (int i = 1; i <= lastday; i++)
                    labelArray.add(new JLabel(String.valueOf(i)));

                Iterator<JLabel> ite = labelArray.iterator();

                while (ite.hasNext()) {
                    JLabel label = (JLabel) ite.next();
                    label.setHorizontalAlignment(JLabel.TRAILING);
                    p.add(label);
                }

                getContentPane().add(p, BorderLayout.CENTER);
            }

        }
    }
}
