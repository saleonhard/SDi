[![Hits](https://hits.seeyoufarm.com/api/count/incr/badge.svg?url=https%3A%2F%2Fgithub.com%2Fsaleonhard%2FSDi&count_bg=%2379C83D&title_bg=%23555555&icon=&icon_color=%23E7E7E7&title=hits&edge_flat=false)](https://hits.seeyoufarm.com)

![aa](https://github.com/user-attachments/assets/dfd559f7-ce8f-4f92-8308-e1295ebeaf26)

# Projeto Acadêmico: Sistema de Divulgação de Informação (SDI)

**Projeto acadêmico desenvolvido entre 2018 e 2019.**

O **Sistema de Divulgação de Informação (SDI)** é uma aplicação destinada ao gerenciamento e envio de informações importantes para servidores de diferentes campi de uma instituição. Ele facilita a comunicação com os servidores cadastrados, garantindo que todos sejam informados de maneira rápida e centralizada.

| ![2](https://github.com/user-attachments/assets/88a868f9-6209-413e-a4f7-d7cbbb950ab7) | ![3](https://github.com/user-attachments/assets/b9fdce84-d4ba-41d9-8175-5b54b7d83edd) |
|:------------------------------------------------------:|:------------------------------------------------------:|
| ![7](https://github.com/user-attachments/assets/e3cc8682-0ae5-4b13-9dd0-6e41beca06fd) | ![9](https://github.com/user-attachments/assets/57c4364e-bb0c-4ca6-ab79-2adea3adb4ac) |



## Funcionalidades

- **Cadastro de Campus**: Registrar diferentes campi da instituição.
- **Cadastro de Servidores**: Cadastrar servidores da instituição para que possam receber notificações.
- **Envio de Notícias**: Permite a criação e envio de notícias para os servidores via e-mail.
- **Gerenciamento de Solicitações**: Gestão de solicitações realizadas pelos servidores para a criação de notícias.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação para o desenvolvimento do sistema.
- **JDBC**: Biblioteca Java para conectar o sistema com o banco de dados MySQL.
- **JavaMail**: Biblioteca para envio de e-mails via SMTP.
- **MySQL**: Banco de dados relacional para armazenamento de dados.
- **Properties**: Arquivo de configuração para o banco de dados e servidor SMTP.

## Pré-requisitos

Antes de rodar o projeto, você precisa garantir que os seguintes pré-requisitos estão atendidos:

- **Java 8 ou superior** instalado.
- **MySQL** instalado e em funcionamento.
- **Biblioteca JavaMail** (ou seja, `javax.mail.jar` para envio de e-mails via SMTP).
- **Biblioteca Activation** (necessária para o funcionamento correto do JavaMail).
- **Biblioteca do MySQL** (necessária para a integração com o banco de dados MySQL).

Todas as bibliotecas necessárias estão localizadas dentro da pasta `lib/` no projeto. Certifique-se de adicionar essas bibliotecas ao seu classpath.

## Como Configurar

### 1. Banco de Dados

O código para criação do banco de dados, incluindo as tabelas necessárias para o funcionamento do sistema, estará disponível na pasta `sql/` dentro do projeto. Execute os scripts SQL para criar as tabelas no seu banco de dados MySQL.

### 2. Configuração do arquivo `config.properties`

O arquivo `config.properties` contém as configurações para o banco de dados e o servidor SMTP para o envio de e-mails. Aqui estão as configurações básicas:

```properties
# Configurações do banco de dados
db.driver=com.mysql.cj.jdbc.Driver  # Atualizado para versões mais recentes do MySQL
db.url=jdbc:mysql://localhost:3306/db_sdi
db.username=root
db.password=suasenha

# Configurações do servidor SMTP
smtp.host=smtp.gmail.com
smtp.port=465
smtp.socketFactory.port=465
smtp.socketFactory.class=javax.net.ssl.SSLSocketFactory
smtp.auth=true
smtp.ssl.enable=true
smtp.ssl.protocols=TLSv1.2

# Credenciais para autenticação SMTP
smtp.username=seu_email@gmail.com
smtp.password=sua_senha # Substitua com a senha de aplicativo (caso 2FA esteja ativado)
```

### 3. Contribuições

Contribuições para este projeto são bem-vindas! Se você encontrar bugs ou tiver sugestões de melhorias, sinta-se à vontade para fazer um fork do repositório e enviar um pull request.
