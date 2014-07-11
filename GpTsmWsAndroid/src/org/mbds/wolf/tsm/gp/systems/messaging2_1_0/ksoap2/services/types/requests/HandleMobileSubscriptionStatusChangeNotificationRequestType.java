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
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.Helper;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.Enums;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.MobileSubscriptionIdentifierType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.Enums.MobileSubscriptionStatusType;

import java.math.BigInteger;

public class HandleMobileSubscriptionStatusChangeNotificationRequestType extends BasicRequestType implements KvmSerializable
{
    
    public MobileSubscriptionIdentifierType MobileSubscription;
    
    public java.util.Date Date;
    
    public Enums.MobileSubscriptionStatusType NewStatus=Enums.MobileSubscriptionStatusType.SUSPENDED;
    
    public BigInteger Reason;

    public HandleMobileSubscriptionStatusChangeNotificationRequestType ()
    {
    }

    public HandleMobileSubscriptionStatusChangeNotificationRequestType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
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
        if (soapObject.hasProperty("Date"))
        {	
	        java.lang.Object obj = soapObject.getProperty("Date");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.Date = Helper.ConvertFromWebService(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof java.util.Date){
                this.Date = (java.util.Date)obj;
            }    
        }
        if (soapObject.hasProperty("NewStatus"))
        {	
	        java.lang.Object obj = soapObject.getProperty("NewStatus");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.NewStatus = Enums.MobileSubscriptionStatusType.fromString(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof Enums.MobileSubscriptionStatusType){
                this.NewStatus = (Enums.MobileSubscriptionStatusType)obj;
            }    
        }
        if (soapObject.hasProperty("Reason"))
        {	
	        java.lang.Object obj = soapObject.getProperty("Reason");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.Reason = new BigInteger(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof BigInteger){
                this.Reason = (BigInteger)obj;
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
            return MobileSubscription;
        }
        if(propertyIndex==count+1)
        {
            return Date!=null?Date:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return NewStatus!=null?NewStatus.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return Reason!=null?Reason.toString():SoapPrimitive.NullSkip;
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
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Date";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "NewStatus";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Reason";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
