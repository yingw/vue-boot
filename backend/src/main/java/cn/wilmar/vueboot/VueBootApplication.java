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
}