package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class biy {

    public static final /* synthetic */ class a extends pf implements Function0<Unit> {
        public final /* synthetic */ v5b v;
        public final /* synthetic */ j590 w;
        public final /* synthetic */ Function0<Unit> y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v5b v5bVar, j590 j590Var, Function0<Unit> function0) {
            super(0, Intrinsics.a.class, "dismissBottomSheet", "OddsFilterPanel$dismissBottomSheet(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", 0);
            this.v = v5bVar;
            this.w = j590Var;
            this.y = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ej5.c(this.v, null, null, new ciy(this.w, null, this.y, null), 3);
            return Unit.a;
        }
    }

    public static final void a(final liy liyVar, final Function0<Unit> function0, final Function2<? super String, ? super ht7<Float>, Unit> function2, final Function0<Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        Function2<? super String, ? super ht7<Float>, Unit> function3;
        b bVar;
        function0.getClass();
        function2.getClass();
        function1.getClass();
        b bVarI = aVar.i(1154602638);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(liyVar) : bVarI.A(liyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function3 = function2;
            i2 |= bVarI.A(function3) ? 256 : 128;
        } else {
            function3 = function2;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = xvf.i(e.a, bVarI);
                bVarI.r(objY);
            }
            final v5b v5bVar = (v5b) objY;
            final j590 j590VarG = v1w.g(true, null, bVarI, 6, 2);
            final Function2<? super String, ? super ht7<Float>, Unit> function4 = function3;
            bVar = bVarI;
            v1w.a(function0, v8j0.b(g3w.c(d.a.b)), j590VarG, 0.0f, false, j060.e(8.0f, 8.0f, 0.0f, 0.0f, 12), ((lib0) bVarI.O(oib0.a)).i0, 0L, 0L, null, null, null, pp8.b(391475952, new gaj() { // from class: vhy
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        final v5b v5bVar2 = v5bVar;
                        boolean zA = aVar2.A(v5bVar2);
                        final j590 j590Var = j590VarG;
                        boolean zM = zA | aVar2.M(j590Var);
                        final Function0 function5 = function0;
                        boolean zM2 = zM | aVar2.M(function5);
                        Object objY2 = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zM2 || objY2 == c0042a) {
                            objY2 = new biy.a(v5bVar2, j590Var, function5);
                            aVar2.r(objY2);
                        }
                        Function0 function6 = (Function0) objY2;
                        boolean zA2 = aVar2.A(v5bVar2) | aVar2.M(j590Var) | aVar2.M(function5);
                        final Function2 function7 = function4;
                        boolean zM3 = zA2 | aVar2.M(function7);
                        Object objY3 = aVar2.y();
                        if (zM3 || objY3 == c0042a) {
                            objY3 = new Function2() { // from class: xhy
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    final String str = (String) obj4;
                                    final ht7 ht7Var = (ht7) obj5;
                                    str.getClass();
                                    ht7Var.getClass();
                                    final Function2 function8 = function7;
                                    ej5.c(v5bVar2, null, null, new ciy(j590Var, new Function0() { // from class: zhy
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function8.invoke(str, ht7Var);
                                            return Unit.a;
                                        }
                                    }, function5, null), 3);
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY3);
                        }
                        Function2 function8 = (Function2) objY3;
                        boolean zA3 = aVar2.A(v5bVar2) | aVar2.M(j590Var) | aVar2.M(function5);
                        final Function0 function9 = function1;
                        boolean zM4 = zA3 | aVar2.M(function9);
                        Object objY4 = aVar2.y();
                        if (zM4 || objY4 == c0042a) {
                            objY4 = new Function0() { // from class: yhy
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    ej5.c(v5bVar2, null, null, new ciy(j590Var, function9, function5, null), 3);
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY4);
                        }
                        biy.b(liyVar, function6, function8, (Function0) objY4, aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, (i3 >> 3) & 14, 3078, 7064);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: why
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    biy.a(liyVar, function0, function2, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final liy liyVar, final Function0<Unit> function0, final Function2<? super String, ? super ht7<Float>, Unit> function2, final Function0<Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(-582817115);
        int i2 = i | (bVarI.M(liyVar) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(bVarI, aVar2);
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
            int i3 = i2 >> 3;
            uhy.a(function0, bVarI, i3 & 14);
            kiy.a(liyVar.a, liyVar.b, function2, bVarI, i2 & 896);
            int i4 = i3 & 112;
            fiy.a(liyVar.c, function2, bVarI, i4);
            shy.a(liyVar.d, function2, bVarI, i4);
            d dVarK = j.k(j.g(aVar2, 1.0f), 44.0f, 0.0f, 2);
            qyd0 qyd0Var = oib0.a;
            d dVarD = androidx.compose.foundation.d.d(androidx.compose.foundation.a.b(dVarK, ((lib0) bVarI.O(qyd0Var)).q0, zk40.a), false, null, null, function1, 15);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarD);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            ute.b(null, 1.0f, ((lib0) bVarI.O(qyd0Var)).A, bVarI, 48, 1);
            lkf0.d(cb40.a(R.string.component_odds_filters__clear_all_hypercase, new Object[0], bVarI), androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.e), ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).j, bVarI, 0, 0, 131064);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function2, function1, i) { // from class: aiy
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function2 c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    biy.b(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
