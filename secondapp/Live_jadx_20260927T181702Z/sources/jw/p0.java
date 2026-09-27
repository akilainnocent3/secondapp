package jw;

import com.ironsource.C4235d4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import dr.g1;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final a f101387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Proxy f101388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final InetSocketAddress f101389c;

    public p0(@oy.l a address, @oy.l Proxy proxy, @oy.l InetSocketAddress socketAddress) {
        kotlin.jvm.internal.m0.p(address, "address");
        kotlin.jvm.internal.m0.p(proxy, "proxy");
        kotlin.jvm.internal.m0.p(socketAddress, "socketAddress");
        this.f101387a = address;
        this.f101388b = proxy;
        this.f101389c = socketAddress;
    }

    @cs.j(name = "-deprecated_address")
    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @g1(expression = "address", imports = {}))
    public final a a() {
        return this.f101387a;
    }

    @cs.j(name = "-deprecated_proxy")
    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @g1(expression = "proxy", imports = {}))
    public final Proxy b() {
        return this.f101388b;
    }

    @cs.j(name = "-deprecated_socketAddress")
    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @g1(expression = "socketAddress", imports = {}))
    public final InetSocketAddress c() {
        return this.f101389c;
    }

    @cs.j(name = "address")
    @oy.l
    public final a d() {
        return this.f101387a;
    }

    @cs.j(name = "proxy")
    @oy.l
    public final Proxy e() {
        return this.f101388b;
    }

    public boolean equals(@oy.m Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return kotlin.jvm.internal.m0.g(p0Var.f101387a, this.f101387a) && kotlin.jvm.internal.m0.g(p0Var.f101388b, this.f101388b) && kotlin.jvm.internal.m0.g(p0Var.f101389c, this.f101389c);
    }

    public final boolean f() {
        if (this.f101388b.type() != Proxy.Type.HTTP) {
            return false;
        }
        return this.f101387a.v() != null || this.f101387a.q().contains(k0.H2_PRIOR_KNOWLEDGE);
    }

    @cs.j(name = "socketAddress")
    @oy.l
    public final InetSocketAddress g() {
        return this.f101389c;
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f101387a.hashCode()) * 31) + this.f101388b.hashCode()) * 31) + this.f101389c.hashCode();
    }

    @oy.l
    public String toString() {
        String hostAddress;
        StringBuilder sb2 = new StringBuilder();
        String strE = this.f101387a.w().E();
        InetAddress address = this.f101389c.getAddress();
        String strK = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : kw.h.k(hostAddress);
        if (cv.p0.m3(strE, ':', false, 2, null)) {
            sb2.append(C4235d4.j.f61460d);
            sb2.append(strE);
            sb2.append(C4235d4.j.f61462e);
        } else {
            sb2.append(strE);
        }
        if (this.f101387a.w().M() != this.f101389c.getPort() || kotlin.jvm.internal.m0.g(strE, strK)) {
            sb2.append(":");
            sb2.append(this.f101387a.w().M());
        }
        if (!kotlin.jvm.internal.m0.g(strE, strK)) {
            if (kotlin.jvm.internal.m0.g(this.f101388b, Proxy.NO_PROXY)) {
                sb2.append(" at ");
            } else {
                sb2.append(" via proxy ");
            }
            if (strK == null) {
                sb2.append("<unresolved>");
            } else if (cv.p0.m3(strK, ':', false, 2, null)) {
                sb2.append(C4235d4.j.f61460d);
                sb2.append(strK);
                sb2.append(C4235d4.j.f61462e);
            } else {
                sb2.append(strK);
            }
            sb2.append(":");
            sb2.append(this.f101389c.getPort());
        }
        return sb2.toString();
    }
}
