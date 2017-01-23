package com.eImpuestos.controllers;

import java.util.concurrent.atomic.AtomicLong;
import java.util.List;
import java.util.ArrayList;
import com.eImpuestos.entity.Empresa;
import com.eImpuestos.dao.EmpresaDAO;
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
        EmpresaDAO eDao = new EmpresaDAO();
        List<Empresa> lEmpresa = eDao.lista();
        return lEmpresa;
    }
}