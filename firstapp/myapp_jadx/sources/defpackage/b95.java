package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final class b95 {
    public static final void a(final q85 q85Var, final Function0 function0, final Function0 function1, final Function0 function2, final Function0 function3, final Function0 function4, final d95 d95Var, a aVar, final int i) {
        int i2;
        Function0 function5;
        Function0 function6;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        b bVarI = aVar.i(1262018719);
        if ((i & 6) == 0) {
            i2 = (bVarI.d(q85Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function5 = function1;
            i2 |= bVarI.A(function5) ? 256 : 128;
        } else {
            function5 = function1;
        }
        if ((i & 3072) == 0) {
            function6 = function2;
            i2 |= bVarI.A(function6) ? 2048 : 1024;
        } else {
            function6 = function2;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? bVarI.M(d95Var) : bVarI.A(d95Var) ? 1048576 : 524288;
        }
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            j590 j590VarG = v1w.g(true, null, bVarI, 6, 2);
            final ytw ytwVarC = wyh.c(d95Var.y, bVarI, 0, 7);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = b40.a(bVarI);
            }
            final v3a0 v3a0Var = (v3a0) objY;
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            ku90<com.sporty.android.common.uievent.a> ku90Var = d95Var.z;
            boolean zA = bVarI.A(context);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new z85(v3a0Var, context, null);
                bVarI.r(objY2);
            }
            abs.b(ku90Var, null, null, (gaj) objY2, bVarI, 0);
            d dVarC = c9j.c(d.a.b, AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, "register__success_sheet");
            i060 i060VarE = j060.e(10.0f, 10.0f, 0.0f, 0.0f, 12);
            long jA = c68.a(R.color.bg_primary_d_base, bVarI);
            boolean z = ((57344 & i2) == 16384) | ((i2 & 458752) == 131072);
            Object objY3 = bVarI.y();
            if (z || objY3 == c0042a) {
                objY3 = new Function0() { // from class: r85
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function3.invoke();
                        function4.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            final Function0 function7 = function5;
            final Function0 function8 = function6;
            v1w.a((Function0) objY3, dVarC, j590VarG, 0.0f, false, i060VarE, jA, 0L, 0L, null, null, null, pp8.b(-1584503551, new gaj() { // from class: s85
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        c95 c95Var = (c95) ytwVarC.getValue();
                        final Function0 function9 = function0;
                        boolean zM = aVar2.M(function9);
                        final Function0 function10 = function4;
                        boolean zM2 = zM | aVar2.M(function10);
                        Object objY4 = aVar2.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (zM2 || objY4 == c0042a2) {
                            objY4 = new Function0() { // from class: u85
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function9.invoke();
                                    function10.invoke();
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY4);
                        }
                        Function0 function11 = (Function0) objY4;
                        d95 d95Var2 = d95Var;
                        boolean zA2 = aVar2.A(d95Var2);
                        Object objY5 = aVar2.y();
                        if (zA2 || objY5 == c0042a2) {
                            a95 a95Var = new a95(0, d95Var2, d95.class, "activateMission", "activateMission()V", 0);
                            aVar2.r(a95Var);
                            objY5 = a95Var;
                        }
                        b95.b(c95Var, q85Var, v3a0Var, function11, (Function0) ((chp) objY5), function7, function8, aVar2, 384);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 0, 3078, 7064);
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: t85
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b95.a(q85Var, function0, function1, function2, function3, function4, d95Var, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final c95 c95Var, final q85 q85Var, final v3a0 v3a0Var, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, final Function0<Unit> function3, a aVar, final int i) {
        b bVarI = aVar.i(-2047731890);
        int i2 = i | (bVarI.M(c95Var) ? 4 : 2) | (bVarI.d(q85Var.ordinal()) ? 32 : 16) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function2) ? 131072 : 65536) | (bVarI.A(function3) ? 1048576 : 524288);
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), c68.a(R.color.bg_primary_d_base, bVarI), zk40.a);
            aiv aivVarC = g75.c(ht.a.a, false);
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
            d dVarI = h.i(j.g(aVar2, 1.0f), 24.0f, 24.0f, 24.0f, 16.0f);
            i78 i78VarA = g78.a(new kw0.i(16.0f, true, new hw0()), ht.a.n, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarI);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            e(c95Var.a, c95Var.c instanceof d85.a, bVarI, 0);
            int i3 = i2 >> 6;
            d(c95Var.c, q85Var, function1, function2, function3, bVarI, (i2 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344));
            bVarI = bVarI;
            c(function0, bVarI, (i2 >> 9) & 14);
            bVarI.X(true);
            s3a0.b(v3a0Var, androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.h), kt8.a, bVarI, 390, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(q85Var, v3a0Var, function0, function1, function2, function3, i) { // from class: v85
                public final /* synthetic */ q85 b;
                public final /* synthetic */ v3a0 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(385);
                    b95.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(Function0<Unit> function0, a aVar, final int i) {
        int i2;
        final Function0<Unit> function1;
        b bVarI = aVar.i(-25086448);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            function1 = function0;
            xya.b(c9j.d(j.g(d.a.b, 1.0f), "register__deposit_now__btn"), false, null, null, null, 0.0f, null, function1, kt8.b, bVarI, ((i2 << 21) & 29360128) | 100663296, WebSocketProtocol.PAYLOAD_SHORT);
        } else {
            function1 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: y85
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    b95.c(function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final d85 d85Var, q85 q85Var, Function0<Unit> function0, Function0<Unit> function1, final Function0<Unit> function2, a aVar, final int i) {
        Function0<Unit> function3;
        final Function0<Unit> function4;
        final q85 q85Var2;
        b bVarI = aVar.i(-1777947854);
        int i2 = (bVarI.M(d85Var) ? 4 : 2) | i | (bVarI.d(q85Var.ordinal()) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            if (Intrinsics.g(d85Var, d85.b.a)) {
                bVarI.N(789104880);
                c85.b(0, bVarI);
                bVarI.X(false);
            } else if (Intrinsics.g(d85Var, d85.c.a)) {
                bVarI.N(789107491);
                ovx.a(function2, bVarI, (i2 >> 12) & 14);
                bVarI.X(false);
            } else {
                if (!(d85Var instanceof d85.a)) {
                    throw igf0.a(bVarI, 789103287, false);
                }
                bVarI.N(789110845);
                function3 = function1;
                c85.a((d85.a) d85Var, q85Var, function0, function3, bVarI, i2 & 8190);
                q85Var2 = q85Var;
                function4 = function0;
                bVarI.X(false);
            }
            function3 = function1;
            function4 = function0;
            q85Var2 = q85Var;
        } else {
            function3 = function1;
            function4 = function0;
            q85Var2 = q85Var;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final Function0<Unit> function5 = function3;
            eVarZ.d = new Function2() { // from class: x85
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b95.d(d85Var, q85Var2, function4, function5, function2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final String str, final boolean z, a aVar, final int i) {
        String strA;
        b bVarI = aVar.i(1331425953);
        int i2 = (bVarI.M(str) ? 4 : 2) | i | (bVarI.b(z) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            mw90.a(doc.a(bVarI) ? "https://s.sporty.net/cms/ic_success_with_ripple_dark_10add50bf7.png" : "https://s.sporty.net/cms/ic_success_with_ripple_light_44a8ed6e67.png", null, j.r(aVar2, 64.0f), null, null, null, null, bVarI, 432, 2040);
            i78 i78VarA = g78.a(new kw0.i(8.0f, true, new hw0()), ht.a.n, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
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
            lkf0.d(cb40.a(R.string.page_login__registration_complete, new Object[0], bVarI), null, c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, bVarI), bVarI, 0, 0, 130042);
            d dVarE = c9j.e(aVar2);
            if (z) {
                bVarI.N(1697666214);
                strA = cb40.a(R.string.page_loyalty__welcome_vusername_sporty_clube_member, new Object[]{str}, bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(1697845084);
                strA = cb40.a(R.string.page_loyalty__welcome_to_sportybet, new Object[0], bVarI);
                bVarI.X(false);
            }
            lkf0.d(strA, dVarE, c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R_21, bVarI), bVarI, 0, 0, 130040);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, str, z) { // from class: w85
                public final /* synthetic */ String a;
                public final /* synthetic */ boolean b;

                {
                    this.a = str;
                    this.b = z;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    b95.e(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
