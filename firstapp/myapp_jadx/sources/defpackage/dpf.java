package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class dpf {
    public static final void a(final boolean z, final Function1<? super Boolean, Unit> function1, a aVar, final int i) {
        function1.getClass();
        b bVarI = aVar.i(7406778);
        int i2 = (bVarI.b(z) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            h7f h7fVar = new h7f(8.0f);
            d dVarA = ls7.a(dVarG, new elc(h7fVar, h7fVar, h7fVar, h7fVar));
            boolean z2 = (i2 & 14) == 4;
            Object objY = bVarI.y();
            if (z2 || objY == a.C0041a.a) {
                objY = new Function0() { // from class: yof
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(Boolean.valueOf(!z));
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d dVarF = h.f(androidx.compose.foundation.a.b(androidx.compose.foundation.d.d(dVarA, false, null, null, (Function0) objY, 15), c68.a(R.color.background_type1_quaternary, bVarI), zk40.a), 8.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
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
            h6n.b(erz.a(z ? R.drawable.spr_ic_arrow_drop_down_green_24dp : R.drawable.ic_play_arrow_green_24dp, 0, bVarI), "collapse icon", j.r(aVar2, 24.0f), c68.a(R.color.brand_secondary, bVarI), bVarI, 432, 0);
            lkf0.d(cb40.a(R.string.bet_history__cashout_history, new Object[0], bVarI), h.j(aVar2, 4.0f, 0.0f, 0.0f, 0.0f, 14), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 48, 0, 262136);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, function1, i) { // from class: zof
                public final /* synthetic */ boolean a;
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(49);
                    dpf.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final String str, final String str2, String str3, a aVar, final int i) {
        final String str4;
        b bVar;
        yka.a.C1350a c1350a;
        b bVarI = aVar.i(324066794);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16) | (bVarI.M(str3) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            h7f h7fVar = new h7f(8.0f);
            elc elcVar = new elc(h7fVar, h7fVar, h7fVar, h7fVar);
            d.a aVar2 = d.a.b;
            d dVarJ = h.j(androidx.compose.foundation.a.b(j.g(ls7.a(aVar2, elcVar), 1.0f), c68.a(R.color.background_type1_quaternary, bVarI), zk40.a), 16.0f, 0.0f, 16.0f, 10.0f, 2);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
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
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarG = j.g(aVar2, 1.0f);
            n54 n54Var = ht.a.d;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
            lkf0.d(cb40.a(R.string.common_functions__time, new Object[0], bVarI), dVar2.b(aVar2, n54Var), c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, null, bVarI, 0, 384, 258040);
            n54 n54Var2 = ht.a.e;
            lkf0.d(cb40.a(R.string.common_functions__stake_used, new Object[0], bVarI), dVar2.b(aVar2, n54Var2), c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 0, 0, 262136);
            n54 n54Var3 = ht.a.f;
            lkf0.d(cb40.a(R.string.bet_history__cashout, new Object[0], bVarI), dVar2.b(aVar2, n54Var3), c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, bVarI, 0, 24960, 241656);
            bVarI.X(true);
            d dVarG2 = j.g(aVar2, 1.0f);
            aiv aivVarC2 = g75.c(n54Var, false);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                c1350a = c1350a2;
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            } else {
                c1350a = c1350a2;
            }
            hlh0.a(bVarI, dVarC3, cVar);
            yka.a.C1350a c1350a3 = c1350a;
            lkf0.d(str, dVar2.b(aVar2, n54Var), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, bVarI, i2 & 14, 24960, 241656);
            int i3 = (i2 >> 3) & 14;
            lkf0.d(str2, dVar2.b(aVar2, n54Var2), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, i3, 0, 262136);
            int i4 = (i2 >> 6) & 14;
            lkf0.d(str3, dVar2.b(aVar2, n54Var3), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, bVarI, i4, 24960, 241656);
            bVarI.X(true);
            d dVarG3 = j.g(aVar2, 1.0f);
            aiv aivVarC3 = g75.c(n54Var, false);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarG3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC3, bVar2);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a3);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            lkf0.d(cb40.a(R.string.common_functions__total, new Object[0], bVarI), dVar2.b(aVar2, n54Var), c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 0, 0, 262136);
            lkf0.d(str2, dVar2.b(aVar2, n54Var2), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, bVarI, i3, 24960, 241656);
            str4 = str3;
            lkf0.d(str4, dVar2.b(aVar2, n54Var3), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, bVarI, i4, 24960, 241656);
            bVar = bVarI;
            bVar.X(true);
            bVar.X(true);
        } else {
            str4 = str3;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, str4, i) { // from class: sof
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    dpf.b(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final int i, final String str, final String str2, String str3, String str4, a aVar, final int i2) {
        String str5;
        final String str6 = str4;
        wd7.a(str, str2, str3, str4);
        b bVarI = aVar.i(-1967805389);
        int i3 = i2 | (bVarI.d(i) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.M(str2) ? 256 : 128) | (bVarI.M(str3) ? 2048 : 1024) | (bVarI.M(str6) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            d.a aVar2 = d.a.b;
            d dVarF = h.f(androidx.compose.foundation.a.b(ls7.a(j.g(aVar2, 1.0f), flc.b(3)), c68.a(R.color.background_type1_quaternary, bVarI), zk40.a), 10.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
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
            d dVarJ = h.j(j.g(aVar2, 1.0f), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarJ);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            lkf0.d(cb40.a(i, new Object[0], bVarI), null, c68.a(R.color.brand_secondary, bVarI), null, d2l.f(16), null, t9i.C, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 1597440, 0, 262058);
            int i4 = i3 >> 3;
            lkf0.d(str, null, c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, i4 & 14, 0, 262138);
            bVarI = bVarI;
            bVarI.X(true);
            d(R.string.common_functions__type, i4 & 112, bVarI, str2);
            ute.a(h.h(aVar2, 0.0f, 8.0f, 1), 0.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 6, 2);
            str5 = str3;
            d(R.string.common_functions__stake, (i3 >> 6) & 112, bVarI, str5);
            ute.a(h.h(aVar2, 0.0f, 8.0f, 1), 0.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 6, 2);
            str6 = str4;
            d(R.string.common_functions__odds_txt, 0, bVarI, gky.a.a(str6, false));
            bVarI.X(true);
        } else {
            str5 = str3;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final String str7 = str5;
            eVarZ.d = new Function2(i, i2, str, str2, str7, str6) { // from class: vof
                public final /* synthetic */ int a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;

                {
                    this.b = str;
                    this.c = str2;
                    this.d = str7;
                    this.e = str6;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    dpf.c(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final int i, final int i2, a aVar, final String str) {
        int i3;
        b bVar;
        str.getClass();
        b bVarI = aVar.i(-2055694949);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.M(str) ? 32 : 16;
        }
        int i4 = i3;
        if (bVarI.q(i4 & 1, (i4 & 19) != 18)) {
            d dVarG = j.g(d.a.b, 1.0f);
            d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
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
            lkf0.d(cb40.a(i, new Object[0], bVarI), null, c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 0, 0, 262138);
            lkf0.d(str, null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, (i4 >> 3) & 14, 0, 262138);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: wof
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    dpf.d(i, iA, (a) obj, str);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final boolean z, final Function1<? super Boolean, Unit> function1, a aVar, final int i) {
        function1.getClass();
        b bVarI = aVar.i(172680171);
        int i2 = (bVarI.b(z) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarA = ls7.a(j.g(aVar2, 1.0f), flc.b(12));
            boolean z2 = (i2 & 14) == 4;
            Object objY = bVarI.y();
            if (z2 || objY == a.C0041a.a) {
                objY = new Function0() { // from class: apf
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(Boolean.valueOf(!z));
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d dVarF = h.f(androidx.compose.foundation.a.b(androidx.compose.foundation.d.d(dVarA, false, null, null, (Function0) objY, 15), c68.a(R.color.background_type1_quaternary, bVarI), zk40.a), 8.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
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
            h6n.b(erz.a(z ? R.drawable.spr_ic_arrow_drop_down_green_24dp : R.drawable.ic_play_arrow_green_24dp, 0, bVarI), "collapse icon", j.r(aVar2, 24.0f), c68.a(R.color.brand_secondary, bVarI), bVarI, 432, 0);
            lkf0.d(cb40.a(R.string.bet_history__selection_details, new Object[0], bVarI), h.j(aVar2, 4.0f, 0.0f, 0.0f, 0.0f, 14), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 48, 0, 262136);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, function1, i) { // from class: bpf
                public final /* synthetic */ boolean a;
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(49);
                    dpf.e(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0329  */
    /* JADX WARN: Code duplicated, block: B:103:0x032d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0348  */
    /* JADX WARN: Code duplicated, block: B:111:0x0356  */
    /* JADX WARN: Code duplicated, block: B:113:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:116:0x0474  */
    /* JADX WARN: Code duplicated, block: B:117:0x0478  */
    /* JADX WARN: Code duplicated, block: B:122:0x0493  */
    /* JADX WARN: Code duplicated, block: B:125:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:127:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:142:0x0630  */
    /* JADX WARN: Code duplicated, block: B:146:0x0642  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x0210  */
    /* JADX WARN: Code duplicated, block: B:85:0x0214  */
    /* JADX WARN: Code duplicated, block: B:90:0x022f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0281  */
    /* JADX WARN: Code duplicated, block: B:94:0x0285  */
    /* JADX WARN: Code duplicated, block: B:99:0x02a0  */
    public static final void f(final int i, final int i2, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, List list, final String str9, final boolean z, a aVar, final int i3) throws Throwable {
        yka.a.b bVar;
        kw0.j jVar;
        n54.b bVar2;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i4;
        int iHashCode4;
        float f;
        kw0.j jVar2;
        n54.b bVar3;
        Throwable th;
        int i5;
        float f2;
        float f3;
        int iHashCode5;
        final List list2 = list;
        str7.getClass();
        b bVarI = aVar.i(-1203037667);
        int i6 = i3 | (bVarI.d(i) ? 4 : 2) | (bVarI.d(i2) ? 32 : 16) | (bVarI.M(str) ? 256 : 128) | (bVarI.M(str2) ? 2048 : 1024) | (bVarI.M(str3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.M(str4) ? 131072 : 65536) | (bVarI.M(str5) ? 1048576 : 524288) | (bVarI.M(str6) ? 8388608 : 4194304) | (bVarI.M(str7) ? 67108864 : 33554432) | (bVarI.M(str8) ? 536870912 : 268435456);
        int i7 = 8 | (bVarI.A(list2) ? 4 : 2) | (bVarI.M(str9) ? 32 : 16) | (bVarI.b(z) ? 256 : 128);
        if (bVarI.q(i6 & 1, ((306783379 & i6) == 306783378 && (i7 & 147) == 146) ? false : true)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            long jA = c68.a(R.color.background_type1_quaternary, bVarI);
            zk40.a aVar3 = zk40.a;
            d dVarJ = h.j(androidx.compose.foundation.a.b(dVarG, jA, aVar3), 16.0f, 0.0f, 16.0f, 20.0f, 2);
            kw0.k kVar = kw0.c;
            n54.a aVar4 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar4, bVarI, 0);
            int iHashCode6 = Long.hashCode(bVarI.m());
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            yka.a.b bVar4 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar4);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                bVar = bVar4;
            } else {
                bVar = bVar4;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode6))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                yka.a.b bVar5 = bVar;
                ute.a(h.j(aVar2, 0.0f, 0.0f, 0.0f, 8.0f, 7), 0.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 6, 2);
                d dVarG2 = j.g(aVar2, 1.0f);
                jVar = kw0.a;
                bVar2 = ht.a.k;
                d160 d160VarA = b160.a(jVar, bVar2, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.m());
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarG2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar5);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, bVar5);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                d dVarG3 = j.g(aVar2, 0.3f);
                aiv aivVarC = g75.c(ht.a.a, false);
                iHashCode2 = Long.hashCode(bVarI.m());
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = c.c(bVarI, dVarG3);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar5);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, bVar5);
                hlh0.a(bVarI, ne00VarS3, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC3, cVar);
                h9n.a(erz.a(i, i6 & 14, bVarI), "collapse icon", j.C(aVar2, null, 3), null, null, 0.0f, null, bVarI, 432, 120);
                bVarI.X(true);
                d dVarG4 = j.g(aVar2, 1.0f);
                i78 i78VarA2 = g78.a(kVar, aVar4, bVarI, 0);
                iHashCode3 = Long.hashCode(bVarI.m());
                ne00 ne00VarS4 = bVarI.S();
                d dVarC4 = c.c(bVarI, dVarG4);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar5);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA2, bVar5);
                hlh0.a(bVarI, ne00VarS4, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                }
                hlh0.a(bVarI, dVarC4, cVar);
                lkf0.d(String.valueOf(i2), h.g(androidx.compose.foundation.a.b(ls7.a(aVar2, j060.a), c68.a(R.color.background_type2_secondary, bVarI), aVar3), 6.0f, 2.0f), c68.a(R.color.brand_tertiary, bVarI), null, d2l.f(12), null, t9i.E, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 1597440, 0, 262056);
                d dVarJ2 = h.j(aVar2, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                i4 = 48;
                d160 d160VarA2 = b160.a(jVar, bVar2, bVarI, 48);
                iHashCode4 = Long.hashCode(bVarI.m());
                ne00 ne00VarS5 = bVarI.S();
                d dVarC5 = c.c(bVarI, dVarJ2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar5);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, bVar5);
                hlh0.a(bVarI, ne00VarS5, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                    n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
                }
                hlh0.a(bVarI, dVarC5, cVar);
                if (str != null) {
                    bVarI.N(-1028797322);
                    lkf0.d(cb40.a(R.string.bet_history__game_id_vid, new Object[]{str}, bVarI), null, c68.a(R.color.text_type1_secondary, bVarI), null, d2l.f(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 24576, 0, 262122);
                    long jA2 = c68.a(R.color.text_type1_secondary, bVarI);
                    bVarI = bVarI;
                    f = 0.0f;
                    bVar3 = bVar2;
                    jVar2 = jVar;
                    th = null;
                    i5 = 3;
                    f2 = 2.0f;
                    ute.a(j.w(j.i(h.h(aVar2, 4.0f, 0.0f, 2), 10.0f), 1.0f), 0.0f, jA2, bVarI, 6, 2);
                    bVarI.X(false);
                    i4 = 48;
                } else {
                    f = 0.0f;
                    jVar2 = jVar;
                    bVar3 = bVar2;
                    bVarI = bVarI;
                    th = null;
                    i5 = 3;
                    f2 = 2.0f;
                    bVarI.N(-1028148647);
                    bVarI.X(false);
                }
                f3 = f;
                lkf0.d(str2, null, c68.a(R.color.text_type1_secondary, bVarI), null, d2l.f(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, ((i6 >> 9) & 14) | 24576, 0, 262122);
                bVarI.X(true);
                d dVarG5 = j.g(aVar2, r8);
                d160 d160VarA3 = b160.a(jVar2, ht.a.l, bVarI, i4);
                iHashCode5 = Long.hashCode(bVarI.m());
                ne00 ne00VarS6 = bVarI.S();
                d dVarC6 = c.c(bVarI, dVarG5);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar5);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA3, bVar5);
                hlh0.a(bVarI, ne00VarS6, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                    n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
                }
                hlh0.a(bVarI, dVarC6, cVar);
                if (z) {
                    bVarI.N(157105623);
                    lkf0.d(str9, j.y(aVar2, f3, 120.0f, 1), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, bVarI, ((i7 >> 3) & 14) | 48, 24960, 241656);
                    bVarI.X(false);
                } else {
                    bVarI.N(157500129);
                    b bVar6 = bVarI;
                    lkf0.d(str3, j.y(aVar2, f3, 120.0f, 1), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, bVar6, ((i6 >> 12) & 14) | 48, 24960, 241656);
                    lkf0.d("v", h.h(aVar2, 4.0f, f3, 2), c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar6, 54, 0, 262136);
                    lkf0.d(str4, j.y(aVar2, f3, 120.0f, 1), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, bVar6, ((i6 >> 15) & 14) | 48, 24960, 241656);
                    bVarI.X(false);
                }
                bVarI.X(true);
                if (!z || str5.length() <= 0) {
                    bVarI.N(-533923627);
                    bVarI.X(false);
                } else {
                    bVarI.N(-534736633);
                    d dVarJ3 = h.j(aVar2, 0.0f, 8.0f, 0.0f, f2, 5);
                    d160 d160VarA4 = b160.a(new kw0.i(20.0f, true, new hw0()), bVar3, bVarI, 54);
                    int iHashCode7 = Long.hashCode(bVarI.m());
                    ne00 ne00VarS7 = bVarI.S();
                    d dVarC7 = c.c(bVarI, dVarJ3);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar5);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA4, bVar5);
                    hlh0.a(bVarI, ne00VarS7, dVar);
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode7))) {
                        n30.a(iHashCode7, bVarI, iHashCode7, c1350a);
                    }
                    hlh0.a(bVarI, dVarC7, cVar);
                    b bVar7 = bVarI;
                    lkf0.d(cb40.a(R.string.bet_history__final_score, new Object[0], bVarI), null, c68.a(R.color.text_type1_secondary, bVarI), null, d2l.f(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar7, 24576, 0, 262122);
                    lkf0.d(str5, null, c68.a(R.color.text_type1_primary, bVarI), null, d2l.f(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar7, ((i6 >> 18) & 14) | 24576, 0, 262122);
                    bVarI.X(true);
                    bVarI.X(false);
                }
                if (list != null || list.isEmpty()) {
                    list2 = list;
                    bVarI.N(-533857566);
                    g(str6, str7, str8, null, bVarI, (i6 >> 21) & 1022, 8);
                    bVarI.X(false);
                    Unit unit = Unit.a;
                } else {
                    bVarI.N(-533615301);
                    lkf0.d(str6, h.f(androidx.compose.foundation.a.b(h.j(j.g(aVar2, 1.0f), 0.0f, 0.0f, 0.0f, 1.0f, 7), c68.a(R.color.background_type1_primary, bVarI), flc.b(i5)), 10.0f), c68.a(R.color.text_type1_primary, bVarI), null, d2l.f(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, ((i6 >> 21) & 14) | 24576, 0, 262120);
                    list2 = list;
                    ArrayList arrayList = new ArrayList(l48.r(list2, 10));
                    int i8 = 0;
                    for (Object obj : list2) {
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            kotlin.collections.b.q();
                            throw th;
                        }
                        epf.b bVar8 = (epf.b) obj;
                        g(bVar8.g, bVar8.h, bVar8.i, Boolean.valueOf(i8 == list2.size() - 1), bVarI, 0, 0);
                        arrayList.add(Unit.a);
                        i8 = i9;
                    }
                    bVarI.X(false);
                }
                f30.a(bVarI, true, true, true);
            }
            n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            yka.a.b bVar9 = bVar;
            ute.a(h.j(aVar2, 0.0f, 0.0f, 0.0f, 8.0f, 7), 0.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 6, 2);
            d dVarG6 = j.g(aVar2, 1.0f);
            jVar = kw0.a;
            bVar2 = ht.a.k;
            d160 d160VarA5 = b160.a(jVar, bVar2, bVarI, 48);
            iHashCode = Long.hashCode(bVarI.m());
            ne00 ne00VarS8 = bVarI.S();
            d dVarC8 = c.c(bVarI, dVarG6);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA5, bVar9);
            hlh0.a(bVarI, ne00VarS8, dVar);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC8, cVar2);
            d dVarG7 = j.g(aVar2, 0.3f);
            aiv aivVarC2 = g75.c(ht.a.a, false);
            iHashCode2 = Long.hashCode(bVarI.m());
            ne00 ne00VarS9 = bVarI.S();
            d dVarC9 = c.c(bVarI, dVarG7);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar9);
            hlh0.a(bVarI, ne00VarS9, dVar);
            if (bVarI.S) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC9, cVar2);
            h9n.a(erz.a(i, i6 & 14, bVarI), "collapse icon", j.C(aVar2, null, 3), null, null, 0.0f, null, bVarI, 432, 120);
            bVarI.X(true);
            d dVarG8 = j.g(aVar2, 1.0f);
            i78 i78VarA3 = g78.a(kVar, aVar4, bVarI, 0);
            iHashCode3 = Long.hashCode(bVarI.m());
            ne00 ne00VarS10 = bVarI.S();
            d dVarC10 = c.c(bVarI, dVarG8);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA3, bVar9);
            hlh0.a(bVarI, ne00VarS10, dVar);
            if (bVarI.S) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            } else {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC10, cVar2);
            lkf0.d(String.valueOf(i2), h.g(androidx.compose.foundation.a.b(ls7.a(aVar2, j060.a), c68.a(R.color.background_type2_secondary, bVarI), aVar3), 6.0f, 2.0f), c68.a(R.color.brand_tertiary, bVarI), null, d2l.f(12), null, t9i.E, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 1597440, 0, 262056);
            d dVarJ4 = h.j(aVar2, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            i4 = 48;
            d160 d160VarA6 = b160.a(jVar, bVar2, bVarI, 48);
            iHashCode4 = Long.hashCode(bVarI.m());
            ne00 ne00VarS11 = bVarI.S();
            d dVarC11 = c.c(bVarI, dVarJ4);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA6, bVar9);
            hlh0.a(bVarI, ne00VarS11, dVar);
            if (bVarI.S) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            } else {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            hlh0.a(bVarI, dVarC11, cVar2);
            if (str != null) {
                bVarI.N(-1028797322);
                lkf0.d(cb40.a(R.string.bet_history__game_id_vid, new Object[]{str}, bVarI), null, c68.a(R.color.text_type1_secondary, bVarI), null, d2l.f(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 24576, 0, 262122);
                long jA3 = c68.a(R.color.text_type1_secondary, bVarI);
                bVarI = bVarI;
                f = 0.0f;
                bVar3 = bVar2;
                jVar2 = jVar;
                th = null;
                i5 = 3;
                f2 = 2.0f;
                ute.a(j.w(j.i(h.h(aVar2, 4.0f, 0.0f, 2), 10.0f), 1.0f), 0.0f, jA3, bVarI, 6, 2);
                bVarI.X(false);
                i4 = 48;
            } else {
                f = 0.0f;
                jVar2 = jVar;
                bVar3 = bVar2;
                bVarI = bVarI;
                th = null;
                i5 = 3;
                f2 = 2.0f;
                bVarI.N(-1028148647);
                bVarI.X(false);
            }
            f3 = f;
            lkf0.d(str2, null, c68.a(R.color.text_type1_secondary, bVarI), null, d2l.f(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, ((i6 >> 9) & 14) | 24576, 0, 262122);
            bVarI.X(true);
            d dVarG9 = j.g(aVar2, r8);
            d160 d160VarA7 = b160.a(jVar2, ht.a.l, bVarI, i4);
            iHashCode5 = Long.hashCode(bVarI.m());
            ne00 ne00VarS12 = bVarI.S();
            d dVarC12 = c.c(bVarI, dVarG9);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA7, bVar9);
            hlh0.a(bVarI, ne00VarS12, dVar);
            if (bVarI.S) {
                n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
            } else {
                n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
            }
            hlh0.a(bVarI, dVarC12, cVar2);
            if (z) {
                bVarI.N(157105623);
                lkf0.d(str9, j.y(aVar2, f3, 120.0f, 1), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, bVarI, ((i7 >> 3) & 14) | 48, 24960, 241656);
                bVarI.X(false);
            } else {
                bVarI.N(157500129);
                b bVar10 = bVarI;
                lkf0.d(str3, j.y(aVar2, f3, 120.0f, 1), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, bVar10, ((i6 >> 12) & 14) | 48, 24960, 241656);
                lkf0.d("v", h.h(aVar2, 4.0f, f3, 2), c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar10, 54, 0, 262136);
                lkf0.d(str4, j.y(aVar2, f3, 120.0f, 1), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, bVar10, ((i6 >> 15) & 14) | 48, 24960, 241656);
                bVarI.X(false);
            }
            bVarI.X(true);
            if (z) {
                bVarI.N(-533923627);
                bVarI.X(false);
            } else {
                bVarI.N(-533923627);
                bVarI.X(false);
            }
            if (list != null) {
                list2 = list;
                bVarI.N(-533857566);
                g(str6, str7, str8, null, bVarI, (i6 >> 21) & 1022, 8);
                bVarI.X(false);
                Unit unit2 = Unit.a;
            } else {
                list2 = list;
                bVarI.N(-533857566);
                g(str6, str7, str8, null, bVarI, (i6 >> 21) & 1022, 8);
                bVarI.X(false);
                Unit unit3 = Unit.a;
            }
            f30.a(bVarI, true, true, true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2, str, str2, str3, str4, str5, str6, str7, str8, list2, str9, z, i3) { // from class: uof
                public final /* synthetic */ String A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ int a;
                public final /* synthetic */ int b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ String f;
                public final /* synthetic */ String i;
                public final /* synthetic */ String v;
                public final /* synthetic */ String w;
                public final /* synthetic */ String y;
                public final /* synthetic */ List z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) throws Throwable {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(1);
                    dpf.f(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00df  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:64:0x0104  */
    /* JADX WARN: Code duplicated, block: B:67:0x013f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0143  */
    /* JADX WARN: Code duplicated, block: B:73:0x015e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0177  */
    /* JADX WARN: Code duplicated, block: B:78:0x0188  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x020f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0221  */
    /* JADX WARN: Code duplicated, block: B:97:0x022b  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void g(final String str, final String str2, final String str3, Boolean bool, a aVar, final int i, final int i2) {
        int i3;
        Boolean bool2;
        boolean z;
        final Boolean bool3;
        e eVarZ;
        qx80 qx80VarA;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        int i4;
        int iHashCode2;
        int iHashCode3;
        float f;
        float f2;
        b bVarI = aVar.i(-1268996954);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.M(str3) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                bool2 = bool;
                i3 |= bVarI.M(bool2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                if (i5 != 0) {
                    bool3 = null;
                } else {
                    bool3 = bool2;
                }
                d.a aVar3 = d.a.b;
                d dVarJ = h.j(j.g(aVar3, 1.0f), 0.0f, 0.0f, 0.0f, 1.0f, 7);
                long jA = c68.a(R.color.background_type1_primary, bVarI);
                if (bool3 != null) {
                    if (bool3.booleanValue()) {
                        f = 0.0f;
                    } else {
                        f = 8.0f;
                    }
                    if (bool3.booleanValue()) {
                        f2 = 0.0f;
                    } else {
                        f2 = 8.0f;
                    }
                    qx80VarA = flc.a(8.0f, 8.0f, f2, f);
                } else {
                    qx80VarA = zk40.a;
                }
                d dVarH = h.h(androidx.compose.foundation.a.b(dVarJ, jA, qx80VarA), 0.0f, 8.0f, 1);
                d160 d160VarA = b160.a(new kw0.i(8.0f, true, new hw0()), ht.a.j, bVarI, 6);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarH);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar = yka.a.f;
                hlh0.a(bVarI, d160VarA, bVar);
                yka.a.d dVar = yka.a.e;
                hlh0.a(bVarI, ne00VarS, dVar);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                d dVarG = j.g(aVar3, 0.26f);
                i4 = i3;
                i78 i78VarA = g78.a(new kw0.i(2.0f, true, new hw0()), ht.a.o, bVarI, 54);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarG);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA, bVar);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                i(R.string.bet_history__pick, 0, bVarI);
                i(R.string.bet_history__market, 0, bVarI);
                if (str3.length() > 0) {
                    bVarI.N(-2102822347);
                    i(R.string.bet_history__outcome, 0, bVarI);
                    bVarI.X(false);
                } else {
                    bVarI.N(-2102729130);
                    bVarI.X(false);
                }
                bVarI.X(true);
                d dVarG2 = j.g(aVar3, 1.0f);
                i78 i78VarA2 = g78.a(new kw0.i(2.0f, true, new hw0()), ht.a.m, bVarI, 6);
                iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = c.c(bVarI, dVarG2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA2, bVar);
                hlh0.a(bVarI, ne00VarS3, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                }
                hlh0.a(bVarI, dVarC3, cVar);
                h(str, bVarI, i4 & 14);
                h(str2, bVarI, (i4 >> 3) & 14);
                if (str3.length() > 0) {
                    bVarI.N(2050582412);
                    h(str3, bVarI, (i4 >> 6) & 14);
                    bVarI.X(false);
                } else {
                    bVarI.N(2050644877);
                    bVarI.X(false);
                }
                bVarI.X(true);
                bVarI.X(true);
            } else {
                bVarI.G();
                bool3 = bool2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: xof
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        dpf.g(str, str2, str3, bool3, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 3072;
        bool2 = bool;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i3 & 1, z)) {
            if (i5 != 0) {
                bool3 = null;
            } else {
                bool3 = bool2;
            }
            d.a aVar4 = d.a.b;
            d dVarJ2 = h.j(j.g(aVar4, 1.0f), 0.0f, 0.0f, 0.0f, 1.0f, 7);
            long jA2 = c68.a(R.color.background_type1_primary, bVarI);
            if (bool3 != null) {
                if (bool3.booleanValue()) {
                    f = 0.0f;
                } else {
                    f = 8.0f;
                }
                if (bool3.booleanValue()) {
                    f2 = 0.0f;
                } else {
                    f2 = 8.0f;
                }
                qx80VarA = flc.a(8.0f, 8.0f, f2, f);
            } else {
                qx80VarA = zk40.a;
            }
            d dVarH2 = h.h(androidx.compose.foundation.a.b(dVarJ2, jA2, qx80VarA), 0.0f, 8.0f, 1);
            d160 d160VarA2 = b160.a(new kw0.i(8.0f, true, new hw0()), ht.a.j, bVarI, 6);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarH2);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, d160VarA2, bVar2);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS4, dVar2);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC4, cVar2);
            d dVarG3 = j.g(aVar4, 0.26f);
            i4 = i3;
            i78 i78VarA3 = g78.a(new kw0.i(2.0f, true, new hw0()), ht.a.o, bVarI, 54);
            iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS5 = bVarI.S();
            d dVarC5 = c.c(bVarI, dVarG3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA3, bVar2);
            hlh0.a(bVarI, ne00VarS5, dVar2);
            if (bVarI.S) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC5, cVar2);
            i(R.string.bet_history__pick, 0, bVarI);
            i(R.string.bet_history__market, 0, bVarI);
            if (str3.length() > 0) {
                bVarI.N(-2102822347);
                i(R.string.bet_history__outcome, 0, bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(-2102729130);
                bVarI.X(false);
            }
            bVarI.X(true);
            d dVarG4 = j.g(aVar4, 1.0f);
            i78 i78VarA4 = g78.a(new kw0.i(2.0f, true, new hw0()), ht.a.m, bVarI, 6);
            iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS6 = bVarI.S();
            d dVarC6 = c.c(bVarI, dVarG4);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA4, bVar2);
            hlh0.a(bVarI, ne00VarS6, dVar2);
            if (bVarI.S) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            } else {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC6, cVar2);
            h(str, bVarI, i4 & 14);
            h(str2, bVarI, (i4 >> 3) & 14);
            if (str3.length() > 0) {
                bVarI.N(2050582412);
                h(str3, bVarI, (i4 >> 6) & 14);
                bVarI.X(false);
            } else {
                bVarI.N(2050644877);
                bVarI.X(false);
            }
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
            bool3 = bool2;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xof
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    dpf.g(str, str2, str3, bool3, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(final String str, a aVar, final int i) {
        int i2;
        b bVar;
        b bVarI = aVar.i(-522661364);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVar = bVarI;
            lkf0.d(str, null, c68.a(R.color.text_type1_primary, bVarI), null, d2l.f(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar, (i2 & 14) | 24576, 0, 262122);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: tof
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    dpf.h(str, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void i(final int i, final int i2, a aVar) {
        b bVar;
        b bVarI = aVar.i(-969074976);
        int i3 = (bVarI.d(i) ? 4 : 2) | i2;
        if (bVarI.q(i3 & 1, (i3 & 3) != 2)) {
            bVar = bVarI;
            lkf0.d(cb40.a(i, new Object[0], bVarI), null, c68.a(R.color.text_type1_secondary, bVarI), null, d2l.f(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar, 24576, 0, 262122);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2) { // from class: cpf
                public final /* synthetic */ int a;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    dpf.i(this.a, iA, (a) obj);
                    return Unit.a;
                }
            };
        }
    }
}
