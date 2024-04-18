package uz.gita.worldcup2022infoapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import uz.gita.worldcup2022infoapp.R
import uz.gita.worldcup2022infoapp.ui.adapter.data.TableData

class TableAdapter : ListAdapter<TableData, TableAdapter.Holder>(CourseItem) {
    private var onItemClickListener: ((Pair<Int, Int>) -> Unit)? = null
    fun setItemClickListener(block: (Pair<Int, Int>) -> Unit) {
        onItemClickListener = block
    }


    object CourseItem : DiffUtil.ItemCallback<TableData>() {
        override fun areItemsTheSame(oldItem: TableData, newItem: TableData): Boolean =
            oldItem.groupName == newItem.groupName


        override fun areContentsTheSame(oldItem: TableData, newItem: TableData): Boolean {
            return oldItem.groupName == newItem.groupName
        }

    }

    inner class Holder(view: View) : RecyclerView.ViewHolder(view) {
        private val groupName = itemView.findViewById<TextView>(R.id.textGroupName)
        private val recycler = itemView.findViewById<RecyclerView>(R.id.teamRecycler)
        fun bind() {
            val item = getItem(adapterPosition)
            groupName.text = item.groupName
            val adapter = TeamAdapter()
            recycler.adapter = adapter
            adapter.submitList(item.teamList)
            adapter.setItemClickListener {
                onItemClickListener?.invoke(it)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder =
        Holder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_group_table, parent, false)
        )

    override fun onBindViewHolder(holder: Holder, position: Int) = holder.bind()
}