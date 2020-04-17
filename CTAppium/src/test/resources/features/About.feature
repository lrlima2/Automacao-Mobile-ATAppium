#language: pt
#encoding: UTF-8
Funcionalidade: Acessar menu About

  @AcessaAbout
  Cenario: Acessar about
    Quando eu acionar a aba About
    Entao o aplicativo mostra a versao do sistema

  @AcessaCurso
  Cenario: Acessar o curso no navegador
    Quando eu acionar a aba About
    E acionar o botao Veja o curso aqui
    Entao o app mostra o curso no navegador
