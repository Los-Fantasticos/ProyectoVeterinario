/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesRegistroCliente;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Nixon
 */
public class Cliente {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String numerocleinte;
    private String fechaNacimiento;
    private String profesion;
    private String direccion;
    private String telefono;
    private String departamento;
    private String provincia;
    private String distrito;
    private String Email;
    private String remitido;
    private static int edad;

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNumerocleinte() {
        return numerocleinte;
    }

    public void setNumerocleinte(String numerocleinte) {
        this.numerocleinte = numerocleinte;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getRemitido() {
        return remitido;
    }

    public void setRemitido(String remitido) {
        this.remitido = remitido;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    /**
     * @return the edad
     */
    public static int getEdad() {
        Calendar dt=new GregorianCalendar();
        System.out.println(dt.get(Calendar.YEAR));
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getNombreCompleto()
    {
        return this.nombre + " " + this.apellidoPaterno+ this.apellidoMaterno;
        
    }
        public static void main(String[] args){
            System.out.println(""+getEdad());
        }
}

