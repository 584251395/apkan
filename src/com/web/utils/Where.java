package com.web.utils;
 


/*
 * Created on 2006-4-5

 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

import java.util.*;

/**
 * @author Administrator
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

public class Where
{
 public static String getWhere(String arg)
 {

 		String str1=arg;
        String strnew = "";
        String temp = "";
        if(str1 == null || str1.equals("") || str1.equals("#"))
            return null;
        if(str1.indexOf("#") == -1)
        {
            strnew = "where " + str1 + "=?";
        } 
        else
        {
            String fan[] = str1.split("#");
            for(int i=0;i<fan.length;i++)
            {
            	System.out.println(fan[i]);
            }
            int h = 0;
            for(int j = 0; j < fan.length; j++)
            {
                if(fan[j].equals("null") || fan[j].equals(" "))
                    continue;
                temp = "where " + fan[j] + "=?";
                h = j;
                break;
            }
			System.out.print(h);
			System.out.print(fan.length);
            for(int i = h + 1; i < fan.length; i++)
            {
            	if(fan[i].equals("null") || fan[i].equals(" "))
            	continue;
            	else
                temp = temp + " and " + fan[i] + "=?";
            }

            strnew = temp;
        }
        return strnew;
    }
 public static String getWhere(ArrayList al1,ArrayList al2)
	 {
 	  String newWhere=new String();
	 	if((al1.size()==0)||(al2.size()==0)||(al1.size()!=al2.size()))
	 	{
	 		return null;
	 	}
	 	else
	 	{
	 		if(al1.size()==1)
	 		{
	 			newWhere=newWhere+al1.get(0)+"='"+al2.get(0)+"'";
	 			return newWhere;
	 		}
	 		else
	 		{
		 		for(int i=0;i<(al1.size()-1);i++)
		 		{
		 			newWhere=newWhere+al1.get(i)+"='"+al2.get(i)+"' and ";
		 		}
		 		newWhere=newWhere+al1.get(al1.size()-1)+"='"+al2.get(al1.size()-1)+"'";
		 		return newWhere;
	 		}
	 	}
	 }
	 public static String getWhere1(ArrayList al1,ArrayList al2)
	 {
		  String newWhere=new String();
		 	if((al1.size()==0)||(al2.size()==0)||(al1.size()!=al2.size()))
		 	{
		 		return "";
		 	}
		 	else
		 	{
		 		if(al1.size()==1)
		 		{
		 			newWhere=newWhere+al1.get(0)+al2.get(0);
		 			return newWhere;
		 		}
		 		else
		 		{
			 		for(int i=0;i<(al1.size()-1);i++)
			 		{
			 			newWhere=newWhere+al1.get(i)+al2.get(i)+" and ";
			 		}
			 		newWhere=newWhere+al1.get(al1.size()-1)+al2.get(al1.size()-1);
			 		return newWhere;
		 		}
		 	}
	 }
	 
	 public static String getWhere(List al1)
	 {
		  String newWhere=new String();
		 	if(al1.size()==0)
		 	{
		 		return "";
		 	}
		 	else
		 	{
		 		if(al1.size()==1)
		 		{
		 			newWhere=newWhere+al1.get(0);
		 			return "where "+newWhere;
		 		}
		 		else
		 		{
			 		for(int i=0;i<(al1.size()-1);i++)
			 		{
			 			newWhere=newWhere+al1.get(i)+" and ";
			 		}
			 		newWhere=newWhere+al1.get(al1.size()-1);
			 		return "where "+newWhere;
		 		}
		 	}
	 }
	 
	 public static String getWhere(String arg1,String arg2,String arg3,String arg4,String arg5,String arg6)
	 {
		 String newWhere=new String();
		 String ys1 = "";
		 String ys2 = "";
		 String gx = "";
		 if(arg2.equals("0")){
		 	ys1 = arg1+" = '"+arg3+"'";
		 } else if(arg2.equals("1")){
		 	ys1 = arg1+" < '"+arg3+"'";
		 } else if(arg2.equals("2")){
		 	ys1 = arg1+" > '"+arg3+"'";
		 } else if(arg2.equals("3")){
		 	ys1 = arg1+" <= '"+arg3+"'";
		 } else if(arg2.equals("4")){
		 	ys1 = arg1+" >= '"+arg3+"'";
		 }
		 
		 if(arg4.equals("0")){
			gx = "";
		 } else if(arg4.equals("1")){
		 	gx = " and "+arg1;
		 	if(arg5.equals("0")){
			 	ys2 = " = '"+arg6+"'";
			 } else if(arg5.equals("1")){
				ys2 = " < '"+arg6+"'";
			 } else if(arg5.equals("2")){
				ys2 = " > '"+arg6+"'";
			 } else if(arg5.equals("3")){
			 	ys2 = " <= '"+arg6+"'";
			 } else if(arg5.equals("4")){
			 	ys2 = " >= '"+arg6+"'";
			 }
	     } else {
			gx = " or "+arg1;
			if(arg5.equals("0")){
			 	ys2 = " = '"+arg6+"'";
			 } else if(arg5.equals("1")){
				ys2 = " < '"+arg6+"'";
			 } else if(arg5.equals("2")){
				ys2 = " > '"+arg6+"'";
			 } else if(arg5.equals("3")){
			 	ys2 = " <= '"+arg6+"'";
			 } else if(arg5.equals("4")){
			 	ys2 = " >= '"+arg6+"'";
			 }
		 }		 
		 
		 newWhere="("+ys1+gx+ys2+")";
	 	 return newWhere;
	 }
   }
