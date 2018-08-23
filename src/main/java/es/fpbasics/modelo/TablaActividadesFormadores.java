package es.fpbasics.modelo;


public class TablaActividadesFormadores {

	private final Integer idFormador;
	private final Integer idActividad;
	private final String empresa;
	private final Integer idBloque;


	public TablaActividadesFormadores(Integer idformador, Integer idactividad, String empresa, Integer idbloque) {
		super();
		this.idFormador = idformador;
		this.idActividad = idactividad;
		this.empresa = empresa;
		this.idBloque = idbloque;
	}

	public Integer getIdFormador() {
		return idFormador;
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


}
