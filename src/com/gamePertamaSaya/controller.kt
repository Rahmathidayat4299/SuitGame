package com.gamePertamaSaya

class controller(private val callback: Callback) : interfacecontroller{



    override fun check(playerOne: String, playerTwo: String){


        if (playerOne == playerTwo) {
           callback.pemenang("hasil imbang antara dua pemain")
        } else if ((playerOne == "batu") && (playerTwo == "Gunting")) {

            callback.pemenang("Selamat playerOne memang dan playerTwo kalah")

        } else if ((playerOne == "batu") && (playerTwo == "kertas")) {

            callback.pemenang("Selamat playerTwo memang dan playerOne kalah")

        } else if ((playerOne == "Gunting") && (playerTwo == "batu")) {

            callback.pemenang("Selamat playerTwo memang dan playerOne kalah")

        } else if ((playerOne == "Gunting") && (playerTwo == "kertas")) {

            callback.pemenang("Selamat playerOne memang dan playerTwo kalah")

        } else if ((playerOne == "kertas") && (playerTwo =="Gunting")) {

            callback.pemenang("Selamat playerTwo memang dan playerOne kalah")

        } else if ((playerOne == "kertas") && (playerTwo == "batu")) {

            callback.pemenang("Selamat playerOne memang dan playerTwo kalah")

        }else{
            ("maaf pilihan anda tidak tersedia")
        }

    }
}
