/******************************************************************************
JAVA CODE FOR DFA WITH {0,1} THAT ACCEPTS ALL THE STRINGS STARTING WITH 0,1 AND 1,0
*******************************************************************************/
/*
 * WRIITEN BY PUJITHA PULIBANDLA
 * LANGUAGE : JAVA
 * 
 */
import java.util.*;
public class DFA
{
	// Function for transition state of A
    static void transistion_state_A(String str)
    {
        
    // 	if the character is zero , setting the state to D 
        if (str.charAt(0) == '0')
        transistion_stateD(str.substring(1));
            
    //  if other character ,redirecting to B
        else
        transistion_state_B(str.substring(1));
    }

    // Function for transition state B	
    static void transistion_state_B(String str)
    {
        
    // 	 condition to check the end of the string (string.length() gives the length of the string )
        if (str.length() == 0){
            System.out.println("Sorry this string is not accepted in this DFA ");

        }
           
        else
        {
        
            // if the character is 1, setting the state to B
            if (str.charAt(0) == '1')
            {
                transistion_state_B(str.substring(1));
            }
            // if the character is 0, setting the state to C
            else
            transition_stateC(str.substring(1));
        }	
    }

    // Function for transitionstate C
    static void transition_stateC(String str)
    {
        // 	 condition to check the end of the string
        if (str.length() == 0)
            System.out.println("The given string is accepted");
        else
        {
            
            // if the character is 1, setting the state to B
            if (str.charAt(0) == '1')
            transistion_state_B(str.substring(1));

            // if the character is 0, setting the state to C
            else
            transition_stateC(str.substring(1));
        }
    }

    // Function for transition state D
    static void transistion_stateD(String str)
    {
        // 	 condition to check the end of the string
        if (str.length() == 0)
            System.out.println("Sorry this string is not accepted in this DFA");
        else
        {
            // if the character is 1, setting the state to E
            if (str.charAt(0) == '1')
            transistion_stateE(str.substring(1));
            // if the character is 0 , setting the state to D
            else
            transistion_stateD(str.substring(1));
        }
    }

    // Function for transition state E
    static void transistion_stateE(String str)
    {
        // 	 condition to check the end of the string
        if (str.length() == 0)
        System.out.println("The given string is accepted");
        else
        {
            
            // if the character is 0, transistion state to D
            if(str.charAt(0) == '0')
            transistion_stateD(str.substring(1));
            // if the character is 1 , transistion state to E
            else
            transistion_stateE(str.substring(1));
        }
    }   


// Main method
    public static void main(String args[])
    {
        //  the first 5 strings are accepted 
        String str1 = "001101";
        String str2= "10";
        String str3="01";
        String str4="10000";
        String str5="010111";
        // strings from here are not accepted 
        String str6="00";
        String str7="11";
        String str8="10001";
        String str9="00000";
        String str10="11111";
        // calling the transistion_state_A function 
        transistion_state_A(str1);
        transistion_state_A(str2);
        transistion_state_A(str3);
        transistion_state_A(str4);
        transistion_state_A(str5);
        transistion_state_A(str6);
        transistion_state_A(str7);
        transistion_state_A(str8);
        transistion_state_A(str9);
        transistion_state_A(str10);
    }
}
