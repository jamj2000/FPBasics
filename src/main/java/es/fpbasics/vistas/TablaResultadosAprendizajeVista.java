package es.fpbasics.vistas;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import es.fpbasics.modelo.TablaBloques;
import es.fpbasics.modelo.TablaModulos;
import es.fpbasics.modelo.TablaResultadosAprendizaje;
import es.fpbasics.servicio.ServicioBloques;
import es.fpbasics.servicio.ServicioModulos;
import es.fpbasics.servicio.ServicioResultadosAprendizaje;

@ManagedBean
@SessionScoped
public class TablaResultadosAprendizajeVista extends ApplicationContextHerency implements Serializable  {
	

	public ServicioResultadosAprendizaje servicio;
	
	private List<TablaResultadosAprendizaje> list;

		 
	@PostConstruct
	public void init(){
		
		servicio = (ServicioResultadosAprendizaje)this.context.getBean("servicioResultadosAprendizaje");
		list = servicio.consultarTodosLosRegistrosDeLaTablaResultadoAprendizaje();

	}


	public List<TablaResultadosAprendizaje> getResultadosAprendizaje() {
		return list;
	}




}