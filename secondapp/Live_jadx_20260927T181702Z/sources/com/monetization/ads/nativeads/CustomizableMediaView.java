package com.monetization.ads.nativeads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.R;
import oy.l;
import oy.m;
import yads.hk;
import yads.iv2;
import yads.kj3;
import yads.lj3;
import yads.lv2;
import yads.x20;
import yads.yz2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class CustomizableMediaView extends FrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f71937f = R.layout.monetization_ads_internal_outstream_controls_default;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f71938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f71939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f71940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kj3 f71941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private x20 f71942e;

    @SuppressLint({"CustomViewStyleable"})
    public CustomizableMediaView(@l Context context, @m AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MonetizationAdsInternalMediaView);
            this.f71938a = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MonetizationAdsInternalMediaView_monetization_internal_video_controls_layout, f71937f);
            this.f71941d = lj3.a(typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f71938a = f71937f;
            this.f71941d = null;
        }
        addOnAttachStateChangeListener(new hk(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: qn.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                CustomizableMediaView.a(this.f122546b);
            }
        }));
    }

    public final void a(int i10) {
        this.f71938a = i10;
    }

    public final int getHeightMeasureSpec() {
        return this.f71940c;
    }

    @m
    public final x20 getOnSizeChangedListener$mobileads_externalRelease() {
        return this.f71942e;
    }

    public final int getVideoControlsLayoutId() {
        return this.f71938a;
    }

    @m
    public final kj3 getVideoScaleType() {
        return this.f71941d;
    }

    public final int getWidthMeasureSpec() {
        return this.f71939b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f71939b = i10;
        this.f71940c = i11;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        lv2 lv2Var;
        super.onSizeChanged(i10, i11, i12, i13);
        x20 x20Var = this.f71942e;
        if (x20Var == null || (lv2Var = (lv2) ((iv2) x20Var).f150843a.get()) == null) {
            return;
        }
        yz2 yz2Var = lv2Var.f152168f;
        if (i10 < yz2Var.f158539b || i11 < yz2Var.f158540c) {
            lv2Var.f152171i.setValue(lv2Var, lv2.f152165j[2], lv2Var.f152167e);
        }
    }

    public final void setOnSizeChangedListener$mobileads_externalRelease(@m x20 x20Var) {
        this.f71942e = x20Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CustomizableMediaView customizableMediaView) {
        x20 x20Var = customizableMediaView.f71942e;
        if (x20Var != null) {
            int width = customizableMediaView.getWidth();
            int height = customizableMediaView.getHeight();
            lv2 lv2Var = (lv2) ((iv2) x20Var).f150843a.get();
            if (lv2Var != null) {
                yz2 yz2Var = lv2Var.f152168f;
                if (width < yz2Var.f158539b || height < yz2Var.f158540c) {
                    lv2Var.f152171i.setValue(lv2Var, lv2.f152165j[2], lv2Var.f152167e);
                }
            }
        }
    }

    public CustomizableMediaView(@l Context context) {
        this(context, null);
    }

    public CustomizableMediaView(@l Context context, @m AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
