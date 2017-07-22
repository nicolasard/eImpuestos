package com.eImpuestos.dao;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.List;
import com.eImpuestos.dao.EmpresaDAO;
import com.eImpuestos.entity.Empresa;

public class empresaDAOTest {
    
@Test
public void evaluatesExpression() {
    EmpresaDAO dEmpresa = new EmpresaDAO();
    List<Empresa> lEmpresa = dEmpresa.lista();
    int sum = 6;
    assertEquals(6, sum);
}

}
