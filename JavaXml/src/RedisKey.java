import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
//$Id$
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="RedisKey")
public class RedisKey {
	
	@XmlAttribute(name="name")
	private String name;
	
	@XmlAttribute(name="regex")
	private String regex;
	
	@XmlAttribute(name="type")
	private String type;
	
	@XmlAttribute(name="description")
	private String description;
	
	public RedisKey() {
		
	}
	
	public RedisKey(String name, String regex, String type, String description) {
		super();
		this.name = name;
		this.regex = regex;
		this.type = type;
		this.description = description;
	}
	@Override
	public String toString() {
		return "RedisKey [name=" + name + ", regex=" + regex + ", type=" + type + ", description=" + description + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegex() {
		return regex;
	}
	public void setRegex(String regex) {
		this.regex = regex;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
