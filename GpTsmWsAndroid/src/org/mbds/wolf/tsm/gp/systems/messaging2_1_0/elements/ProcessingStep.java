package org.mbds.wolf.tsm.gp.systems.messaging2_1_0.elements;

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
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types.commands.SECommandType;

public class ProcessingStep extends AttributeContainer implements KvmSerializable
{
    
    public PersoDeviceIns PersoDeviceIns=new PersoDeviceIns();
    
    public ArrayList< String>ScriptFragment =new ArrayList<String>();
    
    public SECommandType SECommand;
    
    public String Action;
    
    public String Requirement;
    
    public String DataSet;

    public ProcessingStep ()
    {
    }

    public ProcessingStep (AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (inObj == null)
            return;



        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("PersoDeviceIns"))
        {	
	        java.lang.Object j = soapObject.getProperty("PersoDeviceIns");
	        this.PersoDeviceIns = new PersoDeviceIns((AttributeContainer)j,envelope);
        }
        if (soapObject.hasProperty("ScriptFragment"))
        {	
	        int size = soapObject.getPropertyCount();
	        this.ScriptFragment = new ArrayList<String>();
	        for (int i0=0;i0< size;i0++)
	        {
	            PropertyInfo info=new PropertyInfo();
	            soapObject.getPropertyInfo(i0, info);
                java.lang.Object obj = info.getValue();
	            if (obj!=null && info.name.equals("ScriptFragment"))
	            {
                    java.lang.Object j =info.getValue();
	                String j1= j.toString();
	                this.ScriptFragment.add(j1);
	            }
	        }
        }
        if (soapObject.hasProperty("SECommand"))
        {	
	        java.lang.Object j = soapObject.getProperty("SECommand");
	        this.SECommand = (SECommandType)envelope.get(j,SECommandType.class);
        }


        if (inObj.hasAttribute("Action"))
        {	
            java.lang.Object j = inObj.getAttribute("Action");
            if (j != null)
            {
	            Action = j.toString();
            }
        }

        if (inObj.hasAttribute("Requirement"))
        {	
            java.lang.Object j = inObj.getAttribute("Requirement");
            if (j != null)
            {
	            Requirement = j.toString();
            }
        }

        if (inObj.hasAttribute("DataSet"))
        {	
            java.lang.Object j = inObj.getAttribute("DataSet");
            if (j != null)
            {
	            DataSet = j.toString();
            }
        }

    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return PersoDeviceIns;
        }
        if(propertyIndex==1)
        {
            return SECommand!=null?SECommand:SoapPrimitive.NullSkip;
        }
        if(propertyIndex>=+2 && propertyIndex< + 2+this.ScriptFragment.size())
        {
            return ScriptFragment.get(propertyIndex-(+2));
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 2+ScriptFragment.size();
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "PersoDeviceIns";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex==1)
        {
            info.type = SECommandType.class;
            info.name = "SECommand";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
        if(propertyIndex>=+2 && propertyIndex <= +2+this.ScriptFragment.size())
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ScriptFragment";
            info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }


    @Override
    public int getAttributeCount() {
        return 3;
    }
    
    @Override
    public void getAttributeInfo(int index, AttributeInfo info) {
        if(index==0)
        {
            info.name = "Action";
            info.namespace= "";
            info.setValue(Action);
        }
        if(index==1)
        {
            info.name = "Requirement";
            info.namespace= "";
            info.setValue(Requirement);
        }
        if(index==2)
        {
            info.name = "DataSet";
            info.namespace= "";
            info.setValue(DataSet);
        }
    }}
