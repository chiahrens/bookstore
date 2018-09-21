# Simple Web Service app using Spring and CXF

## Getting Started
```
git clone https://github.com/chiahrens/bookstore.git
cd bookstore
mvn clean install
mvn tomcat:run
```

Insert new book
```
curl -d '{"title":"Harry Potter", "author":"J K Rollins"}' \
-H "Content-Type: application/json" \
-X POST http://localhost:8080/bookstore/books
```

Get all books
```
curl http://localhost:8080/bookstore/books
```

Get one book by id
```
curl http://localhost:8080/bookstore/books/0
```

Update book
```
curl -d '{"title":"Harry Potter 2", "author":"J K Rollins"}' \
-H "Content-Type: application/json" \
-X PUT http://localhost:8080/bookstore/books/0
```

Delete book by id
```
curl -X DELETE http://localhost:8080/bookstore/books/0
```

## To import into eclipse
File -> Import -> Maven -> Existing Maven Projects

## File descriptions
src/main/webapp/WEB-INF/web.xml - initialize spring and load the cxf servlet  
src/main/webapp/WEB-INF/beans.xml - spring config file with auto loading by annotation and cxf jaxrs server  
src/main/java/com/walmart/service - Service interface and implementation  
src/main/java/com/walmart/dao - DAO  
src/main/java/com/walmart/data/Book - pojo  
src/main/java/com/walmart/data/DataStore - in-memory data store  
