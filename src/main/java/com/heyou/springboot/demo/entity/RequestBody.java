package com.heyou.springboot.demo.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author heyou(heyou_0423 @ 163.com)
 * @date 2020/8/13 22:58
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "soapenv:Body")
public class RequestBody {


    @XmlElement(required = true,name="eapp:aaaaaa")
    public BodyContent aaaaaaa;
    //get set方法省略

    public BodyContent getAaaaaaa() {
        return aaaaaaa;
    }

    public void setAaaaaaa(BodyContent aaaaaaa) {
        this.aaaaaaa = aaaaaaa;
    }
}

