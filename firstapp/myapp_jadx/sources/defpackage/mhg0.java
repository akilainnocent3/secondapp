package defpackage;

import android.content.res.Configuration;
import android.view.View;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import com.sportygames.newcms.c;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes7.dex */
public final class mhg0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final String str2, final Function0 function0, final Function0 function1, final Function0 function2, final String str3, final j58 j58Var, final List list, final Function0 function3, final Function0 function4, final float f, final int i, aig0 aig0Var, final boolean z, final boolean z2, a aVar, final int i2, final int i3) {
        int i4;
        int i5;
        b bVar;
        final aig0 aig0Var2;
        b bVar2;
        aig0 aig0Var3;
        b bVarA = yoh0.a(function0, function1, function2, aVar, 792636413);
        if ((i2 & 6) == 0) {
            i4 = (bVarA.M(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarA.M(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= bVarA.A(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= bVarA.A(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= bVarA.A(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= bVarA.M(str3) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= bVarA.M(j58Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= bVarA.A(list) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= bVarA.A(function3) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= bVarA.A(function4) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = (bVarA.c(f) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= bVarA.d(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= bVarA.b(z) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= bVarA.b(z2) ? 16384 : 8192;
        }
        if (bVarA.q(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 9363) == 9362) ? false : true)) {
            bVarA.A0();
            if ((i2 & 1) == 0 || bVarA.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarA);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    bVar2 = bVarA;
                    aig0Var3 = (aig0) p8i0.a(jq40.a(aig0.class), w8i0VarA, null, null, w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVar2);
                }
            } else {
                bVarA.G();
                aig0Var3 = aig0Var;
                bVar2 = bVarA;
            }
            bVar2.Y();
            b bVar3 = bVar2;
            ytw ytwVarA = n95.a(aig0Var3.w, new com.sportygames.newcms.b(0), null, bVar3, 0, 2);
            final boolean z3 = !list.isEmpty();
            bVar = bVar3;
            c.a((com.sportygames.newcms.b) ytwVarA.getValue(), pp8.b(2101284772, new Function2() { // from class: zgg0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws Throwable {
                    Throwable th;
                    boolean z4;
                    float fA;
                    String strD;
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar3 = d.a.b;
                        d dVarB = androidx.compose.foundation.a.b(j.e(aVar3, 1.0f), j58.c(0.1f, b6g0.r), zk40.a);
                        Unit unit = Unit.a;
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (objY == c0042a) {
                            objY = jhg0.a;
                            aVar2.r(objY);
                        }
                        d dVarA = wje0.a(dVarB, unit, (PointerInputEventHandler) objY);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = androidx.compose.ui.c.c(aVar2, dVarA);
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
                        Configuration configuration = (Configuration) aVar2.O(AndroidCompositionLocals_androidKt.a);
                        mmd mmdVar = (mmd) aVar2.O(kna.h);
                        float f2 = configuration.screenHeightDp;
                        final float fC1 = mmdVar.C1(f2);
                        Object[] objArr = new Object[0];
                        Object objY2 = aVar2.y();
                        if (objY2 == c0042a) {
                            objY2 = new chg0();
                            aVar2.r(objY2);
                        }
                        final isw iswVar = (isw) o350.e(objArr, (Function0) objY2, aVar2, 48);
                        Object[] objArr2 = {Integer.valueOf(configuration.orientation)};
                        Object objY3 = aVar2.y();
                        if (objY3 == c0042a) {
                            objY3 = new ehg0();
                            aVar2.r(objY3);
                        }
                        final ytw ytwVar = (ytw) o350.e(objArr2, (Function0) objY3, aVar2, 48);
                        List list2 = list;
                        if (list2 == null || !list2.isEmpty()) {
                            Iterator it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    th = null;
                                    z4 = false;
                                    break;
                                }
                                th = null;
                                int i6 = ((ps6) it.next()).b;
                                if (i6 == 1 || i6 == 2) {
                                    z4 = true;
                                    break;
                                }
                            }
                        } else {
                            z4 = false;
                            th = null;
                        }
                        float fD = f.d((1.0f - iswVar.j()) - 0.05f, 0.0f, 1.0f);
                        d dVarG = j.g(aVar3, 1.0f);
                        androidx.compose.foundation.layout.d dVar = androidx.compose.foundation.layout.d.a;
                        n54 n54Var = ht.a.h;
                        d dVarB2 = dVar.b(dVarG, n54Var);
                        boolean zM = aVar2.M(ytwVar) | aVar2.c(fC1) | aVar2.M(iswVar);
                        Object objY4 = aVar2.y();
                        if (zM || objY4 == c0042a) {
                            objY4 = new Function1() { // from class: ghg0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    urr urrVar = (urr) obj3;
                                    urrVar.getClass();
                                    ytw ytwVar2 = ytwVar;
                                    if (!((Boolean) ytwVar2.getValue()).booleanValue()) {
                                        float fD2 = f.d(((int) (urrVar.a() & 4294967295L)) / fC1, 0.0f, 1.0f);
                                        isw iswVar2 = iswVar;
                                        if (Math.abs(fD2 - iswVar2.j()) > 0.001f) {
                                            iswVar2.A(fD2);
                                        }
                                        ytwVar2.setValue(Boolean.TRUE);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY4);
                        }
                        d dVarA2 = v.a(dVarB2, (Function1) objY4);
                        WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
                        d dVarA3 = u8j0.a(u8j0.a(dVarA2, q8j0.a.a(aVar2).c), q8j0.a.a(aVar2).e);
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = androidx.compose.ui.c.c(aVar2, dVarA3);
                        yka.k.getClass();
                        tsr.a aVar5 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw th;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar5);
                        } else {
                            aVar2.p();
                        }
                        yka.a.b bVar4 = yka.a.f;
                        hlh0.a(aVar2, i78VarA, bVar4);
                        yka.a.d dVar2 = yka.a.e;
                        hlh0.a(aVar2, ne00VarO2, dVar2);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a2);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC2, cVar);
                        d dVarG2 = j.g(aVar3, 1.0f);
                        aiv aivVarC2 = g75.c(ht.a.b, false);
                        int iHashCode3 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO3 = aVar2.o();
                        d dVarC3 = androidx.compose.ui.c.c(aVar2, dVarG2);
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw th;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar5);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC2, bVar4);
                        hlh0.a(aVar2, ne00VarO3, dVar2);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode3))) {
                            j3c.a(iHashCode3, aVar2, iHashCode3, c1350a2);
                        }
                        hlh0.a(aVar2, dVarC3, cVar);
                        final String str4 = str;
                        final String str5 = str2;
                        final Function0 function5 = function0;
                        final Function0 function6 = function1;
                        final Function0 function7 = function2;
                        final boolean z5 = z2;
                        mig0.a(48, pp8.b(1936277535, new Function2() { // from class: hhg0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar6 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    final String str6 = str4;
                                    final String str7 = str5;
                                    final Function0 function8 = function5;
                                    final Function0 function9 = function6;
                                    final Function0 function10 = function7;
                                    final boolean z6 = z5;
                                    t4g0.a(54, pp8.b(-445892805, new Function2() { // from class: xgg0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            a aVar7 = (a) obj5;
                                            int iIntValue3 = ((Integer) obj6).intValue();
                                            if (aVar7.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                d.a aVar8 = d.a.b;
                                                d dVarJ = h.j(j.g(aVar8, 1.0f), 0.0f, pi60.a(R.dimen._35sdp, 6, aVar7), 0.0f, 0.0f, 13);
                                                i78 i78VarA2 = g78.a(kw0.c, ht.a.n, aVar7, 48);
                                                int iHashCode4 = Long.hashCode(aVar7.m());
                                                ne00 ne00VarO4 = aVar7.o();
                                                d dVarC4 = androidx.compose.ui.c.c(aVar7, dVarJ);
                                                yka.k.getClass();
                                                tsr.a aVar9 = yka.a.b;
                                                if (aVar7.k() == null) {
                                                    l2a.b();
                                                    throw null;
                                                }
                                                aVar7.D();
                                                if (aVar7.g()) {
                                                    aVar7.F(aVar9);
                                                } else {
                                                    aVar7.p();
                                                }
                                                yka.a.b bVar5 = yka.a.f;
                                                hlh0.a(aVar7, i78VarA2, bVar5);
                                                yka.a.d dVar3 = yka.a.e;
                                                hlh0.a(aVar7, ne00VarO4, dVar3);
                                                yka.a.C1350a c1350a3 = yka.a.g;
                                                if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode4))) {
                                                    j3c.a(iHashCode4, aVar7, iHashCode4, c1350a3);
                                                }
                                                yka.a.c cVar2 = yka.a.d;
                                                hlh0.a(aVar7, dVarC4, cVar2);
                                                long j = b6g0.a;
                                                gdf0 gdf0Var = new gdf0(3);
                                                qyd0 qyd0Var = pi60.a;
                                                lkf0.b(str6, null, j, 0L, null, null, null, 0L, gdf0Var, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar7.O(qyd0Var)).d, R.dimen._14ssp, aVar7), aVar7, 384, 0, 65018);
                                                ty0.a(aVar7, j.i(aVar8, pi60.a(R.dimen._8sdp, 6, aVar7)));
                                                d dVarH = h.h(aVar8, pi60.a(R.dimen._12sdp, 6, aVar7), 0.0f, 2);
                                                v5g0 v5g0Var = v5g0.Z;
                                                String strD2 = c.d(v5g0Var.P, "You could win up to", aVar7);
                                                long j2 = j58.f;
                                                lkf0.b(strD2, dVarH, j2, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar7.O(qyd0Var)).b, R.dimen._13ssp, aVar7), aVar7, 384, 0, 65016);
                                                ty0.a(aVar7, j.i(aVar8, 4.0f));
                                                lkf0.b(str7, null, j2, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar7.O(qyd0Var)).d, R.dimen._19ssp, aVar7), aVar7, 384, 0, 65018);
                                                ty0.a(aVar7, j.i(aVar8, pi60.a(R.dimen._9sdp, 6, aVar7)));
                                                lkf0.b(c.d(v5g0Var.Q, "Are you sure you want to skip this tournament?", aVar7), h.h(aVar8, pi60.a(R.dimen._12sdp, 6, aVar7), 0.0f, 2), j2, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar7.O(qyd0Var)).b, R.dimen._13ssp, aVar7), aVar7, 384, 0, 65016);
                                                d dVarF = h.f(wtc.b(aVar8, 16.0f, aVar7, aVar8, 1.0f), pi60.a(R.dimen._9sdp, 6, aVar7));
                                                d160 d160VarA = b160.a(kw0.g, ht.a.j, aVar7, 6);
                                                int iHashCode5 = Long.hashCode(aVar7.m());
                                                ne00 ne00VarO5 = aVar7.o();
                                                d dVarC5 = androidx.compose.ui.c.c(aVar7, dVarF);
                                                if (aVar7.k() == null) {
                                                    l2a.b();
                                                    throw null;
                                                }
                                                aVar7.D();
                                                if (aVar7.g()) {
                                                    aVar7.F(aVar9);
                                                } else {
                                                    aVar7.p();
                                                }
                                                hlh0.a(aVar7, d160VarA, bVar5);
                                                hlh0.a(aVar7, ne00VarO5, dVar3);
                                                if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode5))) {
                                                    j3c.a(iHashCode5, aVar7, iHashCode5, c1350a3);
                                                }
                                                hlh0.a(aVar7, dVarC5, cVar2);
                                                l35 l35VarA = m35.a(1.0f, b6g0.d);
                                                i060 i060VarC = j060.c(5.0f);
                                                if (1.0f <= 0.0d) {
                                                    ukn.a("invalid weight; must be greater than zero");
                                                }
                                                nk5.b(function9, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, i060VarC, null, l35VarA, null, py9.a, aVar7, 806879232, 436);
                                                ty0.a(aVar7, j.w(aVar8, 12.0f));
                                                umz umzVarA = h.a(3, 0.0f, 0.0f);
                                                i060 i060VarC2 = j060.c(5.0f);
                                                umz umzVar = ek5.a;
                                                ak5 ak5VarA = ek5.a(j58.l, 0L, 0L, 0L, aVar7, 14);
                                                if (1.0f <= 0.0d) {
                                                    ukn.a("invalid weight; must be greater than zero");
                                                }
                                                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                                                final boolean z7 = z6;
                                                nk5.a(function10, layoutWeightElement, false, i060VarC2, ak5VarA, null, null, umzVarA, null, pp8.b(1300634245, new gaj() { // from class: ygg0
                                                    @Override // defpackage.gaj
                                                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                        a aVar10 = (a) obj8;
                                                        int iIntValue4 = ((Integer) obj9).intValue();
                                                        ((e160) obj7).getClass();
                                                        if (aVar10.q(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                            d.a aVar11 = d.a.b;
                                                            boolean z8 = z7;
                                                            n54 n54Var2 = ht.a.e;
                                                            ya5.a aVar12 = ya5.a;
                                                            if (z8) {
                                                                aVar10.N(-1998085224);
                                                                d dVarG3 = j.g(aVar11, 1.0f);
                                                                long j3 = b6g0.s;
                                                                j58 j58Var2 = new j58(j3);
                                                                long j4 = b6g0.t;
                                                                d dVarH2 = h.h(androidx.compose.foundation.a.b(ybi0.a(ybi0.a(ybi0.a(d35.b(dVarG3, 2.0f, ya5.a.h(aVar12, kotlin.collections.b.k(j58Var2, new j58(j4)), 0.0f, 0.0f, 14), j060.c(5.0f)), b6g0.u, 8.0f, 2.0f, 2.0f, j060.c(5.0f)), b6g0.v, 16.0f, -4.0f, -4.0f, j060.c(5.0f)), b6g0.w, 8.0f, 0.0f, 4.0f, j060.c(5.0f)), b6g0.q, j060.c(5.0f)), 0.0f, 10.5f, 1);
                                                                aiv aivVarC3 = g75.c(n54Var2, false);
                                                                int iHashCode6 = Long.hashCode(aVar10.m());
                                                                ne00 ne00VarO6 = aVar10.o();
                                                                d dVarC6 = androidx.compose.ui.c.c(aVar10, dVarH2);
                                                                yka.k.getClass();
                                                                tsr.a aVar13 = yka.a.b;
                                                                if (aVar10.k() == null) {
                                                                    l2a.b();
                                                                    throw null;
                                                                }
                                                                aVar10.D();
                                                                if (aVar10.g()) {
                                                                    aVar10.F(aVar13);
                                                                } else {
                                                                    aVar10.p();
                                                                }
                                                                hlh0.a(aVar10, aivVarC3, yka.a.f);
                                                                hlh0.a(aVar10, ne00VarO6, yka.a.e);
                                                                yka.a.C1350a c1350a4 = yka.a.g;
                                                                if (aVar10.g() || !Intrinsics.g(aVar10.y(), Integer.valueOf(iHashCode6))) {
                                                                    j3c.a(iHashCode6, aVar10, iHashCode6, c1350a4);
                                                                }
                                                                hlh0.a(aVar10, dVarC6, yka.a.d);
                                                                xf1.a(c.d(v5g0.Z.S, "Remind Me Later", aVar10), null, new imf0(ya5.a.h(aVar12, kotlin.collections.b.k(new j58(j3), new j58(j4)), 0.0f, 0.0f, 14), pi60.b(R.dimen._13ssp, 6, aVar10), t9i.E, null, null, null, 0L, 33554418), 0, d2l.f(11), null, 3, null, 0L, aVar10, 24576, 426);
                                                                aVar10.s();
                                                                aVar10.H();
                                                            } else {
                                                                aVar10.N(-2000043587);
                                                                d dVarH3 = h.h(androidx.compose.foundation.a.a(j.g(aVar11, 1.0f), ya5.a.h(aVar12, kotlin.collections.b.k(new j58(b6g0.k), new j58(b6g0.l)), 0.0f, 0.0f, 14), j060.c(5.0f), 0.0f, 4), 0.0f, 10.5f, 1);
                                                                aiv aivVarC4 = g75.c(n54Var2, false);
                                                                int iHashCode7 = Long.hashCode(aVar10.m());
                                                                ne00 ne00VarO7 = aVar10.o();
                                                                d dVarC7 = androidx.compose.ui.c.c(aVar10, dVarH3);
                                                                yka.k.getClass();
                                                                tsr.a aVar14 = yka.a.b;
                                                                if (aVar10.k() == null) {
                                                                    l2a.b();
                                                                    throw null;
                                                                }
                                                                aVar10.D();
                                                                if (aVar10.g()) {
                                                                    aVar10.F(aVar14);
                                                                } else {
                                                                    aVar10.p();
                                                                }
                                                                hlh0.a(aVar10, aivVarC4, yka.a.f);
                                                                hlh0.a(aVar10, ne00VarO7, yka.a.e);
                                                                yka.a.C1350a c1350a5 = yka.a.g;
                                                                if (aVar10.g() || !Intrinsics.g(aVar10.y(), Integer.valueOf(iHashCode7))) {
                                                                    j3c.a(iHashCode7, aVar10, iHashCode7, c1350a5);
                                                                }
                                                                hlh0.a(aVar10, dVarC7, yka.a.d);
                                                                xf1.a(c.d(v5g0.Z.S, "Remind Me Later", aVar10), null, pi60.c(((ufd0) aVar10.O(pi60.a)).d, R.dimen._13ssp, aVar10), 0, d2l.f(11), null, 3, null, j58.b, aVar10, 100687872, 170);
                                                                aVar10.s();
                                                                aVar10.H();
                                                            }
                                                        } else {
                                                            aVar10.G();
                                                        }
                                                        return Unit.a;
                                                    }
                                                }, aVar7), aVar7, 817889280, 356);
                                                aVar7.s();
                                                aVar7.s();
                                                c6n.b(function8, j.r(g.c(h.f(androidx.compose.foundation.layout.d.a.b(aVar8, ht.a.c), pi60.a(R.dimen._9sdp, 6, aVar7)), -2.0f, 4.0f), 24.0f), false, null, py9.b, aVar7, 196608, 28);
                                            } else {
                                                aVar7.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar6), aVar6, z6);
                                } else {
                                    aVar6.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, z5);
                        float fA2 = pi60.a(R.dimen._82sdp, 6, aVar2);
                        float fA3 = pi60.a(R.dimen._95sdp, 6, aVar2);
                        if (z5) {
                            aVar2.N(647017051);
                            fA = -pi60.a(R.dimen._65sdp, 6, aVar2);
                        } else {
                            aVar2.N(647015935);
                            fA = pi60.a(R.dimen._minus60sdp, 6, aVar2);
                        }
                        aVar2.H();
                        boolean z6 = z;
                        boolean z7 = z3;
                        if (z7) {
                            aVar2.N(-1417243138);
                            if (z6) {
                                aVar2.N(-1417200141);
                                fA = pi60.a(R.dimen._minus35sdp, 6, aVar2);
                                aVar2.H();
                            } else {
                                aVar2.N(-1417117805);
                                fA = pi60.a(R.dimen._minus50sdp, 6, aVar2);
                                aVar2.H();
                            }
                        } else {
                            aVar2.N(-1435381920);
                        }
                        aVar2.H();
                        if (z5) {
                            aVar2.N(647035044);
                            strD = c.d(v5g0.Z.g, "https://s.sporty.net/cms/tournament_trophy_vip_big_c808c518f1.webp", aVar2);
                            aVar2.H();
                        } else {
                            aVar2.N(647028892);
                            strD = c.d(v5g0.Z.f, "https://s.sporty.net/cms/Trophy_1_3_d403c92442.png", aVar2);
                            aVar2.H();
                        }
                        d dVarD = g.d(j.t(aVar3, fA2, fA3), 0.0f, fA, 1);
                        float f3 = z7 ? 0.6f : 1.0f;
                        gcg0.a(strD, "Trophy", bz60.a(dVarD, f3, f3), d0b.a.a, null, 0.0f, null, null, aVar2, 3120, 496);
                        aVar2.s();
                        aVar2.s();
                        d dVarD2 = g.d(h.j(abk0.a(dVar.b(aVar3, n54Var), 1.0f), 0.0f, 0.0f, 0.0f, iswVar.j() * f2, 7), 0.0f, pi60.a(R.dimen._minus25sdp, 6, aVar2), 1);
                        Function0 function8 = function3;
                        boolean zM2 = aVar2.M(function8);
                        Object objY5 = aVar2.y();
                        if (zM2 || objY5 == c0042a) {
                            objY5 = new cdh(function8, 1);
                            aVar2.r(objY5);
                        }
                        Function0 function9 = (Function0) objY5;
                        final Function0 function10 = function4;
                        boolean zM3 = aVar2.M(function10);
                        Object objY6 = aVar2.y();
                        if (zM3 || objY6 == c0042a) {
                            objY6 = new Function0() { // from class: ihg0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function10.invoke();
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY6);
                        }
                        j18.b(dVarD2, str3, j58Var, list2, function9, (Function0) objY6, z4 || z6, (!z6 || z7) ? 0.0f : f, i, fD, aVar2, 0);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVar), bVar, 48);
            aig0Var2 = aig0Var3;
        } else {
            bVar = bVarA;
            bVar.G();
            aig0Var2 = aig0Var;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ahg0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    int iA2 = qj40.a(i3);
                    mhg0.a(str, str2, function0, function1, function2, str3, j58Var, list, function3, function4, f, i, aig0Var2, z, z2, (a) obj, iA, iA2);
                    return Unit.a;
                }
            };
        }
    }
}
