package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vhb {
    private Context hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private JSONObject f32435sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private JSONObject f32436tq;
    private Map<String, Object> vy;

    public void hww(Context context) {
        this.hww = context;
    }

    public void tq(JSONObject jSONObject) {
        this.f32435sd = jSONObject;
    }

    public void hww(JSONObject jSONObject) {
        this.f32436tq = jSONObject;
    }

    public Map<String, Object> tq() {
        return this.vy;
    }

    public JSONObject hww() {
        return this.f32435sd;
    }

    public void hww(Map<String, Object> map) {
        this.vy = map;
    }
}
