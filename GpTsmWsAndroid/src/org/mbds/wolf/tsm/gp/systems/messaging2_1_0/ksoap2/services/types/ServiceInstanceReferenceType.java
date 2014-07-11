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

public class ServiceInstanceReferenceType extends AttributeContainer implements KvmSerializable
{
    
    public String ReferenceOwner;
    
    public String Reference;
    
    public ArrayList< ExtensionsType>Extensions =new ArrayList<ExtensionsType>();

    public ServiceInstanceReferenceType ()
    {
    }

    public ServiceInstanceReferenceType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("ReferenceOwner"))
        {	
	        java.lang.Object obj = soapObject.getProperty("ReferenceOwner");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.ReferenceOwner = j.toString();
                }
	        }
	        else if (obj!= null && obj instanceof String){
                this.ReferenceOwner = (String)obj;
            }    
        }
        if (soapObject.hasProperty("Reference"))
        {	
	        java.lang.Object obj = soapObject.getProperty("Reference");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.Reference = j.toString();
                }
	        }
	        else if (obj!= null && obj instanceof String){
                this.Reference = (String)obj;
            }    
        }
        if (soapObject.hasProperty("Extensions"))
        {	
	        int size = soapObject.getPropertyCount();
	        this.Extensions = new ArrayList<ExtensionsType>();
	        for (int i0=0;i0< size;i0++)
	        {
	            PropertyInfo info=new PropertyInfo();
	            soapObject.getPropertyInfo(i0, info);
                java.lang.Object obj = info.getValue();
	            if (obj!=null && info.name.equals("Extensions"))
	            {
                    java.lang.Object j =info.getValue();
	                ExtensionsType j1= (ExtensionsType)envelope.get(j,ExtensionsType.class);
	                this.Extensions.add(j1);
	            }
	        }
        }


    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return ReferenceOwner;
        }
        if(propertyIndex==1)
        {
            return Reference;
        }
        if(propertyIndex>=+2 && propertyIndex< + 2+this.Extensions.size())
        {
            return Extensions.get(propertyIndex-(+2));
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 2+Extensions.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ReferenceOwner";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Reference";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex>=+2 && propertyIndex <= +2+this.Extensions.size())
        {
            info.type = ExtensionsType.class;
            info.name = "Extensions";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
