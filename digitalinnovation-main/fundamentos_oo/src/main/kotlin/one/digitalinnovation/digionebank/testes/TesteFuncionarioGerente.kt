package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente


fun main() {
    val sofia = Gerente("Sofia Gregorio", "123.456.789-0", 6000.0, "senha1234")

    ImprimeRelatorioFuncionario.imprime(sofia)

    TesteAutenticacao().autentica(sofia)

}

