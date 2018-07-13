package com.mitocode.model;

import com.mitocode.model.Nota;
import com.mitocode.model.Telefono;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-13T11:28:14")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> apellidos;
    public static volatile SingularAttribute<Persona, Integer> codigo;
    public static volatile SingularAttribute<Persona, Date> fechaNacimiento;
    public static volatile ListAttribute<Persona, Telefono> telefonoList;
    public static volatile SingularAttribute<Persona, String> sexo;
    public static volatile ListAttribute<Persona, Nota> notaList;
    public static volatile SingularAttribute<Persona, String> nombres;

}