package org.mbds.wolf.tsm.gp.systems.messaging2_1_0.elements;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 3.0.3.5
//
// Created by amlesas Development at 08-07-2014
//
//---------------------------------------------------



import org.ksoap2.serialization.*;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.ExtendedSoapSerializationEnvelope;

import java.util.Vector;
import java.util.Hashtable;


public class LogData extends Vector< DataSet> implements KvmSerializable
{
    
    public LogData(){}
    
    public LogData(AttributeContainer inObj,ExtendedSoapSerializationEnvelope envelope)
    {
        if (inObj == null)
            return;
            SoapObject soapObject=(SoapObject)inObj;
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0< size;i0++)
            {
                java.lang.Object obj = soapObject.getProperty(i0);
                if (obj!=null && obj instanceof AttributeContainer)
                {
                    AttributeContainer j =(AttributeContainer) soapObject.getProperty(i0);
                    DataSet j1= (DataSet)envelope.get(j,DataSet.class);
                    add(j1);
                }
            }
        
    }
    
    @Override
    public java.lang.Object getProperty(int arg0) {
        return this.get(arg0);
    }
    
    @Override
    public int getPropertyCount() {
        return this.size();
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        info.name = "DataSet";
        info.type = DataSet.class;
    	info.namespace= "http://namespaces.globalplatform.org/systems-messaging/2.1.0";
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1) {
    }

}