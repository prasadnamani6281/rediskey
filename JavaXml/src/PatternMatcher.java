import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

public class PatternMatcher { 
	
	private HashMap<DataType,ArrayList<String>> typeWithPatternMap;
	private TypeRegexMapper mapper;
	
	PatternMatcher(TypeRegexMapper mapper){
		this.mapper=mapper;
	}
	
	public boolean checkPattern(String type,String value) {
		
		   typeWithPatternMap=mapper.getMap();
		   
		   if(type!=null && value!=null) {
			   
			   DataType datatype=DataType.valueOf(type.toUpperCase());
			   
			   if(typeWithPatternMap.containsKey(datatype)) {
				   ArrayList<String> listofPatterns=typeWithPatternMap.get(datatype);
				   for(String regex:listofPatterns) {
					  if(Pattern.matches(regex,value)) {
						  return true;
					   }
				   }	
			   } 
			   
		    }
		   
		  return false;
		
	}

}
