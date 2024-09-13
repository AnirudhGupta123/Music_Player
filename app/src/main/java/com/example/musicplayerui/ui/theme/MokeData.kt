package com.example.musicplayerui.ui.theme

import com.example.musicplayerui.R

data class SongsData(
    val id: Int,
    val img: Int,
    val title: String,
    val artist: String,
    val duration: String

)

fun SongsDatarepo(): List<SongsData> {
    return listOf(
        SongsData(1, R.drawable.image2, "Doori", "Ranveer Singh", "3:45"),
        SongsData(2, R.drawable.image3, "Aaj ki Raat", "Madhubanti Baghchi", "3:45"),
        SongsData(3, R.drawable.image4, "Khoobsurat", "vishal Mishra", "3:45"),
        SongsData(4, R.drawable.image5, "drama", "Raftaar", "3:45"),
        SongsData(5, R.drawable.image6, "Azadi", "Divine", "3:45"),
        SongsData(6, R.drawable.image7, "Baby", "Justin Bieber", "3:45"),
        SongsData(7, R.drawable.image8, "Fly", "Badshah", "3:45"),
        SongsData(8, R.drawable.image9, "Pagal", "Badshah", "3:45"),
        SongsData(9, R.drawable.image10, "Mercy", "Badshah", "3:45"),
        SongsData(10, R.drawable.image11, "Zaalim", "Badshah", "3:45"),
        SongsData(11, R.drawable.image12, "Believe", "Justin Bieber", "3:45"),
        SongsData(12, R.drawable.image13, "Stay", "Justin Bieber", "3:45"),
    )

}



