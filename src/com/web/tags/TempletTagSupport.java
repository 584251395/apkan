/*
 * Created on 2006-3-7
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.web.tags;
import java.io.IOException;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.TagSupport;
/**
 * @author Administrator
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class TempletTagSupport extends TagSupport{
	protected JspWriter out;
    protected void print(boolean x)
        throws JspException
    {  
        out = pageContext.getOut();
        try
        { 
            out.print(x);
        }
        catch(IOException e)
        {
            throw new JspException("IOException:" + e.getMessage());
        }
    }

    protected void print(char x)
        throws JspException
    {
        out = pageContext.getOut();
        try
        {
            out.print(x);
        }
        catch(IOException e)
        {
            throw new JspException("IOException:" + e.getMessage());
        }
    }

    protected void print(char x[])
        throws JspException
    {
        out = pageContext.getOut();
        try
        {
            out.print(x);
        }
        catch(IOException e)
        {
            throw new JspException("IOException:" + e.getMessage());
        }
    }

    protected void print(double x)
        throws JspException
    {
        out = pageContext.getOut();
        try
        {
            out.print(x);
        }
        catch(IOException e)
        {
            throw new JspException("IOException:" + e.getMessage());
        }
    }

    protected void print(float x)
        throws JspException
    {
        out = pageContext.getOut();
        try
        {
            out.print(x);
        }
        catch(IOException e)
        {
            throw new JspException("IOException:" + e.getMessage());
        }
    }

    protected void print(int x)
        throws JspException
    {
        out = pageContext.getOut();
        try
        {
            out.print(x);
        }
        catch(IOException e)
        {
            throw new JspException("IOException:" + e.getMessage());
        }
    }

    protected void print(long x)
        throws JspException
    {
        out = pageContext.getOut();
        try
        {
            out.print(x);
        }
        catch(IOException e)
        {
            throw new JspException("IOException:" + e.getMessage());
        }
    }

    protected void print(Object x)
        throws JspException
    {
        out = pageContext.getOut();
        try
        {
            out.print(x);
        }
        catch(IOException e)
        {
            throw new JspException("IOException:" + e.getMessage());
        }
    }

    protected void print(String x)
        throws JspException
    {
        out = pageContext.getOut();
        try
        {
            out.print(x);
        }
        catch(IOException e)
        {
            throw new JspException("IOException:" + e.getMessage());
        }
    }

    protected void println(boolean x)
        throws JspException
    {
        out = pageContext.getOut();
        try
        {
            out.println(x);
        }
        catch(IOException e)
        {
            throw new JspException("IOException:" + e.getMessage());
        }
    }

    protected void println(char x)
        throws JspException
    {
        out = pageContext.getOut();
        try
        {
            out.println(x);
        }
        catch(IOException e)
        {
            throw new JspException("IOException:" + e.getMessage());
        }
    }

    protected void println(char x[])
        throws JspException
    {
        out = pageContext.getOut();
        try
        {
            out.println(x);
        }
        catch(IOException e)
        {
            throw new JspException("IOException:" + e.getMessage());
        }
    }

    protected void println(double x)
        throws JspException
    {
        out = pageContext.getOut();
        try
        {
            out.println(x);
        }
        catch(IOException e)
        {
            throw new JspException("IOException:" + e.getMessage());
        }
    }

    protected void println(float x)
        throws JspException
    {
        out = pageContext.getOut();
        try
        {
            out.println(x);
        }
        catch(IOException e)
        {
            throw new JspException("IOException:" + e.getMessage());
        }
    }

    protected void println(int x)
        throws JspException
    {
        out = pageContext.getOut();
        try
        {
            out.println(x);
        }
        catch(IOException e)
        {
            throw new JspException("IOException:" + e.getMessage());
        }
    }

    protected void println(long x)
        throws JspException
    {
        out = pageContext.getOut();
        try
        {
            out.println(x);
        }
        catch(IOException e)
        {
            throw new JspException("IOException:" + e.getMessage());
        }
    }

    protected void println(Object x)
        throws JspException
    {
        out = pageContext.getOut();
        try
        {
            out.println(x);
        }
        catch(IOException e)
        {
            throw new JspException("IOException:" + e.getMessage());
        }
    }

    protected void println(String x)
        throws JspException
    {
        out = pageContext.getOut();
        try
        {
            out.println(x);
        }
        catch(IOException e)
        {
            throw new JspException("IOException:" + e.getMessage());
        }
    }
}
