package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c3s {

    @c0d(c = "com.sportybet.android.instantwin.presentation.leaguestats.LeagueStatsBottomSheetKt$LeagueStatsBottomSheet$1$1$1$1$1", f = "LeagueStatsBottomSheet.kt", l = {76}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ j590 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j590 j590Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = j590Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (this.b.d(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            wwd0 wwd0Var = ((w3s) this.receiver).d;
            Long lValueOf = Long.valueOf(System.currentTimeMillis());
            wwd0Var.getClass();
            wwd0Var.k(null, lValueOf);
            return Unit.a;
        }
    }

    public static final void a(final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(-548160970);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarH = h.h(j.g(aVar2, 1.0f), 24.0f, 0.0f, 2);
            d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarI, 54);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.d(cb40.a(R.string.page_instant_virtual__stats_title_league, new Object[0], bVarI), null, c68.a(R.color.text_type2_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, 0, 0, 131066);
            bVarI = bVarI;
            crz crzVarA = erz.a(R.drawable.ic_cancel, 0, bVarI);
            d dVarR = j.r(aVar2, 16.0f);
            boolean z = (i2 & 14) == 4;
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new a3s(function0, 0);
                bVarI.r(objY);
            }
            h6n.b(crzVarA, "Close icon", androidx.compose.foundation.d.d(dVarR, false, null, null, (Function0) objY, 15), c68.a(R.color.text_type2_secondary, bVarI), bVarI, 48, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: b3s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    c3s.a(function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final int i, androidx.compose.runtime.a aVar, final String str, final Function0 function0) {
        androidx.compose.runtime.b bVar;
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1319861958);
        int i2 = (bVarI.M(str) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new ji(str, 1);
                bVarI.r(objY);
            }
            Function1 function1 = (Function1) objY;
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final w3s w3sVar = (w3s) p8i0.a(jq40.a(w3s.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? zkl.a(((iel) w8i0VarA).getDefaultViewModelCreationExtras(), function1) : zkl.a(cyb.a.b, function1), bVarI);
            final j590 j590VarG = v1w.g(true, null, bVarI, 6, 2);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = xvf.i(kotlin.coroutines.e.a, bVarI);
                bVarI.r(objY2);
            }
            final v5b v5bVar = (v5b) objY2;
            bVar = bVarI;
            v1w.a(function0, null, j590VarG, 0.0f, false, j060.e(8.0f, 8.0f, 0.0f, 0.0f, 12), c68.a(R.color.background_type2_primary, bVarI), 0L, 0L, kb9.a, null, null, pp8.b(-1500068316, new gaj() { // from class: v2s
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        double d = (((double) ((Configuration) aVar2.O(AndroidCompositionLocals_androidKt.a)).screenHeightDp) * 0.8d) - 32.0d;
                        w3s w3sVar2 = w3sVar;
                        ytw ytwVarC = wyh.c(w3sVar2.e, aVar2, 0, 7);
                        d dVarI = j.i(d.a.b, (float) d);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarI);
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
                        hlh0.a(aVar2, aivVarC, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        y3s y3sVar = (y3s) ytwVarC.getValue();
                        final v5b v5bVar2 = v5bVar;
                        boolean zA = aVar2.A(v5bVar2);
                        final j590 j590Var = j590VarG;
                        boolean zM = zA | aVar2.M(j590Var);
                        final Function0 function2 = function0;
                        boolean zM2 = zM | aVar2.M(function2);
                        Object objY3 = aVar2.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (zM2 || objY3 == c0042a2) {
                            objY3 = new Function0() { // from class: x2s
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    final j590 j590Var2 = j590Var;
                                    jvd0 jvd0VarC = ej5.c(v5bVar2, null, null, new c3s.a(j590Var2, null), 3);
                                    final Function0 function3 = function2;
                                    jvd0VarC.invokeOnCompletion(new Function1() { // from class: y2s
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj4) {
                                            if (!j590Var2.e()) {
                                                function3.invoke();
                                            }
                                            return Unit.a;
                                        }
                                    });
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY3);
                        }
                        Function0 function3 = (Function0) objY3;
                        boolean zA2 = aVar2.A(w3sVar2);
                        Object objY4 = aVar2.y();
                        if (zA2 || objY4 == c0042a2) {
                            c3s.b bVar2 = new c3s.b(0, w3sVar2, w3s.class, "onTryAgainButtonClick", "onTryAgainButtonClick()V", 0);
                            aVar2.r(bVar2);
                            objY4 = bVar2;
                        }
                        c3s.c(y3sVar, function3, (Function0) ((chp) objY4), aVar2, 0);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, (i2 >> 3) & 14, 3078, 7066);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, str, function0) { // from class: w2s
                public final /* synthetic */ String a;
                public final /* synthetic */ Function0 b;

                {
                    this.a = str;
                    this.b = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c3s.b(qj40.a(1), (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final y3s y3sVar, final Function0<Unit> function0, final Function0<Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(141620305);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(y3sVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
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
            a(function0, bVarI, (i2 >> 3) & 14);
            d dVarG = j.g(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG);
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
            if (y3sVar instanceof y3s.c) {
                bVarI.N(-633575374);
                p3s.a(0, bVarI);
                bVarI.X(false);
            } else if (y3sVar instanceof y3s.b) {
                bVarI.N(-633571771);
                y3s.b bVar2 = (y3s.b) y3sVar;
                o3s.b(bVar2.a, bVar2.b, bVarI, 0);
                bVarI.X(false);
            } else {
                if (!(y3sVar instanceof y3s.a)) {
                    throw igf0.a(bVarI, -633577113, false);
                }
                bVarI.N(-633562681);
                d3s.a(function1, bVarI, (i2 >> 6) & 14);
                bVarI.X(false);
            }
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: z2s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    c3s.c(y3sVar, function0, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
