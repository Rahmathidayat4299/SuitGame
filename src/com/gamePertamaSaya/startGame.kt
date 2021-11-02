package com.gamePertamaSaya

object startGame : Callback  {
    @JvmStatic
    fun main(arg: Array<String>){

        println("#selamat Datang digame suit#")

        println("inilah pilihan antara pemain satu dan pemain dua")

        val pilihan = arrayOf("Gunting","batu","kertas")

        for (cetak in pilihan){
            println(cetak)
        }

        print("masukkan pilihan pemainsatu: ")

        val choiceplayerOne = readLine().toString()

        print("masukkan pilihan pemainDua: ")
        val choiceplayerTwo = readLine().toString()

        val Controller = controller(this)
        Controller.check( choiceplayerOne,
            choiceplayerTwo)
            }

    override fun pemenang(pemenang: String) {
        println(pemenang)
    }


}







