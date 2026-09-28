package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public final class mpf0 extends Drawable {
    public final int a;
    public final int b;
    public final int c;
    public int d = 0;
    public int e = 0;
    public final Paint f;

    public mpf0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        Rect bounds = getBounds();
        bounds.getClass();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int i = this.a;
        Paint paint = this.f;
        paint.setColor(i);
        float f = iWidth;
        canvas.drawRect(0.0f, 0.0f, f, this.d, paint);
        paint.setColor(this.b);
        canvas.drawRect(0.0f, this.d, f, iHeight - this.e, paint);
        paint.setColor(this.c);
        canvas.drawRect(0.0f, iHeight - this.e, f, iHeight, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
