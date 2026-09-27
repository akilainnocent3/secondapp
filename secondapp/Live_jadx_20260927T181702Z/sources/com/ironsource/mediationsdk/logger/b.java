package com.ironsource.mediationsdk.logger;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C4485r4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IronSourceLogger.IronSourceTag f62728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f62729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f62730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f62731d;

    public b(IronSourceLogger.IronSourceTag ironSourceTag, String str, String str2, int i10) {
        this.f62728a = ironSourceTag;
        this.f62729b = str;
        this.f62730c = str2;
        this.f62731d = i10;
    }

    public int a() {
        return this.f62731d;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", this.f62729b);
            jSONObject.put("tag", this.f62728a);
            jSONObject.put("level", this.f62731d);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, this.f62730c);
            return jSONObject;
        } catch (JSONException e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }
}
