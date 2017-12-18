package prodraftlist;

/*
 * Program: Player_Manager Class for ProDraftList Program
 * File: Player_Manager.java
 * Summary: Loads all NFL player information for ProDraftList Program
 * Author: Vincent Christaldi
 * Date: 12/13/2017
*/
import java.util.Arrays;
import java.util.ArrayList;

public class Player_Manager 
{ 
    public static void initializeManger()
    {
       //create lists for each player
       //offensive players
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
       
    
    }
    
    //methods to fill list of players and stats 
    public void setList_Bell(ArrayList Bell)
    {          
                        //Le Veon Bell Stats
        Bell.add("Name:\t  Le Veon Bell");               //name
        Bell.add("Position: Running Back");              //position
        Bell.add("Height:\t  6'1");                      //height
        Bell.add("Age:\t  25");                          //age
        Bell.add("Weight:\t  225");                      //weight
        Bell.add("Total Carries:\t283");                 //total carries
        Bell.add("Total Yards:\t1105");                  //total yards
        Bell.add("Avg Yards:\t3.9");                     //average yards(will get from Yrd/Carries)
        Bell.add("Touchdowns:\t7");                      //touchdowns
        Bell.add("Start Year:\t2013");                   //starting year to get seasons played
    }
    public void setList_Darkwa(ArrayList Darkwa)
    {
                        //Orleans Darkwa Stats
        Darkwa.add("Name:\t   Orleans Darkwa");           //name
        Darkwa.add("Position:  Running Back");             //position
        Darkwa.add("Height:\t   5'11");                     //height
        Darkwa.add("Age:\t   25");                       //age
        Darkwa.add("Weight:\t   219");                      //weight
        Darkwa.add("Total Carries:\t136");                      //total carries
        Darkwa.add("Total Yards:\t580");                      //total yards
        Darkwa.add("Avg Yards:\t4.3");                      //average yards(will get from Yrd/Carries)
        Darkwa.add("Touchdowns:\t3");                        //touchdowns
        Darkwa.add("Start Year:\t2014");                     //starting year to get seasons played
    }
    public void setList_Brady(ArrayList Brady)
    {
                        //Tom Brady
        Brady.add("Name:\t  Tom Brady");                 //name
        Brady.add("Position: Quarterback");               //position
        Brady.add("Height:\t  6'4");                       //height
        Brady.add("Age:\t  40");                        //age
        Brady.add("Weight:\t  225");                       //weight
        Brady.add("Total Yards:\t3865");                      //total yards                
        Brady.add("Interceptions:\t6");                         //interceptions
        Brady.add("Runs To Goal:\t105.2");                     //Runs To Goal (Only for Quarterback
        Brady.add("Touchdowns:\t27");                        //touchdowns
        Brady.add("Start Year:\t2000");                      //starting year to get seasons played
    }
    public void setList_Brown(ArrayList Brown)
    {
                        //Antonio Brown
        Brown.add("Name:\t  Antonio Brown");              //name
        Brown.add("Position: Wide Receiver");              //position
        Brown.add("Height\t  5'10");                       //height
        Brown.add("Age:\t  29");                         //age
        Brown.add("Weight:\t  181");                        //weight
        Brown.add("Receptions:\t99");                         //total carries(recepions)
        Brown.add("Total Yards:\t1105");                       //total yards
        Brown.add("Avg Yards:\t15.2");                       //average yards(will get from Yrd/Carries)
        Brown.add("Touchdowns:\t9");                          //touchdowns
        Brown.add("Start Year:\t2010");                       //starting year to get seasons played
    }    
    public void setList_Hunt(ArrayList Hunt)
    {
                        //Kareem Hunt
        Hunt.add("Name:\t  Kareem Hunt");                //name
        Hunt.add("Position: Running Back");               //position
        Hunt.add("Height:\t  5'10");                       //height
        Hunt.add("Age:\t  22");                         //age
        Hunt.add("Weight:\t  216");                        //weight
        Hunt.add("Total Carries:\t218");                        //total carries(recepions)
        Hunt.add("Total Yards:\t1046");                       //total yards
        Hunt.add("Avg Yards:\t4.8");                        //average yards(will get from Yrd/Carries)
        Hunt.add("Touchdowns:\t5");                          //touchdowns
        Hunt.add("Start Year:\t2017");                       //starting year to get seasons played
    }
    public void setList_Schobert(ArrayList Schobert)
    {
                        //Joe Schobert
        Schobert.add("Name:\t  Joe Schobert");            //name
        Schobert.add("Position: Middle Linebacker");       //position
        Schobert.add("Height:\t  6'1");                     //height
        Schobert.add("Age:\t  24");                      //age
        Schobert.add("Weight:\t  245");                     //weight
        Schobert.add("Tackles:\t122");                     //total carries(Tackles)
        Schobert.add("Forced Fumbles: 3");                       //forced fumbles
        Schobert.add("Avg. Yards:\t2.5");                     //average yards(will get from Yrd/Carries)
        Schobert.add("Interceptions:  1");                       //interceptions
        Schobert.add("Start Year:\t2016");                    //starting year to get seasons played
    }
    public void setList_Jones(ArrayList Jones)
    {
                       //Chandler Jones
        Jones.add("Name:\t  Chandler Jones");             //name
        Jones.add("Position: Outside Linebacker");         //position
        Jones.add("Heigt:\t  6'5");                        //height
        Jones.add("Age:\t  27");                         //age
        Jones.add("Weight:\t  265");                        //weight
        Jones.add("Tackles:\t49");                         //total carries(Tackles)
        Jones.add("Forced Fumbles: 2");                          //forced fumbles
        Jones.add("Avg. Yards:\t14.0");                       //average yards(will get from Yrd/Carries)
        Jones.add("Interceptions:  0");                          //interceptions
        Jones.add("Start Year:\t2012");                       //starting year to get seasons played
    }
    public void setList_Collins(ArrayList Collins)
    {
                        //Landon Collins
        Collins.add("Name:\t  Landon Collins");           //name
        Collins.add("Position: Strong Safety");            //position
        Collins.add("Height:\t  6'0");                      //height
        Collins.add("Age:\t  23");                       //age
        Collins.add("Weight:\t  218");                      //weight
        Collins.add("Tackles:\t102");                      //total carries(Tackles)
        Collins.add("Forced Fumbles: 1");                        //forced fumbles
        Collins.add("Avg. Yards:\t0.0");                      //average yards(will get from Yrd/Carries)
        Collins.add("Interceptions:  2");                        //interceptions
        Collins.add("Start Year:\t2015");                     //starting year to get seasons played
    }
    public void setList_Slay(ArrayList Slay)
    {
                        //Darius Slay
        Slay.add("Name:\t  Darius Slay");                //name
        Slay.add("Position: Corner Back");                //position
        Slay.add("Height:\t  6'0");                        //height
        Slay.add("Age:\t  26");                         //age
        Slay.add("Weight:\t  190");                        //weight
        Slay.add("Tackles:\t47");                         //total carries(Tackles)
        Slay.add("Forced Fumbles: 0");                          //forced fumbles
        Slay.add("Avg. Yards:\t0.0");                        //average yards(will get from Yrd/Carries)
        Slay.add("Interceptions:  5");                          //interceptions
        Slay.add("Start Year:\t2013");                       //starting year to get seasons played
    }
    public void setList_Gipson(ArrayList Gipson)
    {
                        //Tashaun Gipson
        Gipson.add("Name:\t  Tashaun Gipson");           //name
        Gipson.add("Position: Full Safety");              //position
        Gipson.add("Height:\t  5'11");                     //height
        Gipson.add("Age:\t  27");                       //age
        Gipson.add("Weight:\t  212");                      //weight
        Gipson.add("Tackles:\t51");                       //total carries(Tackles)
        Gipson.add("Forced Fumbles: 0");                        //forced fumbles
        Gipson.add("Avg. Yards:\t0.0");                      //average yards(will get from Yrd/Carries)
        Gipson.add("Interceptions:  4");                        //interceptions
        Gipson.add("Start Year:\t2012");                     //starting year to get seasons played
    }
    
    //methods to get the stored information
    public ArrayList getList_Bell(ArrayList Bell)
    {
        return Bell;
    }
    public ArrayList getList_Darkwa(ArrayList Darkwa)
    {
        return Darkwa;
    }
    public ArrayList getList_Brady(ArrayList Brady)
    {
        return Brady;
    }
    public ArrayList getList_Brown(ArrayList Brown)
    {
        return Brown;
    }
    public ArrayList getList_Hunt(ArrayList Hunt)
    {
        return Hunt;
    }
    public ArrayList getList_Schobert(ArrayList Schobert)
    {
        return Schobert;
    }
    public ArrayList getList_Jones(ArrayList Jones)
    {
        return Jones;
    }
    public ArrayList getList_Collins(ArrayList Collins)
    {
        return Collins;
    }
    public ArrayList getList_Slay(ArrayList Slay)
    {
        return Slay;
    }
    public ArrayList getList_Gipson(ArrayList Gipson)
    {
        return Gipson;
    }
    
   
    
}
