package neo.vn.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by HungBang on 2/21/2017.
 */
@Controller
public class UploadController {
    private String location;

    @PostMapping("/upload")
    public String upload(Model model, MultipartFile file) {
        try {
            InputStream inputStream = file.getInputStream();
            File curDir = new File(".");
            String path = curDir.getAbsolutePath();
            location = path.substring(0, path.length() - 1) + file.getOriginalFilename();
            FileOutputStream outputStream = new FileOutputStream(location);
            System.out.println("====location===="+ location);
            int ch;
            while ((ch = inputStream.read()) != -1) {
                outputStream.write(ch);
            }
            outputStream.flush();
            outputStream.close();
            model.addAttribute("message", "File : " + file.getOriginalFilename() + " has been uploaded successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "upload-excel";
    }
}
