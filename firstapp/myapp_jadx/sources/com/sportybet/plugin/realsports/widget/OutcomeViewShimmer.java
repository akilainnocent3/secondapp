package com.sportybet.plugin.realsports.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.sportybet.plugin.realsports.widget.OutcomeViewShimmer;
import defpackage.a9z;
import defpackage.hwr;
import defpackage.mpe0;
import defpackage.r0b;
import defpackage.vtk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/sportybet/plugin/realsports/widget/OutcomeViewShimmer;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Paint;", "a", "Lttr;", "getPaint1", "()Landroid/graphics/Paint;", "paint1", "b", "getPaint2", "paint2", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class OutcomeViewShimmer extends View {
    public static final /* synthetic */ int i = 0;
    public final mpe0 a;
    public final mpe0 b;
    public final float c;
    public ValueAnimator d;
    public float e;
    public final a f;

    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            OutcomeViewShimmer outcomeViewShimmer = OutcomeViewShimmer.this;
            outcomeViewShimmer.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            outcomeViewShimmer.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutcomeViewShimmer(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        context.getClass();
        this.a = hwr.b(new vtk(context, 1));
        this.b = hwr.b(new a9z(context, 0));
        this.c = r0b.a(context, 15);
        this.f = new a();
        setLayerType(2, null);
    }

    private final Paint getPaint1() {
        return (Paint) this.a.getValue();
    }

    private final Paint getPaint2() {
        return (Paint) this.b.getValue();
    }

    public final void a() {
        if (this.d != null) {
            return;
        }
        if (getWidth() <= 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.f);
            return;
        }
        float width = getWidth();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-width, width);
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setRepeatCount(1);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: z8z
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = OutcomeViewShimmer.i;
                float fFloatValue = ((Float) flk.a(valueAnimator)).floatValue();
                OutcomeViewShimmer outcomeViewShimmer = this.a;
                outcomeViewShimmer.e = fFloatValue;
                outcomeViewShimmer.invalidate();
            }
        });
        valueAnimatorOfFloat.start();
        this.d = valueAnimatorOfFloat;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f);
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        float height = getHeight();
        if (height <= 0.0f) {
            return;
        }
        float f = this.e;
        float f2 = this.c;
        canvas.drawLine(f, 0.0f, f - f2, height, getPaint1());
        float f3 = this.e + f2;
        canvas.drawLine(f3, 0.0f, f3 - f2, height, getPaint2());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OutcomeViewShimmer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OutcomeViewShimmer(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ OutcomeViewShimmer(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }
}
