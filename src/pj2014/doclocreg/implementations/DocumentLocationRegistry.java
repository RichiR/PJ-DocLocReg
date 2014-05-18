package pj2014.doclocreg.implementations;

import java.util.HashMap;

public class DocumentLocationRegistry {
	
	private HashMap< String, String[] > patientsDatabases;
	//TODO auskommentieren wenn Klasse vorhanden; Verbindung nötig?
	//private PatientRepository patientRepo;
	
	public String[] findRegistryEntry(String insuranceId){
		
		String[] result = new String[2];
		// ....
		return result;
		
	}
	
	public String registerNewDocument(String insuranceId, String databaseId) {
		
		String result = new String();
		//.....
		return result;
		
	}
	
	public String registerNewDatabase(String databaseId){
		
		String result = new String();
		//.....
		return result;
		
	}
	
	public String registerNewPatient(String insuranceId){
		
		String result = new String();
		//.....
		return result;
		
	}

}
