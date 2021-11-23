# FrameworkDigitalBlogRestApi
## Api RESTful para o projeto BlogWebApp.

BlogWebApp: https://github.com/raphaelheizer/BlogWebApp

### Observações
**IMPORTANTE: A aplicação não está finalizada. Ela apenas atende às necessidades do front (BlogWebApp)**

  É importante observar que a snapshot/database dump do banco de dados PostgreSQL está na na raíz do projeto com o nome de DatabaseSnapshot.
  
  Esta aplicação executa a versão 16 do java com Spring Boot 2.6.0.
  
### Instruções para a execução
  Utilize o arquivo de dump do banco de dados para criar uma snapshot no postgreSQL com a database de nome frameworkdigitalblog. O Usuário utilizado é postgres.
  Acredito que não necessite de senha para acessar a database, mas de qualquer forma, também é postgres.
  
  Caso necessite alterar alguma configuração do banco de dados, coloquei tudo em application.properties para facilitar.
  
  Após finalizar esta etapa, basta compilar e executar a aplicação. Ela será executada em localhost:8080 (default)
  
  A aplicação front end feita em Angular (BlogWebApp) precisará ser executada à parte
