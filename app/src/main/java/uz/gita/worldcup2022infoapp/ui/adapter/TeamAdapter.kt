package uz.gita.worldcup2022infoapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import uz.gita.worldcup2022infoapp.R
import uz.gita.worldcup2022infoapp.ui.adapter.data.TeamData

class TeamAdapter : ListAdapter<TeamData, TeamAdapter.Holder>(CourseItem) {

    private var onItemClickListener: ((Pair<Int, Int>) -> Unit)? = null
    fun setItemClickListener(block: (Pair<Int, Int>) -> Unit) {
        onItemClickListener = block
    }


    object CourseItem : DiffUtil.ItemCallback<TeamData>() {
        override fun areItemsTheSame(oldItem: TeamData, newItem: TeamData): Boolean =
            oldItem.teamId == newItem.teamId


        override fun areContentsTheSame(oldItem: TeamData, newItem: TeamData): Boolean {
            return oldItem.drawCount == newItem.drawCount
        }

    }

    inner class Holder(view: View) : RecyclerView.ViewHolder(view) {
        private val position = itemView.findViewById<TextView>(R.id.textPlaceInTable)
        private val imgTeam = itemView.findViewById<ImageView>(R.id.imgTemInTable)
        private val teamName = itemView.findViewById<TextView>(R.id.textCommandName)
        private val winCount = itemView.findViewById<TextView>(R.id.textWinCount)
        private val drawCount = itemView.findViewById<TextView>(R.id.textDrawCount)
        private val lostCount = itemView.findViewById<TextView>(R.id.textLostCount)
        private val goalsDifferent = itemView.findViewById<TextView>(R.id.textGoalsDifference)
        private val score = itemView.findViewById<TextView>(R.id.textSummaryScore)


        fun bind() {
            val item = getItem(adapterPosition)
            position.text = item.position
            imgTeam.setImageResource(item.image)
            teamName.text = item.teamName
            winCount.text = item.winCount
            drawCount.text = item.drawCount
            lostCount.text = item.lostCount
            goalsDifferent.text = item.goalsDifference
            score.text = item.score

            imgTeam.setOnClickListener {
                onItemClickListener?.invoke(Pair(item.teamId, item.image))
            }
            teamName.setOnClickListener {
                onItemClickListener?.invoke(Pair(item.teamId, item.image))
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder =
        Holder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_team_table, parent, false)
        )

    override fun onBindViewHolder(holder: Holder, position: Int) = holder.bind()
}