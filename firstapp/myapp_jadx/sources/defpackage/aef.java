package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes6.dex */
public final class aef {
    public static Bitmap a(int i, int i2, Drawable drawable) {
        Object bVar;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        config.getClass();
        if (drawable == null) {
            return null;
        }
        try {
            zi50.a aVar = zi50.b;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
            bitmapCreateBitmap.getClass();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            bVar = bitmapCreateBitmap;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        return (Bitmap) (bVar instanceof zi50.b ? null : bVar);
    }

    public static final void b(Drawable drawable, Context context, int i) {
        context.getClass();
        drawable.setTint(context.getColor(i));
    }
}
