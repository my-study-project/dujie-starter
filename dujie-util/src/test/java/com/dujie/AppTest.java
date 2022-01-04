package com.dujie;

import cn.hutool.core.net.NetUtil;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {

//        XmlElement annotation = ClassUtils.getAnnotation(ResponseCardQueryBodyBO.class, XmlElement.class);
//        System.out.println(annotation);
//        System.out.println(MapUtils.isEmpty(new HashMap<>()));
//        List<Address> tempList = new ArrayList<>();
//        tempList.add(Address.builder()
//                .country("1")
//                .pro("1")
//                .town("1")
//                .build());
//
//        tempList.add(Address.builder()
//                .country("2")
//                .pro("2")
//                .town("2")
//                .build());
//        User build = User.builder()
//                .userName("testUserName")
//                .password("testPassword")
//                .tempList(tempList)
//                .build();
//        System.out.println("Hutool工具解析" + JSONUtil.toJsonStr(build));
//        System.out.println("自定义工具解析" + JsonUtil.obj2String(build));
//        System.out.println(JAXBUtil.beanToXml(build));
//        String json = JSONUtil.toJsonStr(build);
//        System.out.println(JsonUtil.string2Obj(json, User.class));
//        System.out.println(JSONUtil.toBean(json, User.class));
//        System.out.println(RandomUtils.nextInt(0, 10));
        NetUtil.getLocalhost().getHostAddress();

    }
}
