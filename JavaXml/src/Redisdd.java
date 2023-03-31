
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

//$Id$

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="redis-dd")
public class Redisdd {
	
	@XmlAttribute(name="clusterName")
	private String clusterName;
	
	@XmlElement(name="redisKey")
	private ArrayList<RedisKey> redisKey;
	
    public Redisdd() {
		
	}
	
	public Redisdd(String clusterName) {
		this.clusterName = clusterName;
	}
	
	@Override
	public String toString() {
		return "Redisdd [clusterName=" + clusterName + "]";
	}
	
	public String getClusterName() {
		return clusterName;
	}
	
	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}
	
	public ArrayList<RedisKey> getRedisKey() {
		return redisKey;
	}
	public void setRedisKey(ArrayList<RedisKey> redisKey) {
		this.redisKey = redisKey;
	}

}
