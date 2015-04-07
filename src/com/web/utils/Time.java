// Decompiled by Jad v1.5.7g. Copyright 2000 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/SiliconValley/Bridge/8617/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 
// Source File Name:   Time.java

package com.web.utils;

import java.text.SimpleDateFormat;


import java.util.Date;

public class Time
{
    Date date;
    protected SimpleDateFormat sdf;
    public Time()
    {
        sdf = new SimpleDateFormat();
    }

    public String format(String str)
    {
        return format(str, "");
    }

    public String format(String str, String defaultvalue)
    {
        try
        {
            sdf.applyPattern(str);
            if(this.date!=null)
            	return sdf.format(date);
            else
            return sdf.format(new Date());
        }
        catch(Exception e) { }
        if(defaultvalue == null)
            defaultvalue = "";
        return defaultvalue;
    }

    public String getYear()
    {
        return format("yyyy");
    }

    public String getMonth()
    {
        return format("MM");
    }

    public String getDate()
    {
        return format("dd");
    }

    public String getTime()
    {
        return format("yyyy-MM-dd");
    }
    public  String getTime(Date date)
    {
    	this.date=date;
        return format("yyyy-MM-dd");
    }    
    public String getTime8()
    {
        return format("yyyyMMdd");
    }

    public String getTime10()
    {
        return format("yyyyMMddHH");
    }
    public String getTimeyyyyMMddHHmm()
    {
        return format("yyyy-MM-dd HH:mm:ss");
    }
    public String getTime12()
    {
        return format("yyyyMMddHHmm");
    }

    public String getTime14()
    {
        return format("yyyyMMddHHmmss");
    }

    public String getTime17()
    {
        return format("yyyyMMddHHmmssSSS");
    }
    public static String date_store() {
        String temp;	
    	SimpleDateFormat datastr=new SimpleDateFormat("yyyy-MM-dd:HHmmss");
    	temp= datastr.format(new Date());
        return temp;  
    	}
    public static String getDate(Date date){
    	SimpleDateFormat datastr=new SimpleDateFormat("yyyy-MM-dd HH:mm");
    	return datastr.format(date);
    }
 
     public static String  getTimeSpan(String time1,String time2)
     {
    	int h1,h2,m1,m2;
    	 try{
    	  String[] s=time1.split(":");
          h1=Integer.parseInt(s[0]);
          m1=Integer.parseInt(s[1]);
          s=time2.split(":");
          h2=Integer.parseInt(s[0]);
          m2=Integer.parseInt(s[1]);
          return m1<=m2? ((h2-h1)+":"+(m2-m1)):((h2-h1-1)+":"+(m2+60-m1));
    	 }catch(Exception e)
    	 {
    		 return null;
    	 }
        
         
     }
     public static void main(String[] args) {
		System.out.println(getTimeSpan("6:30","4:10"));
	}
}
