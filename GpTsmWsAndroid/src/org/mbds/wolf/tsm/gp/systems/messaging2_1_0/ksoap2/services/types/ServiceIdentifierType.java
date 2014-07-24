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

import java.math.BigInteger;

public class ServiceIdentifierType extends AttributeContainer implements KvmSerializable
{
    
    public BigInteger ServiceId=BigInteger.ZERO;
    
    public ServiceVersionType ServiceVersion;

    public ServiceIdentifierType ()
    {
    }

    public ServiceIdentifierType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("ServiceId"))
        {	
	        java.lang.Object obj = soapObject.getProperty("ServiceId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.ServiceId = new BigInteger(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof BigInteger){
                this.ServiceId = (BigInteger)obj;
            }    
        }
        if (soapObject.hasProperty("ServiceVersion"))
        {	
	        java.lang.Object j = soapObject.getProperty("ServiceVersion");
	        this.ServiceVersion = (ServiceVersionType)envelope.get(j,ServiceVersionType.class);
        }


    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using org.mbds.wolf.tsm.gp.systems.messaging2_1_0 version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return ServiceId!=null?ServiceId.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return ServiceVersion!=null?ServiceVersion:SoapPrimitive.NullSkip;
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
            info.name = "ServiceId";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==1)
        {
            info.type = ServiceVersionType.class;
            info.name = "ServiceVersion";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
