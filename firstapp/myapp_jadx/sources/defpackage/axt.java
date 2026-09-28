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
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class axt {
    public static final void a(final d dVar, kwv kwvVar, final boolean z, final Function0 function0, final Function0 function1, final Function1 function2, final Function0 function3, final Function1 function4, a aVar, final int i) {
        kwv kwvVar2;
        function3.getClass();
        function4.getClass();
        b bVarI = aVar.i(-1327959109);
        int i2 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.M(kwvVar) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function2) ? 131072 : 65536) | (bVarI.A(function3) ? 1048576 : 524288) | (bVarI.A(function4) ? 8388608 : 4194304) | 100663296;
        if (bVarI.q(i2 & 1, (38347923 & i2) != 38347922)) {
            v0u v0uVar = (v0u) bVarI.O(cst.f);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            int i3 = i2 >> 3;
            int i4 = i2 >> 6;
            c(kwvVar, v0uVar, function0, function2, function4, bVarI, (i3 & 910) | (i4 & 7168) | ((i2 >> 9) & 57344) | 196608);
            kwvVar2 = kwvVar;
            if (kwvVar2.s) {
                bVarI.N(941941181);
                bVarI.X(false);
            } else {
                bVarI.N(941654493);
                isv.e(z, kwvVar2.o, kwvVar2.g, v0uVar, function1, function3, bVarI, (i3 & 458752) | (i4 & 14) | (i2 & 57344));
                bVarI = bVarI;
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            kwvVar2 = kwvVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final kwv kwvVar3 = kwvVar2;
            eVarZ.d = new Function2(kwvVar3, z, function0, function1, function2, function3, function4, i) { // from class: uwt
                public final /* synthetic */ kwv b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function1 v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    axt.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final wwv wwvVar, final String str, final uxs uxsVar, final UiText uiText, final String str2, final String str3, final boolean z, final v0u v0uVar, final boolean z2, final Function0 function0, final Function0 function1, a aVar, final int i) {
        b bVarI = aVar.i(-1322522694);
        int i2 = i | (bVarI.d(wwvVar.ordinal()) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.d(uxsVar.ordinal()) ? 256 : 128) | (bVarI.M(uiText) ? 2048 : 1024) | (bVarI.M(str2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.M(str3) ? 131072 : 65536) | (bVarI.b(z) ? 1048576 : 524288) | (bVarI.M(v0uVar) ? 8388608 : 4194304) | (bVarI.b(z2) ? 67108864 : 33554432) | (bVarI.A(function0) ? 536870912 : 268435456);
        int i3 = bVarI.A(function1) ? 4 : 2;
        if (bVarI.q(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 3) == 2) ? false : true)) {
            d.a aVar2 = d.a.b;
            d dVarJ = h.j(j.g(aVar2, 1.0f), 0.0f, 0.0f, rrv.m, 0.0f, 11);
            d160 d160VarA = b160.a(kw0.g, ht.a.j, bVarI, 54);
            int i4 = i3;
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
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
            int i5 = i2 >> 3;
            e(yy.a(bVarI, dVarC, yka.a.d, 1.0f, true), wwvVar, str, str3, str2, z, v0uVar, function1, bVarI, ((i2 << 3) & 1008) | ((i2 >> 6) & 7168) | (i2 & 57344) | (i5 & 458752) | (3670016 & i5) | ((i4 << 21) & 29360128));
            bVarI = bVarI;
            ty0.a(bVarI, j.w(aVar2, rrv.w));
            int i6 = i2 >> 12;
            isv.a(wwvVar, uxsVar, uiText, v0uVar, z2, function0, bVarI, (i5 & 896) | (i2 & 14) | (i5 & 112) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752));
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, uxsVar, uiText, str2, str3, z, v0uVar, z2, function0, function1, i) { // from class: ywt
                public final /* synthetic */ String b;
                public final /* synthetic */ uxs c;
                public final /* synthetic */ UiText d;
                public final /* synthetic */ String e;
                public final /* synthetic */ String f;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ v0u v;
                public final /* synthetic */ boolean w;
                public final /* synthetic */ Function0 y;
                public final /* synthetic */ Function0 z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    axt.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final kwv kwvVar, final v0u v0uVar, final Function0 function0, final Function1 function1, final Function1 function2, a aVar, final int i) {
        int i2;
        Function1 function3;
        b bVarI = aVar.i(-1718110720);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(kwvVar) : bVarI.A(kwvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(v0uVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function3 = function1;
            i2 |= bVarI.A(function3) ? 2048 : 1024;
        } else {
            function3 = function1;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? bVarI.M(null) : bVarI.A(null) ? 131072 : 65536;
        }
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
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
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            urv.a(j.A(j.g(aVar2, 1.0f), null, 3), v0uVar.a, j060.c(rrv.e), 0L, pp8.b(1564917239, new f2b(kwvVar, v0uVar, function0, function2), bVarI), bVarI, 196998);
            int iOrdinal = kwvVar.l.ordinal();
            if (iOrdinal != 4) {
                if (iOrdinal != 5) {
                    bVarI.N(1048286721);
                    bVarI.X(false);
                } else {
                    bVarI.N(1047823612);
                    isv.d(v0uVar, bVarI, (i2 & 112) | 6);
                    bVarI.X(false);
                }
                bVarI = bVarI;
            } else {
                bVarI.N(1047949441);
                int i3 = i2;
                bVarI = bVarI;
                isv.c(kwvVar.q, kwvVar.r, v0uVar, function3, bVarI, ((i3 << 3) & 57344) | 6 | ((i3 << 6) & 7168));
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: vwt
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    axt.c(kwvVar, v0uVar, function0, function1, function2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(String str, UiText uiText, v0u v0uVar, a aVar, final int i) {
        final UiText uiText2;
        final v0u v0uVar2;
        final String str2 = str;
        b bVarI = aVar.i(486984491);
        int i2 = i | (bVarI.M(str2) ? 4 : 2) | (bVarI.M(uiText) ? 32 : 16) | (bVarI.M(v0uVar) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
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
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            qyd0 qyd0Var = kjb0.a;
            imf0 imf0Var = ((ijb0) bVarI.O(qyd0Var)).i;
            qyd0 qyd0Var2 = oib0.a;
            str2 = str;
            lkf0.d(str2, h.e(new LayoutWeightElement(1.0f, true), rrv.f), ((lib0) bVarI.O(qyd0Var2)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, i2 & 14, 0, 131064);
            ty0.a(bVarI, j.w(aVar2, rrv.g));
            v0uVar2 = v0uVar;
            long j = v0uVar2.b;
            float f = rrv.e;
            d dVarE = h.e(androidx.compose.foundation.a.b(aVar2, j, j060.e(0.0f, f, 0.0f, f, 5)), rrv.i);
            d160 d160VarA2 = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.k, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarE);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            h6n.b(pib0.a(R.drawable.ic__stopwatch, 0, bVarI), "Timer", j.r(aVar2, rrv.h), ((lib0) bVarI.O(qyd0Var2)).a0, bVarI, 48, 0);
            uiText.getClass();
            uiText2 = uiText;
            lkf0.d(uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), null, ((lib0) bVarI.O(qyd0Var2)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(((ijb0) bVarI.O(qyd0Var)).s, 0L, mla.m(rrv.j, bVarI), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213), bVarI, 0, 0, 131066);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
        } else {
            uiText2 = uiText;
            v0uVar2 = v0uVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str2, uiText2, v0uVar2, i) { // from class: xwt
                public final /* synthetic */ String a;
                public final /* synthetic */ UiText b;
                public final /* synthetic */ v0u c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    axt.d(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0110  */
    public static final void e(final d dVar, final wwv wwvVar, final String str, final String str2, final String str3, final boolean z, final v0u v0uVar, final Function0 function0, a aVar, final int i) {
        boolean z2;
        b bVarI = aVar.i(1702981654);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= bVarI.d(wwvVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(str2) ? 2048 : 1024;
        }
        int i3 = i2 | (bVarI.M(str3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if ((196608 & i) == 0) {
            i3 |= bVarI.b(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= bVarI.M(v0uVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= bVarI.A(function0) ? 8388608 : 4194304;
        }
        if (bVarI.q(i3 & 1, (4793491 & i3) != 4793490)) {
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            int i4 = i3;
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
            if (z) {
                wwvVar.getClass();
                if (wwvVar == wwv.a || wwvVar == wwv.b) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            int i5 = i4 >> 12;
            irv.b(str, z2, v0uVar, function0, null, bVarI, ((i4 >> 6) & 14) | (i5 & 896) | (i5 & 7168));
            float f = rrv.x;
            d.a aVar3 = d.a.b;
            ty0.a(bVarI, j.i(aVar3, f));
            wwvVar.getClass();
            if (wwvVar == wwv.d) {
                bVarI.N(-2099122367);
                lkf0.d(cb40.a(R.string.page_loyalty__start_time_vdatetime, new Object[]{str2}, bVarI), null, ((lib0) bVarI.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).q, bVarI, 0, 0, 131066);
                bVarI = bVarI;
                iib0.a(aVar3, rrv.y, bVarI, false);
            } else {
                bVarI.N(-2098825418);
                bVarI.X(false);
            }
            b bVar = bVarI;
            lkf0.d(cb40.a(R.string.page_loyalty__last_mission_accept_vdatetime, new Object[]{str3}, bVarI), null, ((lib0) bVarI.O(oib0.a)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).q, bVar, 0, 0, 131066);
            bVarI = bVar;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: zwt
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    axt.e(dVar, wwvVar, str, str2, str3, z, v0uVar, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
