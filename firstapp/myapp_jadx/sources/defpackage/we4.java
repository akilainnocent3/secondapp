package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class we4 implements qg50<Bitmap>, thn {
    public final Bitmap a;
    public final ue4 b;

    public we4(ue4 ue4Var, Bitmap bitmap) {
        gm20.c(bitmap, "Bitmap must not be null");
        this.a = bitmap;
        gm20.c(ue4Var, "BitmapPool must not be null");
        this.b = ue4Var;
    }

    public static we4 e(ue4 ue4Var, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new we4(ue4Var, bitmap);
    }

    @Override // defpackage.qg50
    public final int a() {
        return erh0.c(this.a);
    }

    @Override // defpackage.thn
    public final void b() {
        this.a.prepareToDraw();
    }

    @Override // defpackage.qg50
    public final void c() {
        this.b.d(this.a);
    }

    @Override // defpackage.qg50
    public final Class<Bitmap> d() {
        return Bitmap.class;
    }

    @Override // defpackage.qg50
    public final Bitmap get() {
        return this.a;
    }
}
