package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class zrh0 {
    public static int a(float f, float f2) {
        int iRound = Math.round(f * 1000000.0f);
        int iRound2 = Math.round(f2 * 1000000.0f);
        if (iRound > iRound2) {
            return 1;
        }
        return iRound < iRound2 ? -1 : 0;
    }

    public static int b(float f, Context context) {
        if (context == null || a(0.0f, f) == 0) {
            return 0;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static Bitmap c(int i, int i2, int i3, Context context) {
        if (context == null || i <= 0 || i2 <= 0 || i3 == 0) {
            return null;
        }
        return d(i, i2, context.getResources().getDrawable(i3, null));
    }

    public static Bitmap d(int i, int i2, Drawable drawable) {
        Exception exc;
        Bitmap bitmapCreateBitmap = null;
        try {
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (bitmap != null) {
                    try {
                        if (bitmap.getHeight() > 0) {
                            Matrix matrix = new Matrix();
                            matrix.postScale((i * 1.0f) / bitmap.getWidth(), (i2 * 1.0f) / bitmap.getHeight());
                            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        }
                    } catch (Exception e) {
                        exc = e;
                        bitmapCreateBitmap = bitmap;
                        exc.printStackTrace();
                        return bitmapCreateBitmap;
                    }
                }
            }
            bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e2) {
            exc = e2;
        }
    }

    public static Rect e(float f, String str) {
        Paint paint = new Paint();
        Rect rect = new Rect();
        paint.setTextSize(f);
        paint.getTextBounds(str, 0, str.length(), rect);
        paint.reset();
        return rect;
    }
}
