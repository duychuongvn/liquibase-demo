This sample demonstrate how to use liquibase to manage database
1. Create databases mysql: liquibase_demo, liquibase_demo_test
2. Update database connection informations: 
	- liquibase/liquibase_test.properties: This is test database, used to reference with main database to know what are changed and generate the change log
3. Build Maven
4. Run App.class
 
 ======================
 Reference: http://www.liquibase.org/index.html
 
 ======================
 Generate change log automatic:
 - Download library at http://www.liquibase.org/index.html
 - Copy database driver connector (mysql-java-connector.jar) to ${LIQUIBASE_HOME}/lib
 - Create liquibase.properties in ${LIQUIBASE_HOME}/liquibase.properties:
   + Main database	
   	driver:com.mysql.jdbc.Driver
	url:jdbc:mysql://192.168.0.13:3306/liquibase_demo
	username:root
	password:
   + Reference Database to get change log
		referenceDriver:com.mysql.jdbc.Driver
		referenceUrl:jdbc:mysql://192.168.0.13:3306/liquibase_demo_test
		referenceUsername:root
		referencePassword:
   
 - Run command: liquibase.bat diffChangeLog > output.xml
 - Copy output and paste onto db.changelog*.xml
 - Update Java Entity
 