package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
abstract class AbstractC4248e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f61587a = "eventId";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f61588b = "timestamp";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f61589c = "InterstitialEvents";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f61590d = "events";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f61591e = "events";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    JSONObject f61592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f61593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f61594h;

    private String a(int i10) {
        return i10 != 2 ? "events" : "InterstitialEvents";
    }

    public abstract String a();

    public abstract String a(ArrayList<C5> arrayList, JSONObject jSONObject);

    public String b() {
        return TextUtils.isEmpty(this.f61594h) ? a() : this.f61594h;
    }

    public abstract String c();

    public JSONObject a(C5 c10) {
        JSONObject jSONObject;
        try {
            String strA = c10.a();
            if (!TextUtils.isEmpty(strA)) {
                jSONObject = new JSONObject(strA);
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject.put("eventId", c10.c());
            jSONObject.put("timestamp", c10.d());
            return jSONObject;
        } catch (JSONException e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return null;
        }
    }

    public String a(JSONArray jSONArray) {
        try {
            if (this.f61592f == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(this.f61592f.toString());
            jSONObject.put("timestamp", IronSourceUtils.e());
            jSONObject.put(a(this.f61593g), jSONArray);
            return jSONObject.toString();
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            return "";
        }
    }

    public void a(String str) {
        this.f61594h = str;
    }
}
