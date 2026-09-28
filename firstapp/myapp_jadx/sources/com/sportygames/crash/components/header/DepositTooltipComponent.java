package com.sportygames.crash.components.header;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.sportybet.android.gp.tz.R;
import defpackage.g70;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/sportygames/crash/components/header/DepositTooltipComponent;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "text", "", "setText", "(Ljava/lang/String;)V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DepositTooltipComponent extends View {
    public final Paint A;
    public final RectF B;
    public final Path C;
    public String a;
    public final int b;
    public final int c;
    public final float d;
    public final float e;
    public final float f;
    public final float i;
    public final float v;
    public final float w;
    public final float y;
    public final TextPaint z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositTooltipComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        String string = context.getString(R.string.default_tooltip_text);
        string.getClass();
        this.a = string;
        this.b = context.getColor(R.color.tooltipMessageTopColor);
        this.c = context.getColor(R.color.tooltipMessageBottomColor);
        int color = context.getColor(R.color.tooltipMessageTextColor);
        this.d = context.getResources().getDimension(R.dimen._3sdp);
        this.e = context.getResources().getDimension(R.dimen._8sdp);
        this.f = context.getResources().getDimension(R.dimen._5sdp);
        this.i = context.getResources().getDimension(R.dimen._24sdp);
        this.v = context.getResources().getDimension(R.dimen._12sdp);
        this.w = context.getResources().getDimension(R.dimen._10ssp);
        float dimension = context.getResources().getDimension(R.dimen._20ssp);
        this.y = dimension;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(color);
        textPaint.setTextSize(dimension);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 3));
        this.z = textPaint;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.A = paint;
        this.B = new RectF();
        this.C = new Path();
    }

    public final void a(int i) {
        float f;
        float fMax = Math.max(0.0f, i - (this.i * 2.0f));
        if (fMax <= 0.0f) {
            return;
        }
        float f2 = this.w;
        float f3 = this.y;
        while (true) {
            float f4 = f2;
            while (true) {
                float f5 = f3 - f2;
                TextPaint textPaint = this.z;
                if (f5 <= 0.5f) {
                    textPaint.setTextSize(f4);
                    return;
                }
                f = (f2 + f3) / 2.0f;
                textPaint.setTextSize(f);
                if (textPaint.measureText(this.a) <= fMax) {
                    break;
                } else {
                    f3 = f;
                }
            }
            f2 = f;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.B;
        float f = this.f;
        rectF.set(0.0f, f, width, height);
        Path path = this.C;
        path.reset();
        float f2 = this.d;
        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        float width2 = getWidth() * 0.185f;
        float f3 = this.e / 2.0f;
        path.moveTo(width2 - f3, f);
        path.lineTo(width2, 0.0f);
        path.lineTo(width2 + f3, f);
        path.close();
        canvas.drawPath(path, this.A);
        float width3 = getWidth();
        float f4 = this.i;
        String str = this.a;
        TextPaint textPaint = this.z;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        canvas.drawText(str, (((width3 - (f4 * 2.0f)) - textPaint.measureText(str)) / 2.0f) + f4, g70.a(getHeight(), f, 2.0f, f) - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), textPaint);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        String str = this.a;
        TextPaint textPaint = this.z;
        int iCeil = (int) Math.ceil((this.i * 2.0f) + ((int) Math.ceil(textPaint.measureText(str))));
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(iCeil, size);
        } else if (mode != 1073741824) {
            size = iCeil;
        }
        a(size);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        setMeasuredDimension(size, View.resolveSize((int) Math.ceil((this.v * 2.0f) + (fontMetrics.descent - fontMetrics.ascent) + this.f), i2));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.A.setShader(new LinearGradient(0.0f, this.f, 0.0f, i2, this.b, this.c, Shader.TileMode.CLAMP));
        a(i);
    }

    public final void setText(String text) {
        text.getClass();
        if (Intrinsics.g(this.a, text)) {
            return;
        }
        this.a = text;
        requestLayout();
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DepositTooltipComponent(Context context) {
        this(context, null);
        context.getClass();
    }
}
