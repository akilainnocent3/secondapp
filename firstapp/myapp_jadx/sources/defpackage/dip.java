package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public final class dip extends Drawable {
    public final int a;
    public final int b;
    public final int c;
    public final Context d;

    public dip(int i, int i2, int i3, Context context) {
        context.getClass();
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = context;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        Path path = new Path();
        path.reset();
        Rect bounds = getBounds();
        bounds.getClass();
        RectF rectF = new RectF(bounds);
        Context context = this.d;
        path.addRoundRect(rectF, zch0.a(context, 4), zch0.b(context.getResources(), 4), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        Paint paint = new Paint();
        paint.setColor(context.getColor(this.c));
        Rect bounds2 = getBounds();
        bounds2.getClass();
        canvas.drawRect(new RectF(bounds2), paint);
        Paint paint2 = new Paint();
        paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getBounds().bottom, context.getColor(this.a), context.getColor(this.b), Shader.TileMode.MIRROR));
        Path path2 = new Path();
        path2.moveTo(getBounds().left, getBounds().top);
        path2.lineTo(getBounds().right - (getBounds().width() / 4), getBounds().top);
        path2.lineTo((getBounds().right - (getBounds().width() / 4)) - ((float) (((double) getBounds().height()) / Math.tan(1.0471975511965976d))), getBounds().bottom);
        path2.lineTo(getBounds().left, getBounds().bottom);
        path2.close();
        canvas.drawPath(path2, paint2);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
