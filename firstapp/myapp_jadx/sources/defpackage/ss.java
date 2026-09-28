package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ss implements Function2<a, Integer, Unit> {
    public final /* synthetic */ Function2<a, Integer, Unit> a;
    public final /* synthetic */ Function2<a, Integer, Unit> b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ op8 f;

    public ss(Function2 function2, Function2 function3, long j, long j2, long j3, long j4, op8 op8Var) {
        this.a = function2;
        this.b = function3;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            d dVarE = h.e(d.a.b, ys.a);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
            int I = aVar2.I();
            ne00 ne00VarO = aVar2.o();
            d dVarC = c.c(aVar2, dVarE);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            if (aVar2.k() == null) {
                l2a.b();
                throw null;
            }
            aVar2.D();
            if (aVar2.g()) {
                aVar2.F(aVar3);
            } else {
                aVar2.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(aVar2, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(aVar2, ne00VarO, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I))) {
                j3c.a(I, aVar2, I, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(aVar2, dVarC, cVar);
            aVar2.N(346092326);
            aVar2.H();
            Function2<a, Integer, Unit> function2 = this.a;
            if (function2 == null) {
                aVar2.N(346396529);
            } else {
                aVar2.N(346396530);
                i730.a(this.c, gah0.a(cme.f, aVar2), pp8.b(71284337, new qs(function2), aVar2), aVar2, 384);
            }
            aVar2.H();
            Function2<a, Integer, Unit> function3 = this.b;
            if (function3 == null) {
                aVar2.N(347174009);
            } else {
                aVar2.N(347174010);
                i730.a(this.d, gah0.a(cme.h, aVar2), pp8.b(705583346, new rs(function3), aVar2), aVar2, 384);
            }
            aVar2.H();
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(ht.a.o);
            aiv aivVarC = g75.c(ht.a.a, false);
            int I2 = aVar2.I();
            ne00 ne00VarO2 = aVar2.o();
            d dVarC2 = c.c(aVar2, horizontalAlignElement);
            if (aVar2.k() == null) {
                l2a.b();
                throw null;
            }
            aVar2.D();
            if (aVar2.g()) {
                aVar2.F(aVar3);
            } else {
                aVar2.p();
            }
            hlh0.a(aVar2, aivVarC, bVar);
            hlh0.a(aVar2, ne00VarO2, dVar);
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I2))) {
                j3c.a(I2, aVar2, I2, c1350a);
            }
            hlh0.a(aVar2, dVarC2, cVar);
            i730.a(this.e, gah0.a(cme.b, aVar2), this.f, aVar2, 0);
            aVar2.s();
            aVar2.s();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
