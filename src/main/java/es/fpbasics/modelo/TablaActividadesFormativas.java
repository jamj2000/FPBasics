package es.fpbasics.modelo;


public class TablaActividadesFormativas {

	private final Integer idActividad;
	private final String empresa;
	private final Integer idBloque;
	private final String descripcionActividad;
	private final Integer horasDedicadas;

	public TablaActividadesFormativas(Integer idactividad, String empresa, Integer idbloque,
			String descripcionActividad, Integer horasDedicadas) {
		super();
		this.idActividad = idactividad;
		this.empresa = empresa;
		this.idBloque = idbloque;
		this.descripcionActividad = descripcionActividad;
		this.horasDedicadas = horasDedicadas;
	}

	public Integer getIdActividad() {
		return idActividad;
	}

	public String getEmpresa() {
		return empresa;
	}

	public Integer getIdBloque() {
		return idBloque;
	}

	public String getDescripcionActividad() {
		return descripcionActividad;
	}

	public Integer getHorasDedicadas() {
		return horasDedicadas;
	}

//	@Override
//	public int hashCode() {
//		final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
//		
//			hashCodeBuilder.append(idActividad);
//			hashCodeBuilder.append(empresa);
//			hashCodeBuilder.append(idBloque);
//			hashCodeBuilder.append(descripcionActividad);
//			hashCodeBuilder.append(horasDedicadas);
//		
//		return hashCodeBuilder.toHashCode();
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof TablaActividadesFormativas) {
//			
//			final TablaActividadesFormativas param = (TablaActividadesFormativas)obj;
//			final EqualsBuilder equalsBuilder = new EqualsBuilder();
//			
//			equalsBuilder.append(this.idActividad, param.idActividad);
//			equalsBuilder.append(this.empresa, param.empresa);
//			equalsBuilder.append(this.idBloque, param.idBloque);
//			equalsBuilder.append(this.descripcionActividad, param.descripcionActividad);
//			equalsBuilder.append(this.horasDedicadas, param.horasDedicadas);
//			
//			return equalsBuilder.isEquals();
//		}
//		return false;
//	}
//
//	@Override
//	public String toString() {
//		return ToStringBuilder.reflectionToString(this);
//	}

}