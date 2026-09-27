package com.applovin.shadow.okhttp3.internal.platform.android;

import com.applovin.shadow.okhttp3.Protocol;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface SocketAdapter {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class DefaultImpls {
        public static boolean matchesSocketFactory(@l SocketAdapter socketAdapter, @l SSLSocketFactory sslSocketFactory) {
            m0.p(sslSocketFactory, "sslSocketFactory");
            return false;
        }

        @m
        public static X509TrustManager trustManager(@l SocketAdapter socketAdapter, @l SSLSocketFactory sslSocketFactory) {
            m0.p(sslSocketFactory, "sslSocketFactory");
            return null;
        }
    }

    void configureTlsExtensions(@l SSLSocket sSLSocket, @m String str, @l List<? extends Protocol> list);

    @m
    String getSelectedProtocol(@l SSLSocket sSLSocket);

    boolean isSupported();

    boolean matchesSocket(@l SSLSocket sSLSocket);

    boolean matchesSocketFactory(@l SSLSocketFactory sSLSocketFactory);

    @m
    X509TrustManager trustManager(@l SSLSocketFactory sSLSocketFactory);
}
