package com.bytedance.sdk.component.adexpress.hu;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class omn extends mrs {
    private TextView hww;

    public omn(@NonNull Context context, View view, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context, view, i10, i11, i12, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.hu.mrs
    public void hww(Context context, View view) {
        addView(view);
        this.hww = (TextView) findViewById(2097610747);
    }

    @Override // com.bytedance.sdk.component.adexpress.hu.mrs
    public void setShakeText(String str) {
        if (this.hww == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.hww.setText(str);
            return;
        }
        try {
            this.hww.setText(com.bytedance.sdk.component.utils.kub.tq(this.hww.getContext(), "tt_splash_default_click_shake"));
        } catch (Exception e10) {
            e10.getMessage();
        }
    }
}
