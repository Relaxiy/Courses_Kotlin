package com.example.lesson4.domain.ext

import com.example.lesson4.domain.models.GraphicCardData

fun GraphicCardData.concat() = "$series $number $postfix"