package com.example.intro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import java.nio.charset.Charset


class signup_1 : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup1)
        editText = findViewById(R.id.editTextTextPersonName)
        button = findViewById(R.id.button3)

        button.setOnClickListener() {
            //get all the values;
            editText = findViewById(R.id.editTextTextPersonName)
            val name = editText.text.toString()

            editText = findViewById(R.id.editTextTextPersonName2)
            val phone = editText.text.toString()

            editText = findViewById(R.id.editTextTextPersonName3)
            val county = editText.text.toString()

            editText = findViewById(R.id.editTextTextPersonName4)
            val constituency = editText.text.toString()

            editText = findViewById(R.id.editTextTextPersonName5)
            val passwordFarmer = editText.text.toString()




            val queue = Volley.newRequestQueue(applicationContext)
            val url = "http://192.168.253.204:3010/register"
            val requestBody:String = "name="+name+"&phone="+phone+
                    "&county="+county+"&constituency="+constituency+"&password="+passwordFarmer
            val stringRequest: StringRequest = object : StringRequest(Method.POST,url,Response.Listener {response ->  
                Log.i("Response -> ",response.toString())
            },Response.ErrorListener { error ->
                Log.i("Error - > ",error.message.toString())
            }){
                override fun getBody(): ByteArray {
                    return requestBody.toByteArray(Charset.defaultCharset())
                }
            }
            queue.add(stringRequest)

        }
    }
}