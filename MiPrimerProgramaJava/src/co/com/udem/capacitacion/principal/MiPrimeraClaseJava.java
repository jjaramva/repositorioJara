package co.com.udem.capacitacion.principal;

import co.com.udem.capacitacion.dto.PersonaDTO;

public class MiPrimeraClaseJava {
		
	public static void main(String[] args) {
		
		PersonaDTO personaDTO = new PersonaDTO();
		personaDTO.setEdad(34);
		personaDTO.setNombre("Julián");
		personaDTO.setTelefono("8888888");
		imprimirPersona(personaDTO);
	}
	
	
	private static void imprimirPersona(PersonaDTO personaDTO) {
		System.out.println("Nombre: "+personaDTO.getNombre());
		System.out.println("Edad: "+personaDTO.getEdad());
		System.out.println("Telefono: "+personaDTO.getTelefono());
		
	}
	
}