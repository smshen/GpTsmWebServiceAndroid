package org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests;

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
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.MobileSubscriptionIdentifierType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.SEIdentifierType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.ServiceIdentifierType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.ServiceQualifierType;

public class CheckGlobalEligibilityRequestType extends BasicRequestType implements KvmSerializable
{
    
    public MobileSubscriptionIdentifierType MobileSubscription;
    
    public SEIdentifierType SecureElement;
    
    public ServiceIdentifierType Service;
    
    public ServiceQualifierType ServiceQualifier;

    public CheckGlobalEligibilityRequestType ()
    {
    }

    public CheckGlobalEligibilityRequestType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    super(inObj, envelope);
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("MobileSubscription"))
        {	
	        java.lang.Object j = soapObject.getProperty("MobileSubscription");
	        this.MobileSubscription = (MobileSubscriptionIdentifierType)envelope.get(j,MobileSubscriptionIdentifierType.class);
        }
        if (soapObject.hasProperty("SecureElement"))
        {	
	        java.lang.Object j = soapObject.getProperty("SecureElement");
	        this.SecureElement = (SEIdentifierType)envelope.get(j,SEIdentifierType.class);
        }
        if (soapObject.hasProperty("Service"))
        {	
	        java.lang.Object j = soapObject.getProperty("Service");
	        this.Service = (ServiceIdentifierType)envelope.get(j,ServiceIdentifierType.class);
        }
        if (soapObject.hasProperty("ServiceQualifier"))
        {	
	        java.lang.Object j = soapObject.getProperty("ServiceQualifier");
	        this.ServiceQualifier = (ServiceQualifierType)envelope.get(j,ServiceQualifierType.class);
        }


    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        int count = super.getPropertyCount();
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==count+0)
        {
            return MobileSubscription!=null?MobileSubscription:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return SecureElement!=null?SecureElement:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return Service;
        }
        if(propertyIndex==count+3)
        {
            return ServiceQualifier!=null?ServiceQualifier:SoapPrimitive.NullSkip;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+4;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = MobileSubscriptionIdentifierType.class;
            info.name = "MobileSubscription";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+1)
        {
            info.type = SEIdentifierType.class;
            info.name = "SecureElement";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+2)
        {
            info.type = ServiceIdentifierType.class;
            info.name = "Service";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+3)
        {
            info.type = ServiceQualifierType.class;
            info.name = "ServiceQualifier";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
