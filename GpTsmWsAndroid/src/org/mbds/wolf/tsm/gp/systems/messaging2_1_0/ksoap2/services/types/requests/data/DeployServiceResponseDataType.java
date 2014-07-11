package org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.requests.data;

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
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.commands.results.ServiceCommandResultType;

import java.math.BigInteger;

public class DeployServiceResponseDataType extends AttributeContainer implements KvmSerializable
{
    
    public ArrayList< ServiceCommandResultType>ServiceCommandResult =new ArrayList<ServiceCommandResultType>();
    
    public BigInteger ServiceInstanceState=BigInteger.ZERO;

    public DeployServiceResponseDataType ()
    {
    }

    public DeployServiceResponseDataType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("ServiceCommandResult"))
        {	
	        int size = soapObject.getPropertyCount();
	        this.ServiceCommandResult = new ArrayList<ServiceCommandResultType>();
	        for (int i0=0;i0< size;i0++)
	        {
	            PropertyInfo info=new PropertyInfo();
	            soapObject.getPropertyInfo(i0, info);
                java.lang.Object obj = info.getValue();
	            if (obj!=null && info.name.equals("ServiceCommandResult"))
	            {
                    java.lang.Object j =info.getValue();
	                ServiceCommandResultType j1= (ServiceCommandResultType)envelope.get(j,ServiceCommandResultType.class);
	                this.ServiceCommandResult.add(j1);
	            }
	        }
        }
        if (soapObject.hasProperty("ServiceInstanceState"))
        {	
	        java.lang.Object obj = soapObject.getProperty("ServiceInstanceState");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.ServiceInstanceState = new BigInteger(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof BigInteger){
                this.ServiceInstanceState = (BigInteger)obj;
            }    
        }


    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return ServiceInstanceState!=null?ServiceInstanceState.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=+1 && propertyIndex< + 1+this.ServiceCommandResult.size())
        {
            return ServiceCommandResult.get(propertyIndex-(+1));
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 1+ServiceCommandResult.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ServiceInstanceState";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex>=+1 && propertyIndex <= +1+this.ServiceCommandResult.size())
        {
            info.type = ServiceCommandResultType.class;
            info.name = "ServiceCommandResult";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
