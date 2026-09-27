package ww;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import jw.k0;
import kotlin.jvm.internal.m0;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final a f143956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @m
    public k f143957b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        @oy.l
        k create(@oy.l SSLSocket sSLSocket);

        boolean matchesSocket(@oy.l SSLSocket sSLSocket);
    }

    public i(@oy.l a socketAdapterFactory) {
        m0.p(socketAdapterFactory, "socketAdapterFactory");
        this.f143956a = socketAdapterFactory;
    }

    public final synchronized k a(SSLSocket sSLSocket) {
        try {
            if (this.f143957b == null && this.f143956a.matchesSocket(sSLSocket)) {
                this.f143957b = this.f143956a.create(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f143957b;
    }

    @Override // ww.k
    public void configureTlsExtensions(@oy.l SSLSocket sslSocket, @m String str, @oy.l List<? extends k0> protocols) {
        m0.p(sslSocket, "sslSocket");
        m0.p(protocols, "protocols");
        k kVarA = a(sslSocket);
        if (kVarA != null) {
            kVarA.configureTlsExtensions(sslSocket, str, protocols);
        }
    }

    @Override // ww.k
    @m
    public String getSelectedProtocol(@oy.l SSLSocket sslSocket) {
        m0.p(sslSocket, "sslSocket");
        k kVarA = a(sslSocket);
        if (kVarA != null) {
            return kVarA.getSelectedProtocol(sslSocket);
        }
        return null;
    }

    @Override // ww.k
    public boolean isSupported() {
        return true;
    }

    @Override // ww.k
    public boolean matchesSocket(@oy.l SSLSocket sslSocket) {
        m0.p(sslSocket, "sslSocket");
        return this.f143956a.matchesSocket(sslSocket);
    }

    @Override // ww.k
    public boolean matchesSocketFactory(@oy.l SSLSocketFactory sSLSocketFactory) {
        return j.a(this, sSLSocketFactory);
    }

    @Override // ww.k
    @m
    public X509TrustManager trustManager(@oy.l SSLSocketFactory sSLSocketFactory) {
        return j.b(this, sSLSocketFactory);
    }
}
