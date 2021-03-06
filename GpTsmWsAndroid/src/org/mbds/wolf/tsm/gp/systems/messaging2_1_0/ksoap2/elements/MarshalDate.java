package org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.elements;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 3.0.3.5
//
// Created by amlesas Development at 08-07-2014
//
//---------------------------------------------------




import org.ksoap2.serialization.Marshal;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.Helper;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import java.io.IOException;
import java.util.Date;


public class MarshalDate implements Marshal
{
    public java.lang.Object readInstance(XmlPullParser parser, java.lang.String namespace, java.lang.String name,PropertyInfo expected) throws IOException, XmlPullParserException
    {
        return Helper.ConvertFromWebService(parser.nextText());
    }

    public void register(SoapSerializationEnvelope cm)
    {
        cm.addMapping(cm.xsd, "datetime", Date.class, this);
    }

    public void writeInstance(XmlSerializer writer, java.lang.Object obj) throws IOException
    {
        writer.text(Helper.getDateFormat().format((Date)obj));
    }
}
