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
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
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
public final class uv40 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final d dVar, final e6z e6zVar, final UiText uiText, final Function1<? super q5z, Unit> function1, final Function0<Unit> function0, a aVar, final int i) {
        boolean z;
        qyd0 qyd0Var;
        boolean z2;
        b bVarI = aVar.i(1191204667);
        int i2 = (i & 6) == 0 ? (bVarI.M(dVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(e6zVar) : bVarI.A(e6zVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(uiText) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            d dVarH = h.h(j.e(dVar, 1.0f), 28.0f, 0.0f, 2);
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
            d.a aVar3 = d.a.b;
            mw90.a("https://s.sporty.net/cms/Email_Verification_Image_from_Freepik_1_f49bceb075.png", null, j.i(h.j(aVar3, 0.0f, 12.0f, 0.0f, 0.0f, 13), 64.0f), null, null, d0b.a.c, null, bVarI, 1573302, 1976);
            lkf0.d(cb40.a(R.string.common_otp_verify__phone_verification, new Object[0], bVarI), h.j(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H1_SB, bVarI), bVarI, 48, 0, 130040);
            d dVarJ = h.j(aVar3, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            UiText uiText2 = e6zVar.b;
            uiText2.getClass();
            qyd0 qyd0Var2 = AndroidCompositionLocals_androidKt.b;
            lkf0.d(uiText2.g((Context) bVarI.O(qyd0Var2)), dVarJ, c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 130040);
            d dVarJ2 = h.j(aVar3, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            long jA = c68.a(R.color.bg_brand_sub_secondary_d_darker, bVarI);
            zk40.a aVar4 = zk40.a;
            lkf0.d(e6zVar.i, h.g(androidx.compose.foundation.a.b(dVarJ2, jA, aVar4), 12.0f, 8.0f), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H2_M, bVarI), bVarI, 0, 0, 131064);
            d dVarC2 = c9j.c(h.j(aVar3, 0.0f, 14.0f, 0.0f, 0.0f, 13), AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, "update_phone_btn");
            boolean z3 = (57344 & i2) == 16384;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z3 || objY == c0042a) {
                z = true;
                objY = new tew(function0, 1 == true ? 1 : 0);
                bVarI.r(objY);
            } else {
                z = true;
            }
            lkf0.d(cb40.a(R.string.common_otp_verify__wrong_phone_number, new Object[0], bVarI), g3w.f(dVarC2, z, (Function0) objY), c68.a(R.color.brand_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, 0, 0, 131064);
            b bVar = bVarI;
            d dVarE = c9j.e(h.j(aVar3, 0.0f, 30.0f, 0.0f, 0.0f, 13));
            hz00 hz00Var = e6zVar.c;
            uf00<d08> uf00Var = hz00Var.a;
            gz00 gz00Var = hz00Var.b;
            gop gopVar = gop.e;
            gop gopVarA = gop.a(123);
            Object objY2 = bVar.y();
            if (objY2 == c0042a) {
                objY2 = new jv40();
                bVar.r(objY2);
            }
            Function1 function2 = (Function1) objY2;
            int i3 = i2 & 7168;
            boolean z4 = i3 == 2048;
            Object objY3 = bVar.y();
            if (z4 || objY3 == c0042a) {
                objY3 = new e9n(function1, 3);
                bVar.r(objY3);
            }
            Function1 function3 = (Function1) objY3;
            boolean z5 = i3 == 2048;
            Object objY4 = bVar.y();
            if (z5 || objY4 == c0042a) {
                objY4 = new q7(function1, 1);
                bVar.r(objY4);
            }
            rz00.b(dVarE, uf00Var, gz00Var, gopVarA, function2, function3, (Function1) objY4, bVar, 25152);
            if (uiText != null) {
                bVar.N(1946622938);
                qyd0Var = qyd0Var2;
                lkf0.d(uiText.g((Context) bVar.O(qyd0Var2)), h.j(aVar3, 0.0f, 24.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_danger, bVar), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVar), bVar, 48, 0, 130040);
                bVar = bVar;
                bVar.X(false);
            } else {
                qyd0Var = qyd0Var2;
                bVar.N(1946931729);
                bVar.X(false);
            }
            g75.a(androidx.compose.foundation.a.b(j.g(j.i(h.j(aVar3, 0.0f, 24.0f, 0.0f, 0.0f, 13), 1.0f), 1.0f), c68.a(R.color.border_primary, bVar), aVar4), bVar, 0);
            d dVarJ3 = h.j(aVar3, 0.0f, 24.0f, 0.0f, 0.0f, 13);
            UiText uiText3 = e6zVar.e;
            uiText3.getClass();
            b bVar2 = bVar;
            lkf0.d(uiText3.g((Context) bVar.O(qyd0Var)), dVarJ3, c68.a(R.color.text_primary, bVar), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar), bVar2, 48, 0, 130040);
            d dVarJ4 = h.j(aVar3, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            OtpSelection otpSelection = e6zVar.h;
            List<OtpSelection> list = ru40.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                OtpSelection otpSelection2 = (OtpSelection) obj;
                if (otpSelection2 == e6zVar.h || e6zVar.g.contains(otpSelection2)) {
                    arrayList.add(obj);
                }
            }
            i6z i6zVar = e6zVar.d;
            boolean z6 = (i3 == 2048) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && bVar2.A(e6zVar)));
            Object objY5 = bVar2.y();
            if (z6 || objY5 == c0042a) {
                objY5 = new Function1() { // from class: kv40
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        OtpSelection otpSelection3 = (OtpSelection) obj2;
                        otpSelection3.getClass();
                        OtpSelection otpSelection4 = e6zVar.h;
                        Function1 function4 = function1;
                        if (otpSelection3 == otpSelection4) {
                            function4.invoke(q5z.r.a);
                        } else {
                            function4.invoke(new q5z.q(otpSelection3));
                        }
                        return Unit.a;
                    }
                };
                bVar2.r(objY5);
            }
            n77.b(dVarJ4, otpSelection, arrayList, i6zVar, (Function1) objY5, bVar2, 4102);
            d040.a(1.0f, true, bVar2);
            d dVarJ5 = h.j(aVar3, 0.0f, 0.0f, 0.0f, 28.0f, 7);
            boolean z7 = i3 == 2048;
            Object objY6 = bVar2.y();
            if (z7 || objY6 == c0042a) {
                z2 = true;
                objY6 = new k9n(function1, 1 == true ? 1 : 0);
                bVar2.r(objY6);
            } else {
                z2 = true;
            }
            lkf0.d(cb40.a(R.string.self_exclusion__contact_customer_service, new Object[0], bVar2), g3w.f(dVarJ5, z2, (Function0) objY6), c68.a(R.color.brand_secondary, bVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVar2), bVar2, 0, 0, 130040);
            bVarI = bVar2;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: mv40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    uv40.a(dVar, e6zVar, uiText, function1, function0, (a) obj2, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static final void b(final e6z e6zVar, final Function1 function1, final Function0 function0, final UiText uiText, a aVar, final int i) {
        int i2;
        int i3;
        String strG;
        int i4;
        int i5;
        e6zVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(-2104748730);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(e6zVar) : bVarI.A(e6zVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(uiText) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            int i6 = i2 & 112;
            boolean z = i6 == 32;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new pz00(function1, 1);
                bVarI.r(objY);
            }
            tr1.a(false, (Function0) objY, bVarI, 0, 1);
            qd4.c cVar = e6zVar.j;
            j7z<q5z> j7zVar = e6zVar.f;
            boolean z2 = i6 == 32;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new man(function1, 1);
                bVarI.r(objY2);
            }
            Function1 function2 = (Function1) objY2;
            boolean z3 = i6 == 32;
            Object objY3 = bVarI.y();
            if (z3 || objY3 == c0042a) {
                objY3 = new Function1() { // from class: sv40
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        g74 g74Var = (g74) obj;
                        g74Var.getClass();
                        function1.invoke(new q5z.b(g74Var));
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            Function1 function3 = (Function1) objY3;
            boolean z4 = i6 == 32;
            Object objY4 = bVarI.y();
            if (z4 || objY4 == c0042a) {
                objY4 = new agw(function1, 1);
                bVarI.r(objY4);
            }
            Function0 function4 = (Function0) objY4;
            boolean z5 = i6 == 32;
            Object objY5 = bVarI.y();
            if (z5 || objY5 == c0042a) {
                i3 = 0;
                objY5 = new gv40(function1, 0);
                bVarI.r(objY5);
            } else {
                i3 = 0;
            }
            j7z<q5z> cVar2 = j7zVar;
            td4.a(cVar, function2, function3, function4, (Function0) objY5, bVarI, 0, 0);
            Object objY6 = bVarI.y();
            if (objY6 == c0042a) {
                objY6 = b40.a(bVarI);
            }
            v3a0 v3a0Var = (v3a0) objY6;
            if (uiText == null) {
                bVarI.N(1941789794);
                bVarI.X(i3);
                strG = null;
            } else {
                bVarI.N(-1461382273);
                strG = uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                bVarI.X(i3);
            }
            Object[] objArr = new Object[i3];
            Object objY7 = bVarI.y();
            if (objY7 == c0042a) {
                objY7 = new nv40();
                bVarI.r(objY7);
            }
            ytw ytwVar = (ytw) o350.e(objArr, (Function0) objY7, bVarI, 48);
            boolean zM = bVarI.M(strG) | bVarI.M(ytwVar);
            Object objY8 = bVarI.y();
            if (zM || objY8 == c0042a) {
                objY8 = new tv40(strG, v3a0Var, ytwVar, null);
                bVarI.r(objY8);
            }
            xvf.e(bVarI, strG, (Function2) objY8);
            boolean zM2 = bVarI.M(cVar2);
            Object objY9 = bVarI.y();
            if (zM2 || objY9 == c0042a) {
                j7z.b bVar = cVar2 instanceof j7z.b ? (j7z.b) cVar2 : null;
                objY9 = (bVar == null || !bVar.e) ? null : bVar;
                bVarI.r(objY9);
            }
            final j7z.b bVar2 = (j7z.b) objY9;
            boolean zM3 = bVarI.M(cVar2);
            Object objY10 = bVarI.y();
            if (zM3 || objY10 == c0042a) {
                if (bVar2 != null) {
                    cVar2 = new j7z.c<>(null);
                }
                bVarI.r(cVar2);
                objY10 = cVar2;
            }
            j7z j7zVar2 = (j7z) objY10;
            boolean z6 = i6 == 32;
            Object objY11 = bVarI.y();
            if (z6 || objY11 == c0042a) {
                objY11 = new je4(function1, 1);
                bVarI.r(objY11);
            }
            Function0 function5 = (Function0) objY11;
            boolean z7 = i6 == 32;
            Object objY12 = bVarI.y();
            if (z7 || objY12 == c0042a) {
                objY12 = new Function1() { // from class: hv40
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        q5z q5zVar = (q5z) obj;
                        q5zVar.getClass();
                        function1.invoke(q5zVar);
                        return Unit.a;
                    }
                };
                bVarI.r(objY12);
            }
            Function1 function6 = (Function1) objY12;
            boolean z8 = i6 == 32;
            Object objY13 = bVarI.y();
            if (z8 || objY13 == c0042a) {
                objY13 = new Function1() { // from class: iv40
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        q5z q5zVar = (q5z) obj;
                        q5zVar.getClass();
                        function1.invoke(q5zVar);
                        return Unit.a;
                    }
                };
                bVarI.r(objY13);
            }
            Function1 function7 = (Function1) objY13;
            boolean z9 = i6 == 32;
            int i7 = i2;
            Object objY14 = bVarI.y();
            if (z9 || objY14 == c0042a) {
                objY14 = new sew(function1, 1);
                bVarI.r(objY14);
            }
            Function0 function8 = (Function0) objY14;
            boolean z10 = i6 == 32;
            Object objY15 = bVarI.y();
            if (z10 || objY15 == c0042a) {
                objY15 = new hx00(function1, 1);
                bVarI.r(objY15);
            }
            a5z.a(j7zVar2, function5, function6, function7, function8, (Function1) objY15, bVarI, 0);
            bVarI = bVarI;
            if (e6zVar.k) {
                bVarI.N(-340420306);
                boolean z11 = i6 == 32;
                Object objY16 = bVarI.y();
                if (z11 || objY16 == c0042a) {
                    objY16 = new lv40(function1, 0);
                    bVarI.r(objY16);
                }
                Function0 function9 = (Function0) objY16;
                boolean z12 = i6 == 32;
                Object objY17 = bVarI.y();
                if (z12 || objY17 == c0042a) {
                    objY17 = new Function0() { // from class: ov40
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(q5z.m.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY17);
                }
                i4 = 0;
                k6z.a(function9, (Function0) objY17, bVarI, 0);
                bVarI.X(false);
            } else {
                i4 = 0;
                bVarI.N(-340222340);
                bVarI.X(false);
            }
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(j.e(aVar2, 1.0f), c68.a(R.color.background_general_primary, bVarI), zk40.a);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, i4);
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
            yka.a.b bVar3 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar3);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar3 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar3);
            d dVarJ = h.j(j.i(j.g(aVar2, 1.0f), 48.0f), 0.0f, 12.0f, 12.0f, 0.0f, 9);
            d160 d160VarA = b160.a(kw0.b, ht.a.j, bVarI, 6);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarJ);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar3);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar3);
            d dVarC3 = c9j.c(j.r(aVar2, 24.0f), AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, "otp__leave_btn");
            boolean z13 = i6 == 32;
            Object objY18 = bVarI.y();
            if (z13 || objY18 == c0042a) {
                i5 = 0;
                objY18 = new pv40(function1, i5);
                bVarI.r(objY18);
            } else {
                i5 = 0;
            }
            h6n.b(erz.a(R.drawable.ic_cancel, i5, bVarI), AnalyticsParam.STORY_SKIP_REASON_CLOSE, g3w.f(dVarC3, true, (Function0) objY18), c68.a(R.color.icon_primary, bVarI), bVarI, 48, 0);
            bVarI.X(true);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC4 = c.c(bVarI, layoutWeightElement);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar3);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar3);
            d dVarE = j.e(aVar2, 1.0f);
            UiText uiText2 = bVar2 != null ? bVar2.b : null;
            boolean zM4 = bVarI.M(bVar2) | (i6 == 32);
            Object objY19 = bVarI.y();
            if (zM4 || objY19 == c0042a) {
                objY19 = new Function1() { // from class: qv40
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        q5z q5zVar = (q5z) obj;
                        q5zVar.getClass();
                        boolean z14 = q5zVar instanceof q5z.s;
                        Function1 function10 = function1;
                        if (z14 && bVar2 != null) {
                            function10.invoke(q5z.i.a);
                        }
                        function10.invoke(q5zVar);
                        return Unit.a;
                    }
                };
                bVarI.r(objY19);
            }
            a(dVarE, e6zVar, uiText2, (Function1) objY19, function0, bVarI, ((i7 << 3) & 112) | 70 | (57344 & (i7 << 6)));
            s3a0.b(v3a0Var, androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.h), tl9.a, bVarI, 384, 0);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: rv40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uv40.b(e6zVar, function1, function0, uiText, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
