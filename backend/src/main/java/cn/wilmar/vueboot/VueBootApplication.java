package cn.wilmar.vueboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class VueBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueBootApplication.class, args);
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login() {
        return "OK";
    }

    @RequestMapping("/save_error_logger")
    @ResponseBody
    public String saveErrorLogger() {
        return "Saved!";
    }

    @RequestMapping("/get_info")
    @ResponseBody
    public String getInfo() {
        return "info";
    }

        /*
            const data = res.data
            commit('setAvator', data.avator)
            commit('setUserName', data.name)
            commit('setUserId', data.user_id)
            commit('setAccess', data.access)*/

        /*
  super_admin: {
    name: 'super_admin',
    user_id: '1',
    access: ['super_admin', 'admin'],
    token: 'super_admin',
    avator: 'https://file.iviewui.com/dist/a0e88e83800f138b94d2414621bd9704.png'
  },
        */

    static class User {
        String name;
        String user_id;
        String[] access;
        String token;
        String avator;
    }
}
