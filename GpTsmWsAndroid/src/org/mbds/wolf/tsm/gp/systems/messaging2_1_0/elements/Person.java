package org.mbds.wolf.tsm.gp.systems.messaging2_1_0.elements;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 3.0.3.5
//
// Created by amlesas Development at 08-07-2014
//
//---------------------------------------------------


import java.util.Hashtable;
import org.ksoap2.serialization.*;
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.ExtendedSoapSerializationEnvelope;

public class Person extends AttributeContainer implements KvmSerializable
{
    
    public String FirstName;
    
    public ArrayList< String>MiddleName =new ArrayList<String>();
    
    public String LastName;

    public Person ()
    {
    }

    public Person (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("FirstName"))
        {	
	        java.lang.Object obj = soapObject.getProperty("FirstName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.FirstName = j.toString();
                }
	        }
	        else if (obj!= null && obj instanceof String){
                this.FirstName = (String)obj;
            }    
        }
        if (soapObject.hasProperty("MiddleName"))
        {	
	        int size = soapObject.getPropertyCount();
	        this.MiddleName = new ArrayList<String>();
	        for (int i0=0;i0< size;i0++)
	        {
	            PropertyInfo info=new PropertyInfo();
	            soapObject.getPropertyInfo(i0, info);
                java.lang.Object obj = info.getValue();
	            if (obj!=null && info.name.equals("MiddleName"))
	            {
                    java.lang.Object j =info.getValue();
	                String j1= j.toString();
	                this.MiddleName.add(j1);
	            }
	        }
        }
        if (soapObject.hasProperty("LastName"))
        {	
	        java.lang.Object obj = soapObject.getProperty("LastName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.LastName = j.toString();
                }
	        }
	        else if (obj!= null && obj instanceof String){
                this.LastName = (String)obj;
            }    
        }


    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return FirstName;
        }
        if(propertyIndex==1)
        {
            return LastName;
        }
        if(propertyIndex>=+2 && propertyIndex< + 2+this.MiddleName.size())
        {
            return MiddleName.get(propertyIndex-(+2));
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 2+MiddleName.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "FirstName";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "LastName";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex>=+2 && propertyIndex <= +2+this.MiddleName.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "MiddleName";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
