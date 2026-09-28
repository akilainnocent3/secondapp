package defpackage;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class ee4 implements zg50<BitmapDrawable> {
    public final ue4 a;
    public final ge4 b;

    public ee4(ue4 ue4Var, ge4 ge4Var) {
        this.a = ue4Var;
        this.b = ge4Var;
    }

    @Override // defpackage.zg50
    public final c4g a(s2z s2zVar) {
        return c4g.b;
    }

    @Override // defpackage.g4g
    public final boolean b(Object obj, File file, s2z s2zVar) {
        return this.b.b(new we4(this.a, ((BitmapDrawable) ((qg50) obj).get()).getBitmap()), file, s2zVar);
    }
}
