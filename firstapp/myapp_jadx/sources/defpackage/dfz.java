package defpackage;

import android.content.res.Configuration;
import android.view.View;
import android.widget.TextView;
import androidx.compose.animation.f;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class dfz {
    public static final void a(final int i, a aVar, final d dVar, final String str, final String str2) {
        str.getClass();
        str2.getClass();
        b bVarI = aVar.i(1368244988);
        int i2 = (bVarI.M(str) ? 4 : 2) | i | (bVarI.M(str2) ? 32 : 16) | (bVarI.d(R.drawable.ic_gift_vip) ? 256 : 128) | (bVarI.M(dVar) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            final imf0 imf0VarB = imf0.b(ni60.g(((sfd0) bVarI.O(ni60.b)).c, R.dimen._10ssp, bVarI), 0L, 0L, null, null, null, 0L, null, new ix80(4.0f, j58.c(0.55f, j58.b), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(3.0f)))), null, 0, 0L, null, null, 16769023);
            op8 op8VarB = pp8.b(1001486839, new gaj() { // from class: qez
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2;
                    o2i o2iVar = (o2i) obj;
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    o2iVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar3.M(o2iVar) ? 4 : 2;
                    }
                    if (aVar3.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        String string = StringsKt.t0(str).toString();
                        long j = j58.f;
                        t9i t9iVar = t9i.B;
                        d.a aVar4 = d.a.b;
                        n54.b bVar = ht.a.k;
                        d dVarB = o2iVar.b(aVar4, bVar);
                        gdf0 gdf0Var = new gdf0(3);
                        imf0 imf0Var = imf0VarB;
                        lkf0.b(string, dVarB, j, 0L, null, t9iVar, null, 0L, gdf0Var, 0L, 0, false, 2, 0, null, imf0Var, aVar3, 196992, 3072, 56792);
                        ty0.a(aVar2, j.w(aVar4, 4.0f));
                        h9n.a(erz.a(R.drawable.ic_gift_vip, 0, aVar2), "Gift", o2iVar.b(j.r(aVar4, 20.0f), bVar), ht.a.e, null, 0.0f, null, aVar2, 3120, 112);
                        String str3 = str2;
                        if (StringsKt.U(str3)) {
                            aVar2 = aVar3;
                            aVar2.N(-1861044245);
                        } else {
                            aVar2 = aVar3;
                            aVar2.N(-1842709543);
                            ty0.a(aVar2, j.w(aVar4, 4.0f));
                            lkf0.b(StringsKt.t0(str3).toString(), o2iVar.b(aVar4, bVar), j, 0L, null, t9i.E, null, 0L, new gdf0(3), 0L, 0, false, 1, 0, null, imf0Var, aVar2, 196992, 3072, 56792);
                            aVar2 = aVar2;
                        }
                        aVar2.H();
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            int i3 = ((i2 >> 9) & 14) | 1573296;
            kw0.c cVar = kw0.e;
            y1i.b(dVar, cVar, cVar, null, 0, 0, op8VarB, bVarI, i3, 56);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, str, str2) { // from class: rez
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ d c;

                {
                    this.a = str;
                    this.b = str2;
                    this.c = dVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    dfz.a(qj40.a(1), (a) obj, this.c, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final ypk ypkVar, a aVar, final int i) {
        int i2;
        ypkVar.getClass();
        b bVarI = aVar.i(1746141284);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(ypkVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        d.a aVar2 = d.a.b;
        if (i3 == 0) {
            i2 |= bVarI.M(aVar2) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarG = j.g(aVar2, 1.0f);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new vez();
                bVarI.r(objY);
            }
            Function1 function1 = (Function1) objY;
            boolean z = (i2 & 14) == 4;
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new wez(ypkVar, 0);
                bVarI.r(objY2);
            }
            androidx.compose.ui.viewinterop.b.a(function1, dVarG, (Function1) objY2, bVarI, 6, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xez
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    dfz.b(ypkVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final wdi0 wdi0Var, a aVar, final int i) {
        wdi0Var.getClass();
        b bVarI = aVar.i(1507883256);
        int i2 = (bVarI.M(wdi0Var) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.TRUE);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            if (!(wdi0Var instanceof wdi0.a)) {
                uhc.a();
                return;
            }
            wdi0.a aVar2 = (wdi0.a) wdi0Var;
            long j = aVar2.b;
            final String str = aVar2.a;
            final String str2 = aVar2.c;
            Boolean bool = Boolean.TRUE;
            boolean zE = bVarI.e(j);
            Object objY2 = bVarI.y();
            if (zE || objY2 == c0042a) {
                objY2 = new cfz(j, ytwVar, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, bool, (Function2) objY2);
            hh0.e(((Boolean) ytwVar.getValue()).booleanValue(), null, null, f.g(null, 3), null, pp8.b(1740832032, new gaj() { // from class: bfz
                /* JADX WARN: Code duplicated, block: B:72:0x03df  */
                /* JADX WARN: Code duplicated, block: B:74:0x0430  */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yka.a.d dVar;
                    yka.a.b bVar;
                    yka.a.c cVar;
                    n54 n54Var;
                    androidx.compose.foundation.layout.d dVar2;
                    String str3;
                    Object obj4;
                    float f;
                    d.a aVar3;
                    androidx.compose.foundation.layout.d dVar3;
                    n54 n54Var2;
                    Object obj5;
                    String str4;
                    a aVar4 = (a) obj2;
                    ((Integer) obj3).getClass();
                    ((jh0) obj).getClass();
                    d.a aVar5 = d.a.b;
                    d dVarA = j.A(j.g(aVar5, 0.94f), null, 3);
                    String str5 = str2;
                    d dVarA2 = d35.a(dVarA, 1.0f, Intrinsics.g(str5, "disable") ? abi0.u : abi0.t, j060.c(fw20.a(R.dimen._6sdp, aVar4)));
                    List listK = Intrinsics.g(str5, "disable") ? kotlin.collections.b.k(new j58(abi0.q), new j58(abi0.r)) : kotlin.collections.b.k(new j58(abi0.p), new j58(abi0.s));
                    float f2 = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
                    d dVarA3 = abk0.a(j.k(h.h(androidx.compose.foundation.a.a(dVarA2, new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), j060.c(fw20.a(R.dimen._6sdp, aVar4)), 0.0f, 4), fw20.a(R.dimen._8sdp, aVar4), 0.0f, 2), fw20.a(R.dimen._40sdp, aVar4), 0.0f, 2), 1.0f);
                    aiv aivVarC = g75.c(ht.a.a, false);
                    int iHashCode = Long.hashCode(aVar4.m());
                    ne00 ne00VarO = aVar4.o();
                    d dVarC = c.c(aVar4, dVarA3);
                    yka.k.getClass();
                    tsr.a aVar6 = yka.a.b;
                    if (aVar4.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar4.D();
                    if (aVar4.g()) {
                        aVar4.F(aVar6);
                    } else {
                        aVar4.p();
                    }
                    yka.a.b bVar2 = yka.a.f;
                    hlh0.a(aVar4, aivVarC, bVar2);
                    yka.a.d dVar4 = yka.a.e;
                    hlh0.a(aVar4, ne00VarO, dVar4);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar4, iHashCode, c1350a);
                    }
                    yka.a.c cVar2 = yka.a.d;
                    hlh0.a(aVar4, dVarC, cVar2);
                    boolean zG = Intrinsics.g(str5, "winner");
                    n54 n54Var3 = ht.a.d;
                    d0b.a.b bVar3 = d0b.a.g;
                    n54 n54Var4 = ht.a.e;
                    androidx.compose.foundation.layout.d dVar5 = androidx.compose.foundation.layout.d.a;
                    if (zG || Intrinsics.g(str5, "ended")) {
                        aVar4.N(1283743278);
                        dVar = dVar4;
                        bVar = bVar2;
                        cVar = cVar2;
                        n54Var = n54Var3;
                        dVar2 = dVar5;
                        str3 = str5;
                        mw90.a(com.sportygames.newcms.c.d(xai0.Q.i, "https://s.sporty.net/cms/lhs_2a69109e79.webp", aVar4), "last_hero_standing_toast", j.w(j.i(dVar5.b(aVar5, n54Var3), fw20.a(R.dimen._20sdp, aVar4)), fw20.a(R.dimen._54sdp, aVar4)), null, n54Var4, bVar3, null, aVar4, 1769520, 1944);
                        aVar4.H();
                    } else {
                        aVar4.N(1276789544);
                        aVar4.H();
                        dVar = dVar4;
                        cVar = cVar2;
                        str3 = str5;
                        bVar = bVar2;
                        n54Var = n54Var3;
                        dVar2 = dVar5;
                    }
                    if (Intrinsics.g(str3, "stake_win")) {
                        aVar4.N(1284412289);
                        d dVarW = j.w(j.i(g.d(dVar2.b(aVar5, n54Var), -fw20.a(R.dimen._6sdp, aVar4), 0.0f, 2), fw20.a(R.dimen._36sdp, aVar4)), fw20.a(R.dimen._42sdp, aVar4));
                        obj4 = "stake_win";
                        mw90.a(com.sportygames.newcms.c.d(xai0.Q.O, "https://s.sporty.net/cms/Stake_Safe_Logo_49bc0f774a.png", aVar4), "last_hero_standing_toast", dVarW, null, n54Var4, bVar3, null, aVar4, 1769520, 1944);
                        aVar4.H();
                    } else {
                        obj4 = "stake_win";
                        aVar4.N(1276789544);
                        aVar4.H();
                    }
                    boolean zG2 = Intrinsics.g(str3, "winner");
                    String str6 = str;
                    wdi0 wdi0Var2 = wdi0Var;
                    if (!zG2) {
                        if (Intrinsics.g(str3, obj4)) {
                            aVar4.N(1285547199);
                            dfz.f(0, aVar4, j.g(dVar2.b(aVar5, n54Var4), 1.0f), ((wdi0.a) wdi0Var2).d);
                            aVar4.H();
                        } else {
                            aVar4.N(1285900630);
                            d dVarI = j.i(j.g(dVar2.b(aVar5, n54Var4), 1.0f), fw20.a(R.dimen._40sdp, aVar4));
                            if (Intrinsics.g(str3, "stake_fbg") || Intrinsics.g(str3, "disable")) {
                                aVar4.N(1286173244);
                                aVar4.H();
                                f = 0.0f;
                            } else {
                                aVar4.N(1286255022);
                                float fA = fw20.a(R.dimen._54sdp, aVar4);
                                aVar4.H();
                                f = fA;
                            }
                            d dVarJ = h.j(dVarI, f, 0.0f, 0.0f, 0.0f, 14);
                            d160 d160VarA = b160.a(kw0.e, ht.a.k, aVar4, 54);
                            int iHashCode2 = Long.hashCode(aVar4.m());
                            ne00 ne00VarO2 = aVar4.o();
                            d dVarC2 = c.c(aVar4, dVarJ);
                            if (aVar4.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar4.D();
                            if (aVar4.g()) {
                                aVar4.F(aVar6);
                            } else {
                                aVar4.p();
                            }
                            hlh0.a(aVar4, d160VarA, bVar);
                            hlh0.a(aVar4, ne00VarO2, dVar);
                            if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar4, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar4, dVarC2, cVar);
                            long j2 = abi0.k;
                            long jF = d2l.f(8);
                            aVar3 = aVar5;
                            dVar3 = dVar2;
                            n54Var2 = n54Var4;
                            obj5 = obj4;
                            str4 = str3;
                            wf1.a(str6, h.g(j.g(new LayoutWeightElement(1.0f, true), 1.0f), 8.0f, 4.0f), ni60.g(((sfd0) aVar4.O(ni60.b)).c, R.dimen._12ssp, aVar4), 1, jF, new ix80(4.0f, j58.c(0.55f, j58.b), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(3.0f)) & 4294967295L)), 3, null, j2, aVar4, 224256, 128);
                            aVar4 = aVar4;
                            aVar4.s();
                            aVar4.H();
                        }
                        if (Intrinsics.g(str4, obj5)) {
                            aVar4.N(1287656098);
                            mw90.a(com.sportygames.newcms.c.d(xai0.Q.P, "https://s.sporty.net/cms/Stake_Safe_Logo_1_802f3ad69a.png", aVar4), "last_hero_standing_toast", j.w(j.i(g.d(dVar3.b(aVar3, ht.a.f), fw20.a(R.dimen._6sdp, aVar4), 0.0f, 2), fw20.a(R.dimen._36sdp, aVar4)), fw20.a(R.dimen._42sdp, aVar4)), null, n54Var2, bVar3, null, aVar4, 1769520, 1944);
                        } else {
                            aVar4.N(1276789544);
                        }
                        aVar4.H();
                        aVar4.s();
                        return Unit.a;
                    }
                    aVar4.N(1285116237);
                    dfz.a(0, aVar4, h.j(dVar2.b(j.g(aVar5, 1.0f), n54Var4), fw20.a(R.dimen._50sdp, aVar4), 0.0f, 0.0f, 0.0f, 14), str6, ((wdi0.a) wdi0Var2).d);
                    aVar4.H();
                    n54Var2 = n54Var4;
                    aVar3 = aVar5;
                    str4 = str3;
                    obj5 = obj4;
                    dVar3 = dVar2;
                    if (Intrinsics.g(str4, obj5)) {
                        aVar4.N(1287656098);
                        mw90.a(com.sportygames.newcms.c.d(xai0.Q.P, "https://s.sporty.net/cms/Stake_Safe_Logo_1_802f3ad69a.png", aVar4), "last_hero_standing_toast", j.w(j.i(g.d(dVar3.b(aVar3, ht.a.f), fw20.a(R.dimen._6sdp, aVar4), 0.0f, 2), fw20.a(R.dimen._36sdp, aVar4)), fw20.a(R.dimen._42sdp, aVar4)), null, n54Var2, bVar3, null, aVar4, 1769520, 1944);
                    } else {
                        aVar4.N(1276789544);
                    }
                    aVar4.H();
                    aVar4.s();
                    return Unit.a;
                }
            }, bVarI), bVarI, 199680, 22);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: pez
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(49);
                    dfz.c(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final ob30 ob30Var, final twd0 twd0Var, final Function0 function0, d dVar, a aVar, final int i) {
        b bVar;
        d dVar2;
        twd0Var.getClass();
        function0.getClass();
        b bVarI = aVar.i(-1454549545);
        int i2 = (bVarI.M(ob30Var) ? 4 : 2) | i | (bVarI.M(twd0Var) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128) | 3072;
        if (!bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
        } else {
            if (!((Boolean) twd0Var.getValue()).booleanValue()) {
                e eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new m1l(ob30Var, twd0Var, function0, i);
                    return;
                }
                return;
            }
            if (ob30Var instanceof ob30.a) {
                bVarI.N(-1957733211);
                b(((ob30.a) ob30Var).a, bVarI, 48);
                bVarI.X(false);
            } else {
                if (ob30Var instanceof ob30.c) {
                    bVarI.N(-1957730392);
                    e(((ob30.c) ob30Var).a, function0, bVarI, (i2 >> 3) & 1008);
                    bVarI.X(false);
                } else if (ob30Var instanceof ob30.b) {
                    bVarI.N(-559906752);
                    cov covVar = ((ob30.b) ob30Var).a;
                    String str = covVar.a;
                    boolean z = covVar.d;
                    long j = covVar.b;
                    long j2 = covVar.c;
                    long j3 = covVar.e;
                    int i3 = covVar.f;
                    Object objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = new tez();
                        bVarI.r(objY);
                    }
                    ska.a(str, z, j, j2, j3, i3, true, (Function0) objY, bVarI, 113270784);
                    bVar = bVarI;
                    bVar.X(false);
                } else {
                    bVar = bVarI;
                    if (!(ob30Var instanceof ob30.d)) {
                        throw igf0.a(bVar, -1957734099, false);
                    }
                    bVar.N(-1957710421);
                    c(((ob30.d) ob30Var).a, bVar, 48);
                    bVar.X(false);
                }
                dVar2 = d.a.b;
            }
            bVar = bVarI;
            dVar2 = d.a.b;
        }
        e eVarZ2 = bVar.Z();
        if (eVarZ2 != null) {
            final d dVar3 = dVar2;
            eVarZ2.d = new Function2(twd0Var, function0, dVar3, i) { // from class: uez
                public final /* synthetic */ twd0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ d d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    dfz.d(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final rv30 rv30Var, final Function0 function0, a aVar, final int i) {
        int i2;
        rv30Var.getClass();
        function0.getClass();
        b bVarI = aVar.i(-1073977136);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(rv30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        int i3 = i & 384;
        d.a aVar2 = d.a.b;
        if (i3 == 0) {
            i2 |= bVarI.M(aVar2) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            float f = ((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).screenHeightDp * (rv30Var instanceof rv30.b ? 0.07f : 0.11f);
            bVarI.C(-1299862580, jq40.a(rv30Var.getClass()).k());
            d dVarI = j.i(j.g(aVar2, 1.0f), f);
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new yez(rv30Var, 0);
                bVarI.r(objY);
            }
            Function1 function1 = (Function1) objY;
            boolean z2 = (i4 == 4) | ((i2 & 112) == 32);
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new Function1() { // from class: zez
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        View view = (View) obj;
                        rv30 rv30Var2 = rv30Var;
                        if (rv30Var2 instanceof rv30.c) {
                            ((TextView) view.findViewById(R.id.upcoming_rain_text)).setVisibility(0);
                            ((TextView) view.findViewById(R.id.active_rain_text)).setVisibility(8);
                            view.findViewById(R.id.layout_claim_button).setVisibility(8);
                            View viewFindViewById = view.findViewById(R.id.upcoming_rain_text);
                            viewFindViewById.getClass();
                            xn80.b((TextView) viewFindViewById, ((rv30.c) rv30Var2).a);
                        } else if (rv30Var2 instanceof rv30.a) {
                            ((TextView) view.findViewById(R.id.upcoming_rain_text)).setVisibility(8);
                            ((TextView) view.findViewById(R.id.active_rain_text)).setVisibility(0);
                            view.findViewById(R.id.layout_claim_button).setVisibility(0);
                            ((TextView) view.findViewById(R.id.claim_rain)).setVisibility(0);
                            View viewFindViewById2 = view.findViewById(R.id.active_rain_text);
                            viewFindViewById2.getClass();
                            rv30.a aVar3 = (rv30.a) rv30Var2;
                            xn80.b((TextView) viewFindViewById2, aVar3.a);
                            View viewFindViewById3 = view.findViewById(R.id.claim_rain);
                            viewFindViewById3.getClass();
                            xn80.b((TextView) viewFindViewById3, aVar3.b);
                            View viewFindViewById4 = view.findViewById(R.id.layout_claim_button);
                            viewFindViewById4.getClass();
                            gr60.a(viewFindViewById4, new ceg(function0, 1));
                        } else {
                            if (!(rv30Var2 instanceof rv30.b)) {
                                uhc.a();
                                return null;
                            }
                            View viewFindViewById5 = view.findViewById(R.id.rain_claim_result);
                            viewFindViewById5.getClass();
                            xn80.b((TextView) viewFindViewById5, ((rv30.b) rv30Var2).a);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            androidx.compose.ui.viewinterop.b.a(function1, dVarI, (Function1) objY2, bVarI, 0, 0);
            bVarI.X(false);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: afz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    dfz.e(rv30Var, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final int i, a aVar, final d dVar, final String str) {
        b bVar;
        b bVarI = aVar.i(1183733335);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(dVar) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            ix80 ix80Var = new ix80(8.0f, j58.c(0.3f, j58.b), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(2.0f)) & 4294967295L));
            op5.a.getClass();
            String strB = op5.b("stakesafe_saves:sg_vip", "Stakesafe saves the day!", null);
            String strB2 = op5.b("you_get_back:sg_vip", "You get back", null);
            kw0.c cVar = kw0.e;
            i78 i78VarA = g78.a(cVar, ht.a.n, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar2);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            String upperCase = strB.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            long j = j58.f;
            lkf0.b(upperCase, null, j, d2l.g(fw20.a(R.dimen._8ssp, bVarI), 4294967296L), null, t9i.D, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, new imf0(0L, 0L, null, null, null, 0L, null, ix80Var, 0, 0L, null, null, 16769023), bVarI, 196992, 1572864, 64978);
            d.a aVar3 = d.a.b;
            d dVarD = j.D(aVar3, null, 3);
            d160 d160VarA = b160.a(cVar, ht.a.k, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarD);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar2);
            lkf0.b(strB2, null, j, d2l.g(fw20.a(R.dimen._12ssp, bVarI), 4294967296L), null, t9i.B, null, 0L, null, 0L, 0, false, 0, 0, null, new imf0(0L, 0L, null, null, null, 0L, null, ix80Var, 0, 0L, null, null, 16769023), bVarI, 196992, 1572864, 65490);
            ty0.a(bVarI, j.r(aVar3, 3.0f));
            lkf0.b(str, null, abi0.w0, d2l.g(fw20.a(R.dimen._12ssp, bVarI), 4294967296L), null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, new imf0(0L, 0L, null, null, null, 0L, null, ix80Var, 0, 0L, null, null, 16769023), bVarI, (i2 & 14) | 196608, 1572864, 65490);
            bVar = bVarI;
            bVar.X(true);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, str) { // from class: sez
                public final /* synthetic */ String a;
                public final /* synthetic */ d b;

                {
                    this.a = str;
                    this.b = dVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    dfz.f(qj40.a(1), (a) obj, this.b, this.a);
                    return Unit.a;
                }
            };
        }
    }
}
