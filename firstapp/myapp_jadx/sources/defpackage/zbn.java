package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class zbn {
    public static final Drawable a(u7n u7nVar, Resources resources) {
        if (u7nVar instanceof edf) {
            return ((edf) u7nVar).a;
        }
        return u7nVar instanceof oe4 ? new BitmapDrawable(resources, ((oe4) u7nVar).a) : new w8n(u7nVar);
    }

    public static final u7n b(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new oe4(((BitmapDrawable) drawable).getBitmap()) : new edf(drawable);
    }

    public static Bitmap c(u7n u7nVar) {
        int iC = u7nVar.c();
        int iB = u7nVar.b();
        boolean z = u7nVar instanceof oe4;
        Bitmap.Config config = z ? ((oe4) u7nVar).a.getConfig() : null;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (z) {
            Bitmap bitmap = ((oe4) u7nVar).a;
            if (bitmap.getWidth() == iC && bitmap.getHeight() == iB && bitmap.getConfig() == config) {
                return bitmap;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iC, iB, config);
        u7nVar.d(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }
}
