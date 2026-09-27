package com.bytedance.sdk.openadsdk.weu;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.kub;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.bs;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class nod extends com.bytedance.sdk.openadsdk.core.hu.sd {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.hu.ok f38057hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.hu.ok f38058hv;
    protected com.bytedance.sdk.openadsdk.core.hu.sd hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    protected bs f38059sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.hu.vy f38060tq;
    protected com.bytedance.sdk.openadsdk.core.hu.ok vy;

    public nod(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        hww(context);
    }

    public FrameLayout getTtAdContainer() {
        return this.hww;
    }

    public TextView getTtFullAdAppName() {
        return this.vy;
    }

    public TextView getTtFullAdDesc() {
        return this.f38058hv;
    }

    public TextView getTtFullAdDownload() {
        return this.f38057hu;
    }

    public bs getTtFullAdIcon() {
        return this.f38059sd;
    }

    public ImageView getTtFullImg() {
        return this.f38060tq;
    }

    public com.bytedance.sdk.openadsdk.core.hu.vy hu(Context context) {
        com.bytedance.sdk.openadsdk.core.hu.vy vyVar = new com.bytedance.sdk.openadsdk.core.hu.vy(context);
        vyVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return vyVar;
    }

    public com.bytedance.sdk.openadsdk.core.hu.sd hv(Context context) {
        return new com.bytedance.sdk.openadsdk.core.hu.sd(context);
    }

    public abstract void hww(Context context);

    public PAGLogoView ok(Context context) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.setId(520093739);
        return pAGLogoView;
    }

    public com.bytedance.sdk.openadsdk.core.hu.ok sd(Context context) {
        com.bytedance.sdk.openadsdk.core.hu.ok okVar = new com.bytedance.sdk.openadsdk.core.hu.ok(context);
        okVar.setEllipsize(TextUtils.TruncateAt.END);
        okVar.setMaxLines(1);
        okVar.setSingleLine();
        okVar.setTextColor(Color.parseColor("#FF999999"));
        okVar.setTextSize(2, 12.0f);
        return okVar;
    }

    public com.bytedance.sdk.openadsdk.core.hu.ok tq(Context context) {
        com.bytedance.sdk.openadsdk.core.hu.ok okVar = new com.bytedance.sdk.openadsdk.core.hu.ok(context);
        okVar.setEllipsize(TextUtils.TruncateAt.END);
        okVar.setMaxLines(1);
        okVar.setTextColor(Color.parseColor("#FF999999"));
        okVar.setTextSize(2, 16.0f);
        return okVar;
    }

    public bs vgm(Context context) {
        bs bsVar = new bs(context);
        bsVar.setScaleType(ImageView.ScaleType.FIT_XY);
        bsVar.setBackgroundColor(0);
        return bsVar;
    }

    public com.bytedance.sdk.openadsdk.core.hu.ok vy(Context context) {
        com.bytedance.sdk.openadsdk.core.hu.ok okVar = new com.bytedance.sdk.openadsdk.core.hu.ok(context);
        okVar.setBackground(com.bytedance.sdk.openadsdk.utils.vhb.hww(context, "tt_backup_btn_1"));
        okVar.setGravity(17);
        okVar.setText(kub.hww(context, "tt_video_download_apk"));
        okVar.setTextColor(-1);
        okVar.setTextSize(2, 14.0f);
        return okVar;
    }
}
