package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class adf implements qh50<Drawable, byte[]> {
    public final ue4 a;
    public final ce4 b;
    public final ny60 c;

    public adf(ue4 ue4Var, ce4 ce4Var, ny60 ny60Var) {
        this.a = ue4Var;
        this.b = ce4Var;
        this.c = ny60Var;
    }

    @Override // defpackage.qh50
    public final qg50<byte[]> a(qg50<Drawable> qg50Var, s2z s2zVar) {
        Drawable drawable = qg50Var.get();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(we4.e(this.a, ((BitmapDrawable) drawable).getBitmap()), s2zVar);
        }
        if (drawable instanceof thk) {
            return this.c.a(qg50Var, s2zVar);
        }
        return null;
    }
}
