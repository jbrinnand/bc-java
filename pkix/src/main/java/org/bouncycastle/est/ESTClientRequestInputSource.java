package org.bouncycastle.est;

import java.io.IOException;
import java.io.OutputStream;

/**
 * ESTClientRequestInputSource, implementations of this will be called when the HTTP preamble
 * (Request-Line and Request Headers) have been written to the source.
 * Implementations are required to ensure the headers for Content-length are appropriately set
 * before writing data.
 */
public interface ESTClientRequestInputSource
{
    void ready(OutputStream os)
        throws IOException;
}
