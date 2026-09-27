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
public interface k {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        @Deprecated
        public static boolean a(@oy.l k kVar, @oy.l SSLSocketFactory sslSocketFactory) {
            m0.p(sslSocketFactory, "sslSocketFactory");
            return j.a(kVar, sslSocketFactory);
        }

        @Deprecated
        @m
        public static X509TrustManager b(@oy.l k kVar, @oy.l SSLSocketFactory sslSocketFactory) {
            m0.p(sslSocketFactory, "sslSocketFactory");
            return j.b(kVar, sslSocketFactory);
        }
    }

    void configureTlsExtensions(@oy.l SSLSocket sSLSocket, @m String str, @oy.l List<? extends k0> list);

    @m
    String getSelectedProtocol(@oy.l SSLSocket sSLSocket);

    boolean isSupported();

    boolean matchesSocket(@oy.l SSLSocket sSLSocket);

    boolean matchesSocketFactory(@oy.l SSLSocketFactory sSLSocketFactory);

    @m
    X509TrustManager trustManager(@oy.l SSLSocketFactory sSLSocketFactory);
}
