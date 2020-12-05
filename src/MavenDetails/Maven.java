package MavenDetails;

public class Maven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//how to identify maven or java project project
			//In maven created folder MJ is wrriten on left side of folde
			// for simple java project its just J
		
		//after creating maven project 2 source folder will be created
			//src main java
		    // src test java
	
		//src main java
			//in src main java it creates dummy package we dont need delete it
	
		//POM .xml file
			//this file is heart of project very importatnt. here all dependancy for excel,sel, etc are specified
		
		//all the dependency needs to be added here
			// we will be using testng,apachi poi, selenium webdirver etc -- all dependency need to be added here
				//no need to download jar files for above dependency
		
		//inside the dependency we need to add the sel and other stuff
			//adding dependency for selenium webdrive maven
				//go to chrom and type webdriver maven
	}				// here u will find the dpenendcy . copy this and paste 
				// by adding dependencyies automatically jar files will be added 
			// problem with jar file
				//if new version is coming then each time we have to add new jar file
				//but in depenecnies we just have to change the version name rest everthing will be done automatio
					// becuase of this maven is called build automation tool
	
	//eclipse by default works with java so jdk is alreday added
	
	//For Test NG dependanacy  modify below
	//<scope>test</scope>
	// change it from test to compile
	
	//in Maven >> Dependancy folder all depedenacy fils will get downloded
	
	

}
