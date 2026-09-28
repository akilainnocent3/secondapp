package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class fe4 implements qh50<Bitmap, BitmapDrawable> {
    public final Resources a;

    public fe4(Resources resources) {
        this.a = resources;
    }

    @Override // defpackage.qh50
    public final qg50<BitmapDrawable> a(qg50<Bitmap> qg50Var, s2z s2zVar) {
        if (qg50Var == null) {
            return null;
        }
        return new vtr(this.a, qg50Var);
    }
}
