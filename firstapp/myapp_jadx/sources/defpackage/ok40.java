package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class ok40 {
    public static final Rect a(owo owoVar) {
        return new Rect(owoVar.a, owoVar.b, owoVar.c, owoVar.d);
    }

    @fae
    public static final Rect b(lk40 lk40Var) {
        return new Rect((int) lk40Var.a, (int) lk40Var.b, (int) lk40Var.c, (int) lk40Var.d);
    }

    public static final RectF c(lk40 lk40Var) {
        return new RectF(lk40Var.a, lk40Var.b, lk40Var.c, lk40Var.d);
    }

    public static final lk40 d(Rect rect) {
        return new lk40(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final lk40 e(RectF rectF) {
        return new lk40(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
