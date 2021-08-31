package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val jonathan = Pessoa("Jonathan Afonso", "123.456.789-0")
    println(jonathan.nome)
    println(jonathan.cpf)

    val jose = Funcionario("Jose Silva", "123.456.789-0", BigDecimal.valueOf(2500.0))
    println(jose.nome)
    println(jose.cpf)
    println(jose.salario)
}