#language: pt
#encoding: UTF-8
Funcionalidade: Menu Formulario

  Contexto: 
    Dado que eu acesse o menu Formulario

  @CasastrarUsuarioSimples
  Cenario: cadastrar usuario simples
    Quando eu preencher o campo nome com "Leonardo"
    E tocar em salvar
    Entao o app mostra o usuario cadastrado
