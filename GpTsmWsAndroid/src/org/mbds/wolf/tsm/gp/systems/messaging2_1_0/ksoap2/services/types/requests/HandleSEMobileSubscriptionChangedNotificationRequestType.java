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

public class HandleSEMobileSubscriptionChangedNotificationRequestType extends BasicRequestType implements KvmSerializable
{
    
    public SEIdentifierType SecureElement;
    
    public MobileSubscriptionIdentifierType OldMobileSubscription;
    
    public MobileSubscriptionIdentifierType NewMobileSubscription;

    public HandleSEMobileSubscriptionChangedNotificationRequestType ()
    {
    }

    public HandleSEMobileSubscriptionChangedNotificationRequestType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    super(inObj, envelope);
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("SecureElement"))
        {	
	        java.lang.Object j = soapObject.getProperty("SecureElement");
	        this.SecureElement = (SEIdentifierType)envelope.get(j,SEIdentifierType.class);
        }
        if (soapObject.hasProperty("OldMobileSubscription"))
        {	
	        java.lang.Object j = soapObject.getProperty("OldMobileSubscription");
	        this.OldMobileSubscription = (MobileSubscriptionIdentifierType)envelope.get(j,MobileSubscriptionIdentifierType.class);
        }
        if (soapObject.hasProperty("NewMobileSubscription"))
        {	
	        java.lang.Object j = soapObject.getProperty("NewMobileSubscription");
	        this.NewMobileSubscription = (MobileSubscriptionIdentifierType)envelope.get(j,MobileSubscriptionIdentifierType.class);
        }


    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        int count = super.getPropertyCount();
        //!!!!! If you have a compilation error here then you are using org.mbds.wolf.tsm.gp.systems.messaging2_1_0 version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==count+0)
        {
            return SecureElement;
        }
        if(propertyIndex==count+1)
        {
            return OldMobileSubscription;
        }
        if(propertyIndex==count+2)
        {
            return NewMobileSubscription;
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
            info.type = SEIdentifierType.class;
            info.name = "SecureElement";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+1)
        {
            info.type = MobileSubscriptionIdentifierType.class;
            info.name = "OldMobileSubscription";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+2)
        {
            info.type = MobileSubscriptionIdentifierType.class;
            info.name = "NewMobileSubscription";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
