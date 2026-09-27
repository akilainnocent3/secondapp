package com.chartboost.sdk.internal.Networking;

import com.chartboost.sdk.impl.sb;
import cv.k0;
import java.net.URL;
import kotlin.jvm.internal.m0;
import oy.m;
import to.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class NetworkHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NetworkHelper f41787a = new NetworkHelper();

    @m
    private static String debugEndpoint;
    private static boolean isForceSDKToAcceptAllSSLCertsEnabled;

    public final String a(String endpoint, String str) {
        m0.p(endpoint, "endpoint");
        String str2 = debugEndpoint;
        if (str2 != null && str2.length() != 0) {
            sb.e("normalizedUrl: " + endpoint + " to: " + debugEndpoint, null);
            endpoint = debugEndpoint;
            m0.m(endpoint);
        }
        if (str == null || str.length() == 0) {
            str = "";
        } else if (!k0.J2(str, c.userBaseDel, false, 2, null)) {
            str = c.userBaseDel + str;
        }
        return endpoint + str;
    }

    public final String b(String urlString) {
        m0.p(urlString, "urlString");
        URL urlC = c(urlString);
        String path = null;
        if (urlC != null) {
            try {
                path = urlC.getPath();
            } catch (Exception e10) {
                sb.a("getPathFromUrl: " + urlString + " : " + e10, null);
                path = "";
            }
        }
        return path == null ? "" : path;
    }

    public final URL c(String urlString) {
        m0.p(urlString, "urlString");
        if (urlString.length() > 0) {
            try {
                return new URL(urlString);
            } catch (Exception e10) {
                sb.a("stringToURL: " + urlString + " : " + e10, null);
            }
        }
        return null;
    }

    public final String a(String urlString) {
        String str;
        m0.p(urlString, "urlString");
        URL urlC = c(urlString);
        if (urlC == null) {
            return "";
        }
        try {
            str = urlC.getProtocol() + "://" + urlC.getHost();
        } catch (Exception e10) {
            sb.a("getEndpointFromUrl: " + urlString + " : " + e10, null);
            str = "";
        }
        return str == null ? "" : str;
    }

    public static final boolean a() {
        return isForceSDKToAcceptAllSSLCertsEnabled;
    }
}
