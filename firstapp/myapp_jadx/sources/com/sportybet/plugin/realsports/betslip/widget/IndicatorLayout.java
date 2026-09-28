package com.sportybet.plugin.realsports.betslip.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.rk30;
import defpackage.vc1;
import defpackage.zi50;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/sportybet/plugin/realsports/betslip/widget/IndicatorLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "offset", "", "setTriangleOffset", "(I)V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class IndicatorLayout extends FrameLayout {
    public final Point a;
    public int b;
    public final Paint c;
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorLayout(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        context.getClass();
        this.a = new Point();
        this.c = new Paint();
        try {
            zi50.a aVar = zi50.b;
            if (attributeSet != null && (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.r, i, 0)) != null) {
                TypedArray typedArray = typedArrayObtainStyledAttributes;
                try {
                    this.d = typedArray.getBoolean(0, false);
                    Unit unit = Unit.a;
                    vc1.a(typedArray, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        vc1.a(typedArray, th);
                        throw th2;
                    }
                }
            }
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
        int color = getContext().getColor(R.color.background_type1_quaternary);
        int color2 = getContext().getColor(R.color.bet_slip_shadowColor);
        int iApplyDimension = (int) TypedValue.applyDimension(0, 12.0f, getResources().getDisplayMetrics());
        Paint paint = this.c;
        paint.setAntiAlias(true);
        paint.setColor(color);
        paint.setShadowLayer(iApplyDimension, 0.0f, -3.0f, color2);
        setWillNotDraw(false);
        setLayerType(1, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int paddingTop;
        canvas.getClass();
        super.onDraw(canvas);
        Point point = this.a;
        if (point.x <= 0 || point.y <= 0 || (paddingTop = getPaddingTop()) == 0) {
            return;
        }
        canvas.drawColor(0);
        Path path = new Path();
        path.addRect(new RectF(0.0f, point.y, canvas.getWidth(), point.y + 3.0f), Path.Direction.CCW);
        if (this.d) {
            int i = paddingTop / 2;
            path.moveTo(point.x + i, point.y);
            path.lineTo(point.x, point.y - i);
            path.lineTo(point.x - i, point.y);
            path.close();
        }
        canvas.drawPath(path, this.c);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Point point = this.a;
        point.x = i / 2;
        point.y = getPaddingTop() - 3;
        int i5 = this.b;
        if (i5 != 0) {
            point.x = i5;
        }
    }

    public final void setTriangleOffset(int offset) {
        this.b = offset;
        this.a.x = offset;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndicatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndicatorLayout(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ IndicatorLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
