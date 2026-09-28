package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class afh0 implements wg50<Drawable, Drawable> {
    @Override // defpackage.wg50
    public final boolean a(Drawable drawable, s2z s2zVar) {
        return true;
    }

    @Override // defpackage.wg50
    public final qg50<Drawable> b(Drawable drawable, int i, int i2, s2z s2zVar) {
        Drawable drawable2 = drawable;
        if (drawable2 != null) {
            return new sxx(drawable2);
        }
        return null;
    }
}
