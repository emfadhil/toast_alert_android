package com.digitalindo.day2_kotlin

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

//    buat variabel global
    private var input1 : EditText? = null
    private var input2 : EditText? = null
    //    buat variabel global

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttontoast = findViewById<Button>(R.id.buttonToast)
        val buttonalert = findViewById<Button>(R.id.buttonAlert)

        input1 = findViewById<EditText>(R.id.number1)
        input2 = findViewById<EditText>(R.id.number2)

//      membuat event ada dua macam:
        //buat diluar function
//      buttontoast.setOnClickListener()

        //buat di dalam function
        buttontoast.setOnClickListener {

            Toast.makeText(this, "ini toast", Toast.LENGTH_SHORT).show()
        }

        buttonalert.setOnClickListener {

            val alert = AlertDialog.Builder(this)
            alert.setTitle("Informasi")
            alert.setMessage("content alert")
            alert.setPositiveButton("Oke", DialogInterface.OnClickListener { dialog, which ->

                Toast.makeText(this, "Oke", Toast.LENGTH_SHORT).show()

            })

            alert.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, which ->

                Toast.makeText(this, "Cancel", Toast.LENGTH_SHORT).show()

            })

            alert.setNeutralButton("Close", DialogInterface.OnClickListener { dialog, which ->

                Toast.makeText(this, "Close", Toast.LENGTH_SHORT).show()

            })



            alert.show()


        }

//        // life cycle di android
//        override fun onStart(){}//saat apliaksi dibuat
//        override fun onResume(){}//saat apliaksi berjalan
//        override fun onPause(){}//saat sedang tidak digunakan, idle
//        override fun onStop(){}//saat berhenti, di background
//        override fun onDestroy(){}//saat aplikasi di clear
    }


//    buat function show alert
    private fun showAlert(result: String){

        val alert = AlertDialog.Builder(this)
        alert.setTitle("Informasi")
        alert.setMessage(result)
        alert.show()
        alert.setPositiveButton("Oke", DialogInterface.OnClickListener { dialog, which ->

            Toast.makeText(this, "Oke", Toast.LENGTH_SHORT).show()

        })
        alert.show()

    }
    // end buat function show alert


//    action button hitung
     fun actionHitung(view: android.view.View) {

//        ambil dari inputan user
        val ambil1 = input1?.text.toString()
        val ambil2 = input2?.text.toString()

        val x = ambil1.toDouble()
        val y = ambil2.toDouble()

        val result = x.times(y)

              //show result in alert langsung
//            val alert2 = AlertDialog.Builder(this)
//            alert2.setTitle("Hasil")
//            alert2.setMessage("${result}")
//            alert2.show()


//    show result dengan function
    showAlert("${result}")

    }
}