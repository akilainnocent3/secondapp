package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class d1n {
    public static final void a(final int i, final int i2, a aVar, final d dVar) {
        b bVarI = aVar.i(1169399076);
        int i3 = (bVarI.d(i) ? 4 : 2) | i2 | 48;
        int i4 = 1;
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            Integer numValueOf = Integer.valueOf(i);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new pxc(i4);
                bVarI.r(objY);
            }
            androidx.compose.animation.a.b(numValueOf, null, (Function1) objY, null, "main-score", null, pp8.b(655069550, new a1n(), bVarI), bVarI, (i3 & 14) | 1597824, 42);
            dVar = d.a.b;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2, dVar) { // from class: b1n
                public final /* synthetic */ int a;
                public final /* synthetic */ d b;

                {
                    this.b = dVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    d1n.a(this.a, iA, (a) obj, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final boolean z2, final boolean z3, final Function1<? super String, Unit> function1, final a4n.b bVar, final f3n f3nVar, a aVar, final int i) {
        int i2;
        int i3;
        yka.a.C1350a c1350a;
        function1.getClass();
        b bVarI = aVar.i(257513514);
        if ((i & 6) == 0) {
            i2 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        int i4 = i2 | ((i & 32768) == 0 ? bVarI.M(bVar) : bVarI.A(bVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(f3nVar) ? 131072 : 65536);
        if (bVarI.q(i4 & 1, (74899 & i4) != 74898)) {
            long jA = c68.a(f3nVar.b(bVar.g, doc.a(bVarI), z3), bVarI);
            d.a aVar2 = d.a.b;
            d dVarI = j.i(j.g(aVar2, 1.0f), 92.0f);
            zk40.a aVar3 = zk40.a;
            d dVarB = androidx.compose.foundation.a.b(dVarI, jA, aVar3);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new q0n();
                bVarI.r(objY);
            }
            d dVarB2 = xa80.b(dVarB, false, (Function1) objY);
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB2);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            n54 n54Var2 = ht.a.c;
            androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
            if (z) {
                bVarI.N(-566282690);
                g75.a(dVar2.b(h.j(androidx.compose.foundation.a.b(j.w(j.c(aVar2, 1.0f), 12.0f), c68.a(R.color.bg_brand_sub_primary_d_base, bVarI), aVar3), 0.0f, 0.0f, 0.0f, 1.0f, 7), n54Var), bVarI, 0);
                i3 = 0;
                g75.a(dVar2.b(h.j(androidx.compose.foundation.a.b(j.w(j.c(aVar2, 1.0f), 12.0f), c68.a(R.color.bg_brand_main_primary, bVarI), aVar3), 0.0f, 0.0f, 0.0f, 1.0f, 7), n54Var2), bVarI, 0);
                bVarI.X(false);
            } else {
                i3 = 0;
                bVarI.N(-565667650);
                bVarI.X(false);
            }
            crz crzVarA = erz.a(R.drawable.arrow_down, i3, bVarI);
            gf4 gf4Var = new gf4(c68.a(R.color.icon_secondary, bVarI), 5);
            d dVarR = j.r(h.f(aVar2, 20.0f), 16.0f);
            Float fValueOf = Float.valueOf(180.0f);
            if (!z2) {
                fValueOf = null;
            }
            d dVarB3 = dVar2.b(p1a.a(dVarR, fValueOf != null ? fValueOf.floatValue() : 0.0f), n54Var2);
            int i5 = 57344 & i4;
            boolean z4 = ((i4 & 7168) == 2048) | (i5 == 16384 || ((i4 & 32768) != 0 && bVarI.A(bVar)));
            Object objY2 = bVarI.y();
            if (z4 || objY2 == c0042a) {
                objY2 = new Function0() { // from class: v0n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(bVar.a);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            h9n.a(crzVarA, null, g3w.h(g3w.f(dVarB3, true, (Function0) objY2), "expand_toggle_button"), null, null, 0.0f, gf4Var, bVarI, 48, 56);
            d dVarB4 = dVar2.b(h.j(aVar2, 0.0f, 16.0f, 0.0f, 0.0f, 13), ht.a.b);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarB4);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                c1350a = c1350a2;
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                c1350a = c1350a2;
            }
            hlh0.a(bVarI, dVarC2, cVar);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            mw90.b(bVar.d, null, g3w.h(j.r(aVar2, 24.0f), "home_team_logo_image"), erz.a(R.drawable.ic_default_team_logo_home, 0, bVarI), null, null, null, null, null, 0.0f, null, bVarI, 432, 0, 32752);
            lkf0.d(bVar.c, g3w.h(h.h(aVar2, 8.0f, 0.0f, 2), "home_team_name_text"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_B, bVarI), bVarI, 48, 0, 131064);
            a(bVar.m, 0, bVarI, null);
            lkf0.d(cb40.a(R.string.bet_history__vs, new Object[0], bVarI), g3w.h(h.h(aVar2, 16.0f, 0.0f, 2), "vs_text"), c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, 48, 0, 131064);
            a(bVar.n, 0, bVarI, null);
            lkf0.d(bVar.e, g3w.h(h.h(aVar2, 8.0f, 0.0f, 2), "away_team_name_text"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_B, bVarI), bVarI, 48, 0, 131064);
            mw90.b(bVar.f, null, g3w.h(j.r(aVar2, 24.0f), "away_team_logo_image"), erz.a(R.drawable.ic_default_team_logo_away, 0, bVarI), null, null, null, null, null, 0.0f, null, bVarI, 432, 0, 32752);
            bVarI.X(true);
            kw0.i iVar = new kw0.i(6.0f, true, new hw0());
            d dVarA = k78.a(ht.a.n, h.j(aVar2, 0.0f, 12.0f, 0.0f, 0.0f, 13));
            boolean z5 = i5 == 16384 || ((i4 & 32768) != 0 && bVarI.A(bVar));
            Object objY3 = bVarI.y();
            if (z5 || objY3 == c0042a) {
                objY3 = new Function1() { // from class: w0n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        final a4n.b bVar3 = bVar;
                        szr.h(szrVar, null, new op8(579643089, new gaj() { // from class: y0n
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                a aVar5 = (a) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                ((gwr) obj2).getClass();
                                if (aVar5.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    i78 i78VarA2 = g78.a(kw0.c, ht.a.m, aVar5, 0);
                                    int iHashCode4 = Long.hashCode(aVar5.m());
                                    ne00 ne00VarO = aVar5.o();
                                    d.a aVar6 = d.a.b;
                                    d dVarC4 = c.c(aVar5, aVar6);
                                    yka.k.getClass();
                                    tsr.a aVar7 = yka.a.b;
                                    if (aVar5.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar5.D();
                                    if (aVar5.g()) {
                                        aVar5.F(aVar7);
                                    } else {
                                        aVar5.p();
                                    }
                                    hlh0.a(aVar5, i78VarA2, yka.a.f);
                                    hlh0.a(aVar5, ne00VarO, yka.a.e);
                                    yka.a.C1350a c1350a3 = yka.a.g;
                                    if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode4))) {
                                        j3c.a(iHashCode4, aVar5, iHashCode4, c1350a3);
                                    }
                                    hlh0.a(aVar5, dVarC4, yka.a.d);
                                    a4n.b bVar4 = bVar3;
                                    lkf0.d(bVar4.c, g3w.h(h.h(aVar6, 8.0f, 0.0f, 2), "home_team_name_label_text"), c68.a(R.color.text_primary, aVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, aVar5), aVar5, 48, 0, 131064);
                                    lkf0.d(bVar4.e, g3w.h(h.h(aVar6, 8.0f, 0.0f, 2), "away_team_name_label_text"), c68.a(R.color.text_primary, aVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, aVar5), aVar5, 48, 0, 131064);
                                    aVar5.s();
                                } else {
                                    aVar5.G();
                                }
                                return Unit.a;
                            }
                        }, true), 3);
                        szr.h(szrVar, null, new op8(1575041736, new gaj() { // from class: z0n
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                a aVar5 = (a) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                ((gwr) obj2).getClass();
                                if (aVar5.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    a4n.b bVar4 = bVar3;
                                    d1n.c(bVar4.o, bVar4.p, aVar5, 0);
                                } else {
                                    aVar5.G();
                                }
                                return Unit.a;
                            }
                        }, true), 3);
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            aur.b(dVarA, null, null, iVar, null, null, false, null, (Function1) objY3, bVarI, 24576, 494);
            bVarI = bVarI;
            bVarI.X(true);
            ute.b(dVar2.b(j.g(aVar2, 1.0f), ht.a.h), 1.0f, c68.a(R.color.border_primary, bVarI), bVarI, 48, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: x0n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d1n.b(z, z2, z3, function1, bVar, f3nVar, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final List<String> list, final List<String> list2, a aVar, final int i) {
        b bVarI = aVar.i(1085918835);
        int i2 = (bVarI.M(list) ? 4 : 2) | i | (bVarI.M(list2) ? 32 : 16);
        int i3 = 0;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d160 d160VarA = b160.a(new kw0.i(6.0f, true, new hw0()), ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, d.a.b);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            bVarI.N(56945111);
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Pair pair = new Pair(list.get(i4), list2.get(i4));
                Object objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = new r0n(i3);
                    bVarI.r(objY);
                }
                androidx.compose.animation.a.b(pair, null, (Function1) objY, null, hce0.a(i4, "quarter-score-"), null, o59.a, bVarI, 1573248, 42);
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, list, list2) { // from class: s0n
                public final /* synthetic */ List a;
                public final /* synthetic */ List b;

                {
                    this.a = list;
                    this.b = list2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    d1n.c(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final String str, String str2, a aVar, final int i) {
        final String str3;
        b bVar;
        b bVarI = aVar.i(-1225931263);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
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
            lkf0.d(str, g3w.h(j.w(aVar2, 20.0f), "home_quarter_score_text"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, (i2 & 14) | 48, 0, 130040);
            str3 = str2;
            lkf0.d(str3, g3w.h(j.w(aVar2, 20.0f), "away_quarter_score_text"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, ((i2 >> 3) & 14) | 48, 0, 130040);
            bVar = bVarI;
            bVar.X(true);
        } else {
            str3 = str2;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str3, i) { // from class: u0n
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    d1n.d(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
