package com.chartboost.sdk.internal.Networking;

import com.chartboost.sdk.impl.mg;
import java.net.URL;
import java.util.Arrays;
import kotlin.jvm.internal.m0;
import to.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements EndpointRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mg f41788a;

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class C0415a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41789a;

        static {
            int[] iArr = new int[EndpointRepository.EndPoint.values().length];
            try {
                iArr[EndpointRepository.EndPoint.INTERSTITIAL_GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EndpointRepository.EndPoint.REWARDED_GET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EndpointRepository.EndPoint.PREFETCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41789a = iArr;
        }
    }

    public a(mg sdkConfiguration) {
        m0.p(sdkConfiguration, "sdkConfiguration");
        this.f41788a = sdkConfiguration;
    }

    public final URL a(EndpointRepository.EndPoint endPoint) {
        int i10 = C0415a.f41789a[endPoint.ordinal()];
        if (i10 == 1) {
            String str = String.format("webview/%s/interstitial/get", Arrays.copyOf(new Object[]{this.f41788a.f40042y}, 1));
            m0.o(str, "format(...)");
            return a(endPoint, str);
        }
        if (i10 == 2) {
            String str2 = String.format("webview/%s/reward/get", Arrays.copyOf(new Object[]{this.f41788a.f40042y}, 1));
            m0.o(str2, "format(...)");
            return a(endPoint, str2);
        }
        if (i10 != 3) {
            return null;
        }
        String webviewPrefetchEndpoint = this.f41788a.f40043z;
        m0.o(webviewPrefetchEndpoint, "webviewPrefetchEndpoint");
        return a(endPoint, webviewPrefetchEndpoint);
    }

    @Override // com.chartboost.sdk.internal.Networking.EndpointRepository
    public URL getEndPointUrl(EndpointRepository.EndPoint endPoint) {
        m0.p(endPoint, "endPoint");
        URL urlA = a(endPoint);
        return urlA == null ? b.b(endPoint) : urlA;
    }

    @Override // com.chartboost.sdk.internal.Networking.EndpointRepository
    public void setEndpoint(EndpointRepository.EndPoint endPoint, String host, String path) {
        m0.p(endPoint, "endPoint");
        m0.p(host, "host");
        m0.p(path, "path");
        throw new IllegalStateException("Cannot set endpoint");
    }

    public final URL a(EndpointRepository.EndPoint endPoint, String str) {
        return new URL("https", b.a(endPoint), c.userBaseDel + str);
    }

    @Override // com.chartboost.sdk.internal.Networking.EndpointRepository
    public void restoreDefaults() {
    }
}
