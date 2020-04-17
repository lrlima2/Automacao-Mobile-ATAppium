#language: pt
#encoding: UTF-8
Funcionalidade: Menu Seu Barriga Hibrido

  @SeuBarrigaHibridoNovoUsuario
  Cenario: cadastrar um usuario no Seu Barriga Hibrido
    Dado que eu acesse o menu Seu Barriga Hibrido
    Quando eu tocar na aba no usuario
    E preencher o campo nome com "Leonardo Rodrigues"
    E preencher o campo email com "leonardorodrigues@email.com"
    E preencher o campo senha com "123456"
    E acionar o botao cadastrar
    Entao o aplicativo mostra o usuario cadastrado

  @SeuBarrigaHibridoLogin
  Cenario: realizar login no seu Barriga Hibrido
    Dado que eu acesse o menu Seu Barriga Hibrido
    E eu preencher o campo email com "leonardorodrigues@email.com"
    E eu preencher o campo senha com "123456"
    E acionar o botao entrar
    Entao o aplicativo mostra o usuario logado
