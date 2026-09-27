package com.chartboost.sdk.internal.Networking;

import java.net.URL;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41790a;

        static {
            int[] iArr = new int[EndpointRepository.EndPoint.values().length];
            try {
                iArr[EndpointRepository.EndPoint.BANNER_GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f41790a = iArr;
        }
    }

    public static final String a(EndpointRepository.EndPoint endPoint) {
        m0.p(endPoint, "<this>");
        return a.f41790a[endPoint.ordinal()] == 1 ? EndpointRepository.a.DA.b() : EndpointRepository.a.AD_GET.b();
    }

    public static final URL b(EndpointRepository.EndPoint endPoint) {
        m0.p(endPoint, "<this>");
        return new URL("https", a(endPoint), endPoint.getDefaultValue());
    }

    public static final String a(URL url) {
        m0.p(url, "<this>");
        return url.getProtocol() + "://" + url.getHost();
    }
}
