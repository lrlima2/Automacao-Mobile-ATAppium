#language: pt
#encoding: UTF-8
Funcionalidade: Menu Seu Barriga Nativo

  @SeuBarrigaNativoLogin
  Cenario: realizar login no seu Barriga Nativo
    Dado que eu acesse o menu Seu Barriga Nativo
    E eu preencher o campo nome nativo com "Leonardo Rodrigues"
    E eu preencher o campo senha nativo com "123456"
    E acionar o botao entrar nativo
    Entao o aplicativo mostra a mensagem de erro
