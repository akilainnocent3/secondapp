package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import com.sportygames.campaign.data.model.TournamentJoinConfirmationData;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class k8g0 {

    public static final class a implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public a(List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final class b implements iaj<gwr, Integer, androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ List a;
        public final /* synthetic */ b5 b;

        public b(List list, b5 b5Var) {
            this.a = list;
            this.b = b5Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.iaj
        public final Unit d(gwr gwrVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            gwr gwrVar2 = gwrVar;
            int iIntValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= aVar2.d(iIntValue) ? 32 : 16;
            }
            if (aVar2.q(i & 1, (i & 147) != 146)) {
                Pair pair = (Pair) this.a.get(iIntValue);
                aVar2.N(-957793797);
                String str = (String) pair.a;
                String str2 = (String) pair.b;
                d dVarG = h.g(androidx.compose.foundation.a.b(j.g(d.a.b, 1.0f), iIntValue % 2 == 0 ? j58.c(0.04f, j58.f) : b6g0.e, zk40.a), pi60.a(R.dimen._19sdp, 6, aVar2), 6.0f);
                d160 d160VarA = b160.a(kw0.g, ht.a.j, aVar2, 6);
                int iHashCode = Long.hashCode(aVar2.m());
                ne00 ne00VarO = aVar2.o();
                d dVarC = c.c(aVar2, dVarG);
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
                hlh0.a(aVar2, d160VarA, yka.a.f);
                hlh0.a(aVar2, ne00VarO, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                    j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                }
                hlh0.a(aVar2, dVarC, yka.a.d);
                long j = j58.f;
                qyd0 qyd0Var = pi60.a;
                lkf0.b(str, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar2.O(qyd0Var)).d, R.dimen._10ssp, aVar2), aVar2, 384, 0, 65530);
                String strB = "--";
                if (!Intrinsics.g(str2, "--")) {
                    int i2 = rw.a;
                    strB = rw.b(this.b, str2);
                }
                lkf0.b(strB, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar2.O(qyd0Var)).d, R.dimen._10ssp, aVar2), aVar2, 384, 0, 65530);
                aVar2.s();
                aVar2.H();
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final void a(final String str, final String str2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        str.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-1398913145);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            long j = j58.f;
            d dVarG2 = h.g(androidx.compose.foundation.a.b(dVarG, j58.c(0.04f, j), j060.c(4.0f)), pi60.a(R.dimen._18sdp, 6, bVarI), pi60.a(R.dimen._5sdp, 6, bVarI));
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG2);
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
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            qyd0 qyd0Var = pi60.a;
            lkf0.b(upperCase, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) bVarI.O(qyd0Var)).b, R.dimen._9ssp, bVarI), bVarI, 384, 0, 65530);
            ty0.a(bVarI, j.i(aVar2, 3.0f));
            lkf0.b(str2, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) bVarI.O(qyd0Var)).d, R.dimen._11ssp, bVarI), bVarI, ((i2 >> 3) & 14) | 384, 0, 65530);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, i) { // from class: z7g0
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    k8g0.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final List<Pair<String, String>> list, final String str, final boolean z, final boolean z2, final b5 b5Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        float f;
        androidx.compose.runtime.b bVarI = aVar.i(182567517);
        int i2 = i | (bVarI.A(list) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.b(z2) ? 2048 : 1024) | (bVarI.A(b5Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9235) != 9234)) {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            if (displayMetrics.heightPixels / displayMetrics.density >= 750.0f || !z2) {
                bVarI.N(1440684722);
                f = ((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).screenHeightDp * 0.2f;
                bVarI.X(false);
            } else {
                bVarI.N(1440596434);
                f = ((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).screenHeightDp * 0.1f;
                bVarI.X(false);
            }
            d dVarI = j.i(d.a.b, f);
            boolean zA = bVarI.A(list) | ((i2 & 112) == 32) | bVarI.A(b5Var);
            Object objY = bVarI.y();
            if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: b8g0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        final String str2 = str;
                        szr.h(szrVar, null, new op8(753720050, new gaj() { // from class: j7g0
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                a aVar2 = (a) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                ((gwr) obj2).getClass();
                                if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    d.a aVar3 = d.a.b;
                                    d dVarJ = h.j(j.g(aVar3, 1.0f), pi60.a(R.dimen._19sdp, 6, aVar2), 0.0f, 0.0f, 0.0f, 14);
                                    d160 d160VarA = b160.a(kw0.g, ht.a.j, aVar2, 6);
                                    int iHashCode = Long.hashCode(aVar2.m());
                                    ne00 ne00VarO = aVar2.o();
                                    d dVarC = c.c(aVar2, dVarJ);
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
                                    hlh0.a(aVar2, d160VarA, bVar2);
                                    yka.a.d dVar = yka.a.e;
                                    hlh0.a(aVar2, ne00VarO, dVar);
                                    yka.a.C1350a c1350a = yka.a.g;
                                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                    }
                                    yka.a.c cVar = yka.a.d;
                                    hlh0.a(aVar2, dVarC, cVar);
                                    v5g0 v5g0Var = v5g0.Z;
                                    String strD = com.sportygames.newcms.c.d(v5g0Var.r, "Rank", aVar2);
                                    Locale locale = Locale.ROOT;
                                    String upperCase = strD.toUpperCase(locale);
                                    upperCase.getClass();
                                    long j = j58.f;
                                    long jC = j58.c(0.6f, j);
                                    qyd0 qyd0Var = pi60.a;
                                    lkf0.b(upperCase, null, jC, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar2.O(qyd0Var)).b, R.dimen._9ssp, aVar2), aVar2, 384, 0, 65530);
                                    d dVarJ2 = h.j(aVar3, 0.0f, 0.0f, 24.0f, 0.0f, 11);
                                    d160 d160VarA2 = b160.a(kw0.a, ht.a.k, aVar2, 48);
                                    int iHashCode2 = Long.hashCode(aVar2.m());
                                    ne00 ne00VarO2 = aVar2.o();
                                    d dVarC2 = c.c(aVar2, dVarJ2);
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
                                    hlh0.a(aVar2, d160VarA2, bVar2);
                                    hlh0.a(aVar2, ne00VarO2, dVar);
                                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                        j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                                    }
                                    hlh0.a(aVar2, dVarC2, cVar);
                                    String upperCase2 = com.sportygames.newcms.c.d(v5g0Var.j, "Prize", aVar2).toUpperCase(locale);
                                    upperCase2.getClass();
                                    lkf0.b(upperCase2, null, j58.c(0.6f, j), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar2.O(qyd0Var)).b, R.dimen._9ssp, aVar2), aVar2, 384, 0, 65530);
                                    ty0.a(aVar2, j.w(aVar3, 4.0f));
                                    lkf0.b("(IN " + str2 + ')', null, j58.c(0.6f, j), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar2.O(qyd0Var)).h, R.dimen._7ssp, aVar2), aVar2, 384, 0, 65530);
                                    aVar2.s();
                                    aVar2.s();
                                    ty0.a(aVar2, j.i(aVar3, 5.0f));
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, true), 3);
                        List list2 = list;
                        szrVar.d(list2.size(), null, new k8g0.a(list2), new op8(2039820996, new k8g0.b(list2, b5Var), true));
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            bVar = bVarI;
            aur.a(dVarI, null, null, false, null, null, null, false, null, (Function1) objY, bVar, 0, 510);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(list, str, z, z2, b5Var, i) { // from class: d8g0
                public final /* synthetic */ List a;
                public final /* synthetic */ String b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ b5 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    k8g0.b(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final TournamentJoinConfirmationData tournamentJoinConfirmationData, final Function0 function0, final Function0 function1, final Function0 function2, final String str, final j58 j58Var, final List list, final Function0 function3, final Function0 function4, final boolean z, final float f, final int i, final aig0 aig0Var, final boolean z2, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1806097767);
        if ((i2 & 6) == 0) {
            i4 = (bVarI.A(tournamentJoinConfirmationData) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= bVarI.A(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= bVarI.A(function2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= bVarI.M(str) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= bVarI.M(j58Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= bVarI.A(list) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= bVarI.A(function3) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= bVarI.A(function4) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 = i4 | (bVarI.b(z) ? 536870912 : 268435456);
        } else {
            i5 = i4;
        }
        if ((i3 & 6) == 0) {
            i6 = (bVarI.c(f) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= bVarI.d(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= bVarI.A(aig0Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= bVarI.b(z2) ? 2048 : 1024;
        }
        if (bVarI.q(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 1171) == 1170) ? false : true)) {
            bVarI.A0();
            if ((i2 & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            bVarI.N(-1168520582);
            qn70 qn70VarB = orp.b(bVarI);
            bVarI.N(-1633490746);
            boolean zM = bVarI.M(null) | bVarI.M(qn70VarB);
            Object objY = bVarI.y();
            if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = qn70VarB.a(jq40.a(b5.class), null, null);
                bVarI.r(objY);
            }
            bVarI.X(false);
            bVarI.X(false);
            final b5 b5Var = (b5) objY;
            com.sportygames.newcms.c.a((com.sportygames.newcms.b) n95.a(aig0Var.w, new com.sportygames.newcms.b(0), null, bVarI, 0, 2).getValue(), pp8.b(496047008, new Function2() { // from class: l7g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    tsr.a aVar2;
                    yka.a.C1350a c1350a;
                    String strD;
                    float fA;
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Object objY2 = aVar3.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (objY2 == c0042a) {
                            objY2 = k.a(0);
                            aVar3.r(objY2);
                        }
                        final osw oswVar = (osw) objY2;
                        v5g0 v5g0Var = v5g0.Z;
                        final List listK = b.k(com.sportygames.newcms.c.d(v5g0Var.J, "Prizes", aVar3), com.sportygames.newcms.c.d(v5g0Var.K, "Terms & Conditions", aVar3));
                        List list2 = list;
                        boolean zIsEmpty = list2.isEmpty();
                        final boolean z3 = !zIsEmpty;
                        d.a aVar4 = d.a.b;
                        d dVarB = androidx.compose.foundation.a.b(j.e(aVar4, 1.0f), j58.c(0.3f, b6g0.r), zk40.a);
                        Unit unit = Unit.a;
                        Object objY3 = aVar3.y();
                        if (objY3 == c0042a) {
                            objY3 = l8g0.a;
                            aVar3.r(objY3);
                        }
                        d dVarA = wje0.a(dVarB, unit, (PointerInputEventHandler) objY3);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar3.m());
                        ne00 ne00VarO = aVar3.o();
                        d dVarC = c.c(aVar3, dVarA);
                        yka.k.getClass();
                        tsr.a aVar5 = yka.a.b;
                        if (aVar3.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar3.F(aVar5);
                        } else {
                            aVar3.p();
                        }
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar3, aivVarC, bVar);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar3, ne00VarO, dVar);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar3, iHashCode, c1350a2);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar3, dVarC, cVar);
                        Configuration configuration = (Configuration) aVar3.O(AndroidCompositionLocals_androidKt.a);
                        mmd mmdVar = (mmd) aVar3.O(kna.h);
                        float f2 = configuration.screenHeightDp;
                        final float fC1 = mmdVar.C1(f2);
                        Object[] objArr = new Object[0];
                        Object objY4 = aVar3.y();
                        if (objY4 == c0042a) {
                            objY4 = new o7g0();
                            aVar3.r(objY4);
                        }
                        final isw iswVar = (isw) o350.e(objArr, (Function0) objY4, aVar3, 48);
                        Object[] objArr2 = {Integer.valueOf(configuration.orientation)};
                        Object objY5 = aVar3.y();
                        if (objY5 == c0042a) {
                            objY5 = new p7g0();
                            aVar3.r(objY5);
                        }
                        final ytw ytwVar = (ytw) o350.e(objArr2, (Function0) objY5, aVar3, 48);
                        float fD = f.d((1.0f - iswVar.j()) - 0.05f, 0.0f, 1.0f);
                        androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
                        n54 n54Var = ht.a.h;
                        d dVarD = g.d(h.j(abk0.a(dVar2.b(aVar4, n54Var), 1.0f), 0.0f, 0.0f, 0.0f, iswVar.j() * f2, 7), 0.0f, pi60.a(R.dimen._minus25sdp, 6, aVar3), 1);
                        final Function0 function5 = function3;
                        boolean zM2 = aVar3.M(function5);
                        Object objY6 = aVar3.y();
                        if (zM2 || objY6 == c0042a) {
                            objY6 = new Function0() { // from class: r7g0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function5.invoke();
                                    return Unit.a;
                                }
                            };
                            aVar3.r(objY6);
                        }
                        Function0 function6 = (Function0) objY6;
                        Function0 function7 = function4;
                        boolean zM3 = aVar3.M(function7);
                        Object objY7 = aVar3.y();
                        if (zM3 || objY7 == c0042a) {
                            objY7 = new t5c(1, function7);
                            aVar3.r(objY7);
                        }
                        Function0 function8 = (Function0) objY7;
                        final boolean z4 = z;
                        j18.b(dVarD, str, j58Var, list2, function6, function8, !zIsEmpty || z4, (z4 && zIsEmpty) ? f : 0.0f, i, fD, aVar3, 0);
                        d dVarB2 = dVar2.b(j.g(aVar4, 1.0f), n54Var);
                        boolean zM4 = aVar3.M(ytwVar) | aVar3.c(fC1) | aVar3.M(iswVar);
                        Object objY8 = aVar3.y();
                        if (zM4 || objY8 == c0042a) {
                            objY8 = new Function1() { // from class: u7g0
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
                            aVar3.r(objY8);
                        }
                        d dVarA2 = v.a(dVarB2, (Function1) objY8);
                        WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
                        d dVarA3 = u8j0.a(u8j0.a(dVarA2, q8j0.a.a(aVar3).c), q8j0.a.a(aVar3).e);
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar3, 0);
                        int iHashCode2 = Long.hashCode(aVar3.m());
                        ne00 ne00VarO2 = aVar3.o();
                        d dVarC2 = c.c(aVar3, dVarA3);
                        if (aVar3.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar2 = aVar5;
                            aVar3.F(aVar2);
                        } else {
                            aVar2 = aVar5;
                            aVar3.p();
                        }
                        hlh0.a(aVar3, i78VarA, bVar);
                        hlh0.a(aVar3, ne00VarO2, dVar);
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                            c1350a = c1350a2;
                            j3c.a(iHashCode2, aVar3, iHashCode2, c1350a);
                        } else {
                            c1350a = c1350a2;
                        }
                        hlh0.a(aVar3, dVarC2, cVar);
                        d dVarG = j.g(aVar4, 1.0f);
                        aiv aivVarC2 = g75.c(ht.a.b, false);
                        int iHashCode3 = Long.hashCode(aVar3.m());
                        ne00 ne00VarO3 = aVar3.o();
                        d dVarC3 = c.c(aVar3, dVarG);
                        if (aVar3.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar3.F(aVar2);
                        } else {
                            aVar3.p();
                        }
                        hlh0.a(aVar3, aivVarC2, bVar);
                        hlh0.a(aVar3, ne00VarO3, dVar);
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode3))) {
                            j3c.a(iHashCode3, aVar3, iHashCode3, c1350a);
                        }
                        hlh0.a(aVar3, dVarC3, cVar);
                        final b5 b5Var2 = b5Var;
                        final TournamentJoinConfirmationData tournamentJoinConfirmationData2 = tournamentJoinConfirmationData;
                        final Function0 function9 = function0;
                        final Function0 function10 = function2;
                        final Function0 function11 = function1;
                        final boolean z5 = z2;
                        mig0.a(48, pp8.b(765973381, new Function2() { // from class: w7g0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar6 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    final b5 b5Var3 = b5Var2;
                                    final osw oswVar2 = oswVar;
                                    final TournamentJoinConfirmationData tournamentJoinConfirmationData3 = tournamentJoinConfirmationData2;
                                    final List list3 = listK;
                                    final Function0 function12 = function9;
                                    final Function0 function13 = function10;
                                    final Function0 function14 = function11;
                                    final boolean z6 = z5;
                                    final boolean z7 = z3;
                                    final boolean z8 = z4;
                                    t4g0.a(54, pp8.b(-2065837079, new Function2() { // from class: e7g0
                                        /* JADX WARN: Code duplicated, block: B:83:0x0372  */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Type inference failed for: r1v21 */
                                        /* JADX WARN: Type inference failed for: r1v22, types: [boolean, int] */
                                        /* JADX WARN: Type inference failed for: r1v74 */
                                        /* JADX WARN: Type inference failed for: r47v0 */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            String title;
                                            String amount;
                                            tsr.a aVar7;
                                            yka.a.C1350a c1350a3;
                                            v5g0 v5g0Var2;
                                            ?? r1;
                                            String startsIn;
                                            float f3;
                                            float f4;
                                            TournamentJoinConfirmationData tournamentJoinConfirmationData4;
                                            boolean z9;
                                            float f5;
                                            tsr.a aVar8;
                                            yka.a.C1350a c1350a4;
                                            List<Pair<String, String>> prizeListMap;
                                            String currency;
                                            String totalParticipants;
                                            a aVar9 = (a) obj5;
                                            int iIntValue3 = ((Integer) obj6).intValue();
                                            if (aVar9.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                d.a aVar10 = d.a.b;
                                                d dVarJ = h.j(j.g(aVar10, 1.0f), 0.0f, dp9.a(R.dimen._35sdp, 54, aVar9), 0.0f, 0.0f, 13);
                                                i78 i78VarA2 = g78.a(kw0.c, ht.a.n, aVar9, 48);
                                                int iHashCode4 = Long.hashCode(aVar9.m());
                                                ne00 ne00VarO4 = aVar9.o();
                                                d dVarC4 = c.c(aVar9, dVarJ);
                                                yka.k.getClass();
                                                tsr.a aVar11 = yka.a.b;
                                                if (aVar9.k() == null) {
                                                    l2a.b();
                                                    throw null;
                                                }
                                                aVar9.D();
                                                if (aVar9.g()) {
                                                    aVar9.F(aVar11);
                                                } else {
                                                    aVar9.p();
                                                }
                                                yka.a.b bVar2 = yka.a.f;
                                                hlh0.a(aVar9, i78VarA2, bVar2);
                                                yka.a.d dVar3 = yka.a.e;
                                                hlh0.a(aVar9, ne00VarO4, dVar3);
                                                yka.a.C1350a c1350a5 = yka.a.g;
                                                if (aVar9.g() || !Intrinsics.g(aVar9.y(), Integer.valueOf(iHashCode4))) {
                                                    j3c.a(iHashCode4, aVar9, iHashCode4, c1350a5);
                                                }
                                                yka.a.c cVar2 = yka.a.d;
                                                hlh0.a(aVar9, dVarC4, cVar2);
                                                TournamentJoinConfirmationData tournamentJoinConfirmationData5 = tournamentJoinConfirmationData3;
                                                if (tournamentJoinConfirmationData5 == null || (title = tournamentJoinConfirmationData5.getTitle()) == null) {
                                                    title = "";
                                                }
                                                final boolean z10 = z6;
                                                long j = z10 ? b6g0.b : b6g0.a;
                                                qyd0 qyd0Var = pi60.a;
                                                lkf0.b(title, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar9.O(qyd0Var)).f, R.dimen._19sdp, aVar9), aVar9, 0, 0, 65530);
                                                ty0.a(aVar9, j.i(aVar10, 4.0f));
                                                v5g0 v5g0Var3 = v5g0.Z;
                                                String strD2 = com.sportygames.newcms.c.d(v5g0Var3.H, "Collect points every cashout", aVar9);
                                                long j2 = j58.f;
                                                lkf0.b(strD2, null, j2, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar9.O(qyd0Var)).b, R.dimen._10ssp, aVar9), aVar9, 384, 0, 65530);
                                                ty0.a(aVar9, j.i(aVar10, dp9.a(R.dimen._12sdp, 54, aVar9)));
                                                String upperCase = com.sportygames.newcms.c.d(v5g0Var3.I, "Prize pool", aVar9).toUpperCase(Locale.ROOT);
                                                upperCase.getClass();
                                                lkf0.b(upperCase, null, j2, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar9.O(qyd0Var)).b, R.dimen._10ssp, aVar9), aVar9, 384, 0, 65530);
                                                ty0.a(aVar9, j.i(aVar10, 4.0f));
                                                if (tournamentJoinConfirmationData5 == null || (amount = tournamentJoinConfirmationData5.getAmount()) == null) {
                                                    amount = "";
                                                }
                                                lkf0.b(amount, null, j2, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, pi60.c(((ufd0) aVar9.O(qyd0Var)).d, R.dimen._20ssp, aVar9), aVar9, 384, 0, 65530);
                                                ty0.a(aVar9, j.i(aVar10, dp9.a(R.dimen._12sdp, 54, aVar9)));
                                                d dVarH = h.h(j.g(aVar10, 1.0f), dp9.a(R.dimen._9sdp, 54, aVar9), 0.0f, 2);
                                                kw0.f fVar = kw0.h;
                                                n54.b bVar3 = ht.a.j;
                                                d160 d160VarA = b160.a(fVar, bVar3, aVar9, 6);
                                                int iHashCode5 = Long.hashCode(aVar9.m());
                                                ne00 ne00VarO5 = aVar9.o();
                                                d dVarC5 = c.c(aVar9, dVarH);
                                                if (aVar9.k() == null) {
                                                    l2a.b();
                                                    throw null;
                                                }
                                                aVar9.D();
                                                if (aVar9.g()) {
                                                    aVar7 = aVar11;
                                                    aVar9.F(aVar7);
                                                } else {
                                                    aVar7 = aVar11;
                                                    aVar9.p();
                                                }
                                                hlh0.a(aVar9, d160VarA, bVar2);
                                                hlh0.a(aVar9, ne00VarO5, dVar3);
                                                if (aVar9.g() || !Intrinsics.g(aVar9.y(), Integer.valueOf(iHashCode5))) {
                                                    c1350a3 = c1350a5;
                                                    j3c.a(iHashCode5, aVar9, iHashCode5, c1350a3);
                                                } else {
                                                    c1350a3 = c1350a5;
                                                }
                                                hlh0.a(aVar9, dVarC5, cVar2);
                                                boolean zG = Intrinsics.g(tournamentJoinConfirmationData5 != null ? tournamentJoinConfirmationData5.getTotalParticipants() : null, "null");
                                                n54 n54Var2 = ht.a.a;
                                                f160 f160Var = f160.a;
                                                if (zG) {
                                                    v5g0Var2 = v5g0Var3;
                                                    r1 = 0;
                                                    aVar9.N(2010709075);
                                                } else {
                                                    String totalParticipants2 = tournamentJoinConfirmationData5 != null ? tournamentJoinConfirmationData5.getTotalParticipants() : null;
                                                    if (totalParticipants2 == null || totalParticipants2.length() == 0) {
                                                        v5g0Var2 = v5g0Var3;
                                                        r1 = 0;
                                                        aVar9.N(2010709075);
                                                    } else {
                                                        aVar9.N(2022760697);
                                                        d dVarA4 = f160Var.a(1.0f, aVar10, true);
                                                        r1 = 0;
                                                        aiv aivVarC3 = g75.c(n54Var2, false);
                                                        int iHashCode6 = Long.hashCode(aVar9.m());
                                                        ne00 ne00VarO6 = aVar9.o();
                                                        d dVarC6 = c.c(aVar9, dVarA4);
                                                        if (aVar9.k() == null) {
                                                            l2a.b();
                                                            throw null;
                                                        }
                                                        aVar9.D();
                                                        if (aVar9.g()) {
                                                            aVar9.F(aVar7);
                                                        } else {
                                                            aVar9.p();
                                                        }
                                                        hlh0.a(aVar9, aivVarC3, bVar2);
                                                        hlh0.a(aVar9, ne00VarO6, dVar3);
                                                        if (aVar9.g() || !Intrinsics.g(aVar9.y(), Integer.valueOf(iHashCode6))) {
                                                            j3c.a(iHashCode6, aVar9, iHashCode6, c1350a3);
                                                        }
                                                        hlh0.a(aVar9, dVarC6, cVar2);
                                                        v5g0Var2 = v5g0Var3;
                                                        String strD3 = com.sportygames.newcms.c.d(v5g0Var2.L, "Participants", aVar9);
                                                        if (tournamentJoinConfirmationData5 == null || (totalParticipants = tournamentJoinConfirmationData5.getTotalParticipants()) == null) {
                                                            totalParticipants = "--";
                                                        }
                                                        k8g0.a(strD3, totalParticipants, aVar9, 0);
                                                        aVar9.s();
                                                        ty0.a(aVar9, j.w(aVar10, dp9.a(R.dimen._9sdp, 54, aVar9)));
                                                    }
                                                }
                                                aVar9.H();
                                                d dVarA5 = f160Var.a(1.0f, aVar10, true);
                                                aiv aivVarC4 = g75.c(n54Var2, r1);
                                                int iHashCode7 = Long.hashCode(aVar9.m());
                                                ne00 ne00VarO7 = aVar9.o();
                                                d dVarC7 = c.c(aVar9, dVarA5);
                                                if (aVar9.k() == null) {
                                                    l2a.b();
                                                    throw null;
                                                }
                                                aVar9.D();
                                                if (aVar9.g()) {
                                                    aVar9.F(aVar7);
                                                } else {
                                                    aVar9.p();
                                                }
                                                hlh0.a(aVar9, aivVarC4, bVar2);
                                                hlh0.a(aVar9, ne00VarO7, dVar3);
                                                if (aVar9.g() || !Intrinsics.g(aVar9.y(), Integer.valueOf(iHashCode7))) {
                                                    j3c.a(iHashCode7, aVar9, iHashCode7, c1350a3);
                                                }
                                                hlh0.a(aVar9, dVarC7, cVar2);
                                                String strD4 = com.sportygames.newcms.c.d(v5g0Var2.M, "Starts in", aVar9);
                                                if (tournamentJoinConfirmationData5 == null || (startsIn = tournamentJoinConfirmationData5.getStartsIn()) == null) {
                                                    startsIn = "--";
                                                }
                                                k8g0.a(strD4, startsIn, aVar9, r1);
                                                aVar9.s();
                                                aVar9.s();
                                                ty0.a(aVar9, j.i(aVar10, 4.0f));
                                                final osw oswVar3 = oswVar2;
                                                int iD = oswVar3.D();
                                                long j3 = j58.l;
                                                op8 op8VarB = pp8.b(1261049883, new dwg(oswVar3, 1), aVar9);
                                                final List list4 = list3;
                                                tsr.a aVar12 = aVar7;
                                                yka.a.C1350a c1350a6 = c1350a3;
                                                j3f0.g(iD, null, j3, 0L, op8VarB, null, pp8.b(-1353472485, new Function2() { // from class: x7g0
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj7, Object obj8) {
                                                        a aVar13 = (a) obj7;
                                                        int iIntValue4 = ((Integer) obj8).intValue();
                                                        if (aVar13.q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                            final int i7 = 0;
                                                            for (Object obj9 : list4) {
                                                                int i8 = i7 + 1;
                                                                if (i7 < 0) {
                                                                    b.q();
                                                                    throw null;
                                                                }
                                                                final String str2 = (String) obj9;
                                                                final osw oswVar4 = oswVar3;
                                                                final boolean z11 = oswVar4.D() == i7;
                                                                boolean zD = aVar13.d(i7);
                                                                Object objY9 = aVar13.y();
                                                                if (zD || objY9 == a.C0041a.a) {
                                                                    objY9 = new Function0() { // from class: f8g0
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Object invoke() {
                                                                            oswVar4.k(i7);
                                                                            return Unit.a;
                                                                        }
                                                                    };
                                                                    aVar13.r(objY9);
                                                                }
                                                                final boolean z12 = z10;
                                                                w1f0.b(z11, (Function0) objY9, null, false, pp8.b(244909903, new Function2() { // from class: h8g0
                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(Object obj10, Object obj11) {
                                                                        imf0 imf0Var;
                                                                        long j4;
                                                                        a aVar14 = (a) obj10;
                                                                        int iIntValue5 = ((Integer) obj11).intValue();
                                                                        if (aVar14.q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                                                            long jB = pi60.b(R.dimen._11ssp, 6, aVar14);
                                                                            boolean z13 = z11;
                                                                            if (z13) {
                                                                                aVar14.N(-1038143288);
                                                                                imf0Var = ((ufd0) aVar14.O(pi60.a)).d;
                                                                                aVar14.H();
                                                                            } else {
                                                                                aVar14.N(-1037999355);
                                                                                imf0Var = ((ufd0) aVar14.O(pi60.a)).b;
                                                                                aVar14.H();
                                                                            }
                                                                            imf0 imf0Var2 = imf0Var;
                                                                            if (z13) {
                                                                                j4 = z12 ? b6g0.b : b6g0.a;
                                                                            } else {
                                                                                j4 = j58.f;
                                                                            }
                                                                            lkf0.b(str2, null, j4, jB, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0Var2, aVar14, 0, 0, 65522);
                                                                        } else {
                                                                            aVar14.G();
                                                                        }
                                                                        return Unit.a;
                                                                    }
                                                                }, aVar13), 0L, 0L, aVar13, 24576, 492);
                                                                i7 = i8;
                                                            }
                                                        } else {
                                                            aVar13.G();
                                                        }
                                                        return Unit.a;
                                                    }
                                                }, aVar9), aVar9, 1597824, 42);
                                                a aVar13 = aVar9;
                                                ty0.a(aVar13, j.i(aVar10, dp9.a(R.dimen._9sdp, 54, aVar13)));
                                                int iD2 = oswVar3.D();
                                                boolean z11 = z8;
                                                if (iD2 == 0) {
                                                    aVar13.N(1133924542);
                                                    if (tournamentJoinConfirmationData5 == null || (prizeListMap = tournamentJoinConfirmationData5.getPrizeListMap()) == null) {
                                                        prizeListMap = m2g.a;
                                                    }
                                                    if (tournamentJoinConfirmationData5 == null || (currency = tournamentJoinConfirmationData5.getCurrency()) == null) {
                                                        currency = "";
                                                    }
                                                    k8g0.b(prizeListMap, currency, z7, z11, b5Var3, aVar13, 0);
                                                    aVar13.H();
                                                    tournamentJoinConfirmationData4 = tournamentJoinConfirmationData5;
                                                    f4 = 1.0f;
                                                    z9 = false;
                                                } else {
                                                    aVar13.N(1134435360);
                                                    d dVarH2 = h.h(aVar10, dp9.a(R.dimen._9sdp, 54, aVar13), 0.0f, 2);
                                                    DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                                                    if (displayMetrics.heightPixels / displayMetrics.density >= 750.0f || !z11) {
                                                        aVar13.N(1134906932);
                                                        f3 = ((Configuration) aVar13.O(AndroidCompositionLocals_androidKt.a)).screenHeightDp * 0.2f;
                                                        aVar13.H();
                                                    } else {
                                                        aVar13.N(1134747220);
                                                        f3 = ((Configuration) aVar13.O(AndroidCompositionLocals_androidKt.a)).screenHeightDp * 0.1f;
                                                        aVar13.H();
                                                    }
                                                    d dVarI = j.i(dVarH2, f3);
                                                    f4 = 1.0f;
                                                    tournamentJoinConfirmationData4 = tournamentJoinConfirmationData5;
                                                    z9 = false;
                                                    k8g0.d(j.g(dVarI, 1.0f), tournamentJoinConfirmationData4, aVar13, 0);
                                                    aVar13.H();
                                                }
                                                if (tournamentJoinConfirmationData4 == null || !tournamentJoinConfirmationData4.getShowJoinButtons()) {
                                                    f5 = 4.0f;
                                                    aVar13.N(1117864527);
                                                } else {
                                                    aVar13.N(1135700439);
                                                    d dVarF = h.f(androidx.compose.foundation.a.b(j.g(aVar10, f4), b6g0.x, zk40.a), dp9.a(R.dimen._9sdp, 54, aVar13));
                                                    aiv aivVarC5 = g75.c(n54Var2, z9);
                                                    int iHashCode8 = Long.hashCode(aVar13.m());
                                                    ne00 ne00VarO8 = aVar13.o();
                                                    d dVarC8 = c.c(aVar13, dVarF);
                                                    if (aVar13.k() == null) {
                                                        l2a.b();
                                                        throw null;
                                                    }
                                                    aVar13.D();
                                                    if (aVar13.g()) {
                                                        aVar8 = aVar12;
                                                        aVar13.F(aVar8);
                                                    } else {
                                                        aVar8 = aVar12;
                                                        aVar13.p();
                                                    }
                                                    hlh0.a(aVar13, aivVarC5, bVar2);
                                                    hlh0.a(aVar13, ne00VarO8, dVar3);
                                                    if (aVar13.g() || !Intrinsics.g(aVar13.y(), Integer.valueOf(iHashCode8))) {
                                                        c1350a4 = c1350a6;
                                                        j3c.a(iHashCode8, aVar13, iHashCode8, c1350a4);
                                                    } else {
                                                        c1350a4 = c1350a6;
                                                    }
                                                    hlh0.a(aVar13, dVarC8, cVar2);
                                                    d dVarI2 = j.i(j.g(aVar10, 1.0f), dp9.a(R.dimen._34sdp, 54, aVar13));
                                                    d160 d160VarA2 = b160.a(kw0.g, bVar3, aVar13, 6);
                                                    int iHashCode9 = Long.hashCode(aVar13.m());
                                                    ne00 ne00VarO9 = aVar13.o();
                                                    d dVarC9 = c.c(aVar13, dVarI2);
                                                    if (aVar13.k() == null) {
                                                        l2a.b();
                                                        throw null;
                                                    }
                                                    aVar13.D();
                                                    if (aVar13.g()) {
                                                        aVar13.F(aVar8);
                                                    } else {
                                                        aVar13.p();
                                                    }
                                                    hlh0.a(aVar13, d160VarA2, bVar2);
                                                    hlh0.a(aVar13, ne00VarO9, dVar3);
                                                    if (aVar13.g() || !Intrinsics.g(aVar13.y(), Integer.valueOf(iHashCode9))) {
                                                        j3c.a(iHashCode9, aVar13, iHashCode9, c1350a4);
                                                    }
                                                    hlh0.a(aVar13, dVarC9, cVar2);
                                                    Function0 function15 = function13;
                                                    boolean zM5 = aVar13.M(function15);
                                                    Object objY9 = aVar13.y();
                                                    if (zM5 || objY9 == a.C0041a.a) {
                                                        objY9 = new me3(function15, 2);
                                                        aVar13.r(objY9);
                                                    }
                                                    yka.a.C1350a c1350a7 = c1350a4;
                                                    c6n.b((Function0) objY9, j.w(androidx.compose.foundation.a.b(aVar10, z10 ? b6g0.q : r58.d(4281084972L), j060.c(5.0f)), dp9.a(R.dimen._34sdp, 54, aVar13)), false, null, gx9.a, aVar13, 196608, 28);
                                                    ty0.a(aVar13, j.w(aVar10, dp9.a(R.dimen._9sdp, 54, aVar13)));
                                                    Function0 function16 = function14;
                                                    ya5.a aVar14 = ya5.a;
                                                    if (z10) {
                                                        aVar13.N(-1150537218);
                                                        d dVarA6 = f160Var.a(1.0f, j.i(aVar10, dp9.a(R.dimen._34sdp, 54, aVar13)), true);
                                                        long j4 = b6g0.s;
                                                        j58 j58Var2 = new j58(j4);
                                                        long j5 = b6g0.t;
                                                        tsr.a aVar15 = aVar8;
                                                        d dVarA7 = ls7.a(androidx.compose.foundation.a.b(ybi0.a(ybi0.a(ybi0.a(androidx.compose.foundation.a.a(d35.b(dVarA6, 2.0f, ya5.a.h(aVar14, b.k(j58Var2, new j58(j5)), 0.0f, 0.0f, 14), j060.c(5.0f)), ya5.a.h(aVar14, b.k(new j58(j4), new j58(j5)), 0.0f, 0.0f, 14), j060.c(5.0f), 0.0f, 4), b6g0.u, 8.0f, 2.0f, 2.0f, j060.c(5.0f)), b6g0.v, 16.0f, -4.0f, -4.0f, j060.c(5.0f)), b6g0.w, 8.0f, 0.0f, 4.0f, j060.c(5.0f)), b6g0.q, j060.c(5.0f)), j060.c(5.0f));
                                                        aiv aivVarC6 = g75.c(n54Var2, false);
                                                        int iHashCode10 = Long.hashCode(aVar13.m());
                                                        ne00 ne00VarO10 = aVar13.o();
                                                        d dVarC10 = c.c(aVar13, dVarA7);
                                                        if (aVar13.k() == null) {
                                                            l2a.b();
                                                            throw null;
                                                        }
                                                        aVar13.D();
                                                        if (aVar13.g()) {
                                                            aVar13.F(aVar15);
                                                        } else {
                                                            aVar13.p();
                                                        }
                                                        hlh0.a(aVar13, aivVarC6, bVar2);
                                                        hlh0.a(aVar13, ne00VarO10, dVar3);
                                                        if (aVar13.g() || !Intrinsics.g(aVar13.y(), Integer.valueOf(iHashCode10))) {
                                                            j3c.a(iHashCode10, aVar13, iHashCode10, c1350a7);
                                                        }
                                                        hlh0.a(aVar13, dVarC10, cVar2);
                                                        nk5.a(function16, j.e(aVar10, 1.0f), false, j060.c(5.0f), ek5.a(j3, 0L, 0L, 0L, aVar13, 14), null, null, null, null, gx9.b, aVar13, 805306416, 484);
                                                        aVar13 = aVar13;
                                                        aVar13.s();
                                                        aVar13.H();
                                                        f5 = 4.0f;
                                                    } else {
                                                        tsr.a aVar16 = aVar8;
                                                        aVar13.N(-1144345371);
                                                        d dVarA8 = ls7.a(androidx.compose.foundation.a.a(f160Var.a(1.0f, j.i(aVar10, dp9.a(R.dimen._34sdp, 54, aVar13)), true), ya5.a.h(aVar14, b.k(new j58(b6g0.k), new j58(b6g0.l)), 0.0f, 0.0f, 14), j060.c(5.0f), 0.0f, 4), j060.c(5.0f));
                                                        aiv aivVarC7 = g75.c(n54Var2, false);
                                                        int iHashCode11 = Long.hashCode(aVar13.m());
                                                        ne00 ne00VarO11 = aVar13.o();
                                                        d dVarC11 = c.c(aVar13, dVarA8);
                                                        if (aVar13.k() == null) {
                                                            l2a.b();
                                                            throw null;
                                                        }
                                                        aVar13.D();
                                                        if (aVar13.g()) {
                                                            aVar13.F(aVar16);
                                                        } else {
                                                            aVar13.p();
                                                        }
                                                        hlh0.a(aVar13, aivVarC7, bVar2);
                                                        hlh0.a(aVar13, ne00VarO11, dVar3);
                                                        if (aVar13.g() || !Intrinsics.g(aVar13.y(), Integer.valueOf(iHashCode11))) {
                                                            j3c.a(iHashCode11, aVar13, iHashCode11, c1350a7);
                                                        }
                                                        hlh0.a(aVar13, dVarC11, cVar2);
                                                        f5 = 4.0f;
                                                        nk5.a(function16, j.e(aVar10, 1.0f), false, j060.c(5.0f), ek5.a(j3, 0L, 0L, 0L, aVar13, 14), null, null, null, null, gx9.c, aVar13, 805306416, 484);
                                                        aVar13 = aVar13;
                                                        aVar13.s();
                                                        aVar13.H();
                                                    }
                                                    aVar13.s();
                                                    aVar13.s();
                                                }
                                                aVar13.H();
                                                aVar13.s();
                                                c6n.b(function12, j.r(g.c(h.f(androidx.compose.foundation.layout.d.a.b(aVar10, ht.a.c), dp9.a(R.dimen._9sdp, 54, aVar13)), -2.0f, f5), 24.0f), false, null, gx9.d, aVar13, 196608, 28);
                                            } else {
                                                aVar9.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar6), aVar6, z6);
                                } else {
                                    aVar6.G();
                                }
                                return Unit.a;
                            }
                        }, aVar3), aVar3, z5);
                        float fA2 = pi60.a(R.dimen._105sdp, 6, aVar3);
                        float fA3 = pi60.a(R.dimen._100sdp, 6, aVar3);
                        float fA4 = pi60.a(R.dimen._minus60sdp, 6, aVar3);
                        if (zIsEmpty) {
                            aVar3.N(1151498048);
                        } else {
                            aVar3.N(1181308516);
                            if (z4) {
                                aVar3.N(1181356907);
                                fA = pi60.a(R.dimen._minus35sdp, 6, aVar3);
                                aVar3.H();
                            } else {
                                aVar3.N(1181447179);
                                fA = pi60.a(R.dimen._minus50sdp, 6, aVar3);
                                aVar3.H();
                            }
                            fA4 = fA;
                        }
                        aVar3.H();
                        if (z5) {
                            aVar3.N(-238970576);
                            strD = com.sportygames.newcms.c.d(v5g0Var.g, "https://s.sporty.net/cms/tournament_trophy_vip_big_c808c518f1.webp", aVar3);
                            aVar3.H();
                        } else {
                            aVar3.N(-238977112);
                            strD = com.sportygames.newcms.c.d(v5g0Var.f, "https://s.sporty.net/cms/Trophy_1_3_d403c92442.png", aVar3);
                            aVar3.H();
                        }
                        d dVarD2 = g.d(j.t(aVar4, fA2, fA3), 0.0f, fA4, 1);
                        float f3 = !zIsEmpty ? 0.6f : 1.0f;
                        gcg0.a(strD, "Trophy", bz60.a(dVarD2, f3, f3), d0b.a.g, null, 0.0f, null, null, aVar3, 3120, 496);
                        aVar3.s();
                        aVar3.s();
                        aVar3.s();
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 48);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: n7g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    int iA2 = qj40.a(i3);
                    k8g0.c(tournamentJoinConfirmationData, function0, function1, function2, str, j58Var, list, function3, function4, z, f, i, aig0Var, z2, (a) obj, iA, iA2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final d dVar, final TournamentJoinConfirmationData tournamentJoinConfirmationData, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(152942532);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.A(tournamentJoinConfirmationData) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            String strD = com.sportygames.newcms.c.d(v5g0.Z.x, "Terms & Conditions", bVarI);
            if (tournamentJoinConfirmationData != null) {
                y5g0 y5g0Var = y5g0.a;
                String currency = tournamentJoinConfirmationData.getCurrency();
                String minBetAmount = tournamentJoinConfirmationData.getMinBetAmount();
                String startDate = tournamentJoinConfirmationData.getStartDate();
                String endDate = tournamentJoinConfirmationData.getEndDate();
                String minimumCashoutCoefficient = tournamentJoinConfirmationData.getMinimumCashoutCoefficient();
                String onlyAmount = tournamentJoinConfirmationData.getOnlyAmount();
                String firstPrize = tournamentJoinConfirmationData.getFirstPrize();
                y5g0Var.getClass();
                strD = y5g0.a(strD, currency, minBetAmount, startDate, endDate, minimumCashoutCoefficient, onlyAmount, firstPrize);
            }
            try {
                zi50.a aVar2 = zi50.b;
                boolean zM = bVarI.M(strD);
                Object objY = bVarI.y();
                if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new n0c0(strD, 1);
                    bVarI.r(objY);
                }
                androidx.compose.ui.viewinterop.b.a((Function1) objY, dVar, null, bVarI, (i2 << 3) & 112, 4);
                Unit unit = Unit.a;
            } catch (Throwable unused) {
                zi50.a aVar3 = zi50.b;
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(tournamentJoinConfirmationData, i) { // from class: g7g0
                public final /* synthetic */ TournamentJoinConfirmationData b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    k8g0.d(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
