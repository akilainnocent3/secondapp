package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class vtr implements qg50<BitmapDrawable>, thn {
    public final Resources a;
    public final qg50<Bitmap> b;

    public vtr(Resources resources, qg50<Bitmap> qg50Var) {
        gm20.c(resources, "Argument must not be null");
        this.a = resources;
        gm20.c(qg50Var, "Argument must not be null");
        this.b = qg50Var;
    }

    @Override // defpackage.qg50
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.thn
    public final void b() {
        qg50<Bitmap> qg50Var = this.b;
        if (qg50Var instanceof thn) {
            ((thn) qg50Var).b();
        }
    }

    @Override // defpackage.qg50
    public final void c() {
        this.b.c();
    }

    @Override // defpackage.qg50
    public final Class<BitmapDrawable> d() {
        return BitmapDrawable.class;
    }

    @Override // defpackage.qg50
    public final BitmapDrawable get() {
        return new BitmapDrawable(this.a, this.b.get());
    }
}
