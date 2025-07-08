package testcases;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.testng.annotations.Test;

import base.BaseClass;

public class OpenBrowserAndURL {
	
	@Test(groups = {"smoke","regression","sanity","functional"})
	public void openBrowserAndURL() throws Exception {
		BaseClass.setUp();

		Thread.sleep(2000);
	}

}


