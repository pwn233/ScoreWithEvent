/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorewithevent;
import java.util.Scanner;
/**
 *
 * @author pwn233
 */
public class ScoreWithEvent {
    public static Scanner sc = new Scanner(System.in);
    public static String dummy = "";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ScoreSource source = new ScoreSource();
        FirstSubscriber fsub = new FirstSubscriber();
        SecondSubscriber ssub = new SecondSubscriber();
        
        source.addScoreListener(fsub);
        source.addScoreListener(ssub);
        while(true) {
            System.out.print("Enter Score : ");
            dummy = sc.nextLine();
            if(dummy.equals("")) break;
            else source.setScore(dummy);
            dummy = "";
        }
    }
    
}
