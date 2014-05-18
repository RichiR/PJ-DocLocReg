package pj2014.doclocreg.factories;

import org.jboss.resteasy.client.ProxyFactory;
import org.jboss.resteasy.plugins.providers.RegisterBuiltin;
import org.jboss.resteasy.spi.ResteasyProviderFactory;

import pj2014.doclocreg.interfaces.IDocumentLocationRegistry;

public class DocLocRegProxyFactory {
public static IDocumentLocationRegistry getProxy(String baseUrl) {
		
		RegisterBuiltin.register(ResteasyProviderFactory.getInstance());
		return ProxyFactory.create(IDocumentLocationRegistry.class, baseUrl);						
		
	}

}
