/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazeimport;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import mazeimport.GameGui;

public class SlowAssPlayer extends RuntimeException
    {
        public SlowAssPlayer(String event)
        {
            //the game is over, here we must tell our high score method to recond the details.
            GameGui.hs.addHighScore(GameGui.playerName,GameGui.tk.getMinutes(),GameGui.tk.getSeconds(),GameGui.levelNum);
            JFrame frame = new JFrame("Warning");
            JOptionPane.showMessageDialog(frame, "You Stupid Ass, Did you eat to much for dinner?  Move Faster!");//the entire game has ended.
            System.exit(1);
        }
    }//end class