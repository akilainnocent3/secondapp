package com.yandex.div.internal.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.yandex.div.internal.Assert;
import k.q0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class CircleDrawable extends Drawable {

    @l
    private final Paint mainPaint;

    @l
    private final Params params;

    @l
    private final RectF rect;

    @m
    private final Paint strokePaint;

    public CircleDrawable(@l Params params) {
        Paint paint;
        this.params = params;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(params.getColor());
        this.mainPaint = paint2;
        if (params.getStrokeColor() == null || params.getStrokeWidth() == null) {
            paint = null;
        } else {
            paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(params.getStrokeColor().intValue());
            paint.setStrokeWidth(params.getStrokeWidth().floatValue());
        }
        this.strokePaint = paint;
        float f10 = 2;
        RectF rectF = new RectF(0.0f, 0.0f, params.getRadius() * f10, params.getRadius() * f10);
        this.rect = rectF;
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@l Canvas canvas) {
        this.mainPaint.setColor(this.params.getColor());
        this.rect.set(getBounds());
        canvas.drawCircle(this.rect.centerX(), this.rect.centerY(), this.params.getRadius(), this.mainPaint);
        if (this.strokePaint != null) {
            canvas.drawCircle(this.rect.centerX(), this.rect.centerY(), this.params.getRadius(), this.strokePaint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return ((int) this.params.getRadius()) * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return ((int) this.params.getRadius()) * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Assert.fail("Setting alpha is not implemented");
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@m ColorFilter colorFilter) {
        Assert.fail("Setting color filter is not implemented");
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Params {
        private final int color;
        private final float radius;

        @m
        private final Integer strokeColor;

        @m
        private final Float strokeWidth;

        public Params(@q0 float f10, int i10, @m Integer num, @m Float f11) {
            this.radius = f10;
            this.color = i10;
            this.strokeColor = num;
            this.strokeWidth = f11;
        }

        public static /* synthetic */ Params copy$default(Params params, float f10, int i10, Integer num, Float f11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f10 = params.radius;
            }
            if ((i11 & 2) != 0) {
                i10 = params.color;
            }
            if ((i11 & 4) != 0) {
                num = params.strokeColor;
            }
            if ((i11 & 8) != 0) {
                f11 = params.strokeWidth;
            }
            return params.copy(f10, i10, num, f11);
        }

        public final float component1() {
            return this.radius;
        }

        public final int component2() {
            return this.color;
        }

        @m
        public final Integer component3() {
            return this.strokeColor;
        }

        @m
        public final Float component4() {
            return this.strokeWidth;
        }

        @l
        public final Params copy(@q0 float f10, int i10, @m Integer num, @m Float f11) {
            return new Params(f10, i10, num, f11);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return Float.compare(this.radius, params.radius) == 0 && this.color == params.color && m0.g(this.strokeColor, params.strokeColor) && m0.g(this.strokeWidth, params.strokeWidth);
        }

        public final int getColor() {
            return this.color;
        }

        public final float getRadius() {
            return this.radius;
        }

        @m
        public final Integer getStrokeColor() {
            return this.strokeColor;
        }

        @m
        public final Float getStrokeWidth() {
            return this.strokeWidth;
        }

        public int hashCode() {
            int iFloatToIntBits = ((Float.floatToIntBits(this.radius) * 31) + this.color) * 31;
            Integer num = this.strokeColor;
            int iHashCode = (iFloatToIntBits + (num == null ? 0 : num.hashCode())) * 31;
            Float f10 = this.strokeWidth;
            return iHashCode + (f10 != null ? f10.hashCode() : 0);
        }

        @l
        public String toString() {
            return "Params(radius=" + this.radius + ", color=" + this.color + ", strokeColor=" + this.strokeColor + ", strokeWidth=" + this.strokeWidth + ')';
        }

        public /* synthetic */ Params(float f10, int i10, Integer num, Float f11, int i11, x xVar) {
            this(f10, i10, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : f11);
        }
    }
}
