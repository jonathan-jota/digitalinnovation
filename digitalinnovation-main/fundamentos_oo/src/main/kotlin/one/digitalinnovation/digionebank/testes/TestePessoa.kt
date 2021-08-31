package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa


fun main () {
    val jonathan = Pessoa(nome = "Jonathan Afonso", cpf = "123.456.789-0")

    println(jonathan.nome)
    println(jonathan.cpf)
}