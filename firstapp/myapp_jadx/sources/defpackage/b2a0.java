package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.bookingcode.presentation.smartremix.SmartRemixConfirmationUiState;
import com.sportybet.android.bookingcode.presentation.uistate.HighLiabilityItemUiState;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class b2a0 {
    public static final void a(final int i, final int i2, a aVar, final String str, final Function0 function0) {
        int i3;
        b bVarI = aVar.i(1464627868);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.A(function0) ? 256 : 128;
        }
        int i4 = i3;
        if (bVarI.q(i4 & 1, (i4 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarD = androidx.compose.foundation.d.d(c9j.c(j.r(aVar2, 20.0f), AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, str), false, null, null, function0, 15);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarD);
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
            h6n.b(erz.a(i, i4 & 14, bVarI), null, j.r(aVar2, 20.0f), j58.c(0.7f, c68.a(R.color.brand_tertiary, bVarI)), bVarI, 432, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: y1a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    b2a0.a(i, iA, (a) obj, str, function0);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final int i, a aVar, final String str, final Function0 function0) {
        int i2;
        b bVarI = aVar.i(515742249);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarI = j.i(j.g(d.a.b, 1.0f), 48.0f);
            c9s.a.getClass();
            d dVarC = c9j.c(dVarI, AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, c9s.b);
            i060 i060VarC = j060.c(0.0f);
            umz umzVar = ek5.a;
            nk5.a(function0, dVarC, false, i060VarC, ek5.a(c68.a(R.color.bg_brand_sub_primary_d_base, bVarI), c68.a(R.color.text_inverse_primary, bVarI), 0L, 0L, bVarI, 12), null, null, null, null, pp8.b(1114854937, new gaj() { // from class: u1a0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        lkf0.d(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, mla.l(R.style.H4_M, aVar2), aVar2, 0, 24576, 114686);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 3) & 14) | 805306368, 484);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: v1a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b2a0.b(qj40.a(i | 1), (a) obj, str, function0);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x014f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0153  */
    /* JADX WARN: Code duplicated, block: B:59:0x016e  */
    /* JADX WARN: Code duplicated, block: B:62:0x017c  */
    /* JADX WARN: Code duplicated, block: B:63:0x018f  */
    /* JADX WARN: Code duplicated, block: B:66:0x019f  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b4  */
    public static final void c(final String str, final String str2, String str3, String str4, final SmartRemixConfirmationUiState smartRemixConfirmationUiState, Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, a aVar, final int i) {
        String str5;
        String str6;
        ArrayList arrayList;
        int iHashCode;
        ArrayList arrayList2;
        boolean z;
        final Function0<Unit> function3 = function0;
        smartRemixConfirmationUiState.getClass();
        ArrayList arrayList3 = smartRemixConfirmationUiState.d;
        b bVarA = yoh0.a(function3, function1, function2, aVar, 376027626);
        int i2 = i | (bVarA.M(str) ? 4 : 2) | (bVarA.M(str2) ? 32 : 16) | (bVarA.M(str3) ? 256 : 128) | (bVarA.M(str4) ? 2048 : 1024) | (bVarA.M(smartRemixConfirmationUiState) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarA.A(function3) ? 131072 : 65536) | (bVarA.A(function1) ? 1048576 : 524288) | (bVarA.A(function2) ? 8388608 : 4194304);
        if (bVarA.q(i2 & 1, (4793491 & i2) != 4793490)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            kw0.k kVar = kw0.c;
            n54.a aVar3 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar3, bVarA, 0);
            int iHashCode2 = Long.hashCode(bVarA.T);
            ne00 ne00VarS = bVarA.S();
            d dVarC = c.c(bVarA, dVarG);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarA.D();
            if (bVarA.S) {
                bVarA.F(aVar4);
            } else {
                bVarA.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarA, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarA, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarA.S) {
                arrayList = arrayList3;
            } else {
                arrayList = arrayList3;
                if (!Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode2))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarA, dVarC, cVar);
                int i3 = i2 >> 15;
                h((i2 & 14) | (i3 & 112) | (i3 & 896), bVarA, str, function1, function2);
                d dVarC2 = op70.c(androidx.compose.foundation.a.b(j.k(j.g(aVar2, 1.0f), 0.0f, 480.0f, 1), c68.a(R.color.bg_primary_d_base, bVarA), zk40.a), op70.a(bVarA), 14);
                i78 i78VarA2 = g78.a(new kw0.i(12.0f, true, new hw0()), aVar3, bVarA, 6);
                iHashCode = Long.hashCode(bVarA.T);
                ne00 ne00VarS2 = bVarA.S();
                d dVarC3 = c.c(bVarA, dVarC2);
                bVarA.D();
                if (bVarA.S) {
                    bVarA.F(aVar4);
                } else {
                    bVarA.p();
                }
                hlh0.a(bVarA, i78VarA2, bVar);
                hlh0.a(bVarA, ne00VarS2, dVar);
                if (bVarA.S || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarA, iHashCode, c1350a);
                }
                hlh0.a(bVarA, dVarC3, cVar);
                arrayList2 = smartRemixConfirmationUiState.e;
                if (arrayList.isEmpty()) {
                    z = false;
                    bVarA.N(-562281788);
                    bVarA.X(false);
                } else {
                    bVarA.N(-562437470);
                    f(str2, arrayList, bVarA, (i2 >> 3) & 14);
                    z = false;
                    bVarA.X(false);
                }
                if (arrayList2.isEmpty()) {
                    str6 = str3;
                    bVarA.N(-562074460);
                    bVarA.X(z);
                } else {
                    bVarA.N(-562226298);
                    str6 = str3;
                    f(str6, arrayList2, bVarA, (i2 >> 6) & 14);
                    bVarA.X(z);
                }
                iib0.a(aVar2, 1.0f, bVarA, true);
                str5 = str4;
                function3 = function0;
                b(((i2 >> 9) & 14) | ((i2 >> 12) & 112), bVarA, str5, function3);
                bVarA.X(true);
            }
            n30.a(iHashCode2, bVarA, iHashCode2, c1350a);
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarA, dVarC, cVar2);
            int i4 = i2 >> 15;
            h((i2 & 14) | (i4 & 112) | (i4 & 896), bVarA, str, function1, function2);
            d dVarC4 = op70.c(androidx.compose.foundation.a.b(j.k(j.g(aVar2, 1.0f), 0.0f, 480.0f, 1), c68.a(R.color.bg_primary_d_base, bVarA), zk40.a), op70.a(bVarA), 14);
            i78 i78VarA3 = g78.a(new kw0.i(12.0f, true, new hw0()), aVar3, bVarA, 6);
            iHashCode = Long.hashCode(bVarA.T);
            ne00 ne00VarS3 = bVarA.S();
            d dVarC5 = c.c(bVarA, dVarC4);
            bVarA.D();
            if (bVarA.S) {
                bVarA.F(aVar4);
            } else {
                bVarA.p();
            }
            hlh0.a(bVarA, i78VarA3, bVar);
            hlh0.a(bVarA, ne00VarS3, dVar);
            if (bVarA.S) {
                n30.a(iHashCode, bVarA, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarA, iHashCode, c1350a);
            }
            hlh0.a(bVarA, dVarC5, cVar2);
            arrayList2 = smartRemixConfirmationUiState.e;
            if (arrayList.isEmpty()) {
                bVarA.N(-562437470);
                f(str2, arrayList, bVarA, (i2 >> 3) & 14);
                z = false;
                bVarA.X(false);
            } else {
                z = false;
                bVarA.N(-562281788);
                bVarA.X(false);
            }
            if (arrayList2.isEmpty()) {
                bVarA.N(-562226298);
                str6 = str3;
                f(str6, arrayList2, bVarA, (i2 >> 6) & 14);
                bVarA.X(z);
            } else {
                str6 = str3;
                bVarA.N(-562074460);
                bVarA.X(z);
            }
            iib0.a(aVar2, 1.0f, bVarA, true);
            str5 = str4;
            function3 = function0;
            b(((i2 >> 9) & 14) | ((i2 >> 12) & 112), bVarA, str5, function3);
            bVarA.X(true);
        } else {
            str5 = str4;
            str6 = str3;
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            final String str7 = str6;
            final String str8 = str5;
            eVarZ.d = new Function2(str, str2, str7, str8, smartRemixConfirmationUiState, function3, function1, function2, i) { // from class: t1a0
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ SmartRemixConfirmationUiState e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function0 v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    b2a0.c(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(HighLiabilityItemUiState highLiabilityItemUiState, a aVar, int i) {
        int i2;
        b bVar;
        nk0 nk0VarM;
        int i3;
        b bVarI = aVar.i(-1192466781);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(highLiabilityItemUiState) : bVarI.A(highLiabilityItemUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            long jA = c68.a(R.color.text_primary, bVarI);
            long jA2 = c68.a(R.color.text_secondary, bVarI);
            if (!b3.U(highLiabilityItemUiState.getEventId()) || StringsKt.U(highLiabilityItemUiState.getMarketDesc())) {
                nk0.b bVar2 = new nk0.b((Object) null);
                int iL = bVar2.l(new ora0(jA, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65534));
                try {
                    bVar2.g(highLiabilityItemUiState.getHomeTeamName());
                    Unit unit = Unit.a;
                    bVar2.i(iL);
                    int iL2 = bVar2.l(new ora0(jA2, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65534));
                    try {
                        bVar2.g(" vs ");
                        bVar2.i(iL2);
                        int iL3 = bVar2.l(new ora0(jA, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65534));
                        try {
                            bVar2.g(highLiabilityItemUiState.getAwayTeamName());
                            bVar2.i(iL3);
                            nk0VarM = bVar2.m();
                            i3 = R.color.text_primary;
                        } catch (Throwable th) {
                            bVar2.i(iL3);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        bVar2.i(iL2);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    bVar2.i(iL);
                    throw th3;
                }
            } else {
                nk0 nk0Var = new nk0(highLiabilityItemUiState.getMarketDesc());
                i3 = R.color.text_primary;
                nk0VarM = nk0Var;
            }
            bVar = bVarI;
            lkf0.e(nk0VarM, null, c68.a(i3, bVarI), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, mla.l(R.style.B2_M, bVarI), bVar, 0, 24960, 241658);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new bri(highLiabilityItemUiState, i);
        }
    }

    public static final void e(final HighLiabilityItemUiState highLiabilityItemUiState, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-609924389);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(highLiabilityItemUiState) : bVarI.A(highLiabilityItemUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            long jA = c68.a(R.color.text_primary, bVarI);
            long jA2 = c68.a(R.color.text_secondary, bVarI);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            h9n.a(erz.a(R.drawable.ic_mm_football, 0, bVarI), null, j.r(aVar2, 16.0f), null, null, 0.0f, new gf4(c68.a(R.color.icon_primary, bVarI), 5), bVarI, 432, 56);
            ty0.a(bVarI, j.w(aVar2, 8.0f));
            nk0.b bVar = new nk0.b((Object) null);
            int iL = bVar.l(new ora0(jA, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65534));
            try {
                bVar.g(highLiabilityItemUiState.getOutComeDesc());
                Unit unit = Unit.a;
                bVar.i(iL);
                int iL2 = bVar.l(new ora0(jA2, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65534));
                try {
                    bVar.g(" | ");
                    bVar.g(highLiabilityItemUiState.getMarketDesc());
                    bVar.i(iL2);
                    lkf0.e(bVar.m(), new LayoutWeightElement(1.0f, true), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, mla.l(R.style.B1_M, bVarI), bVarI, 0, 24960, 241660);
                    bVarI = bVarI;
                    bVarI.X(true);
                } catch (Throwable th) {
                    bVar.i(iL2);
                    throw th;
                }
            } catch (Throwable th2) {
                bVar.i(iL);
                throw th2;
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: a2a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    b2a0.e(highLiabilityItemUiState, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final String str, ArrayList arrayList, a aVar, final int i) {
        int i2;
        final ArrayList arrayList2;
        b bVar;
        b bVarI = aVar.i(629712738);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(arrayList) : bVarI.A(arrayList) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            kw0.i iVar = new kw0.i(12.0f, true, new hw0());
            n54.a aVar3 = ht.a.m;
            i78 i78VarA = g78.a(iVar, aVar3, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarG2 = h.g(androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), c68.a(R.color.bg_brand_sub_secondary_d_base, bVarI), zk40.a), 20.0f, 12.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            lkf0.d(str, null, c68.a(R.color.text_tertiary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, i2 & 14, 24576, 114682);
            bVar = bVarI;
            bVar.X(true);
            d dVarH = h.h(j.g(aVar2, 1.0f), 16.0f, 0.0f, 2);
            i78 i78VarA2 = g78.a(new kw0.i(8.0f, true, new hw0()), aVar3, bVar, 6);
            int iHashCode3 = Long.hashCode(bVar.T);
            ne00 ne00VarS3 = bVar.S();
            d dVarC3 = c.c(bVar, dVarH);
            bVar.D();
            if (bVar.S) {
                bVar.F(aVar4);
            } else {
                bVar.p();
            }
            hlh0.a(bVar, i78VarA2, bVar2);
            hlh0.a(bVar, ne00VarS3, dVar);
            if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVar, iHashCode3, c1350a);
            }
            hlh0.a(bVar, dVarC3, cVar);
            bVar.N(1996061507);
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                g((HighLiabilityItemUiState) obj, bVar, HighLiabilityItemUiState.$stable);
            }
            arrayList2 = arrayList;
            f30.a(bVar, false, true, true);
        } else {
            arrayList2 = arrayList;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: w1a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(i | 1);
                    b2a0.f(str, arrayList2, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(final HighLiabilityItemUiState highLiabilityItemUiState, a aVar, final int i) {
        int i2;
        b bVar;
        b bVarI = aVar.i(521240241);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(highLiabilityItemUiState) : bVarI.A(highLiabilityItemUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarG = h.g(androidx.compose.foundation.a.b(lx80.d(j.g(aVar2, 1.0f), 1.0f, j060.c(0.0f), false, 0L, 0L, 28), c68.a(R.color.bg_secondary_d_lighter, bVarI), zk40.a), 16.0f, 10.0f);
            d160 d160VarA = b160.a(kw0.g, ht.a.j, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
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
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            LayoutWeightElement layoutWeightElementA = yy.a(bVarI, dVarC, cVar, 1.0f, true);
            i78 i78VarA = g78.a(new kw0.i(2.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, layoutWeightElementA);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            int i3 = (i2 & 14) | HighLiabilityItemUiState.$stable;
            e(highLiabilityItemUiState, bVarI, i3);
            d(highLiabilityItemUiState, bVarI, i3);
            lkf0.d(highLiabilityItemUiState.getDisplayDate().g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), null, c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, 0, 24576, 114682);
            bVarI.X(true);
            ty0.a(bVarI, j.w(aVar2, 12.0f));
            lkf0.d(highLiabilityItemUiState.getOutComeOdds(), null, c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, mla.l(R.style.B1_B, bVarI), bVarI, 0, 24576, 114682);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: z1a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    b2a0.g(highLiabilityItemUiState, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(final int i, a aVar, final String str, final Function0 function0, Function0 function1) {
        final Function0 function2;
        b bVar;
        b bVarI = aVar.i(-1915632105);
        int i2 = (bVarI.M(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarF = h.f(androidx.compose.foundation.a.b(j.i(j.g(d.a.b, 1.0f), 36.0f), c68.a(R.color.brand_secondary, bVarI), j060.e(8.0f, 8.0f, 0.0f, 0.0f, 12)), 8.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
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
            y8s.a.getClass();
            a(R.drawable.ic_arrow_chevron_left, (i2 << 3) & 896, bVarI, y8s.b, function0);
            lkf0.d(str, new LayoutWeightElement(1.0f, true), c68.a(R.color.white, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 1, 0, null, mla.l(R.style.H4_B, bVarI), bVarI, i2 & 14, 24576, 113656);
            bVar = bVarI;
            a9s.a.getClass();
            int i3 = i2 & 896;
            function2 = function1;
            a(R.drawable.spr_ic_close_white_16dp, i3, bVar, a9s.b, function2);
            bVar.X(true);
        } else {
            function2 = function1;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: x1a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b2a0.h(qj40.a(i | 1), (a) obj, str, function0, function2);
                    return Unit.a;
                }
            };
        }
    }
}
