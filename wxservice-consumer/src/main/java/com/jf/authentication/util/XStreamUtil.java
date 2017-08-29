package com.jf.authentication.util;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * Created by turan on 2017/8/8 0008.
 */
public class XStreamUtil {
    public static XStream xstream = new XStream(new DomDriver());

    public static String toXml(Object obj){
        return xstream.toXML(obj);
    }

    //public static Object fromXml()
}
