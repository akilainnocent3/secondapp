package defpackage;

import android.util.Rational;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class qge0 {
    public final int a;
    public final int b;
    public final Rational c;
    public final boolean d;

    public qge0(m26 m26Var, Rational rational) {
        this.a = m26Var.c();
        this.b = m26Var.f();
        this.c = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        this.d = z;
    }

    public final Size a(x9n x9nVar) {
        int iE = x9nVar.E(0);
        Size sizeT = x9nVar.t();
        if (sizeT != null) {
            int iA = x26.a(x26.b(iE), this.a, 1 == this.b);
            if (iA == 90 || iA == 270) {
                return new Size(sizeT.getHeight(), sizeT.getWidth());
            }
        }
        return sizeT;
    }
}
