package com.eImpuestos.controllers;

import java.util.concurrent.atomic.AtomicLong;
import java.util.List;
import java.util.ArrayList;
import com.eImpuestos.entity.Empresa;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpresaController {

    /*
     * Lista las empresas del sistema
     */
    @RequestMapping("/empresas")
    public List<Empresa> empresas() {
        
        List<Empresa> lEmpresa = new ArrayList<Empresa>();
        
        return lEmpresa;
    }
}