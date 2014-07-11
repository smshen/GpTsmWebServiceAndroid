package org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.commands.responses;

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

public class InstantiateApplicationCommandResponseType extends SECommandResponseType implements KvmSerializable
{
    
    public String ApplicationAID;
    
    public String ApplicationTAR;
    
    public String ParentAID;

    public InstantiateApplicationCommandResponseType ()
    {
    }

    public InstantiateApplicationCommandResponseType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    super(inObj, envelope);
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("ApplicationAID"))
        {	
	        java.lang.Object obj = soapObject.getProperty("ApplicationAID");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.ApplicationAID = j.toString();
                }
	        }
	        else if (obj!= null && obj instanceof String){
                this.ApplicationAID = (String)obj;
            }    
        }
        if (soapObject.hasProperty("ApplicationTAR"))
        {	
	        java.lang.Object obj = soapObject.getProperty("ApplicationTAR");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.ApplicationTAR = j.toString();
                }
	        }
	        else if (obj!= null && obj instanceof String){
                this.ApplicationTAR = (String)obj;
            }    
        }
        if (soapObject.hasProperty("ParentAID"))
        {	
	        java.lang.Object obj = soapObject.getProperty("ParentAID");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.ParentAID = j.toString();
                }
	        }
	        else if (obj!= null && obj instanceof String){
                this.ParentAID = (String)obj;
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
            return ApplicationAID!=null?ApplicationAID:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return ApplicationTAR!=null?ApplicationTAR:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return ParentAID!=null?ParentAID:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+3;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ApplicationAID";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ApplicationTAR";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ParentAID";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}