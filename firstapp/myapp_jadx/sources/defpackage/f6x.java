package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class f6x {
    public static final void a(final Function0 function0, final Function0 function1, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(1454518238);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new dxd(1);
                bVarI.r(objY);
            }
            u60.a((Function0) objY, new yle(false, false, false), pp8.b(450698791, new Function2() { // from class: y5x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar3 = d.a.b;
                        d dVarI = h.i(androidx.compose.foundation.a.b(j.g(aVar3, 0.8f), c68.a(R.color.background_general_primary, aVar2), zk40.a), 20.0f, 32.0f, 20.0f, 16.0f);
                        i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarI);
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
                        hlh0.a(aVar2, i78VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        r5x.d(0, aVar2);
                        d dVarJ = h.j(aVar3, 0.0f, 20.0f, 0.0f, 0.0f, 13);
                        lkf0.d(cb40.a(R.string.identity_verification__nin_reminding_pop_up_description, new Object[0], aVar2), dVarJ, c68.a(R.color.text_type1_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), mla.m(21.0f, aVar2), 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar2), aVar2, 48, 0, 127992);
                        r5x.a(h.j(aVar3, 0.0f, 24.0f, 0.0f, 0.0f, 13), true, uxs.ENABLE, function0, function1, aVar2, 438, 0);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 438, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: z5x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    f6x.a(function0, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(Function0 function0, Function0 function1, a aVar, int i) {
        b bVarI = aVar.i(930653159);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            a(function0, function1, bVarI, i2 & WebSocketProtocol.PAYLOAD_SHORT);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new x5x(i, function0, function1);
        }
    }

    public static final void c(final p6x p6xVar, final uxs uxsVar, final Function1<? super ijf0, Unit> function1, final Function0<Unit> function0, final Function0<Unit> function2, final Function0<Unit> function3, final Function0<Unit> function4, a aVar, final int i) {
        int i2;
        Function1<? super ijf0, Unit> function5;
        b bVar;
        b bVar2;
        boolean z;
        p6xVar.getClass();
        uxsVar.getClass();
        function1.getClass();
        function0.getClass();
        function2.getClass();
        b bVarA = v2g.a(function3, function4, aVar, 1473830559);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarA.M(p6xVar) : bVarA.A(p6xVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarA.d(uxsVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function5 = function1;
            i2 |= bVarA.A(function5) ? 256 : 128;
        } else {
            function5 = function1;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarA.A(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarA.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarA.A(function3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarA.A(function4) ? 1048576 : 524288;
        }
        if (bVarA.q(i2 & 1, (599187 & i2) != 599186)) {
            if (p6xVar.e) {
                bVarA.N(-564151517);
                int i3 = (i2 >> 12) & 896;
                z = false;
                nzj.b(null, cb40.a(R.string.common_feedback__something_went_wrong, new Object[0], bVarA), cb40.a(R.string.common_feedback__something_went_wrong_please_try_again, new Object[0], bVarA), null, null, null, null, null, null, null, null, null, function4, null, bVarA, 0, i3, 12281);
                bVar2 = bVarA;
                bVar2.X(false);
            } else {
                bVar2 = bVarA;
                z = false;
                bVar2.N(-563843997);
                bVar2.X(false);
            }
            Object objY = bVar2.y();
            if (objY == a.C0041a.a) {
                objY = new u5x();
                bVar2.r(objY);
            }
            yle yleVar = new yle(z, z, z);
            final Function1<? super ijf0, Unit> function6 = function5;
            bVar = bVar2;
            u60.a((Function0) objY, yleVar, pp8.b(-365354826, new Function2() { // from class: v5x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i4;
                    p4x p4xVar;
                    int i5;
                    int i6;
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        p6x p6xVar2 = p6xVar;
                        boolean zM = aVar2.M(p6xVar2);
                        Object objY2 = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zM || objY2 == c0042a) {
                            objY2 = Boolean.valueOf((p6xVar2.f || (i4 = p6xVar2.h) == 12703 || i4 == 12704 || p6xVar2.c != 100) ? false : true);
                            aVar2.r(objY2);
                        }
                        boolean zBooleanValue = ((Boolean) objY2).booleanValue();
                        boolean zM2 = aVar2.M(p6xVar2);
                        Object objY3 = aVar2.y();
                        if (zM2 || objY3 == c0042a) {
                            int i7 = p6xVar2.c;
                            if (i7 == 110 || (i5 = p6xVar2.h) == 12703 || i5 == 12704 || i5 == 19002) {
                                p4xVar = p4x.c;
                            } else {
                                p4xVar = i7 == 120 ? p4x.b : p4x.a;
                            }
                            objY3 = p4xVar;
                            aVar2.r(objY3);
                        }
                        p4x p4xVar2 = (p4x) objY3;
                        boolean zM3 = aVar2.M(p6xVar2);
                        Object objY4 = aVar2.y();
                        if (zM3 || objY4 == c0042a) {
                            objY4 = Boolean.valueOf(p6xVar2.b());
                            aVar2.r(objY4);
                        }
                        boolean zBooleanValue2 = ((Boolean) objY4).booleanValue();
                        boolean zM4 = aVar2.M(p6xVar2);
                        Object objY5 = aVar2.y();
                        if (zM4 || objY5 == c0042a) {
                            objY5 = Boolean.valueOf((p6xVar2.c != 100 || (i6 = p6xVar2.h) == 12703 || i6 == 12704) ? false : true);
                            aVar2.r(objY5);
                        }
                        boolean zBooleanValue3 = ((Boolean) objY5).booleanValue();
                        d.a aVar3 = d.a.b;
                        d dVarI = h.i(androidx.compose.foundation.a.b(j.g(aVar3, 0.8f), c68.a(R.color.background_general_primary, aVar2), zk40.a), 20.0f, 32.0f, 20.0f, 16.0f);
                        kw0.k kVar = kw0.c;
                        n54.a aVar4 = ht.a.n;
                        i78 i78VarA = g78.a(kVar, aVar4, aVar2, 48);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarI);
                        yka.k.getClass();
                        tsr.a aVar5 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar5);
                        } else {
                            aVar2.p();
                        }
                        yka.a.b bVar3 = yka.a.f;
                        hlh0.a(aVar2, i78VarA, bVar3);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        r5x.d(0, aVar2);
                        if (zBooleanValue3) {
                            aVar2.N(-771421658);
                            r5x.e(0, aVar2);
                            aVar2.H();
                        } else {
                            aVar2.N(-771375530);
                            aVar2.H();
                        }
                        ijf0 ijf0Var = p6xVar2.a;
                        boolean z2 = p6xVar2.f;
                        String str = p6xVar2.i;
                        r5x.i(ijf0Var, zBooleanValue, zBooleanValue2, function6, aVar2, 0);
                        if (str.length() > 0) {
                            aVar2.N(-771123872);
                            r5x.f(str, zBooleanValue2, aVar2, 0);
                            aVar2.H();
                        } else {
                            aVar2.N(-771041226);
                            aVar2.H();
                        }
                        d dVarJ = h.j(aVar3, 0.0f, 24.0f, 0.0f, 0.0f, 13);
                        i78 i78VarA2 = g78.a(kVar, aVar4, aVar2, 48);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarJ);
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar5);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, i78VarA2, bVar3);
                        hlh0.a(aVar2, ne00VarO2, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        boolean z3 = !z2;
                        r5x.c(z3, p4xVar2, uxsVar, function3, function2, aVar2, 0);
                        if (p6xVar2.d) {
                            aVar2.N(-1862272161);
                            r5x.j(0, aVar2, null, function0, z3);
                            aVar2.H();
                        } else {
                            aVar2.N(-1862086688);
                            aVar2.H();
                        }
                        aVar2.s();
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVar2), bVar, 438, 0);
        } else {
            bVar = bVarA;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: w5x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    f6x.c(p6xVar, uxsVar, function1, function0, function2, function3, function4, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final s6x s6xVar, final Function0 function0, final Function0 function1, final Function0 function2, a aVar, final int i) {
        a.C0041a.C0042a c0042a;
        b bVarA = yoh0.a(function0, function1, function2, aVar, -1323854286);
        int i2 = i | (bVarA.A(s6xVar) ? 4 : 2) | (bVarA.A(function0) ? 32 : 16) | (bVarA.A(function1) ? 256 : 128) | (bVarA.A(function2) ? 2048 : 1024);
        if (bVarA.q(i2 & 1, (i2 & 1171) != 1170)) {
            bVarA.A0();
            if ((i & 1) != 0 && !bVarA.h0()) {
                bVarA.G();
            }
            bVarA.Y();
            ytw ytwVarC = wyh.c(s6xVar.w, bVarA, 0, 7);
            ytw ytwVarC2 = wyh.c(s6xVar.y, bVarA, 0, 7);
            Integer numValueOf = Integer.valueOf(((p6x) ytwVarC.getValue()).c);
            int i3 = (i2 & 14) ^ 6;
            int i4 = i2 & 7168;
            boolean zM = bVarA.M(ytwVarC) | ((i3 > 4 && bVarA.A(s6xVar)) || (i2 & 6) == 4) | (i4 == 2048);
            Object objY = bVarA.y();
            a.C0041a.C0042a c0042a2 = a.C0041a.a;
            if (zM || objY == c0042a2) {
                objY = new b6x(s6xVar, ytwVarC, function2, null);
                bVarA.r(objY);
            }
            xvf.e(bVarA, numValueOf, (Function2) objY);
            Boolean boolValueOf = Boolean.valueOf(((p6x) ytwVarC.getValue()).g);
            boolean zM2 = ((i2 & 112) == 32) | bVarA.M(ytwVarC) | (i4 == 2048);
            Object objY2 = bVarA.y();
            if (zM2 || objY2 == c0042a2) {
                objY2 = new c6x(function0, function2, ytwVarC, null);
                bVarA.r(objY2);
            }
            xvf.e(bVarA, boolValueOf, (Function2) objY2);
            if (((Boolean) ((x5a0) s6xVar.e).getValue()).booleanValue() || ((p6x) ytwVarC.getValue()).c == 120 || ((p6x) ytwVarC.getValue()).c == 110) {
                bVarA.N(1742452587);
                p6x p6xVar = (p6x) ytwVarC.getValue();
                uxs uxsVar = (uxs) ytwVarC2.getValue();
                boolean z = (i3 > 4 && bVarA.A(s6xVar)) || (i2 & 6) == 4;
                Object objY3 = bVarA.y();
                if (z || objY3 == c0042a2) {
                    c0042a = c0042a2;
                    d6x d6xVar = new d6x(1, s6xVar, s6x.class, "onNINChange", "onNINChange(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0);
                    bVarA.r(d6xVar);
                    objY3 = d6xVar;
                } else {
                    c0042a = c0042a2;
                }
                chp chpVar = (chp) objY3;
                boolean z2 = (i3 > 4 && bVarA.A(s6xVar)) || (i2 & 6) == 4;
                Object objY4 = bVarA.y();
                if (z2 || objY4 == c0042a) {
                    e6x e6xVar = new e6x(0, s6xVar, s6x.class, "onUnexpectedErrorDismiss", "onUnexpectedErrorDismiss()V", 0);
                    bVarA.r(e6xVar);
                    objY4 = e6xVar;
                }
                chp chpVar2 = (chp) objY4;
                Function1 function3 = (Function1) chpVar;
                boolean z3 = (i3 > 4 && bVarA.A(s6xVar)) || (i2 & 6) == 4;
                Object objY5 = bVarA.y();
                if (z3 || objY5 == c0042a) {
                    objY5 = new jms(s6xVar, 1);
                    bVarA.r(objY5);
                }
                c(p6xVar, uxsVar, function3, function1, function2, (Function0) objY5, (Function0) chpVar2, bVarA, (i2 << 3) & 64512);
                bVarA.X(false);
            } else {
                bVarA.N(1742863120);
                bVarA.X(false);
            }
        } else {
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, function2, i) { // from class: t5x
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    f6x.d(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
