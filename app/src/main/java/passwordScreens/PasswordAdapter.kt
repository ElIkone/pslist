package passwordScreens

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pslist.R

class PasswordAdapter(private val list: List<Password>) : RecyclerView.Adapter<PasswordViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PasswordViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return PasswordViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: PasswordViewHolder, position: Int) {
        val password: Password = list[position]
        holder.bind(password)
    }

    override fun getItemCount(): Int = list.size
}

class PasswordViewHolder(inflater: LayoutInflater, parent: ViewGroup) : RecyclerView.ViewHolder
(inflater.inflate(R.layout.item_view, parent, false)) {
    private var mPassword: TextView? = null
    init {
        mPassword = itemView.findViewById(R.id.textview_password)
    }

    fun bind(password: Password) {
        mPassword?.text = password.title
    }
}


