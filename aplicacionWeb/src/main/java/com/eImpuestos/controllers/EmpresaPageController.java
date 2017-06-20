package com.eImpuestos.controllers;

import java.util.concurrent.atomic.AtomicLong;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.Map;
import java.util.HashMap;

@Controller
public class EmpresaPageController {
    @RequestMapping("/")
    public String inicio(HttpServletRequest request){ 
        if(request.getSession().getAttribute("empresaSeleccionada") == null){
            return "redirect:/seleccioneEmpresa";   
        }
        return "inicio";
    }
    
    @RequestMapping("/seleccioneEmpresa")
    public String home(){ 
    	return "seleccioneEmpresa";
    }
    
    @RequestMapping("/facturacion")
    public String facturacion(){ 
    	return "facturacion";
    }
}