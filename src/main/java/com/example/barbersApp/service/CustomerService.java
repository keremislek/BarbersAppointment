package com.example.barbersApp.service;



import com.example.barbersApp.request.AuthenticationRequest;
import com.example.barbersApp.request.CreateCustomerRequest;

import com.example.barbersApp.response.AuthenticationResponse;


public interface CustomerService {
	
	AuthenticationResponse register(CreateCustomerRequest request);

    AuthenticationResponse authenticate(AuthenticationRequest request);

}
