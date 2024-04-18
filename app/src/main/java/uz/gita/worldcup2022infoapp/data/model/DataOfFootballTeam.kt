package uz.gita.worldcup2022infoapp.data.model

import uz.gita.worldcup2022infoapp.data.subsidiarydatas.AboutPlayer
import uz.gita.worldcup2022infoapp.data.subsidiarydatas.DateOfMatch

data class DataOfFootballTeam(
    val id : Int,
    val teamName: String,
    val groupName: String,
    val teamFlagImg: Int,
    val teamPlayersImg: Int,
    val aboutTeam: List<String>,
    val playerList: List<AboutPlayer>,
    val matchList: List<DateOfMatch>
)
