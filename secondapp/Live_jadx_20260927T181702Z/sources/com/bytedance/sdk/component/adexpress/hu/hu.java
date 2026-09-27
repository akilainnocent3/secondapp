package com.bytedance.sdk.component.adexpress.hu;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu extends kv {
    private omn hww;

    public hu(Context context, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context);
        hww(context, i10, i11, i12, jSONObject);
    }

    private void hww(Context context, int i10, int i11, int i12, JSONObject jSONObject) {
        omn omnVar = new omn(context, com.bytedance.sdk.component.adexpress.sd.hww.sd(context), i10, i11, i12, jSONObject);
        this.hww = omnVar;
        addView(omnVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.hww.setLayoutParams(layoutParams);
    }

    public omn getShakeView() {
        return this.hww;
    }

    public void setShakeText(String str) {
        if (this.hww == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.hww.setShakeText("");
        } else {
            this.hww.setShakeText(str);
        }
    }
}
