package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s1w implements Function2<a, Integer, Unit> {
    public final /* synthetic */ j590 a;
    public final /* synthetic */ Function0<Unit> b;
    public final /* synthetic */ v5b c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String i;
    public final /* synthetic */ Function2<a, Integer, Unit> v;

    /* JADX WARN: Multi-variable type inference failed */
    public s1w(j590 j590Var, Function0<Unit> function0, v5b v5bVar, boolean z, String str, String str2, String str3, Function2<? super a, ? super Integer, Unit> function2) {
        this.a = j590Var;
        this.b = function0;
        this.c = v5bVar;
        this.d = z;
        this.e = str;
        this.f = str2;
        this.i = str3;
        this.v = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            final j590 j590Var = this.a;
            boolean zM = aVar2.M(j590Var);
            final Function0<Unit> function0 = this.b;
            boolean zM2 = zM | aVar2.M(function0);
            final v5b v5bVar = this.c;
            boolean zA = zM2 | aVar2.A(v5bVar);
            Object objY = aVar2.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new Function0() { // from class: k1w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        j590 j590Var2 = j590Var;
                        int iOrdinal = j590Var2.c().ordinal();
                        if (iOrdinal != 1) {
                            v5b v5bVar2 = v5bVar;
                            if (iOrdinal != 2) {
                                ej5.c(v5bVar2, null, null, new p1w(j590Var2, null), 3);
                            } else {
                                ej5.c(v5bVar2, null, null, new o1w(j590Var2, null), 3);
                            }
                        } else {
                            function0.invoke();
                            Unit unit = Unit.a;
                        }
                        return Unit.a;
                    }
                };
                aVar2.r(objY);
            }
            d dVarC = androidx.compose.foundation.d.c((Function0) objY);
            boolean zM3 = aVar2.M(function0) | aVar2.b(this.d) | aVar2.M(j590Var) | aVar2.M(this.e) | aVar2.M(this.f) | aVar2.A(v5bVar) | aVar2.M(this.i);
            Object objY2 = aVar2.y();
            if (zM3 || objY2 == c0042a) {
                final boolean z = this.d;
                final String str = this.e;
                final String str2 = this.f;
                final String str3 = this.i;
                final Function0<Unit> function1 = this.b;
                final v5b v5bVar2 = this.c;
                Function1 function2 = new Function1() { // from class: l1w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        pb80 pb80Var = (pb80) obj;
                        if (z) {
                            m1w m1wVar = new m1w(function1, 0);
                            ohp<Object>[] ohpVarArr = lb80.a;
                            pb80Var.b(ra80.u, new c6(str, m1wVar));
                            final j590 j590Var2 = j590Var;
                            k590 k590VarC = j590Var2.c();
                            k590 k590Var = k590.c;
                            final v5b v5bVar3 = v5bVar2;
                            if (k590VarC == k590Var) {
                                pb80Var.b(ra80.s, new c6(str2, new Function0() { // from class: n1w
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        if (j590Var2.e.d.invoke(k590.b).booleanValue()) {
                                            ej5.c(v5bVar3, null, null, new q1w(j590Var2, null), 3);
                                        }
                                        return Boolean.TRUE;
                                    }
                                }));
                            } else if (j590Var2.e.e().e(k590Var)) {
                                pb80Var.b(ra80.t, new c6(str3, new mtc(1, j590Var2, v5bVar3)));
                            }
                        }
                        return Unit.a;
                    }
                };
                aVar2.r(function2);
                objY2 = function2;
            }
            d dVarB = xa80.b(dVarC, true, (Function1) objY2);
            aiv aivVarC = g75.c(ht.a.a, false);
            int I = aVar2.I();
            ne00 ne00VarO = aVar2.o();
            d dVarC2 = c.c(aVar2, dVarB);
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
            hlh0.a(aVar2, aivVarC, yka.a.f);
            hlh0.a(aVar2, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I))) {
                j3c.a(I, aVar2, I, c1350a);
            }
            hlh0.a(aVar2, dVarC2, yka.a.d);
            ps.a(0, aVar2, this.v);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
