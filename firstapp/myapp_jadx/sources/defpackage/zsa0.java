package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
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
public final class zsa0 {
    public static final void a(final d dVar, final bta0 bta0Var, final Function0 function0, final Function1 function1, final Function2 function2, a aVar, final int i) {
        int i2;
        Function0 function3;
        b bVar;
        bta0Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        b bVarI = aVar.i(519658388);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(bta0Var) : bVarI.A(bta0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function3 = function0;
            i2 |= bVarI.A(function3) ? 256 : 128;
        } else {
            function3 = function0;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            bVar = bVarI;
            z80.a(bta0Var.a, function3, dVar, 0L, null, null, j060.c(((zib0) bVarI.O(ajb0.a)).a), 0L, 0.0f, pp8.b(-1702567537, new gaj() { // from class: vsa0
                /* JADX WARN: Code duplicated, block: B:34:0x00d2  */
                /* JADX WARN: Code duplicated, block: B:37:0x00de  */
                /* JADX WARN: Code duplicated, block: B:39:0x00e2  */
                /* JADX WARN: Code duplicated, block: B:43:0x0105  */
                /* JADX WARN: Code duplicated, block: B:46:0x0131  */
                /* JADX WARN: Code duplicated, block: B:48:0x013a  */
                /* JADX WARN: Code duplicated, block: B:49:0x013e  */
                /* JADX WARN: Code duplicated, block: B:54:0x015b  */
                /* JADX WARN: Code duplicated, block: B:57:0x016b  */
                /* JADX WARN: Code duplicated, block: B:58:0x017f  */
                /* JADX WARN: Code duplicated, block: B:62:0x0200  */
                /* JADX WARN: Code duplicated, block: B:65:0x020e  */
                /* JADX WARN: Code duplicated, block: B:68:0x0217  */
                /* JADX WARN: Code duplicated, block: B:69:0x021a  */
                /* JADX WARN: Code duplicated, block: B:73:0x0244  */
                /* JADX WARN: Code duplicated, block: B:88:0x026a A[SYNTHETIC] */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                    Throwable th;
                    yka.a.c cVar;
                    float f;
                    final Function1 function4;
                    boolean zM;
                    Object objY;
                    int i3;
                    a.C0041a.C0042a c0042a;
                    aiv aivVarC;
                    int iHashCode;
                    ne00 ne00VarO;
                    d dVarC;
                    long j;
                    String str;
                    a.C0041a.C0042a c0042a2;
                    float f2;
                    final Function2 function5;
                    final String str2;
                    boolean zM2;
                    Object objY2;
                    vsa0 vsa0Var = this;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    boolean z = true;
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        bta0 bta0Var2 = bta0Var;
                        int iJ = kotlin.collections.b.j(bta0Var2.c);
                        int i4 = 0;
                        for (usa0 usa0Var : bta0Var2.c) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                kotlin.collections.b.q();
                                throw null;
                            }
                            usa0 usa0Var2 = usa0Var;
                            final String str3 = usa0Var2.a;
                            d dVarJ = h.j(d.a.b, 0.0f, 0.0f, 0.0f, i4 == iJ ? 0.0f : 4.0f, 7);
                            d160 d160VarA = b160.a(new kw0.i(2.0f, z, new hw0()), ht.a.j, aVar2, 6);
                            int iHashCode2 = Long.hashCode(aVar2.m());
                            ne00 ne00VarO2 = aVar2.o();
                            d dVarC2 = c.c(aVar2, dVarJ);
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
                            yka.a.b bVar2 = yka.a.f;
                            hlh0.a(aVar2, d160VarA, bVar2);
                            yka.a.d dVar2 = yka.a.e;
                            hlh0.a(aVar2, ne00VarO2, dVar2);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar2.g()) {
                                th = null;
                            } else {
                                th = null;
                                if (!Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                }
                                cVar = yka.a.d;
                                hlh0.a(aVar2, dVarC2, cVar);
                                if (1.0f <= 0.0d) {
                                    ukn.a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > Float.MAX_VALUE) {
                                    f = Float.MAX_VALUE;
                                } else {
                                    f = 1.0f;
                                }
                                d dVarI = j.i(new LayoutWeightElement(f, true), 34.0f);
                                function4 = function1;
                                zM = aVar2.M(function4) | aVar2.M(str3);
                                objY = aVar2.y();
                                i3 = iJ;
                                c0042a = a.C0041a.a;
                                if (zM || objY == c0042a) {
                                    objY = new Function0() { // from class: xsa0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function4.invoke(str3);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY);
                                }
                                d dVarF = g3w.f(dVarI, true, (Function0) objY);
                                aivVarC = g75.c(ht.a.e, false);
                                iHashCode = Long.hashCode(aVar2.m());
                                ne00VarO = aVar2.o();
                                dVarC = c.c(aVar2, dVarF);
                                if (aVar2.k() != null) {
                                    l2a.b();
                                    throw th;
                                }
                                aVar2.D();
                                if (aVar2.g()) {
                                    aVar2.F(aVar3);
                                } else {
                                    aVar2.p();
                                }
                                hlh0.a(aVar2, aivVarC, bVar2);
                                hlh0.a(aVar2, ne00VarO, dVar2);
                                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                    j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                }
                                hlh0.a(aVar2, dVarC, cVar);
                                String str4 = usa0Var2.b;
                                if (str3.equals(bta0Var2.b)) {
                                    aVar2.N(-1672163425);
                                    j = ((lib0) aVar2.O(oib0.a)).i;
                                    aVar2.H();
                                } else {
                                    aVar2.N(-1672074393);
                                    j = ((lib0) aVar2.O(oib0.a)).b;
                                    aVar2.H();
                                }
                                a aVar4 = aVar2;
                                bta0 bta0Var3 = bta0Var2;
                                str = str3;
                                c0042a2 = c0042a;
                                lkf0.d(str4, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(kjb0.a)).l, aVar4, 0, 0, 131066);
                                aVar2 = aVar4;
                                aVar2.s();
                                aVar2.N(-1836489423);
                                for (final ata0 ata0Var : usa0Var2.c) {
                                    if (1.0f <= 0.0d) {
                                        ukn.a("invalid weight; must be greater than zero");
                                    }
                                    if (1.0f > Float.MAX_VALUE) {
                                        f2 = Float.MAX_VALUE;
                                    } else {
                                        f2 = 1.0f;
                                    }
                                    d dVarI2 = j.i(new LayoutWeightElement(f2, true), 34.0f);
                                    qgy qgyVar = ata0Var.b;
                                    function5 = function2;
                                    str2 = str;
                                    zM2 = aVar2.M(function5) | aVar2.M(str2) | aVar2.A(ata0Var);
                                    objY2 = aVar2.y();
                                    a.C0041a.C0042a c0042a3 = c0042a2;
                                    if (zM2 || objY2 == c0042a3) {
                                        objY2 = new Function0() { // from class: ysa0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                function5.invoke(str2, ata0Var.a);
                                                return Unit.a;
                                            }
                                        };
                                        aVar2.r(objY2);
                                    }
                                    pgy.a(dVarI2, qgyVar, (Function0) objY2, aVar2, 0);
                                    str = str2;
                                    c0042a2 = c0042a3;
                                }
                                aVar2.H();
                                aVar2.s();
                                z = true;
                                vsa0Var = this;
                                i4 = i5;
                                iJ = i3;
                                bta0Var2 = bta0Var3;
                            }
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                            cVar = yka.a.d;
                            hlh0.a(aVar2, dVarC2, cVar);
                            if (1.0f <= 0.0d) {
                                ukn.a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f = Float.MAX_VALUE;
                            } else {
                                f = 1.0f;
                            }
                            d dVarI3 = j.i(new LayoutWeightElement(f, true), 34.0f);
                            function4 = function1;
                            zM = aVar2.M(function4) | aVar2.M(str3);
                            objY = aVar2.y();
                            i3 = iJ;
                            c0042a = a.C0041a.a;
                            if (zM) {
                                objY = new Function0() { // from class: xsa0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function4.invoke(str3);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY);
                            } else {
                                objY = new Function0() { // from class: xsa0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function4.invoke(str3);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY);
                            }
                            d dVarF2 = g3w.f(dVarI3, true, (Function0) objY);
                            aivVarC = g75.c(ht.a.e, false);
                            iHashCode = Long.hashCode(aVar2.m());
                            ne00VarO = aVar2.o();
                            dVarC = c.c(aVar2, dVarF2);
                            if (aVar2.k() != null) {
                                l2a.b();
                                throw th;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar3);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, aivVarC, bVar2);
                            hlh0.a(aVar2, ne00VarO, dVar2);
                            if (aVar2.g()) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                            } else {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                            }
                            hlh0.a(aVar2, dVarC, cVar);
                            String str5 = usa0Var2.b;
                            if (str3.equals(bta0Var2.b)) {
                                aVar2.N(-1672163425);
                                j = ((lib0) aVar2.O(oib0.a)).i;
                                aVar2.H();
                            } else {
                                aVar2.N(-1672074393);
                                j = ((lib0) aVar2.O(oib0.a)).b;
                                aVar2.H();
                            }
                            a aVar5 = aVar2;
                            bta0 bta0Var4 = bta0Var2;
                            str = str3;
                            c0042a2 = c0042a;
                            lkf0.d(str5, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(kjb0.a)).l, aVar5, 0, 0, 131066);
                            aVar2 = aVar5;
                            aVar2.s();
                            aVar2.N(-1836489423);
                            while (r1.hasNext()) {
                                if (1.0f <= 0.0d) {
                                    ukn.a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > Float.MAX_VALUE) {
                                    f2 = Float.MAX_VALUE;
                                } else {
                                    f2 = 1.0f;
                                }
                                d dVarI4 = j.i(new LayoutWeightElement(f2, true), 34.0f);
                                qgy qgyVar2 = ata0Var.b;
                                function5 = function2;
                                str2 = str;
                                zM2 = aVar2.M(function5) | aVar2.M(str2) | aVar2.A(ata0Var);
                                objY2 = aVar2.y();
                                a.C0041a.C0042a c0042a4 = c0042a2;
                                if (zM2) {
                                    objY2 = new Function0() { // from class: ysa0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function5.invoke(str2, ata0Var.a);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY2);
                                } else {
                                    objY2 = new Function0() { // from class: ysa0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function5.invoke(str2, ata0Var.a);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY2);
                                }
                                pgy.a(dVarI4, qgyVar2, (Function0) objY2, aVar2, 0);
                                str = str2;
                                c0042a2 = c0042a4;
                            }
                            aVar2.H();
                            aVar2.s();
                            z = true;
                            vsa0Var = this;
                            i4 = i5;
                            iJ = i3;
                            bta0Var2 = bta0Var4;
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, ((i2 >> 3) & 112) | ((i2 << 6) & 896), 1976);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: wsa0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zsa0.a(dVar, bta0Var, function0, function1, function2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
