package com.example.topappbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.*
import com.example.topappbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

  private lateinit var navController: NavController

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.primerFragment,
                R.id.segundoFragment,
                R.id.tercerFragment
            ),
            binding.drawerLayout

        )

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container)
        if (navHostFragment != null) {
            navController  = navHostFragment.findNavController()
        }

        //Toolbar
        setSupportActionBar(binding.Toolbar)
        setupActionBarWithNavController(navController,appBarConfiguration)

        //Botton Navegation
        binding.bottomNavigationView.setupWithNavController(navController)

        //DrawerLayout

        binding.navView.setupWithNavController(navController)

    }

    //para habilitar la flecha de atras qeue se muestra en el toolbar
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return item.onNavDestinationSelected(navController) ||super.onOptionsItemSelected(item)
    }
}