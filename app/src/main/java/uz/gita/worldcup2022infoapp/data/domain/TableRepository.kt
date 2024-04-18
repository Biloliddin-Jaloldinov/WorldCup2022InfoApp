package uz.gita.worldcup2022infoapp.data.domain

import uz.gita.worldcup2022infoapp.R
import uz.gita.worldcup2022infoapp.ui.adapter.data.TableData
import uz.gita.worldcup2022infoapp.ui.adapter.data.TeamData

class TableRepository private constructor() {
    companion object {
        private var repository: TableRepository? = null
        fun getInstance(): TableRepository {
            if (repository == null) {
                repository = TableRepository()
            }
            return repository!!
        }
    }

    private lateinit var teamList: ArrayList<TableData>

    init {
        initData()
    }

    private fun initData() {
        teamList = ArrayList()
        teamList.add(
            TableData(
                "A guruhi", listOf(
                    TeamData("1", R.drawable.flag_niderlandiya, "Niderlandiya", "2", "1", "0", "4", "7", 3),
                    TeamData("2", R.drawable.flag_senegal, "Senegal", "2", "0", "1", "1", "6", 2),
                    TeamData("3", R.drawable.flag_ekvador, "Ekvador", "1", "1", "1", "1", "4", 1),
                    TeamData("4", R.drawable.flag_qatar, "Qatar", "0", "0", "3", "-6", "0", 0),
                )
            )
        )
        teamList.add(
            TableData(
                "B guruhi", listOf(
                    TeamData("1", R.drawable.flag_angliya, "Angliya", "2", "1", "0", "7", "7", 4),
                    TeamData("2", R.drawable.flag_aqsh, "AQSh", "1", "2", "0", "1", "5", 5),
                    TeamData("3", R.drawable.flag_eron, "Eron", "1", "0", "2", "-3", "3", 6),
                    TeamData("4", R.drawable.flag_uels, "Uels", "0", "1", "2", "-5", "1", 7),
                )
            )
        )
        teamList.add(
            TableData(
                "C guruhi", listOf(
                    TeamData("1", R.drawable.flag_argentina, "Argentina", "2", "0", "1", "3", "6", 8),
                    TeamData("2", R.drawable.flag_polsha, "Polsha", "1", "1", "1", "0", "4", 10),
                    TeamData("3", R.drawable.flag_meksika, "Meksika", "1", "1", "1", "-1", "4", 9),
                    TeamData("4", R.drawable.flag_saudiya_arabistoni, "S. Arabistoni", "1", "0", "2", "-2", "3", 11),
                )
            )
        )
        teamList.add(
            TableData(
                "D guruhi", listOf(
                    TeamData("1", R.drawable.flag_fransiya, "Fransiya", "2", "0", "1", "3", "6", 14),
                    TeamData("2", R.drawable.flag_avstraliya, "Avstraliya", "2", "0", "1", "4", "-1", 12),
                    TeamData("3", R.drawable.flag_tunis, "Tunis", "1", "1", "1", "0", "4", 15),
                    TeamData("4", R.drawable.flag_daniya, "Daniya", "0", "1", "2", "-6", "1", 13),
                )
            )
        )
        teamList.add(
            TableData(
                "E guruhi", listOf(
                    TeamData("1", R.drawable.flag_yaponiya, "Yaponiya", "2", "0", "1", "1", "6", 19),
                    TeamData("2", R.drawable.flag_ispaniya, "Ispaniya", "1", "1", "1", "6", "4", 17),
                    TeamData("3", R.drawable.flag_germaniya, "Germaniya", "1", "1", "1", "1", "4", 16),
                    TeamData("4", R.drawable.flag_kosta_rika, "Kosta-Rika", "1", "0", "2", "-8", "3", 18),
                )
            )
        )
        teamList.add(
            TableData(
                "F guruhi", listOf(
                    TeamData("1", R.drawable.flag_marokko, "Marokash", "2", "1", "0", "3", "7", 21),
                    TeamData("2", R.drawable.flag_horvatiya, "Xorvatiya", "1", "2", "0", "3", "5", 22),
                    TeamData("3", R.drawable.flag_belgiya, "Belgiya", "1", "1", "1", "-1", "4", 23),
                    TeamData("4", R.drawable.flag_kanada, "Kanada", "0", "0", "3", "-5", "0", 20),
                )
            )
        )
        teamList.add(
            TableData(
                "G guruhi", listOf(
                    TeamData("1", R.drawable.flag_braziliya, "Braziliya", "2", "0", "1", "2", "6", 24),
                    TeamData("2", R.drawable.flag_shvetsariya, "Shvetsariya", "2", "0", "1", "1", "6", 27),
                    TeamData("3", R.drawable.flag_kamerun, "Kamerun", "1", "1", "1", "0", "4", 25),
                    TeamData("4", R.drawable.flag_serbiya, "Serbiya", "0", "1", "2", "-3", "1", 26),
                )
            )
        )
        teamList.add(
            TableData(
                "H guruhi", listOf(
                    TeamData("1", R.drawable.flag_portugaliya, "Portugaliya", "2", "0", "1", "2", "6", 30),
                    TeamData("2", R.drawable.flag_janubiy_koreya, "Senegal", "1", "1", "1", "0", "4", 29),
                    TeamData("3", R.drawable.flag_urugvay, "Urugvay", "1", "1", "1", "0", "4", 31),
                    TeamData("4", R.drawable.flag_gana, "Qatar", "1", "0", "2", "-2", "3", 28),
                )
            )
        )
    }

    fun getTableData(): List<TableData> = teamList
}