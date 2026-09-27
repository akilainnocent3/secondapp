package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.a4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4181a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f60528a = "NETWORK_TYPE_WIFI";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f60529b = "NETWORK_TYPE_VPN";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f60530c = "NETWORK_TYPE_ETHERNET";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f60531d = "NETWORK_TYPE_UNKNOWN";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f60532e = "notReachable";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f60533f = "PHONE_TYPE_NONE";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f60534g = "NETWORK_TYPE_GPRS";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f60535h = "NETWORK_TYPE_EDGE";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f60536i = "NETWORK_TYPE_UMTS";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f60537j = "NETWORK_TYPE_CDMA";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f60538k = "NETWORK_TYPE_EVDO_0";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f60539l = "NETWORK_TYPE_EVDO_A";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f60540m = "NETWORK_TYPE_1xRTT";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f60541n = "NETWORK_TYPE_HSDPA";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f60542o = "NETWORK_TYPE_HSUPA";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f60543p = "NETWORK_TYPE_HSPA";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f60544q = "NETWORK_TYPE_IDEN";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f60545r = "NETWORK_TYPE_EVDO_B";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f60546s = "NETWORK_TYPE_LTE";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f60547t = "NETWORK_TYPE_EHRPD";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f60548u = "NETWORK_TYPE_HSPAP";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f60549v = "NETWORK_TYPE_GSM";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f60550w = "NETWORK_TYPE_TD_SCDMA";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f60551x = "NETWORK_TYPE_IWLAN";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f60552y = "NETWORK_TYPE_LTE_CA";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f60553z = "NETWORK_TYPE_NR";

    @SuppressLint({"MissingPermission"})
    public static String a(Network network, Context context) {
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network != null && connectivityManager != null) {
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities == null) {
                    return c(context);
                }
                if (networkCapabilities.hasTransport(1)) {
                    return Z3.f60406b;
                }
                return networkCapabilities.hasTransport(0) ? Z3.f60405a : c(context);
            } catch (Exception e10) {
                C4485r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
        return "none";
    }

    public static String b(Context context) {
        return a(a(context), context);
    }

    private static String c(Context context) {
        String strA = Z3.a(context);
        return TextUtils.isEmpty(strA) ? "none" : strA;
    }

    public static String d(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            Network networkA = a(connectivityManager);
            if (networkA == null) {
                return f60532e;
            }
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(networkA);
                if (networkCapabilities == null) {
                    return f60531d;
                }
                if (networkCapabilities.hasTransport(1)) {
                    return f60528a;
                }
                if (networkCapabilities.hasTransport(0) && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                    return a(activeNetworkInfo.getSubtype());
                }
            } catch (Throwable th2) {
                C4485r4.d().a(th2);
                IronLog.INTERNAL.error("Error getting network capabilities: " + th2);
            }
        }
        return f60531d;
    }

    public static boolean e(Context context) {
        return b(context, a(context)).equals("vpn");
    }

    @SuppressLint({"MissingPermission"})
    private static String b(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (network != null && context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                    if (networkCapabilities.hasTransport(1)) {
                        return Z3.f60406b;
                    }
                    if (networkCapabilities.hasTransport(0)) {
                        return Z3.f60411g;
                    }
                    if (networkCapabilities.hasTransport(4)) {
                        return "vpn";
                    }
                    if (networkCapabilities.hasTransport(3)) {
                        return Z3.f60409e;
                    }
                    if (networkCapabilities.hasTransport(5)) {
                        return Z3.f60412h;
                    }
                    if (networkCapabilities.hasTransport(6)) {
                        return Z3.f60413i;
                    }
                    if (networkCapabilities.hasTransport(2)) {
                        return Z3.f60408d;
                    }
                }
            } catch (Exception e10) {
                C4485r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
        return "";
    }

    @SuppressLint({"MissingPermission"})
    public static Network a(Context context) {
        if (context == null) {
            return null;
        }
        return a((ConnectivityManager) context.getSystemService("connectivity"));
    }

    @SuppressLint({"MissingPermission"})
    public static JSONObject a(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                    jSONObject.put("networkCapabilities", networkCapabilities.toString());
                    jSONObject.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObject.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObject.put(C4235d4.j.f61495v, e(context));
                    return jSONObject;
                }
            } catch (Exception e10) {
                C4485r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
        return jSONObject;
    }

    private static String a(int i10) {
        switch (i10) {
            case 0:
                return f60533f;
            case 1:
                return f60534g;
            case 2:
                return f60535h;
            case 3:
                return f60536i;
            case 4:
                return f60537j;
            case 5:
                return f60538k;
            case 6:
                return f60539l;
            case 7:
                return f60540m;
            case 8:
                return f60541n;
            case 9:
                return f60542o;
            case 10:
                return f60543p;
            case 11:
                return f60544q;
            case 12:
                return f60545r;
            case 13:
                return f60546s;
            case 14:
                return f60547t;
            case 15:
                return f60548u;
            case 16:
                return f60549v;
            case 17:
                return f60550w;
            case 18:
                return f60551x;
            case 19:
                return f60552y;
            case 20:
                return f60553z;
            default:
                return f60531d;
        }
    }

    @Nullable
    private static Network a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetwork();
        } catch (Throwable th2) {
            C4485r4.d().a(th2);
            return null;
        }
    }
}
