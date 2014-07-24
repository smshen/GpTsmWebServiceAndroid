package org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.elements;

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
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.ExtendedSoapSerializationEnvelope;

public class Error extends AttributeContainer implements KvmSerializable
{
    
    public String ErrorCategory;
    
    public String ErrorNumber;
    
    public String ErrorDescription;

    public Error ()
    {
    }

    public Error (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  


        if (inObj.hasAttribute("ErrorCategory"))
        {	
            java.lang.Object j = inObj.getAttribute("ErrorCategory");
            if (j != null)
            {
	            ErrorCategory = j.toString();
            }
        }

        if (inObj.hasAttribute("ErrorNumber"))
        {	
            java.lang.Object j = inObj.getAttribute("ErrorNumber");
            if (j != null)
            {
	            ErrorNumber = j.toString();
            }
        }

        if (inObj.hasAttribute("ErrorDescription"))
        {	
            java.lang.Object j = inObj.getAttribute("ErrorDescription");
            if (j != null)
            {
	            ErrorDescription = j.toString();
            }
        }

    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using org.mbds.wolf.tsm.gp.systems.messaging2_1_0 version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 0;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }


    @Override
    public int getAttributeCount() {
        return 3;
    }
    
    @Override
    public void getAttributeInfo(int index, AttributeInfo info) {
        if(index==0)
        {
            info.name = "ErrorCategory";
            info.namespace= "";
            info.setValue(ErrorCategory);
        }
        if(index==1)
        {
            info.name = "ErrorNumber";
            info.namespace= "";
            info.setValue(ErrorNumber);
        }
        if(index==2)
        {
            info.name = "ErrorDescription";
            info.namespace= "";
            info.setValue(ErrorDescription);
        }
    }}