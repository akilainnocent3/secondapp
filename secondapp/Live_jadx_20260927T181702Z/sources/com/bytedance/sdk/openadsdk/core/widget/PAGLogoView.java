package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.model.kub;
import com.bytedance.sdk.openadsdk.utils.wdz;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class PAGLogoView extends LinearLayout {
    protected int containerHeight;
    private com.bytedance.sdk.openadsdk.core.hu.vy mAdLogo;
    private com.bytedance.sdk.openadsdk.core.hu.ok mAdText;

    public PAGLogoView(Context context) {
        this(context, null);
    }

    public static PAGLogoView createPAGLogoViewByMaterial(Context context, kub kubVar) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.initData(kubVar);
        return pAGLogoView;
    }

    private void initView(Context context) {
        int iTq = wdz.tq(context, 2.0f);
        this.containerHeight = wdz.tq(getContext(), 12.0f);
        this.mAdLogo = new com.bytedance.sdk.openadsdk.core.hu.vy(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(wdz.tq(context, 14.0f), wdz.tq(context, 6.0f));
        layoutParams.leftMargin = iTq;
        this.mAdLogo.setLayoutParams(layoutParams);
        this.mAdLogo.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.mAdText = new com.bytedance.sdk.openadsdk.core.hu.ok(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, this.containerHeight);
        layoutParams2.leftMargin = iTq;
        layoutParams2.rightMargin = iTq;
        this.mAdText.setLayoutParams(layoutParams2);
        this.mAdText.setTextSize(1, 8.0f);
        this.mAdText.setGravity(17);
        this.mAdText.setTextColor(Color.parseColor("#BFFFFFFF"));
        addView(this.mAdLogo);
        addView(this.mAdText);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#26000000"));
        gradientDrawable.setCornerRadius(iTq);
        setBackground(gradientDrawable);
        setGravity(16);
    }

    public void initData(kub kubVar) {
        if (kubVar == null) {
            return;
        }
        initData(kubVar.zf());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = this.containerHeight;
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.hu.rs.hww(this, layoutParams));
    }

    public PAGLogoView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void initData(com.bytedance.sdk.openadsdk.core.model.tq tqVar) {
        if (tqVar == null) {
            return;
        }
        if (tqVar.hv()) {
            this.mAdLogo.setImageDrawable(com.bytedance.sdk.component.utils.kub.sd(com.bytedance.sdk.openadsdk.core.bs.hww(), "tt_ad_logo"));
        } else {
            String strHww = tqVar.hww();
            if (TextUtils.isEmpty(strHww)) {
                this.mAdLogo.setVisibility(8);
            } else {
                if (strHww.contains("logo")) {
                    this.mAdLogo.setImageDrawable(com.bytedance.sdk.component.utils.kub.sd(com.bytedance.sdk.openadsdk.core.bs.hww(), "tt_ad_logo"));
                } else {
                    com.bytedance.sdk.openadsdk.nod.vy.hww(strHww).sd(1).hww(this.mAdLogo);
                }
                this.mAdLogo.setVisibility(0);
            }
        }
        String strTq = tqVar.tq();
        if (tqVar.hv()) {
            this.mAdText.setText(com.bytedance.sdk.component.utils.kub.hww(com.bytedance.sdk.openadsdk.core.bs.hww(), "tt_logo_en"));
        } else if (TextUtils.isEmpty(strTq)) {
            this.mAdText.setVisibility(8);
        } else {
            this.mAdText.setText(strTq);
            this.mAdText.setVisibility(0);
        }
    }

    public PAGLogoView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        initView(context);
    }

    @t0(api = 21)
    public PAGLogoView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        initView(context);
    }
}
