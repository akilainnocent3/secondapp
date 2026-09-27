package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.kub;
import com.bytedance.sdk.openadsdk.utils.wdz;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vhb extends RelativeLayout {
    public vhb(Context context) {
        super(context);
        hww();
    }

    private void hww() {
        Context context = getContext();
        int iTq = wdz.tq(context, 12.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, wdz.tq(context, 44.0f)));
        setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.hu.vy vyVar = new com.bytedance.sdk.openadsdk.core.hu.vy(context);
        vyVar.setId(520093720);
        vyVar.setClickable(true);
        vyVar.setFocusable(true);
        vyVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.vhb.hww(context, "tt_leftbackicon_selector"));
        int iTq2 = wdz.tq(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iTq2, iTq2);
        layoutParams.leftMargin = iTq;
        layoutParams.addRule(15);
        addView(vyVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.hu.vy vyVar2 = new com.bytedance.sdk.openadsdk.core.hu.vy(context);
        vyVar2.setId(520093716);
        vyVar2.setClickable(true);
        vyVar2.setFocusable(true);
        vyVar2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.vhb.hww(context, "tt_titlebar_close_seletor"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iTq2, iTq2);
        layoutParams2.leftMargin = iTq;
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, 520093720);
        addView(vyVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.hu.vy vyVar3 = new com.bytedance.sdk.openadsdk.core.hu.vy(context);
        int i10 = com.bytedance.sdk.openadsdk.utils.wgt.kft;
        vyVar3.setId(i10);
        vyVar3.setImageDrawable(kub.sd(context, "tt_ad_feedback_new"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iTq2, iTq2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = iTq;
        addView(vyVar3, layoutParams3);
        com.bytedance.sdk.openadsdk.core.hu.ok okVar = new com.bytedance.sdk.openadsdk.core.hu.ok(context);
        okVar.setId(com.bytedance.sdk.openadsdk.utils.wgt.f37719as);
        okVar.setSingleLine(true);
        okVar.setEllipsize(TextUtils.TruncateAt.END);
        okVar.setGravity(17);
        okVar.setTextColor(-16777216);
        okVar.setTextSize(1, 16.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(wdz.tq(context, 240.0f), -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, 520093716);
        layoutParams4.addRule(0, i10);
        int iTq3 = wdz.tq(context, 25.0f);
        layoutParams4.rightMargin = iTq3;
        layoutParams4.leftMargin = iTq3;
        addView(okVar, layoutParams4);
    }
}
