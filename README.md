**Selenium junit5 Allure reporting**

to run tests
>mvn clean test
> 
add allure.properties file in resources folder
allure.results.directory=target/allure-results
>
test reports are generate in target/allure-results
> allure serve target/allure-reports
> 
>
> 
**>dependencies**
<properties>
<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
<maven.compiler.release>21</maven.compiler.release>
<allure.version>2.26.0</allure.version>
<aspectj.version>1.9.22</aspectj.version>
</properties>

  <dependencyManagement>
    <dependencies>
      <!-- https://mvnrepository.com/artifact/io.qameta.allure/allure-bom -->
      <dependency>
        <groupId>io.qameta.allure</groupId>
        <artifactId>allure-bom</artifactId>
        <version>${allure.version}</version>
        <type>pom</type>
        <scope>import</scope>
      </dependency>
    </dependencies>
  </dependencyManagement>
  <!-- Add necessary Allure dependencies to dependencies section -->
  <dependencies>
    <dependency>
      <groupId>io.qameta.allure</groupId>
      <artifactId>allure-junit5</artifactId>
      <scope>test</scope>
    </dependency>
    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>4.29.0</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/org.assertj/assertj-core -->
    <dependency>
      <groupId>org.assertj</groupId>
      <artifactId>assertj-core</artifactId>
      <version>3.27.3</version>
      <scope>test</scope>
    </dependency>
  </dependencies>


**plugins**

<build>
<plugins>
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-surefire-plugin</artifactId>
<version>3.2.3</version>
<configuration>
<argLine>
-javaagent:"${settings.localRepository}/org/aspectj/aspectjweaver/${aspectj.version}/aspectjweaver-${aspectj.version}.jar"
</argLine>
</configuration>
<dependencies>
<dependency>
<groupId>org.aspectj</groupId>
<artifactId>aspectjweaver</artifactId>
<version>${aspectj.version}</version>
</dependency>
</dependencies>
</plugin>
</plugins>
</build>