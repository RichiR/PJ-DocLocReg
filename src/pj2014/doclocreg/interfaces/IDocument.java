package pj2014.doclocreg.interfaces;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public interface IDocument {
	@Id
	@GeneratedValue
	public int getDocId();
	
	public void setDocId(int docId);
	public int getVersId();
	public void setVersId(int versId);
	public int getUserId();
	public void setUserId(int userId);
	public String getCreation();
	public void setCreation(String creation);
	public String getFilename();
	public void setFilename(String filename);
	public String getDocType();
	public void setDocType(String docType);
	public String getCategory();
	public void setCategory(String category);
	public String getContent();
	public void setContent(String content);

}
