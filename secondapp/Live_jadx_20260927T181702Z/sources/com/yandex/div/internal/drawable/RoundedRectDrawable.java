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
public final class RoundedRectDrawable extends Drawable {

    @l
    private final Paint mainPaint;
    private final float offset;

    @l
    private final Params params;
    private final float radiusX;
    private final float radiusY;

    @l
    private final RectF rect;
    private final float strokeOffset;

    @m
    private final Paint strokePaint;

    public RoundedRectDrawable(@l Params params) {
        this.params = params;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(params.getColor());
        this.mainPaint = paint;
        this.radiusX = considerSize(params.getRadius(), params.getHeight());
        this.radiusY = considerSize(params.getRadius(), params.getWidth());
        RectF rectF = new RectF(0.0f, 0.0f, params.getWidth(), params.getHeight());
        this.rect = rectF;
        if (params.getStrokeColor() == null || params.getStrokeWidth() == null) {
            this.strokePaint = null;
            this.strokeOffset = 0.0f;
            this.offset = 0.0f;
        } else {
            Paint paint2 = new Paint(1);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(params.getStrokeColor().intValue());
            paint2.setStrokeWidth(params.getStrokeWidth().floatValue());
            this.strokePaint = paint2;
            this.strokeOffset = params.getStrokeWidth().floatValue() / 2;
            this.offset = 1.0f;
        }
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }

    private final float considerSize(float f10, float f11) {
        return f10 - (f10 >= f11 / ((float) 2) ? this.strokeOffset : 0.0f);
    }

    private final void setRectWithOffset(float f10) {
        Rect bounds = getBounds();
        this.rect.set(bounds.left + f10, bounds.top + f10, bounds.right - f10, bounds.bottom - f10);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@l Canvas canvas) {
        setRectWithOffset(this.offset);
        canvas.drawRoundRect(this.rect, this.radiusX, this.radiusY, this.mainPaint);
        Paint paint = this.strokePaint;
        if (paint != null) {
            setRectWithOffset(this.strokeOffset);
            canvas.drawRoundRect(this.rect, this.params.getRadius(), this.params.getRadius(), paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.params.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) this.params.getWidth();
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
        private final float height;
        private final float radius;

        @m
        private final Integer strokeColor;

        @m
        private final Float strokeWidth;
        private final float width;

        public Params(@q0 float f10, @q0 float f11, int i10, @q0 float f12, @m Integer num, @q0 @m Float f13) {
            this.width = f10;
            this.height = f11;
            this.color = i10;
            this.radius = f12;
            this.strokeColor = num;
            this.strokeWidth = f13;
        }

        public static /* synthetic */ Params copy$default(Params params, float f10, float f11, int i10, float f12, Integer num, Float f13, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f10 = params.width;
            }
            if ((i11 & 2) != 0) {
                f11 = params.height;
            }
            if ((i11 & 4) != 0) {
                i10 = params.color;
            }
            if ((i11 & 8) != 0) {
                f12 = params.radius;
            }
            if ((i11 & 16) != 0) {
                num = params.strokeColor;
            }
            if ((i11 & 32) != 0) {
                f13 = params.strokeWidth;
            }
            Integer num2 = num;
            Float f14 = f13;
            return params.copy(f10, f11, i10, f12, num2, f14);
        }

        public final float component1() {
            return this.width;
        }

        public final float component2() {
            return this.height;
        }

        public final int component3() {
            return this.color;
        }

        public final float component4() {
            return this.radius;
        }

        @m
        public final Integer component5() {
            return this.strokeColor;
        }

        @m
        public final Float component6() {
            return this.strokeWidth;
        }

        @l
        public final Params copy(@q0 float f10, @q0 float f11, int i10, @q0 float f12, @m Integer num, @q0 @m Float f13) {
            return new Params(f10, f11, i10, f12, num, f13);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return Float.compare(this.width, params.width) == 0 && Float.compare(this.height, params.height) == 0 && this.color == params.color && Float.compare(this.radius, params.radius) == 0 && m0.g(this.strokeColor, params.strokeColor) && m0.g(this.strokeWidth, params.strokeWidth);
        }

        public final int getColor() {
            return this.color;
        }

        public final float getHeight() {
            return this.height;
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

        public final float getWidth() {
            return this.width;
        }

        public int hashCode() {
            int iFloatToIntBits = ((((((Float.floatToIntBits(this.width) * 31) + Float.floatToIntBits(this.height)) * 31) + this.color) * 31) + Float.floatToIntBits(this.radius)) * 31;
            Integer num = this.strokeColor;
            int iHashCode = (iFloatToIntBits + (num == null ? 0 : num.hashCode())) * 31;
            Float f10 = this.strokeWidth;
            return iHashCode + (f10 != null ? f10.hashCode() : 0);
        }

        @l
        public String toString() {
            return "Params(width=" + this.width + ", height=" + this.height + ", color=" + this.color + ", radius=" + this.radius + ", strokeColor=" + this.strokeColor + ", strokeWidth=" + this.strokeWidth + ')';
        }

        public /* synthetic */ Params(float f10, float f11, int i10, float f12, Integer num, Float f13, int i11, x xVar) {
            this(f10, f11, i10, f12, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? null : f13);
        }
    }
}
