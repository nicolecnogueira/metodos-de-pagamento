## Diagrama de classes:

![Classes](https://github.com/gustavoleitao/imd0040-atv05/blob/main/src/main/resources/atv5-uml.png?raw=true)

A classe ProcessadorPagamentos` simula o processamento de um pagamento feito com um ou mais métodos de pagamento.

O processador de pagamentos itera sobre os métodos e chama o método debitar. No entanto, se houver alguma falha, este estorna o pagamento daqueles já processados com sucesso.

Ou seja, basta uma falha que todos os outros métodos já debitados anteriores serão estornados.

## Testes

O programa possui testes automatizados implementados. Se quiser testar execute o seguinte comando:

```console
$ ./gradlew test
```
