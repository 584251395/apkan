/*
 * Created on 2006-3-7
 * 
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.web.tags;
import java.util.Date;


import javax.servlet.http.HttpServletRequest;

import javax.servlet.jsp.JspException;

import com.web.utils.Time;
//import javax.servlet.jsp.PageContext;
/**
 * @author Administrator
 * 按照规定格式打印时间
 */
public class TIMEtag extends TempletTagSupport{
    private Time time;
    public TIMEtag()     
    {
    } 

    public int doEndTag()
        throws JspException
    {
        print(time.getDate(new Date()));
        return 6;
    }

}
