package es.fpbasics.vistas;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import es.fpbasics.modelo.TablaModulos;
import es.fpbasics.servicio.ServicioModulos;



@ManagedBean
@SessionScoped
public class BotonModificarModulosVista extends ApplicationContextHerency implements Serializable  {

	public ServicioModulos servicio;
	
	TablaModulos registroModulos;
	BotonModificarModulosVista nuevoRegistroModulos;
	
	private Integer idModulos,duracion;
	private String nombre,curso,mensaje;
	private boolean confirmacion; 
	@PostConstruct
	public void init(){
		
		servicio = (ServicioModulos)this.context.getBean("servicioModulos");
		nuevoRegistroModulos= new BotonModificarModulosVista();

	}

	public void botonParaUnaPrimaria(Integer idModulo) {
		System.out.println(idModulo);
		registroModulos = this.servicio.consultarRegistrosDeLaTablaModulosPorIdModulo(idModulo);
		registroModulos.getIdModulo();
		registroModulos.getNombre();
		registroModulos.getDuracion();
		registroModulos.getCurso();
		System.out.println(registroModulos);
		
	}

	public void generarNuevoObjetoAPartirDeRegistro () { 
		nuevoRegistroModulos.setIdModulos(registroModulos.getIdModulo());
		nuevoRegistroModulos.setNombre(this.nombre);
		nuevoRegistroModulos.setDuracion(this.duracion);
		nuevoRegistroModulos.setCurso(this.curso);
		System.out.println(nuevoRegistroModulos.getIdModulos());
		System.out.println(nuevoRegistroModulos.getNombre());
		System.out.println(nuevoRegistroModulos.getDuracion());
		System.out.println(nuevoRegistroModulos.getCurso());
	}
	
		
	public void confirmarModificacion() {
		System.out.println("Entrando,este es el nuevo registro:");
		System.out.println(nuevoRegistroModulos.getIdModulos());
		System.out.println(nuevoRegistroModulos.getNombre());
		System.out.println(nuevoRegistroModulos.getDuracion());
		System.out.println(nuevoRegistroModulos.getCurso());
		confirmacion = this.servicio.modificarRegistroDeLaTablaModulos(nuevoRegistroModulos);
		
	}
	
	public void atras() {
		System.out.println("volviendo atrás");
	}

	public TablaModulos getRegistroModulos() {
		return registroModulos;
	}

	public void setRegistroModulos(TablaModulos registroModulos) {
		this.registroModulos = registroModulos;
	}

	public BotonModificarModulosVista getNuevoRegistroModulos() {
		return nuevoRegistroModulos;
	}

	public void setNuevoRegistroModulos(BotonModificarModulosVista nuevoRegistroModulos) {
		this.nuevoRegistroModulos = nuevoRegistroModulos;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Integer getIdModulos() {
		return idModulos;
	}

	public void setIdModulos(Integer idModulos) {
		this.idModulos = idModulos;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

		
}
