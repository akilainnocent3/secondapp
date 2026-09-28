package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class aui0 {
    public static final void a(final pui0 pui0Var, final Function1<? super bri0, Unit> function1, final Function0<Unit> function0, a aVar, int i) {
        pui0Var.getClass();
        function1.getClass();
        function0.getClass();
        b bVarI = aVar.i(-107911840);
        int i2 = (bVarI.A(pui0Var) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            iye.a(6, pp8.b(-1628559409, new Function2() { // from class: uti0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final pui0 pui0Var2 = pui0Var;
                        ari0 ari0Var = pui0Var2.b;
                        if (Intrinsics.g(ari0Var, ari0.c.a)) {
                            aVar2.N(-462703439);
                            aVar2.H();
                        } else {
                            boolean z = ari0Var instanceof ari0.a;
                            final Function1 function2 = function1;
                            a.C0041a.C0042a c0042a = a.C0041a.a;
                            if (z) {
                                aVar2.N(-462644787);
                                ari0.a aVar3 = (ari0.a) ari0Var;
                                String str = aVar3.a;
                                String str2 = aVar3.b;
                                String str3 = aVar3.c;
                                boolean zM = aVar2.M(function2) | aVar2.A(pui0Var2);
                                Object objY = aVar2.y();
                                if (zM || objY == c0042a) {
                                    objY = new Function0() { // from class: yti0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function2.invoke(((ari0.a) pui0Var2.b).d);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY);
                                }
                                Function0 function3 = (Function0) objY;
                                boolean zM2 = aVar2.M(function2) | aVar2.A(pui0Var2);
                                Object objY2 = aVar2.y();
                                if (zM2 || objY2 == c0042a) {
                                    objY2 = new Function0() { // from class: zti0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function2.invoke(((ari0.a) pui0Var2.b).e);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY2);
                                }
                                j45.a(str, str2, str3, function3, (Function0) objY2, aVar2, 0);
                                aVar2.H();
                            } else if (Intrinsics.g(ari0Var, ari0.b.a)) {
                                aVar2.N(-462251769);
                                boolean zM3 = aVar2.M(function2);
                                Object objY3 = aVar2.y();
                                if (zM3 || objY3 == c0042a) {
                                    objY3 = new n0y(function2, 1);
                                    aVar2.r(objY3);
                                }
                                Function0 function4 = (Function0) objY3;
                                boolean zM4 = aVar2.M(function2);
                                Object objY4 = aVar2.y();
                                if (zM4 || objY4 == c0042a) {
                                    objY4 = new ff60(1, function2);
                                    aVar2.r(objY4);
                                }
                                git.d(function4, (Function0) objY4, aVar2, 0);
                                aVar2.H();
                            } else if (Intrinsics.g(ari0Var, ari0.d.a)) {
                                aVar2.N(-462008512);
                                boolean zM5 = aVar2.M(function2);
                                Object objY5 = aVar2.y();
                                if (zM5 || objY5 == c0042a) {
                                    objY5 = new exe(function2, 1);
                                    aVar2.r(objY5);
                                }
                                zvx.d((Function0) objY5, aVar2, 0);
                                aVar2.H();
                            } else if (ari0Var instanceof ari0.f) {
                                aVar2.N(-461867927);
                                ari0.f fVar = (ari0.f) ari0Var;
                                String str4 = fVar.a;
                                String str5 = fVar.b;
                                boolean zM6 = aVar2.M(function2) | aVar2.A(pui0Var2);
                                Object objY6 = aVar2.y();
                                if (zM6 || objY6 == c0042a) {
                                    objY6 = new fxe(1, pui0Var2, function2);
                                    aVar2.r(objY6);
                                }
                                ot90.c(str4, str5, (Function0) objY6, aVar2, 0);
                                aVar2.H();
                            } else {
                                if (!(ari0Var instanceof ari0.e)) {
                                    throw rg.a(-1677494258, aVar2);
                                }
                                aVar2.N(-461542334);
                                ari0.e eVar = (ari0.e) ari0Var;
                                String str6 = eVar.a;
                                iwg iwgVar = eVar.b;
                                boolean z2 = eVar.c;
                                Function0 function5 = function0;
                                if (z2) {
                                    aVar2.N(-1677453010);
                                    eyi0 eyi0Var = eyi0.v0;
                                    boolean zM7 = aVar2.M(function2);
                                    Object objY7 = aVar2.y();
                                    if (zM7 || objY7 == c0042a) {
                                        objY7 = new qwe(1, function2);
                                        aVar2.r(objY7);
                                    }
                                    hwg.a(iwgVar, str6, eyi0Var, function5, (Function0) objY7, aVar2, 384);
                                    aVar2.H();
                                } else {
                                    aVar2.N(-1677443690);
                                    boolean zM8 = aVar2.M(function5);
                                    Object objY8 = aVar2.y();
                                    if (zM8 || objY8 == c0042a) {
                                        objY8 = new rwe(function5, 2);
                                        aVar2.r(objY8);
                                    }
                                    use useVar = xvf.a;
                                    aVar2.t((Function0) objY8);
                                    aVar2.H();
                                }
                                aVar2.H();
                            }
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI);
            d dVarB = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), j58.b, zk40.a);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            dtg0 dtg0VarF = vtg0.f(pui0Var.a, "WDScreen", bVarI, 48, 0);
            gzg0 gzg0VarE = yi0.e(r.d.DEFAULT_DRAG_ANIMATION_DURATION, 0, null, 6);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new wti0();
                bVarI.r(objY);
            }
            q3c.a(dtg0VarF, null, gzg0VarE, (Function1) objY, pp8.b(-97584502, new gaj() { // from class: xti0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final xri0 xri0Var = (xri0) obj;
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    xri0Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar3.M(xri0Var) ? 4 : 2;
                    }
                    if (aVar3.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        final Function1 function2 = function1;
                        iye.a(6, pp8.b(-2100731589, new Function2() { // from class: vti0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                a aVar4 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    xri0 xri0Var2 = xri0Var;
                                    if (xri0Var2 instanceof xri0.b) {
                                        aVar4.N(-168425058);
                                        zys.d(((xri0.b) xri0Var2).a, aVar4, 0);
                                        aVar4.H();
                                    } else {
                                        if (!(xri0Var2 instanceof xri0.a)) {
                                            throw rg.a(-168427029, aVar4);
                                        }
                                        aVar4.N(-168422273);
                                        jti0.e((xri0.a) xri0Var2, function2, aVar4, 0);
                                        aVar4.H();
                                    }
                                } else {
                                    aVar4.G();
                                }
                                return Unit.a;
                            }
                        }, aVar3), aVar3);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 28032, 1);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new jft(i, 1, function0, pui0Var, function1);
        }
    }
}
