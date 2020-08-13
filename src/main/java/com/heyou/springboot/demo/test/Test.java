package com.heyou.springboot.demo.test;

import com.heyou.springboot.demo.entity.BodyContent;
import com.heyou.springboot.demo.entity.RequestBody;
import com.heyou.springboot.demo.entity.RequestEntity;
import com.heyou.springboot.demo.utils.JaxbXmlUtils;

/**
 * @author heyou(heyou_0423 @ 163.com)
 * @date 2020/8/13 23:02
 */
public class Test {
    public static void main(String[] args) throws Exception {
        RequestEntity requestEntity = new RequestEntity();
        RequestBody requestBody = new RequestBody();
        BodyContent content = new BodyContent();
        content.setAa1("haha");
        content.setAa2("hihi");
        content.setAa3("hello");
        requestBody.setAaaaaaa(content);
        requestEntity.setBody(requestBody);
        String convertToXml = JaxbXmlUtils.convertToXml(requestEntity);
        System.out.println(convertToXml);

        String result = convertToXml;
        RequestEntity convertToJavaBean = JaxbXmlUtils.convertToJavaBean(result, RequestEntity.class);
        System.out.println("");
    }
}
