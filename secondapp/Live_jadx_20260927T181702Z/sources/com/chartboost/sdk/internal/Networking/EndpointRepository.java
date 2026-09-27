package com.chartboost.sdk.internal.Networking;

import java.net.URL;
import oy.l;
import sr.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface EndpointRepository {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum EndPoint {
        CONFIG("/api/config"),
        INSTALL("/api/install"),
        PREFETCH("/webview/v2/prefetch"),
        INTERSTITIAL_GET("/webview/v2/interstitial/get"),
        INTERSTITIAL_SHOW("/interstitial/show"),
        REWARDED_GET("/webview/v2/reward/get"),
        REWARDED_SHOW("/reward/show"),
        BANNER_GET("/auction/sdk/banner"),
        BANNER_SHOW("/banner/show"),
        CLICK("/api/click"),
        VIDEO_COMPLETE("/api/video-complete");


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ sr.a f41780d = c.c(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f41781b;

        EndPoint(String str) {
            this.f41781b = str;
        }

        @l
        public static sr.a<EndPoint> getEntries() {
            return f41780d;
        }

        @l
        public final String getDefaultValue() {
            return this.f41781b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        AD_GET("live.chartboost.com"),
        DA("da.chartboost.com");


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ sr.a f41785f = c.c(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f41786b;

        a(String str) {
            this.f41786b = str;
        }

        public final String b() {
            return this.f41786b;
        }
    }

    @l
    URL getEndPointUrl(@l EndPoint endPoint);

    void restoreDefaults();

    void setEndpoint(@l EndPoint endPoint, @l String str, @l String str2);
}
