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
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.ExtendedSoapSerializationEnvelope;

public class MSId_GenericType extends MobileSubscriptionIdentifierType implements KvmSerializable
{
    
    public String Id;
    
    public String Type;

    public MSId_GenericType ()
    {
    }

    public MSId_GenericType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    super(inObj, envelope);
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("Id"))
        {	
	        java.lang.Object obj = soapObject.getProperty("Id");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.Id = j.toString();
                }
	        }
	        else if (obj!= null && obj instanceof String){
                this.Id = (String)obj;
            }    
        }


        if (inObj.hasAttribute("Type"))
        {	
            java.lang.Object j = inObj.getAttribute("Type");
            if (j != null)
            {
	            Type = j.toString();
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
            return Id;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+1;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "Id";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }


    @Override
    public int getAttributeCount() {
        return 1;
    }
    
    @Override
    public void getAttributeInfo(int index, AttributeInfo info) {
        int count=super.getAttributeCount();
        if(index==count+0)
        {
            info.name = "Type";
            info.namespace= "";
            info.setValue(Type);
        }
        if(index < count)
        {
            super.getAttributeInfo(index, info);
        }
    }}
