package com.example.f1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.f1.databinding.ActivityGpmapBinding
import com.google.android.gms.maps.GoogleMap.MAP_TYPE_HYBRID


class GPmap : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityGpmapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGpmapBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }
    private fun longclickonelmap(map: GoogleMap){
        mMap.setOnMapLongClickListener {latLng->
            mMap.addMarker(MarkerOptions().position(latLng))
        }

    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
       mMap.mapType= GoogleMap.MAP_TYPE_HYBRID
        val nigg1 = LatLng(45.61766489174225, 9.281391015924816)
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nigg1))
        mMap.addMarker(MarkerOptions().position(nigg1).title("Autodromo Nazionale Monza"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(nigg1, 17.0f))
        longclickonelmap(mMap)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.mapops, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        // Change the map type based on the user's selection.
        R.id.normal_map -> {
            mMap.mapType = GoogleMap.MAP_TYPE_NORMAL
            true
        }
        R.id.hybrid_map -> {
            mMap.mapType = GoogleMap.MAP_TYPE_HYBRID
            true
        }
        R.id.satellite_map -> {
            mMap.mapType = GoogleMap.MAP_TYPE_SATELLITE
            true
        }
        R.id.terrain_map -> {
           mMap.mapType = GoogleMap.MAP_TYPE_TERRAIN
            true
        }
        else -> super.onOptionsItemSelected(item)
    }
}