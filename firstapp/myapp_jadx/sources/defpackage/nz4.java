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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class nz4 {
    public static final void a(final gz4 gz4Var, umz umzVar, final Function2 function2, final Function1 function1, final Function1 function3, final Function1 function4, a aVar, final int i) {
        umz umzVar2;
        function2.getClass();
        function1.getClass();
        function3.getClass();
        function4.getClass();
        b bVarI = aVar.i(-1059497831);
        int i2 = i | (bVarI.M(gz4Var) ? 4 : 2) | (bVarI.A(function2) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024) | (bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function4) ? 131072 : 65536);
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            d.a aVar2 = d.a.b;
            umzVar2 = umzVar;
            d dVarH = g3w.h(h.e(j.g(aVar2, 1.0f), umzVar2), "booking_code_info_root");
            i78 i78VarA = g78.a(new kw0.i(8.0f, true, new hw0()), ht.a.m, bVarI, 6);
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
            rg6.a(g3w.h(j.g(aVar2, 1.0f), "booking_code_info_card"), zk40.a, null, gg6.c(62, 2.0f), null, pp8.b(-242246735, new gaj() { // from class: lz4
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d dVarB = androidx.compose.foundation.a.b(j.g(d.a.b, 1.0f), c68.a(R.color.background_type1_primary, aVar4), zk40.a);
                        i78 i78VarA2 = g78.a(kw0.c, ht.a.m, aVar4, 0);
                        int iHashCode2 = Long.hashCode(aVar4.m());
                        ne00 ne00VarO = aVar4.o();
                        d dVarC2 = c.c(aVar4, dVarB);
                        yka.k.getClass();
                        tsr.a aVar5 = yka.a.b;
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar5);
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
                        gz4 gz4Var2 = gz4Var;
                        wx4.a(gz4Var2, aVar4, 0);
                        zz4.a(gz4Var2, function2, aVar4, 0);
                        nx4.a(gz4Var2, function1, function3, function4, aVar4, 0);
                        aVar4.s();
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 196662, 20);
            bVarI.X(true);
        } else {
            umzVar2 = umzVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final umz umzVar3 = umzVar2;
            eVarZ.d = new Function2(umzVar3, function2, function1, function3, function4, i) { // from class: mz4
                public final /* synthetic */ umz b;
                public final /* synthetic */ Function2 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function1 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(49);
                    nz4.a(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
