import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestPropertiesFile {
	static Properties p = new Properties();
	
	static String getProperties(String key) throws IOException{
		FileReader reader=new FileReader("info.properties");  
	    p.load(reader);
		return p.getProperty(key);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		p.setProperty("name","Aniket Gapat");  
		p.setProperty("email","aniketgapat@yahoo.com");  
		  
		p.store(new FileWriter("info.properties"),"Javatpoint Properties Example");  
		
		FileReader reader=new FileReader("info.properties");  
	    p.load(reader);  
	      
	    System.out.println(p.getProperty("name"));  
	    System.out.println(p.getProperty("email"));
	    
	    System.out.println("get proerty using method");
	    System.out.println(getProperties("name"));
	}

}
