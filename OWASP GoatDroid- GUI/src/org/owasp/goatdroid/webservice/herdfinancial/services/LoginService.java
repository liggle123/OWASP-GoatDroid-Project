package org.owasp.goatdroid.webservice.herdfinancial.services;

import org.owasp.goatdroid.webservice.herdfinancial.bean.LoginBean;

public interface LoginService {
	public LoginBean isDevicePermanentlyAuthorized(String deviceID);

	public boolean isSessionValid(int sessionToken);

	public LoginBean isSessionValidOrDeviceAuthorized(int sessionToken,
			String deviceID);

	public LoginBean validateCredentials(String userName, String password);

}
