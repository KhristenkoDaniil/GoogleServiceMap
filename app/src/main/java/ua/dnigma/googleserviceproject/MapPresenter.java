package ua.dnigma.googleserviceproject;


import android.app.FragmentManager;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

/**
 * Created by Даниил on 01.03.2018.
 */

public class MapPresenter implements MapContract.Presenter, OnMapReadyCallback {
    MapContract.View view;

    public MapPresenter(MapContract.View view) {
        this.view = view;

    }

    @Override
    public void initMap() {
        FragmentManager fragmentManager = view.getContext().getFragmentManager();
        MapFragment mapFragment = (MapFragment) fragmentManager.findFragmentById(R.id.map_fragment);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
}
