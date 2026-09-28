package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes8.dex */
public final class ur60 extends ProxySelector {
    public final ProxySelector a;

    public ur60(ProxySelector proxySelector) {
        this.a = proxySelector;
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        ProxySelector proxySelector = this.a;
        if (proxySelector != null) {
            proxySelector.connectFailed(uri, socketAddress, iOException);
        }
    }

    @Override // java.net.ProxySelector
    public final List<Proxy> select(URI uri) {
        List<Proxy> listSelect;
        try {
            ProxySelector proxySelector = this.a;
            if (proxySelector != null && (listSelect = proxySelector.select(uri)) != null) {
                return listSelect;
            }
            return a.c(Proxy.NO_PROXY);
        } catch (Exception unused) {
            return a.c(Proxy.NO_PROXY);
        }
    }
}
