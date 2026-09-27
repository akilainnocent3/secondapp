package com.bytedance.sdk.openadsdk.weu;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.kub;
import com.bytedance.sdk.openadsdk.utils.wdz;
import com.bytedance.sdk.openadsdk.utils.wgt;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class weu extends com.bytedance.sdk.openadsdk.core.hu.vgm {
    public weu(Context context) {
        this(context, null);
    }

    private void hww(Context context) {
        setId(wgt.f37739hg);
        setBackgroundColor(Color.parseColor("#00000000"));
        setGravity(16);
        setVisibility(8);
        com.bytedance.sdk.openadsdk.core.hu.ok okVar = new com.bytedance.sdk.openadsdk.core.hu.ok(context);
        int i10 = wgt.awx;
        okVar.setId(i10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        okVar.setLayoutParams(layoutParams);
        okVar.setIncludeFontPadding(false);
        okVar.setText(kub.hww(context, "tt_video_without_wifi_tips"));
        okVar.setTextColor(Color.parseColor("#cacaca"));
        okVar.setTextSize(2, 14.0f);
        addView(okVar);
        com.bytedance.sdk.openadsdk.core.hu.vgm vgmVar = new com.bytedance.sdk.openadsdk.core.hu.vgm(context);
        vgmVar.setId(wgt.f37780uy);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, i10);
        layoutParams2.addRule(13);
        vgmVar.setLayoutParams(layoutParams2);
        addView(vgmVar);
        com.bytedance.sdk.openadsdk.core.hu.vy vyVar = new com.bytedance.sdk.openadsdk.core.hu.vy(context);
        vyVar.setId(wgt.tph);
        int iTq = wdz.tq(context, 44.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iTq, iTq);
        layoutParams3.addRule(15);
        vyVar.setLayoutParams(layoutParams3);
        vyVar.setImageDrawable(kub.sd(context, "tt_new_play_video"));
        vyVar.setScaleType(ImageView.ScaleType.FIT_XY);
        vgmVar.addView(vyVar);
    }

    public weu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public weu(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        hww(context);
    }
}
