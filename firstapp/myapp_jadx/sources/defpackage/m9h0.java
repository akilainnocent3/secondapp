package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class m9h0 {
    public static final ThreadLocal<Paint> a = new ThreadLocal<>();

    public static Typeface a(Typeface typeface, s9i s9iVar, Context context) {
        if (typeface == null) {
            return null;
        }
        if (s9iVar.a.isEmpty()) {
            return typeface;
        }
        ThreadLocal<Paint> threadLocal = a;
        Paint paint = threadLocal.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(cj10.a(s9iVar, context));
        return paint.getTypeface();
    }
}
