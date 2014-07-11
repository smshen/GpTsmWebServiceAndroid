package org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.commands;

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

public class CCCMScenario1UsingPK_CreateFirstSSDKeysetCommandType extends CreateFirstSSDKeysetCommandType implements KvmSerializable
{
    
    public String SDIN;
    
    public String SSDOwnerCertificate;

    public CCCMScenario1UsingPK_CreateFirstSSDKeysetCommandType ()
    {
    }

    public CCCMScenario1UsingPK_CreateFirstSSDKeysetCommandType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    super(inObj, envelope);
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("SDIN"))
        {	
	        java.lang.Object obj = soapObject.getProperty("SDIN");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.SDIN = j.toString();
                }
	        }
	        else if (obj!= null && obj instanceof String){
                this.SDIN = (String)obj;
            }    
        }
        if (soapObject.hasProperty("SSDOwnerCertificate"))
        {	
	        java.lang.Object obj = soapObject.getProperty("SSDOwnerCertificate");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.SSDOwnerCertificate = j.toString();
                }
	        }
	        else if (obj!= null){
                this.SSDOwnerCertificate = obj.toString();
            }    
        }


    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        int count = super.getPropertyCount();
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==count+0)
        {
            return SDIN!=null?SDIN:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return SSDOwnerCertificate;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+2;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "SDIN";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "SSDOwnerCertificate";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
