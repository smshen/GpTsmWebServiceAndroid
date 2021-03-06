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
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.ExtendedSoapSerializationEnvelope;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.Enums;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.Enums.ScriptFormatType;

import java.math.BigInteger;

public class BeginConversationResponseDataType extends AttributeContainer implements KvmSerializable
{
    
    public BigInteger ConversationID=BigInteger.ZERO;
    
    public BigInteger UsedBearer=BigInteger.ZERO;
    
    public String APDUScriptSize;
    
    public String NumberOfAPDUs;
    
    public Enums.ScriptFormatType ScriptFormat=Enums.ScriptFormatType.COMPACT;
    
    public String APDUResponseScriptSize;
    
    public String TimeToLive;

    public BeginConversationResponseDataType ()
    {
    }

    public BeginConversationResponseDataType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("ConversationID"))
        {	
	        java.lang.Object obj = soapObject.getProperty("ConversationID");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.ConversationID = new BigInteger(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof BigInteger){
                this.ConversationID = (BigInteger)obj;
            }    
        }
        if (soapObject.hasProperty("UsedBearer"))
        {	
	        java.lang.Object obj = soapObject.getProperty("UsedBearer");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.UsedBearer = new BigInteger(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof BigInteger){
                this.UsedBearer = (BigInteger)obj;
            }    
        }
        if (soapObject.hasProperty("APDUScriptSize"))
        {	
	        java.lang.Object obj = soapObject.getProperty("APDUScriptSize");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.APDUScriptSize = j.toString();
                }
	        }
	        else if (obj!= null){
                this.APDUScriptSize = obj.toString();
            }    
        }
        if (soapObject.hasProperty("NumberOfAPDUs"))
        {	
	        java.lang.Object obj = soapObject.getProperty("NumberOfAPDUs");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.NumberOfAPDUs = j.toString();
                }
	        }
	        else if (obj!= null){
                this.NumberOfAPDUs = obj.toString();
            }    
        }
        if (soapObject.hasProperty("ScriptFormat"))
        {	
	        java.lang.Object obj = soapObject.getProperty("ScriptFormat");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.ScriptFormat = Enums.ScriptFormatType.fromString(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof Enums.ScriptFormatType){
                this.ScriptFormat = (Enums.ScriptFormatType)obj;
            }    
        }
        if (soapObject.hasProperty("APDUResponseScriptSize"))
        {	
	        java.lang.Object obj = soapObject.getProperty("APDUResponseScriptSize");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.APDUResponseScriptSize = j.toString();
                }
	        }
	        else if (obj!= null){
                this.APDUResponseScriptSize = obj.toString();
            }    
        }
        if (soapObject.hasProperty("TimeToLive"))
        {	
	        java.lang.Object obj = soapObject.getProperty("TimeToLive");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.TimeToLive = j.toString();
                }
	        }
	        else if (obj!= null){
                this.TimeToLive = obj.toString();
            }    
        }


    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using org.mbds.wolf.tsm.gp.systems.messaging2_1_0 version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return ConversationID!=null?ConversationID.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return UsedBearer!=null?UsedBearer.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return APDUScriptSize;
        }
        if(propertyIndex==3)
        {
            return NumberOfAPDUs!=null?NumberOfAPDUs:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return ScriptFormat!=null?ScriptFormat.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return APDUResponseScriptSize!=null?APDUResponseScriptSize:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return TimeToLive!=null?TimeToLive:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 7;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ConversationID";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "UsedBearer";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "APDUScriptSize";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "NumberOfAPDUs";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ScriptFormat";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "APDUResponseScriptSize";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "TimeToLive";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
