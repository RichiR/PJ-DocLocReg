package pj2014.doclocreg.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/DocLocReg")
public interface IDocumentLocationRegistry {
	@Path("/findEntry")
	@Consumes("application/json")
	@Produces("application/json")
	public String[] findRegistryEntry(String insuranceId);
	
	@Path("/registerNewDoc")
	@Consumes("application/json")
	@Produces("application/json")
	public String registerNewDocument(String insuranceId, String databaseId);
	
	@Path("/registerNewDb")
	@Consumes("application/json")
	@Produces("application/json")
	public String registerNewDatabase(String databaseId);
	
	@Path("/registerNewPat")
	@Consumes("application/json")
	@Produces("application/json")
	public String registerNewPatient(String insuranceId);
}
