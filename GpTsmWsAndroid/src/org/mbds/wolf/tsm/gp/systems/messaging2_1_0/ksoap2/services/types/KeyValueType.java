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

public class KeyValueType extends AttributeContainer implements KvmSerializable
{
    
    public DSAKeyValueType DSAKeyValue;
    
    public RSAKeyValueType RSAKeyValue;

    public KeyValueType ()
    {
    }

    public KeyValueType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("DSAKeyValue"))
        {	
	        java.lang.Object j = soapObject.getProperty("DSAKeyValue");
	        this.DSAKeyValue = (DSAKeyValueType)envelope.get(j,DSAKeyValueType.class);
        }
        if (soapObject.hasProperty("RSAKeyValue"))
        {	
	        java.lang.Object j = soapObject.getProperty("RSAKeyValue");
	        this.RSAKeyValue = (RSAKeyValueType)envelope.get(j,RSAKeyValueType.class);
        }


    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using org.mbds.wolf.tsm.gp.systems.messaging2_1_0 version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return DSAKeyValue;
        }
        if(propertyIndex==1)
        {
            return RSAKeyValue;
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
            info.type = DSAKeyValueType.class;
            info.name = "DSAKeyValue";
            info.namespace= "http://www.w3.org/2000/09/xmldsig#";
        }
        if(propertyIndex==1)
        {
            info.type = RSAKeyValueType.class;
            info.name = "RSAKeyValue";
            info.namespace= "http://www.w3.org/2000/09/xmldsig#";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
