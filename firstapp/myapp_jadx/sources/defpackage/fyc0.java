package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class fyc0 {
    /* JADX WARN: Code duplicated, block: B:53:0x0116  */
    /* JADX WARN: Code duplicated, block: B:54:0x0118  */
    /* JADX WARN: Code duplicated, block: B:58:0x0126  */
    public static final void a(final vyc0 vyc0Var, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function2, final Function2<? super String, ? super String, Unit> function3, final Function1<? super String, Unit> function4, a aVar, final int i) {
        b bVar;
        a.C0041a.C0042a c0042a;
        boolean z;
        boolean zM;
        Object objY;
        vyc0Var.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        b bVarI = aVar.i(-1793971655);
        int i2 = i | (bVarI.M(vyc0Var) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128) | (bVarI.A(function3) ? 2048 : 1024) | (bVarI.A(function4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            final String str = vyc0Var.a;
            xxc0 xxc0Var = vyc0Var.b;
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            Object objY2 = bVarI.y();
            a.C0041a.C0042a c0042a2 = a.C0041a.a;
            if (objY2 == c0042a2) {
                objY2 = new pe90(1);
                bVarI.r(objY2);
            }
            d dVarH = g3w.h(xa80.b(dVarG, false, (Function1) objY2), "market_block");
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            boolean zM2 = ((i2 & 112) == 32) | bVarI.M(str);
            Object objY3 = bVarI.y();
            if (zM2) {
                c0042a = c0042a2;
            } else {
                c0042a = c0042a2;
                if (objY3 == c0042a) {
                }
                Function0 function0 = (Function0) objY3;
                if ((i2 & 896) == 256) {
                    z = true;
                } else {
                    z = false;
                }
                zM = z | bVarI.M(str);
                objY = bVarI.y();
                if (zM || objY == c0042a) {
                    objY = new Function0() { // from class: zxc0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function2.invoke(str);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                wxc0.a(xxc0Var, function0, (Function0) objY, bVarI, 0);
                bVar = bVarI;
                hh0.b(l78.a, xxc0Var.a, null, null, null, null, pp8.b(2000767787, new gaj() { // from class: ayc0
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar4 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((jh0) obj).getClass();
                        int i3 = 1;
                        if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            i78 i78VarA2 = g78.a(kw0.c, ht.a.m, aVar4, 0);
                            int iHashCode2 = Long.hashCode(aVar4.m());
                            ne00 ne00VarO = aVar4.o();
                            d.a aVar5 = d.a.b;
                            d dVarC2 = c.c(aVar4, aVar5);
                            yka.k.getClass();
                            tsr.a aVar6 = yka.a.b;
                            if (aVar4.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar4.D();
                            if (aVar4.g()) {
                                aVar4.F(aVar6);
                            } else {
                                aVar4.p();
                            }
                            hlh0.a(aVar4, i78VarA2, yka.a.f);
                            hlh0.a(aVar4, ne00VarO, yka.a.e);
                            yka.a.C1350a c1350a2 = yka.a.g;
                            if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar4, iHashCode2, c1350a2);
                            }
                            hlh0.a(aVar4, dVarC2, yka.a.d);
                            nxc0 nxc0Var = vyc0Var.c;
                            boolean z2 = nxc0Var instanceof pyc0;
                            final Function2 function5 = function3;
                            final String str2 = str;
                            final Function1 function6 = function4;
                            a.C0041a.C0042a c0042a3 = a.C0041a.a;
                            if (z2) {
                                aVar4.N(96988404);
                                pyc0 pyc0Var = (pyc0) nxc0Var;
                                boolean zM3 = aVar4.M(function5) | aVar4.M(str2);
                                Object objY4 = aVar4.y();
                                if (zM3 || objY4 == c0042a3) {
                                    objY4 = new v5d(i3, function5, str2);
                                    aVar4.r(objY4);
                                }
                                Function1 function7 = (Function1) objY4;
                                boolean zM4 = aVar4.M(function6) | aVar4.M(str2);
                                Object objY5 = aVar4.y();
                                if (zM4 || objY5 == c0042a3) {
                                    objY5 = new Function0() { // from class: cyc0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function6.invoke(str2);
                                            return Unit.a;
                                        }
                                    };
                                    aVar4.r(objY5);
                                }
                                oyc0.b(pyc0Var, function7, (Function0) objY5, aVar4, 0);
                                aVar4.H();
                            } else {
                                if (!(nxc0Var instanceof uyc0)) {
                                    throw rg.a(-135421562, aVar4);
                                }
                                aVar4.N(97537383);
                                uyc0 uyc0Var = (uyc0) nxc0Var;
                                boolean zM5 = aVar4.M(function5) | aVar4.M(str2);
                                Object objY6 = aVar4.y();
                                if (zM5 || objY6 == c0042a3) {
                                    objY6 = new Function1() { // from class: dyc0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj4) {
                                            String str3 = (String) obj4;
                                            str3.getClass();
                                            function5.invoke(str2, str3);
                                            return Unit.a;
                                        }
                                    };
                                    aVar4.r(objY6);
                                }
                                Function1 function8 = (Function1) objY6;
                                boolean zM6 = aVar4.M(function6) | aVar4.M(str2);
                                Object objY7 = aVar4.y();
                                if (zM6 || objY7 == c0042a3) {
                                    objY7 = new Function0() { // from class: eyc0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function6.invoke(str2);
                                            return Unit.a;
                                        }
                                    };
                                    aVar4.r(objY7);
                                }
                                tyc0.b(uyc0Var, function8, (Function0) objY7, aVar4, 0);
                                aVar4.H();
                            }
                            ty0.a(aVar4, j.i(aVar5, 11.0f));
                            aVar4.s();
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVar, 1572870, 30);
                ute.b(j.g(aVar2, 1.0f), ((qhb0) bVar.O(shb0.a)).a, ((lib0) bVar.O(oib0.a)).A, bVar, 6, 0);
                bVar.X(true);
            }
            objY3 = new Function0() { // from class: yxc0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    function1.invoke(str);
                    return Unit.a;
                }
            };
            bVarI.r(objY3);
            Function0 function5 = (Function0) objY3;
            if ((i2 & 896) == 256) {
                z = true;
            } else {
                z = false;
            }
            zM = z | bVarI.M(str);
            objY = bVarI.y();
            if (zM) {
                objY = new Function0() { // from class: zxc0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function2.invoke(str);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            } else {
                objY = new Function0() { // from class: zxc0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function2.invoke(str);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            wxc0.a(xxc0Var, function5, (Function0) objY, bVarI, 0);
            bVar = bVarI;
            hh0.b(l78.a, xxc0Var.a, null, null, null, null, pp8.b(2000767787, new gaj() { // from class: ayc0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((jh0) obj).getClass();
                    int i3 = 1;
                    if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        i78 i78VarA2 = g78.a(kw0.c, ht.a.m, aVar4, 0);
                        int iHashCode2 = Long.hashCode(aVar4.m());
                        ne00 ne00VarO = aVar4.o();
                        d.a aVar5 = d.a.b;
                        d dVarC2 = c.c(aVar4, aVar5);
                        yka.k.getClass();
                        tsr.a aVar6 = yka.a.b;
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar6);
                        } else {
                            aVar4.p();
                        }
                        hlh0.a(aVar4, i78VarA2, yka.a.f);
                        hlh0.a(aVar4, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar4, iHashCode2, c1350a2);
                        }
                        hlh0.a(aVar4, dVarC2, yka.a.d);
                        nxc0 nxc0Var = vyc0Var.c;
                        boolean z2 = nxc0Var instanceof pyc0;
                        final Function2 function6 = function3;
                        final String str2 = str;
                        final Function1 function7 = function4;
                        a.C0041a.C0042a c0042a3 = a.C0041a.a;
                        if (z2) {
                            aVar4.N(96988404);
                            pyc0 pyc0Var = (pyc0) nxc0Var;
                            boolean zM3 = aVar4.M(function6) | aVar4.M(str2);
                            Object objY4 = aVar4.y();
                            if (zM3 || objY4 == c0042a3) {
                                objY4 = new v5d(i3, function6, str2);
                                aVar4.r(objY4);
                            }
                            Function1 function8 = (Function1) objY4;
                            boolean zM4 = aVar4.M(function7) | aVar4.M(str2);
                            Object objY5 = aVar4.y();
                            if (zM4 || objY5 == c0042a3) {
                                objY5 = new Function0() { // from class: cyc0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function7.invoke(str2);
                                        return Unit.a;
                                    }
                                };
                                aVar4.r(objY5);
                            }
                            oyc0.b(pyc0Var, function8, (Function0) objY5, aVar4, 0);
                            aVar4.H();
                        } else {
                            if (!(nxc0Var instanceof uyc0)) {
                                throw rg.a(-135421562, aVar4);
                            }
                            aVar4.N(97537383);
                            uyc0 uyc0Var = (uyc0) nxc0Var;
                            boolean zM5 = aVar4.M(function6) | aVar4.M(str2);
                            Object objY6 = aVar4.y();
                            if (zM5 || objY6 == c0042a3) {
                                objY6 = new Function1() { // from class: dyc0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        String str3 = (String) obj4;
                                        str3.getClass();
                                        function6.invoke(str2, str3);
                                        return Unit.a;
                                    }
                                };
                                aVar4.r(objY6);
                            }
                            Function1 function9 = (Function1) objY6;
                            boolean zM6 = aVar4.M(function7) | aVar4.M(str2);
                            Object objY7 = aVar4.y();
                            if (zM6 || objY7 == c0042a3) {
                                objY7 = new Function0() { // from class: eyc0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function7.invoke(str2);
                                        return Unit.a;
                                    }
                                };
                                aVar4.r(objY7);
                            }
                            tyc0.b(uyc0Var, function9, (Function0) objY7, aVar4, 0);
                            aVar4.H();
                        }
                        ty0.a(aVar4, j.i(aVar5, 11.0f));
                        aVar4.s();
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 1572870, 30);
            ute.b(j.g(aVar2, 1.0f), ((qhb0) bVar.O(shb0.a)).a, ((lib0) bVar.O(oib0.a)).A, bVar, 6, 0);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, function2, function3, function4, i) { // from class: byc0
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function2 d;
                public final /* synthetic */ Function1 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    fyc0.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
