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
public final class q3a0 implements gaj<Function2<? super a, ? super Integer, ? extends Unit>, a, Integer, Unit> {
    public final /* synthetic */ j3a0 a;
    public final /* synthetic */ j3a0 b;
    public final /* synthetic */ s8h<j3a0> c;
    public final /* synthetic */ String d;

    public q3a0(j3a0 j3a0Var, j3a0 j3a0Var2, s8h<j3a0> s8hVar, String str) {
        this.a = j3a0Var;
        this.b = j3a0Var2;
        this.c = s8hVar;
        this.d = str;
    }

    @Override // defpackage.gaj
    public final Unit invoke(Function2<? super a, ? super Integer, ? extends Unit> function2, a aVar, Integer num) {
        Function2<? super a, ? super Integer, ? extends Unit> function3 = function2;
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar2.A(function3) ? 4 : 2;
        }
        if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            j3a0 j3a0Var = this.b;
            final j3a0 j3a0Var2 = this.a;
            final boolean zG = Intrinsics.g(j3a0Var2, j3a0Var);
            goh gohVarB = a6w.b(z5w.d, aVar2);
            boolean zM = aVar2.M(j3a0Var2);
            final s8h<j3a0> s8hVar = this.c;
            boolean zA = zM | aVar2.A(s8hVar);
            Object objY = aVar2.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new Function0() { // from class: n3a0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        s8h s8hVar2 = s8hVar;
                        Object obj = s8hVar2.a;
                        j3a0 j3a0Var3 = j3a0Var2;
                        if (!Intrinsics.g(j3a0Var3, obj)) {
                            p48.A(s8hVar2.b, new vri(j3a0Var3, 2));
                            oj40 oj40Var = s8hVar2.c;
                            if (oj40Var != null) {
                                oj40Var.invalidate();
                            }
                        }
                        return Unit.a;
                    }
                };
                aVar2.r(objY);
            }
            Function0 function0 = (Function0) objY;
            Object objY2 = aVar2.y();
            if (objY2 == c0042a) {
                objY2 = ee0.a(!zG ? 1.0f : 0.0f);
                aVar2.r(objY2);
            }
            wd0 wd0Var = (wd0) objY2;
            Boolean boolValueOf = Boolean.valueOf(zG);
            boolean zA2 = aVar2.A(wd0Var) | aVar2.b(zG) | aVar2.A(gohVarB) | aVar2.M(function0);
            Object objY3 = aVar2.y();
            if (zA2 || objY3 == c0042a) {
                t3a0 t3a0Var = new t3a0(wd0Var, zG, gohVarB, function0, null);
                aVar2.r(t3a0Var);
                objY3 = t3a0Var;
            }
            xvf.e(aVar2, boolValueOf, (Function2) objY3);
            aj0<T, V> aj0Var = wd0Var.c;
            goh gohVarB2 = a6w.b(z5w.b, aVar2);
            Object objY4 = aVar2.y();
            if (objY4 == c0042a) {
                objY4 = ee0.a(zG ? 0.8f : 1.0f);
                aVar2.r(objY4);
            }
            wd0 wd0Var2 = (wd0) objY4;
            Boolean boolValueOf2 = Boolean.valueOf(zG);
            boolean zA3 = aVar2.A(wd0Var2) | aVar2.b(zG) | aVar2.A(gohVarB2);
            Object objY5 = aVar2.y();
            if (zA3 || objY5 == c0042a) {
                objY5 = new u3a0(wd0Var2, zG, gohVarB2, null);
                aVar2.r(objY5);
            }
            xvf.e(aVar2, boolValueOf2, (Function2) objY5);
            aj0<T, V> aj0Var2 = wd0Var2.c;
            d dVarB = androidx.compose.ui.graphics.a.b(d.a.b, ((Number) ((x5a0) aj0Var2.b).getValue()).floatValue(), ((Number) ((x5a0) aj0Var2.b).getValue()).floatValue(), ((Number) ((x5a0) aj0Var.b).getValue()).floatValue(), 0.0f, null, 131064);
            boolean zB = aVar2.b(zG) | aVar2.M(j3a0Var2);
            final String str = this.d;
            boolean zM2 = zB | aVar2.M(str);
            Object objY6 = aVar2.y();
            if (zM2 || objY6 == c0042a) {
                objY6 = new Function1() { // from class: o3a0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        pb80 pb80Var = (pb80) obj;
                        if (zG) {
                            lb80.d(pb80Var, 0);
                        }
                        final j3a0 j3a0Var3 = j3a0Var2;
                        Function0 function1 = new Function0() { // from class: p3a0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                j3a0Var3.dismiss();
                                return Boolean.TRUE;
                            }
                        };
                        ohp<Object>[] ohpVarArr = lb80.a;
                        pb80Var.b(ra80.u, new c6(null, function1));
                        lb80.e(pb80Var, str);
                        return Unit.a;
                    }
                };
                aVar2.r(objY6);
            }
            d dVarB2 = xa80.b(dVarB, false, (Function1) objY6);
            aiv aivVarC = g75.c(ht.a.a, false);
            int I = aVar2.I();
            ne00 ne00VarO = aVar2.o();
            d dVarC = c.c(aVar2, dVarB2);
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
            hlh0.a(aVar2, dVarC, yka.a.d);
            ps.a(iIntValue & 14, aVar2, function3);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
