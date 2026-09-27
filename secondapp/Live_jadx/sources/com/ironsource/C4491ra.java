package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ra, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4491ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f63474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f63475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f63476d;

    public C4491ra(JSONObject jSONObject) {
        this.f63473a = jSONObject.optString(C4235d4.g.f61367b);
        this.f63474b = jSONObject.optJSONObject(C4235d4.g.f61368c);
        this.f63475c = jSONObject.optString("success");
        this.f63476d = jSONObject.optString(C4235d4.g.f61370e);
    }

    public String a() {
        return this.f63476d;
    }

    public String b() {
        return this.f63473a;
    }

    public JSONObject c() {
        return this.f63474b;
    }

    public String d() {
        return this.f63475c;
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C4235d4.g.f61367b, this.f63473a);
            jSONObject.put(C4235d4.g.f61368c, this.f63474b);
            jSONObject.put("success", this.f63475c);
            jSONObject.put(C4235d4.g.f61370e, this.f63476d);
            return jSONObject;
        } catch (JSONException e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }
}
