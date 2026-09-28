package com.sportygames.commons.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/sportygames/commons/utils/LineAnimationView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "strokeWidthPx", "", "setStrokeWidthPx", "(F)V", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LineAnimationView extends View {
    public final Paint a;
    public float b;
    public float c;
    public float d;
    public float e;
    public a f;

    public final class a extends Animation {
        public a() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            transformation.getClass();
            super.applyTransformation(f, transformation);
            LineAnimationView lineAnimationView = LineAnimationView.this;
            lineAnimationView.c = lineAnimationView.getHeight() / 2.0f;
            lineAnimationView.d = lineAnimationView.getWidth() * f;
            lineAnimationView.e = lineAnimationView.getHeight() / 2.0f;
            lineAnimationView.invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.a = new Paint();
        this.b = 5.0f;
        a(R.color.sh_bet_text_enable_color);
    }

    public final void a(int i) {
        int color = getContext().getColor(i);
        Paint paint = this.a;
        paint.setColor(color);
        paint.setStrokeWidth(this.b);
        a aVar = new a();
        this.f = aVar;
        aVar.setDuration(500L);
        a aVar2 = this.f;
        if (aVar2 == null) {
            Intrinsics.n("animation");
            throw null;
        }
        aVar2.setRepeatCount(0);
        a aVar3 = this.f;
        if (aVar3 == null) {
            Intrinsics.n("animation");
            throw null;
        }
        aVar3.setInterpolator(new LinearInterpolator());
        a aVar4 = this.f;
        if (aVar4 != null) {
            startAnimation(aVar4);
        } else {
            Intrinsics.n("animation");
            throw null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        canvas.drawLine(0.0f, this.c, this.d, this.e, this.a);
    }

    public final void setStrokeWidthPx(float strokeWidthPx) {
        if (strokeWidthPx < 1.0f) {
            strokeWidthPx = 1.0f;
        }
        this.b = strokeWidthPx;
        this.a.setStrokeWidth(strokeWidthPx);
        invalidate();
    }
}
