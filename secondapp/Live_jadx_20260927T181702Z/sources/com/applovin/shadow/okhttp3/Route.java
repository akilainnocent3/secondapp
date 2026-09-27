package com.applovin.shadow.okhttp3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import cs.j;
import dr.g1;
import dr.o;
import dr.q;
import fw.b;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class Route {

    @l
    private final Address address;

    @l
    private final Proxy proxy;

    @l
    private final InetSocketAddress socketAddress;

    public Route(@l Address address, @l Proxy proxy, @l InetSocketAddress socketAddress) {
        m0.p(address, "address");
        m0.p(proxy, "proxy");
        m0.p(socketAddress, "socketAddress");
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = socketAddress;
    }

    @j(name = "-deprecated_address")
    @l
    @o(level = q.ERROR, message = "moved to val", replaceWith = @g1(expression = "address", imports = {}))
    /* JADX INFO: renamed from: -deprecated_address, reason: not valid java name */
    public final Address m132deprecated_address() {
        return this.address;
    }

    @j(name = "-deprecated_proxy")
    @l
    @o(level = q.ERROR, message = "moved to val", replaceWith = @g1(expression = "proxy", imports = {}))
    /* JADX INFO: renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m133deprecated_proxy() {
        return this.proxy;
    }

    @j(name = "-deprecated_socketAddress")
    @l
    @o(level = q.ERROR, message = "moved to val", replaceWith = @g1(expression = "socketAddress", imports = {}))
    /* JADX INFO: renamed from: -deprecated_socketAddress, reason: not valid java name */
    public final InetSocketAddress m134deprecated_socketAddress() {
        return this.socketAddress;
    }

    @j(name = "address")
    @l
    public final Address address() {
        return this.address;
    }

    public boolean equals(@m Object obj) {
        if (!(obj instanceof Route)) {
            return false;
        }
        Route route = (Route) obj;
        return m0.g(route.address, this.address) && m0.g(route.proxy, this.proxy) && m0.g(route.socketAddress, this.socketAddress);
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.address.hashCode()) * 31) + this.proxy.hashCode()) * 31) + this.socketAddress.hashCode();
    }

    @j(name = "proxy")
    @l
    public final Proxy proxy() {
        return this.proxy;
    }

    public final boolean requiresTunnel() {
        return this.address.sslSocketFactory() != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    @j(name = "socketAddress")
    @l
    public final InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    @l
    public String toString() {
        return "Route{" + this.socketAddress + b.f85383j;
    }
}
