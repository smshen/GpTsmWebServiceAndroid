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

public class SignedInfoType extends AttributeContainer implements KvmSerializable
{
    
    public CanonicalizationMethodType CanonicalizationMethod;
    
    public SignatureMethodType SignatureMethod;
    
    public ArrayList< ReferenceType>Reference =new ArrayList<ReferenceType>();
    
    public String Id;

    public SignedInfoType ()
    {
    }

    public SignedInfoType (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("CanonicalizationMethod"))
        {	
	        java.lang.Object j = soapObject.getProperty("CanonicalizationMethod");
	        this.CanonicalizationMethod = (CanonicalizationMethodType)envelope.get(j,CanonicalizationMethodType.class);
        }
        if (soapObject.hasProperty("SignatureMethod"))
        {	
	        java.lang.Object j = soapObject.getProperty("SignatureMethod");
	        this.SignatureMethod = (SignatureMethodType)envelope.get(j,SignatureMethodType.class);
        }
        if (soapObject.hasProperty("Reference"))
        {	
	        int size = soapObject.getPropertyCount();
	        this.Reference = new ArrayList<ReferenceType>();
	        for (int i0=0;i0< size;i0++)
	        {
	            PropertyInfo info=new PropertyInfo();
	            soapObject.getPropertyInfo(i0, info);
                java.lang.Object obj = info.getValue();
	            if (obj!=null && info.name.equals("Reference"))
	            {
                    java.lang.Object j =info.getValue();
	                ReferenceType j1= (ReferenceType)envelope.get(j,ReferenceType.class);
	                this.Reference.add(j1);
	            }
	        }
        }


        if (inObj.hasAttribute("Id"))
        {	
            java.lang.Object j = inObj.getAttribute("Id");
            if (j != null)
            {
	            Id = j.toString();
            }
        }

    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return CanonicalizationMethod;
        }
        if(propertyIndex==1)
        {
            return SignatureMethod;
        }
        if(propertyIndex>=+2 && propertyIndex< + 2+this.Reference.size())
        {
            return Reference.get(propertyIndex-(+2));
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 2+Reference.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = CanonicalizationMethodType.class;
            info.name = "CanonicalizationMethod";
            info.namespace= "http://www.w3.org/2000/09/xmldsig#";
        }
        if(propertyIndex==1)
        {
            info.type = SignatureMethodType.class;
            info.name = "SignatureMethod";
            info.namespace= "http://www.w3.org/2000/09/xmldsig#";
        }
        if(propertyIndex>=+2 && propertyIndex <= +2+this.Reference.size())
        {
            info.type = ReferenceType.class;
            info.name = "Reference";
            info.namespace= "http://www.w3.org/2000/09/xmldsig#";
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
            info.name = "Id";
            info.namespace= "";
            info.setValue(Id);
        }
    }}