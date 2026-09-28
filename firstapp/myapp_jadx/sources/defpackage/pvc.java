package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class pvc implements Function2<a, Integer, Unit> {
    public final /* synthetic */ Function2<a, Integer, Unit> a;
    public final /* synthetic */ Function2<a, Integer, Unit> b;
    public final /* synthetic */ Function2<a, Integer, Unit> c;
    public final /* synthetic */ gtc d;
    public final /* synthetic */ imf0 e;

    /* JADX WARN: Multi-variable type inference failed */
    public pvc(Function2<? super a, ? super Integer, Unit> function2, Function2<? super a, ? super Integer, Unit> function3, Function2<? super a, ? super Integer, Unit> function4, gtc gtcVar, imf0 imf0Var) {
        this.a = function2;
        this.b = function3;
        this.c = function4;
        this.d = gtcVar;
        this.e = imf0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        kw0.e eVar;
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            d.a aVar3 = d.a.b;
            d dVarG = j.g(aVar3, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
            int I = aVar2.I();
            ne00 ne00VarO = aVar2.o();
            d dVarC = c.c(aVar2, dVarG);
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
            Function2<a, Integer, Unit> function2 = this.a;
            Function2<a, Integer, Unit> function3 = this.b;
            if (function2 == null || function3 == null) {
                eVar = function2 != null ? kw0.a : kw0.b;
            } else {
                eVar = kw0.g;
            }
            d dVarG2 = j.g(aVar3, 1.0f);
            d160 d160VarA = b160.a(eVar, ht.a.k, aVar2, 48);
            int I2 = aVar2.I();
            ne00 ne00VarO2 = aVar2.o();
            d dVarC2 = c.c(aVar2, dVarG2);
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
            hlh0.a(aVar2, d160VarA, bVar);
            hlh0.a(aVar2, ne00VarO2, dVar);
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I2))) {
                j3c.a(I2, aVar2, I2, c1350a);
            }
            hlh0.a(aVar2, dVarC2, cVar);
            if (function2 != null) {
                aVar2.N(-516028300);
                lkf0.a(this.e, pp8.b(-738208900, new ovc(function2), aVar2), aVar2, 48);
                aVar2.H();
            } else {
                aVar2.N(-515838022);
                aVar2.H();
            }
            if (function3 == null) {
                aVar2.N(-515799087);
            } else {
                aVar2.N(260455984);
                function3.invoke(aVar2, 0);
            }
            aVar2.H();
            aVar2.s();
            if (this.c == null && function2 == null && function3 == null) {
                aVar2.N(-250277930);
                aVar2.H();
            } else {
                aVar2.N(-250360576);
                ute.b(null, 0.0f, this.d.x, aVar2, 0, 3);
                aVar2.H();
            }
            aVar2.s();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
