package com.example.udemycursoskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.*
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Relacionamos los botones
        val btnLifeCycle = findViewById<Button>(R.id.btn_cycle)
        val btnClickEvent = findViewById<Button>(R.id.btn_click)
        val btnAndrodExt = findViewById<Button>(R.id.btn_extensions)
        val btnPicasso = findViewById<Button>(R.id.btn_picasso)
        val btnListView = findViewById<Button>(R.id.btn_listView)
        val btnIntent = findViewById<Button>(R.id.btn_intent)
        val btnPermission = findViewById<Button>(R.id.btn_permissions)
        val btnsharedPreferences = findViewById<Button>(R.id.btn_sharedPreferences)
        val btnExtensionsFuctions = findViewById<Button>(R.id.btn_extensionFunctions)
        val btnComp = findViewById<Button>(R.id.btn_compartir)
        val btnActivityAnimation = findViewById<Button>(R.id.btn_activityAnimation)


        // codigo del boton compartir
        btn_compartir.setOnClickListener {
            val userMessage:String = "Les Comparto este mensaje:"

            val message:String = userMessage

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent,"Seleccione una app:"))
        }


        //Llamamos a las funciones
        btn_cycle.setOnClickListener { goToLifeCycleActivity() }
        btn_click.setOnClickListener { goToClickEventsActivity() }
        btn_extensions.setOnClickListener { goToAndroidExtesActivity() }
        btn_picasso.setOnClickListener { goToPicassoctivity() }
        btn_listView.setOnClickListener { goToListViewActivity() }
        btn_intent.setOnClickListener { goToIntentActivity() }
        btn_permissions.setOnClickListener { goToPermissionsActivity() }
        btn_sharedPreferences.setOnClickListener { goToSharedPreferencesActivity() }
        btn_extensionFunctions.setOnClickListener { goToExtensionsFuctionsActivity() }
        btnActivityAnimation.setOnClickListener { goToActivityAnimation() }

    }


    // Codigo para navegar en los diferentes activitys
    private fun goToLifeCycleActivity() = startActivity(Intent(this, LifeCycleActivity::class.java))
    private fun goToClickEventsActivity() =
        startActivity(Intent(this, ClickEventActivity::class.java))

    private fun goToAndroidExtesActivity() =
        startActivity(Intent(this, KotlinExtensionActivity::class.java))

    private fun goToPicassoctivity() = startActivity(Intent(this, PicassoActivity::class.java))
    private fun goToListViewActivity() = startActivity(Intent(this, ListViewActivity::class.java))
    private fun goToIntentActivity() = startActivity(Intent(this, IntentActivity::class.java))
    private fun goToPermissionsActivity() =
        startActivity(Intent(this, PermissionsActivity::class.java))

    private fun goToSharedPreferencesActivity() =
        startActivity(Intent(this, SharedPreferencesActivity::class.java))

    private fun goToExtensionsFuctionsActivity() =
        startActivity(Intent(this, ExtensionFunctionsActivity::class.java))

    private fun goToActivityAnimation() = startActivity(Intent(this,AnimationActivity::class.java))

    // Codigo del menu derecho y sus opciones
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    // codigo para que las opciones del menu funcione
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            R.id.opc_opciones -> {
                Toast.makeText(this, "Opcion favorito",Toast.LENGTH_SHORT).show()
                true
            }

            R.id.opc_buscar -> {
                Toast.makeText(this, "Opcion buscar",Toast.LENGTH_SHORT).show()
                true
            }

            R.id.opc_setting -> {
                Toast.makeText(this, "Opcion configuraciones",Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}