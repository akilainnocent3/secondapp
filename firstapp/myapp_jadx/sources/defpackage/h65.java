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
public final class h65 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ j590 a;
    public final /* synthetic */ v5b b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Function2<a, Integer, Unit> i;

    /* JADX WARN: Multi-variable type inference failed */
    public h65(j590 j590Var, v5b v5bVar, boolean z, String str, String str2, String str3, Function2<? super a, ? super Integer, Unit> function2) {
        this.a = j590Var;
        this.b = v5bVar;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.i = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            final j590 j590Var = this.a;
            boolean zM = aVar2.M(j590Var);
            final v5b v5bVar = this.b;
            boolean zA = zM | aVar2.A(v5bVar);
            Object objY = aVar2.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new Function0() { // from class: w55
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        j590 j590Var2 = j590Var;
                        int iOrdinal = j590Var2.c().ordinal();
                        v5b v5bVar2 = v5bVar;
                        if (iOrdinal == 1) {
                            ej5.c(v5bVar2, null, null, new b65(j590Var2, null), 3);
                        } else if (iOrdinal != 2) {
                            ej5.c(v5bVar2, null, null, new d65(j590Var2, null), 3);
                        } else {
                            ej5.c(v5bVar2, null, null, new c65(j590Var2, null), 3);
                        }
                        return Unit.a;
                    }
                };
                aVar2.r(objY);
            }
            d dVarC = androidx.compose.foundation.d.c((Function0) objY);
            boolean zM2 = aVar2.M(j590Var) | aVar2.b(this.c) | aVar2.M(this.d) | aVar2.A(v5bVar) | aVar2.M(this.e) | aVar2.M(this.f);
            Object objY2 = aVar2.y();
            if (zM2 || objY2 == c0042a) {
                final j590 j590Var2 = this.a;
                final boolean z = this.c;
                final String str = this.d;
                final String str2 = this.e;
                final String str3 = this.f;
                final v5b v5bVar2 = this.b;
                Function1 function1 = new Function1() { // from class: x55
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        pb80 pb80Var = (pb80) obj;
                        final j590 j590Var3 = j590Var2;
                        if (j590Var3.e.e().a() > 1 && z) {
                            k590 k590VarC = j590Var3.c();
                            k590 k590Var = k590.c;
                            c20<k590> c20Var = j590Var3.e;
                            final v5b v5bVar3 = v5bVar2;
                            if (k590VarC == k590Var) {
                                if (c20Var.d.invoke(k590.b).booleanValue()) {
                                    Function0 function0 = new Function0() { // from class: y55
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            ej5.c(v5bVar3, null, null, new e65(j590Var3, null), 3);
                                            return Boolean.TRUE;
                                        }
                                    };
                                    ohp<Object>[] ohpVarArr = lb80.a;
                                    pb80Var.b(ra80.s, new c6(str, function0));
                                }
                            } else if (c20Var.d.invoke(k590Var).booleanValue()) {
                                Function0 function2 = new Function0() { // from class: z55
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        ej5.c(v5bVar3, null, null, new f65(j590Var3, null), 3);
                                        return Boolean.TRUE;
                                    }
                                };
                                ohp<Object>[] ohpVarArr2 = lb80.a;
                                pb80Var.b(ra80.t, new c6(str2, function2));
                            }
                            if (!j590Var3.c) {
                                Function0 function3 = new Function0() { // from class: a65
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        ej5.c(v5bVar3, null, null, new g65(j590Var3, null), 3);
                                        return Boolean.TRUE;
                                    }
                                };
                                ohp<Object>[] ohpVarArr3 = lb80.a;
                                pb80Var.b(ra80.u, new c6(str3, function3));
                            }
                        }
                        return Unit.a;
                    }
                };
                aVar2.r(function1);
                objY2 = function1;
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
            ps.a(0, aVar2, this.i);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
