# Factory Method Pattern

O Factory Method é um padrão criacional que define uma interface para criar objetos, mas permite que subclasses (ou uma fábrica dedicada) decidam qual classe concreta será instanciada.

---

## ❓ Problema

Imagine um sistema que envia notificações para usuários.
Inicialmente, ele envia apenas e-mail.
Com o tempo, surgem novos canais:

- SMS
- Push Notification
- WhatsApp

Uma abordagem comum é instanciar diretamente as classes usando `new`, espalhando decisões de criação pelo código.

Isso gera:
- forte acoplamento
- dificuldade de manutenção
- código difícil de estender

---

## ❌ Exemplo sem Factory Method

O serviço decide diretamente qual classe instanciar.

➡️ Veja a pasta `without-pattern`.

---

## ✅ Exemplo com Factory Method

Com o Factory Method:
- a lógica de criação fica centralizada
- o serviço depende apenas de abstrações
- adicionar novos tipos não exige mudanças no código cliente

➡️ Veja a pasta `with-pattern`.

---

## 🧠 Quando usar

Use Factory Method quando:
- o código precisa criar objetos, mas não deve conhecer suas classes concretas
- há variação no tipo de objeto criado
- você quer centralizar regras de criação

---

## ⚠️ Quando não usar

Evite quando:
- existe apenas uma implementação concreta
- a criação do objeto é trivial e não muda

---

## 📌 Benefícios

- Reduz acoplamento
- Facilita extensão
- Centraliza regras de criação
- Código mais limpo e testável

---

## 📎 Conclusão

Factory Method separa **o que o sistema faz** de **como os objetos são criados**, tornando o código mais flexível e preparado para mudanças.
