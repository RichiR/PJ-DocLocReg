package pj2014.doclocreg.implementations;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import pj2014.doclocreg.interfaces.IDocument;

//import pj.mi.rest2014.DocumentStorage;

@Entity
public class Document implements Serializable, IDocument {
	

	private int docId;
	private int versId;

	private int userId; // muss irgendwie als Fremdschlüssel gespeichert werden?
	private String creation;
	private String filename;
	private String docType;
	private String category;
	private String content;
	
	//Verbindungen zu anderen Klassen
	//@ManyToOne
	//private DocumentStorage storage; //führt zu Konflikten in der Datenbank, muss anders gelöst werden

	
	//zugehoerige getters und setters
	@Id
	@GeneratedValue
	public int getDocId() {
		return docId;
	}

	//Wieso braucht man diese Funktion, wenn die Id durch @GeneratedValues automatisch generiert wird??
	public void setDocId(int docId) {
		this.docId = docId;
	}

	public int getVersId() {
		return versId;
	}

	public void setVersId(int versId) {
		this.versId = versId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCreation() {
		return creation;
	}

	public void setCreation(String creation) {
		this.creation = creation;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

/*
	public DocumentStorage getStorage() {
		return storage;
	}

	public void setStorage(DocumentStorage storage) {
		this.storage = storage;
	}*/
}
