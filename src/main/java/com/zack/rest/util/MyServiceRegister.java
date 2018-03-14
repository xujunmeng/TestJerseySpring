package com.zack.rest.util;

import com.zack.rest.UserResource;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by james on 2018/3/13.
 */
public class MyServiceRegister extends ResourceConfig {

    public MyServiceRegister() {
        //转换格式资源类
        register(JacksonJsonProvider.class);
        //web service接口类
        register(UserResource.class);
    }
}
