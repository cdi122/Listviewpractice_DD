package com.example.listviewpractice_dd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.ArrayRes
import com.example.listviewpractice_dd.datas.Student

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( Student("앱천재다인", 1991))
        mStudentList.add( Student("김민상", 1987))
        mStudentList.add( Student("조상민", 1984))
        mStudentList.add( Student("이영희", 1987))
        mStudentList.add( Student("박철수", 1995))
        mStudentList.add( Student("장소영", 1988))
        mStudentList.add( Student("이하이", 2000))



    }
}