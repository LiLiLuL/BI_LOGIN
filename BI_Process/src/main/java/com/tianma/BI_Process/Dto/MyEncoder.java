package com.tianma.BI_Process.Dto;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tianma.BI_Process.Domain.UserFormInfo;

import net.sf.json.JSONObject;
import springfox.documentation.spring.web.json.Json;

public class MyEncoder implements Encoder.Text<Map<String, List>> {
	@Override
    public void init(EndpointConfig config) {
        // TODO Auto-generated method stub

    }

   @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }
	//向web端传递Map类型
    @Override
    public String encode(Map<String, List> map) throws EncodeException {
        ObjectMapper    mapMapper= new ObjectMapper();
        try {
            String json="";
            json=mapMapper.writeValueAsString(map);
            return  json;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "false";
        }
    }

}
