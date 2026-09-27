package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import cs.k;
import f1.d;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import yads.c63;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class CallToActionView extends Button {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f71829a;

    @SuppressLint({"CustomViewStyleable"})
    @k
    public CallToActionView(@l Context context) {
        this(context, null, 0, 6, null);
    }

    private static Drawable a(Context context, int i10) {
        return d.getDrawable(context, i10);
    }

    @Override // android.widget.TextView
    public final CharSequence getText() {
        return this.f71829a;
    }

    @Override // android.widget.TextView
    public void setText(@l CharSequence charSequence, @l TextView.BufferType bufferType) {
        if (charSequence instanceof String) {
            this.f71829a = charSequence;
        }
        super.setText(this.f71829a, TextView.BufferType.SPANNABLE);
    }

    @SuppressLint({"CustomViewStyleable"})
    @k
    public CallToActionView(@l Context context, @m AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void a() {
        setSpannableFactory(Spannable.Factory.getInstance());
        setText(this.f71829a);
    }

    public /* synthetic */ CallToActionView(Context context, AttributeSet attributeSet, int i10, int i11, x xVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @SuppressLint({"CustomViewStyleable"})
    @k
    public CallToActionView(@l Context context, @m AttributeSet attributeSet, int i10) {
        int i11;
        super(context, attributeSet, i10);
        Drawable drawableA = null;
        int i12 = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MonetizationAdsInternalIconButton, i10, 0);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MonetizationAdsInternalIconButton_monetization_internal_icon, 0);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalIconButton_monetization_internal_icon_size, 0);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalIconButton_monetization_internal_icon_offset, 0);
            typedArrayObtainStyledAttributes.recycle();
            drawableA = resourceId != 0 ? a(context, resourceId) : null;
            i11 = dimensionPixelSize2;
            i12 = dimensionPixelSize;
        } else {
            i11 = 0;
        }
        setSpannableFactory(new c63(drawableA, i12, i11));
    }
}
