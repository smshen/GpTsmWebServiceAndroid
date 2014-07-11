package org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types;

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

public class X509IssuerSerialType extends AttributeContainer implements KvmSerializable
{
    
    public String X509IssuerName;
    
    public String X509SerialNumber;

    public X509IssuerSerialType ()
    {
    }

    public X509IssuerSerialType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("X509IssuerName"))
        {	
	        java.lang.Object obj = soapObject.getProperty("X509IssuerName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.X509IssuerName = j.toString();
                }
	        }
	        else if (obj!= null){
                this.X509IssuerName = obj.toString();
            }    
        }
        if (soapObject.hasProperty("X509SerialNumber"))
        {	
	        java.lang.Object obj = soapObject.getProperty("X509SerialNumber");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.X509SerialNumber = j.toString();
                }
	        }
	        else if (obj!= null){
                this.X509SerialNumber = obj.toString();
            }    
        }


    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return X509IssuerName;
        }
        if(propertyIndex==1)
        {
            return X509SerialNumber;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 2;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "X509IssuerName";
            info.namespace= "http://www.w3.org/2000/09/xmldsig#";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "X509SerialNumber";
            info.namespace= "http://www.w3.org/2000/09/xmldsig#";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
