package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.layout.t;
import defpackage.a880;
import defpackage.biv;
import defpackage.f8i;
import defpackage.fkd;
import defpackage.if1;
import defpackage.imf0;
import defpackage.l2l;
import defpackage.mzo;
import defpackage.nk0;
import defpackage.psr;
import defpackage.qcf;
import defpackage.syd0;
import defpackage.tkd;
import defpackage.vhv;
import defpackage.wsr;
import defpackage.xkt;
import defpackage.ywx;
import defpackage.zkn;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends tkd implements psr, qcf, l2l {
    public a880 F;
    public final b G;

    public a() {
        throw null;
    }

    public a(nk0 nk0Var, imf0 imf0Var, f8i.a aVar, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function2, a880 a880Var, if1 if1Var) {
        this.F = a880Var;
        b bVar = new b(nk0Var, imf0Var, aVar, function1, i, z, i2, i3, list, function2, a880Var, if1Var, null);
        p2(bVar);
        this.G = bVar;
        if (this.F != null) {
            return;
        }
        zkn.b("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        fkd.a();
        throw null;
    }

    @Override // defpackage.qcf
    public final void A(wsr wsrVar) throws Throwable {
        this.G.A(wsrVar);
    }

    @Override // defpackage.psr
    public final int C(xkt xktVar, mzo mzoVar, int i) {
        return this.G.C(xktVar, mzoVar, i);
    }

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        return this.G.e(tVar, vhvVar, j);
    }

    @Override // androidx.compose.ui.d.c
    public final boolean e2() {
        return false;
    }

    @Override // defpackage.psr
    public final int o(xkt xktVar, mzo mzoVar, int i) {
        return this.G.o(xktVar, mzoVar, i);
    }

    @Override // defpackage.l2l
    public final void r0(ywx ywxVar) {
        a880 a880Var = this.F;
        if (a880Var != null) {
            a880Var.d = syd0.a(a880Var.d, ywxVar, null, 2);
            a880Var.b.f();
        }
    }

    @Override // defpackage.psr
    public final int s(xkt xktVar, mzo mzoVar, int i) {
        return this.G.s(xktVar, mzoVar, i);
    }

    @Override // defpackage.psr
    public final int w(xkt xktVar, mzo mzoVar, int i) {
        return this.G.w(xktVar, mzoVar, i);
    }
}
