package org.jboss.errai.bus.server.service;

import org.jboss.errai.bus.client.CommandMessage;
import org.jboss.errai.bus.client.MessageBus;

public interface ErraiService {
    public static final String AUTHORIZATION_SVC_SUBJECT = "AuthorizationService";

    public void store(CommandMessage message);
    public MessageBus getBus();
}
