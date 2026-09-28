package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class rg50 implements wg50<Uri, Bitmap> {
    public final yg50 a;
    public final ue4 b;

    public rg50(yg50 yg50Var, ue4 ue4Var) {
        this.a = yg50Var;
        this.b = ue4Var;
    }

    @Override // defpackage.wg50
    public final boolean a(Uri uri, s2z s2zVar) {
        return "android.resource".equals(uri.getScheme());
    }

    @Override // defpackage.wg50
    public final qg50<Bitmap> b(Uri uri, int i, int i2, s2z s2zVar) {
        qg50 qg50VarC = this.a.c(uri, s2zVar);
        if (qg50VarC == null) {
            return null;
        }
        return mdf.a(this.b, (Drawable) ((ldf) qg50VarC).get(), i, i2);
    }
}
