package es.fpbasics.repositorioimpl;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import es.fpbasics.mapper.ModuloMapper;
import es.fpbasics.modelo.TablaModulos;
import es.fpbasics.repositorio.RepositorioModulos;
import es.fpbasics.vistas.BotonModificarModulosVista;


@Repository
public class RepositorioModulosImpl implements RepositorioModulos {
	
	@Autowired
    private ModuloMapper mapper;

	
    public List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos() {
        return this.mapper.consultarTodosLosRegistrosDeLaTablaModulos();
    }

   
	public TablaModulos consultarRegistrosDeLaTablaModulosPorIdModulo(Integer idModulo) {
		return this.mapper.consultarRegistrosDeLaTablaModulosPorIdModulo(idModulo);
	}

	
	public boolean modificarRegistroDeLaTablaModulos(BotonModificarModulosVista registro) {
		return this.mapper.modificarRegistroDeLaTablaModulos(registro);
		
	}


	public List<TablaModulos> consultarRegistrosDeLaTablaModulosFiltrado(String filtro) {
		filtro = ""+filtro+"%";
		return this.mapper.consultarRegistrosDeLaTablaModuloFiltrado(filtro);

	}
}
