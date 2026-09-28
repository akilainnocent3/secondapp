package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class r5x {
    public static final void a(d dVar, final boolean z, uxs uxsVar, final Function0<Unit> function0, final Function0<Unit> function1, a aVar, final int i, final int i2) {
        d dVar2;
        int i3;
        uxs uxsVar2;
        final d dVar3;
        uxsVar.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(1970744683);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            i3 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.d(uxsVar.ordinal()) ? 256 : 128;
        }
        int i5 = i3 | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i5 & 1, (i5 & 9363) != 9362)) {
            dVar3 = i4 != 0 ? d.a.b : dVar2;
            d160 d160VarA = b160.a(new kw0.i(8.0f, true, new hw0()), ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar3);
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
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            h((i5 & 112) | ((i5 >> 6) & 896), bVarI, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), function1, z);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            int i6 = (i5 >> 3) & 1008;
            uxsVar2 = uxsVar;
            b(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), uxsVar2, function0, bVarI, i6);
            bVarI.X(true);
        } else {
            uxsVar2 = uxsVar;
            bVarI.G();
            dVar3 = dVar2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final uxs uxsVar3 = uxsVar2;
            eVarZ.d = new Function2() { // from class: p5x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r5x.a(dVar3, z, uxsVar3, function0, function1, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, final uxs uxsVar, final Function0 function0, a aVar, final int i) {
        int i2;
        uxsVar.getClass();
        function0.getClass();
        b bVarI = aVar.i(-104058413);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.d(uxsVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            aza.a(androidx.compose.ui.platform.d.a(dVar, "ninConfirmButton"), cb40.a(R.string.common_functions__confirm, new Object[0], bVarI), uxsVar, null, null, null, null, null, function0, null, bVarI, ((i2 << 3) & 896) | ((i2 << 18) & 234881024), 760);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: k5x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    r5x.b(dVar, uxsVar, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final boolean z, final p4x p4xVar, final uxs uxsVar, final Function0<Unit> function0, final Function0<Unit> function1, a aVar, final int i) {
        p4xVar.getClass();
        uxsVar.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(-459049902);
        int i2 = i | (bVarI.b(z) ? 4 : 2) | (bVarI.d(p4xVar.ordinal()) ? 32 : 16) | (bVarI.d(uxsVar.ordinal()) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            int iOrdinal = p4xVar.ordinal();
            if (iOrdinal == 1) {
                bVarI.N(-379499430);
                int i3 = i2 >> 3;
                b(j.g(d.a.b, 1.0f), uxsVar, function0, bVarI, (i3 & 896) | (i3 & 112) | 6);
                bVarI.X(false);
            } else if (iOrdinal != 2) {
                bVarI.N(-379170830);
                a(null, z, uxsVar, function0, function1, bVarI, ((i2 << 3) & 112) | (i2 & 896) | (i2 & 7168) | (i2 & 57344), 1);
                bVarI.X(false);
            } else {
                bVarI.N(-379256142);
                g((i2 >> 9) & 112, bVarI, null, function1);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, p4xVar, uxsVar, function0, function1, i) { // from class: j5x
                public final /* synthetic */ boolean a;
                public final /* synthetic */ p4x b;
                public final /* synthetic */ uxs c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    r5x.c(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(int i, a aVar) {
        b bVarI = aVar.i(52720723);
        if (bVarI.q(i & 1, i != 0)) {
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
            h9n.a(erz.a(R.drawable.img_gift_close, 0, bVarI), null, j.t(aVar2, 116.0f, 120.0f), null, null, 0.0f, null, bVarI, 432, 120);
            d dVarJ = h.j(aVar2, 0.0f, 24.0f, 0.0f, 0.0f, 13);
            lkf0.d(cb40.a(R.string.identity_verification__national_identification_number_nin_verification, new Object[0], bVarI), dVarJ, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), mla.m(25.0f, bVarI), 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, 48, 0, 127992);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new f1o(i, 1);
        }
    }

    public static final void e(int i, a aVar) {
        b bVar;
        b bVarI = aVar.i(1703238534);
        if (bVarI.q(i & 1, i != 0)) {
            bVar = bVarI;
            lkf0.d(cb40.a(R.string.identity_verification__last_step_to_unlock_first_deposit_gift, new Object[0], bVarI), h.j(j.g(d.a.b, 1.0f), 0.0f, 20.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVar, 48, 0, 130040);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new o5x();
        }
    }

    public static final void f(final String str, final boolean z, a aVar, final int i) {
        b bVar;
        str.getClass();
        b bVarI = aVar.i(1043782866);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.b(z) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarJ = h.j(j.g(d.a.b, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13);
            imf0 imf0VarL = mla.l(R.style.B1_R, bVarI);
            long jA = z ? rzg.a(bVarI, -227565083, R.color.warning_primary, bVarI, false) : rzg.a(bVarI, -227484638, R.color.text_type1_primary, bVarI, false);
            bVar = bVarI;
            lkf0.d(str, dVarJ, jA, null, 0L, null, null, null, 0L, null, new gdf0(5), mla.m(21.0f, bVarI), 0, false, 0, 0, null, imf0VarL, bVar, (i2 & 14) | 48, 0, 127992);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, str, z) { // from class: l5x
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
                    r5x.f(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(final int i, a aVar, final d dVar, final Function0 function0) {
        function0.getClass();
        b bVarI = aVar.i(-762726355);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            xya.b(j.g(aVar2, 1.0f), false, null, null, null, 0.0f, null, function0, wf9.b, bVarI, ((i2 << 18) & 29360128) | 100663296, WebSocketProtocol.PAYLOAD_SHORT);
            dVar = aVar2;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: q5x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r5x.g(qj40.a(i | 1), (a) obj, dVar, function0);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(final int i, a aVar, final d dVar, final Function0 function0, final boolean z) {
        int i2;
        function0.getClass();
        b bVarI = aVar.i(1332951796);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            vuc0.a(dVar, z, null, null, function0, null, null, null, null, wf9.c, bVarI, (i2 & 14) | 805306368 | (i2 & 112) | ((i2 << 6) & 57344), 492);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: i5x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r5x.h(qj40.a(i | 1), (a) obj, dVar, function0, z);
                    return Unit.a;
                }
            };
        }
    }

    public static final void i(final ijf0 ijf0Var, final boolean z, final boolean z2, final Function1<? super ijf0, Unit> function1, a aVar, final int i) {
        ijf0 ijf0Var2;
        int i2;
        boolean z3;
        b bVar;
        ijf0Var.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1724101412);
        if ((i & 6) == 0) {
            ijf0Var2 = ijf0Var;
            i2 = (bVarI.M(ijf0Var2) ? 4 : 2) | i;
        } else {
            ijf0Var2 = ijf0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z3 = z2;
            i2 |= bVarI.b(z3) ? 256 : 128;
        } else {
            z3 = z2;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            d dVarA = androidx.compose.ui.platform.d.a(c9j.e(h.j(d.a.b, 0.0f, 24.0f, 0.0f, 0.0f, 13)), "ninTextField");
            String strA = cb40.a(R.string.identity_verification__enter_nin, new Object[0], bVarI);
            gop gopVar = new gop(3, 0, 123);
            v6x v6xVar = new v6x();
            boolean z4 = (i2 & 7168) == 2048;
            Object objY = bVarI.y();
            if (z4 || objY == a.C0041a.a) {
                objY = new dui(function1, 1);
                bVarI.r(objY);
            }
            Function1 function2 = (Function1) objY;
            int i3 = i2 << 3;
            bVar = bVarI;
            jr7.a(dVarA, ijf0Var2, wf9.a, z3, null, z, strA, null, null, gopVar, v6xVar, 0, null, null, function2, bVar, (i3 & 7168) | (i3 & 112) | 805306752 | ((i2 << 12) & 458752), 0, 14736);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: n5x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    r5x.i(ijf0Var, z, z2, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void j(final int i, a aVar, d dVar, final Function0 function0, final boolean z) {
        final d dVar2;
        function0.getClass();
        b bVarI = aVar.i(774553106);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            ddd0.b(androidx.compose.ui.platform.d.a(h.j(aVar2, 0.0f, 4.0f, 0.0f, 0.0f, 13), "ninNameUpdateButton"), z, null, null, null, 0.0f, false, null, null, function0, wf9.d, null, wf9.e, bVarI, (i2 & 112) | ((i2 << 21) & 1879048192), 390, 2556);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: m5x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r5x.j(qj40.a(i | 1), (a) obj, dVar2, function0, z);
                    return Unit.a;
                }
            };
        }
    }
}
