package yads;

import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class yf {
    @k.t
    public static final void a(@oy.l X509TrustManager x509TrustManager, @oy.m X509Certificate[] x509CertificateArr, @oy.m String str, @oy.m Socket socket) throws CertificateException {
        if (he4.a(x509TrustManager)) {
            ie4.a(x509TrustManager).checkClientTrusted(x509CertificateArr, str, socket);
        } else {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    @k.t
    public static final void b(@oy.l X509TrustManager x509TrustManager, @oy.m X509Certificate[] x509CertificateArr, @oy.m String str, @oy.m Socket socket) throws CertificateException {
        if (he4.a(x509TrustManager)) {
            ie4.a(x509TrustManager).checkServerTrusted(x509CertificateArr, str, socket);
        } else {
            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    @k.t
    public static final void a(@oy.l X509TrustManager x509TrustManager, @oy.m X509Certificate[] x509CertificateArr, @oy.m String str, @oy.m SSLEngine sSLEngine) throws CertificateException {
        if (he4.a(x509TrustManager)) {
            ie4.a(x509TrustManager).checkClientTrusted(x509CertificateArr, str, sSLEngine);
        } else {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    @k.t
    public static final void b(@oy.l X509TrustManager x509TrustManager, @oy.m X509Certificate[] x509CertificateArr, @oy.m String str, @oy.m SSLEngine sSLEngine) throws CertificateException {
        if (he4.a(x509TrustManager)) {
            ie4.a(x509TrustManager).checkServerTrusted(x509CertificateArr, str, sSLEngine);
        } else {
            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    @oy.l
    @k.t
    public static final hw2 a(@oy.l u20 u20Var) throws CertificateException {
        return new ou2(u20Var);
    }
}
