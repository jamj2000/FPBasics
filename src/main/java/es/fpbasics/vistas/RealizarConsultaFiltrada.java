package es.fpbasics.vistas;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import es.fpbasics.modelo.TablaModulos;
import es.fpbasics.servicio.ServicioModulos;

@ManagedBean
@SessionScoped
public class RealizarConsultaFiltrada extends ApplicationContextHerency implements Serializable {

	public ServicioModulos servicio;
	private List<TablaModulos> registrosObtenidos;
	private String filtro;
	
	@PostConstruct
	public void init(){
		
		servicio = (ServicioModulos)this.context.getBean("servicioModulos");

	}
	
	public 	void realizarConsultaFiltrada() {
		registrosObtenidos=servicio.consultarRegistrosDeLaTablaModulosFiltrado(this.filtro);
		System.out.println(getRegistrosObtenidos());
	}

	public void navega() {
		System.out.println("Navegando");
	}
	
	public List<TablaModulos> getRegistrosObtenidos() {
		return registrosObtenidos;
	}

	public void setRegistrosObtenidos(List<TablaModulos> registrosObtenidos) {
		this.registrosObtenidos = registrosObtenidos;
	}

	public String getFiltro() {
		return filtro;
	}

	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}
	
}
