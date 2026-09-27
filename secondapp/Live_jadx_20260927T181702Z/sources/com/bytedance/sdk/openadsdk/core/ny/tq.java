package com.bytedance.sdk.openadsdk.core.ny;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq extends sd {
    private long nod;
    private long vhb;

    public tq(int i10, int i11, long j10, long j11, com.bytedance.sdk.openadsdk.core.ny.sd.hww.EnumC0352hww enumC0352hww, com.bytedance.sdk.openadsdk.core.ny.sd.hww.tq tqVar, String str, List<com.bytedance.sdk.openadsdk.core.ny.tq.sd> list, List<com.bytedance.sdk.openadsdk.core.ny.tq.sd> list2, String str2) {
        super(i10, i11, enumC0352hww, tqVar, str, list, list2, str2);
        this.nod = j10;
        this.vhb = j11;
        this.f36544rs = "icon_click";
    }

    @Override // com.bytedance.sdk.openadsdk.core.ny.sd
    public JSONObject hww() throws JSONException {
        JSONObject jSONObjectHww = super.hww();
        if (jSONObjectHww != null) {
            jSONObjectHww.put("offset", this.nod);
            jSONObjectHww.put("duration", this.vhb);
        }
        return jSONObjectHww;
    }

    public static tq hww(JSONObject jSONObject) {
        sd sdVarTq = sd.tq(jSONObject);
        if (sdVarTq == null) {
            return null;
        }
        return new tq(sdVarTq.hww, sdVarTq.f36546tq, jSONObject.optLong("offset", -1L), jSONObject.optLong("duration", -1L), sdVarTq.f36545sd, sdVarTq.vy, sdVarTq.f36541hv, sdVarTq.f36540hu, sdVarTq.vgm, sdVarTq.f36543ok);
    }
}
