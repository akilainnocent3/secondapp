package com.ironsource;

import android.app.Activity;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.he, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC4317he {
    void a(Activity activity);

    void a(String str, String str2, int i10);

    void a(String str, String str2, String str3, Map<String, String> map, Kc kc2);

    void a(String str, String str2, String str3, Map<String, String> map, Pc pc2);

    void a(JSONObject jSONObject);

    boolean a(String str);

    void b(JSONObject jSONObject);

    void c(JSONObject jSONObject);

    void onPause(Activity activity);

    void onResume(Activity activity);
}
