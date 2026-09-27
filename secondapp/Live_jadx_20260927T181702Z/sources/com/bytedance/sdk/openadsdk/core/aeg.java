package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.embedapplog.IDefaultEncrypt;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class aeg implements IDefaultEncrypt {
    private final PangleEncryptConstant.CryptDataScene hww;

    public aeg(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        this.hww = cryptDataScene;
    }

    @Override // com.bytedance.sdk.component.embedapplog.IDefaultEncrypt
    public JSONObject encrypt(JSONObject jSONObject, int i10) {
        grv.hww(1, this.hww, i10);
        return com.bytedance.sdk.component.utils.hww.hww(jSONObject);
    }
}
