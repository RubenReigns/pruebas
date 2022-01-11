package com.ruben.codigo.model;

import java.util.Date;

public class ClaseBase {
    private int id;
    private Date creada;
    private Date modificada;
    private Date borrada;
    private int status = 0; //Creada = 1, modificada = 2, borrada = -1;
}
