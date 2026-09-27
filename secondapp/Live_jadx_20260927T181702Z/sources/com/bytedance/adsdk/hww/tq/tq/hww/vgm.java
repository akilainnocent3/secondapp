package com.bytedance.adsdk.hww.tq.tq.hww;

import com.ironsource.C4235d4;
import fw.b;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class vgm implements com.bytedance.adsdk.hww.tq.tq.hww {
    private final Object hww;

    public vgm(String str) {
        if (str.equalsIgnoreCase("true")) {
            this.hww = Boolean.TRUE;
        } else if (str.equalsIgnoreCase("false")) {
            this.hww = Boolean.FALSE;
        } else {
            if (!str.equalsIgnoreCase(b.f85379f)) {
                throw new IllegalArgumentException();
            }
            this.hww = null;
        }
    }

    @Override // com.bytedance.adsdk.hww.tq.tq.hww
    public Object hww(Map<String, JSONObject> map) {
        return this.hww;
    }

    public String toString() {
        return "KeywordNode [keywordValue=" + this.hww + C4235d4.j.f61462e;
    }

    @Override // com.bytedance.adsdk.hww.tq.tq.hww
    public String tq() {
        Object obj = this.hww;
        return obj != null ? obj.toString() : "NULL";
    }

    @Override // com.bytedance.adsdk.hww.tq.tq.hww
    public com.bytedance.adsdk.hww.tq.vy.hv hww() {
        return com.bytedance.adsdk.hww.tq.vy.hu.CONSTANT;
    }
}
