package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class ddf implements uih {
    public final Drawable a;
    public final u2z b;

    public static final class a implements uih.a<Drawable> {
        @Override // uih.a
        public final uih a(Object obj, u2z u2zVar, a840 a840Var) {
            return new ddf((Drawable) obj, u2zVar);
        }
    }

    public ddf(Drawable drawable, u2z u2zVar) {
        this.a = drawable;
        this.b = u2zVar;
    }

    @Override // defpackage.uih
    public final Object a(v1b<? super sih> v1bVar) {
        Bitmap.Config[] configArr = vsh0.a;
        Drawable bitmapDrawable = this.a;
        boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof hwh0);
        if (z) {
            u2z u2zVar = this.b;
            bitmapDrawable = new BitmapDrawable(u2zVar.a.getResources(), tdf.a(bitmapDrawable, abn.c(u2zVar), u2zVar.b, u2zVar.c, u2zVar.d == dm20.b));
        }
        return new y8n(zbn.b(bitmapDrawable), z, bqc.b);
    }
}
