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
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.ExtendedSoapSerializationEnvelope;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.SEIdentifierType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.ServiceIdentifierType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.ServiceQualifierType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.commands.CCMCommandType;

public class GenerateDMTokenRequestType extends BasicRequestType implements KvmSerializable
{
    
    public SEIdentifierType SecureElement;
    
    public ServiceIdentifierType Service;
    
    public ServiceQualifierType ServiceQualifier;
    
    public ArrayList< CCMCommandType>CCMCommand =new ArrayList<CCMCommandType>();

    public GenerateDMTokenRequestType ()
    {
    }

    public GenerateDMTokenRequestType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
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
        if (soapObject.hasProperty("CCMCommand"))
        {	
	        int size = soapObject.getPropertyCount();
	        this.CCMCommand = new ArrayList<CCMCommandType>();
	        for (int i0=0;i0< size;i0++)
	        {
	            PropertyInfo info=new PropertyInfo();
	            soapObject.getPropertyInfo(i0, info);
                java.lang.Object obj = info.getValue();
	            if (obj!=null && info.name.equals("CCMCommand"))
	            {
                    java.lang.Object j =info.getValue();
	                CCMCommandType j1= new CCMCommandType((AttributeContainer)j,envelope);
	                this.CCMCommand.add(j1);
	            }
	        }
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
            return Service;
        }
        if(propertyIndex==count+2)
        {
            return ServiceQualifier!=null?ServiceQualifier:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=count+3 && propertyIndex< count+ 3+this.CCMCommand.size())
        {
            return CCMCommand.get(propertyIndex-(count+3));
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+3+CCMCommand.size();
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
            info.type = ServiceIdentifierType.class;
            info.name = "Service";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+2)
        {
            info.type = ServiceQualifierType.class;
            info.name = "ServiceQualifier";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex>=count+3 && propertyIndex <= count+3+this.CCMCommand.size())
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "CCMCommand";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
