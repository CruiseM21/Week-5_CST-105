
/*
 * Program: NFL_Player Tester
 * File: NFL_Player Tester.java
 * Summary: Tester for Player Class
 * Author: Vincent Christaldi
 * Date: 12/17/2017
*/

package nfl_player.tester;

public class NFL_PlayerTester
{
    public static void main(String[] args)
    {
        //test no arg constructor
        NFL_Player Player1 = new NFL_Player();
        //test full arg constructor
        NFL_Player Player2 = new NFL_Player("Le' Veon Bell", "Running Back","6'1",25,225,283,1105,3.9,0,0,7,2013);
        
        //display to show that no arg constructor call was successful
        System.out.println("**Call to No Arg Constructor**");
        System.out.println(Player1.getName());
        
        //display to show that full arg constructor call was successful.
        System.out.println("**Call To Full Arg Constructor**");
        System.out.println("Name:\t  " + Player2.getName());
        System.out.println("Position: " + Player2.getPosition());
        System.out.println("Height:\t  " + Player2.getHeight());
        
    }
    
}
