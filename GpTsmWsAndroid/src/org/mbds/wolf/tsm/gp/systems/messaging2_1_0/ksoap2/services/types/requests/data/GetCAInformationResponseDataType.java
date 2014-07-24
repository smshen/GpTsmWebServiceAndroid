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
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.Enums;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.Enums.CCCMModeType;

public class GetCAInformationResponseDataType extends AttributeContainer implements KvmSerializable
{
    
    public ArrayList< Enums.CCCMModeType>SupportedCCCMMode =new ArrayList<Enums.CCCMModeType>();
    
    public String CACertificate;

    public GetCAInformationResponseDataType ()
    {
    }

    public GetCAInformationResponseDataType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("SupportedCCCMMode"))
        {	
	        int size = soapObject.getPropertyCount();
	        this.SupportedCCCMMode = new ArrayList<Enums.CCCMModeType>();
	        for (int i0=0;i0< size;i0++)
	        {
	            PropertyInfo info=new PropertyInfo();
	            soapObject.getPropertyInfo(i0, info);
                java.lang.Object obj = info.getValue();
	            if (obj!=null && info.name.equals("SupportedCCCMMode"))
	            {
                    java.lang.Object j =info.getValue();
	                Enums.CCCMModeType j1= Enums.CCCMModeType.fromString(j.toString());
	                this.SupportedCCCMMode.add(j1);
	            }
	        }
        }
        if (soapObject.hasProperty("CACertificate"))
        {	
	        java.lang.Object obj = soapObject.getProperty("CACertificate");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.CACertificate = j.toString();
                }
	        }
	        else if (obj!= null){
                this.CACertificate = obj.toString();
            }    
        }


    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using org.mbds.wolf.tsm.gp.systems.messaging2_1_0 version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return CACertificate!=null?CACertificate:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=+1 && propertyIndex< + 1+this.SupportedCCCMMode.size())
        {
            return SupportedCCCMMode.get(propertyIndex-(+1));
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 1+SupportedCCCMMode.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "CACertificate";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex>=+1 && propertyIndex <= +1+this.SupportedCCCMMode.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "SupportedCCCMMode";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
