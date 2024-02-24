package es.codeurjc.hellowordvscode;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

public class ErrorEoloPark implements ErrorController{
    @RequestMapping{"/error"}
    public String Error(){
        return "error"; 
    }
}