
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
//$Id$

//import com.adventnet.rediskey.DataType;

//import com.adventnet.rediskey.DataType;


enum DataType{
	HASH,
	STRING,
	SET,
	LIST,
	INTEGER;
 }


public class TypeRegexMapper {
	private HashMap<DataType,ArrayList<String>> typeregexmap;
	
     TypeRegexMapper(){
    	 typeregexmap=new HashMap<DataType,ArrayList<String>>();
	}
	
	public HashMap<DataType, ArrayList<String>> getMap() {
		return typeregexmap;
	}


	public void setMap(HashMap<DataType, ArrayList<String>> typeregexmap) {
		this.typeregexmap = typeregexmap;
	}


	public void display(){
		
	for (Entry<DataType, ArrayList<String>> e : typeregexmap.entrySet()) {
	    DataType type = e.getKey();
	    System.out.println(type);
	    for (String value : e.getValue()) {
	           System.out.println(value);
	    }
	}
  }
	
	
public void Reader(String type,String regex) {
		
		DataType dtype=DataType.valueOf(type.toUpperCase());
		
		if(typeregexmap.containsKey(dtype)) {
			ArrayList<String> listofregexes = typeregexmap.get(dtype);
			listofregexes.add(regex);
			typeregexmap.put(dtype,listofregexes);	
		}
		
		else {
			ArrayList<String> listofregexes=new ArrayList<String>();
			listofregexes.add(regex);
			typeregexmap.put(dtype,listofregexes);	
		}
		
	}
		
}
