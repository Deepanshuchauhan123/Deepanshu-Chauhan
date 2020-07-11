/*
Regex(Regular Expression)

The Java Regex or Regular Expression is an API to define a pattern for searching or manipulating strings.

It is widely used to define the constraint on strings such as password and email validation.
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex_Conditions
{
    public static void main(String[] args)
    {

        //Method 1
        // first two letters can be anything but last letter should be "m"
        Pattern p = Pattern.compile("..m");
        Matcher m = p.matcher("adm");
        Boolean b = m.matches();
        System.out.println(b);

        //Method 2
        System.out.println();
        b = Pattern.matches(".m", "am");
        System.out.println(b);


        //Method 3
        System.out.println();
        /* Matches single character("Note: Second one should be only single letter only then it will return true") is present in first string or not */
        System.out.println(Pattern.matches("[amn]", "acd"));
        System.out.println(Pattern.matches("[amn]", "a"));
        System.out.println(Pattern.matches("[amn]", "d"));


        System.out.println();
        //It will matches any of you character from "amn" if it is not there it will return true
        System.out.println(Pattern.matches("[^amn]", "z"));
        System.out.println(Pattern.matches("[^amn]", "a"));
        System.out.println(Pattern.matches("[^amn]", "Zo"));


        System.out.println();
        //It Will check the given range from a---to---z and From A---to---G if matches it will return true
        System.out.println(Pattern.matches("[a-zA-G]", "a"));
        System.out.println(Pattern.matches("[a-zA-G]", "B"));
        System.out.println(Pattern.matches("[a-zA-G]", "I"));


        System.out.println();
        //First letter should be either M or N and followed by letter from a---to---z and only five letter after the first letter
        System.out.println(Pattern.matches("[MN][a-z]{5}", "Monica"));
        System.out.println(Pattern.matches("[MN][a-z]{5}", "Aonica"));
        System.out.println(Pattern.matches("[MN][a-z]{5}", "Monicas"));


        System.out.println();
        //It will check that first string contains  character(only one character) of string first then it will return true
        System.out.println(Pattern.matches("[xyz]?", "x"));
        System.out.println(Pattern.matches("[xyz]?", "y"));
        System.out.println(Pattern.matches("[xyz]?", "xy"));


        System.out.println();
        //It will check that first string contains  character(only one character) one or more time of string first then it will return true
        System.out.println(Pattern.matches("[xyz]+", "xxy"));
        System.out.println(Pattern.matches("[xyz]+", "xyy"));
        System.out.println(Pattern.matches("[xyz]+", "xpy"));


        System.out.println();
        //It will check that first string contains  character(only one character) zero or more times of string first then it will return true
        System.out.println(Pattern.matches("[xyz]*", ""));
        System.out.println(Pattern.matches("[xyz]*", "xx"));
        System.out.println(Pattern.matches("[xyz]*", "xyz"));


        System.out.println();
        //It will check that the string contains integer or not, if yes then return true
        System.out.println(Pattern.matches("[\\d]", "9"));
        System.out.println(Pattern.matches("[\\d]", "90"));
        System.out.println(Pattern.matches("[\\d]", "A"));


        System.out.println();
        //It will check whether its a Character or not
        System.out.println(Pattern.matches("[\\D]", "G"));
        System.out.println(Pattern.matches("[\\D]", "a"));
        System.out.println(Pattern.matches("[\\D]", "GO"));
    }


}