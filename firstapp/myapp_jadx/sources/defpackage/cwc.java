package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class cwc implements Function2<a, Integer, Unit> {
    public final /* synthetic */ String a;
    public final /* synthetic */ gtc b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;

    public cwc(String str, gtc gtcVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = gtcVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        twd0 twd0VarA;
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            float f = dxc.g;
            float f2 = dxc.e;
            d.a aVar3 = d.a.b;
            d dVarO = j.o(aVar3, f, f2);
            aiv aivVarC = g75.c(ht.a.e, false);
            int I = aVar2.I();
            ne00 ne00VarO = aVar2.o();
            d dVarC = c.c(aVar2, dVarO);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            if (aVar2.k() == null) {
                l2a.b();
                throw null;
            }
            aVar2.D();
            if (aVar2.g()) {
                aVar2.F(aVar4);
            } else {
                aVar2.p();
            }
            hlh0.a(aVar2, aivVarC, yka.a.f);
            hlh0.a(aVar2, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I))) {
                j3c.a(I, aVar2, I, c1350a);
            }
            hlh0.a(aVar2, dVarC, yka.a.d);
            Object objY = aVar2.y();
            if (objY == a.C0041a.a) {
                objY = new bwc();
                aVar2.r(objY);
            }
            d dVarA = xa80.a(aVar3, (Function1) objY);
            gtc gtcVar = this.b;
            long j = gtcVar.o;
            boolean z = this.d;
            boolean z2 = this.e;
            boolean z3 = this.f;
            if (z && z3) {
                j = gtcVar.p;
            } else if (z && !z3) {
                j = gtcVar.q;
            } else if (z2 && z3) {
                j = gtcVar.w;
            } else if (!z2 || z3) {
                if (this.c && z3) {
                    j = gtcVar.t;
                } else if (z3) {
                    j = gtcVar.n;
                }
            }
            long j2 = j;
            if (z2) {
                aVar2.N(-969483020);
                twd0VarA = m.c(new j58(j2), aVar2);
                aVar2.H();
            } else {
                aVar2.N(-969417610);
                twd0VarA = hw90.a(j2, a6w.b(z5w.c, aVar2), null, aVar2, 0, 12);
                aVar2.H();
            }
            lkf0.d(this.a, dVarA, ((j58) twd0VarA.getValue()).a, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 261112);
            aVar2.s();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
