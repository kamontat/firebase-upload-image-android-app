package com.kamontat.loginfirebase

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mAuth: FirebaseAuth? = FirebaseAuth.getInstance()
    private var user: FirebaseUser? = mAuth?.currentUser

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Signout", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
            Log.d("MainFirebase", user.toString())
            mAuth?.signOut()
            finish()
        }
    }
}
