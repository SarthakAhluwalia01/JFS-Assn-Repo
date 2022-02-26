package com.company;


import java.util.*;

public class collectionQ4 {
    public static void main(String[] args) {
        List<String> leap = new LinkedList<>();
        leap.add("14-02-2000");
        leap.add("14-02-2001");
        leap.add("14-02-2002");
        leap.add("14-02-2003");
        leap.add("14-02-2004");
        leap.add("14-02-2005");
        leap.add("14-02-2006");
        leap.add("14-02-2007");
        leap.add("14-02-2008");
        leap.add("14-02-2009");
        leap.add("14-02-2010");

        for(String it : leap)
        {
            String[] strings = it.split("-");
            if((int)Integer.parseInt(strings[2])%4==0)
            {
                if((int)Integer.parseInt(strings[2])%100==0)
                {
                    if((int)Integer.parseInt(strings[2])%400==0)
                        System.out.println("Your D.O.Bis " +it+" and it was a Leap Year");
                    else {
                        System.out.println("Your D.O.B is "+it+" and it was not a Leap Year");
                    }
                }
                else {
                    System.out.println("Your D.O.B is "+it+" and it was a Leap Year");
                }
            }
            else {
                System.out.println("Your D.O.B is "+it+" and it was not a Leap Year");
            }
        }
    }
}