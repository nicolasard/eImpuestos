package com.eImpuestos.annotations;

/*
 * Ejemplo de uso de una annotation para chequear la empresa
 */
public @interface checkEmpresaAnnotation{
    String valorAnnotation default "Hola annotation";
} 