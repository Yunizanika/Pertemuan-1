fun main() {
    /* variabel adalah sebuah tempat atau wadah didalam memori komputer untuk menyimpan data.
    Terdapat 2 type system variabel yaitu: statis dan dinamis.
    */

    // type sistem variabel dinamis (tidak memerlukan deklarasi tipe data pada sebuah variabel)
    var dynamicVar = 2
    println("Contoh dynamic variabel= $dynamicVar")

    // type sistem variabel statis (memerlukan deklarasi tipe data pada sebuah variabel dan tipe data tersebut tidak bisa dirubah selama program dieksekusi)
    var staticVar: Char = 'A'
    println("Contoh static variabel = $staticVar")
}