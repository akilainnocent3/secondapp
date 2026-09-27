package com.startapp.sdk.internal;

import android.text.TextUtils;
import com.ironsource.C4235d4;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static CookieManager f74976a;

    public static void a(HttpURLConnection httpURLConnection, String str) {
        Map<String, List<String>> map;
        List<String> list;
        CookieManager cookieManager = f74976a;
        if (cookieManager == null || (map = cookieManager.get(URI.create(str), httpURLConnection.getRequestProperties())) == null || map.size() <= 0 || (list = map.get(kj.d.f102500p)) == null || list.size() <= 0) {
            return;
        }
        httpURLConnection.addRequestProperty(kj.d.f102500p, TextUtils.join(C4235d4.j.f61456b, list));
    }
}
