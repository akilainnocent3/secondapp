package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.w;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gyh {
    public static final void a(final int i, a aVar, final d dVar, final Function0 function0) {
        b bVarI = aVar.i(-1566569378);
        int i2 = (bVarI.A(function0) ? 32 : 16) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = k.a(0);
                bVarI.r(objY);
            }
            final osw oswVar = (osw) objY;
            o0z.a(null, null, null, null, null, pp8.b(-1424403249, new Function2() { // from class: dyh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2;
                    hfs hfsVar;
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final osw oswVar2 = oswVar;
                        int iD = oswVar2.D();
                        aVar3.N(-1804790578);
                        if (iD <= 0) {
                            long j = j58.l;
                            hfsVar = new hfs(kotlin.collections.b.k(new j58(j), new j58(j)), null, 0L, 0L, 0);
                            aVar3.H();
                            aVar2 = aVar3;
                        } else {
                            float f = iD;
                            float f2 = f * 0.6f;
                            aVar2 = aVar3;
                            egn.a aVarA = kgn.a(kgn.b("floatingKickoffShimmer", aVar3, 0), 0.0f, f + f2, yi0.a(yi0.e(1000, 0, xkf.d, 2), l850.a, 0L, 4), "floatingKickoffShimmer", aVar2, 28728, 0);
                            long j2 = j58.l;
                            hfs hfsVar2 = new hfs(kotlin.collections.b.k(new j58(j2), new j58(j58.c(0.4f, ((lib0) aVar2.O(oib0.a)).p0)), new j58(j2)), null, (((long) Float.floatToRawIntBits(((Number) ((x5a0) aVarA.c).getValue()).floatValue() - f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(((Number) ((x5a0) aVarA.c).getValue()).floatValue())) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 0);
                            aVar2.H();
                            hfsVar = hfsVar2;
                        }
                        aiv aivVarC = g75.c(ht.a.e, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVar);
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
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar2, aivVarC, bVar);
                        yka.a.d dVar2 = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar2);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        androidx.compose.foundation.layout.d dVar3 = androidx.compose.foundation.layout.d.a;
                        d.a aVar5 = d.a.b;
                        d dVarF = g3w.f(dVar3.f(aVar5), true, function0);
                        Object objY2 = aVar2.y();
                        if (objY2 == a.C0041a.a) {
                            objY2 = new Function1() { // from class: fyh
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    oswVar2.k((int) (((jxo) obj3).a >> 32));
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY2);
                        }
                        d dVarA = ls7.a(w.a(dVarF, (Function1) objY2), j060.e(4.0f, 0.0f, 0.0f, 4.0f, 6));
                        qyd0 qyd0Var = oib0.a;
                        d dVarB = androidx.compose.foundation.a.b(dVarA, ((lib0) aVar2.O(qyd0Var)).w0, zk40.a);
                        d160 d160VarA = b160.a(new kw0.i(2.0f, true, new iw0(ht.a.n)), ht.a.k, aVar2, 54);
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
                        hlh0.a(aVar2, d160VarA, bVar);
                        hlh0.a(aVar2, ne00VarO2, dVar2);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        a aVar6 = aVar2;
                        h6n.b(erz.a(R.drawable.ic_send, 0, aVar2), null, h.f(j.r(aVar5, 24.0f), 3.0f), ((lib0) aVar2.O(qyd0Var)).U, aVar6, 432, 0);
                        lkf0.d(cb40.a(R.string.page_instant_virtual__kick_off, new Object[0], aVar6), null, ((lib0) aVar6.O(qyd0Var)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar6.O(kjb0.a)).n, aVar6, 0, 0, 131066);
                        aVar6.s();
                        g75.a(androidx.compose.foundation.a.a(ls7.a(dVar3.f(aVar5), j060.e(4.0f, 0.0f, 0.0f, 4.0f, 6)), hfsVar, null, 0.0f, 6), aVar6, 0);
                        aVar6.s();
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 196608);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, function0) { // from class: eyh
                public final /* synthetic */ d a;
                public final /* synthetic */ Function0 b;

                {
                    this.a = dVar;
                    this.b = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gyh.a(qj40.a(7), (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }
}
