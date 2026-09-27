package com.bytedance.sdk.component.ok.tq;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {
    public int hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public int f34951sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public int f34952tq;
    public int vy;

    public hww(int i10, int i11, int i12, int i13) {
        this.hww = i10;
        this.f34952tq = i11;
        this.f34951sd = i12;
        this.vy = i13;
    }

    public JSONObject hww() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.hww);
            jSONObject.put("sdk_max_thread_num", this.f34952tq);
            jSONObject.put("app_thread_num", this.f34951sd);
            jSONObject.put("app_max_thread_num", this.vy);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
