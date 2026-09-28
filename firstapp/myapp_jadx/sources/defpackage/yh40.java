package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common.network.data.JsonErrorThrowable;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.android.bookingcode.data.dto.Ticket;
import com.sportybet.android.data.LiabilitiesResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class yh40 {
    public static final void a(String str, a aVar, int i) {
        b bVarI = aVar.i(-1480932981);
        int i2 = i | (bVarI.M(str) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d dVarF = h.f(j.g(d.a.b, 1.0f), 16.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
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
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.d(str, null, c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((eah0) bVarI.O(gah0.a)).l, bVarI, i2 & 14, 0, 131066);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new hh40(i, 0, str);
        }
    }

    public static final void b(final int i, a aVar, final String str, final Function0 function0, Function0 function1) {
        int i2;
        final Function0 function2 = function1;
        b bVarA = v2g.a(function0, function2, aVar, 1107238205);
        if ((i & 6) == 0) {
            i2 = (bVarA.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarA.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarA.A(function2) ? 256 : 128;
        }
        int i3 = i2;
        if (bVarA.q(i3 & 1, (i3 & 147) != 146)) {
            d dVarG = j.g(androidx.compose.foundation.a.b(d.a.b, c68.a(R.color.background_type2_secondary, bVarA), zk40.a), 1.0f);
            d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarA, 54);
            int iHashCode = Long.hashCode(bVarA.T);
            ne00 ne00VarS = bVarA.S();
            d dVarC = c.c(bVarA, dVarG);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarA.D();
            if (bVarA.S) {
                bVarA.F(aVar2);
            } else {
                bVarA.p();
            }
            hlh0.a(bVarA, d160VarA, yka.a.f);
            hlh0.a(bVarA, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarA.S || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarA, iHashCode, c1350a);
            }
            hlh0.a(bVarA, dVarC, yka.a.d);
            c6n.a(function0, null, false, null, null, nl9.a, bVarA, (i3 & 14) | 1572864, 62);
            lkf0.d(str, null, c68.a(R.color.brand_tertiary, bVarA), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((eah0) bVarA.O(gah0.a)).h, bVarA, (i3 >> 3) & 14, 0, 131066);
            bVarA = bVarA;
            c6n.a(function1, null, false, null, null, nl9.b, bVarA, ((i3 >> 6) & 14) | 1572864, 62);
            function2 = function1;
            bVarA.X(true);
        } else {
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qh40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yh40.b(qj40.a(i | 1), (a) obj, str, function0, function2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final bh40.c cVar, final Function1 function1, final Function1 function2, final Function1 function3, final boolean z, Function0 function0, a aVar, final int i) {
        int i2;
        Function1 function4;
        final Function0 function5;
        yka.a.C1350a c1350a;
        d.a aVar2;
        int i3;
        List<ji40> list = cVar.a;
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function0.getClass();
        b bVarI = aVar.i(-1379167386);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(cVar) : bVarI.A(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.b(z) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function0) ? 131072 : 65536;
        }
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = nvc.a(z, bVarI);
            }
            final ytw ytwVar = (ytw) objY;
            long jA = c68.a(R.color.background_general_primary, bVarI);
            d.a aVar3 = d.a.b;
            zk40.a aVar4 = zk40.a;
            d dVarB = androidx.compose.foundation.a.b(aVar3, jA, aVar4);
            kw0.k kVar = kw0.c;
            n54.a aVar5 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar5, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar6 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, aVar3);
            bVarI.D();
            int i4 = i2;
            if (bVarI.S) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                c1350a = c1350a2;
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                c1350a = c1350a2;
            }
            hlh0.a(bVarI, dVarC2, cVar2);
            a.C0041a.C0042a c0042a2 = c0042a;
            d dVarF = h.f(androidx.compose.foundation.a.b(j.g(aVar3, 1.0f), c68.a(R.color.background_general_primary, bVarI), aVar4), 15.0f);
            i78 i78VarA2 = g78.a(new kw0.i(10.0f, true, new hw0()), aVar5, bVarI, 6);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarF);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            Iterator itA = yt1.a(bVarI, dVarC3, cVar2, 2035435188, list);
            while (itA.hasNext()) {
                final ji40 ji40Var = (ji40) itA.next();
                boolean zA = bVarI.A(ji40Var) | ((i4 & 112) == 32);
                Object objY2 = bVarI.y();
                if (zA || objY2 == c0042a2) {
                    objY2 = new Function1() { // from class: ch40
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ((String) obj).getClass();
                            String shareCode = ji40Var.a.getShareCode();
                            if (shareCode == null) {
                                shareCode = "";
                            }
                            function1.invoke(shareCode);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                Function1 function6 = (Function1) objY2;
                int i5 = i4;
                boolean zA2 = ((i5 & 896) == 256) | bVarI.A(ji40Var);
                Object objY3 = bVarI.y();
                if (zA2 || objY3 == c0042a2) {
                    objY3 = new Function1() { // from class: dh40
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ((String) obj).getClass();
                            String shareCode = ji40Var.a.getShareCode();
                            if (shareCode == null) {
                                shareCode = "";
                            }
                            function2.invoke(shareCode);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                }
                Function1 function7 = (Function1) objY3;
                boolean zA3 = ((i5 & 7168) == 2048) | bVarI.A(ji40Var);
                Object objY4 = bVarI.y();
                if (zA3 || objY4 == c0042a2) {
                    objY4 = new Function1() { // from class: eh40
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ((String) obj).getClass();
                            String shareCode = ji40Var.a.getShareCode();
                            if (shareCode == null) {
                                shareCode = "";
                            }
                            function3.invoke(shareCode);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY4);
                }
                tg40.a(ji40Var, function6, function7, (Function1) objY4, bVarI, 8);
                i4 = i5;
                c0042a2 = c0042a2;
            }
            function4 = function2;
            a.C0041a.C0042a c0042a3 = c0042a2;
            int i6 = i4;
            bVarI.X(false);
            bVarI.X(true);
            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                function5 = function0;
                aVar2 = aVar3;
                i3 = 6;
                bVarI.N(-635781984);
                bVarI.X(false);
            } else {
                bVarI.N(-636113529);
                d dVarJ = h.j(androidx.compose.foundation.layout.d.a.b(aVar3, ht.a.c), 0.0f, 50.0f, 8.0f, 0.0f, 9);
                boolean z2 = (458752 & i6) == 131072;
                Object objY5 = bVarI.y();
                if (z2 || objY5 == c0042a3) {
                    function5 = function0;
                    objY5 = new Function0() { // from class: fh40
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ytwVar.setValue(Boolean.TRUE);
                            function5.invoke();
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                } else {
                    function5 = function0;
                }
                Function0 function8 = (Function0) objY5;
                i3 = 6;
                aVar2 = aVar3;
                pea.a(dVarJ, 0L, 0.0f, function8, bVarI, 0);
                bVarI = bVarI;
                bVarI.X(false);
            }
            bVarI.X(true);
            if (list.size() != i3) {
                bVarI.N(1234868993);
                a(cb40.a(R.string.page_load_code__loaded_code_will_only_record_the_last_6, new Object[0], bVarI), bVarI, 0);
                iib0.a(aVar2, 24.0f, bVarI, false);
            } else {
                bVarI.N(1235089062);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            function4 = function2;
            function5 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final Function0 function9 = function5;
            final Function1 function10 = function4;
            eVarZ.d = new Function2() { // from class: gh40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yh40.c(cVar, function1, function10, function3, z, function9, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final boolean z, final Function0 function0, final Function0 function1, final Function1 function2, final Function1 function3, final Function1 function4, a aVar, final int i) {
        int i2;
        boolean z2;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        b bVarI = aVar.i(1352938469);
        if ((i & 384) == 0) {
            i2 = (bVarI.A(function0) ? 256 : 128) | i;
        } else {
            i2 = i;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        int i3 = i2 | (bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function3) ? 131072 : 65536) | (bVarI.A(function4) ? 1048576 : 524288);
        if (bVarI.q(i3 & 1, (599187 & i3) != 599186)) {
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            mz7 mz7Var = (mz7) p8i0.a(jq40.a(mz7.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            ytw ytwVarA = n95.a(mz7Var.N, bh40.b.a, null, bVarI, 48, 2);
            w8i0 w8i0VarA2 = zdt.a(bVarI);
            if (w8i0VarA2 == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final sn20 sn20Var = (sn20) p8i0.a(jq40.a(sn20.class), w8i0VarA2, null, cll.a(w8i0VarA2, bVarI), w8i0VarA2 instanceof iel ? ((iel) w8i0VarA2).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            boolean zA = sn20Var.a.a("recent_list_click_load_code");
            Boolean bool = Boolean.TRUE;
            boolean zA2 = bVarI.A(mz7Var);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA2 || objY == c0042a) {
                objY = new rh40(mz7Var, null);
                bVarI.r(objY);
            }
            xvf.e(bVarI, bool, (Function2) objY);
            d.a aVar2 = d.a.b;
            d dVarA = j.A(j.k(j.g(aVar2, 1.0f), 350.0f, 0.0f, 2), ht.a.j, 2);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
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
            if (z) {
                bVarI.N(-2068309400);
                b(((i3 >> 6) & 14) | ((i3 >> 3) & 896), bVarI, cb40.a(R.string.page_load_code__last_loaded_code, new Object[0], bVarI), function0, function1);
                bVarI.X(false);
            } else {
                bVarI.N(-2068095097);
                bVarI.X(false);
            }
            d dVarA2 = j.A(j.g(androidx.compose.foundation.a.b(aVar2, c68.a(R.color.background_general_primary, bVarI), zk40.a), 1.0f), null, 3);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarA2);
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
            bh40 bh40Var = (bh40) ytwVarA.getValue();
            boolean z3 = bh40Var instanceof bh40.b;
            n54 n54Var = ht.a.e;
            androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
            if (z3) {
                bVarI.N(-864535360);
                z2 = true;
                q330.a(h.j(dVar2.b(aVar2, n54Var), 0.0f, 100.0f, 0.0f, 0.0f, 13), c68.a(R.color.brand_secondary, bVarI), 0.0f, 0L, 0, 0.0f, bVarI, 0, 60);
                bVarI = bVarI;
                bVarI.X(false);
            } else {
                z2 = true;
                if (bh40Var instanceof bh40.a) {
                    bVarI.N(-864167762);
                    lkf0.d(cb40.a(R.string.page_load_code__no_recent_codes_found, new Object[0], bVarI), h.j(dVar2.b(aVar2, n54Var), 80.0f, 80.0f, 80.0f, 0.0f, 8), c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 0, 0, 262136);
                    bVarI = bVarI;
                    bVarI.X(false);
                } else {
                    if (!(bh40Var instanceof bh40.c)) {
                        throw igf0.a(bVarI, -582078614, false);
                    }
                    bVarI.N(-582051565);
                    bh40.c cVar2 = (bh40.c) bh40Var;
                    if (cVar2.a.isEmpty()) {
                        bVarI.N(-863699786);
                        lkf0.d(cb40.a(R.string.page_load_code__no_recent_codes_found, new Object[0], bVarI), h.j(dVar2.b(aVar2, n54Var), 80.0f, 80.0f, 80.0f, 0.0f, 8), c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 0, 0, 262136);
                        bVarI = bVarI;
                        bVarI.X(false);
                    } else {
                        bVarI.N(-863278620);
                        boolean zA3 = bVarI.A(sn20Var);
                        Object objY2 = bVarI.y();
                        if (zA3 || objY2 == c0042a) {
                            objY2 = new Function0() { // from class: oh40
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    sn20Var.a.b("recent_list_click_load_code");
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY2);
                        }
                        int i4 = i3 >> 9;
                        c(cVar2, function2, function3, function4, zA, (Function0) objY2, bVarI, (i4 & 112) | 8 | (i4 & 896) | (i4 & 7168));
                        bVarI = bVarI;
                        bVarI.X(false);
                    }
                    bVarI.X(false);
                }
            }
            bVarI.X(z2);
            bVarI.X(z2);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ph40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yh40.d(z, function0, function1, function2, function3, function4, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:154:0x04da  */
    /* JADX WARN: Code duplicated, block: B:155:0x0500  */
    /* JADX WARN: Code duplicated, block: B:158:0x0520  */
    /* JADX WARN: Code duplicated, block: B:161:0x0536  */
    /* JADX WARN: Code duplicated, block: B:167:0x054e  */
    /* JADX WARN: Code duplicated, block: B:169:0x056b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:170:0x056d  */
    /* JADX WARN: Code duplicated, block: B:174:0x058f  */
    /* JADX WARN: Code duplicated, block: B:177:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:179:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:185:0x05df  */
    /* JADX WARN: Code duplicated, block: B:187:0x05fc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:192:0x0620  */
    /* JADX WARN: Code duplicated, block: B:194:0x0647  */
    /* JADX WARN: Code duplicated, block: B:196:0x064b  */
    /* JADX WARN: Code duplicated, block: B:199:0x067b  */
    /* JADX WARN: Code duplicated, block: B:201:0x069b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(final boolean z, final boolean z2, final Function0 function0, final Function0 function1, final gaj gajVar, final g08 g08Var, final jrm jrmVar, a aVar, final int i) {
        ytw ytwVar;
        ytw ytwVar2;
        jox joxVar;
        pg40 pg40Var;
        eja0 eja0Var;
        boolean zA;
        Object objY;
        jox joxVar2;
        boolean z3;
        boolean zA2;
        Object objY2;
        jox joxVar3;
        zha0 zha0Var;
        boolean zA3;
        Object objY3;
        jox.a aVar2;
        boolean zA4;
        Object objY4;
        jox.a aVar3;
        T t;
        boolean zA5;
        Object objY5;
        boolean z4;
        boolean z5;
        function0.getClass();
        function1.getClass();
        gajVar.getClass();
        jrmVar.getClass();
        b bVarI = aVar.i(-1098701077);
        int i2 = (bVarI.b(z2) ? 256 : 128) | i;
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i3 = i2 | (bVarI.A(gajVar) ? 131072 : 65536) | (bVarI.M(jrmVar) ? 8388608 : 4194304);
        if (bVarI.q(i3 & 1, (4793491 & i3) != 4793490)) {
            Object objY6 = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY6 == c0042a) {
                objY6 = m.b(Boolean.FALSE);
                bVarI.r(objY6);
            }
            final ytw ytwVar3 = (ytw) objY6;
            Object objY7 = bVarI.y();
            if (objY7 == c0042a) {
                objY7 = m.b("");
                bVarI.r(objY7);
            }
            ytw ytwVar4 = (ytw) objY7;
            if (((Boolean) ytwVar3.getValue()).booleanValue()) {
                bVarI.N(542419165);
                String strA = cb40.a(R.string.common_functions__error, new Object[0], bVarI);
                bVarI.N(710238030);
                String strA2 = (String) ytwVar4.getValue();
                if (strA2.length() == 0) {
                    strA2 = cb40.a(R.string.common_feedback__something_went_wrong_please_try_again, new Object[0], bVarI);
                }
                bVarI.X(false);
                Object objY8 = bVarI.y();
                if (objY8 == c0042a) {
                    objY8 = new sx3(ytwVar3, 1);
                    bVarI.r(objY8);
                }
                Function0 function2 = (Function0) objY8;
                Object objY9 = bVarI.y();
                if (objY9 == c0042a) {
                    objY9 = new Function0() { // from class: ih40
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ytwVar3.setValue(Boolean.FALSE);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY9);
                }
                nzj.b(null, strA, strA2, null, null, null, null, null, null, null, null, function2, (Function0) objY9, null, bVarI, 0, 432, 10233);
                bVarI = bVarI;
                bVarI.X(false);
            } else {
                bVarI.N(542757623);
                bVarI.X(false);
            }
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final mz7 mz7Var = (mz7) p8i0.a(jq40.a(mz7.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            w8i0 w8i0VarA2 = zdt.a(bVarI);
            if (w8i0VarA2 == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            eja0 eja0Var2 = (eja0) p8i0.a(jq40.a(eja0.class), w8i0VarA2, null, cll.a(w8i0VarA2, bVarI), w8i0VarA2 instanceof iel ? ((iel) w8i0VarA2).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            w8i0 w8i0VarA3 = zdt.a(bVarI);
            if (w8i0VarA3 == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            n0z n0zVar = (n0z) p8i0.a(jq40.a(n0z.class), w8i0VarA3, null, cll.a(w8i0VarA3, bVarI), w8i0VarA3 instanceof iel ? ((iel) w8i0VarA3).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            ytw ytwVarA = ts9.a(mz7Var.X, bVarI);
            ytw ytwVarA2 = ts9.a(eja0Var2.i, bVarI);
            t340 t340Var = mz7Var.L;
            jox.b bVar = jox.b.a;
            b bVar2 = bVarI;
            ytw ytwVarA3 = n95.a(t340Var, bVar, null, bVar2, 48, 2);
            ytw ytwVarA4 = ts9.a(mz7Var.Z, bVar2);
            Object objY10 = bVar2.y();
            if (objY10 == c0042a) {
                objY10 = m.b("");
                bVar2.r(objY10);
            }
            final ytw ytwVar5 = (ytw) objY10;
            Object objY11 = bVar2.y();
            if (objY11 == c0042a) {
                objY11 = m.b(new BookingData());
                bVar2.r(objY11);
            }
            ytw ytwVar6 = (ytw) objY11;
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            Context context = (Context) bVar2.O(qyd0Var);
            Context applicationContext = context.getApplicationContext();
            Object objY12 = bVar2.y();
            if (objY12 == c0042a) {
                applicationContext.getClass();
                objY12 = ((qg40) qag.a(applicationContext, qg40.class)).m();
                bVar2.r(objY12);
            }
            pg40 pg40Var2 = (pg40) objY12;
            long jA = c68.a(R.color.background_general_primary, bVar2);
            zk40.a aVar4 = zk40.a;
            d.a aVar5 = d.a.b;
            d dVarA = j.A(j.g(androidx.compose.foundation.a.b(aVar5, jA, aVar4), 1.0f), null, 3);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVar2.T);
            ne00 ne00VarS = bVar2.S();
            d dVarC = c.c(bVar2, dVarA);
            yka.k.getClass();
            tsr.a aVar6 = yka.a.b;
            bVar2.D();
            if (bVar2.S) {
                bVar2.F(aVar6);
            } else {
                bVar2.p();
            }
            hlh0.a(bVar2, aivVarC, yka.a.f);
            hlh0.a(bVar2, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVar2.S || !Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVar2, iHashCode, c1350a);
            }
            hlh0.a(bVar2, dVarC, yka.a.d);
            boolean zA6 = bVar2.A(mz7Var);
            Object objY13 = bVar2.y();
            if (zA6 || objY13 == c0042a) {
                objY13 = new jh40(mz7Var, 0);
                bVar2.r(objY13);
            }
            Function1 function3 = (Function1) objY13;
            boolean zA7 = bVar2.A(mz7Var);
            Object objY14 = bVar2.y();
            if (zA7 || objY14 == c0042a) {
                objY14 = new Function1() { // from class: kh40
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        String str = (String) obj;
                        str.getClass();
                        ytwVar5.setValue(str);
                        mz7 mz7Var2 = mz7Var;
                        mz7Var2.D1();
                        ej5.c(o8i0.d(mz7Var2), null, null, new pz7(mz7Var2, null, str), 3);
                        return Unit.a;
                    }
                };
                bVar2.r(objY14);
            }
            Function1 function4 = (Function1) objY14;
            boolean zA8 = bVar2.A(mz7Var);
            Object objY15 = bVar2.y();
            if (zA8 || objY15 == c0042a) {
                objY15 = new Function1() { // from class: lh40
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        String str = (String) obj;
                        str.getClass();
                        mz7 mz7Var2 = mz7Var;
                        mz7Var2.D1();
                        ej5.c(o8i0.d(mz7Var2), null, null, new oz7(mz7Var2, null, str), 3);
                        return Unit.a;
                    }
                };
                bVar2.r(objY15);
            }
            int i4 = i3 >> 3;
            d(z, function0, function1, function3, function4, (Function1) objY15, bVar2, (i4 & 7168) | (i4 & 896) | 54);
            bVarI = bVar2;
            if ((((jox) ytwVarA.getValue()) instanceof jox.e) || (((jox) ytwVarA4.getValue()) instanceof jox.e) || (((jox) ytwVarA2.getValue()) instanceof jox.e) || (((jox) ytwVarA3.getValue()) instanceof jox.e)) {
                bVarI.N(-1653881324);
                q330.a(androidx.compose.foundation.layout.d.a.b(aVar5, ht.a.e), c68.a(R.color.brand_secondary, bVarI), 0.0f, 0L, 0, 0.0f, bVarI, 0, 60);
                bVarI = bVarI;
                bVarI.X(false);
            } else {
                bVarI.N(-1653688163);
                bVarI.X(false);
            }
            jox joxVar4 = (jox) ytwVarA3.getValue();
            if (joxVar4 instanceof jox.a) {
                bVarI.N(-1653550926);
                jox joxVar5 = (jox) ytwVarA3.getValue();
                joxVar5.getClass();
                m9s m9sVar = (m9s) ((jox.a) joxVar5).a;
                LiabilitiesResponse liabilitiesResponse = m9sVar.a;
                BookingData bookingData = m9sVar.c;
                if (liabilitiesResponse.getDisabled()) {
                    bVarI.N(-1653264300);
                    bVarI.X(false);
                    String bookingCode = liabilitiesResponse.getBookingCode();
                    Collection collection = bookingData.outcomes;
                    if (collection == null) {
                        collection = m2g.a;
                    }
                    gajVar.invoke(bookingCode, collection, Boolean.valueOf(m9sVar.b.booleanValue()));
                    z5 = false;
                } else {
                    bVarI.N(-1652977643);
                    if (jrmVar.U().isEmpty()) {
                        bVarI.N(-1652924726);
                        Context context2 = (Context) bVarI.O(qyd0Var);
                        String strA3 = cb40.a(R.string.page_load_code__all_selections_are_not_valid, new Object[0], bVarI);
                        Object objY16 = bVarI.y();
                        if (objY16 == c0042a) {
                            objY16 = new mh40();
                            bVarI.r(objY16);
                        }
                        js.d(context2, R.string.common_functions__error, strA3, null, (Function0) objY16, 16);
                        z5 = false;
                        bVarI.X(false);
                    } else {
                        bVarI.N(-1652461183);
                        n0zVar.J.m(wvs.b.a);
                        String str = (String) ytwVar5.getValue();
                        str.getClass();
                        mz7Var.i.e(str);
                        Context context3 = (Context) bVarI.O(qyd0Var);
                        Ticket ticket = bookingData.ticket;
                        Integer numValueOf = ticket != null ? Integer.valueOf(ticket.getOrderType()) : null;
                        iu2.a.j().r0(k53.REAL);
                        Intent intent = new Intent(context3, (Class<?>) BetslipActivity.class);
                        yt5.g(intent, g08Var.name(), numValueOf, bew.ADD_TO_BETSLIP_DIRECTLY);
                        yrh0.s(context3, intent, true);
                        z5 = false;
                        bVarI.X(false);
                    }
                    bVarI.X(z5);
                }
                bVarI.X(z5);
            } else {
                if ((joxVar4 instanceof jox.c) || (joxVar4 instanceof jox.d)) {
                    bVarI.N(-1652080689);
                    jox joxVar6 = (jox) ytwVarA3.getValue();
                    boolean zA9 = bVarI.A(context) | bVarI.M(ytwVarA3);
                    Object objY17 = bVarI.y();
                    if (zA9 || objY17 == c0042a) {
                        ytwVar = ytwVar3;
                        ytwVar2 = ytwVar4;
                        th40 th40Var = new th40(ytwVarA3, context, ytwVar2, ytwVar, null);
                        bVarI.r(th40Var);
                        objY17 = th40Var;
                    } else {
                        ytwVar = ytwVar3;
                        ytwVar2 = ytwVar4;
                    }
                    xvf.e(bVarI, joxVar6, (Function2) objY17);
                    bVarI.X(false);
                } else {
                    bVarI.N(-1651891589);
                    bVarI.X(false);
                }
                joxVar = (jox) ytwVarA.getValue();
                if (joxVar instanceof jox.a) {
                    bVarI.N(-1651788142);
                    jox joxVar7 = (jox) ytwVarA.getValue();
                    joxVar7.getClass();
                    aVar3 = (jox.a) joxVar7;
                    t = aVar3.a;
                    if (z2) {
                        bVarI.N(-1651684757);
                        bVarI.X(false);
                        ytwVar6.setValue((BookingData) t);
                        String str2 = ((BookingData) ytwVar6.getValue()).shareCode;
                        str2.getClass();
                        eja0Var = eja0Var2;
                        eja0Var.x1(str2);
                        mz7Var.D1();
                        pg40Var = pg40Var2;
                        z4 = false;
                    } else {
                        eja0Var = eja0Var2;
                        bVarI.N(-1651466641);
                        zA5 = bVarI.A(pg40Var) | bVarI.A(context) | bVarI.A(aVar3);
                        objY5 = bVarI.y();
                        if (zA5 || objY5 == c0042a) {
                            pg40Var = pg40Var2;
                            objY5 = new uh40(pg40Var, context, aVar3, null);
                            bVarI.r(objY5);
                        }
                        xvf.e(bVarI, t, (Function2) objY5);
                        z4 = false;
                        bVarI.X(false);
                    }
                    bVarI.X(z4);
                } else {
                    eja0Var = eja0Var2;
                    if (!(joxVar instanceof jox.c) || (joxVar instanceof jox.d)) {
                        pg40Var = pg40Var2;
                        pg40Var = pg40Var2;
                        bVarI.N(-1651057317);
                        jox joxVar8 = (jox) ytwVarA.getValue();
                        zA = bVarI.A(context) | bVarI.M(ytwVarA);
                        objY = bVarI.y();
                        if (zA || objY == c0042a) {
                            vh40 vh40Var = new vh40(ytwVarA, context, ytwVar2, ytwVar, null);
                            bVarI.r(vh40Var);
                            objY = vh40Var;
                        }
                        xvf.e(bVarI, joxVar8, (Function2) objY);
                        bVarI.X(false);
                    } else {
                        pg40Var = pg40Var2;
                        bVarI.N(-1650910501);
                        bVarI.X(false);
                    }
                }
                joxVar2 = (jox) ytwVarA4.getValue();
                if (joxVar2 instanceof jox.a) {
                    bVarI.N(-1650813254);
                    jox joxVar9 = (jox) ytwVarA4.getValue();
                    joxVar9.getClass();
                    aVar2 = (jox.a) joxVar9;
                    T t2 = aVar2.a;
                    zA4 = bVarI.A(pg40Var) | bVarI.A(context) | bVarI.A(aVar2);
                    objY4 = bVarI.y();
                    if (zA4 || objY4 == c0042a) {
                        objY4 = new wh40(pg40Var, context, aVar2, null);
                        bVarI.r(objY4);
                    }
                    xvf.e(bVarI, t2, (Function2) objY4);
                    z3 = false;
                    bVarI.X(false);
                } else {
                    z3 = false;
                    if (!(joxVar2 instanceof jox.c) || (joxVar2 instanceof jox.d)) {
                        bVarI.N(-1650366699);
                        jox joxVar10 = (jox) ytwVarA4.getValue();
                        zA2 = bVarI.A(context) | bVarI.M(ytwVarA4);
                        objY2 = bVarI.y();
                        if (zA2 || objY2 == c0042a) {
                            xh40 xh40Var = new xh40(ytwVarA4, context, ytwVar2, ytwVar, null);
                            bVarI.r(xh40Var);
                            objY2 = xh40Var;
                        }
                        xvf.e(bVarI, joxVar10, (Function2) objY2);
                        z3 = false;
                        bVarI.X(false);
                    } else {
                        bVarI.N(-1650214117);
                        bVarI.X(false);
                    }
                }
                joxVar3 = (jox) ytwVarA2.getValue();
                if (joxVar3 instanceof jox.c) {
                    bVarI.N(-1650123814);
                    bVarI.X(z3);
                    jox joxVar11 = (jox) ytwVarA2.getValue();
                    joxVar11.getClass();
                    zyf0.c(1, ((jox.c) joxVar11).a.getMessage());
                    eja0Var.f.m(bVar);
                } else if (joxVar3 instanceof jox.a) {
                    bVarI.N(-1649913231);
                    jox joxVar12 = (jox) ytwVarA2.getValue();
                    joxVar12.getClass();
                    zha0Var = (zha0) ((jox.a) joxVar12).a;
                    zA3 = bVarI.A(pg40Var) | bVarI.A(context) | bVarI.A(zha0Var) | bVarI.A(eja0Var);
                    objY3 = bVarI.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new sh40(pg40Var, context, zha0Var, eja0Var, ytwVar6, null);
                        bVarI.r(objY3);
                    }
                    xvf.e(bVarI, zha0Var, (Function2) objY3);
                    bVarI.X(false);
                } else {
                    bVarI.N(-1649418533);
                    bVarI.X(false);
                }
                bVarI.X(true);
            }
            ytwVar = ytwVar3;
            ytwVar2 = ytwVar4;
            joxVar = (jox) ytwVarA.getValue();
            if (joxVar instanceof jox.a) {
                bVarI.N(-1651788142);
                jox joxVar13 = (jox) ytwVarA.getValue();
                joxVar13.getClass();
                aVar3 = (jox.a) joxVar13;
                t = aVar3.a;
                if (z2) {
                    bVarI.N(-1651684757);
                    bVarI.X(false);
                    ytwVar6.setValue((BookingData) t);
                    String str3 = ((BookingData) ytwVar6.getValue()).shareCode;
                    str3.getClass();
                    eja0Var = eja0Var2;
                    eja0Var.x1(str3);
                    mz7Var.D1();
                    pg40Var = pg40Var2;
                    z4 = false;
                } else {
                    eja0Var = eja0Var2;
                    bVarI.N(-1651466641);
                    zA5 = bVarI.A(pg40Var) | bVarI.A(context) | bVarI.A(aVar3);
                    objY5 = bVarI.y();
                    if (zA5) {
                        pg40Var = pg40Var2;
                        objY5 = new uh40(pg40Var, context, aVar3, null);
                        bVarI.r(objY5);
                    } else {
                        pg40Var = pg40Var2;
                        objY5 = new uh40(pg40Var, context, aVar3, null);
                        bVarI.r(objY5);
                    }
                    xvf.e(bVarI, t, (Function2) objY5);
                    z4 = false;
                    bVarI.X(false);
                }
                bVarI.X(z4);
            } else {
                eja0Var = eja0Var2;
                if (joxVar instanceof jox.c) {
                    pg40Var = pg40Var2;
                    pg40Var = pg40Var2;
                    bVarI.N(-1651057317);
                    jox joxVar14 = (jox) ytwVarA.getValue();
                    zA = bVarI.A(context) | bVarI.M(ytwVarA);
                    objY = bVarI.y();
                    if (zA) {
                        vh40 vh40Var2 = new vh40(ytwVarA, context, ytwVar2, ytwVar, null);
                        bVarI.r(vh40Var2);
                        objY = vh40Var2;
                    } else {
                        vh40 vh40Var3 = new vh40(ytwVarA, context, ytwVar2, ytwVar, null);
                        bVarI.r(vh40Var3);
                        objY = vh40Var3;
                    }
                    xvf.e(bVarI, joxVar14, (Function2) objY);
                    bVarI.X(false);
                } else {
                    pg40Var = pg40Var2;
                    pg40Var = pg40Var2;
                    bVarI.N(-1651057317);
                    jox joxVar15 = (jox) ytwVarA.getValue();
                    zA = bVarI.A(context) | bVarI.M(ytwVarA);
                    objY = bVarI.y();
                    if (zA) {
                        vh40 vh40Var4 = new vh40(ytwVarA, context, ytwVar2, ytwVar, null);
                        bVarI.r(vh40Var4);
                        objY = vh40Var4;
                    } else {
                        vh40 vh40Var5 = new vh40(ytwVarA, context, ytwVar2, ytwVar, null);
                        bVarI.r(vh40Var5);
                        objY = vh40Var5;
                    }
                    xvf.e(bVarI, joxVar15, (Function2) objY);
                    bVarI.X(false);
                }
            }
            joxVar2 = (jox) ytwVarA4.getValue();
            if (joxVar2 instanceof jox.a) {
                bVarI.N(-1650813254);
                jox joxVar16 = (jox) ytwVarA4.getValue();
                joxVar16.getClass();
                aVar2 = (jox.a) joxVar16;
                T t3 = aVar2.a;
                zA4 = bVarI.A(pg40Var) | bVarI.A(context) | bVarI.A(aVar2);
                objY4 = bVarI.y();
                if (zA4) {
                    objY4 = new wh40(pg40Var, context, aVar2, null);
                    bVarI.r(objY4);
                } else {
                    objY4 = new wh40(pg40Var, context, aVar2, null);
                    bVarI.r(objY4);
                }
                xvf.e(bVarI, t3, (Function2) objY4);
                z3 = false;
                bVarI.X(false);
            } else {
                z3 = false;
                if (joxVar2 instanceof jox.c) {
                    bVarI.N(-1650366699);
                    jox joxVar17 = (jox) ytwVarA4.getValue();
                    zA2 = bVarI.A(context) | bVarI.M(ytwVarA4);
                    objY2 = bVarI.y();
                    if (zA2) {
                        xh40 xh40Var2 = new xh40(ytwVarA4, context, ytwVar2, ytwVar, null);
                        bVarI.r(xh40Var2);
                        objY2 = xh40Var2;
                    } else {
                        xh40 xh40Var3 = new xh40(ytwVarA4, context, ytwVar2, ytwVar, null);
                        bVarI.r(xh40Var3);
                        objY2 = xh40Var3;
                    }
                    xvf.e(bVarI, joxVar17, (Function2) objY2);
                    z3 = false;
                    bVarI.X(false);
                } else {
                    bVarI.N(-1650366699);
                    jox joxVar18 = (jox) ytwVarA4.getValue();
                    zA2 = bVarI.A(context) | bVarI.M(ytwVarA4);
                    objY2 = bVarI.y();
                    if (zA2) {
                        xh40 xh40Var4 = new xh40(ytwVarA4, context, ytwVar2, ytwVar, null);
                        bVarI.r(xh40Var4);
                        objY2 = xh40Var4;
                    } else {
                        xh40 xh40Var5 = new xh40(ytwVarA4, context, ytwVar2, ytwVar, null);
                        bVarI.r(xh40Var5);
                        objY2 = xh40Var5;
                    }
                    xvf.e(bVarI, joxVar18, (Function2) objY2);
                    z3 = false;
                    bVarI.X(false);
                }
            }
            joxVar3 = (jox) ytwVarA2.getValue();
            if (joxVar3 instanceof jox.c) {
                bVarI.N(-1650123814);
                bVarI.X(z3);
                jox joxVar19 = (jox) ytwVarA2.getValue();
                joxVar19.getClass();
                zyf0.c(1, ((jox.c) joxVar19).a.getMessage());
                eja0Var.f.m(bVar);
            } else if (joxVar3 instanceof jox.a) {
                bVarI.N(-1649913231);
                jox joxVar110 = (jox) ytwVarA2.getValue();
                joxVar110.getClass();
                zha0Var = (zha0) ((jox.a) joxVar110).a;
                zA3 = bVarI.A(pg40Var) | bVarI.A(context) | bVarI.A(zha0Var) | bVarI.A(eja0Var);
                objY3 = bVarI.y();
                if (zA3) {
                    objY3 = new sh40(pg40Var, context, zha0Var, eja0Var, ytwVar6, null);
                    bVarI.r(objY3);
                } else {
                    objY3 = new sh40(pg40Var, context, zha0Var, eja0Var, ytwVar6, null);
                    bVarI.r(objY3);
                }
                xvf.e(bVarI, zha0Var, (Function2) objY3);
                bVarI.X(false);
            } else {
                bVarI.N(-1649418533);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: nh40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yh40.e(z, z2, function0, function1, gajVar, g08Var, jrmVar, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(Context context, ytw ytwVar, ytw ytwVar2, jox joxVar) {
        String strValueOf;
        boolean z = joxVar instanceof jox.c;
        if (z || (joxVar instanceof jox.d)) {
            if (z) {
                Throwable th = ((jox.c) joxVar).a;
                boolean z2 = (th instanceof SprThrowable) || (th instanceof JsonErrorThrowable);
                if (!(th instanceof fk50) || z2) {
                    strValueOf = String.valueOf(th.getMessage());
                } else {
                    UiText text = ((fk50) th).getText();
                    text.getClass();
                    strValueOf = text.e(context).toString();
                }
            } else {
                strValueOf = "";
            }
            ytwVar.setValue(strValueOf);
            ytwVar2.setValue(Boolean.TRUE);
        }
    }
}
