package com.gamePertamaSaya

class Controller(private val callback: Callback) : Interfacecontroller{



    override fun check(playerOne: String, playerTwo: String){


        if (playerOne == playerTwo) {
            callback.pemenang("hasil imbang antara dua pemain")
        } else if ((playerOne == "batu") && (playerTwo == "Gunting") || (playerOne == "Gunting") && (playerTwo == "kertas") || (playerOne == "kertas") && (playerTwo == "batu")) {

            callback.pemenang("Selamat playerOne memang dan playerTwo kalah")

        } else if ((playerOne == "batu") && (playerTwo == "kertas") || (playerOne == "Gunting") && (playerTwo == "batu") || (playerOne == "kertas") && (playerTwo == "Gunting")) {

            callback.pemenang("Selamat playerTwo memang dan playerOne kalah")
        } else {
            callback.pemenang("maaf pilihan anda tidak tersedia")
        }

    }
}
