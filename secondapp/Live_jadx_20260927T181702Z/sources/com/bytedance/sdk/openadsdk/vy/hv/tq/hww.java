package com.bytedance.sdk.openadsdk.vy.hv.tq;

import com.bytedance.sdk.openadsdk.core.model.kub;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private boolean f37841hu = false;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private sd f37842hv;
    private kub hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private JSONObject f37843sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private String f37844tq;
    private JSONObject vy;

    public hww(kub kubVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.hww = kubVar;
        this.f37844tq = str;
        this.f37843sd = jSONObject;
        this.vy = jSONObject2;
    }

    public boolean hu() {
        return this.f37841hu;
    }

    public sd hv() {
        return this.f37842hv;
    }

    public kub hww() {
        return this.hww;
    }

    public JSONObject sd() {
        if (this.f37843sd == null) {
            this.f37843sd = new JSONObject();
        }
        return this.f37843sd;
    }

    public String tq() {
        return this.f37844tq;
    }

    public void vgm() {
        sd sdVar = this.f37842hv;
        if (sdVar != null) {
            sdVar.hww(this);
        }
    }

    public JSONObject vy() {
        if (this.vy == null) {
            this.vy = new JSONObject();
        }
        return this.vy;
    }

    public void hww(sd sdVar) {
        this.f37842hv = sdVar;
    }

    public void hww(boolean z10) {
        this.f37841hu = z10;
    }
}
