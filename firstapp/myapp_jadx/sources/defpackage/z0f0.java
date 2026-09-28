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

/* JADX INFO: loaded from: classes7.dex */
public final class z0f0 {
    public static final void a(final m0f0 m0f0Var, final Function1 function1, final Function0 function0, final Function1 function2, a aVar, final int i) {
        m0f0Var.getClass();
        function0.getClass();
        function2.getClass();
        b bVarI = aVar.i(1878789894);
        int i2 = (bVarI.M(m0f0Var) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            iye.a(6, pp8.b(704431157, new Function2() { // from class: r0f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i3 = 1;
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final m0f0 m0f0Var2 = m0f0Var;
                        ove0 ove0Var = m0f0Var2.b;
                        boolean zG = Intrinsics.g(ove0Var, ove0.c.a);
                        final Function1 function3 = function1;
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zG) {
                            aVar2.N(-1646488487);
                            aVar2.H();
                        } else if (ove0Var instanceof ove0.a) {
                            aVar2.N(498525031);
                            ove0.a aVar3 = (ove0.a) ove0Var;
                            String str = aVar3.a;
                            String str2 = aVar3.b;
                            String str3 = aVar3.c;
                            boolean zM = aVar2.M(function3) | aVar2.M(m0f0Var2);
                            Object objY = aVar2.y();
                            if (zM || objY == c0042a) {
                                objY = new Function0() { // from class: v0f0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function3.invoke(((ove0.a) m0f0Var2.b).d);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY);
                            }
                            Function0 function4 = (Function0) objY;
                            boolean zM2 = aVar2.M(function3) | aVar2.M(m0f0Var2);
                            Object objY2 = aVar2.y();
                            if (zM2 || objY2 == c0042a) {
                                objY2 = new qqf(2, function3, m0f0Var2);
                                aVar2.r(objY2);
                            }
                            j45.a(str, str2, str3, function4, (Function0) objY2, aVar2, 0);
                            aVar2.H();
                        } else if (Intrinsics.g(ove0Var, ove0.b.a)) {
                            aVar2.N(498918297);
                            boolean zM3 = aVar2.M(function3);
                            Object objY3 = aVar2.y();
                            if (zM3 || objY3 == c0042a) {
                                objY3 = new ytp(function3, 1);
                                aVar2.r(objY3);
                            }
                            Function0 function5 = (Function0) objY3;
                            boolean zM4 = aVar2.M(function3);
                            Object objY4 = aVar2.y();
                            if (zM4 || objY4 == c0042a) {
                                objY4 = new Function0() { // from class: w0f0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function3.invoke(qve0.l.a);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY4);
                            }
                            rxe0.d(function5, (Function0) objY4, aVar2, 0);
                            aVar2.H();
                        } else if (Intrinsics.g(ove0Var, ove0.d.a)) {
                            aVar2.N(499169304);
                            boolean zM5 = aVar2.M(function3);
                            Object objY5 = aVar2.y();
                            if (zM5 || objY5 == c0042a) {
                                objY5 = new vqf(function3, 1);
                                aVar2.r(objY5);
                            }
                            gye0.d((Function0) objY5, aVar2, 0);
                            aVar2.H();
                        } else if (ove0Var instanceof ove0.f) {
                            aVar2.N(499311811);
                            ove0.f fVar = (ove0.f) ove0Var;
                            String str4 = fVar.a;
                            String str5 = fVar.b;
                            boolean zM6 = aVar2.M(function3) | aVar2.M(m0f0Var2);
                            Object objY6 = aVar2.y();
                            if (zM6 || objY6 == c0042a) {
                                objY6 = new Function0() { // from class: x0f0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function3.invoke(((ove0.f) m0f0Var2.b).c);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY6);
                            }
                            ot90.c(str4, str5, (Function0) objY6, aVar2, 0);
                            aVar2.H();
                        } else {
                            if (!(ove0Var instanceof ove0.e)) {
                                throw rg.a(-1646488832, aVar2);
                            }
                            aVar2.N(499637404);
                            ove0.e eVar = (ove0.e) ove0Var;
                            String str6 = eVar.a;
                            iwg iwgVar = eVar.b;
                            boolean z = eVar.c;
                            final Function0 function6 = function0;
                            if (z) {
                                aVar2.N(-1646447212);
                                vue0 vue0Var = vue0.X0;
                                boolean zM7 = aVar2.M(function3);
                                Object objY7 = aVar2.y();
                                if (zM7 || objY7 == c0042a) {
                                    objY7 = new w9b(function3, i3);
                                    aVar2.r(objY7);
                                }
                                hwg.a(iwgVar, str6, vue0Var, function6, (Function0) objY7, aVar2, 384);
                                aVar2.H();
                            } else {
                                aVar2.N(-1646437892);
                                boolean zM8 = aVar2.M(function6);
                                Object objY8 = aVar2.y();
                                if (zM8 || objY8 == c0042a) {
                                    objY8 = new Function0() { // from class: y0f0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function6.invoke();
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY8);
                                }
                                use useVar = xvf.a;
                                aVar2.t((Function0) objY8);
                                aVar2.H();
                            }
                            aVar2.H();
                        }
                        d dVarB = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), j58.b, zk40.a);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarB);
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
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        dtg0 dtg0VarF = vtg0.f(m0f0Var2.a, "WDScreen", aVar2, 48, 0);
                        gzg0 gzg0VarE = yi0.e(r.d.DEFAULT_DRAG_ANIMATION_DURATION, 0, null, 6);
                        Object objY9 = aVar2.y();
                        if (objY9 == c0042a) {
                            objY9 = new a5u(1);
                            aVar2.r(objY9);
                        }
                        final Function1 function7 = function2;
                        q3c.a(dtg0VarF, null, gzg0VarE, (Function1) objY9, pp8.b(-2048874255, new gaj() { // from class: s0f0
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                final gxe0 gxe0Var = (gxe0) obj3;
                                a aVar5 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                gxe0Var.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= aVar5.M(gxe0Var) ? 4 : 2;
                                }
                                if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    final Function1 function8 = function3;
                                    final Function1 function9 = function7;
                                    iye.a(6, pp8.b(1520775200, new Function2() { // from class: t0f0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            a aVar6 = (a) obj6;
                                            int iIntValue3 = ((Integer) obj7).intValue();
                                            if (aVar6.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                gxe0 gxe0Var2 = gxe0Var;
                                                if (gxe0Var2 instanceof gxe0.b) {
                                                    aVar6.N(1176089667);
                                                    zys.d(((gxe0.b) gxe0Var2).a, aVar6, 0);
                                                    aVar6.H();
                                                } else {
                                                    if (!(gxe0Var2 instanceof gxe0.a)) {
                                                        throw rg.a(1176087647, aVar6);
                                                    }
                                                    aVar6.N(1176092647);
                                                    ize0.c((gxe0.a) gxe0Var2, function8, function9, aVar6, 0);
                                                    aVar6.H();
                                                }
                                            } else {
                                                aVar6.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar5), aVar5);
                                } else {
                                    aVar5.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 28032, 1);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, function0, function2, i) { // from class: u0f0
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    z0f0.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
