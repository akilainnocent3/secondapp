package com.bytedance.sdk.openadsdk.vy.hww;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class nod implements com.bytedance.sdk.openadsdk.wgt.tq {
    private final com.bytedance.sdk.component.hu.hww.hu.vy hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final boolean f37899tq;

    public nod(boolean z10, com.bytedance.sdk.component.hu.hww.hu.vy vyVar) {
        this.hww = vyVar;
        this.f37899tq = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.wgt.tq
    @Nullable
    public com.bytedance.sdk.openadsdk.wgt.hww.sd hww() throws Exception {
        int i10;
        if (this.hww == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.f37899tq);
        jSONObject.put("url", this.hww.tq());
        int iVy = this.hww.vy();
        if (iVy <= 0) {
            iVy = 0;
        }
        jSONObject.put("retry_times", iVy);
        jSONObject.put("ad_id", this.hww.hu());
        jSONObject.put("track_type", this.hww.hv());
        if (!this.f37899tq) {
            i10 = 4;
        } else if (this.hww.nod()) {
            i10 = 3;
        } else {
            i10 = this.hww.vy() <= 0 ? 1 : 2;
        }
        jSONObject.put("upload_scene", i10);
        String strVgm = this.hww.vgm();
        if (!TextUtils.isEmpty(strVgm)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : strVgm.split(",")) {
                jSONArray.put(str);
            }
            jSONObject.put("error_code", jSONArray);
        }
        String strRs = this.hww.rs();
        if (!TextUtils.isEmpty(strRs)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : strRs.split(",")) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        return com.bytedance.sdk.openadsdk.wgt.hww.vy.tq().hww("track_link_result").tq(jSONObject.toString());
    }
}
