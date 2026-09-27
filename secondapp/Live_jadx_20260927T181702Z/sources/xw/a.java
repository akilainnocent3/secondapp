package xw;

import fr.g0;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.jvm.internal.s1;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\nNullProxySelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NullProxySelector.kt\nokhttp3/internal/proxy/NullProxySelector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
public final class a extends ProxySelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public static final a f145634a = new a();

    @Override // java.net.ProxySelector
    @l
    public List<Proxy> select(@m URI uri) {
        if (uri != null) {
            return g0.l(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }

    @Override // java.net.ProxySelector
    public void connectFailed(@m URI uri, @m SocketAddress socketAddress, @m IOException iOException) {
    }
}
