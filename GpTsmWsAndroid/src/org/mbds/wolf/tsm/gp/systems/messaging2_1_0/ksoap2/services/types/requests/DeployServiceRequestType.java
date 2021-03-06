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
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.ServiceInstanceReferenceType;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.commands.ServiceCommandType;

public class DeployServiceRequestType extends BasicRequestType implements KvmSerializable
{
    
    public ServiceInstanceReferenceType ServiceInstanceReference;
    
    public ArrayList< ServiceCommandType>ServiceCommand =new ArrayList<ServiceCommandType>();
    
    public Boolean DeviceOnly;

    public DeployServiceRequestType ()
    {
    }

    public DeployServiceRequestType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    super(inObj, envelope);
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("ServiceInstanceReference"))
        {	
	        java.lang.Object j = soapObject.getProperty("ServiceInstanceReference");
	        this.ServiceInstanceReference = (ServiceInstanceReferenceType)envelope.get(j,ServiceInstanceReferenceType.class);
        }
        if (soapObject.hasProperty("ServiceCommand"))
        {	
	        int size = soapObject.getPropertyCount();
	        this.ServiceCommand = new ArrayList<ServiceCommandType>();
	        for (int i0=0;i0< size;i0++)
	        {
	            PropertyInfo info=new PropertyInfo();
	            soapObject.getPropertyInfo(i0, info);
                java.lang.Object obj = info.getValue();
	            if (obj!=null && info.name.equals("ServiceCommand"))
	            {
                    java.lang.Object j =info.getValue();
	                ServiceCommandType j1= (ServiceCommandType)envelope.get(j,ServiceCommandType.class);
	                this.ServiceCommand.add(j1);
	            }
	        }
        }
        if (soapObject.hasProperty("DeviceOnly"))
        {	
	        java.lang.Object obj = soapObject.getProperty("DeviceOnly");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.DeviceOnly = new Boolean(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof Boolean){
                this.DeviceOnly = (Boolean)obj;
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
            return ServiceInstanceReference;
        }
        if(propertyIndex==count+1)
        {
            return DeviceOnly!=null?DeviceOnly:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=count+2 && propertyIndex< count+ 2+this.ServiceCommand.size())
        {
            return ServiceCommand.get(propertyIndex-(count+2));
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+2+ServiceCommand.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = ServiceInstanceReferenceType.class;
            info.name = "ServiceInstanceReference";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+1)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "DeviceOnly";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex>=count+2 && propertyIndex <= count+2+this.ServiceCommand.size())
        {
            info.type = ServiceCommandType.class;
            info.name = "ServiceCommand";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
