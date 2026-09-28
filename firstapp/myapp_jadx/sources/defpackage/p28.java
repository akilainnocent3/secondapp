package defpackage;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class p28 {
    public static void a(Drawable drawable) {
        Drawable drawable2;
        drawable.getClass();
        if (Build.VERSION.SDK_INT < 28) {
            if (!(drawable instanceof c7w)) {
                drawable = null;
            }
            c7w c7wVar = (c7w) drawable;
            if (c7wVar != null) {
                c7wVar.start();
                return;
            }
            return;
        }
        if (!(drawable instanceof xy60)) {
            drawable = null;
        }
        xy60 xy60Var = (xy60) drawable;
        if (xy60Var == null || (drawable2 = xy60Var.a) == null) {
            return;
        }
        AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) (drawable2 instanceof AnimatedImageDrawable ? drawable2 : null);
        if (animatedImageDrawable != null) {
            animatedImageDrawable.start();
        }
    }

    public static void b(Drawable drawable) {
        Drawable drawable2;
        drawable.getClass();
        if (Build.VERSION.SDK_INT < 28) {
            if (!(drawable instanceof c7w)) {
                drawable = null;
            }
            c7w c7wVar = (c7w) drawable;
            if (c7wVar != null) {
                c7wVar.stop();
                return;
            }
            return;
        }
        if (!(drawable instanceof xy60)) {
            drawable = null;
        }
        xy60 xy60Var = (xy60) drawable;
        if (xy60Var == null || (drawable2 = xy60Var.a) == null) {
            return;
        }
        AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) (drawable2 instanceof AnimatedImageDrawable ? drawable2 : null);
        if (animatedImageDrawable != null) {
            animatedImageDrawable.stop();
        }
    }
}
