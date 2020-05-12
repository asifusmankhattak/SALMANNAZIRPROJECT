package com.example.recycleviewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val chatAdapter= ChatAdapter(this)
        chatAdapter.addChatList(getChatMessageLocally())
        chatProgressBar.visibility=View.VISIBLE
        chatRecycleView.layoutManager=LinearLayoutManager(this)
        chatRecycleView.adapter= chatAdapter
        chatProgressBar.visibility=View.GONE
    }
    fun getChatMessageLocally() : ArrayList<ChatMessage>{
        var chatList:ArrayList<ChatMessage> = arrayListOf<ChatMessage>()
        chatList.add(ChatMessage(sender="asif",date="22.2.2002",message="this is my my message"))
        chatList.add(ChatMessage(sender="ali",date="2.2.2242",message="this is my my message"))
        chatList.add(ChatMessage(sender="amer",date="22.4.2202",message="this is my my message"))
        chatList.add(ChatMessage(sender="mudassar",date="22.5.1202",message="this is my my message"))
        chatList.add(ChatMessage(sender="asif sohail",date="22.6.2002",message="this is my my message"))
        chatList.add(ChatMessage(sender="umar",date="22.7.2202",message="this is my my message"))
        chatList.add(ChatMessage(sender="shakor",date="22.8.2202",message="this is my my message"))
        chatList.add(ChatMessage(sender="khaldom",date="22.9.2202",message="this is my my message"))
        chatList.add(ChatMessage(sender="iqrar",date="22.12.2202",message="this is my my message"))
        chatList.add(ChatMessage(sender="zesahan",date="22.10.2020",message="this is my my message"))

        return chatList

    }

    data class ChatMessage(var sender:String="Sender",var date:String,var message :String){

    }
}
