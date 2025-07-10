package Entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Usuarios {
    private int usuario_id;
    private  String nombre;
    private  String apellido;
    private String email;
    private String contrasena_hash;
    private String telefono;
    private LocalDate fecha_nacimineto;
    private String direccion;
    private String ciudad;
    private String pais;
    private String pasaporte_numero;
    private LocalDateTime fecha_registro;
    private LocalDateTime ultimo_acceso;
    private Estado estado;

    //todo: creacion del constructor



    //* getters - setters


    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena_hash() {
        return contrasena_hash;
    }

    public void setContrasena_hash(String contrasena_hash) {
        this.contrasena_hash = contrasena_hash;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFecha_nacimineto() {
        return fecha_nacimineto;
    }

    public void setFecha_nacimineto(LocalDate fecha_nacimineto) {
        this.fecha_nacimineto = fecha_nacimineto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPasaporte_numero() {
        return pasaporte_numero;
    }

    public void setPasaporte_numero(String pasaporte_numero) {
        this.pasaporte_numero = pasaporte_numero;
    }

    public LocalDateTime getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(LocalDateTime fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public LocalDateTime getUltimo_acceso() {
        return ultimo_acceso;
    }

    public void setUltimo_acceso(LocalDateTime ultimo_acceso) {
        this.ultimo_acceso = ultimo_acceso;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
