package org.mule.iapp.example.streaming;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.processor.MessageProcessor;

public class NonStreamedResourceProvider implements MessageProcessor {

    /**
     * Return the same MuleEvent, changing the Payload to a InputStream for the target file
     */
    @Override
    public MuleEvent process(final MuleEvent event) throws MuleException {
        final InputStream in = this.getClass().getResourceAsStream("/elements.csv");
        try {
            event.getMessage().setPayload(IOUtils.toString(in, "UTF-8"));
            return event;
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

}
