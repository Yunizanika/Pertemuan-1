fun main() {

    /*
    Tipe Data

    tipe data dikotlin terdiri dari Byte, Short, Int dan Long

     */

    // byte dengan min 8 byte
    val minByte = -128
    // Byte dengan 8bit
    val maxByte: Byte = 127

    // short  dengan min 16 bit
    val minShort: Short = -32768
    // short dengan 16bit
    val maxShort: Short = 32767

    // int dengan min value 32bit
    val minInt: Int = -2147483648
    // integer dengan 32bit
    val maxInt: Int = 2147483647

    // Long dengan min 64bit
    val minLong: Long = -9223372036854775807
    // Long dengan 64bit
    val maxLong: Long = 9223372036854775807


    // mencetak tipe data
    println("minByte:" + minByte)
    println("maxByte:" + maxByte)
    println("minShort:" + minShort)
    println("maxShort:" + maxShort)
    println("minInt:" + minInt)
    println("maxInt:" + maxInt)
    println("minLong:" + minLong)
    println("maxLong:" + maxLong)
}