package org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.elements;

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

public class LogIdentifierCode extends AttributeContainer implements KvmSerializable
{
    
    public CardConfigurationLog CardConfigurationLog;
    
    public ArrayList< ApplicationLog>ApplicationLog =new ArrayList<ApplicationLog>();
    
    public String Identifier;

    public LogIdentifierCode ()
    {
    }

    public LogIdentifierCode (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("CardConfigurationLog"))
        {	
	        java.lang.Object j = soapObject.getProperty("CardConfigurationLog");
	        this.CardConfigurationLog = (CardConfigurationLog)envelope.get(j,CardConfigurationLog.class);
        }
        if (soapObject.hasProperty("ApplicationLog"))
        {	
	        int size = soapObject.getPropertyCount();
	        this.ApplicationLog = new ArrayList<ApplicationLog>();
	        for (int i0=0;i0< size;i0++)
	        {
	            PropertyInfo info=new PropertyInfo();
	            soapObject.getPropertyInfo(i0, info);
                java.lang.Object obj = info.getValue();
	            if (obj!=null && info.name.equals("ApplicationLog"))
	            {
                    java.lang.Object j =info.getValue();
	                ApplicationLog j1= (ApplicationLog)envelope.get(j,ApplicationLog.class);
	                this.ApplicationLog.add(j1);
	            }
	        }
        }


        if (inObj.hasAttribute("Identifier"))
        {	
            java.lang.Object j = inObj.getAttribute("Identifier");
            if (j != null)
            {
	            Identifier = j.toString();
            }
        }

    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using org.mbds.wolf.tsm.gp.systems.messaging2_1_0 version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return CardConfigurationLog;
        }
        if(propertyIndex>=+1 && propertyIndex< + 1+this.ApplicationLog.size())
        {
            return ApplicationLog.get(propertyIndex-(+1));
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 1+ApplicationLog.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = CardConfigurationLog.class;
            info.name = "CardConfigurationLog";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex>=+1 && propertyIndex <= +1+this.ApplicationLog.size())
        {
            info.type = ApplicationLog.class;
            info.name = "ApplicationLog";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
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
        if(index==0)
        {
            info.name = "Identifier";
            info.namespace= "";
            info.setValue(Identifier);
        }
    }}
