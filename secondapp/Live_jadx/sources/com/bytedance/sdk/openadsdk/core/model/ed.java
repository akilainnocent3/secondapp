package com.bytedance.sdk.openadsdk.core.model;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ed {
    private String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f36207sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private String f36208tq;

    public String hww() {
        return this.hww;
    }

    public int sd() {
        return this.f36207sd;
    }

    public String tq() {
        return this.f36208tq;
    }

    @Nullable
    public JSONObject vy() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("u", this.hww);
            jSONObject.put("ft", this.f36207sd);
            jSONObject.put("fu", this.f36208tq);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public void hww(String str) {
        this.hww = str;
    }

    public void tq(String str) {
        this.f36208tq = str;
    }

    public void hww(int i10) {
        this.f36207sd = i10;
    }
}
