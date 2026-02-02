# Strategy Pattern

O Strategy Pattern é um padrão comportamental que permite **definir uma família de algoritmos**, encapsulá-los e torná-los **intercambiáveis**, sem que o código que os utiliza precise conhecer seus detalhes internos.

---

## ❓ Problema

Imagine um sistema que processa pagamentos.  
Inicialmente, ele suporta apenas cartão de crédito.  
Com o tempo, surgem novas formas de pagamento:

- PIX
- Boleto
- Carteira digital

Uma implementação ingênua tende a usar vários `if/else` ou `switch`, o que torna o código:
- difícil de manter
- difícil de testar
- difícil de estender

---

## ❌ Exemplo sem Strategy

No exemplo abaixo, o serviço de pagamento precisa saber **como** cada pagamento funciona.

Qualquer novo método de pagamento exige modificar essa classe.

➡️ Veja a pasta `without-pattern`.

---

## ✅ Exemplo com Strategy

Com o Strategy Pattern:
- cada forma de pagamento vira uma estratégia
- o serviço principal apenas **delegar a execução**
- novas estratégias podem ser adicionadas sem alterar código existente

➡️ Veja a pasta `with-pattern`.

---

## 🧠 Quando usar

Use Strategy quando:
- há múltiplas variações de um mesmo comportamento
- você vê muitos `if/else` baseados em tipo
- regras de negócio mudam com frequência

---

## ⚠️ Quando não usar

Evite Strategy quando:
- existe apenas um comportamento fixo
- a variação nunca vai mudar
- a complexidade não se justifica

---

## 📌 Benefícios

- Código mais limpo
- Aberto para extensão e fechado para modificação (OCP)
- Fácil de testar
- Alta legibilidade

---

## 📎 Conclusão

Strategy ajuda a remover decisões condicionais do código principal e torna o sistema mais flexível e preparado para crescimento.
