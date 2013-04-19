package org.mule.iapp.example.streaming;

import java.io.InputStream;

import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.processor.MessageProcessor;

public class StreamedResourceProvider implements MessageProcessor {

    /**
     * Return the same MuleEvent, changing the Payload to a InputStream for the target file
     */
    @Override
    public MuleEvent process(final MuleEvent event) throws MuleException {
        final InputStream in = this.getClass().getResourceAsStream("/elements.csv");
        event.getMessage().setPayload(in);
        return event;
    }

}
