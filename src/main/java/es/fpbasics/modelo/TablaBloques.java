package es.fpbasics.modelo;


public class TablaBloques {
	private final String empresa;
	private final Integer idBloque;
	private final Integer idModulo;
	private final String orden;
	private final String descripcion;
	private final Integer idFormadorResponsable;

	public TablaBloques(String empresa, Integer idBloque, Integer idModulo, String orden, String descripcion,
			Integer idFormadorResponsable) {
		super();
		this.empresa = empresa;
		this.idBloque = idBloque;
		this.idModulo = idModulo;
		this.orden = orden;
		this.descripcion = descripcion;
		this.idFormadorResponsable = idFormadorResponsable;
	}

	public String getEmpresa() {
		return empresa;
	}

	public Integer getIdBloque() {
		return idBloque;
	}

	public Integer getIdModulo() {
		return idModulo;
	}

	public String getOrden() {
		return orden;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Integer getIdFormadorResponsable() {
		return idFormadorResponsable;
	}

//	@Override
//	public int hashCode() {
//		final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
//		
//			hashCodeBuilder.append(empresa);
//			hashCodeBuilder.append(idBloque);
//			hashCodeBuilder.append(idModulo);
//			hashCodeBuilder.append(orden);
//			hashCodeBuilder.append(descripcion);
//			hashCodeBuilder.append(idFormadorResponsable);
//		
//		return hashCodeBuilder.toHashCode();
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof TablaBloques) {
//			
//			final TablaBloques param = (TablaBloques)obj;
//			final EqualsBuilder equalsBuilder = new EqualsBuilder();
//			
//			equalsBuilder.append(this.empresa, param.empresa);
//			equalsBuilder.append(this.idBloque, param.idBloque);
//			equalsBuilder.append(this.idModulo, param.idModulo);
//			equalsBuilder.append(this.orden, param.orden);
//			equalsBuilder.append(this.descripcion, param.descripcion);
//			equalsBuilder.append(this.idFormadorResponsable, param.idFormadorResponsable);
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