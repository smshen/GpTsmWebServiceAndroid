package org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.commands.data;

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
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.Enums;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.Enums.CommandExecutionStatusType;

public class CCMCommandStatusType extends AttributeContainer implements KvmSerializable
{
    
    public Enums.CommandExecutionStatusType CommandExecutionStatus=Enums.CommandExecutionStatusType.EXECUTED_SUCCESS;
    
    public String Receipt;
    
    public String ConfirmationData;

    public CCMCommandStatusType ()
    {
    }

    public CCMCommandStatusType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("CommandExecutionStatus"))
        {	
	        java.lang.Object obj = soapObject.getProperty("CommandExecutionStatus");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.CommandExecutionStatus = Enums.CommandExecutionStatusType.fromString(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof Enums.CommandExecutionStatusType){
                this.CommandExecutionStatus = (Enums.CommandExecutionStatusType)obj;
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
        if (soapObject.hasProperty("ConfirmationData"))
        {	
	        java.lang.Object obj = soapObject.getProperty("ConfirmationData");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.ConfirmationData = j.toString();
                }
	        }
	        else if (obj!= null){
                this.ConfirmationData = obj.toString();
            }    
        }


    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using org.mbds.wolf.tsm.gp.systems.messaging2_1_0 version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return CommandExecutionStatus!=null?CommandExecutionStatus.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return Receipt!=null?Receipt:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return ConfirmationData!=null?ConfirmationData:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 3;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "CommandExecutionStatus";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Receipt";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ConfirmationData";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
