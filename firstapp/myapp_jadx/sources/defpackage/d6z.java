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
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class d6z {
    public static final void a(final d dVar, final e6z e6zVar, final Function1<? super uf00<? extends d08>, Unit> function1, final Function1<? super gz00, Unit> function2, final Function0<Unit> function0, final Function1<? super OtpSelection, Unit> function3, final Function0<Unit> function4, a aVar, final int i) {
        int i2;
        Function1<? super uf00<? extends d08>, Unit> function5;
        Function1<? super gz00, Unit> function6;
        Function0<Unit> function7;
        boolean z;
        b bVarI = aVar.i(-621165293);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(e6zVar) : bVarI.A(e6zVar) ? 32 : 16;
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
            function7 = function0;
            i2 |= bVarI.A(function7) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            function7 = function0;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(function4) ? 1048576 : 524288;
        }
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            d dVarH = h.h(j.e(dVar, 1.0f), 32.0f, 0.0f, 2);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
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
            UiText uiText = e6zVar.a;
            uiText.getClass();
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            int i3 = i2;
            lkf0.e(uiText.a((Context) bVarI.O(qyd0Var)), null, c68.a(R.color.text_type1_primary, bVarI), 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, null, mla.l(R.style.H1_B, bVarI), bVarI, 0, 0, 261114);
            d.a aVar3 = d.a.b;
            d dVarJ = h.j(aVar3, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            UiText uiText2 = e6zVar.b;
            uiText2.getClass();
            lkf0.e(uiText2.a((Context) bVarI.O(qyd0Var)), dVarJ, c68.a(R.color.text_type1_primary, bVarI), 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 261112);
            d dVarE = c9j.e(h.j(aVar3, 0.0f, 24.0f, 0.0f, 0.0f, 13));
            hz00 hz00Var = e6zVar.c;
            uf00<d08> uf00Var = hz00Var.a;
            gz00 gz00Var = hz00Var.b;
            gop gopVar = gop.e;
            gop gopVarA = gop.a(123);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new leu(1);
                bVarI.r(objY);
            }
            int i4 = i3 << 9;
            rz00.b(dVarE, uf00Var, gz00Var, gopVarA, (Function1) objY, function5, function6, bVarI, 25152 | (i4 & 458752) | (i4 & 3670016));
            h6z.a(h.j(aVar3, 0.0f, 24.0f, 0.0f, 0.0f, 13), cb40.a(R.string.common_otp_verify__send_again, new Object[0], bVarI), e6zVar.d, function7, bVarI, 518 | ((i3 >> 3) & 7168));
            d dVarJ2 = h.j(aVar3, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            UiText uiText3 = e6zVar.e;
            uiText3.getClass();
            lkf0.e(uiText3.a((Context) bVarI.O(qyd0Var)), dVarJ2, c68.a(R.color.text_type1_secondary, bVarI), 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 261112);
            g75.a(androidx.compose.foundation.a.b(j.g(j.i(h.j(aVar3, 0.0f, 24.0f, 0.0f, 0.0f, 13), 1.0f), 1.0f), c68.a(R.color.line_type1_primary, bVarI), zk40.a), bVarI, 0);
            lkf0.d(cb40.a(R.string.common_otp_verify__please_disable_do_not_disturb_to_recevice_your_code, new Object[0], bVarI), h.j(aVar3, 0.0f, 24.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 130040);
            bVarI = bVarI;
            d dVarJ3 = h.j(aVar3, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            uf00<OtpSelection> uf00Var2 = e6zVar.g;
            boolean z2 = (i3 & 458752) == 131072;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                z = true;
                objY2 = new seb(function3, 1);
                bVarI.r(objY2);
            } else {
                z = true;
            }
            kay.a(dVarJ3, uf00Var2, (Function1) objY2, function4, bVarI, ((i3 >> 9) & 7168) | 6);
            bVarI.X(z);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: u5z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    d6z.a(dVar, e6zVar, function1, function2, function0, function3, function4, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final e6z e6zVar, final Function1<? super q5z, Unit> function1, a aVar, final int i) {
        int i2;
        e6zVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1279131260);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(e6zVar) : bVarI.A(e6zVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        int i3 = 0;
        int i4 = 1;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            qd4.c cVar = e6zVar.j;
            int i5 = i2 & 112;
            boolean z = i5 == 32;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new r5z(function1, i3);
                bVarI.r(objY);
            }
            Function1 function2 = (Function1) objY;
            boolean z2 = i5 == 32;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new a6z(function1, 0);
                bVarI.r(objY2);
            }
            Function1 function3 = (Function1) objY2;
            boolean z3 = i5 == 32;
            Object objY3 = bVarI.y();
            if (z3 || objY3 == c0042a) {
                objY3 = new Function0() { // from class: b6z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(q5z.c.a);
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            Function0 function0 = (Function0) objY3;
            boolean z4 = i5 == 32;
            Object objY4 = bVarI.y();
            if (z4 || objY4 == c0042a) {
                objY4 = new Function0() { // from class: c6z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(q5z.d.a);
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            }
            td4.a(cVar, function2, function3, function0, (Function0) objY4, bVarI, 0, 0);
            j7z<q5z> j7zVar = e6zVar.f;
            boolean z5 = i5 == 32;
            Object objY5 = bVarI.y();
            if (z5 || objY5 == c0042a) {
                objY5 = new leb(function1, i4);
                bVarI.r(objY5);
            }
            Function0 function4 = (Function0) objY5;
            boolean z6 = i5 == 32;
            Object objY6 = bVarI.y();
            if (z6 || objY6 == c0042a) {
                objY6 = new Function1() { // from class: s5z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        q5z q5zVar = (q5z) obj;
                        q5zVar.getClass();
                        function1.invoke(q5zVar);
                        return Unit.a;
                    }
                };
                bVarI.r(objY6);
            }
            Function1 function5 = (Function1) objY6;
            boolean z7 = i5 == 32;
            Object objY7 = bVarI.y();
            if (z7 || objY7 == c0042a) {
                objY7 = new Function1() { // from class: t5z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        q5z q5zVar = (q5z) obj;
                        q5zVar.getClass();
                        function1.invoke(q5zVar);
                        return Unit.a;
                    }
                };
                bVarI.r(objY7);
            }
            Function1 function6 = (Function1) objY7;
            boolean z8 = i5 == 32;
            Object objY8 = bVarI.y();
            if (z8 || objY8 == c0042a) {
                objY8 = new ze2(1, function1);
                bVarI.r(objY8);
            }
            Function0 function7 = (Function0) objY8;
            boolean z9 = i5 == 32;
            Object objY9 = bVarI.y();
            if (z9 || objY9 == c0042a) {
                objY9 = new peb(function1, 1);
                bVarI.r(objY9);
            }
            a5z.a(j7zVar, function4, function5, function6, function7, (Function1) objY9, bVarI, 0);
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(j.e(aVar2, 1.0f), c68.a(R.color.background_general_primary, bVarI), zk40.a);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            d dVarF = h.f(aVar2, 4.0f);
            boolean z10 = i5 == 32;
            Object objY10 = bVarI.y();
            if (z10 || objY10 == c0042a) {
                objY10 = new bf2(function1, 1);
                bVarI.r(objY10);
            }
            c6n.a((Function0) objY10, dVarF, false, null, null, gh9.a, bVarI, 1572912, 60);
            d dVarJ = h.j(aVar2, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            boolean z11 = i5 == 32;
            Object objY11 = bVarI.y();
            if (z11 || objY11 == c0042a) {
                objY11 = new Function1() { // from class: v5z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        uf00 uf00Var = (uf00) obj;
                        uf00Var.getClass();
                        function1.invoke(new q5z.s(uf00Var));
                        return Unit.a;
                    }
                };
                bVarI.r(objY11);
            }
            Function1 function8 = (Function1) objY11;
            boolean z12 = i5 == 32;
            Object objY12 = bVarI.y();
            if (z12 || objY12 == c0042a) {
                objY12 = new urk(function1, i4);
                bVarI.r(objY12);
            }
            Function1 function9 = (Function1) objY12;
            boolean z13 = i5 == 32;
            Object objY13 = bVarI.y();
            if (z13 || objY13 == c0042a) {
                objY13 = new w5z(function1, 0);
                bVarI.r(objY13);
            }
            Function0 function10 = (Function0) objY13;
            boolean z14 = i5 == 32;
            Object objY14 = bVarI.y();
            if (z14 || objY14 == c0042a) {
                objY14 = new Function1() { // from class: x5z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        OtpSelection otpSelection = (OtpSelection) obj;
                        otpSelection.getClass();
                        function1.invoke(new q5z.q(otpSelection));
                        return Unit.a;
                    }
                };
                bVarI.r(objY14);
            }
            Function1 function11 = (Function1) objY14;
            boolean z15 = i5 == 32;
            Object objY15 = bVarI.y();
            if (z15 || objY15 == c0042a) {
                objY15 = new y5z(0, function1);
                bVarI.r(objY15);
            }
            a(dVarJ, e6zVar, function8, function9, function10, function11, (Function0) objY15, bVarI, ((i2 << 3) & 112) | 70);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: z5z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    d6z.b(e6zVar, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
