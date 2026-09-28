package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class de4<DataType> implements wg50<DataType, BitmapDrawable> {
    public final wg50<DataType, Bitmap> a;
    public final Resources b;

    public de4(Resources resources, wg50<DataType, Bitmap> wg50Var) {
        this.b = resources;
        this.a = wg50Var;
    }

    @Override // defpackage.wg50
    public final boolean a(DataType datatype, s2z s2zVar) {
        return this.a.a(datatype, s2zVar);
    }

    @Override // defpackage.wg50
    public final qg50<BitmapDrawable> b(DataType datatype, int i, int i2, s2z s2zVar) {
        qg50<Bitmap> qg50VarB = this.a.b(datatype, i, i2, s2zVar);
        if (qg50VarB == null) {
            return null;
        }
        return new vtr(this.b, qg50VarB);
    }
}
