package com.gamePertamaSaya

object StartGame : Callback  {
    @JvmStatic
    fun main(arg: Array<String>){

        println("#selamat Datang digame suit#")

        println("inilah pilihan antara pemain satu dan pemain dua")

        val pilihan = arrayOf("Gunting","batu","kertas")

        for (cetak in pilihan){
            println(cetak)
        }

        print("masukkan pilihan pemainsatu: ")

        val choiceplayerOne = readLine().toString().trim()

        print("masukkan pilihan pemainDua: ")
        val choiceplayerTwo = readLine().toString().trim()

        val controller = Controller(this)
        controller.check( choiceplayerOne,
            choiceplayerTwo)
            }

    override fun pemenang(pemenang: String) {
        println(pemenang)
    }


}







