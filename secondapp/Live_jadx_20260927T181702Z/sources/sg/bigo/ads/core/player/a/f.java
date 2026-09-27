package sg.bigo.ads.core.player.a;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import sg.bigo.ads.common.m;

/* JADX INFO: loaded from: classes7.dex */
final class f extends ProxySelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<Proxy> f135181a = Arrays.asList(Proxy.NO_PROXY);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ProxySelector f135182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f135183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f135184d;

    private f(ProxySelector proxySelector, String str, int i10) {
        this.f135182b = (ProxySelector) m.a(proxySelector);
        this.f135183c = (String) m.a(str);
        this.f135184d = i10;
    }

    public static void a(String str, int i10) {
        ProxySelector.setDefault(new f(ProxySelector.getDefault(), str, i10));
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f135182b.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public final List<Proxy> select(URI uri) {
        return (this.f135183c.equals(uri.getHost()) && this.f135184d == uri.getPort()) ? f135181a : this.f135182b.select(uri);
    }
}
