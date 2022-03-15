fun main() {
    val a = 7
    val b = 8
    val c = a + b
    val s = "When we add $a and $b, we get $c"
    println(s)
    println("When we add $a and $b, we get ${a + b}")
    val price = """
                ${'$'}9.99
                """
    println(price)

    // template ekspresi string ditandai dengan tanda $ dolar dan diikuti oleh nama variabel yang akan digabungkan kedalam suatu string.
    // karakter dolar tidak bisa dicetak menggunakan escape character oleh karena itu gunakan template string untuk mencetakknya
}