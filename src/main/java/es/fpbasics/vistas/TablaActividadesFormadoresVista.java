package es.fpbasics.vistas;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;

import es.fpbasics.modelo.TablaActividadesFormadores;
import es.fpbasics.servicio.ServicioActividadesFormadores;



@ManagedBean
@SessionScoped
public class TablaActividadesFormadoresVista extends ApplicationContextHerency implements Serializable  {
	
	public ServicioActividadesFormadores servicio;
	
	private List<TablaActividadesFormadores> list;

		 
	@PostConstruct
	public void init(){
		
		servicio = (ServicioActividadesFormadores)this.context.getBean("servicioActividadesFormadores");
		list = servicio.consultarTodosLosRegistrosDeLaTablaActividadesFormadores();

	}


	public List<TablaActividadesFormadores> getActividadesFormadores() {
		return list;
	}




}
