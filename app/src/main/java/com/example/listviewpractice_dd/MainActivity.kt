package com.example.listviewpractice_dd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.annotation.ArrayRes
import com.example.listviewpractice_dd.adapters.StudentAdapter
import com.example.listviewpractice_dd.datas.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

    lateinit var mAdapter : StudentAdapter

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

        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

        studentListview.adapter = mAdapter

        studentListview.setOnItemClickListener { parent, view, position, id ->
            val clickedStudent = mStudentList[position]
            Toast.makeText(this, "${clickedStudent.name} 이 클릭됨", Toast.LENGTH_SHORT).show()

        }

        studentListview.setOnItemLongClickListener { parent, view, position, id ->
            mStudentList.removeAt(position)

            mAdapter.notifyDataSetChanged()

            return@setOnItemLongClickListener true


        }
    }
}