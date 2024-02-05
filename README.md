___
## Requirements
- **Java**: Version 17
- **Maven**: Make sure Maven is installed on your system. You can download it
  from [here](https://maven.apache.org/download.cgi).
- Postgres DB
- Bibernate ORM
- Flyway

___
## Getting Started with DEMO app

To start working on our project in the demo app, follow these steps:

1. **Clone the Repository Bibernate app:**
   ```bash
   git clone https://github.com/Svydovets-Bobocode-Java-Ultimate-3-0/Bibernate.git
   cd Bibernate
    ```

2. **Build the Project:**
   ```bash
    mvn clean install
    ```
   
3. **Init DB configuration**

***By default use:***

database : Postgres DB / database name : postgres / schema name : svydovets-demo

```
src/java/resources/db/migration/application.properties
db.url=jdbc:postgresql://localhost:5432/postgres?currentSchema=[SCHEMA]
db.user=[USER]
db.password=[PASSWORD]
```

4. **Init DB configuration in pom file from flyway migratioms**
```
<build>
    <plugins>
        <plugin>
            ...
            <configuration>
                <driver>org.postgresql.Driver</driver>
                <url>jdbc:postgresql://localhost:5432/</url>
                <user>[USER]</user>
                <password>[PASSWORD]</password>
                <schemas>[SCHEMA]</schemas>
            </configuration>
            ...
        </plugin>
    </plugins>
</build>
```

5. **Migrate data:**
```bash
cd Bibernate
mvn flyway:migrate
```

6. **Run the application:**
```java
  public class DemoApp {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new SessionFactory();
        Session session = sessionFactory.createSession();
        
        ...
    
        session.close();
    }
}
```

7. 2. **Build the Demo Project:**
```bash
 mvn clean install
 ```

8. **Enjoy :)**