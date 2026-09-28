package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class ymi0 {
    public static final void a(final iki0 iki0Var, final Function1 function1, final Function1 function2, final Function0 function0, final Function0 function3, final Function0 function4, final Function1 function5, final Function1 function6, final d dVar, a aVar, final int i) {
        b bVar;
        iki0Var.getClass();
        function1.getClass();
        function2.getClass();
        function0.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        b bVarI = aVar.i(1047673950);
        int i2 = i | (bVarI.M(iki0Var) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function4) ? 131072 : 65536) | (bVarI.A(function5) ? 1048576 : 524288) | (bVarI.A(function6) ? 8388608 : 4194304);
        if (bVarI.q(i2 & 1, (38347923 & i2) != 38347922)) {
            final zzr zzrVarA = e0s.a(0, 3, bVarI);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = xvf.i(e.a, bVarI);
                bVarI.r(objY);
            }
            final v5b v5bVar = (v5b) objY;
            final boolean z = !iki0Var.a.isEmpty();
            bVar = bVarI;
            l0u.a(null, true, pp8.b(302700117, new Function2() { // from class: umi0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    boolean z2;
                    d.a aVar2;
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarE = j.e(dVar, 1.0f);
                        Object objY2 = aVar3.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (objY2 == c0042a) {
                            objY2 = new qoo(1);
                            aVar3.r(objY2);
                        }
                        d dVarB = xa80.b(dVarE, false, (Function1) objY2);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar3.m());
                        ne00 ne00VarO = aVar3.o();
                        d dVarC = c.c(aVar3, dVarB);
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
                        hlh0.a(aVar3, aivVarC, yka.a.f);
                        hlh0.a(aVar3, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                        }
                        hlh0.a(aVar3, dVarC, yka.a.d);
                        d.a aVar5 = d.a.b;
                        boolean z3 = z;
                        final zzr zzrVar = zzrVarA;
                        if (z3) {
                            aVar3.N(-827586482);
                            d dVarE2 = j.e(aVar5, 1.0f);
                            iki0 iki0Var2 = iki0Var;
                            z2 = z3;
                            aVar2 = aVar5;
                            jni0.a(dVarE2, iki0Var2.a, iki0Var2.b, iki0Var2.d, iki0Var2.e, function1, function2, function0, function3, function5, function6, zzrVar, aVar3, 6);
                            aVar3.H();
                        } else {
                            z2 = z3;
                            aVar2 = aVar5;
                            aVar3.N(-826718637);
                            tmi0.a(6, aVar3, j.e(aVar2, 1.0f), function4);
                            aVar3.H();
                        }
                        if (z2) {
                            aVar3.N(-826441683);
                            d dVarH = g3w.h(h.j(androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.i), 0.0f, 0.0f, 16.0f, 16.0f, 3), "mission_scroll_to_top_button");
                            v0u.b bVar2 = v0u.b.d;
                            final v5b v5bVar2 = v5bVar;
                            boolean zA = aVar3.A(v5bVar2) | aVar3.M(zzrVar);
                            Object objY3 = aVar3.y();
                            if (zA || objY3 == c0042a) {
                                objY3 = new Function0() { // from class: wmi0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        ej5.c(v5bVar2, null, null, new xmi0(zzrVar, null), 3);
                                        return Unit.a;
                                    }
                                };
                                aVar3.r(objY3);
                            }
                            hvv.a(dVarH, bVar2, (Function0) objY3, aVar3, 48, 0);
                            aVar3.H();
                        } else {
                            aVar3.N(-825913133);
                            aVar3.H();
                        }
                        aVar3.s();
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 432, 1);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, function2, function0, function3, function4, function5, function6, dVar, i) { // from class: vmi0
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Function1 v;
                public final /* synthetic */ d w;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(100663297);
                    ymi0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
