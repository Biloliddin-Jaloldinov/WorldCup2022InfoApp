package uz.gita.worldcup2022infoapp.data.domain

import uz.gita.worldcup2022infoapp.R
import uz.gita.worldcup2022infoapp.data.model.DataOfFootballTeam
import uz.gita.worldcup2022infoapp.data.subsidiarydatas.AboutPlayer
import uz.gita.worldcup2022infoapp.data.subsidiarydatas.DateOfMatch

class TeamRepository private constructor() {
    private lateinit var teamList: ArrayList<DataOfFootballTeam>

    init {
        initData()
    }

    companion object {
        private lateinit var repository: TeamRepository
        fun getInstance(): TeamRepository {
            if (!this::repository.isInitialized) {
                repository = TeamRepository()
            }
            return repository
        }

    }

    private fun initData() {
        teamList = ArrayList()
        teamList.add(
            DataOfFootballTeam(
                0,
                "Qatar",
                "A guruhida",
                R.drawable.flag_qatar,
                R.drawable.komanda_qatar,
                listOf(
                    "anorrangliklar",
                    "50-o'rinda",
                    "ilk marta",
                    "-",
                    "to'pga egalik qilish,\nqarshi hujum"
                ), listOf(
                    AboutPlayer(R.drawable.player_qatar_1, "almoyez ali"),
                    AboutPlayer(R.drawable.player_qatar_2, "akram afif"),
                    AboutPlayer(R.drawable.player_qatar_3, "hassan abdulkarim"),
                    AboutPlayer(R.drawable.player_qatar_4, "hassan al haydos")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_qatar,
                        R.drawable.flag_ekvador,
                        "20.11.2022",
                        "0 : 2"
                    ),
                    DateOfMatch(
                        R.drawable.flag_qatar,
                        R.drawable.flag_kamerun,
                        "25.11.2022",
                        "1 : 3"
                    ),
                    DateOfMatch(
                        R.drawable.flag_niderlandiya,
                        R.drawable.flag_qatar,
                        "29.11.2022",
                        "2 : 0"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                1,
                "Ekvador",
                "A guruhida",
                R.drawable.flag_ekvador,
                R.drawable.komanda_ekvador,
                listOf(
                    "uch rangliklar",
                    "44-o'rinda",
                    "to'rtinchi martta",
                    "1/8 final bosqichi",
                    "kuchli pressing,\ntezkor futbol"
                ), listOf(
                    AboutPlayer(R.drawable.player_ekvador_1, "pervis estupinyan"),
                    AboutPlayer(R.drawable.player_ekvador_2, "pyero inkapye"),
                    AboutPlayer(R.drawable.player_ekvador_3, "enner valensiya"),
                    AboutPlayer(R.drawable.player_ekvador_4, "moyzes kaysedo")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_qatar,
                        R.drawable.flag_ekvador,
                        "20.11.2022",
                        "0 : 2"
                    ),
                    DateOfMatch(
                        R.drawable.flag_niderlandiya,
                        R.drawable.flag_ekvador,
                        "25.11.2022",
                        "1 : 1"
                    ),
                    DateOfMatch(
                        R.drawable.flag_ekvador,
                        R.drawable.flag_senegal,
                        "29.11.2022",
                        "1 : 2"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                2,
                "Senegal",
                "A guruhida",
                R.drawable.flag_senegal,
                R.drawable.komanda_senegal,
                listOf(
                    "teranga sherlari",
                    "18-o'rinda",
                    "uchinchi martta martta",
                    "1/4 final bosqichi",
                    "yuqori mudofaa,\nqanot hujumlari"
                ), listOf(
                    AboutPlayer(R.drawable.player_senegal_1, "sadio mane"),
                    AboutPlayer(R.drawable.player_senegal_2, "kalidu kulibali"),
                    AboutPlayer(R.drawable.player_senegal_3, "idrissa gana geye"),
                    AboutPlayer(R.drawable.player_senegal_4, "eduard mendi")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_senegal,
                        R.drawable.flag_niderlandiya,
                        "21.11.2022",
                        "0 : 2"
                    ),
                    DateOfMatch(
                        R.drawable.flag_qatar,
                        R.drawable.flag_senegal,
                        "25.11.2022",
                        "1 : 3"
                    ),
                    DateOfMatch(
                        R.drawable.flag_ekvador,
                        R.drawable.flag_senegal,
                        "29.11.2022",
                        "1 : 2"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                3,
                "Niderlandiya",
                "A guruhida",
                R.drawable.flag_niderlandiya,
                R.drawable.komanda_gollandiya,
                listOf(
                    "olovranglilar",
                    "8-o'rinda",
                    "o'n birinchi martta",
                    "uchta kumush, ikki martta 1/2 final",
                    "o'ta hujumkorlik,\ntezkor hujumlar"
                ), listOf(
                    AboutPlayer(R.drawable.player_gollandiya_1, "memfis depay"),
                    AboutPlayer(R.drawable.player_gollandiya_2, "virjil va deyk"),
                    AboutPlayer(R.drawable.player_gollandiya_3, "frenki de yong"),
                    AboutPlayer(R.drawable.player_gollandiya_4, "denzel dyumpfris")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_senegal,
                        R.drawable.flag_niderlandiya,
                        "21.11.2022",
                        "0 : 2"
                    ),
                    DateOfMatch(
                        R.drawable.flag_niderlandiya,
                        R.drawable.flag_ekvador,
                        "25.11.2022",
                        "1 : 1"
                    ),
                    DateOfMatch(
                        R.drawable.flag_niderlandiya,
                        R.drawable.flag_qatar,
                        "29.11.2022",
                        "2 : 0"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                4,
                "Angliya",
                "B guruhida",
                R.drawable.flag_angliya,
                R.drawable.komanda_angliya,
                listOf(
                    "uch sherlar",
                    "5-o'rinda",
                    "o'n oltinchi martta",
                    "1966 - yili jahon chempioni",
                    "yuqoridan uzun paslar,\nkuchli zarbalar"
                ), listOf(
                    AboutPlayer(R.drawable.player_angliya_1, "harri keyn"),
                    AboutPlayer(R.drawable.player_angliya_2, "rahim sterling"),
                    AboutPlayer(R.drawable.player_angliya_3, "fil foden"),
                    AboutPlayer(R.drawable.player_angliya_4, "jud bellingem")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_angliya,
                        R.drawable.flag_eron,
                        "21.11.2022",
                        "6 : 2"
                    ),
                    DateOfMatch(
                        R.drawable.flag_angliya,
                        R.drawable.flag_aqsh,
                        "25.11.2022",
                        "0 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_uels,
                        R.drawable.flag_angliya,
                        "29.11.2022",
                        "0 : 3"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                5,
                "Aqsh",
                "B guruhida",
                R.drawable.flag_aqsh,
                R.drawable.komanda_aqsh,
                listOf(
                    "yanki",
                    "16-o'rinda",
                    "o'n birinchi martta",
                    "1930 - yili bronza medali",
                    "pozitsion hujum,\nqanot hujumlari"
                ), listOf(
                    AboutPlayer(R.drawable.player_aqsh_1, "kristian pulishich"),
                    AboutPlayer(R.drawable.player_aqsh_2, "ueston makkenni"),
                    AboutPlayer(R.drawable.player_aqsh_3, "xesus ferreyra"),
                    AboutPlayer(R.drawable.player_aqsh_4, "jovanni reyna")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_aqsh,
                        R.drawable.flag_uels,
                        "21.11.2022",
                        "1 : 1"
                    ),
                    DateOfMatch(
                        R.drawable.flag_angliya,
                        R.drawable.flag_aqsh,
                        "25.11.2022",
                        "0 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_eron,
                        R.drawable.flag_aqsh,
                        "29.11.2022",
                        "0 : 1"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                6,
                "Eron",
                "B guruhida",
                R.drawable.flag_eron,
                R.drawable.komanda_eron,
                listOf(
                    "fors qoplonlari",
                    "20-o'rinda",
                    "oltinchi martta",
                    "guruh bosqichi",
                    "himoyaviy futbol,\nqanotdan bosim o'tkazish"
                ), listOf(
                    AboutPlayer(R.drawable.player_eron_1, "serdar azmun"),
                    AboutPlayer(R.drawable.player_eron_2, "mehdi taremi"),
                    AboutPlayer(R.drawable.player_eron_3, "alirizo jahanbaxsh"),
                    AboutPlayer(R.drawable.player_eron_4, "ehsam hajsafi")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_angliya,
                        R.drawable.flag_eron,
                        "21.11.2022",
                        "6 : 2"
                    ),
                    DateOfMatch(
                        R.drawable.flag_uels,
                        R.drawable.flag_eron,
                        "25.11.2022",
                        "0 : 2"
                    ),
                    DateOfMatch(
                        R.drawable.flag_eron,
                        R.drawable.flag_aqsh,
                        "29.11.2022",
                        "0 : 1"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                7,
                "Uels",
                "B guruhida",
                R.drawable.flag_uels,
                R.drawable.komanda_uels,
                listOf(
                    "ajdarlar",
                    "19-o'rinda",
                    "ikkinchi martta",
                    "chorak final",
                    "yuqoridan paslar,\ntezkorqarshi hujum"
                ), listOf(
                    AboutPlayer(R.drawable.player_uels_1, "garet beyl"),
                    AboutPlayer(R.drawable.player_uels_2, "aaron remzi"),
                    AboutPlayer(R.drawable.player_uels_3, "ben devis"),
                    AboutPlayer(R.drawable.player_uels_4, "deniel jeyms")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_aqsh,
                        R.drawable.flag_uels,
                        "21.11.2022",
                        "1 : 1"
                    ),
                    DateOfMatch(
                        R.drawable.flag_uels,
                        R.drawable.flag_eron,
                        "25.11.2022",
                        "0 : 2"
                    ),
                    DateOfMatch(
                        R.drawable.flag_uels,
                        R.drawable.flag_angliya,
                        "29.11.2022",
                        "0 : 3"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                8,
                "Argentina",
                "C guruhida",
                R.drawable.flag_argentina,
                R.drawable.komanda_argentina,
                listOf(
                    "oq-havorangliklar",
                    "3-o'rinda",
                    "o'n sakkizinchi martta",
                    "ikki martta chempion",
                    "pressing,\nqarshi hujum va kuchli zarbalar"
                ), listOf(
                    AboutPlayer(R.drawable.player_argentina_1, "lionel messi"),
                    AboutPlayer(R.drawable.player_argentina_2, "anxel di mariya"),
                    AboutPlayer(R.drawable.player_argentina_3, "lautaro martines"),
                    AboutPlayer(R.drawable.player_argentina_4, "nikolas otamendi")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_argentina,
                        R.drawable.flag_saudiya_arabistoni,
                        "22.11.2022",
                        "1 : 2"
                    ),
                    DateOfMatch(
                        R.drawable.flag_argentina,
                        R.drawable.flag_meksika,
                        "26.11.2022",
                        "2 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_polsha,
                        R.drawable.flag_argentina,
                        "30.11.2022",
                        "0 : 2"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                9,
                "Meksika",
                "C guruhida",
                R.drawable.flag_meksika,
                R.drawable.komanda_meksika,
                listOf(
                    "uch ranglilar",
                    "13-o'rinda",
                    "oltinchi martta",
                    "chorak final",
                    "kuchli pressing,\nto'pga egalik qilish"
                ), listOf(
                    AboutPlayer(R.drawable.player_meksika_1, "irvin losano"),
                    AboutPlayer(R.drawable.player_meksika_2, "raul ximenes"),
                    AboutPlayer(R.drawable.player_meksika_3, "ektor errera"),
                    AboutPlayer(R.drawable.player_meksika_4, "gilyermo ochoa")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_meksika,
                        R.drawable.flag_polsha,
                        "22.11.2022",
                        "0 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_argentina,
                        R.drawable.flag_meksika,
                        "26.11.2022",
                        "2 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_saudiya_arabistoni,
                        R.drawable.flag_meksika,
                        "30.11.2022",
                        "1 : 2"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                10,
                "polsha",
                "C guruhida",
                R.drawable.flag_polsha,
                R.drawable.komanda_polsha,
                listOf(
                    "oq burgutlar",
                    "26-o'rinda",
                    "to'qqizinchi marta",
                    "chorak final",
                    "qanotlar orqali tezkor hujumlar"
                ), listOf(
                    AboutPlayer(R.drawable.player_polsha_1, "robert levandovski"),
                    AboutPlayer(R.drawable.player_polsha_2, "pyotr zelenski"),
                    AboutPlayer(R.drawable.player_polsha_3, "arkadiush milik"),
                    AboutPlayer(R.drawable.player_polsha_4, "gjegoj krixovyak")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_meksika,
                        R.drawable.flag_polsha,
                        "22.11.2022",
                        "0 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_polsha,
                        R.drawable.flag_saudiya_arabistoni,
                        "26.11.2022",
                        "2 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_polsha,
                        R.drawable.flag_argentina,
                        "30.11.2022",
                        "0 : 2"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                11,
                "s. arabistoni",
                "C guruhida",
                R.drawable.flag_saudiya_arabistoni,
                R.drawable.komanda_saudiya,
                listOf(
                    "yashil lochinlar",
                    "51-o'rinda",
                    "oltinchi marta",
                    "nimchorak final",
                    "to'pga egalik qilish,\nqanot hujumlari"
                ), listOf(
                    AboutPlayer(R.drawable.player_s_arabiston_1, "salim al dovsari"),
                    AboutPlayer(R.drawable.player_s_arabiston_2, "salmon al faraj"),
                    AboutPlayer(R.drawable.player_s_arabiston_3, "solih al shehri"),
                    AboutPlayer(R.drawable.player_s_arabiston_4, "yossir al shahroni")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_argentina,
                        R.drawable.flag_saudiya_arabistoni,
                        "22.11.2022",
                        "1 : 2"
                    ),
                    DateOfMatch(
                        R.drawable.flag_polsha,
                        R.drawable.flag_saudiya_arabistoni,
                        "26.11.2022",
                        "2 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_polsha,
                        R.drawable.flag_argentina,
                        "30.11.2022",
                        "0 : 2"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                12,
                "avstraliya",
                "D guruhida",
                R.drawable.flag_avstraliya,
                R.drawable.komanda_avstraliya,
                listOf(
                    "sokkeroz",
                    "39-o'rinda",
                    "oltinchi marta",
                    "nimchorak final",
                    "qanotlar orqali hujum,\nuzoqdan zarbalar"
                ), listOf(
                    AboutPlayer(R.drawable.player_avstralia_1, "aaron muy"),
                    AboutPlayer(R.drawable.player_avstralia_2, "aydin xrustich"),
                    AboutPlayer(R.drawable.player_avstralia_3, "aver mabil"),
                    AboutPlayer(R.drawable.player_avstralia_4, "metyu rayan")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_fransiya,
                        R.drawable.flag_avstraliya,
                        "22.11.2022",
                        "4 : 1"
                    ),
                    DateOfMatch(
                        R.drawable.flag_tunis,
                        R.drawable.flag_avstraliya,
                        "26.11.2022",
                        "0 : 1"
                    ),
                    DateOfMatch(
                        R.drawable.flag_avstraliya,
                        R.drawable.flag_daniya,
                        "30.11.2022",
                        "1 : 0"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                13,
                "daniya",
                "D guruhida",
                R.drawable.flag_daniya,
                R.drawable.komanda_daniya,
                listOf(
                    "qizil gvardiya",
                    "10-o'rinda",
                    "oltinchi marta",
                    "nimchorak final",
                    "tezkor qarshi hujum,\njamoviylik"
                ), listOf(
                    AboutPlayer(R.drawable.player_daniya_1, "kristian eriksen"),
                    AboutPlayer(R.drawable.player_daniya_2, "prer-emil hyoyberg"),
                    AboutPlayer(R.drawable.player_daniya_3, "simol kyer"),
                    AboutPlayer(R.drawable.player_daniya_4, "kasper dolberg")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_daniya,
                        R.drawable.flag_tunis,
                        "22.11.2022",
                        "0 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_fransiya,
                        R.drawable.flag_daniya,
                        "26.11.2022",
                        "2 : 1"
                    ),
                    DateOfMatch(
                        R.drawable.flag_avstraliya,
                        R.drawable.flag_daniya,
                        "30.11.2022",
                        "1 : 0"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                14,
                "fransiya",
                "D guruhida",
                R.drawable.flag_fransiya,
                R.drawable.komanda_fransiya,
                listOf(
                    "ko'klar",
                    "4-o'rinda",
                    "o'n oltinchi marta",
                    "ikki karra chempion",
                    "kichik kombinatsiyalar,\nyuqoridan paslar"
                ), listOf(
                    AboutPlayer(R.drawable.player_fransiya_1, "killian mbappe"),
                    AboutPlayer(R.drawable.player_fransiya_2, "karim benzema"),
                    AboutPlayer(R.drawable.player_fransiya_3, "antuan grizmann"),
                    AboutPlayer(R.drawable.player_fransiya_4, "ugo lyoris")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_fransiya,
                        R.drawable.flag_avstraliya,
                        "22.11.2022",
                        "4 : 1"
                    ),
                    DateOfMatch(
                        R.drawable.flag_fransiya,
                        R.drawable.flag_daniya,
                        "26.11.2022",
                        "2 : 1"
                    ),
                    DateOfMatch(
                        R.drawable.flag_tunis,
                        R.drawable.flag_fransiya,
                        "30.11.2022",
                        "1 : 0"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                15,
                "tunis",
                "D guruhida",
                R.drawable.flag_tunis,
                R.drawable.komanda_tunis,
                listOf(
                    "karfagen burgutlarlari",
                    "30-o'rinda",
                    "oltinchi marta",
                    "guruh bosqichi",
                    "to'pga egalik qilish,\nqanotga uztmalar"
                ), listOf(
                    AboutPlayer(R.drawable.player_tunis_1, "vahbi hazri"),
                    AboutPlayer(R.drawable.player_tunis_2, "yussef msakni"),
                    AboutPlayer(R.drawable.player_tunis_3, "elye skiri"),
                    AboutPlayer(R.drawable.player_tunis_4, "dilan bronn")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_daniya,
                        R.drawable.flag_tunis,
                        "22.11.2022",
                        "0 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_tunis,
                        R.drawable.flag_avstraliya,
                        "26.11.2022",
                        "0 : 1"
                    ),
                    DateOfMatch(
                        R.drawable.flag_tunis,
                        R.drawable.flag_fransiya,
                        "30.11.2022",
                        "1 : 0"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                16,
                "germaniya",
                "E guruhida",
                R.drawable.flag_germaniya,
                R.drawable.komanda_germaniya,
                listOf(
                    "bundestim",
                    "11-o'rinda",
                    "yigirmanchi marta",
                    "to'rt karra jahon chempion",
                    "hududli futbol,\npozitsion pressing"
                ), listOf(
                    AboutPlayer(R.drawable.player_germaniya_1, "tomas myuller"),
                    AboutPlayer(R.drawable.player_germaniya_2, "joshua kimmix"),
                    AboutPlayer(R.drawable.player_germaniya_3, "leroy sane"),
                    AboutPlayer(R.drawable.player_germaniya_4, "antonio ryudiger")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_germaniya,
                        R.drawable.flag_yaponiya,
                        "23.11.2022",
                        "1 : 2"
                    ),
                    DateOfMatch(
                        R.drawable.flag_ispaniya,
                        R.drawable.flag_germaniya,
                        "27.11.2022",
                        "1 : 1"
                    ),
                    DateOfMatch(
                        R.drawable.flag_kosta_rika,
                        R.drawable.flag_germaniya,
                        "01.12.2022",
                        "2 : 4"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                17,
                "ispaniya",
                "E guruhida",
                R.drawable.flag_ispaniya,
                R.drawable.komanda_ispaniya,
                listOf(
                    "qizil furiya",
                    "7-o'rinda",
                    "o'n oltinchi marta",
                    "jahon chempion",
                    "tiki-taka,\nxavfli hujum qanotlari"
                ), listOf(
                    AboutPlayer(R.drawable.player_ispaniya_1, "pedri"),
                    AboutPlayer(R.drawable.player_ispaniya_2, "serxio busqets"),
                    AboutPlayer(R.drawable.player_ispaniya_3, "gavi"),
                    AboutPlayer(R.drawable.player_ispaniya_4, "pablo sarabiya")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_ispaniya,
                        R.drawable.flag_kosta_rika,
                        "23.11.2022",
                        "7 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_ispaniya,
                        R.drawable.flag_germaniya,
                        "27.11.2022",
                        "1 : 1"
                    ),
                    DateOfMatch(
                        R.drawable.flag_yaponiya,
                        R.drawable.flag_ispaniya,
                        "01.12.2022",
                        "2 : 1"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                18,
                "kosta-rika",
                "E guruhida",
                R.drawable.flag_kosta_rika,
                R.drawable.komanda_kosta_rika,
                listOf(
                    "los tikos",
                    "31-o'rinda",
                    "oltinchi marta",
                    "chorak final",
                    "kuchli mudofaa qurish,\nto'psiz o'yin"
                ), listOf(
                    AboutPlayer(R.drawable.player_kosta_rika_1, "keylor navas"),
                    AboutPlayer(R.drawable.player_kosta_rika_2, "joel kempbell"),
                    AboutPlayer(R.drawable.player_kosta_rika_3, "fransisko kalvo"),
                    AboutPlayer(R.drawable.player_kosta_rika_4, "jevison bennett")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_ispaniya,
                        R.drawable.flag_kosta_rika,
                        "23.11.2022",
                        "7 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_yaponiya,
                        R.drawable.flag_kosta_rika,
                        "27.11.2022",
                        "0 : 1"
                    ),
                    DateOfMatch(
                        R.drawable.flag_kosta_rika,
                        R.drawable.flag_germaniya,
                        "01.12.2022",
                        "2 : 4"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                19,
                "yaponiya",
                "E guruhida",
                R.drawable.flag_yaponiya,
                R.drawable.komanda_yaponiya,
                listOf(
                    "ko'k samuraylar",
                    "24-o'rinda",
                    "yettinchi marta",
                    "nimchorak final",
                    "kurashuvchan pressing,\ntotal futbol"
                ), listOf(
                    AboutPlayer(R.drawable.player_yaponiya_1, "daiti kamada"),
                    AboutPlayer(R.drawable.player_yaponiya_2, "takumi minamino"),
                    AboutPlayer(R.drawable.player_yaponiya_3, "takexiro tomiyaso"),
                    AboutPlayer(R.drawable.player_yaponiya_4, "ritsu doan")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_germaniya,
                        R.drawable.flag_yaponiya,
                        "23.11.2022",
                        "1 : 2"
                    ),
                    DateOfMatch(
                        R.drawable.flag_yaponiya,
                        R.drawable.flag_kosta_rika,
                        "27.11.2022",
                        "0 : 1"
                    ),
                    DateOfMatch(
                        R.drawable.flag_yaponiya,
                        R.drawable.flag_ispaniya,
                        "01.12.2022",
                        "2 : 1"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                20,
                "kanada",
                "F guruhida",
                R.drawable.flag_kanada,
                R.drawable.komanda_kanada,
                listOf(
                    "qizillar",
                    "43-o'rinda",
                    "ikkinchi marta",
                    "guruh bosqichi",
                    "tezkoq futbol,\nqanotdan hujumlar"
                ), listOf(
                    AboutPlayer(R.drawable.player_kanada_1, "alfonso deyvis"),
                    AboutPlayer(R.drawable.player_kanada_2, "jonatan devid"),
                    AboutPlayer(R.drawable.player_kanada_3, "atiba hatchinson"),
                    AboutPlayer(R.drawable.player_kanada_4, "kayl larin")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_belgiya,
                        R.drawable.flag_kanada,
                        "23.11.2022",
                        "1 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_horvatiya,
                        R.drawable.flag_kanada,
                        "27.11.2022",
                        "4 : 1"
                    ),
                    DateOfMatch(
                        R.drawable.flag_kanada,
                        R.drawable.flag_marokko,
                        "01.12.2022",
                        "1 : 2"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                21,
                "marokash",
                "F guruhida",
                R.drawable.flag_kanada,
                R.drawable.komanda_marokash,
                listOf(
                    "atlas sherlari",
                    "23-o'rinda",
                    "oltinchi marta",
                    "nimchorak final",
                    "qanotdan uzatmalar,\nyuqoridan uzatmalar"
                ), listOf(
                    AboutPlayer(R.drawable.player_marokash_1, "hakim ziyesh"),
                    AboutPlayer(R.drawable.player_marokash_2, "ashraf haqimi"),
                    AboutPlayer(R.drawable.player_marokash_3, "yussef en neseri"),
                    AboutPlayer(R.drawable.player_marokash_4, "romen saiss")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_marokko,
                        R.drawable.flag_horvatiya,
                        "23.11.2022",
                        "0 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_belgiya,
                        R.drawable.flag_marokko,
                        "27.11.2022",
                        "0 : 2"
                    ),
                    DateOfMatch(
                        R.drawable.flag_kanada,
                        R.drawable.flag_marokko,
                        "01.12.2022",
                        "1 : 2"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                22,
                "Xorvatiya",
                "F guruhida",
                R.drawable.flag_horvatiya,
                R.drawable.komanda_xorvatiya,
                listOf(
                    "shahmat doskasi",
                    "12-o'rinda",
                    "oltinchi marta",
                    "kumush medal marta",
                    "o'ta zish himoya,\nkichik paslar orqali hujum"
                ), listOf(
                    AboutPlayer(R.drawable.player_xorvatiya_1, "luka modrich"),
                    AboutPlayer(R.drawable.player_xorvatiya_2, "ivan perishich"),
                    AboutPlayer(R.drawable.player_xorvatiya_3, "marselo brozovich"),
                    AboutPlayer(R.drawable.player_xorvatiya_4, "andrey kramovich")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_marokko,
                        R.drawable.flag_horvatiya,
                        "23.11.2022",
                        "0 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_horvatiya,
                        R.drawable.flag_kanada,
                        "27.11.2022",
                        "4 : 1"
                    ),
                    DateOfMatch(
                        R.drawable.flag_horvatiya,
                        R.drawable.flag_belgiya,
                        "01.12.2022",
                        "0 : 0"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                23,
                "Belgiya",
                "F guruhida",
                R.drawable.flag_belgiya,
                R.drawable.komanda_belgiya,
                listOf(
                    "qizil ilbislar",
                    "2-o'rinda",
                    "o'n to'rtinchi marta",
                    "bronza medal marta",
                    "kichik paslar,\nmarkazdagi ustunlik"
                ), listOf(
                    AboutPlayer(R.drawable.player_belgiya_1, "kevin de bryuyne"),
                    AboutPlayer(R.drawable.player_belgiya_2, "romelu lukaku"),
                    AboutPlayer(R.drawable.player_belgiya_3, "yuri tilemans"),
                    AboutPlayer(R.drawable.player_belgiya_4, "tibo kurtua")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_belgiya,
                        R.drawable.flag_kanada,
                        "23.11.2022",
                        "1 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_belgiya,
                        R.drawable.flag_marokko,
                        "27.11.2022",
                        "0 : 2"
                    ),
                    DateOfMatch(
                        R.drawable.flag_horvatiya,
                        R.drawable.flag_belgiya,
                        "01.12.2022",
                        "0 : 0"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                24,
                "Braziliya",
                "G guruhida",
                R.drawable.flag_braziliya,
                R.drawable.komanda_braziliya,
                listOf(
                    "tanlanganlar",
                    "1-o'rinda",
                    "yigirma ikkinchi marta",
                    "bech oltin, ikki kumush, ikki bronza medal",
                    "hujumkor texnikaga asoslangan futbol"
                ), listOf(
                    AboutPlayer(R.drawable.player_braziliya_1, "neymar"),
                    AboutPlayer(R.drawable.player_braziliya_2, "dani alves"),
                    AboutPlayer(R.drawable.player_braziliya_3, "kazemiro"),
                    AboutPlayer(R.drawable.player_braziliya_4, "vinisius junior")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_braziliya,
                        R.drawable.flag_serbiya,
                        "24.11.2022",
                        "2 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_braziliya,
                        R.drawable.flag_shvetsariya,
                        "28.11.2022",
                        "1 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_kamerun,
                        R.drawable.flag_braziliya,
                        "02.12.2022",
                        "1 : 0"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                25,
                "Kamerun",
                "G guruhida",
                R.drawable.flag_kamerun,
                R.drawable.komanda_kamerun,
                listOf(
                    "yengilmas sherlar",
                    "43-o'rinda",
                    "sakkizinnchi marta",
                    "chorak final",
                    "uzoqdan to'pni izatish,\nyuqori mudofaa"
                ), listOf(
                    AboutPlayer(R.drawable.player_kamerun_1, "yensan abubakr"),
                    AboutPlayer(R.drawable.player_kamerun_2, "zambo-angissa"),
                    AboutPlayer(R.drawable.player_kamerun_3, "erik shupo-moting"),
                    AboutPlayer(R.drawable.player_kamerun_4, "karl toko ekambi")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_shvetsariya,
                        R.drawable.flag_kamerun,
                        "24.11.2022",
                        "1 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_kamerun,
                        R.drawable.flag_serbiya,
                        "28.11.2022",
                        "2 : 3"
                    ),
                    DateOfMatch(
                        R.drawable.flag_kamerun,
                        R.drawable.flag_braziliya,
                        "02.12.2022",
                        "1 : 0"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                26,
                "Serbiya",
                "G guruhida",
                R.drawable.flag_serbiya,
                R.drawable.komanda_serbiya,
                listOf(
                    "burgutlar",
                    "21-o'rinda",
                    "to'rtinchi marta",
                    "guruh bosqich",
                    "yuqoridan paslar,\nto'psiz pressing"
                ), listOf(
                    AboutPlayer(R.drawable.player_serbiya_1, "milinkovich-savich"),
                    AboutPlayer(R.drawable.player_serbiya_2, "alexsandr mitrovic"),
                    AboutPlayer(R.drawable.player_serbiya_3, "dushan tadich"),
                    AboutPlayer(R.drawable.player_serbiya_4, "filip kostich")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_braziliya,
                        R.drawable.flag_serbiya,
                        "24.11.2022",
                        "1 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_kamerun,
                        R.drawable.flag_serbiya,
                        "28.11.2022",
                        "3 : 3"
                    ),
                    DateOfMatch(
                        R.drawable.flag_serbiya,
                        R.drawable.flag_shvetsariya,
                        "02.12.2022",
                        "2 : 3"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                27,
                "Shvetsariya",
                "G guruhida",
                R.drawable.flag_shvetsariya,
                R.drawable.komanda_shvetsariya,
                listOf(
                    "qizil xochlar",
                    "15-o'rinda",
                    "o'n ikkinchi marta",
                    "chorak final",
                    "zich mudofa,\nraqibga qarab o'yin"
                ), listOf(
                    AboutPlayer(R.drawable.player_shvetsariya_1, "granit jaka"),
                    AboutPlayer(R.drawable.player_shvetsariya_2, "jerdan shakiri"),
                    AboutPlayer(R.drawable.player_shvetsariya_3, "rikardo rodriges"),
                    AboutPlayer(R.drawable.player_shvetsariya_4, "yann zommer")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_shvetsariya,
                        R.drawable.flag_kamerun,
                        "24.11.2022",
                        "1 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_braziliya,
                        R.drawable.flag_shvetsariya,
                        "28.11.2022",
                        "1 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_serbiya,
                        R.drawable.flag_shvetsariya,
                        "02.12.2022",
                        "2 : 3"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                28,
                "Gana",
                "H guruhida",
                R.drawable.flag_gana,
                R.drawable.komanda_gana,
                listOf(
                    "qora yulduzlar",
                    "61-o'rinda",
                    "to'rtinchi marta",
                    "chorak final",
                    "yuqori mudofaa chizig'i, qanotlarda faollik"
                ), listOf(
                    AboutPlayer(R.drawable.player_gana_1, "jordan ayyu"),
                    AboutPlayer(R.drawable.player_gana_2, "tomas partey"),
                    AboutPlayer(R.drawable.player_gana_3, "andre ayyu"),
                    AboutPlayer(R.drawable.player_gana_4, "muhammad qudus")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_portugaliya,
                        R.drawable.flag_gana,
                        "24.11.2022",
                        "3 : 2"
                    ),
                    DateOfMatch(
                        R.drawable.flag_janubiy_koreya,
                        R.drawable.flag_gana,
                        "28.11.2022",
                        "2 : 3"
                    ),
                    DateOfMatch(
                        R.drawable.flag_gana,
                        R.drawable.flag_urugvay,
                        "02.12.2022",
                        "0 : 2"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                29,
                "Janubiy Koreya",
                "H guruhida",
                R.drawable.flag_janubiy_koreya,
                R.drawable.komanda_janubiy_koreya,
                listOf(
                    "osiyo yo'lbaslari",
                    "28-o'rinda",
                    "o'n birinchi marta",
                    "yarim final",
                    "to'pga egalik qilish, tezkor futbol"
                ), listOf(
                    AboutPlayer(R.drawable.player_koreya_1, "son hyong-min"),
                    AboutPlayer(R.drawable.player_koreya_2, "xv chi chxan"),
                    AboutPlayer(R.drawable.player_koreya_3, "kim min jae"),
                    AboutPlayer(R.drawable.player_koreya_4, "xvan iy cho")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_urugvay,
                        R.drawable.flag_janubiy_koreya,
                        "24.11.2022",
                        "0 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_janubiy_koreya,
                        R.drawable.flag_gana,
                        "28.11.2022",
                        "2 : 3"
                    ),
                    DateOfMatch(
                        R.drawable.flag_janubiy_koreya,
                        R.drawable.flag_portugaliya,
                        "02.12.2022",
                        "3 : 2"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                30,
                "Portugaliya",
                "H guruhida",
                R.drawable.flag_portugaliya,
                R.drawable.komanda_portugaliya,
                listOf(
                    "Tanlanganlar jamoasi",
                    "9-o'rinda",
                    "sakkizinchi marta",
                    "bronza medal sohibi",
                    "mustahkam himoya,\nqanotdan uzatmalar"
                ), listOf(
                    AboutPlayer(R.drawable.player_portugaliya_1, "krishtianu ronaldu"),
                    AboutPlayer(R.drawable.player_portugaliya_2, "brunu fernandesh"),
                    AboutPlayer(R.drawable.player_portugaliya_3, "bernardu silva"),
                    AboutPlayer(R.drawable.player_portugaliya_4, "pepe")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_portugaliya,
                        R.drawable.flag_gana,
                        "24.11.2022",
                        "3 : 2"
                    ),
                    DateOfMatch(
                        R.drawable.flag_portugaliya,
                        R.drawable.flag_urugvay,
                        "28.11.2022",
                        "2 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_janubiy_koreya,
                        R.drawable.flag_portugaliya,
                        "02.12.2022",
                        "3 : 2"
                    )
                )
            )
        )
        teamList.add(
            DataOfFootballTeam(
                31,
                "Urugvay",
                "H guruhida",
                R.drawable.flag_urugvay,
                R.drawable.komanda_urugvay,
                listOf(
                    "moviylar",
                    "14-o'rinda",
                    "o'n to'rtinchi marta",
                    "ikki bor chempion",
                    "to'pga bir teginishda o'ynash texnikasi"
                ), listOf(
                    AboutPlayer(R.drawable.player_urugvay_1, "luis suares"),
                    AboutPlayer(R.drawable.player_urugvay_2, "edinson kavani"),
                    AboutPlayer(R.drawable.player_urugvay_3, "federiko valverde"),
                    AboutPlayer(R.drawable.player_urugvay_4, "diago godin")
                ), listOf(
                    DateOfMatch(
                        R.drawable.flag_urugvay,
                        R.drawable.flag_janubiy_koreya,
                        "24.11.2022",
                        "0 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_portugaliya,
                        R.drawable.flag_urugvay,
                        "28.11.2022",
                        "2 : 0"
                    ),
                    DateOfMatch(
                        R.drawable.flag_gana,
                        R.drawable.flag_urugvay,
                        "02.12.2022",
                        "0 : 2"
                    )
                )
            )
        )
    }

    fun getIndex(flag: Int): Int {
        for (i in 0 until teamList.size) {
            if (flag == teamList[i].teamFlagImg) {
                return i
            }
        }
        return -1
    }

    fun getData(pos: Int): DataOfFootballTeam {
        return teamList[pos]
    }
}


