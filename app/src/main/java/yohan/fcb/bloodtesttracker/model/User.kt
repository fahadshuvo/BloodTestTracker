package yohan.fcb.bloodtesttracker.model

//User entity for firebase database

data class User(val name: String,
                val bloodSugar: String,
                val bloodPressure: String,
                val rbc: String,
                val tbc: String,
                val vdc: String,
                val profilePicturePath: String?){

    constructor():this("", "", "", "", "", "",null)
}