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

public class X509DataType extends AttributeContainer implements KvmSerializable
{
    
    public X509IssuerSerialType X509IssuerSerial;
    
    public String X509SKI;
    
    public String X509SubjectName;
    
    public String X509Certificate;
    
    public String X509CRL;

    public X509DataType ()
    {
    }

    public X509DataType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("X509IssuerSerial"))
        {	
	        java.lang.Object j = soapObject.getProperty("X509IssuerSerial");
	        this.X509IssuerSerial = (X509IssuerSerialType)envelope.get(j,X509IssuerSerialType.class);
        }
        if (soapObject.hasProperty("X509SKI"))
        {	
	        java.lang.Object obj = soapObject.getProperty("X509SKI");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.X509SKI = j.toString();
                }
	        }
	        else if (obj!= null){
                this.X509SKI = obj.toString();
            }    
        }
        if (soapObject.hasProperty("X509SubjectName"))
        {	
	        java.lang.Object obj = soapObject.getProperty("X509SubjectName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.X509SubjectName = j.toString();
                }
	        }
	        else if (obj!= null){
                this.X509SubjectName = obj.toString();
            }    
        }
        if (soapObject.hasProperty("X509Certificate"))
        {	
	        java.lang.Object obj = soapObject.getProperty("X509Certificate");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.X509Certificate = j.toString();
                }
	        }
	        else if (obj!= null){
                this.X509Certificate = obj.toString();
            }    
        }
        if (soapObject.hasProperty("X509CRL"))
        {	
	        java.lang.Object obj = soapObject.getProperty("X509CRL");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.X509CRL = j.toString();
                }
	        }
	        else if (obj!= null){
                this.X509CRL = obj.toString();
            }    
        }


    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return X509IssuerSerial;
        }
        if(propertyIndex==1)
        {
            return X509SKI;
        }
        if(propertyIndex==2)
        {
            return X509SubjectName;
        }
        if(propertyIndex==3)
        {
            return X509Certificate;
        }
        if(propertyIndex==4)
        {
            return X509CRL;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 5;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = X509IssuerSerialType.class;
            info.name = "X509IssuerSerial";
            info.namespace= "http://www.w3.org/2000/09/xmldsig#";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "X509SKI";
            info.namespace= "http://www.w3.org/2000/09/xmldsig#";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "X509SubjectName";
            info.namespace= "http://www.w3.org/2000/09/xmldsig#";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "X509Certificate";
            info.namespace= "http://www.w3.org/2000/09/xmldsig#";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "X509CRL";
            info.namespace= "http://www.w3.org/2000/09/xmldsig#";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}