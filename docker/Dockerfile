# Étape 1: Utiliser une image Maven basée sur Alpine pour builder l'application
FROM maven:3-amazoncorretto-17-al2023 AS build

# Définir le répertoire de travail dans le conteneur
WORKDIR /app

# Copier le fichier pom.xml et télécharger les dépendances Maven
COPY pom.xml .
RUN mvn dependency:go-off.line -B

# Copier le code source du projet
COPY src ./src

# Compiler le projet et construire le fichier jar
RUN mvn clean package -DskipTests

# Étape 2: Utiliser une image JDK Alpine pour exécuter l'application
FROM openjdk:17-jdk-alpine

# Définir le répertoire de travail
WORKDIR /app

# Copier le fichier JAR construit depuis l'étape précédente
COPY --from=build /app/target/*.jar app.jar

# Exposer le port utilisé par Spring Boot (par défaut 8080)
EXPOSE 8080

# Commande pour exécuter l'application Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]
