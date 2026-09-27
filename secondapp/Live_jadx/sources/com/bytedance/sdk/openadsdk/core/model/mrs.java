package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class mrs {
    public static int hww = 1;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public static int f36343tq = 2;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f36348sd = 5;
    private int vy = 30;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private int f36345hv = 70;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f36344hu = 1;
    private int vgm = hww;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private int f36346ok = 0;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private int f36347rs = 0;
    private int nod = 3;

    public int hu() {
        return this.f36345hv;
    }

    public int hv() {
        return this.vy;
    }

    public int hww() {
        return this.nod;
    }

    public int ok() {
        return this.vgm;
    }

    public int sd() {
        return this.f36346ok;
    }

    public int tq() {
        return this.f36347rs;
    }

    public int vgm() {
        return this.f36344hu;
    }

    public int vy() {
        return this.f36348sd;
    }

    public void hu(int i10) {
        this.f36345hv = i10;
    }

    public void hv(int i10) {
        this.vy = i10;
    }

    public void hww(int i10) {
        this.nod = i10;
    }

    public void ok(int i10) {
        this.vgm = i10;
    }

    public void sd(int i10) {
        this.f36346ok = i10;
    }

    public void tq(int i10) {
        this.f36347rs = i10;
    }

    public void vgm(int i10) {
        this.f36344hu = i10;
    }

    public void vy(int i10) {
        this.f36348sd = i10;
    }

    public boolean hww(boolean z10) {
        if (z10) {
            int i10 = this.f36346ok;
            return i10 == 1 || i10 == 3;
        }
        int i11 = this.f36346ok;
        return i11 == 3 || i11 == 2;
    }

    public JSONObject hww(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("ceiling_time", this.f36348sd);
            jSONObject.put("ceiling_ratio", this.vy);
            jSONObject.put("expand_ratio", this.f36345hv);
            jSONObject.put("back_type", this.f36344hu);
            jSONObject.put("boc_return_type", this.vgm);
            jSONObject.put("pre_render_status", this.f36346ok);
            jSONObject.put("pre_render_use_gecko", this.f36347rs);
            jSONObject.put("pre_render_add_type", this.nod);
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.omn.sd("InteractionParams", th2.getMessage());
            return jSONObject;
        }
    }
}
