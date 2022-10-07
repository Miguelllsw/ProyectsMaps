package com.miguel.realmaps01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        // Add a marker in Sydney and move the camera
        LatLng Mi = new LatLng(-36.6353147, -71.9968706);
        mMap.addMarker(new MarkerOptions()
                .position(Mi)
                .title("PIEZA DE MIGUEL"));

        LatLng b = new LatLng(-36.6368442, -71.9976243);
        mMap.addMarker(new MarkerOptions()
                .position(b)
                .title("AULAS B"));

        LatLng idec = new LatLng(-36.6362575, -71.9972240);
        mMap.addMarker(new MarkerOptions()
                .position(idec)
                .title("IDEC"));

        LatLng D = new LatLng(-36.6363575, -71.9968689);
        mMap.addMarker(new MarkerOptions()
                .position(D)
                .title("AULAS D"));

        LatLng A = new LatLng(-36.6368711, -71.9964213);
        mMap.addMarker(new MarkerOptions()
                .position(A)
                .title("AULAS A"));

        LatLng Salud = new LatLng(-36.6370229, -71.9954242);
        mMap.addMarker(new MarkerOptions()
                .position(Salud)
                .title("SALUD"));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(b,15));

}}