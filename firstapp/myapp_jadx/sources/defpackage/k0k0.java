package defpackage;

import android.app.Activity;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.worldcup.config.domain.model.WorldCupRelatedGame;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class k0k0 {
    public static final void a(final Function0<Unit> function0, a aVar, final int i) {
        b bVarI = aVar.i(-1243350348);
        int i2 = i | (bVarI.A(function0) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarI = j.i(j.g(aVar2, 1.0f), 100.0f);
            i78 i78VarA = g78.a(kw0.e, ht.a.n, bVarI, 54);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.d(cb40.a(R.string.common_feedback__something_went_wrong_please_try_again, new Object[0], bVarI), null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 0, 131066);
            ty0.a(bVarI, j.i(aVar2, 8.0f));
            vuc0.b(null, false, null, g9z.d, null, cb40.a(R.string.common_functions__retry, new Object[0], bVarI), null, null, null, null, function0, bVarI, 0, i2 & 14, 983);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function0) { // from class: qzj0
                public final /* synthetic */ Function0 a;

                {
                    this.a = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    k0k0.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(int i, a aVar) {
        b bVarI = aVar.i(-618484703);
        if (bVarI.q(i & 1, i != 0)) {
            d.a aVar2 = d.a.b;
            d dVarI = j.i(j.g(aVar2, 1.0f), 100.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
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
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            q330.a(j.r(aVar2, 32.0f), c68.a(R.color.brand_secondary, bVarI), 4.0f, 0L, 0, 0.0f, bVarI, 390, 56);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new pzj0();
        }
    }

    public static final void c(String str, a aVar, int i) {
        b bVarI = aVar.i(1565673297);
        int i2 = (bVarI.M(str) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarI = j.i(j.g(aVar2, 1.0f), 80.0f);
            d160 d160VarA = b160.a(new kw0.i(16.0f, true, new iw0(ht.a.n)), ht.a.k, bVarI, 54);
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
            h9n.a(erz.a(R.drawable.ic_no_events, 0, bVarI), "No events", j.r(aVar2, 60.0f), null, null, 0.0f, null, bVarI, 432, 120);
            lkf0.d(kotlin.text.c.p(str, "\\n", "\n", false), null, c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 0, 131066);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new arb0(str, i);
        }
    }

    public static final void d(final ArrayList arrayList, final zpz zpzVar, final Function1 function1, a aVar, final int i) {
        b bVarI = aVar.i(-1670544071);
        int i2 = (bVarI.M(arrayList) ? 4 : 2) | i | (bVarI.M(zpzVar) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        int i3 = 1;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            aiv aivVarC = g75.c(ht.a.a, false);
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
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            ute.b(androidx.compose.foundation.layout.d.a.b(j.g(aVar2, 1.0f), ht.a.h), 1.0f, c68.a(R.color.border_primary, bVarI), bVarI, 48, 0);
            int iK = zpzVar.k();
            long j = j58.l;
            mfc.a(iK, null, j, j, 8.0f, 0.0f, false, pp8.b(-2047248479, new gn7(zpzVar, i3), bVarI), k1a.b, pp8.b(-2036356703, new Function2() { // from class: jzj0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar4 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ArrayList arrayList2 = arrayList;
                        final int i4 = 0;
                        int i5 = 0;
                        for (int size = arrayList2.size(); i5 < size; size = size) {
                            Object obj3 = arrayList2.get(i5);
                            int i6 = i5 + 1;
                            int i7 = i4 + 1;
                            if (i4 < 0) {
                                kotlin.collections.b.q();
                                throw null;
                            }
                            final String str = (String) obj3;
                            final boolean z = zpzVar.k() == i4;
                            final Function1 function2 = function1;
                            boolean zM = aVar4.M(function2) | aVar4.d(i4);
                            Object objY = aVar4.y();
                            if (zM || objY == a.C0041a.a) {
                                objY = new Function0() { // from class: mzj0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function2.invoke(Integer.valueOf(i4));
                                        return Unit.a;
                                    }
                                };
                                aVar4.r(objY);
                            }
                            w1f0.a(z, (Function0) objY, null, false, 0L, 0L, pp8.b(-1458008774, new gaj() { // from class: ozj0
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    imf0 imf0VarL;
                                    int i8;
                                    int i9;
                                    a aVar5 = (a) obj5;
                                    int iIntValue2 = ((Integer) obj6).intValue();
                                    ((j78) obj4).getClass();
                                    if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        d dVarH = h.h(j.i(d.a.b, 32.0f), 12.0f, 0.0f, 2);
                                        aiv aivVarC2 = g75.c(ht.a.e, false);
                                        int iHashCode2 = Long.hashCode(aVar5.m());
                                        ne00 ne00VarO = aVar5.o();
                                        d dVarC2 = c.c(aVar5, dVarH);
                                        yka.k.getClass();
                                        tsr.a aVar6 = yka.a.b;
                                        if (aVar5.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar5.D();
                                        if (aVar5.g()) {
                                            aVar5.F(aVar6);
                                        } else {
                                            aVar5.p();
                                        }
                                        hlh0.a(aVar5, aivVarC2, yka.a.f);
                                        hlh0.a(aVar5, ne00VarO, yka.a.e);
                                        yka.a.C1350a c1350a2 = yka.a.g;
                                        if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode2))) {
                                            j3c.a(iHashCode2, aVar5, iHashCode2, c1350a2);
                                        }
                                        hlh0.a(aVar5, dVarC2, yka.a.d);
                                        boolean z2 = z;
                                        if (z2) {
                                            aVar5.N(220569031);
                                            imf0VarL = mla.l(R.style.B1_B, aVar5);
                                            aVar5.H();
                                        } else {
                                            aVar5.N(220677159);
                                            imf0VarL = mla.l(R.style.B1_R, aVar5);
                                            aVar5.H();
                                        }
                                        imf0 imf0Var = imf0VarL;
                                        if (z2) {
                                            i8 = 220831663;
                                            i9 = R.color.text_brand_sub_primary_d_lighter;
                                        } else {
                                            i8 = 220962979;
                                            i9 = R.color.text_primary;
                                        }
                                        lkf0.d(str, null, m7b.a(aVar5, i8, i9, aVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, aVar5, 0, 0, 131066);
                                        aVar5.s();
                                    } else {
                                        aVar5.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar4), aVar4, 12582912, 124);
                            i5 = i6;
                            i4 = i7;
                        }
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 918580608, 98);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(arrayList, zpzVar, function1, i) { // from class: kzj0
                public final /* synthetic */ ArrayList a;
                public final /* synthetic */ zpz b;
                public final /* synthetic */ Function1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    k0k0.d(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final n0k0 n0k0Var, final Function1 function1, final Function1 function2, final Function1 function3, final Function1 function4, final Function1 function5, final Function0 function0, final jaj jajVar, final gaj gajVar, final Function0 function6, final Function0 function7, final Function1 function8, final ucm ucmVar, final ox4 ox4Var, final Function1 function9, final Function1 function10, final Function1 function11, final Function0 function12, a aVar, final int i) {
        b bVarI = aVar.i(-1617990654);
        int i2 = i | (bVarI.M(n0k0Var) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128) | (bVarI.A(function3) ? 2048 : 1024) | (bVarI.A(function4) ? 16384 : 8192) | (bVarI.A(function5) ? 131072 : 65536) | (bVarI.A(function0) ? 1048576 : 524288) | (bVarI.A(jajVar) ? 8388608 : 4194304) | (bVarI.A(gajVar) ? 67108864 : 33554432) | (bVarI.A(function6) ? 536870912 : 268435456);
        int i3 = (bVarI.A(function7) ? 4 : 2) | (bVarI.A(function8) ? 32 : 16) | (bVarI.A(ucmVar) ? 256 : 128) | (bVarI.M(ox4Var) ? 2048 : 1024) | (bVarI.A(function9) ? 16384 : 8192) | (bVarI.A(function10) ? 131072 : 65536) | (bVarI.A(function11) ? 1048576 : 524288) | (bVarI.A(function12) ? 8388608 : 4194304);
        if (bVarI.q(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 4793491) == 4793490) ? false : true)) {
            d dVarB = d35.b(ls7.a(h.g(d.a.b, 8.0f, 4.0f), j060.c(8.0f)), 2.0f, ya5.a.a(0.0f, 0.0f, 14, kotlin.collections.b.k(new j58(c68.a(R.color.gradient_gold_fading_900_start, bVarI)), new j58(c68.a(R.color.gradient_gold_fading_900_center, bVarI)), new j58(c68.a(R.color.gradient_gold_fading_900_start, bVarI)))), j060.c(8.0f));
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            if (n0k0Var instanceof n0k0.a) {
                bVarI.N(-1380750358);
                bVarI.X(false);
            } else {
                bVarI.N(-1382138042);
                uf00<WorldCupTeam> uf00VarC = n0k0Var.c();
                uf00VarC.getClass();
                h(uf00VarC, n0k0Var.a(), function2, n0k0Var.e(), function7, bVarI, (i2 & 896) | ((i3 << 12) & 57344));
                uf00<l5k0> uf00VarB = n0k0Var.b();
                uf00VarB.getClass();
                int i4 = i2 << 6;
                int i5 = i3 << 3;
                g(uf00VarB, n0k0Var.d(), n0k0Var instanceof n0k0.c, n0k0Var instanceof n0k0.b, function1, function3, function4, function5, function0, jajVar, gajVar, function6, function8, ucmVar, ox4Var, function9, function10, function11, function12, bVarI, ((i2 << 9) & 57344) | 8 | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024) | (i4 & 1879048192), ((i2 >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024));
                bVarI = bVarI;
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, function2, function3, function4, function5, function0, jajVar, gajVar, function6, function7, function8, ucmVar, ox4Var, function9, function10, function11, function12, i) { // from class: tzj0
                public final /* synthetic */ Function1 A;
                public final /* synthetic */ ucm B;
                public final /* synthetic */ ox4 C;
                public final /* synthetic */ Function1 D;
                public final /* synthetic */ Function1 E;
                public final /* synthetic */ Function1 F;
                public final /* synthetic */ Function0 G;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ jaj v;
                public final /* synthetic */ gaj w;
                public final /* synthetic */ Function0 y;
                public final /* synthetic */ Function0 z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    k0k0.e(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(t0k0 t0k0Var, final tch tchVar, ucm ucmVar, a aVar, int i) {
        b bVar;
        a.C0041a.C0042a c0042a;
        boolean z;
        a.C0041a.C0042a c0042a2;
        int i2;
        b bVarI = aVar.i(-359624566);
        int i3 = i | (bVarI.A(t0k0Var) ? 4 : 2) | (bVarI.A(tchVar) ? 32 : 16) | (bVarI.A(ucmVar) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            ytw ytwVarC = wyh.c(t0k0Var.O, bVarI, 0, 7);
            ytw ytwVarC2 = wyh.c(tchVar.S, bVarI, 0, 7);
            boolean z2 = ((n0k0) ytwVarC.getValue()) instanceof n0k0.a;
            a.C0041a.C0042a c0042a3 = a.C0041a.a;
            if (z2) {
                c0042a = c0042a3;
                bVar = bVarI;
                z = false;
                bVar.N(-1925020520);
                bVar.X(false);
            } else {
                bVarI.N(-1926524485);
                n0k0 n0k0Var = (n0k0) ytwVarC.getValue();
                int i4 = i3 & 14;
                boolean z3 = i4 == 4 || bVarI.A(t0k0Var);
                Object objY = bVarI.y();
                if (z3 || objY == c0042a3) {
                    c0042a2 = c0042a3;
                    i2 = i4;
                    uzj0 uzj0Var = new uzj0(1, t0k0Var, t0k0.class, "onTabChange", "onTabChange(I)V", 0);
                    bVarI.r(uzj0Var);
                    objY = uzj0Var;
                } else {
                    i2 = i4;
                    c0042a2 = c0042a3;
                }
                Function1 function1 = (Function1) ((chp) objY);
                boolean z4 = i2 == 4 || bVarI.A(t0k0Var);
                Object objY2 = bVarI.y();
                if (z4 || objY2 == c0042a2) {
                    zzj0 zzj0Var = new zzj0(1, t0k0Var, t0k0.class, "onTeamSelected", "onTeamSelected(Lcom/sporty/android/core/model/worldcuptournament/WorldCupTeam;)Lkotlinx/coroutines/Job;", 8);
                    bVarI.r(zzj0Var);
                    objY2 = zzj0Var;
                }
                Function1 function2 = (Function1) objY2;
                boolean z5 = i2 == 4 || bVarI.A(t0k0Var);
                Object objY3 = bVarI.y();
                if (z5 || objY3 == c0042a2) {
                    a0k0 a0k0Var = new a0k0(1, t0k0Var, t0k0.class, "onEventClick", "onEventClick(Lcom/sportybet/plugin/realsports/data/Event;)V", 0);
                    bVarI.r(a0k0Var);
                    objY3 = a0k0Var;
                }
                Function1 function3 = (Function1) ((chp) objY3);
                boolean z6 = i2 == 4 || bVarI.A(t0k0Var);
                Object objY4 = bVarI.y();
                if (z6 || objY4 == c0042a2) {
                    b0k0 b0k0Var = new b0k0(1, t0k0Var, t0k0.class, "onStatsClick", "onStatsClick(Lcom/sportybet/plugin/realsports/data/Event;)Lkotlinx/coroutines/Job;", 8);
                    bVarI.r(b0k0Var);
                    objY4 = b0k0Var;
                }
                Function1 function4 = (Function1) objY4;
                boolean z7 = i2 == 4 || bVarI.A(t0k0Var);
                Object objY5 = bVarI.y();
                if (z7 || objY5 == c0042a2) {
                    c0k0 c0k0Var = new c0k0(1, t0k0Var, t0k0.class, "onGameClick", "onGameClick(Lcom/sportybet/feature/worldcup/config/domain/model/WorldCupRelatedGame;)V", 0);
                    bVarI.r(c0k0Var);
                    objY5 = c0k0Var;
                }
                Function1 function5 = (Function1) ((chp) objY5);
                boolean z8 = i2 == 4 || bVarI.A(t0k0Var);
                Object objY6 = bVarI.y();
                if (z8 || objY6 == c0042a2) {
                    d0k0 d0k0Var = new d0k0(0, t0k0Var, t0k0.class, "onViewAllGamesClick", "onViewAllGamesClick()V", 0);
                    bVarI.r(d0k0Var);
                    objY6 = d0k0Var;
                }
                Function0 function0 = (Function0) ((chp) objY6);
                boolean z9 = i2 == 4 || bVarI.A(t0k0Var);
                Object objY7 = bVarI.y();
                if (z9 || objY7 == c0042a2) {
                    e0k0 e0k0Var = new e0k0(5, t0k0Var, t0k0.class, "onOutcomeClick", "onOutcomeClick(Lcom/sportybet/plugin/realsports/data/Event;Lcom/sportybet/plugin/realsports/data/Market;Lcom/sportybet/plugin/realsports/data/Outcome;ZZ)Z", 0);
                    bVarI.r(e0k0Var);
                    objY7 = e0k0Var;
                }
                jaj jajVar = (jaj) ((chp) objY7);
                boolean z10 = i2 == 4 || bVarI.A(t0k0Var);
                Object objY8 = bVarI.y();
                if (z10 || objY8 == c0042a2) {
                    f0k0 f0k0Var = new f0k0(3, t0k0Var, t0k0.class, "getOutcomeButtonState", "getOutcomeButtonState(Lcom/sportybet/plugin/realsports/data/Event;Lcom/sportybet/plugin/realsports/data/Market;Lcom/sportybet/plugin/realsports/data/Outcome;)Lcom/sportybet/plugin/realsports/ui/event/OutcomeButtonState;", 0);
                    bVarI.r(f0k0Var);
                    objY8 = f0k0Var;
                }
                gaj gajVar = (gaj) ((chp) objY8);
                boolean z11 = i2 == 4 || bVarI.A(t0k0Var);
                Object objY9 = bVarI.y();
                if (z11 || objY9 == c0042a2) {
                    g0k0 g0k0Var = new g0k0(0, t0k0Var, t0k0.class, "onRetryClick", "onRetryClick()V", 0);
                    bVarI.r(g0k0Var);
                    objY9 = g0k0Var;
                }
                Function0 function6 = (Function0) ((chp) objY9);
                boolean z12 = i2 == 4 || bVarI.A(t0k0Var);
                Object objY10 = bVarI.y();
                if (z12 || objY10 == c0042a2) {
                    vzj0 vzj0Var = new vzj0(0, t0k0Var, t0k0.class, "onGoToTournamentClick", "onGoToTournamentClick()Lkotlinx/coroutines/Job;", 8);
                    bVarI.r(vzj0Var);
                    objY10 = vzj0Var;
                }
                Function0 function7 = (Function0) objY10;
                boolean z13 = i2 == 4 || bVarI.A(t0k0Var);
                Object objY11 = bVarI.y();
                if (z13 || objY11 == c0042a2) {
                    wzj0 wzj0Var = new wzj0(1, t0k0Var, t0k0.class, "onExpandClick", "onExpandClick(Z)V", 0);
                    bVarI.r(wzj0Var);
                    objY11 = wzj0Var;
                }
                Function1 function8 = (Function1) ((chp) objY11);
                ox4 ox4Var = (ox4) ytwVarC2.getValue();
                int i5 = i3 & 112;
                boolean z14 = i5 == 32 || bVarI.A(tchVar);
                Object objY12 = bVarI.y();
                if (z14 || objY12 == c0042a2) {
                    objY12 = new Function1() { // from class: szj0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String str = (String) obj;
                            str.getClass();
                            tchVar.B1(new ez4.a(str, 0));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY12);
                }
                Function1 function9 = (Function1) objY12;
                boolean z15 = i5 == 32 || bVarI.A(tchVar);
                Object objY13 = bVarI.y();
                if (z15 || objY13 == c0042a2) {
                    objY13 = new ucz(tchVar, 2);
                    bVarI.r(objY13);
                }
                Function1 function10 = (Function1) objY13;
                boolean z16 = i5 == 32 || bVarI.A(tchVar);
                Object objY14 = bVarI.y();
                if (z16 || objY14 == c0042a2) {
                    objY14 = new erb0(tchVar);
                    bVarI.r(objY14);
                }
                Function1 function11 = (Function1) objY14;
                boolean z17 = i2 == 4 || bVarI.A(t0k0Var);
                Object objY15 = bVarI.y();
                if (z17 || objY15 == c0042a2) {
                    xzj0 xzj0Var = new xzj0(0, t0k0Var, t0k0.class, "onDiscoverMoreBookingCodesClick", "onDiscoverMoreBookingCodesClick()Lkotlinx/coroutines/Job;", 8);
                    bVarI.r(xzj0Var);
                    objY15 = xzj0Var;
                }
                c0042a = c0042a2;
                z = false;
                e(n0k0Var, function1, function2, function3, function4, function5, function0, jajVar, gajVar, function6, function7, function8, ucmVar, ox4Var, function9, function10, function11, (Function0) objY15, bVarI, 0);
                bVar = bVarI;
                bVar.X(false);
            }
            Activity activity = (Activity) bVar.O(zct.a);
            Unit unit = Unit.a;
            boolean zA = bVar.A(activity) | (((i3 & 14) == 4 || bVar.A(t0k0Var)) ? true : z);
            Object objY16 = bVar.y();
            if (zA || objY16 == c0042a) {
                objY16 = new yzj0(t0k0Var, activity, null);
                bVar.r(objY16);
            }
            xvf.e(bVar, unit, (Function2) objY16);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new uo7(i, 1, ucmVar, t0k0Var, tchVar);
        }
    }

    public static final void g(final uf00 uf00Var, final l0k0 l0k0Var, final boolean z, final boolean z2, final Function1 function1, final Function1 function2, final Function1 function3, final Function1 function4, final Function0 function0, final jaj jajVar, final gaj gajVar, final Function0 function5, final Function1 function6, final ucm ucmVar, final ox4 ox4Var, final Function1 function7, final Function1 function8, final Function1 function9, final Function0 function10, a aVar, final int i, final int i2) {
        int i3;
        int i4;
        b bVar;
        b bVarI = aVar.i(-2006244044);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? bVarI.M(uf00Var) : bVarI.A(uf00Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.d(l0k0Var == null ? -1 : l0k0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.b(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= bVarI.A(function2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= bVarI.A(function3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= bVarI.A(function4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= bVarI.A(function0) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= bVarI.A(jajVar) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (bVarI.A(gajVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.A(function5) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= bVarI.A(function6) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= bVarI.A(ucmVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= (32768 & i2) == 0 ? bVarI.M(ox4Var) : bVarI.A(ox4Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= bVarI.A(function7) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= bVarI.A(function8) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= bVarI.A(function9) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= bVarI.A(function10) ? 67108864 : 33554432;
        }
        int i5 = i3;
        if (bVarI.q(i5 & 1, ((i3 & 306783379) == 306783378 && (i4 & 38347923) == 38347922) ? false : true)) {
            Iterator<E> it = uf00Var.iterator();
            int i6 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i6 = -1;
                    break;
                } else if (((l5k0) it.next()).a() == l0k0Var) {
                    break;
                } else {
                    i6++;
                }
            }
            Integer numValueOf = Integer.valueOf(i6);
            if (i6 == -1) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            boolean z3 = (i5 & 14) == 4 || ((i5 & 8) != 0 && bVarI.A(uf00Var));
            Object objY = bVarI.y();
            boolean z4 = z3;
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z4 || objY == c0042a) {
                objY = new xm2(uf00Var, 1);
                bVarI.r(objY);
            }
            ved vedVarB = eqz.b(iIntValue, (Function0) objY, bVarI, 0, 2);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(Boolean.FALSE);
                bVarI.r(objY2);
            }
            final ytw ytwVar = (ytw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = xvf.i(kotlin.coroutines.e.a, bVarI);
                bVarI.r(objY3);
            }
            v5b v5bVar = (v5b) objY3;
            boolean zM = bVarI.M(vedVarB) | bVarI.d(iIntValue);
            Object objY4 = bVarI.y();
            if (zM || objY4 == c0042a) {
                objY4 = new h0k0(iIntValue, null, vedVarB);
                bVarI.r(objY4);
            }
            xvf.e(bVarI, l0k0Var, (Function2) objY4);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            bVarI.N(-2053371153);
            ArrayList arrayList = new ArrayList(l48.r(uf00Var, 10));
            Iterator<E> it2 = uf00Var.iterator();
            while (it2.hasNext()) {
                String strB = cb40.b(((l5k0) it2.next()).b(), new Object[0], bVarI);
                if (strB == null) {
                    strB = " ";
                }
                arrayList.add(strB);
            }
            bVarI.X(false);
            boolean zA = bVarI.A(v5bVar) | ((i5 & 57344) == 16384);
            Object objY5 = bVarI.y();
            if (zA || objY5 == c0042a) {
                objY5 = new yif0(1, v5bVar, function1);
                bVarI.r(objY5);
            }
            d(arrayList, vedVarB, (Function1) objY5, bVarI, 0);
            bVar = bVarI;
            dpz.a(0.0f, 0, 100663296, 16124, null, pp8.b(470642987, new iaj() { // from class: gzj0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.iaj
                public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                    int iIntValue2 = ((Integer) obj2).intValue();
                    a aVar4 = (a) obj3;
                    int iIntValue3 = ((Integer) obj4).intValue();
                    ((opz) obj).getClass();
                    if ((iIntValue3 & 48) == 0) {
                        iIntValue3 |= aVar4.d(iIntValue2) ? 32 : 16;
                    }
                    if (aVar4.q(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                        l5k0 l5k0Var = (l5k0) uf00Var.get(iIntValue2);
                        if (l5k0Var instanceof l5k0.b) {
                            aVar4.N(1316348638);
                            lkj.b(((l5k0.b) l5k0Var).e, function4, function0, aVar4, WorldCupRelatedGame.$stable);
                            aVar4.H();
                        } else {
                            boolean z5 = l5k0Var instanceof l5k0.c;
                            boolean z6 = z;
                            boolean z7 = z2;
                            Function0 function11 = function5;
                            if (z5) {
                                aVar4.N(-2142599665);
                                if (z6) {
                                    aVar4.N(-2142590892);
                                    k0k0.b(0, aVar4);
                                    aVar4.H();
                                } else if (z7) {
                                    aVar4.N(-2142505456);
                                    k0k0.a(function11, aVar4, 0);
                                    aVar4.H();
                                } else {
                                    l5k0.c cVar = (l5k0.c) l5k0Var;
                                    if (cVar.e.isEmpty()) {
                                        aVar4.N(-2142391748);
                                        k0k0.c(cb40.a(R.string.page_code_hub__no_world_cup_codes, new Object[0], aVar4), aVar4, 0);
                                        aVar4.H();
                                    } else {
                                        aVar4.N(-2142249458);
                                        j5k0.c(cVar.e, function10, ucmVar, ox4Var, function7, function8, function9, aVar4, 0);
                                        aVar4.H();
                                    }
                                }
                                aVar4.H();
                            } else if (z6) {
                                aVar4.N(1316388222);
                                k0k0.b(0, aVar4);
                                aVar4.H();
                            } else if (z7) {
                                aVar4.N(1316389762);
                                k0k0.a(function11, aVar4, 0);
                                aVar4.H();
                            } else if (l5k0Var instanceof l5k0.a) {
                                aVar4.N(1316393930);
                                l5k0.a aVar5 = (l5k0.a) l5k0Var;
                                if (aVar5.g.isEmpty()) {
                                    aVar4.N(-2141455145);
                                    k0k0.c(cb40.a(aVar5.h, new Object[0], aVar4), aVar4, 0);
                                    aVar4.H();
                                } else {
                                    aVar4.N(-2141334276);
                                    mfb0 mfb0Var = aVar5.e;
                                    RegularMarketRule regularMarketRule = aVar5.f;
                                    uf00<dtg> uf00Var2 = aVar5.g;
                                    final ytw ytwVar2 = ytwVar;
                                    boolean zBooleanValue = ((Boolean) ytwVar2.getValue()).booleanValue();
                                    final Function1 function12 = function6;
                                    boolean zM2 = aVar4.M(function12);
                                    Object objY6 = aVar4.y();
                                    if (zM2 || objY6 == a.C0041a.a) {
                                        objY6 = new Function1() { // from class: lzj0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj5) {
                                                Boolean bool = (Boolean) obj5;
                                                bool.booleanValue();
                                                ytwVar2.setValue(bool);
                                                function12.invoke(bool);
                                                return Unit.a;
                                            }
                                        };
                                        aVar4.r(objY6);
                                    }
                                    qpg.a(mfb0Var, regularMarketRule, uf00Var2, zBooleanValue, (Function1) objY6, function2, function3, jajVar, gajVar, aVar4, 512);
                                    aVar4 = aVar4;
                                    aVar4.H();
                                }
                                aVar4.H();
                            } else {
                                aVar4.N(-2140617897);
                                aVar4.H();
                            }
                        }
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVar), null, null, null, null, vedVarB, null, null, bVar, androidx.compose.animation.e.a(j.g(aVar2, 1.0f)), null, false);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: hzj0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    k0k0.g(uf00Var, l0k0Var, z, z2, function1, function2, function3, function4, function0, jajVar, gajVar, function5, function6, ucmVar, ox4Var, function7, function8, function9, function10, (a) obj, iA, iA2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(uf00<WorldCupTeam> uf00Var, WorldCupTeam worldCupTeam, Function1<? super WorldCupTeam, Unit> function1, final boolean z, final Function0<Unit> function0, a aVar, final int i) {
        Function1<? super WorldCupTeam, Unit> function2;
        WorldCupTeam worldCupTeam2;
        uf00<WorldCupTeam> uf00Var2;
        tsr.a aVar2;
        b bVarI = aVar.i(988623849);
        int i2 = (bVarI.A(uf00Var) ? 4 : 2) | i | (bVarI.A(worldCupTeam) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            d.a aVar3 = d.a.b;
            d dVarA = androidx.compose.foundation.layout.c.a(j.g(aVar3, 1.0f), 4.095238f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            crz crzVarA = erz.a(R.drawable.img_world_cup_banner, 0, bVarI);
            androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
            h9n.a(crzVarA, "banner", dVar2.f(aVar3), null, d0b.a.g, 0.0f, null, bVarI, 24624, 104);
            d dVarH = h.h(h.j(dVar2.f(aVar3), 0.0f, 12.0f, 0.0f, 16.0f, 5), 18.0f, 0.0f, 2);
            i78 i78VarA = g78.a(kw0.g, ht.a.m, bVarI, 6);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarH);
            bVarI.D();
            if (bVarI.S) {
                aVar2 = aVar4;
                bVarI.F(aVar2);
            } else {
                aVar2 = aVar4;
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            String strA = cb40.a(R.string.world_cup_tournament__title, new Object[0], bVarI);
            imf0 imf0VarL = mla.l(R.style.H1_SB, bVarI);
            List listK = kotlin.collections.b.k(new j58(r58.d(4294623505L)), new j58(c68.a(R.color.white, bVarI)));
            float f = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
            tsr.a aVar5 = aVar2;
            int i3 = i2;
            lkf0.d(strA, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.a(imf0VarL, new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), null, null, null, null, 33554430), bVarI, 0, 0, 131070);
            bVarI = bVarI;
            d dVarA2 = hib0.a(aVar3, 8.0f, bVarI, aVar3, 1.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarA2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            if (z) {
                bVarI.N(1378656574);
                xya.a(aVar3, false, cb40.a(R.string.world_cup_tournament__go_to_tournament, new Object[0], bVarI), null, sya.e, sya.a(c68.a(R.color.bg_warning_primary, bVarI), c68.a(R.color.bg_inverse_secondary, bVarI), 0L, 0L, bVarI, 24576, 12), null, null, k1a.a, function0, bVarI, 100663302 | ((i3 << 15) & 1879048192), 202);
                bVarI = bVarI;
                bVarI.X(false);
            } else {
                bVarI.N(1379605081);
                bVarI.X(false);
            }
            d040.a(1.0f, true, bVarI);
            uf00Var2 = uf00Var;
            worldCupTeam2 = worldCupTeam;
            function2 = function1;
            z8f0.d(uf00Var2, worldCupTeam2, function2, bVarI, i3 & 1022);
            f30.a(bVarI, true, true, true);
        } else {
            function2 = function1;
            worldCupTeam2 = worldCupTeam;
            uf00Var2 = uf00Var;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final uf00<WorldCupTeam> uf00Var3 = uf00Var2;
            final WorldCupTeam worldCupTeam3 = worldCupTeam2;
            final Function1<? super WorldCupTeam, Unit> function3 = function2;
            eVarZ.d = new Function2() { // from class: izj0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k0k0.h(uf00Var3, worldCupTeam3, function3, z, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
