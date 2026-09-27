package com.yandex.div.internal.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.yandex.div.internal.graphics.Colormap;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class LinearGradientDrawable extends Drawable {

    @l
    public static final Companion Companion = new Companion(null);
    private final float angle;

    @l
    private final Colormap colormap;

    @l
    private final Paint paint = new Paint();

    @l
    private RectF rect = new RectF();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private final float toRadian(float f10) {
            return (float) ((((double) f10) * 3.141592653589793d) / ((double) 180.0f));
        }

        @l
        public final LinearGradient createLinearGradient(float f10, @l int[] iArr, @m float[] fArr, int i10, int i11) {
            float f11 = i10;
            float f12 = f11 / 2.0f;
            float f13 = i11;
            float f14 = f13 / 2.0f;
            double radian = toRadian(f10);
            float fAbs = Math.abs(f11 * ((float) Math.cos(radian))) + Math.abs(f13 * ((float) Math.sin(radian)));
            float fSnap$default = LinearGradientDrawableKt.snap$default((((float) Math.cos(radian)) * fAbs) / 2.0f, 0.0f, 0.0f, 2, null);
            float fSnap$default2 = LinearGradientDrawableKt.snap$default((((float) Math.sin(radian)) * fAbs) / 2.0f, 0.0f, 0.0f, 2, null);
            return new LinearGradient(f12 - fSnap$default, f14 + fSnap$default2, f12 + fSnap$default, f14 - fSnap$default2, iArr, fArr, Shader.TileMode.CLAMP);
        }

        private Companion() {
        }
    }

    public LinearGradientDrawable(float f10, @l Colormap colormap) {
        this.angle = f10;
        this.colormap = colormap;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@l Canvas canvas) {
        canvas.drawRect(this.rect, this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@l Rect rect) {
        super.onBoundsChange(rect);
        this.paint.setShader(Companion.createLinearGradient(this.angle, this.colormap.getColors(), this.colormap.getPositions(), rect.width(), rect.height()));
        this.rect.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.paint.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@m ColorFilter colorFilter) {
    }
}
