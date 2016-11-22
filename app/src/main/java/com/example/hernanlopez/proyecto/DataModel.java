package com.example.hernanlopez.proyecto;

import android.graphics.Color;
import android.widget.Button;

/**
 * Created by horaciogarza on 11/22/16.
 */
public class DataModel {

	String name;
	String type;
	String version_number;
	String feature;
	String color;

	public DataModel(String name, String type, String version_number, String feature, String color) {
		this.name=name;
		this.type=type;
		this.version_number=version_number;
		this.feature=feature;
		this.color = color;

	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getVersion_number() {
		return version_number;
	}

	public String getFeature() {
		return feature;
	}

}