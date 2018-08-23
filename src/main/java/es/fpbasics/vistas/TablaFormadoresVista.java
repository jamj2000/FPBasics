package es.fpbasics.vistas;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import es.fpbasics.modelo.TablaBloques;
import es.fpbasics.modelo.TablaFormadores;
import es.fpbasics.modelo.TablaModulos;
import es.fpbasics.servicio.ServicioBloques;
import es.fpbasics.servicio.ServicioFormadores;
import es.fpbasics.servicio.ServicioModulos;

@ManagedBean
@SessionScoped
public class TablaFormadoresVista extends ApplicationContextHerency implements Serializable  {
	

	public ServicioFormadores servicio;
	
	private List<TablaFormadores> list;

		 
	@PostConstruct
	public void init(){
		
		servicio = (ServicioFormadores)this.context.getBean("servicioFormadores");
		list = servicio.consultarTodosLosRegistrosDeLaTablaFormadores();

	}


	public List<TablaFormadores> getFormadores() {
		return list;
	}




}