package Facebook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class fbdetails {
	
	
	Properties pro;
	
	public fbdetails() throws Exception {
		File src = new File("./Configuration/config.property");
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
	}
	
	public String getChrome() {
		String chrome = pro.getProperty("ChromeDriver");
		return chrome;
	}
	
	public String getFireFox() {
		String firefox = pro.getProperty("FirfoxDriver");
		return firefox;
	}
	
	public String getFbUrl() {
		String fburl = pro.getProperty("");
		return fburl;
	}
	
	public String getUserName() {
		String uname = pro.getProperty("FbUsername");
		return uname;
	}
	
	public String getPassWord() {
		String pwd = pro.getProperty("Fbpassword");
		return pwd;
	}

}
