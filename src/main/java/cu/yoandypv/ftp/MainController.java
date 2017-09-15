package cu.yoandypv.ftp;

import cu.yoandypv.ftp.exceptions.FTPErrors;
import cu.yoandypv.ftp.ftpclient.FTPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

/**
 * Created by Yoandy Pérez Villazón 14/09/17.
 */
@RestController
public class MainController {

    @Autowired
    private FTPService ftpService;

    @RequestMapping( value = "/upload", method = RequestMethod.GET)
    public void uploadExample(){
        try {

              ftpService.connectToFTP("192.168.1.102","a","a");
              ftpService.uploadFileToFTP(new File("/home/yoandypv/img.png"),"uploads/","foto.png");
              ftpService.downloadFileFromFTP("uploads/foto.png","/home/kaka.png");

        } catch (FTPErrors ftpErrors) {
            System.out.println(ftpErrors.getMessage());
        }
    }


}
