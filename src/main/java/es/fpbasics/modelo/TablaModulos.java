package es.fpbasics.modelo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

public class TablaModulos {
	private  Integer idModulo;
	private String nombre;
	private  Integer duracion;
	private  String curso;

	public TablaModulos(Integer idModulo, String nombre, Integer duracion, String curso) {
		super();
		this.idModulo = idModulo;
		this.nombre = nombre;
		this.duracion = duracion;
		this.curso = curso;
	}

	
	public Integer getIdModulo() {
		return idModulo;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public String getCurso() {
		return curso;
	}
	
	public void setIdModulo(Integer idModulo) {
		this.idModulo = idModulo;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}


//	@Override
//	public int hashCode() {
//		final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
//		
//			hashCodeBuilder.append(idModulo);
//			hashCodeBuilder.append(nombre);
//			hashCodeBuilder.append(duracion);
//			hashCodeBuilder.append(curso);
//		
//		return hashCodeBuilder.toHashCode();
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof TablaModulos) {
//			
//			final TablaModulos param = (TablaModulos)obj;
//			final EqualsBuilder equalsBuilder = new EqualsBuilder();
//			
//			equalsBuilder.append(this.idModulo, param.idModulo);
//			equalsBuilder.append(this.nombre, param.nombre);
//			equalsBuilder.append(this.duracion, param.duracion);
//			equalsBuilder.append(this.curso, param.curso);
//			
//			return equalsBuilder.isEquals();
//			
//		}
//		return false;
//	}
//
//	@Override
//	public String toString() {
//		return ToStringBuilder.reflectionToString(this);
//	}
}