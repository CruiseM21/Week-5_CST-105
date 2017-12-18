/*
 * Program: NFL Draft List Program
 * File: ProDraftList.java
 * Summary: Draft list program compiles players,stats, etc
 * Author: Vincent Christaldi
 * Date: 12/13/2017
*/
package prodraftlist;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ProDraftList 
{
    public static void main(String[] args) 
    {        
            //*******SET UP INITIAL PROGRAM******
        //initialize list of players for interface access
        Player_Manager.initializeManger();
        //array for name selection(Will be replaced by GUI in final
        String PlayerName[][] = new String[10][2];
        setNameArray(PlayerName);//fill array
        
        //array to hold chosen player's stats
        String PlayerStats[] = new String[10];
         
        //create input scanner object
        Scanner input = new Scanner(System.in);
        
        //Array list for holding stats until called
        ArrayList <String> Bell = new ArrayList<>();
        ArrayList <String> Darkwa = new ArrayList<>();
        ArrayList <String> Brady = new ArrayList<>();
        ArrayList <String> Brown = new ArrayList<>();
        ArrayList <String> Hunt = new ArrayList<>();
        //defensive players
        ArrayList <String> Schobert = new ArrayList<>();
        ArrayList <String> Jones = new ArrayList<>();
        ArrayList <String> Collins = new ArrayList<>();
        ArrayList <String> Slay = new ArrayList<>();
        ArrayList <String> Gipson = new ArrayList<>();
       
        //display player names(In final application will be displayed in GUI)
        for(int Row = 0; Row < 10; ++Row)
        {
            System.out.println();
            for(int Col = 0; Col < 2; ++Col)
            {
                
                System.out.print(PlayerName[Row][Col] + " ");
            }
        }
        System.out.println("\nEnter Last Name of Player From List To See Stats:");
        String name = input.next();       
        
        Player_Manager newPlayer = new Player_Manager();
        //Selection of list based on which name is entered.
        switch (name)
        {
            case "Bell":
            {
                newPlayer.setList_Bell(Bell);
                newPlayer.getList_Bell(Bell);
                for(int index = 0; index < Bell.size();++index)
                {
                    PlayerStats[index] = Bell.get(index);
                }
                break;
            }
            case "Darkwa":
            {
                newPlayer.setList_Darkwa(Darkwa);
                newPlayer.getList_Darkwa(Darkwa);
                for(int index = 0; index < Darkwa.size();++index)
                {
                    PlayerStats[index] = Darkwa.get(index);
                }
                break;
            }
            case "Brady":
            {
                newPlayer.setList_Brady(Brady);
                newPlayer.getList_Brady(Brady);
                for(int index = 0; index < Brady.size();++index)
                {
                    PlayerStats[index] = Brady.get(index);
                }
                break;
            }
            case "Brown":
            {
                newPlayer.setList_Brown(Brown);
                newPlayer.getList_Brown(Brown);
                for(int index = 0; index < Brown.size();++index)
                {
                    PlayerStats[index] = Brown.get(index);
                }
                break;
            }
            case "Hunt":
            {
                newPlayer.setList_Hunt(Hunt);
                newPlayer.getList_Hunt(Hunt);
                for(int index = 0; index < Hunt.size();++index)
                {
                    PlayerStats[index] = Hunt.get(index);
                }
                break;
            }
            case "Schobert":
            {
                newPlayer.setList_Schobert(Schobert);
                newPlayer.getList_Schobert(Schobert);
                for(int index = 0; index < Schobert.size();++index)
                {
                    PlayerStats[index] = Schobert.get(index);
                }
                break;
            }
            case "Jones":
            {
                newPlayer.setList_Jones(Jones);
                newPlayer.getList_Jones(Jones);
                for(int index = 0; index < Jones.size();++index)
                {
                    PlayerStats[index] = Jones.get(index);
                }
                break;
            }
            case "Collins":
            {
                newPlayer.setList_Collins(Collins);
                newPlayer.getList_Collins(Collins);
                for(int index = 0; index < Collins.size();++index)
                {
                    PlayerStats[index] = Collins.get(index);
                }
                break;
            }
            case "Slay":
            {
                newPlayer.setList_Slay(Slay);
                newPlayer.getList_Slay(Slay);
                for(int index = 0; index < Slay.size();++index)
                {
                    PlayerStats[index] = Slay.get(index);
                }
                break;
            }
            case "Gipson":
            {
                newPlayer.setList_Gipson(Gipson);
                newPlayer.getList_Gipson(Gipson);
                for(int index = 0; index < Gipson.size();++index)
                {
                    PlayerStats[index] = Gipson.get(index);
                }
                break;
            }    
        }
        //call display method(will be implemented later as GUI display
        displayResults(PlayerStats);
        
    }
    
       //fill Player Name Array
    public static void setNameArray(String name[][])
    {
        //Fill array with names to access list of players
        //Le Veon Bell
        name[0][0] = "Le Veon";             //first name(For list display
        name[0][1] = "Bell";                //Last name (for list of player stats)
        
        //Orleans Darkwa
        name[1][0] = "Orleans";             //first name(For list display
        name[1][1] = "Darkwa";              //Last name (for list of player stats)
        
        //Tom Brady
        name[2][0] = "Tom";                 //first name(For list display
        name[2][1] = "Brady";               //Last name (for list of player stats)
        
        //Antonio Brown
        name[3][0] = "Antonio";             //first name(For list display
        name[3][1] = "Brown";               //Last name (for list of player stats)
        
        //Kareem Hunt
        name[4][0] = "Kareem";              //first name(For list display
        name[4][1] = "Hunt";                //Last name (for list of player stats)
        
        //Joe Schobert
        name[5][0] = "Joe";                 //first name(For list display
        name[5][1] = "Schobert";            //Last name (for list of player stats)
        
        //Chandler Jones
        name[6][0] = "Chandler";            //first name(For list display
        name[6][1] = "Jones";               //Last name (for list of player stats)
        
        //Landon Collins
        name[7][0] = "Landon";              //first name(For list display
        name[7][1] = "Collins";             //Last name (for list of player stats)
        
        //Darius Slay
        name[8][0] = "Darius";              //first name(For list display
        name[8][1] = "Slay";                //Last name (for list of player stats)
        
        //Tashaun Gipson
        name[9][0] = "Tashaun";             //first name(For list display
        name[9][1] = "Gipson";              //Last name (for list of player stats)
        
        
        
    }
    
    public static void displayResults(String Stats[])
    {
        //Temporary Display for testing purposes.
        //Will be displayed on form in GUI
        for(int index = 0; index < Stats.length;++index)
        {
            System.out.println(Stats[index]);
        }
        
    }
    
    
    
    
    
}
