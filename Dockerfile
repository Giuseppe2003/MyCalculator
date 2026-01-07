# ======================
# 1) BUILD
# ======================
FROM maven:3.9-eclipse-temurin-21 AS build

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

# Copia il codice sorgente
COPY src ./src

# Compila il progetto
RUN mvn package -DskipTests

# ======================
# 2) RUNTIME
# ======================
FROM eclipse-temurin:21-jre

WORKDIR /app

# Copia il jar prodotto
COPY --from=build /app/target/*.jar app.jar

# Avvio applicazione
CMD ["java", "-jar", "app.jar"]
