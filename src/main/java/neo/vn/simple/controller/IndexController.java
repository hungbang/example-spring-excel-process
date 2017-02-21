package neo.vn.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HungBang on 2/21/2017.
 */
@Controller
public class IndexController {

    @RequestMapping("/home")
    public String home(Model model){
        return "home";
    }

    @RequestMapping("/excel")
    public String excel(Model model){
        return "upload-excel";
    }
}
