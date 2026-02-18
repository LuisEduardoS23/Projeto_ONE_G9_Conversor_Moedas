# 💱 Conversor de Moedas (Refatorado com Spring)

Pequeno projeto backend para conversão de moedas usando uma API externa.
O objetivo principal foi **refatorar um projeto antigo** que estava desorganizado e reescrever tudo usando Spring Boot para praticar boas práticas básicas de backend Java.

> ⚠️ Projeto simples feito com foco em aprendizado.

---

# ✨ Motivação

Eu já tinha feito um conversor de moedas antes, mas o código estava bagunçado, difícil de entender e manter.
Então decidi refazer tudo com Spring para praticar arquitetura em camadas, organização de código e consumo de APIs externas.

---

# 🆚 Comparação das Versões

## 🔴 Versão Antiga

* Código sem padrão de arquitetura
* Classes grandes misturando responsabilidades
* Difícil de entender e evoluir
* Sem tratamento adequado de erros
* Estrutura improvisada

## 🟢 Nova Versão (Spring Boot)

* Arquitetura em camadas (Controller → Service → Client)
* Consumo organizado de API externa
* Código mais limpo e legível
* Separação de responsabilidades
* Melhor organização geral do projeto

Nada muito avançado, mas já bem mais fácil de manter.

---

# 🛠️ Tecnologias Usadas

* Java
* Spring Boot
* Spring Web
* Consumo de API externa de câmbio
* Maven

---

# 📂 Estrutura do Projeto

```
src/main/java
 ├── controller   → Endpoints da API
 ├── service      → Regras de negócio
 ├── client       → Consumo da API externa
 ├── model        → Classes de dados
 └── config       → Configurações
```

---

# 🔑 Configuração da API Key

O projeto usa uma API externa para buscar taxas de câmbio.
Por segurança, **a chave não está no repositório**.

Você precisa criar seu próprio arquivo.

## 1️⃣ Criar o arquivo

Na raiz do projeto, crie um arquivo chamado:

```
api-key.txt
```

Dentro dele coloque apenas sua chave:

```
SUA_API_KEY_AQUI
```

## 2️⃣ Conseguir uma chave

Crie uma conta em qualquer serviço de câmbio compatível (como ExchangeRate-API ou outro semelhante).

## 3️⃣ Não subir no GitHub

Adicione no `.gitignore`:

```
api-key.txt
```

Assim sua chave fica protegida.

---

# 🚀 Como Rodar o Projeto

1. Clone o repositório
2. Crie o `api-key.txt` com sua chave
3. Rode o projeto com:

```
mvn spring-boot:run
```

Ou execute pela sua IDE.

---

# 📚 O que eu aprendi

* Organização básica com Spring Boot
* Consumo de APIs externas
* Separação em camadas
* Importância de código mais limpo e organizado

---

# 📌 Possíveis Melhorias Futuras

* Salvar histórico de conversões em banco de dados
* Testes automatizados
* Cache de taxas
* Interface web simples

