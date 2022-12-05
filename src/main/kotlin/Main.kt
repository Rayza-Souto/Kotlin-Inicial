fun printMessage(message: String): Unit {                               // chama a mensagem
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // chama a mensagem com o prefixo. Se não colocar nada no prefixo, sempre virá como "Log"
    println("[$prefix] $message")                                       //como foi inserido o prefixo, vai imprimir com o dado inserido
}

fun sum(x: Int, y: Int): Int {                                          // soma com retorno
    return x + y
}

fun multiply(x: Int, y: Int) = x * y                                    // multiplicação sem retorno, também funciona

fun main() {
    printMessage("Hello")                                               // apenas a mensagem
    printMessageWithPrefix("Hello", "Log")                              // não é necessário deixar explicito a variavel
    printMessageWithPrefix("Hello")                                     // sem dado para o prefixo, vai como info
    printMessageWithPrefix(prefix = "Ray", message = "Hello")           // deixando a atribuição explicita e alterando o dado do prefixo
    println(sum(1, 2))                                                  // 9
    println(multiply(2, 4))                                             // inserido o valor das variaveis
}