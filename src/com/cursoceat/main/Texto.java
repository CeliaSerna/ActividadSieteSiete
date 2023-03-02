package com.cursoceat.main;


import java.time.LocalDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Texto {

	private String cadena;
	
	LocalDate creacion;
	LocalDateTime ultimaModificacion;
	//final --> declara un atributo constante
	
private final int LONGITUDMAX;
static final String VOCALE_STRING="aeiouáéíóú";

public Texto(int longitud) {//paso de valor
	LONGITUDMAX = longitud;//asigno a la constante
this.cadena="";
creacion=LocalDate.now();
ultimaModificacion=null;
//en este momento cuando se crea el objeto con el constructor
//se inicializan todos los atributos de la clase

}
public void addFinal(char c) {
	if (this.LONGITUDMAX > cadena.length()) {
		this.cadena=this.cadena +c;
		this.ultimaModificacion=LocalDateTime.now();
		
	}	
	}
public void addFinal(String cadena1) {
	if(this.LONGITUDMAX > this.cadena.length()+ cadena1.length()) {
		this.cadena=this.cadena +cadena1;
		this.ultimaModificacion=LocalDateTime.now();
		
		
	}
}
public void addInicio(char c) {
	if (this.LONGITUDMAX > cadena.length()) {
		this.cadena=cadena +c;
		this.ultimaModificacion=LocalDateTime.now();
		
	}	
	}
public void addInicio(String cadena1) {
	if(this.LONGITUDMAX > this.cadena.length()+ cadena1.length()) {
		this.cadena=cadena1 +this.cadena;
		this.ultimaModificacion=LocalDateTime.now();
	
	}
}

public void mostrar() {
	
DateTimeFormatter formato1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
System.out.println("Fecha de creación: "+ this.creacion.format(formato1));

DateTimeFormatter formato2=DateTimeFormatter.ofPattern("dd/MM/yyyy");
System.out.println("Fecha de ultima modificacion: "+ this.ultimaModificacion.format(formato2));
System.out.println("La cadena es: "+ this.cadena);

}
}


