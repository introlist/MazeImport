/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Alerts;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import mazeimport.GameGui;
import mazeimport.HighScore;
import mazeimport.TimeKeeper;

public class Alert extends RuntimeException
    {
      

    public Alert(String slow_ass_took_to_long, HighScore hs, String playerName, TimeKeeper tk, int levelNum) {
       //the game is over, here we must tell our high score method to recond the details.
            hs.addHighScore(playerName,tk.getMinutes(),tk.getSeconds(),levelNum);
            JFrame frame = new JFrame("Warning");
            JOptionPane.showMessageDialog(frame, "You Stupid Ass, Did you eat to much for dinner?  Move Faster!");//the entire game has ended.
            System.exit(1);
    }

    public Alert(String ass_Hole_hit_wall) {
            JFrame frame = new JFrame("Warning");
            JOptionPane.showMessageDialog(frame, "You Stupid Ass, Ran into something did you?");
    }
    }//end class