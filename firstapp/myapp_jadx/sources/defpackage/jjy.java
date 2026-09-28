package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jjy {
    public static final void a(Function0<Unit> function0, a aVar, final int i) {
        int i2;
        final Function0<Unit> function1;
        b bVarI = aVar.i(547752105);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            function1 = function0;
            c6n.d(function1, j.w(j.i(d.a.b, 24.0f), 24.0f), false, j060.c(2.0f), null, m35.a(1.0f, c68.a(R.color.text_type1_primary, bVarI)), eh9.a, bVarI, (i2 & 14) | 12582960);
        } else {
            function1 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ijy
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    jjy.a(function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final ArrayList arrayList, final rgy rgyVar, final Function1 function1, final Function0 function0, a aVar, final int i) {
        rgyVar.getClass();
        b bVarI = aVar.i(1774359275);
        int i2 = i | (bVarI.M(arrayList) ? 4 : 2) | (bVarI.A(rgyVar) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(lx80.d(aVar2, 4.0f, null, false, 0L, 0L, 30), c68.a(R.color.background_general_primary, bVarI), zk40.a);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarG = j.g(h.h(j.i(aVar2, 44.0f), 16.0f, 0.0f, 2), 1.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            lkf0.d(cb40.a(R.string.component_odds_filters__odds_filter, new Object[0], bVarI), new LayoutWeightElement(1.0f, true), c68.a(R.color.text_type1_primary, bVarI), null, d2l.f(16), null, t9i.E, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 1597440, 0, 262056);
            bVarI = bVarI;
            a(function0, bVarI, (i2 >> 9) & 14);
            bVarI.X(true);
            ute.b(null, 1.0f, c68.a(R.color.background_type1_primary, bVarI), bVarI, 48, 1);
            bVarI.N(-973870655);
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                kjy kjyVar = (kjy) obj;
                boolean z = kjyVar.f;
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (z) {
                    bVarI.N(-408794075);
                    boolean zC = rgyVar.c();
                    boolean z2 = (i2 & 896) == 256;
                    Object objY = bVarI.y();
                    if (z2 || objY == c0042a) {
                        objY = new Function1() { // from class: fjy
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                rgy rgyVar2 = (rgy) obj2;
                                rgyVar2.getClass();
                                function1.invoke(rgyVar2);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY);
                    }
                    vec.b(kjyVar, zC, (Function1) objY, bVarI, 0);
                    bVarI.X(false);
                } else {
                    int i4 = 0;
                    bVarI.N(-408624784);
                    boolean z3 = !rgyVar.c() && Intrinsics.f(kjyVar.d, rgyVar.b()) && Intrinsics.f(kjyVar.e, rgyVar.a());
                    boolean zA = ((i2 & 896) == 256) | bVarI.A(kjyVar);
                    Object objY2 = bVarI.y();
                    if (zA || objY2 == c0042a) {
                        objY2 = new gjy(i4, function1, kjyVar);
                        bVarI.r(objY2);
                    }
                    i150.a(kjyVar, z3, (Function0) objY2, bVarI, 0);
                    bVarI.X(false);
                }
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(arrayList, rgyVar, function1, function0, i) { // from class: hjy
                public final /* synthetic */ ArrayList a;
                public final /* synthetic */ rgy b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(65);
                    jjy.b(this.a, this.b, this.c, this.d, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(ComposeView composeView, final ArrayList arrayList, final rgy rgyVar, final Function1 function1, final Function0 function0, final boolean z) {
        composeView.getClass();
        rgyVar.getClass();
        composeView.setContent(new op8(-1812748900, new Function2() { // from class: bjy
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final boolean z2 = z;
                    final ArrayList arrayList2 = arrayList;
                    final rgy rgyVar2 = rgyVar;
                    final Function1 function2 = function1;
                    final Function0 function3 = function0;
                    scv.b(null, null, null, pp8.b(1801910640, new Function2() { // from class: cjy
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                final ArrayList arrayList3 = arrayList2;
                                final rgy rgyVar3 = rgyVar2;
                                final Function1 function4 = function2;
                                final Function0 function5 = function3;
                                final op8 op8VarB = pp8.b(1659662095, new Function2() { // from class: djy
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj5, Object obj6) {
                                        a aVar3 = (a) obj5;
                                        int iIntValue3 = ((Integer) obj6).intValue();
                                        if (aVar3.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            jjy.b(arrayList3, rgyVar3, function4, function5, aVar3, 64);
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2);
                                if (z2) {
                                    aVar2.N(-2076009417);
                                    ssi.a(6, pp8.b(522460540, new Function2() { // from class: ejy
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            a aVar3 = (a) obj5;
                                            int iIntValue3 = ((Integer) obj6).intValue();
                                            if (aVar3.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                op8VarB.invoke(aVar3, 6);
                                            } else {
                                                aVar3.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar2), aVar2);
                                    aVar2.H();
                                } else {
                                    aVar2.N(-2075945495);
                                    op8VarB.invoke(aVar2, 6);
                                    aVar2.H();
                                }
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 3072, 7);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
