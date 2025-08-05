
# 🗨️ FórumHub

**FórumHub** é uma API RESTful desenvolvida com Java e Spring Boot, que permite o **cadastro, listagem, atualização e exclusão de tópicos** de discussão. Ideal para integrar fóruns educacionais, acadêmicos ou qualquer sistema que necessite de tópicos organizados por curso.

---

## 🚀 Funcionalidades

- ✅ Cadastrar novo tópico
- 📄 Listar todos os tópicos
- 🔍 Buscar tópico por ID
- ✏️ Atualizar dados de um tópico
- ❌ Excluir um tópico
- 🔐 Segurança com autenticação configurada

Cada tópico possui os seguintes atributos:

- **Título**
- **Mensagem**
- **Estado do Tópico** (ex: `NAO_RESPONDIDO`, `RESPONDIDO`, `FECHADO`)
- **Curso**

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **Spring Security**
- **Flyway** – Migrations automáticas do banco de dados
- **Lombok** – Redução de boilerplate com anotações (@Getter, @Setter, etc.)
- **MySQL** – Banco de dados relacional
- **Insomnia** – Testes de requisições HTTP

---

## 🔒 Segurança

A aplicação conta com configuração de segurança via Spring Security, protegendo endpoints sensíveis e garantindo controle de acesso.

---

## 🧪 Como rodar o projeto

1. **Clone o repositório:**

```bash
git clone https://github.com/natashaalmeida/forumhub.git
cd forumhub
```

2. **Configure o banco de dados em `application.properties`:**

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/forumhub
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=validate
spring.flyway.enabled=true
```

3. **Execute a aplicação:**

```bash
./mvnw spring-boot:run
```

4. **API disponível em:**

```
http://localhost:8080
```

---

## 🔐 Autenticação HTTP Basic

Para testar os endpoints no Insomnia, adicione autenticação básica:

- **Username:** `natasha`
- **Password:** `93521257`

### Como configurar no Insomnia:

1. Vá até a aba **"Auth"** da requisição
2. Selecione o tipo **"Basic Auth"**
3. Preencha:
   - Username: `natasha`
   - Password: `93521257`

Agora todas as requisições terão autenticação e serão aceitas pela API.

> ⚠️ Atenção: a autenticação usa `NoOpPasswordEncoder`, o que **não é seguro para produção**. Use `BCryptPasswordEncoder` ou outro encoder seguro em ambientes reais.

---

## 🔧 Testando com Insomnia

### 1. Crie um novo workspace
- Abra o Insomnia
- Clique em `New Workspace` → Escolha `Design` ou `Debug`

### 2. Exemplo de requisições

#### ➕ Criar tópico (POST `/topicos`)
```json
POST http://localhost:8080/topicos
Content-Type: application/json

{
  "titulo": "Erro ao compilar projeto",
  "mensagem": "O projeto não compila no Eclipse",
  "estado": "NAO_RESPONDIDO",
  "curso": "Java Spring Boot"
}
```

#### 📄 Listar tópicos (GET `/topicos`)
```http
GET http://localhost:8080/topicos
```

#### 🔍 Buscar por ID (GET `/topicos/{id}`)
```http
GET http://localhost:8080/topicos/1
```

#### ✏️ Atualizar tópico (PUT `/topicos/{id}`)
```json
PUT http://localhost:8080/topicos/1
Content-Type: application/json

{
  "titulo": "Erro ao rodar projeto",
  "mensagem": "O projeto quebra ao iniciar",
  "estado": "RESPONDIDO",
  "curso": "Spring Boot"
}
```

#### ❌ Deletar tópico (DELETE `/topicos/{id}`)
```http
DELETE http://localhost:8080/topicos/1
```

---

## 🧠 Melhorias Futuras

- Autenticação com JWT
- Associação de autor aos tópicos
- Paginação e ordenação
- Busca por estado ou curso
- Integração com front-end React

---

## 👩‍💻 Desenvolvido por

**Natasha Almeida**  
[🔗 GitHub](https://github.com/natashaalmeida)

---

## 📌 Licença

Projeto com licença **MIT** – use e contribua como quiser!
