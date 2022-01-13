package com.dujie;

import cn.hutool.json.JSONUtil;
import com.dujie.util.JsonUtil;
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
//                .date(new Date())
//                .build();
//        System.out.println("Hutool工具解析" + JSONUtil.toJsonStr(build));
//        System.out.println("自定义工具解析" + JsonUtil.obj2String(build));
        String json = "{\"userName\":\"testUserName\",\"password\":\"testPassword\",\"tempList\":[{\"pro\":\"1\",\"town\":\"1\",\"country\":\"1\"},{\"pro\":\"2\",\"town\":\"2\",\"country\":\"2\"}],\"date\":\"2022-01-05 11:56:24\"}";

        User user = JsonUtil.string2Obj(json, User.class);
        System.out.println(user);
    }
}
