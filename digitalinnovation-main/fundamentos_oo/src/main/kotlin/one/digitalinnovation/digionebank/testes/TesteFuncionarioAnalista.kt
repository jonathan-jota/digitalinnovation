package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista


fun main() {
    val jonathan = Analista("Jonathan Afonso", "123.456.789-0", 2000.0)
    ImprimeRelatorioFuncionario.imprime(jonathan)
}

