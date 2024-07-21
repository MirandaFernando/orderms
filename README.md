# locadora-api


git clone https://github.com/MirandaFernando/orderms

cd orderms

Verificar versão do java ( java --version) deve estar na versão 21

No linux para escolher diferentes versões do java é preciso fazer sudo update-alternatives --config java

mvn dependency:resolve  (precisa estar na vesão 21 do Java)  - Para instalar mvn no [windows](https://dicasdeprogramacao.com.br/como-instalar-o-maven-no-windows/)  ou [linux](https://dicasdeprogramacao.com.br/como-instalar-o-maven-no-windows/)

Se tudo ocorreu como esperado: [INFO] BUILD SUCCESS


Abrir o projeto na sua IDE de preferência.
Escolher o arquivo application.properties e configurar o banco de dados.

Criar um banco de dados chamado locadora ( o esquema será gerado via JPA)

Executar o projeto ( executar/debugar o arquivo LocadoraApiApplication.java)

Se tudo ocorreu conforme orientado, as tabelas do banco terão sido criadas.
