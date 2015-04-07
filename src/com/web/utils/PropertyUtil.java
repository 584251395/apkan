package com.web.utils;

import java.io.IOException;
import java.util.Properties;
/**
 * a tool class to get the property set in complexnet.properties 
 * @version 0.0.1
 * @author Huan.Zeng
 *
 */
public class PropertyUtil {
	private static Properties pops;
	  static{
		  pops=new Properties();
		  try {
			pops.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("complexnet.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  public static String getKeyValue(String key){	  
		  return pops.getProperty(key);
	  }
}
