package apotheke.client;

import com.google.gwt.user.client.rpc.AsyncCallback;


public interface GreetingServiceAsync {
	void greetServer(String input, AsyncCallback<String> callback) throws IllegalArgumentException;
}
