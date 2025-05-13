# Conversor de Moedas em Java

Este é um programa simples de conversão de moedas, desenvolvido em Java, que utiliza a API [Exchangerate API](https://www.exchangerate-api.com/) para obter as taxas de câmbio e realizar conversões entre diferentes moedas.

## Funcionalidades

O programa oferece as seguintes opções de conversão:

1. Dólar (USD) para Peso Argentino (ARS)  
2. Peso Argentino (ARS) para Dólar (USD)  
3. Dólar (USD) para Real Brasileiro (BRL)  
4. Real Brasileiro (BRL) para Dólar (USD)  
5. Dólar (USD) para Peso Colombiano (COP)  
6. Peso Colombiano (COP) para Dólar (USD)  

## Como Funciona

O programa realiza uma consulta à API `Exchangerate API` para obter as taxas de câmbio entre as moedas selecionadas. Ele solicita ao usuário o valor da moeda que deseja converter e exibe o resultado da conversão.

### Estrutura do Código

1. **`ConversorDeMoedas`**: Classe principal que contém os métodos de conversão e faz a requisição para a API de taxas de câmbio.  
2. **`ConfigLoader`**: Classe responsável por carregar a chave da API a partir das variáveis de ambiente, garantindo que a chave não fique exposta no código.  

## Pré-requisitos

- Java instalado (versão 11 ou superior).  
- IntelliJ IDEA ou outro IDE para rodar o programa.  
- Chave de API obtida no site [Exchangerate API](https://www.exchangerate-api.com/).  

## Configuração da API

### 1. Como Obter a Chave de API

1. Acesse [Exchangerate API](https://www.exchangerate-api.com/) e crie uma conta.  
2. Após o registro, você receberá uma chave de API gratuita.  

### 2. Como Configurar a Variável de Ambiente

#### Crie um arquivo `.env` na raiz do projeto e adicione a chave da API nele:


## Configuração
Para usar o projeto, é necessário configurar a chave da API como variável de ambiente.

### Windows:
set EXCHANGE_API_KEY=sua_chave_aqui

### Linux/Mac:
export EXCHANGE_API_KEY=sua_chave_aqui

### Erro comum:
Se aparecer a mensagem "Erro: Chave da API não encontrada!", verifique se a variável está configurada corretamente.
