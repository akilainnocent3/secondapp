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
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class noj0 {
    public static final void a(d dVar, final fjf0 fjf0Var, final crj0 crj0Var, final i41 i41Var, final Function0 function0, final Function0 function1, final Function0 function2, a aVar, final int i) {
        final d dVar2;
        b bVarI = aVar.i(1981234084);
        int i2 = i | 6 | (bVarI.M(fjf0Var) ? 32 : 16) | (bVarI.M(crj0Var) ? 256 : 128) | (bVarI.A(i41Var) ? 2048 : 1024) | (bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function1) ? 131072 : 65536) | (bVarI.A(function2) ? 1048576 : 524288);
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            crj0.b bVar = (crj0.b) (!(crj0Var instanceof crj0.b) ? null : crj0Var);
            if (bVar == null) {
                bVar = new crj0.b(0);
            }
            final crj0.b bVar2 = bVar;
            final Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            u60.a(function1, null, pp8.b(1149531821, new Function2() { // from class: aoj0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    crj0.b bVar3;
                    d.a aVar2;
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar4 = d.a.b;
                        d dVarG = h.g(androidx.compose.foundation.a.b(j.g(aVar4, 1.0f), c68.a(R.color.background_type1_secondary, aVar3), zk40.a), 20.0f, 32.0f);
                        Object objY = aVar3.y();
                        if (objY == a.C0041a.a) {
                            objY = new eoj0();
                            aVar3.r(objY);
                        }
                        d dVarB = xa80.b(dVarG, false, (Function1) objY);
                        i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar3, 48);
                        int iHashCode = Long.hashCode(aVar3.m());
                        ne00 ne00VarO = aVar3.o();
                        d dVarC = c.c(aVar3, dVarB);
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
                        hlh0.a(aVar3, i78VarA, yka.a.f);
                        hlh0.a(aVar3, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                        }
                        hlh0.a(aVar3, dVarC, yka.a.d);
                        lkf0.d(cb40.a(R.string.identity_verification__please_enter_you_nin_for_verification, new Object[0], aVar3), g3w.h(aVar4, "withdraw_nin_dialog_title"), c68.a(R.color.text_type1_primary, aVar3), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_M, aVar3), aVar3, 48, 0, 130040);
                        crj0.b bVar4 = bVar2;
                        a aVar6 = aVar3;
                        b5x.a(null, context, fjf0Var, bVar4.c, aVar6, 0);
                        if (bVar4.d.length() > 0) {
                            aVar6.N(20871217);
                            d dVarJ = h.j(j.g(aVar4, 1.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13);
                            aVar2 = aVar4;
                            bVar3 = bVar4;
                            lkf0.d(bVar4.d, dVarJ, c68.a(R.color.text_type1_primary, aVar6), null, 0L, null, null, null, 0L, null, new gdf0(5), mla.m(21.0f, aVar6), 0, false, 0, 0, null, mla.l(R.style.B2_R, aVar6), aVar6, 48, 0, 127992);
                            aVar6 = aVar6;
                            aVar6.H();
                        } else {
                            bVar3 = bVar4;
                            aVar2 = aVar4;
                            aVar6.N(21371371);
                            aVar6.H();
                        }
                        a aVar7 = aVar6;
                        l9z.a(h.j(aVar2, 0.0f, 24.0f, 0.0f, 0.0f, 13), cb40.a(R.string.common_functions__cancel, new Object[0], aVar6), cb40.a(R.string.common_functions__confirm, new Object[0], aVar6), bVar3.a, null, null, function1, function0, aVar7, 6, 48);
                        a aVar8 = aVar7;
                        if (Intrinsics.g(i41Var, i41.a.a)) {
                            aVar8.N(21904199);
                            ddd0.a(g3w.h(h.j(aVar2, 0.0f, 16.0f, 0.0f, 0.0f, 13), "withdraw_nin_dialog_name_update"), false, null, null, null, false, null, null, function2, d1a.b, aVar8, 805306374, 254);
                            aVar8 = aVar8;
                            aVar8.H();
                        } else {
                            aVar8.N(22461579);
                            aVar8.H();
                        }
                        aVar8.s();
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 15) & 14) | 384, 2);
            dVar2 = d.a.b;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(fjf0Var, crj0Var, i41Var, function0, function1, function2, i) { // from class: boj0
                public final /* synthetic */ fjf0 b;
                public final /* synthetic */ crj0 c;
                public final /* synthetic */ i41 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(4097);
                    noj0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(d dVar, final i41 i41Var, final Function0 function0, final Function0 function1, final Function0 function2, a aVar, final int i) {
        Function0 function3;
        b bVarI = aVar.i(-1286873518);
        int i2 = i | 6 | (bVarI.A(i41Var) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024) | (bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            function3 = function1;
            u60.a(function3, null, pp8.b(-1219050519, new Function2() { // from class: coj0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar3 = d.a.b;
                        d dVarG = h.g(androidx.compose.foundation.a.b(j.g(aVar3, 1.0f), c68.a(R.color.background_type1_secondary, aVar2), zk40.a), 20.0f, 32.0f);
                        Object objY = aVar2.y();
                        if (objY == a.C0041a.a) {
                            objY = new foj0();
                            aVar2.r(objY);
                        }
                        d dVarB = xa80.b(dVarG, false, (Function1) objY);
                        i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarB);
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
                        hlh0.a(aVar2, i78VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        lkf0.d(cb40.a(R.string.page_withdraw__withdrawal_review, new Object[0], aVar2), g3w.h(aVar3, "withdraw_review_dialog_title"), c68.a(R.color.text_type1_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_M, aVar2), aVar2, 48, 0, 130040);
                        lkf0.d(cb40.a(R.string.page_withdraw__withdrawal_review_content, new Object[0], aVar2), g3w.h(h.j(aVar3, 0.0f, 20.0f, 0.0f, 0.0f, 13), "withdraw_review_dialog_content"), c68.a(R.color.text_type1_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.B1_R, aVar2), 0L, 0L, null, null, null, 0L, null, null, null, 0, d2l.f(21), null, null, 16646143), aVar2, 48, 0, 130040);
                        a aVar5 = aVar2;
                        l9z.a(h.j(aVar3, 0.0f, 24.0f, 0.0f, 0.0f, 13), cb40.a(R.string.common_functions__cancel, new Object[0], aVar5), cb40.a(R.string.common_functions__confirm, new Object[0], aVar5), uxs.ENABLE, null, null, function1, function0, aVar5, 3078, 48);
                        if (Intrinsics.g(i41Var, i41.a.a)) {
                            aVar5.N(-1599635009);
                            ddd0.a(g3w.h(h.j(aVar3, 0.0f, 16.0f, 0.0f, 0.0f, 13), "withdraw_nin_dialog_name_update"), false, null, null, null, false, null, null, function2, d1a.a, aVar5, 805306374, 254);
                            aVar5 = aVar5;
                            aVar5.H();
                        } else {
                            aVar5.N(-1599077629);
                            aVar5.H();
                        }
                        aVar5.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 9) & 14) | 384, 2);
            dVar = d.a.b;
        } else {
            function3 = function1;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final d dVar2 = dVar;
            final Function0 function4 = function3;
            eVarZ.d = new Function2(i41Var, function0, function4, function2, i) { // from class: doj0
                public final /* synthetic */ i41 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(65);
                    noj0.b(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(d dVar, final Function0 function0, final Function0 function1, final Function0 function2, final Function0 function3, final irj0 irj0Var, a aVar, final int i) {
        final d dVar2;
        d.a aVar2;
        boolean z;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        irj0Var.getClass();
        b bVarI = aVar.i(-1902779135);
        int i2 = i | 6 | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024) | (bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(irj0Var) ? 131072 : 65536);
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            ytw ytwVarC = wyh.c(irj0Var.e, bVarI, 0, 7);
            ytw ytwVarC2 = wyh.c(irj0Var.i, bVarI, 0, 7);
            d.a aVar3 = d.a.b;
            d dVarE = j.e(aVar3, 1.0f);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new xnj0();
                bVarI.r(objY);
            }
            d dVarB = xa80.b(dVarE, false, (Function1) objY);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
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
            crj0 crj0Var = (crj0) ytwVarC.getValue();
            int i3 = 2;
            if (Intrinsics.g(crj0Var, crj0.f.a)) {
                bVarI.N(123045884);
                i41 i41Var = (i41) ytwVarC2.getValue();
                int i4 = i2 & 458752;
                boolean z2 = i4 == 131072 || bVarI.A(irj0Var);
                Object objY2 = bVarI.y();
                if (z2 || objY2 == c0042a) {
                    objY2 = new aau(irj0Var, 2);
                    bVarI.r(objY2);
                }
                Function0 function4 = (Function0) objY2;
                int i5 = i2 & 112;
                boolean z3 = (i5 == 32) | (i4 == 131072 || bVarI.A(irj0Var));
                Object objY3 = bVarI.y();
                if (z3 || objY3 == c0042a) {
                    objY3 = new Function0() { // from class: ioj0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function0.invoke();
                            irj0Var.x1();
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                }
                Function0 function5 = (Function0) objY3;
                boolean z4 = ((i2 & 896) == 256) | (i4 == 131072 || bVarI.A(irj0Var)) | (i5 == 32);
                Object objY4 = bVarI.y();
                if (z4 || objY4 == c0042a) {
                    objY4 = new Function0() { // from class: joj0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function0.invoke();
                            irj0Var.x1();
                            function1.invoke();
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY4);
                }
                b(null, i41Var, function4, function5, (Function0) objY4, bVarI, 64);
                bVarI.X(false);
                aVar2 = aVar3;
            } else {
                if (crj0Var instanceof crj0.b) {
                    bVarI.N(123770602);
                    w4x w4xVar = (w4x) ((x5a0) irj0Var.c).getValue();
                    crj0 crj0Var2 = (crj0) ytwVarC.getValue();
                    i41 i41Var2 = (i41) ytwVarC2.getValue();
                    int i6 = i2 & 458752;
                    boolean z5 = i6 == 131072 || bVarI.A(irj0Var);
                    Object objY5 = bVarI.y();
                    if (z5 || objY5 == c0042a) {
                        objY5 = new ccb(irj0Var, i3);
                        bVarI.r(objY5);
                    }
                    Function0 function6 = (Function0) objY5;
                    int i7 = i2 & 112;
                    boolean z6 = (i7 == 32) | (i6 == 131072 || bVarI.A(irj0Var));
                    Object objY6 = bVarI.y();
                    if (z6 || objY6 == c0042a) {
                        objY6 = new Function0() { // from class: koj0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function0.invoke();
                                irj0Var.x1();
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY6);
                    }
                    Function0 function7 = (Function0) objY6;
                    boolean z7 = ((i2 & 896) == 256) | (i7 == 32) | (i6 == 131072 || bVarI.A(irj0Var));
                    Object objY7 = bVarI.y();
                    if (z7 || objY7 == c0042a) {
                        objY7 = new Function0() { // from class: loj0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function0.invoke();
                                irj0Var.x1();
                                function1.invoke();
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY7);
                    }
                    aVar2 = aVar3;
                    a(null, w4xVar, crj0Var2, i41Var2, function6, function7, (Function0) objY7, bVarI, 4096);
                    bVarI = bVarI;
                    bVarI.X(false);
                    z = true;
                } else {
                    aVar2 = aVar3;
                    if (Intrinsics.g(crj0Var, crj0.d.a)) {
                        bVarI.N(124904892);
                        String strA = cb40.a(R.string.page_payment__nin_verified_title, new Object[0], bVarI);
                        String strA2 = cb40.a(R.string.page_payment__nin_verified_content, new Object[0], bVarI);
                        String strA3 = cb40.a(R.string.common_functions__home, new Object[0], bVarI);
                        String strA4 = cb40.a(R.string.common_functions__transactions, new Object[0], bVarI);
                        alb0 alb0Var = qdf0.a;
                        ryj ryjVarA = syj.a(0L, 0L, 0L, null, qdf0.a(384, 2, c68.a(R.color.brand_secondary, bVarI), bVarI), bVarI, 15);
                        int i8 = i2 & 112;
                        int i9 = i2 & 458752;
                        boolean z8 = (i9 == 131072 || bVarI.A(irj0Var)) | (i8 == 32) | ((i2 & 7168) == 2048);
                        Object objY8 = bVarI.y();
                        if (z8 || objY8 == c0042a) {
                            objY8 = new Function0() { // from class: moj0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function0.invoke();
                                    irj0Var.x1();
                                    function2.invoke();
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY8);
                        }
                        Function0 function8 = (Function0) objY8;
                        boolean z9 = (i9 == 131072 || bVarI.A(irj0Var)) | (i8 == 32) | ((i2 & 57344) == 16384);
                        Object objY9 = bVarI.y();
                        if (z9 || objY9 == c0042a) {
                            objY9 = new Function0() { // from class: ynj0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function0.invoke();
                                    irj0Var.x1();
                                    function3.invoke();
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY9);
                        }
                        nzj.d(strA, strA2, null, ryjVarA, strA3, strA4, null, null, null, null, null, function8, (Function0) objY9, null, bVarI, 0, 0, 20372);
                        bVarI = bVarI;
                        bVarI.X(false);
                    } else if (Intrinsics.g(crj0Var, crj0.c.a)) {
                        bVarI.N(126040081);
                        String strA5 = cb40.a(R.string.page_payment__nin_fail_title, new Object[0], bVarI);
                        String strA6 = cb40.a(R.string.page_payment__nin_fail_content, new Object[0], bVarI);
                        String strA7 = cb40.a(R.string.common_functions__ok, new Object[0], bVarI);
                        boolean z10 = ((i2 & 458752) == 131072 || bVarI.A(irj0Var)) | ((i2 & 112) == 32);
                        Object objY10 = bVarI.y();
                        if (z10 || objY10 == c0042a) {
                            objY10 = new Function0() { // from class: znj0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function0.invoke();
                                    irj0Var.x1();
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY10);
                        }
                        nzj.b(null, strA5, strA6, null, null, null, strA7, null, null, null, null, null, (Function0) objY10, null, bVarI, 0, 0, 12217);
                        bVarI = bVarI;
                        bVarI.X(false);
                    } else if (Intrinsics.g(crj0Var, crj0.a.a)) {
                        bVarI.N(126579512);
                        String strA8 = cb40.a(R.string.common_functions__error, new Object[0], bVarI);
                        String strA9 = cb40.a(R.string.common_feedback__something_went_wrong_please_try_again_later, new Object[0], bVarI);
                        String strA10 = cb40.a(R.string.common_functions__ok, new Object[0], bVarI);
                        boolean z11 = ((i2 & 458752) == 131072 || bVarI.A(irj0Var)) | ((i2 & 112) == 32);
                        Object objY11 = bVarI.y();
                        if (z11 || objY11 == c0042a) {
                            objY11 = new Function0() { // from class: goj0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function0.invoke();
                                    irj0Var.x1();
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY11);
                        }
                        nzj.b(null, strA8, strA9, null, null, null, strA10, null, null, null, null, null, (Function0) objY11, null, bVarI, 0, 0, 12217);
                        bVarI = bVarI;
                        bVarI.X(false);
                    } else {
                        if (!Intrinsics.g(crj0Var, crj0.e.a)) {
                            throw igf0.a(bVarI, 3970099, false);
                        }
                        bVarI.N(127124337);
                        bVarI.X(false);
                        function0.invoke();
                    }
                }
                bVarI.X(z);
                dVar2 = aVar2;
            }
            z = true;
            bVarI.X(z);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, function2, function3, irj0Var, i) { // from class: hoj0
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ irj0 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(262145);
                    noj0.c(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
