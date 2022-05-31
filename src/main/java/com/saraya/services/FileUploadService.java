package com.saraya.services;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.*;


public class FileUploadService {


    private final String UPLOAD_DIR = "/img";


    public String uploadFile(CommonsMultipartFile file, String id)  {
        //ServletContext context = this.session.getServletContext();
        //String path = context.getRealPath(UPLOAD_DIR);
        String filename = file.getOriginalFilename();
        String fileExt = filename.split("\\.")[1];
        try {
            byte[] bytes = filename.getBytes();

            /*BufferedOutputStream stream = new BufferedOutputStream(
                    new FileOutputStream(path + File.separator + id+"."+fileExt)
            );

            stream.write(bytes);
            stream.flush();
            stream.close();*/

            return id+"."+fileExt;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return null;
    }
}
