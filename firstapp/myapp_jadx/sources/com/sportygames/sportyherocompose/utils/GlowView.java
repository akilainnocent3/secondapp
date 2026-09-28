package com.sportygames.sportyherocompose.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0010J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/sportygames/sportyherocompose/utils/GlowView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "color", "", "setGlowColor", "(I)V", "", "blurDp", "setGlowBlurDp", "(F)V", "insetDp", "setContentInsetDp", "radiusDp", "setCornerRadiusDp", "", "visible", "setGlowVisible", "(Z)V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GlowView extends View {
    public int a;
    public float b;
    public float c;
    public float d;
    public final Paint e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.a = Color.parseColor("#CCFF1B1B");
        this.b = a(16.0f);
        this.c = a(16.0f);
        this.d = a(8.0f);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.argb(1, 0, 0, 0));
        this.e = paint;
        setLayerType(1, null);
        setWillNotDraw(false);
        setClickable(false);
        setFocusable(false);
        setImportantForAccessibility(2);
    }

    public final float a(float f) {
        return TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        float f = this.c;
        float width = getWidth() - f;
        float height = getHeight() - f;
        if (width <= f || height <= f) {
            return;
        }
        int iArgb = Color.argb(1, 0, 0, 0);
        Paint paint = this.e;
        paint.setColor(iArgb);
        paint.setShadowLayer(Math.max(1.0f, this.b), 0.0f, 0.0f, this.a);
        float f2 = this.d;
        canvas.drawRoundRect(f, f, width, height, f2, f2, paint);
    }

    public final void setContentInsetDp(float insetDp) {
        this.c = a(insetDp);
        invalidate();
    }

    public final void setCornerRadiusDp(float radiusDp) {
        this.d = a(radiusDp);
        invalidate();
    }

    public final void setGlowBlurDp(float blurDp) {
        this.b = a(blurDp);
        invalidate();
    }

    public final void setGlowColor(int color) {
        this.a = color;
        invalidate();
    }

    public final void setGlowVisible(boolean visible) {
        setVisibility(visible ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GlowView(Context context) {
        this(context, null);
        context.getClass();
    }
}
