package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class ize0 {
    public static final void a(Function0<Unit> function0, Function0<Unit> function1, a aVar, final int i) {
        int i2;
        final Function0<Unit> function2;
        final Function0<Unit> function3;
        b bVarI = aVar.i(118826084);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarI = j.i(j.g(aVar2, 1.0f), 46.0f);
            d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarI);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            c6n.b(function0, g.d(aVar2, -20.0f, 0.0f, 2), false, null, iw9.a, bVarI, (i3 & 14) | 196656, 28);
            mw90.a(com.sportygames.newcms.c.c(vue0.X0.r, new String[0], bVarI), "title", j.i(j.w(aVar2, 100.0f), 33.0f), null, null, null, null, bVarI, 432, 2040);
            function3 = function1;
            function2 = function0;
            c6n.b(function3, g.d(aVar2, 4.0f, 0.0f, 2), false, null, iw9.b, bVarI, ((i3 >> 3) & 14) | 196656, 28);
            bVarI.X(true);
        } else {
            function2 = function0;
            function3 = function1;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: fze0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    ize0.a(function2, function3, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, final float f, final nve0 nve0Var, final dse0 dse0Var, final Function1<? super qve0, Unit> function1, a aVar, final int i) {
        b bVarI = aVar.i(-1775589840);
        int i2 = i | (bVarI.c(f) ? 32 : 16) | (bVarI.M(nve0Var) ? 256 : 128) | (bVarI.M(dse0Var) ? 2048 : 1024) | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            q75.a(dVar, null, false, pp8.b(762646426, new gaj() { // from class: cze0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    r75 r75Var = (r75) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fE = r75Var.e();
                        float f2 = f;
                        float fMin = Math.min((fE - f2) - 274.0f, r75Var.d());
                        d dVar2 = dVar;
                        d dVarE = j.e(dVar2, 1.0f);
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                        int iHashCode = Long.hashCode(aVar2.m());
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
                        hlh0.a(aVar2, i78VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        d.a aVar4 = d.a.b;
                        d dVarI = j.i(j.g(aVar4, 1.0f), fMin);
                        dse0 dse0Var2 = dse0Var;
                        Function1 function2 = function1;
                        ri0.b(dVarI, dse0Var2, function2, aVar2, 0);
                        mve0.a(zqu.a(1.0f, j.g(dVar2, 1.0f), true), nve0Var, function2, aVar2, 0);
                        g75.a(androidx.compose.foundation.a.b(j.i(j.g(aVar4, 1.0f), f2), r58.d(4280954684L), zk40.a), aVar2, 0);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3078, 6);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f, nve0Var, dse0Var, function1, i) { // from class: dze0
                public final /* synthetic */ float b;
                public final /* synthetic */ nve0 c;
                public final /* synthetic */ dse0 d;
                public final /* synthetic */ Function1 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    ize0.b(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final gxe0.a aVar, final Function1<? super qve0, Unit> function1, final Function1<? super Throwable, Unit> function2, a aVar2, final int i) {
        b bVar;
        lse0 lse0Var = aVar.c;
        function1.getClass();
        function2.getClass();
        b bVarI = aVar2.i(1007883813);
        int i2 = 2;
        int i3 = (bVarI.M(aVar) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
            final float fD = r8j0.c(q8j0.a.a(bVarI).f, bVarI).d();
            kwe0 kwe0Var = aVar.f;
            c0f0 c0f0Var = aVar.b;
            if (Intrinsics.g(lse0Var, lse0.b.a)) {
                bVarI.N(-2086255479);
                bVarI.X(false);
            } else {
                if (!(lse0Var instanceof lse0.a)) {
                    throw igf0.a(bVarI, -2086257229, false);
                }
                bVarI.N(-249370665);
                com.sportygames.newcms.c.b(((lse0.a) lse0Var).a, bVarI, 0);
                bVarI.X(false);
            }
            boolean zG = Intrinsics.g(c0f0Var, c0f0.d.a);
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zG) {
                bVarI.N(-2086249495);
                bVarI.X(false);
            } else if (Intrinsics.g(c0f0Var, c0f0.a.a)) {
                bVarI.N(-249172885);
                boolean z = (i3 & 112) == 32;
                Object objY = bVarI.y();
                if (z || objY == c0042a) {
                    objY = new t8b(function1, 1);
                    bVarI.r(objY);
                }
                tgp.a((Function0) objY, bVarI, 0);
                bVarI.X(false);
            } else if (c0f0Var instanceof c0f0.c) {
                bVarI.N(-248973958);
                bVarI.N(-2086233862);
                String strC = com.sportygames.newcms.c.c(((c0f0.c) c0f0Var).a ? vue0.X0.v : vue0.X0.w, new String[0], bVarI);
                bVarI.X(false);
                boolean z2 = (i3 & 112) == 32;
                Object objY2 = bVarI.y();
                if (z2 || objY2 == c0042a) {
                    objY2 = new Function0() { // from class: gze0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(new qve0.y(c0f0.d.a));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                vwe0.d(0, bVarI, strC, (Function0) objY2);
                bVarI.X(false);
            } else if (c0f0Var instanceof c0f0.e) {
                bVarI.N(-248550901);
                c0f0.e eVar = (c0f0.e) c0f0Var;
                boolean z3 = (i3 & 112) == 32;
                Object objY3 = bVarI.y();
                if (z3 || objY3 == c0042a) {
                    objY3 = new Function1() { // from class: hze0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            c0f0 c0f0Var2 = (c0f0) obj;
                            c0f0Var2.getClass();
                            function1.invoke(new qve0.y(c0f0Var2));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                }
                b0f0.g(eVar, (Function1) objY3, bVarI, 0);
                bVarI.X(false);
            } else {
                if (!Intrinsics.g(c0f0Var, c0f0.b.a)) {
                    throw igf0.a(bVarI, -2086250536, false);
                }
                bVarI.N(-248359817);
                boolean z4 = (i3 & 112) == 32;
                Object objY4 = bVarI.y();
                if (z4 || objY4 == c0042a) {
                    objY4 = new r32(function1, i2);
                    bVarI.r(objY4);
                }
                m4l.a((i3 >> 6) & 14, bVarI, (Function0) objY4, function2);
                bVarI.X(false);
            }
            if (Intrinsics.g(kwe0Var, kwe0.a.a)) {
                bVarI.N(-2086213975);
                bVarI.X(false);
            } else {
                if (!(kwe0Var instanceof kwe0.b)) {
                    throw igf0.a(bVarI, -2086215808, false);
                }
                bVarI.N(-2086212342);
                jwe0.a((kwe0.b) kwe0Var, function1, bVarI, i3 & 112);
                bVarI.X(false);
            }
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = new ow60(1);
                bVarI.r(objY5);
            }
            hy60.a(xa80.b(d.a.b, false, (Function1) objY5), pp8.b(-375818007, new Function2() { // from class: xye0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarI = j.i(d.a.b, fD + 46.0f + 20.0f);
                        float f = d1g0.a;
                        vp0.c(pp8.b(-1422927707, new i1u(aVar, function1), aVar3), dVarI, null, null, 0.0f, null, d1g0.d(r58.d(4279967269L), j58.f, aVar3, 3078, 22), aVar3, 6, 188);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), null, null, null, 0, 0L, 0L, null, pp8.b(-2089687500, new gaj() { // from class: yye0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final tmz tmzVar = (tmz) obj;
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    tmzVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar3.M(tmzVar) ? 4 : 2;
                    }
                    if (aVar3.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        jfa jfaVar = jfa.a;
                        d dVarB = androidx.compose.foundation.a.b(h.j(d.a.b, 0.0f, tmzVar.d(), 0.0f, 0.0f, 13), r58.d(4279967269L), zk40.a);
                        final gxe0.a aVar4 = aVar;
                        final Function1 function3 = function1;
                        jfaVar.b(dVarB, pp8.b(-260619268, new Function2() { // from class: aze0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                a aVar5 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    d dVarE = j.e(d.a.b, 1.0f);
                                    float fA = tmzVar.a();
                                    gxe0.a aVar6 = aVar4;
                                    ize0.b(dVarE, fA, aVar6.a, aVar6.d, function3, aVar5, 6);
                                } else {
                                    aVar5.G();
                                }
                                return Unit.a;
                            }
                        }, aVar3), aVar3, 48);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 805306416, 508);
            bVar = bVarI;
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, function2, i) { // from class: zye0
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ize0.c(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final jv1 jv1Var, final Function0<Unit> function0, final Function0<Unit> function1, a aVar, final int i) {
        b bVarI = aVar.i(-2069055314);
        int i2 = (bVarI.M(jv1Var) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
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
            a(function0, function1, bVarI, (i2 >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
            eoh0.b(j.i(aVar2, 20.0f), jv1Var, bVarI, ((i2 << 3) & 112) | 6);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, i) { // from class: eze0
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ize0.d(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
