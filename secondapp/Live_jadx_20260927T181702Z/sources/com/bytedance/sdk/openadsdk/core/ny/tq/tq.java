package com.bytedance.sdk.openadsdk.core.ny.tq;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq extends sd implements Comparable<tq> {
    private final float hww;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {
        private final String hww;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private final float f36592tq;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private sd.EnumC0354sd f36591sd = sd.EnumC0354sd.TRACKING_URL;
        private boolean vy = false;

        public hww(String str, float f10) {
            this.hww = str;
            this.f36592tq = f10;
        }

        public tq hww() {
            return new tq(this.f36592tq, this.hww, this.f36591sd, Boolean.valueOf(this.vy));
        }
    }

    public boolean hww(float f10) {
        return this.hww <= f10 && !hv();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ny.tq.sd
    public void l_() {
        super.l_();
    }

    public String toString() {
        return super.toString();
    }

    public JSONObject tq() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", sd());
        jSONObject.put("trackingFraction", this.hww);
        return jSONObject;
    }

    private tq(float f10, String str, sd.EnumC0354sd enumC0354sd, Boolean bool) {
        super(str, enumC0354sd, bool);
        this.hww = f10;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
    public int compareTo(tq tqVar) {
        if (tqVar == null) {
            return 1;
        }
        float f10 = this.hww;
        float f11 = tqVar.hww;
        if (f10 > f11) {
            return 1;
        }
        return f10 < f11 ? -1 : 0;
    }
}
