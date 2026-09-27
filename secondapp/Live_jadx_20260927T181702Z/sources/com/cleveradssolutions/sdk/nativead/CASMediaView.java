package com.cleveradssolutions.sdk.nativead;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@s1({"SMAP\nCASMediaView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CASMediaView.kt\ncom/cleveradssolutions/sdk/nativead/CASMediaView\n+ 2 NativeAdExtension.kt\ncom/cleveradssolutions/internal/content/nativead/NativeAdExtensionKt\n*L\n1#1,65:1\n269#2,57:66\n*S KotlinDebug\n*F\n+ 1 CASMediaView.kt\ncom/cleveradssolutions/sdk/nativead/CASMediaView\n*L\n60#1:66,57\n*E\n"})
public final class CASMediaView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView.ScaleType f44036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f44039e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CASMediaView(@l Context context) {
        this(context, null, 0, 0);
        m0.p(context, "context");
    }

    public final float getAspectRatio$com_cleveradssolutions_sdk_android_release() {
        return this.f44039e;
    }

    @l
    public final ImageView.ScaleType getImageScaleType() {
        return this.f44036b;
    }

    public final int getMaxHeight() {
        return this.f44038d;
    }

    public final int getMaxWidth() {
        return this.f44037c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = View.MeasureSpec.getMode(i10) != 1073741824;
        boolean z13 = View.MeasureSpec.getMode(i11) != 1073741824;
        if (!z12 && !z13) {
            super.onMeasure(i10, i11);
            return;
        }
        if (getChildCount() == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            return;
        }
        if (this.f44039e <= 0.0f) {
            super.onMeasure(i10, i11);
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (size == 0 || size2 == 0) {
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            if (size == 0) {
                size = displayMetrics.widthPixels;
            }
            if (size2 == 0) {
                size2 = displayMetrics.heightPixels;
            }
        }
        int iMin = Math.min(size, getMaxWidth());
        int iMin2 = Math.min(size2, getMaxHeight());
        int paddingLeft = (iMin - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (iMin2 - getPaddingTop()) - getPaddingBottom();
        if (!z12 || !z13) {
            z11 = z12;
        } else if (paddingLeft < paddingTop) {
            z13 = false;
            z11 = z12;
        }
        if (z11) {
            int paddingRight = getPaddingRight() + getPaddingLeft() + ((int) (getAspectRatio$com_cleveradssolutions_sdk_android_release() * paddingTop));
            if (paddingRight <= iMin) {
                iMin = paddingRight;
                z10 = z13;
            }
        } else {
            z10 = z13;
        }
        if (z10) {
            int paddingBottom = getPaddingBottom() + getPaddingTop() + ((int) (paddingLeft / getAspectRatio$com_cleveradssolutions_sdk_android_release()));
            if (paddingBottom > iMin2) {
                iMin = getPaddingRight() + getPaddingLeft() + ((int) (getAspectRatio$com_cleveradssolutions_sdk_android_release() * paddingTop));
            } else {
                iMin2 = paddingBottom;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824));
    }

    public final void setAspectRatio$com_cleveradssolutions_sdk_android_release(float f10) {
        this.f44039e = f10;
    }

    public final void setImageScaleType(@l ImageView.ScaleType scaleType) {
        m0.p(scaleType, "<set-?>");
        this.f44036b = scaleType;
    }

    public final void setMaxHeight(int i10) {
        this.f44038d = i10;
    }

    public final void setMaxWidth(int i10) {
        this.f44037c = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CASMediaView(@l Context context, @m AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        m0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CASMediaView(@l Context context, @m AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
        m0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CASMediaView(@l Context context, @m AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        m0.p(context, "context");
        this.f44036b = ImageView.ScaleType.FIT_CENTER;
        this.f44037c = Integer.MAX_VALUE;
        this.f44038d = Integer.MAX_VALUE;
        this.f44039e = 1.7777778f;
        com.cleveradssolutions.internal.content.nativead.m.b(this, context, attributeSet);
    }
}
