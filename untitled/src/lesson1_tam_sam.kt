import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val queue: Queue<String> = LinkedList()
    var totalSales = 0.0

    while (true) {
        println("\n=== КАССОВОЕ ОБСЛУЖИВАНИЕ ===")
        println("1. Добавить клиента в очередь")
        println("2. Обслужить клиента")
        println("3. Показать очередь")
        println("4. Показать общую выручку")
        println("5. Выход")
        print("Выберите действие: ")

        when (scanner.nextInt()) {
            1 -> {
                print("Введите имя клиента: ")
                val name = scanner.next()
                queue.add(name)
                println("Клиент $name добавлен в очередь")
            }
            2 -> {
                if (queue.isNotEmpty()) {
                    val client = queue.poll()
                    print("Введите сумму покупки для $client: ")
                    val amount = scanner.nextDouble()
                    totalSales += amount
                    println("Клиент $client обслужен на сумму ${String.format("%.2f", amount)} руб.")
                } else {
                    println("Очередь пуста, некого обслуживать")
                }
            }
            3 -> {
                if (queue.isNotEmpty()) {
                    println("Очередь клиентов: $queue")
                } else {
                    println("Очередь пуста")
                }
            }
            4 -> {
                println("Общая выручка: ${String.format("%.2f", totalSales)} руб.")
            }
            5 -> {
                println("До свидания!")
                return
            }
            else -> println("Неверный выбор, попробуйте снова")
        }
    }
}