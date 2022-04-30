package com.belak.sample.view.activities

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.belak.sample.R
import com.belak.sample.databinding.ActivityScrollingBinding
import com.belak.sample.view.viewmodels.BaseActivityViewModel
import com.google.android.material.snackbar.Snackbar
import org.koin.core.module.Module

class ScrollingActivity : BaseActivity<BaseActivityViewModel,ActivityScrollingBinding>() {


    override val moduleList: List<Module> = emptyList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(findViewById(R.id.toolbar))
        binding.toolbarLayout.title = title
        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }


    override fun getViewBinding() = ActivityScrollingBinding.inflate(layoutInflater)

    override fun initViews() {
    }

    override fun initObservers() {
    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }







}