package uz.gita.worldcup2022infoapp.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.github.siyamed.shapeimageview.DiamondImageView
import uz.gita.worldcup2022infoapp.R
import uz.gita.worldcup2022infoapp.data.domain.TeamRepository

class InfoActivity : AppCompatActivity() {
    private lateinit var repository: TeamRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        val pos = intent.getIntExtra("TEAM_ID", 0)
        val flag = intent.getIntExtra("TEAM_FLAG", 0)
        Log.d("TTT", "$pos @@@ $flag")
        repository = TeamRepository.getInstance()
        val teamData = repository.getData(pos)
        findViewById<TextView>(R.id.txtCommand).text = teamData.teamName
        findViewById<TextView>(R.id.txtCommandGroup).text = teamData.groupName
        findViewById<ImageView>(R.id.imgCommand).setImageResource(teamData.teamFlagImg)
        findViewById<ImageView>(R.id.viewPages).setImageResource(teamData.teamPlayersImg)
        findViewById<TextView>(R.id.txtFirstDescription).text = teamData.aboutTeam[0]
        findViewById<TextView>(R.id.txtSecondDescription).text = teamData.aboutTeam[1]
        findViewById<TextView>(R.id.txtThirdDescription).text = teamData.aboutTeam[2]
        findViewById<TextView>(R.id.txtFourthDescription).text = teamData.aboutTeam[3]
        findViewById<TextView>(R.id.txtFifthDescription).text = teamData.aboutTeam[4]

        findViewById<ImageView>(R.id.imgFirstPlayer).setImageResource(teamData.playerList[0].playerImg)
        findViewById<TextView>(R.id.textFirstPlayer).text = teamData.playerList[0].playerName
        findViewById<ImageView>(R.id.imgSecondPlayer).setImageResource(teamData.playerList[1].playerImg)
        findViewById<TextView>(R.id.textSecondPlayer).text = teamData.playerList[1].playerName
        findViewById<ImageView>(R.id.imgThirdPlayer).setImageResource(teamData.playerList[2].playerImg)
        findViewById<TextView>(R.id.textThirdPlayer).text = teamData.playerList[2].playerName
        findViewById<ImageView>(R.id.imgFourthPlayer).setImageResource(teamData.playerList[3].playerImg)
        findViewById<TextView>(R.id.textFourthPlayer).text = teamData.playerList[3].playerName


        findViewById<TextView>(R.id.firstMatchDate).text = teamData.matchList[0].textDate
        findViewById<TextView>(R.id.firstMatchTime).text = teamData.matchList[0].textTime

        val img1 = findViewById<DiamondImageView>(R.id.imgMatch1_1)
        img1.setImageResource(teamData.matchList[0].firstTeamImg)
        img1.setOnClickListener {
            if (flag != teamData.matchList[0].firstTeamImg) {
                setIntent(repository.getIndex(teamData.matchList[0].firstTeamImg), teamData.matchList[0].firstTeamImg)
            }
        }

        val img2 = findViewById<DiamondImageView>(R.id.imgMatch1_2)
        img2.setImageResource(teamData.matchList[0].secondTeamImg)
        img2.setOnClickListener {
            if (flag != teamData.matchList[0].secondTeamImg) {
                setIntent(repository.getIndex(teamData.matchList[0].secondTeamImg), teamData.matchList[0].secondTeamImg)
            }
        }

        findViewById<TextView>(R.id.secondMatchDate).text = teamData.matchList[1].textDate
        findViewById<TextView>(R.id.secondMatchTime).text = teamData.matchList[1].textTime
        val img3 = findViewById<DiamondImageView>(R.id.imgMatch2_1)
        img3.setImageResource(teamData.matchList[1].firstTeamImg)
        img3.setOnClickListener {
            if (flag != teamData.matchList[1].firstTeamImg) {
                setIntent(repository.getIndex(teamData.matchList[1].firstTeamImg), teamData.matchList[1].firstTeamImg)
            }
        }
        val img4 = findViewById<DiamondImageView>(R.id.imgMatch2_2)
        img4.setImageResource(teamData.matchList[1].secondTeamImg)
        img4.setOnClickListener {
            if (flag != teamData.matchList[1].secondTeamImg) {
                setIntent(repository.getIndex(teamData.matchList[1].secondTeamImg), teamData.matchList[1].secondTeamImg)
            }
        }

        findViewById<TextView>(R.id.thirdMatchDate).text = teamData.matchList[2].textDate
        findViewById<TextView>(R.id.thirdMatchTime).text = teamData.matchList[2].textTime

        val img5 = findViewById<DiamondImageView>(R.id.imgMatch3_1)
        img5.setImageResource(teamData.matchList[2].firstTeamImg)
        img5.setOnClickListener {
            if (flag != teamData.matchList[2].firstTeamImg) {
                setIntent(repository.getIndex(teamData.matchList[2].firstTeamImg), teamData.matchList[2].firstTeamImg)
            }
        }
        val img6 = findViewById<DiamondImageView>(R.id.imgMatch3_2)
        img6.setImageResource(teamData.matchList[2].secondTeamImg)
        img6.setOnClickListener {
            if (flag != teamData.matchList[2].secondTeamImg) {
                setIntent(repository.getIndex(teamData.matchList[2].secondTeamImg), teamData.matchList[2].secondTeamImg)
            }
        }
    }

    private fun setIntent(index: Int, teamFlag : Int) {
        finish()
        val intent = Intent(this@InfoActivity, InfoActivity::class.java)
        intent.putExtra("TEAM_ID", index)
        intent.putExtra("TEAM_FLAG", teamFlag)
        Log.d("TTT", "$index ## $teamFlag")
        startActivity(intent)
    }
}