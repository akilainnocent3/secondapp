package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.utils.wdz;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ny {

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.hu.ok f35565hv;
    protected View hww = hv();

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.widget.ok f35566sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    protected Context f35567tq;
    private com.bytedance.sdk.openadsdk.core.widget.bs vy;

    public ny(Context context) {
        this.f35567tq = context;
    }

    private View hv() {
        com.bytedance.sdk.openadsdk.core.hu.hv hvVar = new com.bytedance.sdk.openadsdk.core.hu.hv(this.f35567tq);
        hvVar.setGravity(1);
        hvVar.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.widget.bs bsVar = new com.bytedance.sdk.openadsdk.core.widget.bs(this.f35567tq);
        this.vy = bsVar;
        bsVar.setId(520093745);
        int iTq = wdz.tq(this.f35567tq, 64.0f);
        hvVar.addView(this.vy, new LinearLayout.LayoutParams(iTq, iTq));
        com.bytedance.sdk.openadsdk.core.hu.ok okVar = new com.bytedance.sdk.openadsdk.core.hu.ok(this.f35567tq);
        this.f35565hv = okVar;
        okVar.setId(520093746);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(wdz.tq(this.f35567tq, 219.0f), -2);
        layoutParams.topMargin = wdz.tq(this.f35567tq, 16.0f);
        this.f35565hv.setLayoutParams(layoutParams);
        this.f35565hv.setEllipsize(TextUtils.TruncateAt.END);
        this.f35565hv.setGravity(17);
        this.f35565hv.setMaxWidth(wdz.tq(this.f35567tq, 150.0f));
        this.f35565hv.setMaxLines(2);
        this.f35565hv.setTextColor(-1);
        this.f35565hv.setTextSize(1, 16.0f);
        hvVar.addView(this.f35565hv);
        this.f35566sd = new com.bytedance.sdk.openadsdk.core.widget.ok(this.f35567tq);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(wdz.tq(this.f35567tq, 219.0f), wdz.tq(this.f35567tq, 6.0f));
        layoutParams2.topMargin = wdz.tq(this.f35567tq, 32.0f);
        hvVar.addView(this.f35566sd, layoutParams2);
        return hvVar;
    }

    public View hww() {
        return this.hww;
    }

    public com.bytedance.sdk.openadsdk.core.hu.ok sd() {
        return this.f35565hv;
    }

    public com.bytedance.sdk.openadsdk.core.widget.bs tq() {
        return this.vy;
    }

    public void vy() {
        this.hww = null;
        this.f35567tq = null;
    }

    public void hww(int i10) {
        this.f35566sd.setProgress(i10);
    }
}
