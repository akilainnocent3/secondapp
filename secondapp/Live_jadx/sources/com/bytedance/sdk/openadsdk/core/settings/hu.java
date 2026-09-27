package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu {
    public static final hu hww = new hu(null);

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public static String f36781tq = "";

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    public boolean f36782hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    public boolean f36783hv;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public String f36784sd;
    public boolean vy;

    public hu(String str) {
        this.f36784sd = "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js";
        this.vy = true;
        this.f36783hv = true;
        this.f36782hu = true;
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("performance_js");
            String strOptString = jSONObjectOptJSONObject.optString("url", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js");
            if (!TextUtils.isEmpty(strOptString)) {
                this.f36784sd = strOptString;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i10));
            }
            this.vy = arrayList.contains("load_finish");
            this.f36782hu = arrayList.contains("load_fail");
            this.f36783hv = arrayList.contains("load");
        } catch (Exception unused) {
        }
    }
}
