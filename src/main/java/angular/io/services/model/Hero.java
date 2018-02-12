package angular.io.services.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.AllArgsConstructor;
import lombok.Data;

@XmlRootElement
public class Hero {

	@XmlAttribute
	int id;
	
	@XmlAttribute
	String name;
	
	public Hero(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Hero [id=%s, name=%s]", id, name);
	}

}
