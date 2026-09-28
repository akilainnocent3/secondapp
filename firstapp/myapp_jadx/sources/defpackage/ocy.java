package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes8.dex */
public final class ocy implements wa50<Bitmap> {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ pcy c;

    public ocy(pcy pcyVar, int i, int i2) {
        this.c = pcyVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.wa50
    public final boolean f(Bitmap bitmap, Object obj, d5f0<Bitmap> d5f0Var, cqc cqcVar, boolean z) {
        Bitmap bitmap2 = bitmap;
        float f = this.a * 0.3f;
        float f2 = this.b;
        pcy pcyVar = this.c;
        float f3 = pcyVar.a;
        if (f2 < f3) {
            f *= f3 / f2;
            f2 = f3;
        }
        pcyVar.e = new bwf(bitmap2, 0.0f, 0.0f, f2 + 0.0f, f + 0.0f);
        return true;
    }

    @Override // defpackage.wa50
    public final boolean l(xzk xzkVar, Object obj, d5f0<Bitmap> d5f0Var, boolean z) {
        return false;
    }
}
