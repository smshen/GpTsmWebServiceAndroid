package org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types;

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

public class KeySetType extends AttributeContainer implements KvmSerializable
{
    
    public ArrayList< SDKeyType>Key =new ArrayList<SDKeyType>();
    
    public String TransportKeyIndex;

    public KeySetType ()
    {
    }

    public KeySetType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("Key"))
        {	
	        int size = soapObject.getPropertyCount();
	        this.Key = new ArrayList<SDKeyType>();
	        for (int i0=0;i0< size;i0++)
	        {
	            PropertyInfo info=new PropertyInfo();
	            soapObject.getPropertyInfo(i0, info);
                java.lang.Object obj = info.getValue();
	            if (obj!=null && info.name.equals("Key"))
	            {
                    java.lang.Object j =info.getValue();
	                SDKeyType j1= (SDKeyType)envelope.get(j,SDKeyType.class);
	                this.Key.add(j1);
	            }
	        }
        }
        if (soapObject.hasProperty("TransportKeyIndex"))
        {	
	        java.lang.Object obj = soapObject.getProperty("TransportKeyIndex");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.TransportKeyIndex = j.toString();
                }
	        }
	        else if (obj!= null){
                this.TransportKeyIndex = obj.toString();
            }    
        }


    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return TransportKeyIndex;
        }
        if(propertyIndex>=+1 && propertyIndex< + 1+this.Key.size())
        {
            return Key.get(propertyIndex-(+1));
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 1+Key.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "TransportKeyIndex";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex>=+1 && propertyIndex <= +1+this.Key.size())
        {
            info.type = SDKeyType.class;
            info.name = "Key";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}