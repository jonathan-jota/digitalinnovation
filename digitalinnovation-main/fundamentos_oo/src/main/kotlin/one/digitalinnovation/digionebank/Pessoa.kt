package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Jonathan"
    var cpf: String = "123.456.789-00"
    private set //impede a alteração do cpf
}

fun main () {
    val jonathan = Pessoa()

    println(jonathan.nome)
    println(jonathan.cpf)
}
