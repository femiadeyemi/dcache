/*
 * Automatically generated by jrpcgen 1.0.7 on 2/21/09 1:22 AM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 */
package org.dcache.chimera.nfs.v4.xdr;
import org.dcache.xdr.*;
import java.io.IOException;
import java.nio.charset.Charset;

public class utf8string implements XdrAble {

    private static final Charset UTF8 = Charset.forName("UTF-8");

    public byte [] value;

    public utf8string() {
    }

    public utf8string(String s) {
        this.value = s.getBytes(UTF8);
    }

    public utf8string(byte [] value) {
        this.value = value;
    }

    public utf8string(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        xdr.xdrEncodeDynamicOpaque(value);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        value = xdr.xdrDecodeDynamicOpaque();
    }

    @Override
    public String toString() {
        return new String(value, UTF8);
    }
}
// End of utf8string.java
