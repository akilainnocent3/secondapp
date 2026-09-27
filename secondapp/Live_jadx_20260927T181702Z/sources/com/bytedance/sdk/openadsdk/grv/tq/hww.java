package com.bytedance.sdk.openadsdk.grv.tq;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {
    private final int hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final float f37198sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final int f37199tq;

    public hww(int i10, int i11, float f10) {
        this.hww = i10;
        this.f37199tq = i11;
        this.f37198sd = f10;
    }

    public static JSONObject hww(hww hwwVar) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", hwwVar.hww);
        jSONObject.put("height", hwwVar.f37199tq);
        jSONObject.put("alpha", hwwVar.f37198sd);
        return jSONObject;
    }
}
