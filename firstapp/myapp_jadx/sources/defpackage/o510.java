package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public final class o510 extends ujc<Drawable> {
    public final /* synthetic */ m410 d;

    public o510(m410 m410Var) {
        this.d = m410Var;
    }

    @Override // defpackage.d5f0
    public final void e(Object obj) {
        f820 binding;
        Drawable drawable = (Drawable) obj;
        ixi ixiVar = (ixi) this.d.b;
        if (ixiVar == null || (binding = ixiVar.O.getBinding()) == null) {
            return;
        }
        binding.J.setBackground(drawable);
    }

    @Override // defpackage.d5f0
    public final void h(Drawable drawable) {
    }
}
