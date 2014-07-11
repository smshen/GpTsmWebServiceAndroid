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

public class CCCMScenario3_CreateFirstSSDKeysetCommandResponseType extends CreateFirstSSDKeysetCommandResponseType implements KvmSerializable
{
    
    public String StoredData;
    
    public String DerivationRandom;
    
    public String Receipt;

    public CCCMScenario3_CreateFirstSSDKeysetCommandResponseType ()
    {
    }

    public CCCMScenario3_CreateFirstSSDKeysetCommandResponseType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    super(inObj, envelope);
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("StoredData"))
        {	
	        java.lang.Object obj = soapObject.getProperty("StoredData");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.StoredData = j.toString();
                }
	        }
	        else if (obj!= null){
                this.StoredData = obj.toString();
            }    
        }
        if (soapObject.hasProperty("DerivationRandom"))
        {	
	        java.lang.Object obj = soapObject.getProperty("DerivationRandom");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.DerivationRandom = j.toString();
                }
	        }
	        else if (obj!= null){
                this.DerivationRandom = obj.toString();
            }    
        }
        if (soapObject.hasProperty("Receipt"))
        {	
	        java.lang.Object obj = soapObject.getProperty("Receipt");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.Receipt = j.toString();
                }
	        }
	        else if (obj!= null){
                this.Receipt = obj.toString();
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
            return StoredData;
        }
        if(propertyIndex==count+1)
        {
            return DerivationRandom!=null?DerivationRandom:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return Receipt;
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
            info.name = "StoredData";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "DerivationRandom";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Receipt";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
