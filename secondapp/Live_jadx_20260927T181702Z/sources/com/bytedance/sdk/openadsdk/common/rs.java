package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.kub;
import com.bytedance.sdk.openadsdk.utils.wdz;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class rs extends LinearLayout {
    public rs(Context context) {
        super(context);
        hww();
    }

    private static ImageView hww(Context context, float f10, float f11, float f12, float f13) {
        com.bytedance.sdk.openadsdk.core.hu.vy vyVar = new com.bytedance.sdk.openadsdk.core.hu.vy(context);
        vyVar.setClickable(true);
        vyVar.setFocusable(true);
        vyVar.setPadding(wdz.tq(context, f12), wdz.tq(context, f13), wdz.tq(context, f12), wdz.tq(context, f13));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(wdz.tq(context, 40.0f), wdz.tq(context, 44.0f));
        if (f10 > 0.0f) {
            layoutParams.leftMargin = wdz.tq(context, f10);
        }
        if (f11 > 0.0f) {
            layoutParams.rightMargin = wdz.tq(context, f11);
        }
        vyVar.setLayoutParams(layoutParams);
        return vyVar;
    }

    private void hww() {
        Context context = getContext();
        setId(com.bytedance.sdk.openadsdk.utils.wgt.f37783wc);
        setLayoutParams(new ViewGroup.LayoutParams(-1, wdz.tq(context, 44.5f)));
        setBackgroundColor(-1);
        setClickable(true);
        setFocusable(true);
        setOrientation(1);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        addView(view, new LinearLayout.LayoutParams(-1, wdz.tq(context, 0.5f)));
        com.bytedance.sdk.openadsdk.core.hu.hv hvVar = new com.bytedance.sdk.openadsdk.core.hu.hv(context);
        hvVar.setOrientation(0);
        addView(hvVar, new LinearLayout.LayoutParams(-1, wdz.tq(context, 44.0f)));
        ImageView imageViewHww = hww(context, 16.0f, 0.0f, 14.75f, 12.5f);
        imageViewHww.setId(com.bytedance.sdk.openadsdk.utils.wgt.f37752jy);
        imageViewHww.setImageResource(kub.vy(context, "tt_ad_arrow_backward"));
        hvVar.addView(imageViewHww);
        View view2 = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        hvVar.addView(view2, layoutParams);
        ImageView imageViewHww2 = hww(context, 8.0f, 0.0f, 14.75f, 12.5f);
        imageViewHww2.setId(com.bytedance.sdk.openadsdk.utils.wgt.wqa);
        imageViewHww2.setImageResource(kub.vy(context, "tt_ad_arrow_forward"));
        hvVar.addView(imageViewHww2);
        View view3 = new View(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, 0);
        layoutParams2.weight = 1.0f;
        hvVar.addView(view3, layoutParams2);
        ImageView imageViewHww3 = hww(context, 8.0f, 0.0f, 10.0f, 12.0f);
        imageViewHww3.setId(com.bytedance.sdk.openadsdk.utils.wgt.f37733fc);
        imageViewHww3.setImageResource(kub.vy(context, "tt_ad_refresh"));
        hvVar.addView(imageViewHww3);
        View view4 = new View(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        hvVar.addView(view4, layoutParams3);
        ImageView imageViewHww4 = hww(context, 0.0f, 16.0f, 9.0f, 11.0f);
        imageViewHww4.setId(com.bytedance.sdk.openadsdk.utils.wgt.f37740hh);
        imageViewHww4.setImageResource(kub.vy(context, "tt_ad_link"));
        hvVar.addView(imageViewHww4);
    }
}
