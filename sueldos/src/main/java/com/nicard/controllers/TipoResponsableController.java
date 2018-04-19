package com.nicard.controllers;

import com.nicard.dao.TipoResponsable;
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
@RequestMapping("/TipoResponsableController")
public class TipoResponsableController {

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody
    List<TipoResponsable> getTipoResponsableController() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        @SuppressWarnings("unchecked")
        List<TipoResponsable> lTipoResponsable = (List<TipoResponsable>) session.createQuery("FROM TipoResponsable s").list();

        session.getTransaction().commit();
        session.close();

        return lTipoResponsable;
    }

}