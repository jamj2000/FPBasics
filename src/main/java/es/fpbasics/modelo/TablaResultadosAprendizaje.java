package es.fpbasics.modelo;

public class TablaResultadosAprendizaje {
	private final Integer idResultado;
	private final Integer idModulo;
	private final String descripcion;

	public TablaResultadosAprendizaje(Integer idResultados, Integer idModulo, String descripcion) {
		super();
		this.idResultado = idResultados;
		this.idModulo = idModulo;
		this.descripcion = descripcion;
	}

	public Integer getIdResultados() {
		return idResultado;
	}

	public Integer getIdModulo() {
		return idModulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

//	@Override
//	public int hashCode() {
//		final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
//		
//			hashCodeBuilder.append(idResultado);
//			hashCodeBuilder.append(idModulo);
//			hashCodeBuilder.append(descripcion);
//		
//		return hashCodeBuilder.toHashCode();
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof TablaResultadosAprendizaje) {
//			
//			final TablaResultadosAprendizaje param = (TablaResultadosAprendizaje)obj;
//			final EqualsBuilder equalsBuilder = new EqualsBuilder();
//			
//			equalsBuilder.append(this.idResultado, param.idResultado);
//			equalsBuilder.append(this.idModulo, param.idModulo);
//			equalsBuilder.append(this.descripcion, param.descripcion);
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