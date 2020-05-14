package com.zhy.converter;

import com.zhy.bean.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


/**
 * @ClassName: MyConverter
 * @Description: TODO 留下注释吧
 * @Date: 2020/5/13 22:38
 * @Version: 1.0
 **/
public class MyConverter implements Converter<String, User> {

    @Override
    public User convert(String source) {
        User user = null;
        String[] split = source.split("-");
        if (source!=null && split.length==4){
            user = new User();
            user.setId(Integer.parseInt(split[0]));
            user.setName(split[1]);
            user.setAge(Integer.parseInt(split[2]));
            user.setGender(split[3]);
        }
        return user;
    }
}
