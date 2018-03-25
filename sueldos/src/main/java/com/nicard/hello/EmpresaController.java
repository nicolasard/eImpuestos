package com.nicard.hello;

import com.nicard.dao.Empresa;
import com.nicard.dao.HibernateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/EmpresaController")
public class EmpresaController {


    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody
    List<Empresa> getEmpresas(@RequestParam(value="nameBusqueda", required=false, defaultValue="") String nameBusqueda,
                               int pagina,
                               int maxPorPagina) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        @SuppressWarnings("unchecked")
        List<Empresa> lEmpresa = (List<Empresa>) session.createQuery("FROM Empresa s").list();

        session.getTransaction().commit();
        session.close();

        return lEmpresa;
    }

    @RequestMapping(method=RequestMethod.POST)
    public @ResponseBody
    Empresa putEmpresas(@RequestBody Empresa empresa) { //Use RequestBody to know that is not a get variable
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();


        int id = (Integer) session.save(empresa);
        empresa.setEmpresaID(id);

        session.getTransaction().commit();
        session.close();

        return empresa;
    }

}
