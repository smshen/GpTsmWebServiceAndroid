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
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.ExecutionStatusType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.MobileSubscriptionIdentifierType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.SEIdentifierType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.ServiceIdentifierType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.ServiceInstanceReferenceType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.ServiceQualifierType;

import java.math.BigInteger;

public class HandleEndServiceStateChangeNotificationRequestType extends BasicRequestType implements KvmSerializable
{
    
    public ServiceInstanceReferenceType CurrentServiceInstanceReference;
    
    public ServiceInstanceReferenceType NewServiceInstanceReference;
    
    public MobileSubscriptionIdentifierType MobileSubscription;
    
    public SEIdentifierType SecureElement;
    
    public ServiceIdentifierType CurrentService;
    
    public ServiceQualifierType CurrentServiceQualifier;
    
    public ServiceIdentifierType NewService;
    
    public ServiceQualifierType NewServiceQualifier;
    
    public BigInteger Operation=BigInteger.ZERO;
    
    public ExecutionStatusType OperationStatus;

    public HandleEndServiceStateChangeNotificationRequestType ()
    {
    }

    public HandleEndServiceStateChangeNotificationRequestType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    super(inObj, envelope);
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("CurrentServiceInstanceReference"))
        {	
	        java.lang.Object j = soapObject.getProperty("CurrentServiceInstanceReference");
	        this.CurrentServiceInstanceReference = (ServiceInstanceReferenceType)envelope.get(j,ServiceInstanceReferenceType.class);
        }
        if (soapObject.hasProperty("NewServiceInstanceReference"))
        {	
	        java.lang.Object j = soapObject.getProperty("NewServiceInstanceReference");
	        this.NewServiceInstanceReference = (ServiceInstanceReferenceType)envelope.get(j,ServiceInstanceReferenceType.class);
        }
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
        if (soapObject.hasProperty("CurrentService"))
        {	
	        java.lang.Object j = soapObject.getProperty("CurrentService");
	        this.CurrentService = (ServiceIdentifierType)envelope.get(j,ServiceIdentifierType.class);
        }
        if (soapObject.hasProperty("CurrentServiceQualifier"))
        {	
	        java.lang.Object j = soapObject.getProperty("CurrentServiceQualifier");
	        this.CurrentServiceQualifier = (ServiceQualifierType)envelope.get(j,ServiceQualifierType.class);
        }
        if (soapObject.hasProperty("NewService"))
        {	
	        java.lang.Object j = soapObject.getProperty("NewService");
	        this.NewService = (ServiceIdentifierType)envelope.get(j,ServiceIdentifierType.class);
        }
        if (soapObject.hasProperty("NewServiceQualifier"))
        {	
	        java.lang.Object j = soapObject.getProperty("NewServiceQualifier");
	        this.NewServiceQualifier = (ServiceQualifierType)envelope.get(j,ServiceQualifierType.class);
        }
        if (soapObject.hasProperty("Operation"))
        {	
	        java.lang.Object obj = soapObject.getProperty("Operation");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.Operation = new BigInteger(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof BigInteger){
                this.Operation = (BigInteger)obj;
            }    
        }
        if (soapObject.hasProperty("OperationStatus"))
        {	
	        java.lang.Object j = soapObject.getProperty("OperationStatus");
	        this.OperationStatus = (ExecutionStatusType)envelope.get(j,ExecutionStatusType.class);
        }


    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        int count = super.getPropertyCount();
        //!!!!! If you have a compilation error here then you are using org.mbds.wolf.tsm.gp.systems.messaging2_1_0 version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==count+0)
        {
            return CurrentServiceInstanceReference!=null?CurrentServiceInstanceReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+1)
        {
            return NewServiceInstanceReference!=null?NewServiceInstanceReference:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+2)
        {
            return MobileSubscription!=null?MobileSubscription:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+3)
        {
            return SecureElement!=null?SecureElement:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+4)
        {
            return CurrentService!=null?CurrentService:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+5)
        {
            return CurrentServiceQualifier!=null?CurrentServiceQualifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+6)
        {
            return NewService!=null?NewService:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+7)
        {
            return NewServiceQualifier!=null?NewServiceQualifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+8)
        {
            return Operation!=null?Operation.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==count+9)
        {
            return OperationStatus;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+10;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = ServiceInstanceReferenceType.class;
            info.name = "CurrentServiceInstanceReference";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+1)
        {
            info.type = ServiceInstanceReferenceType.class;
            info.name = "NewServiceInstanceReference";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+2)
        {
            info.type = MobileSubscriptionIdentifierType.class;
            info.name = "MobileSubscription";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+3)
        {
            info.type = SEIdentifierType.class;
            info.name = "SecureElement";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+4)
        {
            info.type = ServiceIdentifierType.class;
            info.name = "CurrentService";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+5)
        {
            info.type = ServiceQualifierType.class;
            info.name = "CurrentServiceQualifier";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+6)
        {
            info.type = ServiceIdentifierType.class;
            info.name = "NewService";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+7)
        {
            info.type = ServiceQualifierType.class;
            info.name = "NewServiceQualifier";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+8)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Operation";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+9)
        {
            info.type = ExecutionStatusType.class;
            info.name = "OperationStatus";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
