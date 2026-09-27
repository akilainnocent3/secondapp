package com.bytedance.sdk.openadsdk.core.vhb.hu;

import com.bytedance.adsdk.ugeno.core.jpb;
import com.bytedance.sdk.component.adexpress.tq.ed;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww extends ed {

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private boolean f36855hv;
    private JSONObject hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private float f36856sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private jpb f36857tq;
    private float vy;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.vhb.hu.hww$hww, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0364hww extends ed.hww {

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        private boolean f36858hv;
        private JSONObject hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private float f36859sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private jpb f36860tq;
        private float vy;

        public C0364hww hu(boolean z10) {
            this.f36858hv = z10;
            return this;
        }

        public C0364hww tq(float f10) {
            this.vy = f10;
            return this;
        }

        public C0364hww hww(JSONObject jSONObject) {
            this.hww = jSONObject;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.tq.ed.hww
        /* JADX INFO: renamed from: tq, reason: merged with bridge method [inline-methods] */
        public hww hww() {
            return new hww(this);
        }

        public C0364hww hww(jpb jpbVar) {
            this.f36860tq = jpbVar;
            return this;
        }

        public C0364hww hww(float f10) {
            this.f36859sd = f10;
            return this;
        }
    }

    public hww(C0364hww c0364hww) {
        super(c0364hww);
        this.hww = c0364hww.hww;
        this.f36857tq = c0364hww.f36860tq;
        this.f36856sd = c0364hww.f36859sd;
        this.vy = c0364hww.vy;
        this.f36855hv = c0364hww.f36858hv;
    }

    public float blh() {
        return this.vy;
    }

    public jpb hwp() {
        return this.f36857tq;
    }

    public JSONObject oxu() {
        return this.hww;
    }

    public boolean yt() {
        return this.f36855hv;
    }

    public float za() {
        return this.f36856sd;
    }
}
