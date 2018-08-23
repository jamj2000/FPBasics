package es.fpbasics.vistas;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import es.fpbasics.modelo.TablaBloques;
import es.fpbasics.modelo.TablaModulos;
import es.fpbasics.servicio.ServicioBloques;
import es.fpbasics.servicio.ServicioModulos;

@ManagedBean
@SessionScoped
public class TablaBloquesVista extends ApplicationContextHerency implements Serializable  {
	

	public ServicioBloques servicio;
	
	private List<TablaBloques> list;

		 
	@PostConstruct
	public void init(){
		
		servicio = (ServicioBloques)this.context.getBean("servicioBloques");
		list = servicio.consultarTodosLosRegistrosDeLaTablaBloques();

	}


	public List<TablaBloques> getBloques() {
		return list;
	}




}