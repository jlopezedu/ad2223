package es.cipfpbatoi.damb.ad.persistencia;

import java.util.List;

import es.cipfpbatoi.damb.ad.modelo.Persona;

public class IOPersonasDataStream {

	public static void save(List<Persona> personas) {
		System.out.println("Guardando datos en fichero con DataStream.");
	}

	public static List<Persona> load() {
		System.out.println("cargando datos de fichero con DataStream.");
		return null;
	}

}
