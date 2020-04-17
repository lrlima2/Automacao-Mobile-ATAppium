#language: pt
#encoding: UTF-8
Funcionalidade: Menu Alertas

  Contexto: 
    Dado que eu acesse o menu alertas

  @AlertaSimples
  Cenario: Alerta Simples
    Quando eu clicar no botao Alerta Simples
    Entao o aplicativo mostra uma mensagem simples
    E eu clico em ok

  @AlertaRestritivo
  Cenario: Alerta Restritivo
    Quando eu clicar no botao Alerta Restritivo
    Entao o sistema mostra uma mensagem
    Entao eu clico em sair restritivo

  @AlertaConfirm
  Cenario: Alerta Confirm
    Quando eu clicar no botao Alerta Confirm
    E clicar em confirmar
    Entao o sistema mostra a mensagem de confirmacao
    E eu clico em sair confirm
