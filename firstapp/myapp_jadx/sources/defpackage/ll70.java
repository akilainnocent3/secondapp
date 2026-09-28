package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.appsflyer.internal.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ll70 {
    public static final void a(final String str, final boolean z, final String str2, final ai70 ai70Var, final qcn qcnVar, final Function1 function1, final Function2 function2, final Function2 function3, final Function2 function4, final Function0 function0, final gaj gajVar, final jaj jajVar, final gaj gajVar2, final Function0 function5, final Function0 function6, final Function1 function7, a aVar, final int i) {
        str.getClass();
        qcnVar.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function0.getClass();
        gajVar.getClass();
        jajVar.getClass();
        gajVar2.getClass();
        function5.getClass();
        function6.getClass();
        function7.getClass();
        b bVarI = aVar.i(3805786);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.b(z) ? 32 : 16) | (bVarI.M(str2) ? 256 : 128) | (bVarI.M(ai70Var) ? 2048 : 1024) | (bVarI.A(qcnVar) ? 16384 : 8192) | (bVarI.A(function1) ? 131072 : 65536) | (bVarI.A(function2) ? 1048576 : 524288) | (bVarI.A(function3) ? 8388608 : 4194304) | (bVarI.A(function4) ? 67108864 : 33554432) | (bVarI.A(function0) ? 536870912 : 268435456);
        if (bVarI.q(i2 & 1, ((i2 & 306783379) == 306783378 && (((((((bVarI.A(gajVar) ? (char) 4 : (char) 2) | (bVarI.A(jajVar) ? ' ' : (char) 16)) | (bVarI.A(gajVar2) ? 256 : 128)) | (bVarI.A(function5) ? 2048 : 1024)) | (bVarI.A(function6) ? (char) 16384 : (char) 8192)) | (bVarI.A(function7) ? (char) 0 : (char) 0)) & 74899) == 74898) ? false : true)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = k.a(0);
                bVarI.r(objY);
            }
            final osw oswVar = (osw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new Function1() { // from class: cl70
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i3 = (int) (((jxo) obj).a >> 32);
                        osw oswVar2 = oswVar;
                        if (oswVar2.D() == 0 || oswVar2.D() < i3) {
                            oswVar2.k(i3);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            final Function1 function8 = (Function1) objY2;
            d dVarB = androidx.compose.foundation.a.b(d.a.b, ((lib0) bVarI.O(oib0.a)).n0, zk40.a);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            hh0.b(l78.a, z, null, null, null, null, pp8.b(1097064012, new gaj() { // from class: dl70
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((jh0) obj).getClass();
                    int i3 = 0;
                    if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        i78 i78VarA2 = g78.a(kw0.c, ht.a.m, aVar3, 0);
                        int iHashCode2 = Long.hashCode(aVar3.m());
                        ne00 ne00VarO = aVar3.o();
                        d dVarC2 = c.c(aVar3, d.a.b);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar3.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar3.F(aVar4);
                        } else {
                            aVar3.p();
                        }
                        hlh0.a(aVar3, i78VarA2, yka.a.f);
                        hlh0.a(aVar3, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar3, iHashCode2, c1350a2);
                        }
                        hlh0.a(aVar3, dVarC2, yka.a.d);
                        float f = mla.f(oswVar.D(), aVar3);
                        Function1 function9 = function1;
                        boolean zM = aVar3.M(function9);
                        final String str3 = str2;
                        boolean zM2 = zM | aVar3.M(str3);
                        Object objY3 = aVar3.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (zM2 || objY3 == c0042a2) {
                            objY3 = new fl70(i3, function9, str3);
                            aVar3.r(objY3);
                        }
                        Function0 function10 = (Function0) objY3;
                        final Function2 function11 = function2;
                        boolean zM3 = aVar3.M(function11);
                        final String str4 = str;
                        boolean zM4 = zM3 | aVar3.M(str4) | aVar3.M(str3);
                        Object objY4 = aVar3.y();
                        if (zM4 || objY4 == c0042a2) {
                            objY4 = new Function0() { // from class: gl70
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function11.invoke(str4, str3);
                                    return Unit.a;
                                }
                            };
                            aVar3.r(objY4);
                        }
                        zh70.a(ai70Var, f, function10, (Function0) objY4, aVar3, 0);
                        aVar3.N(-699016187);
                        for (n470 n470Var : qcnVar) {
                            final Function2 function12 = function3;
                            boolean zM5 = aVar3.M(function12) | aVar3.M(str3);
                            Object objY5 = aVar3.y();
                            if (zM5 || objY5 == c0042a2) {
                                objY5 = new Function1() { // from class: hl70
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        String str5 = (String) obj4;
                                        str5.getClass();
                                        function12.invoke(str5, str3);
                                        return Unit.a;
                                    }
                                };
                                aVar3.r(objY5);
                            }
                            Function1 function13 = (Function1) objY5;
                            final Function2 function14 = function4;
                            boolean zM6 = aVar3.M(function14) | aVar3.M(str3);
                            Object objY6 = aVar3.y();
                            if (zM6 || objY6 == c0042a2) {
                                objY6 = new Function1() { // from class: il70
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        String str5 = (String) obj4;
                                        str5.getClass();
                                        function14.invoke(str5, str3);
                                        return Unit.a;
                                    }
                                };
                                aVar3.r(objY6);
                            }
                            Function1 function15 = (Function1) objY6;
                            final gaj gajVar3 = gajVar;
                            boolean zM7 = aVar3.M(gajVar3) | aVar3.M(str3);
                            Object objY7 = aVar3.y();
                            if (zM7 || objY7 == c0042a2) {
                                objY7 = new Function2() { // from class: jl70
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj4, Object obj5) {
                                        String str5 = (String) obj4;
                                        String str6 = (String) obj5;
                                        str5.getClass();
                                        str6.getClass();
                                        gajVar3.invoke(str5, str3, str6);
                                        return Unit.a;
                                    }
                                };
                                aVar3.r(objY7);
                            }
                            Function2 function16 = (Function2) objY7;
                            final jaj jajVar2 = jajVar;
                            boolean zM8 = aVar3.M(jajVar2) | aVar3.M(str4) | aVar3.M(str3);
                            Object objY8 = aVar3.y();
                            if (zM8 || objY8 == c0042a2) {
                                objY8 = new gaj() { // from class: kl70
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                        String str5 = (String) obj4;
                                        String str6 = (String) obj5;
                                        String str7 = (String) obj6;
                                        m.a(str5, str6, str7);
                                        jajVar2.l(str4, str5, str3, str6, str7);
                                        return Unit.a;
                                    }
                                };
                                aVar3.r(objY8);
                            }
                            gaj gajVar4 = (gaj) objY8;
                            gaj gajVar5 = gajVar2;
                            boolean zM9 = aVar3.M(gajVar5) | aVar3.M(str4);
                            Object objY9 = aVar3.y();
                            if (zM9 || objY9 == c0042a2) {
                                objY9 = new lxk(1, gajVar5, str4);
                                aVar3.r(objY9);
                            }
                            m470.a(n470Var, function8, function13, function15, function0, function16, gajVar4, (Function2) objY9, function5, function6, function7, aVar3, 56);
                            str4 = str4;
                            str3 = str3;
                            c0042a2 = c0042a2;
                        }
                        aVar3.H();
                        aVar3.s();
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 1572870 | (i2 & 112), 30);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, z, str2, ai70Var, qcnVar, function1, function2, function3, function4, function0, gajVar, jajVar, gajVar2, function5, function6, function7, i) { // from class: el70
                public final /* synthetic */ jaj A;
                public final /* synthetic */ gaj B;
                public final /* synthetic */ Function0 C;
                public final /* synthetic */ Function0 D;
                public final /* synthetic */ Function1 E;
                public final /* synthetic */ String a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ String c;
                public final /* synthetic */ ai70 d;
                public final /* synthetic */ qcn e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function2 i;
                public final /* synthetic */ Function2 v;
                public final /* synthetic */ Function2 w;
                public final /* synthetic */ Function0 y;
                public final /* synthetic */ gaj z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(32769);
                    ll70.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
