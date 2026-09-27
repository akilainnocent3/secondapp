package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a f69523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Proxy f69524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final InetSocketAddress f69525c;

    public c0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f69523a = aVar;
        this.f69524b = proxy;
        this.f69525c = inetSocketAddress;
    }

    public a a() {
        return this.f69523a;
    }

    public Proxy b() {
        return this.f69524b;
    }

    public boolean c() {
        return this.f69523a.f69468i != null && this.f69524b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.f69525c;
    }

    public boolean equals(@zq.h Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return c0Var.f69523a.equals(this.f69523a) && c0Var.f69524b.equals(this.f69524b) && c0Var.f69525c.equals(this.f69525c);
    }

    public int hashCode() {
        return ((((this.f69523a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f69524b.hashCode()) * 31) + this.f69525c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f69525c + "}";
    }
}
