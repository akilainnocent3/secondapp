package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class bdf {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T a(Drawable drawable) {
        return drawable instanceof n7k0 ? (T) ((n7k0) drawable).a() : drawable;
    }
}
