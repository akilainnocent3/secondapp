package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes8.dex */
public final class qpm extends ProxySelector {
    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        ProxySelector.getDefault().connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public final List<Proxy> select(URI uri) {
        try {
            List<Proxy> listSelect = ProxySelector.getDefault().select(uri);
            listSelect.getClass();
            return listSelect;
        } catch (Exception unused) {
            return a.c(Proxy.NO_PROXY);
        }
    }
}
