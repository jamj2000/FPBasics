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
public class TablaModulosVista extends ApplicationContextHerency implements Serializable  {
	

	public ServicioModulos servicio;
	
	private List<TablaModulos> list;

		 
	@PostConstruct
	public void init(){
		
		servicio = (ServicioModulos)this.context.getBean("servicioModulos");
		list = servicio.consultarTodosLosRegistrosDeLaTablaModulos();

	}


	public List<TablaModulos> getModulos() {
		return list;
	}




}