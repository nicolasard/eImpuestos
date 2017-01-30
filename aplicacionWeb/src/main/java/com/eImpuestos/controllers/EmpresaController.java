package com.eImpuestos.controllers;

import java.util.concurrent.atomic.AtomicLong;
import java.util.List;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import com.eImpuestos.entity.Empresa;
import com.eImpuestos.dao.EmpresaDAO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class EmpresaController {

    /*
     * Lista las empresas del sistema
     */
    @CrossOrigin(origins = "*")
    @RequestMapping("/empresas")
    public List<Empresa> empresas() {
        System.out.println("Empresas, armando Dao");
        EmpresaDAO eDao = new EmpresaDAO();
        List<Empresa> lEmpresa = eDao.lista();
        return lEmpresa;
    }
    
    @CrossOrigin(origins = "*")
    @RequestMapping("/seleccionarEmpresa/{empresaId}")
    public Empresa seleccionarEmpresa(HttpServletRequest request, @PathVariable int empresaId) {
        System.out.println("seleccionarEmpresa, armando Dao");
        EmpresaDAO eDao = new EmpresaDAO();
        Empresa lEmpresa = eDao.obtieneEmpresa(empresaId);
        request.getSession().setAttribute("empresaSeleccionada",lEmpresa);
        return lEmpresa;
    }
    
    @CrossOrigin(origins = "*")
    @RequestMapping("/obtenerEmpresa")
    public Empresa obtenerEmpresa(HttpServletRequest request){
        Empresa lEmpresa = (Empresa)request.getSession().getAttribute("empresaSeleccionada");
        return lEmpresa;
    }
    
}