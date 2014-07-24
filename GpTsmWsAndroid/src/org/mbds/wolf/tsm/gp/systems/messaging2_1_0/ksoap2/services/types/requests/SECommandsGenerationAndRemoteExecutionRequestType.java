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
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.ExtendedSoapSerializationEnvelope;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.elements.CardCustomization;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.MobileNFCServiceContextType;

public class SECommandsGenerationAndRemoteExecutionRequestType extends BasicRequestType implements KvmSerializable
{
    
    public MobileNFCServiceContextType MobileNFCServiceContext;
    
    public CardCustomization CardCustomization;

    public SECommandsGenerationAndRemoteExecutionRequestType ()
    {
    }

    public SECommandsGenerationAndRemoteExecutionRequestType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    super(inObj, envelope);
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("MobileNFCServiceContext"))
        {	
	        java.lang.Object j = soapObject.getProperty("MobileNFCServiceContext");
	        this.MobileNFCServiceContext = (MobileNFCServiceContextType)envelope.get(j,MobileNFCServiceContextType.class);
        }
        if (soapObject.hasProperty("CardCustomization"))
        {	
	        java.lang.Object j = soapObject.getProperty("CardCustomization");
	        this.CardCustomization = (CardCustomization)envelope.get(j,CardCustomization.class);
        }


    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        int count = super.getPropertyCount();
        //!!!!! If you have a compilation error here then you are using org.mbds.wolf.tsm.gp.systems.messaging2_1_0 version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==count+0)
        {
            return MobileNFCServiceContext;
        }
        if(propertyIndex==count+1)
        {
            return CardCustomization;
        }
        return super.getProperty(propertyIndex);
    }


    @Override
    public int getPropertyCount() {
        return super.getPropertyCount()+2;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        int count = super.getPropertyCount();
        if(propertyIndex==count+0)
        {
            info.type = MobileNFCServiceContextType.class;
            info.name = "MobileNFCServiceContext";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==count+1)
        {
            info.type = CardCustomization.class;
            info.name = "CardCustomization";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        super.getPropertyInfo(propertyIndex,arg1,info);
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
