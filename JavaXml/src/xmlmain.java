import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

//$Id$

public class xmlmain {
	
	public static void main(String[] args) {
		
		TypeRegexMapper mapper=new TypeRegexMapper();
		
		try {
			
			JAXBContext jaxbContext=JAXBContext.newInstance(Redisdd.class);
			Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
			File file=new File("/Users/prasad-pt6857/Documents/ZOHO/JavaXml/xmlfile/File.xml");
			Redisdd redisdd=(Redisdd)unmarshaller.unmarshal(file);
			
			ArrayList<RedisKey> rediskeys=redisdd.getRedisKey();
			
			for(RedisKey key:rediskeys) {
			  mapper.Reader(key.getType(),key.getRegex());
			}
			
			mapper.display();
		}
		catch(Exception e) {
			e.printStackTrace();
	    }
		
		
		PatternMatcher matcher=new PatternMatcher(mapper);
		
		String dtype="string";
		String value="123_isAllDepViewEnabled";
		
		if(matcher.checkPattern(dtype,value)) {
			System.out.println("Matched!!!\ndtype="+dtype+"\nvalue="+value);
		}
		else {
			System.out.println("Not Matched!!!!");
		}
		
	

  }
}
