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
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.SignatureType;

public class ApplicationData extends AttributeContainer implements KvmSerializable
{
    
    public AID AID;
    
    public String ApplicationProfileUniqueID;
    
    public ArrayList< ProcessingStep>ProcessingStep =new ArrayList<ProcessingStep>();
    
    public LogData LogData=new LogData();
    
    public ICCData ICCData=new ICCData();
    
    public SignatureType Signature;

    public ApplicationData ()
    {
    }

    public ApplicationData (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("AID"))
        {	
	        java.lang.Object j = soapObject.getProperty("AID");
	        this.AID = (AID)envelope.get(j,AID.class);
        }
        if (soapObject.hasProperty("ApplicationProfileUniqueID"))
        {	
	        java.lang.Object obj = soapObject.getProperty("ApplicationProfileUniqueID");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.ApplicationProfileUniqueID = j.toString();
                }
	        }
	        else if (obj!= null){
                this.ApplicationProfileUniqueID = obj.toString();
            }    
        }
        if (soapObject.hasProperty("ProcessingStep"))
        {	
	        int size = soapObject.getPropertyCount();
	        this.ProcessingStep = new ArrayList<ProcessingStep>();
	        for (int i0=0;i0< size;i0++)
	        {
	            PropertyInfo info=new PropertyInfo();
	            soapObject.getPropertyInfo(i0, info);
                java.lang.Object obj = info.getValue();
	            if (obj!=null && info.name.equals("ProcessingStep"))
	            {
                    java.lang.Object j =info.getValue();
	                ProcessingStep j1= (ProcessingStep)envelope.get(j,ProcessingStep.class);
	                this.ProcessingStep.add(j1);
	            }
	        }
        }
        if (soapObject.hasProperty("LogData"))
        {	
	        java.lang.Object j = soapObject.getProperty("LogData");
	        this.LogData = new LogData((AttributeContainer)j,envelope);
        }
        if (soapObject.hasProperty("ICCData"))
        {	
	        java.lang.Object j = soapObject.getProperty("ICCData");
	        this.ICCData = new ICCData((AttributeContainer)j,envelope);
        }
        if (soapObject.hasProperty("Signature"))
        {	
	        java.lang.Object j = soapObject.getProperty("Signature");
	        this.Signature = (SignatureType)envelope.get(j,SignatureType.class);
        }


    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using org.mbds.wolf.tsm.gp.systems.messaging2_1_0 version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return AID;
        }
        if(propertyIndex==1)
        {
            return ApplicationProfileUniqueID;
        }
        if(propertyIndex==2)
        {
            return LogData;
        }
        if(propertyIndex==3)
        {
            return ICCData;
        }
        if(propertyIndex==4)
        {
            return Signature;
        }
        if(propertyIndex>=+5 && propertyIndex< + 5+this.ProcessingStep.size())
        {
            return ProcessingStep.get(propertyIndex-(+5));
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 5+ProcessingStep.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = AID.class;
            info.name = "AID";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ApplicationProfileUniqueID";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "LogData";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "ICCData";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==4)
        {
            info.type = SignatureType.class;
            info.name = "Signature";
            info.namespace= "http://www.w3.org/2000/09/xmldsig#";
        }
        if(propertyIndex>=+5 && propertyIndex <= +5+this.ProcessingStep.size())
        {
            info.type = ProcessingStep.class;
            info.name = "ProcessingStep";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
