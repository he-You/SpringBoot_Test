package com.heyou.springboot.demo.entity;

import javax.xml.bind.annotation.*;

/**
 * @author heyou(heyou_0423 @ 163.com)
 * @date 2020/8/13 22:58
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "header",
        "body"
})
@XmlRootElement(name = "soapenv:Envelope")
public class RequestEntity {

    @XmlAttribute(name="xmlns:soapenv")
    protected String soapenv="http://schemas.xmlsoap.org/soap/envelope/";

    @XmlAttribute(name="xmlns:eapp")
    protected String eapp="http://wx.gmw9.com";

    @XmlAttribute(name="xmlns:bus")
    protected String bus=null;



    @XmlElement(required = true,name="soapenv:Header")
    protected RequestHeader header;

    @XmlElement(required = true,name="soapenv:Body")
    protected RequestBody body;


    //get set方法省略


    public String getSoapenv() {
        return soapenv;
    }

    public void setSoapenv(String soapenv) {
        this.soapenv = soapenv;
    }

    public String getEapp() {
        return eapp;
    }

    public void setEapp(String eapp) {
        this.eapp = eapp;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public RequestHeader getHeader() {
        return header;
    }

    public void setHeader(RequestHeader header) {
        this.header = header;
    }

    public RequestBody getBody() {
        return body;
    }

    public void setBody(RequestBody body) {
        this.body = body;
    }
}
