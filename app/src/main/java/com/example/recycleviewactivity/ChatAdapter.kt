package com.example.recycleviewactivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.chat_list_item.view.*

class ChatAdapter(private val context: Context):RecyclerView.Adapter<ChatAdapter.ChatViewHolder>() {

var chatList:ArrayList<MainActivity.ChatMessage> = arrayListOf()

fun addChatList(chatListActivity: ArrayList<MainActivity.ChatMessage>)
{
    chatList=chatListActivity

}



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {

        val view:View=LayoutInflater.from(context).inflate(R.layout.chat_list_item,parent,false)

        return ChatViewHolder(view)
    }

    override fun getItemCount(): Int {
      return chatList.size
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {

        val chatItem:MainActivity.ChatMessage=chatList[position]
        var senderNameText=holder.itemView.userName
        var messageDate=holder.itemView.chatDate
        var messageText=holder.itemView.chatMessage
        senderNameText.text=chatItem.sender
       messageDate.text=chatItem.date
        messageText.text=chatItem.message


    }
    class ChatViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    }
}