package com.example.demo.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VenueDetails {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int VenueId;
	private String Venue;
	public int getVenueId() {
		return VenueId;
	}
	public void setVenueId(int venueId) {
		VenueId = venueId;
	}
	public String getVenue() {
		return Venue;
	}
	public void setVenue(String venue) {
		Venue = venue;
	}
	public VenueDetails(int venueId, String venue) {
		super();
		VenueId = venueId;
		Venue = venue;
	}
	public VenueDetails() {
		super();
		// TODO Auto-generated constructor stub
	} 
}
