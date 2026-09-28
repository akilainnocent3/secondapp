package defpackage;

import android.graphics.drawable.Drawable;
import android.util.Property;

/* JADX INFO: loaded from: classes4.dex */
public final class zcf extends Property<Drawable, Integer> {
    public static final zcf a = new zcf(Integer.class, "drawableAlphaCompat");

    @Override // android.util.Property
    public final Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    public final void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
