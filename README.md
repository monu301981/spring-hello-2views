# spring-hello-2views
Spring app with default view and another Requestmapping view

# Set up Java

1. Insatll Java
2. Define JAVA_HOME = \jdk.x
3. Add this variable to the path pointing bin %JAVA_HOME%\bin


# Set up maven

1. Download maven from URL provided on Maven website https://maven.apache.org/download.cgi
2. Unzip binary file and place it it any folder
3. Set up MAVEN_HOME = \path to maven root folder
4. Add this to system path pointing %MAVEN_HOME%\bin

# VS Code

1. Download VS code 
2. Install extensions like Java, Debugger in Java, Extension pack for JAVA, Gradle for Java, Maven CLeaner, Maven Dependency Explorer, Maven for java, Project Manager for Java, Spring Boot Extension pack, Spring Boot dashboard, Spring Boot snippets, Spring boot tools, Spring Initializr Java support, Test runner for java
3. Restart VS code 
4. Import this project and run.
5. Start working on new project which is template based.

# Basic source of code

1. Go to https://start.spring.io
2. Select Dependencies - Web, Security, JPA, H2, Jersey, Jasper


# Useful links:

Display JSP pages: https://www.logicbig.com/tutorials/spring-framework/spring-boot/boot-serve-dynamic.html

# Strange Problem faced

1. If your username folder in Users/ folder has spaces the maven commands will not work.
2. The application fails in mvnw.cmd file. 
3. A work around for this is to replace $HOME in mvnw.cmd file with "/~/", which denotes the current user folder.