package com.eImpuestos.controllers;

import java.util.concurrent.atomic.AtomicLong;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Map;
import java.util.HashMap;

@Controller
public class EmpresaPageController {
    @RequestMapping("/")
    public String inicio(){ 
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