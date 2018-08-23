package es.fpbasics.vistas;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;

import es.fpbasics.modelo.TablaActividadesFormativas;
import es.fpbasics.servicio.ServicioActividadesFormativas;



@ManagedBean
@SessionScoped
public class TablaActividadesFormativasVista extends ApplicationContextHerency implements Serializable  {
	
	public ServicioActividadesFormativas servicio;
	
	private List<TablaActividadesFormativas> list;

		 
	@PostConstruct
	public void init(){
		
		servicio = (ServicioActividadesFormativas)this.context.getBean("servicioActividadesFormativas");
		list = servicio.consultarTodosLosRegistrosDeLaTablaActividadesFormativas();

	}


	public List<TablaActividadesFormativas> getActividadesFormativas() {
		return list;
	}




}