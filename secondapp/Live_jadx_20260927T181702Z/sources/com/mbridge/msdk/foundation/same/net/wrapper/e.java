package com.mbridge.msdk.foundation.same.net.wrapper;

import android.text.TextUtils;
import com.ironsource.C4235d4;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f67170c = "e";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f67171d = "h";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f67172e = "i";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f67173f = "coppa";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f67174g = "d";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f67175h = "e";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f67176i = "a";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f67177j = "f";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f67178k = "g";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.foundation.same.net.model.a> f67179a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f67180b = new LinkedHashMap();

    public void a(String str, String str2) {
        if (str2 == null) {
            q0.b(f67170c, "add() value is null!");
        }
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        this.f67180b.put(str, str2);
    }

    public String b() {
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : this.f67180b.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append('&');
                }
                sb2.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb2.append(C4235d4.j.f61456b);
                sb2.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return sb2.toString();
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f67180b.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry.getKey(), "UTF-8"), URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            for (Map.Entry<String, com.mbridge.msdk.foundation.same.net.model.a> entry2 : this.f67179a.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry2.getKey(), "UTF-8"), URLEncoder.encode("FILE_NAME_" + entry2.getValue().d().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException unused) {
        } catch (JSONException e10) {
            q0.b(f67170c, e10.getMessage());
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(28);
        try {
            for (Map.Entry<String, String> entry : this.f67180b.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append('&');
                }
                sb2.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb2.append(G5.T);
                sb2.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            for (Map.Entry<String, com.mbridge.msdk.foundation.same.net.model.a> entry2 : this.f67179a.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append('&');
                }
                sb2.append(URLEncoder.encode(entry2.getKey(), "UTF-8"));
                sb2.append(G5.T);
                sb2.append(URLEncoder.encode("FILE_NAME_" + entry2.getValue().d().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException e10) {
            q0.b(f67170c, e10.getMessage());
        }
        return sb2.toString();
    }

    public Map<String, String> a() {
        return this.f67180b;
    }

    public void a(String str) {
        this.f67180b.remove(str);
        this.f67179a.remove(str);
    }
}
