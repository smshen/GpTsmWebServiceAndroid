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
import java.math.BigInteger;
import java.util.ArrayList;
import org.ksoap2.serialization.PropertyInfo;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.ExtendedSoapSerializationEnvelope;

public class CheckGlobalEligibilityResponseDataType extends AttributeContainer implements KvmSerializable
{
    
    public Boolean Eligible=false;
    
    public ArrayList< BigInteger>NonEligibilityReason =new ArrayList<BigInteger>();

    public CheckGlobalEligibilityResponseDataType ()
    {
    }

    public CheckGlobalEligibilityResponseDataType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("Eligible"))
        {	
	        java.lang.Object obj = soapObject.getProperty("Eligible");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.Eligible = new Boolean(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof Boolean){
                this.Eligible = (Boolean)obj;
            }    
        }
        if (soapObject.hasProperty("NonEligibilityReason"))
        {	
	        int size = soapObject.getPropertyCount();
	        this.NonEligibilityReason = new ArrayList<BigInteger>();
	        for (int i0=0;i0< size;i0++)
	        {
	            PropertyInfo info=new PropertyInfo();
	            soapObject.getPropertyInfo(i0, info);
                java.lang.Object obj = info.getValue();
	            if (obj!=null && info.name.equals("NonEligibilityReason"))
	            {
                    java.lang.Object j =info.getValue();
	                BigInteger j1= new BigInteger(j.toString());
	                this.NonEligibilityReason.add(j1);
	            }
	        }
        }


    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using org.mbds.wolf.tsm.gp.systems.messaging2_1_0 version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return Eligible;
        }
        if(propertyIndex>=+1 && propertyIndex< + 1+this.NonEligibilityReason.size())
        {
            return NonEligibilityReason.get(propertyIndex-(+1));
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 1+NonEligibilityReason.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "Eligible";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex>=+1 && propertyIndex <= +1+this.NonEligibilityReason.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "NonEligibilityReason";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}
