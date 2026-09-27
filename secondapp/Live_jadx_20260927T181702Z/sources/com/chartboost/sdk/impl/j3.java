package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.internal.Networking.NetworkHelper;
import java.security.KeyManagementException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39545a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        public final SSLSocketFactory a() throws KeyManagementException {
            SSLContext sSLContext = Build.VERSION.SDK_INT >= 29 ? SSLContext.getInstance("TLSv1.3") : SSLContext.getInstance("TLSv1.2");
            if (NetworkHelper.a()) {
                sSLContext.init(null, new X509TrustManager[]{jg.c()}, null);
            } else {
                sSLContext.init(null, null, null);
            }
            sSLContext.createSSLEngine();
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            kotlin.jvm.internal.m0.o(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    public static final SSLSocketFactory a() {
        return f39545a.a();
    }
}
