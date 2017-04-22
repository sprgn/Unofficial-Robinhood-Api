package robinhood.api.endpoint.authorize.methods;

import robinhood.api.endpoint.authorize.Authentication;
import robinhood.api.endpoint.authorize.data.TokenResponse;
import robinhood.api.parameters.HttpHeaderParameter;
import robinhood.api.parameters.UrlParameter;
import robinhood.api.request.RequestMethod;

public class AuthorizeWithoutMultifactor extends Authentication {
	
	public AuthorizeWithoutMultifactor(String username, String password) {
		
		setUrlBase("api.robinhood.com/api-token-auth/");
		
		//Add the parameters into the request
		this.addUrlParameter(new UrlParameter("username", username));
		this.addUrlParameter(new UrlParameter("password", password));
		
		//We're going to want a Json response
		this.addHttpHeaderParameter(new HttpHeaderParameter("Accept", "application/json"));
		
		//This needs to be ran as POST
		this.setMethod(RequestMethod.POST);
		
		//Declare what the response should look like
		this.setReturnType(TokenResponse.class);
		
	}

}
