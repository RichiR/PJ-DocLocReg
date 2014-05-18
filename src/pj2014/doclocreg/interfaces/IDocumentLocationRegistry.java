package pj2014.doclocreg.interfaces;

import javax.ejb.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Singleton
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
