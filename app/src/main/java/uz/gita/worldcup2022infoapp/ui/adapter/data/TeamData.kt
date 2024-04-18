package uz.gita.worldcup2022infoapp.ui.adapter.data

data class TeamData(
    val position: String,
    val image: Int,
    val teamName:String,
    val winCount: String,
    val drawCount: String,
    val lostCount: String,
    val goalsDifference: String,
    val score: String,
    val teamId: Int
)