# O dockerFile é necessario para dockerizar a oplicacao, ou seja, para que ela possa ser usada em outros ambientes e outras pessoas .
# O docker existe para que aqueles que trabalham com o codg possao executa0-lo em varis ambientes diferentes .

FROM maven:3.8.4-openjdk-17 AS build

LABEL authors="Yule"
# Defina o diretório de trabalho dentro do contêiner
WORKDIR /app
# Copie o arquivo pom.xml e as dependências do projeto
COPY pom.xml .
# O ( .) em ambietes Unix/Linux indica o diretorio atual, ouseja, a pasta atual sempre relativa ao contexto.
COPY src ./src

RUN mvn clean package

FROM openjdk:17-jdk-slim


# Copie o jar do estágio de construção anterior
COPY --from=build /app/target/dsgrove-0.0.1-SNAPSHOT.jar /app/dsgrove.jar
# Arquivo .Jar sao arquivos salvos do java e Jar significa : Java archive

# Exponha a porta que a aplicação irá rodar
EXPOSE 8080

# Comando para rodar a aplicação . CMD de ponto de entrada.
ENTRYPOINT ["java", "-jar", "dsgrove.jar"]


