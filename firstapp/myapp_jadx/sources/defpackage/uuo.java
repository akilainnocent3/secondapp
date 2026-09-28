package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class uuo extends Drawable {
    public final float a;
    public final View b;

    public uuo(View view, float f) {
        this.a = f;
        this.b = view;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        Paint paint = new Paint();
        paint.setColor(this.b.getContext().getColor(R.color.custom_brand_secondary_type1));
        Path path = new Path();
        path.moveTo(getBounds().left, getBounds().top);
        path.lineTo(getBounds().right, getBounds().top);
        path.lineTo(getBounds().right - this.a, getBounds().bottom);
        path.lineTo(getBounds().left, getBounds().bottom);
        path.close();
        canvas.drawPath(path, paint);
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
