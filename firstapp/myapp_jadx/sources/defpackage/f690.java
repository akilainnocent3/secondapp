package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final class f690 {
    public static final void a(final int i, final int i2, a aVar) {
        int i3;
        b bVarI = aVar.i(1435573825);
        int i4 = i2 & 6;
        d dVar = d.a;
        if (i4 == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i5 = i2 & 48;
        androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
        if (i5 == 0) {
            i3 |= bVarI.M(aVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.d(i) ? 256 : 128;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            h6n.b(erz.a(i, (i3 >> 6) & 14, bVarI), "edit status", h.j(dVar.b(aVar2, ht.a.c), 0.0f, 0.0f, 4.0f, 0.0f, 11), c68.a(R.color.text_type1_secondary, bVarI), bVarI, 48, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: b690
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    f690.a(i, iA, (a) obj);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(androidx.compose.ui.d dVar, final v590 v590Var, final String str, i790 i790Var, final String str2, final Function0<Unit> function0, a aVar, final int i, final int i2) {
        androidx.compose.ui.d dVar2;
        int i3;
        final i790 i790Var2;
        final androidx.compose.ui.d dVar3;
        androidx.compose.ui.d.a aVar2;
        float f;
        function0.getClass();
        b bVarI = aVar.i(-1054548528);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i3 = (bVarI.M(dVar2) ? 4 : 2) | i;
        }
        int i5 = i3 | (bVarI.M(v590Var) ? 32 : 16) | (bVarI.M(str) ? 256 : 128);
        if ((i & 3072) == 0) {
            i5 |= bVarI.d(i790Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= bVarI.M(str2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i6 = i5 | (bVarI.A(function0) ? 131072 : 65536);
        if (bVarI.q(i6 & 1, (74899 & i6) != 74898)) {
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            if (i4 != 0) {
                dVar2 = aVar3;
            }
            w690[] w690VarArr = w690.a;
            androidx.compose.ui.d dVarA = ls7.a(j.r(dVar2, 60.0f), j060.c(2.0f));
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = rzk.a(bVarI);
            }
            androidx.compose.ui.d dVar4 = dVar2;
            androidx.compose.ui.d dVarH = g3w.h(androidx.compose.foundation.d.b(dVarA, (psw) objY, ut50.b(0.0f, 3, c68.a(R.color.text_type1_primary, bVarI), false), false, null, function0, 28), "shortcut_".concat(str2));
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = c.c(bVarI, dVarH);
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
            yka.a.d dVar5 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar5);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            androidx.compose.ui.d dVarH2 = h.h(j.e(aVar3, 1.0f), 4.0f, 0.0f, 2);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = c.c(bVarI, dVarH2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar5);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            if (v590Var instanceof v590.a) {
                bVarI.N(791316819);
                aVar2 = aVar3;
                f = 4.0f;
                h9n.a(erz.a(R.drawable.more, 0, bVarI), AnalyticsParam.HOME_NAV_ICON, j.r(h.j(aVar3, 0.0f, 6.0f, 0.0f, 0.0f, 13), 20.0f), null, null, 0.0f, new gf4(c68.a(R.color.text_type1_primary, bVarI), 5), bVarI, 432, 56);
                bVarI.X(false);
            } else {
                aVar2 = aVar3;
                f = 4.0f;
                if (!(v590Var instanceof v590.b)) {
                    throw igf0.a(bVarI, -2052685738, false);
                }
                bVarI.N(791769512);
                mw90.a(((v590.b) v590Var).a, AnalyticsParam.HOME_NAV_ICON, j.r(h.j(aVar2, 0.0f, 6.0f, 0.0f, 0.0f, 13), 20.0f), null, null, null, null, bVarI, 432, 2040);
                bVarI.X(false);
            }
            lkf0.d(str, h.j(aVar2, 0.0f, f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 2, false, 2, 0, null, mla.l(R.style.C1_R, bVarI), bVarI, ((i6 >> 6) & 14) | 48, 24960, 109560);
            bVarI = bVarI;
            bVarI.X(true);
            androidx.compose.ui.d dVarJ = h.j(aVar2, 0.0f, 2.0f, 0.0f, 0.0f, 13);
            int i7 = ((i6 >> 3) & 896) | 54;
            i790Var2 = i790Var;
            f(dVarJ, i790Var2, bVarI, i7, 0);
            bVarI.X(true);
            dVar3 = dVar4;
        } else {
            i790Var2 = i790Var;
            bVarI.G();
            dVar3 = dVar2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: c690
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f690.b(dVar3, v590Var, str, i790Var2, str2, function0, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:89:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:98:0x0265  */
    /* JADX WARN: Code duplicated, block: B:99:0x027a  */
    public static final void c(androidx.compose.ui.d dVar, v590.b bVar, final String str, final boolean z, t690 t690Var, i790 i790Var, final String str2, final Function0 function0, a aVar, final int i, final int i2) {
        androidx.compose.ui.d dVar2;
        int i3;
        String str3;
        Function0 function1;
        t690 t690Var2;
        i790 i790Var2;
        final androidx.compose.ui.d dVar3;
        androidx.compose.ui.d dVar4;
        int iHashCode;
        int i4;
        final v590.b bVar2 = bVar;
        t690Var.getClass();
        function0.getClass();
        b bVarI = aVar.i(-236467250);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = (bVarI.M(dVar2) ? 4 : 2) | i;
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(bVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str3 = str;
            i3 |= bVarI.M(str3) ? 256 : 128;
        } else {
            str3 = str;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.b(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarI.d(t690Var.ordinal()) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= bVarI.d(i790Var.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= bVarI.M(str2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            function1 = function0;
            i3 |= bVarI.A(function1) ? 8388608 : 4194304;
        } else {
            function1 = function0;
        }
        if (bVarI.q(i3 & 1, (4793491 & i3) != 4793490)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            if (i5 != 0) {
                dVar2 = aVar2;
            }
            w690[] w690VarArr = w690.a;
            androidx.compose.ui.d dVarN = ls7.a(j.i(j.w(aVar2, 46.0f), 54.0f), j060.c(2.0f)).n(dVar2);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = rzk.a(bVarI);
            }
            androidx.compose.ui.d dVarH = g3w.h(androidx.compose.foundation.d.b(dVarN, (psw) objY, ut50.b(0.0f, 3, c68.a(R.color.text_type1_primary, bVarI), false), false, null, function1, 28), "shortcut_".concat(str2));
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar3 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar3);
            yka.a.d dVar5 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar5);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                dVar4 = dVar2;
            } else {
                dVar4 = dVar2;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                androidx.compose.ui.d dVarE = j.e(aVar2, 1.0f);
                i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                androidx.compose.ui.d dVarC2 = c.c(bVarI, dVarE);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA, bVar3);
                hlh0.a(bVarI, ne00VarS2, dVar5);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                bVarI.N(2011875562);
                bVar2 = bVar;
                mw90.a(bVar2.a, AnalyticsParam.HOME_NAV_ICON, j.r(h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), 20.0f), null, null, null, null, bVarI, 432, 2040);
                bVarI.X(false);
                i4 = i3 >> 6;
                lkf0.d(str3, hib0.a(aVar2, 4.0f, bVarI, aVar2, 1.0f), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, new imf0(0L, mla.m(8.0f, bVarI), null, null, f8i.b, 0L, null, null, 3, mla.m(8.0f, bVarI), null, null, 16613341), bVarI, (i4 & 14) | 48, 24960, 110584);
                bVarI.X(true);
                if (z) {
                    bVarI.N(1308734552);
                    t690Var2 = t690Var;
                    d(null, t690Var2, bVarI, (i4 & 896) | 6);
                    bVarI.X(false);
                    i790Var2 = i790Var;
                } else {
                    t690Var2 = t690Var;
                    bVarI.N(1308806100);
                    i790Var2 = i790Var;
                    f(null, i790Var2, bVarI, ((i3 >> 9) & 896) | 6, 1);
                    bVarI.X(false);
                }
                bVarI.X(true);
                dVar3 = dVar4;
            }
            n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            androidx.compose.ui.d dVarE2 = j.e(aVar2, 1.0f);
            i78 i78VarA2 = g78.a(kw0.c, ht.a.n, bVarI, 48);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            androidx.compose.ui.d dVarC3 = c.c(bVarI, dVarE2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar3);
            hlh0.a(bVarI, ne00VarS3, dVar5);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar2);
            bVarI.N(2011875562);
            bVar2 = bVar;
            mw90.a(bVar2.a, AnalyticsParam.HOME_NAV_ICON, j.r(h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), 20.0f), null, null, null, null, bVarI, 432, 2040);
            bVarI.X(false);
            i4 = i3 >> 6;
            lkf0.d(str3, hib0.a(aVar2, 4.0f, bVarI, aVar2, 1.0f), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, new imf0(0L, mla.m(8.0f, bVarI), null, null, f8i.b, 0L, null, null, 3, mla.m(8.0f, bVarI), null, null, 16613341), bVarI, (i4 & 14) | 48, 24960, 110584);
            bVarI.X(true);
            if (z) {
                bVarI.N(1308734552);
                t690Var2 = t690Var;
                d(null, t690Var2, bVarI, (i4 & 896) | 6);
                bVarI.X(false);
                i790Var2 = i790Var;
            } else {
                t690Var2 = t690Var;
                bVarI.N(1308806100);
                i790Var2 = i790Var;
                f(null, i790Var2, bVarI, ((i3 >> 9) & 896) | 6, 1);
                bVarI.X(false);
            }
            bVarI.X(true);
            dVar3 = dVar4;
        } else {
            t690Var2 = t690Var;
            i790Var2 = i790Var;
            bVarI.G();
            dVar3 = dVar2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final i790 i790Var3 = i790Var2;
            final t690 t690Var3 = t690Var2;
            eVarZ.d = new Function2() { // from class: z590
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f690.c(dVar3, bVar2, str, z, t690Var3, i790Var3, str2, function0, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final androidx.compose.ui.d dVar, final t690 t690Var, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(1599765192);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(d.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= bVarI.d(t690Var.ordinal()) ? 256 : 128;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            int iOrdinal = t690Var.ordinal();
            if (iOrdinal == 0) {
                bVarI.N(-223936970);
                a(R.drawable.ic_badge_add, i3 & WebSocketProtocol.PAYLOAD_SHORT, bVarI);
                bVarI.X(false);
            } else if (iOrdinal != 1) {
                bVarI.N(1648165912);
                bVarI.X(false);
            } else {
                bVarI.N(-223932103);
                a(R.drawable.ic_badge_remove, i3 & WebSocketProtocol.PAYLOAD_SHORT, bVarI);
                bVarI.X(false);
            }
            dVar = androidx.compose.ui.d.a.b;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: a690
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    f690.d(dVar, t690Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(androidx.compose.ui.d dVar, a aVar, int i) {
        androidx.compose.ui.d dVar2;
        b bVarI = aVar.i(-809931949);
        int i2 = i | 6;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            w690[] w690VarArr = w690.a;
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarA = ls7.a(j.i(j.w(aVar2, 46.0f), 54.0f), j060.c(2.0f));
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = c.c(bVarI, dVarA);
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
            h6n.b(erz.a(R.drawable.ic_shortcut_placeholder, 0, bVarI), "shortcut placeholder", j.r(h.j(aVar2, 0.0f, 4.0f, 0.0f, 0.0f, 13), 20.0f), c68.a(R.color.text_type1_secondary, bVarI), bVarI, 432, 0);
            lkf0.d(cb40.a(R.string.common_functions__add, new Object[0], bVarI), hib0.a(aVar2, 4.0f, bVarI, aVar2, 1.0f), c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, new imf0(0L, mla.m(8.0f, bVarI), null, null, f8i.b, 0L, null, null, 3, mla.m(8.0f, bVarI), null, null, 16613341), bVarI, 48, 24960, 110584);
            bVarI = bVarI;
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new y590(dVar2, i);
        }
    }

    public static final void f(final androidx.compose.ui.d dVar, final i790 i790Var, a aVar, final int i, final int i2) {
        int i3;
        androidx.compose.ui.d dVar2;
        b bVarI = aVar.i(-1767005152);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(d.a) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.d(i790Var.ordinal()) ? 256 : 128;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                dVar = androidx.compose.ui.d.a.b;
            }
            int iOrdinal = i790Var.ordinal();
            if (iOrdinal == 0) {
                dVar2 = dVar;
                bVarI.N(-1579864347);
                g(i3 & WebSocketProtocol.PAYLOAD_SHORT, c68.a(R.color.discount_gift_primary, bVarI), bVarI, dVar2, cb40.a(R.string.event_label__hot, new Object[0], bVarI));
                bVarI.X(false);
            } else if (iOrdinal == 1) {
                bVarI.N(-1579857116);
                dVar2 = dVar;
                g(i3 & WebSocketProtocol.PAYLOAD_SHORT, c68.a(R.color.brand_primary, bVarI), bVarI, dVar2, cb40.a(R.string.common_functions__u_new, new Object[0], bVarI));
                bVarI.X(false);
            } else {
                if (iOrdinal != 2) {
                    throw igf0.a(bVarI, -1579865570, false);
                }
                bVarI.N(-1730710176);
                bVarI.X(false);
                dVar2 = dVar;
            }
            dVar = dVar2;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: d690
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    f690.f(dVar, i790Var, (a) obj, iA, i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(final int i, final long j, a aVar, final androidx.compose.ui.d dVar, final String str) {
        int i2;
        b bVar;
        b bVarI = aVar.i(1593572644);
        int i3 = i & 6;
        d dVar2 = d.a;
        if (i3 == 0) {
            i2 = (bVarI.M(dVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.e(j) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            bVar = bVarI;
            lkf0.d(str, dVar2.b(h.g(androidx.compose.foundation.a.b(dVar, j, j060.c(33.0f)), 3.0f, 1.0f), ht.a.c), c68.a(R.color.brand_tertiary, bVarI), null, mla.m(8.0f, bVarI), null, new t9i(700), f8i.b, 0L, null, null, mla.m(8.0f, bVarI), 0, false, 0, 0, null, null, bVar, ((i2 >> 6) & 14) | 1572864, 0, 259880);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: e690
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f690.g(qj40.a(i | 1), j, (a) obj, dVar, str);
                    return Unit.a;
                }
            };
        }
    }
}
