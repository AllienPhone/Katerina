package backtype.storm.untils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;

import java.util.Date;

/**
 * Copyright (c) 2012, Sohu.com All Rights Reserved.
 * <p/>
 * User: jeffreywu  MailTo:jeffreywu@sohu-inc.com
 * Date: 13-12-27
 * Time: PM4:57
 */
public class JsonUnitls {
    /**
     * 最简单序列化为Json数据
     *
     * @param ojbObject
     * @return
     */
    public static String simpleJson(Object ojbObject) {
        SerializeConfig sc = new SerializeConfig();
        sc.put(Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd HH:mm"));
        return JSON.toJSONString(ojbObject, sc);
    }

    /**
     * 返序列化对象
     *
     * @param content
     * @return
     */
    public static Object StringToJsonVideo(String content, Class classZ) {
        return JSON.parseObject(content, classZ);
    }
}
