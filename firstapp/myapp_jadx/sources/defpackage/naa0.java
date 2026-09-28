package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public final class naa0 extends ujc<Drawable> {
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public naa0(int i, int i2, String str, boolean z) {
        super(i, i2);
        this.d = str;
        this.e = z;
    }

    @Override // defpackage.d5f0
    public final void e(Object obj) {
        String str = this.d;
        boolean z = this.e;
        maa0 maa0Var = new maa0(str, (Drawable) obj, z);
        oaa0.b.put(str, maa0Var);
        if (z) {
            oaa0.c = maa0Var;
        }
    }

    @Override // defpackage.d5f0
    public final void h(Drawable drawable) {
    }
}
