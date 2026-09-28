package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o3s {
    public static final void a(int i, a aVar) {
        b bVar;
        b bVarI = aVar.i(625164457);
        if (bVarI.q(i & 1, i != 0)) {
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(j.i(j.g(aVar2, 1.0f), 28.0f), c68.a(R.color.line_type2_secondary, bVarI), zk40.a);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.d(cb40.a(R.string.page_instant_virtual__stats_popup_pos, new Object[0], bVarI), j.w(aVar2, 40.0f), c68.a(R.color.text_type2_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_B, bVarI), bVarI, 48, 0, 130040);
            ty0.a(bVarI, j.w(aVar2, 20.0f));
            lkf0.d(cb40.a(R.string.page_instant_virtual__stats_popup_team, new Object[0], bVarI), new LayoutWeightElement(1.0f, true), c68.a(R.color.text_type2_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_B, bVarI), bVarI, 0, 0, 130040);
            lkf0.d(cb40.a(R.string.page_instant_virtual__stats_popup_p, new Object[0], bVarI), j.w(aVar2, 32.0f), c68.a(R.color.text_type2_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_B, bVarI), bVarI, 48, 0, 130040);
            lkf0.d(cb40.a(R.string.page_instant_virtual__stats_popup_w, new Object[0], bVarI), j.w(aVar2, 32.0f), c68.a(R.color.text_type2_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_B, bVarI), bVarI, 48, 0, 130040);
            lkf0.d(cb40.a(R.string.page_instant_virtual__stats_popup_d, new Object[0], bVarI), j.w(aVar2, 32.0f), c68.a(R.color.text_type2_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_B, bVarI), bVarI, 48, 0, 130040);
            lkf0.d(cb40.a(R.string.page_instant_virtual__stats_popup_l, new Object[0], bVarI), j.w(aVar2, 32.0f), c68.a(R.color.text_type2_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_B, bVarI), bVarI, 48, 0, 130040);
            lkf0.d(cb40.a(R.string.page_instant_virtual__stats_popup_pts, new Object[0], bVarI), j.w(aVar2, 44.0f), c68.a(R.color.text_type2_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_B, bVarI), bVarI, 48, 0, 130040);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new f3s();
        }
    }

    public static final void b(final List list, int i, a aVar, final int i2) {
        final int i3;
        final osw oswVar;
        list.getClass();
        b bVarI = aVar.i(954024416);
        int i4 = i2 | (bVarI.M(list) ? 4 : 2) | (bVarI.d(i) ? 32 : 16);
        if (bVarI.q(i4 & 1, (i4 & 19) != 18)) {
            bVarI.A0();
            if ((i2 & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = k.a(0);
                bVarI.r(objY);
            }
            osw oswVar2 = (osw) objY;
            zp70 zp70VarA = op70.a(bVarI);
            Integer numValueOf = Integer.valueOf(oswVar2.D());
            boolean zM = bVarI.M(zp70VarA);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                objY2 = new m3s(zp70VarA, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, numValueOf, (Function2) objY2);
            n54.a aVar2 = ht.a.n;
            kw0.k kVar = kw0.c;
            i78 i78VarA = g78.a(kVar, aVar2, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar3 = d.a.b;
            d dVarC = c.c(bVarI, aVar3);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
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
            d dVarB = op70.b(h.h(h.j(j.g(aVar3, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13), 24.0f, 0.0f, 2), op70.a(bVarI), false, true, false);
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarB);
            bVarI.D();
            osw oswVar3 = oswVar2;
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            bVarI.N(1548085319);
            int size = list.size();
            final int i5 = 0;
            while (i5 < size) {
                String str = ((u2s) list.get(i5)).a;
                boolean z = oswVar3.D() == i5;
                boolean zD = bVarI.d(i5);
                Object objY3 = bVarI.y();
                if (zD || objY3 == c0042a) {
                    oswVar = oswVar3;
                    objY3 = new Function0() { // from class: k3s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            osw oswVar4 = oswVar;
                            int iD = oswVar4.D();
                            int i6 = i5;
                            if (i6 == iD) {
                                return Unit.a;
                            }
                            oswVar4.k(i6);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                } else {
                    oswVar = oswVar3;
                }
                c(0, bVarI, str, (Function0) objY3, z);
                i5++;
                oswVar3 = oswVar;
            }
            osw oswVar4 = oswVar3;
            bVarI.X(false);
            bVarI.X(true);
            ty0.a(bVarI, h.f(aVar3, 8.0f));
            d dVarA = zqu.a(1.0f, h.h(r3l.b(j.g(aVar3, 1.0f), zp70VarA, false, new wo70(4.0f, c68.a(R.color.line_type2_secondary, bVarI), Float.valueOf(zp70VarA.f.c() ? 1.0f : 0.0f), h.b(0.0f, 0.0f, 8.0f, 0.0f, 11), 8), 30), 24.0f, 0.0f, 2), true);
            i78 i78VarA2 = g78.a(kVar, ht.a.m, bVarI, 0);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, yka.a.f);
            hlh0.a(bVarI, ne00VarS3, yka.a.e);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
            }
            hlh0.a(bVarI, dVarC3, yka.a.d);
            a(0, bVarI);
            u2s u2sVar = (u2s) CollectionsKt.V(oswVar4.D(), list);
            List<u3s> list2 = u2sVar != null ? u2sVar.b : null;
            if (list2 == null) {
                bVarI.N(-1937314253);
                bVarI.X(false);
            } else {
                bVarI.N(-1937314252);
                bVarI.N(-2002155587);
                int size2 = list2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    d(list2.get(i6), bVarI, 0);
                }
                bVarI.X(false);
                Unit unit = Unit.a;
                bVarI.X(false);
            }
            i3 = i;
            lkf0.d(cb40.a(i3, new Object[0], bVarI), h.j(aVar3, 0.0f, 24.0f, 0.0f, 32.0f, 5), c68.a(R.color.text_type2_tertiary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 48, 0, 130040);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            i3 = i;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i3, i2, list) { // from class: l3s
                public final /* synthetic */ List a;
                public final /* synthetic */ int b;

                {
                    this.a = list;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    o3s.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final int i, a aVar, final String str, final Function0 function0, final boolean z) {
        long jA;
        b bVarI = aVar.i(661402249);
        int i2 = (bVarI.M(str) ? 4 : 2) | i | (bVarI.b(z) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            i060 i060VarC = j060.c(26.0f);
            alb0 alb0Var = sya.a;
            if (z) {
                jA = rzg.a(bVarI, -47590444, R.color.brand_secondary, bVarI, false);
            } else {
                bVarI.N(-47588716);
                bVarI.X(false);
                jA = j58.l;
            }
            nk5.a(function0, null, false, i060VarC, sya.a(jA, 0L, 0L, 0L, bVarI, 24576, 14), null, null, new umz(12.0f, 6.0f, 12.0f, 6.0f), null, pp8.b(1260514937, new gaj() { // from class: g3s
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        lkf0.d(str, null, c68.a(z ? R.color.brand_tertiary : R.color.text_type2_tertiary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 262138);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 6) & 14) | 817889280, 358);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, str, function0, z) { // from class: h3s
                public final /* synthetic */ String a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Function0 c;

                {
                    this.a = str;
                    this.b = z;
                    this.c = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o3s.c(qj40.a(1), (a) obj, this.a, this.c, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(u3s u3sVar, a aVar, int i) {
        long jA;
        yka.a.C1350a c1350a;
        boolean z;
        u3s u3sVar2 = u3sVar;
        b bVarI = aVar.i(-142110032);
        int i2 = i | (bVarI.M(u3sVar2) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            if (u3sVar2.a % 2 == 0) {
                jA = rzg.a(bVarI, 1237889746, R.color.line_type2_secondary, bVarI, false);
            } else {
                bVarI.N(1237958225);
                bVarI.X(false);
                jA = j58.l;
            }
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(j.i(j.g(aVar2, 1.0f), 36.0f), jA, zk40.a);
            kw0.j jVar = kw0.a;
            n54.b bVar = ht.a.k;
            d160 d160VarA = b160.a(jVar, bVar, bVarI, 48);
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
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            lkf0.d(String.valueOf(u3sVar2.a), j.w(aVar2, 40.0f), c68.a(R.color.text_type2_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 130040);
            d dVarW = j.w(aVar2, 20.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarW);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                c1350a = c1350a2;
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                c1350a = c1350a2;
            }
            hlh0.a(bVarI, dVarC2, cVar);
            int iOrdinal = u3sVar.b.ordinal();
            if (iOrdinal != 0) {
                z = true;
                if (iOrdinal == 1) {
                    bVarI.N(1168314708);
                    long jA2 = c68.a(R.color.brand_primary, bVarI);
                    Object objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = new e3s();
                        bVarI.r(objY);
                    }
                    e(48, 0, jA2, bVarI, androidx.compose.ui.graphics.a.a(aVar2, (Function1) objY));
                    bVarI.X(false);
                    Unit unit = Unit.a;
                } else {
                    if (iOrdinal != 2) {
                        throw igf0.a(bVarI, 1168309643, false);
                    }
                    bVarI.N(1858233001);
                    bVarI.X(false);
                    Unit unit2 = Unit.a;
                }
            } else {
                z = true;
                bVarI.N(1168311388);
                e(0, 2, c68.a(R.color.brand_quaternary, bVarI), bVarI, null);
                bVarI.X(false);
                Unit unit3 = Unit.a;
            }
            bVarI.X(z);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z);
            d160 d160VarA2 = b160.a(jVar, bVar, bVarI, 48);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, layoutWeightElement);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            boolean z2 = z;
            u3sVar2 = u3sVar;
            mw90.b(u3sVar.c, "Team logo", j.r(aVar2, 20.0f), erz.a(R.drawable.ic_default_team_logo_home, 0, bVarI), erz.a(R.drawable.ic_default_team_logo_home, 0, bVarI), null, null, null, null, 0.0f, null, bVarI, 432, 0, 32736);
            String str = u3sVar2.d;
            d dVarJ = h.j(aVar2, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            lkf0.d(str, dVarJ.n(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z2)), c68.a(R.color.text_type2_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 0, 0, 130040);
            bVarI.X(z2);
            lkf0.d(String.valueOf(u3sVar2.e), j.w(aVar2, 32.0f), c68.a(R.color.text_type2_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 130040);
            lkf0.d(String.valueOf(u3sVar2.f), j.w(aVar2, 32.0f), c68.a(R.color.text_type2_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 130040);
            lkf0.d(String.valueOf(u3sVar2.g), j.w(aVar2, 32.0f), c68.a(R.color.text_type2_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 130040);
            lkf0.d(String.valueOf(u3sVar2.h), j.w(aVar2, 32.0f), c68.a(R.color.text_type2_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 130040);
            lkf0.d(String.valueOf(u3sVar2.i), j.w(aVar2, 44.0f), c68.a(R.color.text_type2_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 130040);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new gjn(u3sVar2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:23:0x0040 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    public static final void e(final int i, final int i2, final long j, a aVar, d dVar) {
        d dVar2;
        boolean z;
        final d dVar3;
        e eVarZ;
        boolean z2;
        Object objY;
        b bVarI = aVar.i(-391256512);
        int i3 = (bVarI.e(j) ? 4 : 2) | i;
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                dVar2 = dVar;
                i3 |= bVarI.M(dVar2) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                if (i4 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                d dVarT = j.t(dVar3, 10.0f, 4.0f);
                z2 = (i3 & 14) == 4;
                objY = bVarI.y();
                if (z2 || objY == a.C0041a.a) {
                    objY = new Function1() { // from class: i3s
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            tcf tcfVar = (tcf) obj;
                            tcfVar.getClass();
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                            j90 j90VarA = m90.a();
                            j90VarA.a(0.0f, fIntBitsToFloat2);
                            j90VarA.c(fIntBitsToFloat, fIntBitsToFloat2);
                            j90VarA.c(fIntBitsToFloat / 2.0f, 0.0f);
                            j90VarA.close();
                            tcf.Q1(tcfVar, j90VarA, j, 0.0f, null, 60);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                rxo.b(dVarT, (Function1) objY, bVarI, 0);
            } else {
                bVarI.G();
                dVar3 = dVar2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: j3s
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        o3s.e(qj40.a(i | 1), i2, j, (a) obj, dVar3);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 48;
        dVar2 = dVar;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i3 & 1, z)) {
            if (i4 != 0) {
                dVar3 = d.a.b;
            } else {
                dVar3 = dVar2;
            }
            d dVarT2 = j.t(dVar3, 10.0f, 4.0f);
            if ((i3 & 14) == 4) {
            }
            objY = bVarI.y();
            if (z2) {
                objY = new Function1() { // from class: i3s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        tcf tcfVar = (tcf) obj;
                        tcfVar.getClass();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                        j90 j90VarA = m90.a();
                        j90VarA.a(0.0f, fIntBitsToFloat2);
                        j90VarA.c(fIntBitsToFloat, fIntBitsToFloat2);
                        j90VarA.c(fIntBitsToFloat / 2.0f, 0.0f);
                        j90VarA.close();
                        tcf.Q1(tcfVar, j90VarA, j, 0.0f, null, 60);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            } else {
                objY = new Function1() { // from class: i3s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        tcf tcfVar = (tcf) obj;
                        tcfVar.getClass();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                        j90 j90VarA = m90.a();
                        j90VarA.a(0.0f, fIntBitsToFloat2);
                        j90VarA.c(fIntBitsToFloat, fIntBitsToFloat2);
                        j90VarA.c(fIntBitsToFloat / 2.0f, 0.0f);
                        j90VarA.close();
                        tcf.Q1(tcfVar, j90VarA, j, 0.0f, null, 60);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            rxo.b(dVarT2, (Function1) objY, bVarI, 0);
        } else {
            bVarI.G();
            dVar3 = dVar2;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: j3s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o3s.e(qj40.a(i | 1), i2, j, (a) obj, dVar3);
                    return Unit.a;
                }
            };
        }
    }
}
