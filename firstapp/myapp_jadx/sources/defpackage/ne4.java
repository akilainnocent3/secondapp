package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class ne4 implements uih {
    public final Bitmap a;
    public final u2z b;

    public static final class a implements uih.a<Bitmap> {
        @Override // uih.a
        public final uih a(Object obj, u2z u2zVar, a840 a840Var) {
            return new ne4((Bitmap) obj, u2zVar);
        }
    }

    public ne4(Bitmap bitmap, u2z u2zVar) {
        this.a = bitmap;
        this.b = u2zVar;
    }

    @Override // defpackage.uih
    public final Object a(v1b<? super sih> v1bVar) {
        return new y8n(zbn.b(new BitmapDrawable(this.b.a.getResources(), this.a)), false, bqc.b);
    }
}
