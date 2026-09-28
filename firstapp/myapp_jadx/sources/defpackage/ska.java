package defpackage;

import androidx.compose.animation.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ska {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final boolean z, final long j, final long j2, final long j3, final int i, final boolean z2, final Function0 function0, a aVar, final int i2) {
        b bVar;
        Object rkaVar;
        ytw ytwVar;
        b bVarA = mzj.a(1948170218, aVar, str, function0);
        int i3 = i2 | (bVarA.M(str) ? 4 : 2) | (bVarA.e(j) ? 256 : 128) | (bVarA.e(j2) ? 2048 : 1024) | (bVarA.e(j3) ? 131072 : 65536) | (bVarA.d(i) ? 1048576 : 524288);
        if (bVarA.q(i3 & 1, (38347907 & i3) != 38347906)) {
            Object objY = bVarA.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.TRUE);
                bVarA.r(objY);
            }
            ytw ytwVar2 = (ytw) objY;
            Boolean bool = Boolean.TRUE;
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean z3 = (i3 & 458752) == 131072;
            Object objY2 = bVarA.y();
            if (z3 || objY2 == c0042a) {
                ytwVar = ytwVar2;
                rkaVar = new rka(z2, j3, function0, ytwVar, null);
                bVarA.r(rkaVar);
            } else {
                rkaVar = objY2;
                ytwVar = ytwVar2;
            }
            xvf.g(bool, boolValueOf, (Function2) rkaVar, bVarA);
            bVar = bVarA;
            hh0.e(((Boolean) ytwVar.getValue()).booleanValue(), null, null, f.g(null, 3), null, pp8.b(412309698, new gaj() { // from class: pka
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    ((Integer) obj3).getClass();
                    ((jh0) obj).getClass();
                    d.a aVar3 = d.a.b;
                    d dVarA = abk0.a(h.h(j.A(j.g(aVar3, 1.0f), null, 3), fw20.a(R.dimen._8sdp, aVar2), 0.0f, 2), 1.0f);
                    aiv aivVarC = g75.c(ht.a.b, false);
                    int iHashCode = Long.hashCode(aVar2.m());
                    ne00 ne00VarO = aVar2.o();
                    d dVarC = c.c(aVar2, dVarA);
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
                    yka.a.b bVar2 = yka.a.f;
                    hlh0.a(aVar2, aivVarC, bVar2);
                    yka.a.d dVar = yka.a.e;
                    hlh0.a(aVar2, ne00VarO, dVar);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                    }
                    yka.a.c cVar = yka.a.d;
                    hlh0.a(aVar2, dVarC, cVar);
                    d dVarB = androidx.compose.foundation.a.b(j.k(j.A(h.h(j.g(aVar3, 1.0f), 0.0f, 4.0f, 1), null, 3), fw20.a(R.dimen._36sdp, aVar2), 0.0f, 2), j, j060.c(8.0f));
                    d160 d160VarA = b160.a(kw0.e, ht.a.k, aVar2, 54);
                    int iHashCode2 = Long.hashCode(aVar2.m());
                    ne00 ne00VarO2 = aVar2.o();
                    d dVarC2 = c.c(aVar2, dVarB);
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
                    hlh0.a(aVar2, d160VarA, bVar2);
                    hlh0.a(aVar2, ne00VarO2, dVar);
                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                        j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                    }
                    hlh0.a(aVar2, dVarC2, cVar);
                    long jF = d2l.f(9);
                    wf1.a(str, h.g(aVar3, 8.0f, 10.0f), ni60.g(((sfd0) aVar2.O(ni60.b)).c, R.dimen._12ssp, aVar2), i, jF, null, 3, null, j2, aVar2, 24624, 160);
                    aVar2.s();
                    aVar2.s();
                    return Unit.a;
                }
            }, bVarA), bVar, 199680, 22);
        } else {
            bVar = bVarA;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, z, j, j2, j3, i, z2, function0, i2) { // from class: qka
                public final /* synthetic */ String a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ int f;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ Function0 v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(113270785);
                    ska.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
