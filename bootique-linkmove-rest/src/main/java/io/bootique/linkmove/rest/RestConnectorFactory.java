package io.bootique.linkmove.rest;

import com.nhl.link.move.connect.StreamConnector;
import com.nhl.link.move.runtime.connect.IConnectorFactory;
import io.bootique.jersey.client.HttpTargets;

/**
 * @since 1.1
 */
public class RestConnectorFactory implements IConnectorFactory<StreamConnector> {

    private HttpTargets httpTargets;

    public RestConnectorFactory(HttpTargets httpTargets) {
        this.httpTargets = httpTargets;
    }

    @Override
    public StreamConnector createConnector(String id) {
        return new RestConnector(httpTargets.newTarget(id));
    }
}
