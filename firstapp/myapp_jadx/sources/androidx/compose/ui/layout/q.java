package androidx.compose.ui.layout;

import defpackage.asr;
import defpackage.ay0;
import defpackage.s160;
import defpackage.urr;
import defpackage.xkt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class q extends y.a {
    public final xkt b;

    public q(xkt xktVar) {
        this.b = xktVar;
    }

    @Override // androidx.compose.ui.layout.y.a
    public final float e(b0 b0Var, float f) {
        int iD;
        Function2<y.a, Float, Float> function2 = b0Var.a;
        if (function2 != null) {
            return function2.invoke(this, Float.valueOf(f)).floatValue();
        }
        xkt xktVar = this.b;
        if (xktVar.z) {
            return f;
        }
        xkt xktVar2 = xktVar;
        while (true) {
            s160 s160Var = xktVar2.B;
            float f2 = Float.NaN;
            if (s160Var != null && (iD = ay0.D(b0Var, s160Var.b)) >= 0) {
                f2 = s160Var.c[iD];
            }
            if (!Float.isNaN(f2)) {
                xktVar2.A0(xktVar.T1(), b0Var);
                return b0Var.a(f2, xktVar2.f1(), xktVar.f1());
            }
            xkt xktVarQ0 = xktVar2.Q0();
            if (xktVarQ0 == null) {
                xktVar2.A0(xktVar.T1(), b0Var);
                return f;
            }
            xktVar2 = xktVarQ0;
        }
    }

    @Override // androidx.compose.ui.layout.y.a
    public final urr f1() {
        xkt xktVar = this.b;
        urr urrVarF1 = xktVar.z ? null : xktVar.f1();
        if (urrVarF1 == null) {
            xktVar.T1().V.b();
        }
        return urrVarF1;
    }

    @Override // androidx.compose.ui.layout.y.a
    public final asr g() {
        return this.b.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.y.a, defpackage.mmd
    public final float getDensity() {
        return this.b.getDensity();
    }

    @Override // androidx.compose.ui.layout.y.a
    public final int i() {
        return this.b.o0();
    }

    @Override // androidx.compose.ui.layout.y.a, defpackage.mmd
    public final float y1() {
        return this.b.y1();
    }
}
