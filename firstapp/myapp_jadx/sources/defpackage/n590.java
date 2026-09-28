package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class n590 extends Drawable {
    public final a a = new a();
    public final Paint b;
    public final Rect c;
    public final Matrix d;
    public ValueAnimator e;
    public com.facebook.shimmer.a f;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            n590.this.invalidateSelf();
        }
    }

    public n590() {
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Rect();
        this.d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a() {
        com.facebook.shimmer.a aVar;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator == null || valueAnimator.isStarted() || (aVar = this.f) == null || !aVar.o || getCallback() == null) {
            return;
        }
        this.e.start();
    }

    public final void b() {
        com.facebook.shimmer.a aVar;
        Shader radialGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (aVar = this.f) == null) {
            return;
        }
        int iRound = aVar.g;
        if (iRound <= 0) {
            iRound = Math.round(aVar.i * iWidth);
        }
        com.facebook.shimmer.a aVar2 = this.f;
        int iRound2 = aVar2.h;
        if (iRound2 <= 0) {
            iRound2 = Math.round(aVar2.j * iHeight);
        }
        com.facebook.shimmer.a aVar3 = this.f;
        boolean z = true;
        if (aVar3.f != 1) {
            int i = aVar3.c;
            if (i != 1 && i != 3) {
                z = false;
            }
            if (z) {
                iRound = 0;
            }
            if (!z) {
                iRound2 = 0;
            }
            com.facebook.shimmer.a aVar4 = this.f;
            radialGradient = new LinearGradient(0.0f, 0.0f, iRound, iRound2, aVar4.b, aVar4.a, Shader.TileMode.CLAMP);
        } else {
            float fMax = (float) (((double) Math.max(iRound, iRound2)) / Math.sqrt(2.0d));
            com.facebook.shimmer.a aVar5 = this.f;
            radialGradient = new RadialGradient(iRound / 2.0f, iRound2 / 2.0f, fMax, aVar5.b, aVar5.a, Shader.TileMode.CLAMP);
        }
        this.b.setShader(radialGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fA;
        float fA2;
        if (this.f != null) {
            Paint paint = this.b;
            if (paint.getShader() == null) {
                return;
            }
            float fTan = (float) Math.tan(Math.toRadians(this.f.m));
            Rect rect = this.c;
            float fWidth = (rect.width() * fTan) + rect.height();
            float fHeight = (fTan * rect.height()) + rect.width();
            ValueAnimator valueAnimator = this.e;
            float f = 0.0f;
            float fFloatValue = valueAnimator != null ? ((Float) valueAnimator.getAnimatedValue()).floatValue() : 0.0f;
            int i = this.f.c;
            if (i != 1) {
                if (i == 2) {
                    fA2 = hxa.a(-fHeight, fHeight, fFloatValue, fHeight);
                } else if (i != 3) {
                    float f2 = -fHeight;
                    fA2 = hxa.a(fHeight, f2, fFloatValue, f2);
                } else {
                    fA = hxa.a(-fWidth, fWidth, fFloatValue, fWidth);
                }
                f = fA2;
                fA = 0.0f;
            } else {
                float f3 = -fWidth;
                fA = hxa.a(fWidth, f3, fFloatValue, f3);
            }
            Matrix matrix = this.d;
            matrix.reset();
            matrix.setRotate(this.f.m, rect.width() / 2.0f, rect.height() / 2.0f);
            matrix.postTranslate(f, fA);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        com.facebook.shimmer.a aVar = this.f;
        if (aVar != null) {
            return (aVar.n || aVar.p) ? -3 : -1;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.set(rect);
        b();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
