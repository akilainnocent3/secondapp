package defpackage;

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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class tsj0 {

    @c0d(c = "com.sportybet.android.globalpay.stp.spei.withdraw.pending.WithdrawalPendingScreenKt$WithdrawalPendingScreen$1$1", f = "WithdrawalPendingScreen.kt", l = {59}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ v3a0 b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v3a0 v3a0Var, String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = v3a0Var;
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (v3a0.b(this.b, this.c, null, false, null, this, 14) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final void a(String str, String str2, androidx.compose.runtime.a aVar, int i) {
        int i2;
        String str3;
        b bVar;
        b bVarI = aVar.i(10287664);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str2) ? 32 : 16;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.d(str, null, c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, i3 & 14, 0, 131066);
            d040.a(1.0f, true, bVarI);
            str3 = str2;
            lkf0.d(str3, h.j(aVar2, 12.0f, 0.0f, 0.0f, 0.0f, 14), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, bVarI), bVarI, ((i3 >> 3) & 14) | 48, 0, 131064);
            bVar = bVarI;
            bVar.X(true);
        } else {
            str3 = str2;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new kf2(str, i, 2, str3);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar) {
        b bVarI = aVar.i(-1703965057);
        if (bVarI.q(i & 1, i != 0)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            h6n.b(erz.a(R.drawable.ic_selection_status_not_started, 0, bVarI), null, j.r(aVar2, 48.0f), c68.a(R.color.icon_brand_sub_primary_d_base, bVarI), bVarI, 432, 0);
            ty0.a(bVarI, j.i(aVar2, 20.0f));
            lkf0.d(cb40.a(R.string.page_withdraw__withdrawal_initiated, new Object[0], bVarI), null, c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, bVarI), bVarI, 0, 0, 131066);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new neu(i);
        }
    }

    public static final void c(String str, String str2, String str3, String str4, String str5, androidx.compose.runtime.a aVar, int i) {
        b bVarI = aVar.i(-2076632086);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16) | (bVarI.M(str3) ? 256 : 128) | (bVarI.M(str4) ? 2048 : 1024) | (bVarI.M(str5) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            d dVarG = j.g(d.a.b, 1.0f);
            i78 i78VarA = g78.a(new kw0.i(12.0f, true, new hw0()), ht.a.n, bVarI, 54);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            ute.b(null, 0.0f, 0L, bVarI, 0, 7);
            a(cb40.a(R.string.common_functions__amount_label, new Object[]{str5}, bVarI), str, bVarI, (i2 << 3) & 112);
            a(cb40.a(R.string.page_withdraw__withdraw_to, new Object[0], bVarI), str4, bVarI, (i2 >> 6) & 112);
            a(cb40.a(R.string.int_clabe, new Object[0], bVarI), str2, bVarI, i2 & 112);
            s9e0.a.getClass();
            String strA = s9e0.a(str3);
            if (strA == null) {
                bVarI.N(536017284);
                bVarI.X(false);
            } else {
                bVarI.N(536017285);
                a(cb40.a(R.string.page_payment__trade_no, new Object[0], bVarI), strA, bVarI, 0);
                bVarI.X(false);
            }
            ute.b(null, 0.0f, 0L, bVarI, 0, 7);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new jf2(str, str2, str3, str4, str5, i, 1);
        }
    }

    public static final void d(final usj0 usj0Var, final Function0<Unit> function0, Function0<Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        final Function0<Unit> function2 = function1;
        b bVarI = aVar.i(483243720);
        int i2 = i | (bVarI.M(usj0Var) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            long jA = c68.a(R.color.background_general_primary, bVarI);
            zk40.a aVar2 = zk40.a;
            d.a aVar3 = d.a.b;
            d dVarF = h.f(j.e(androidx.compose.foundation.a.b(aVar3, jA, aVar2), 1.0f), 20.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
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
            b(0, bVarI);
            ty0.a(bVarI, j.i(aVar3, 24.0f));
            c(usj0Var.a, usj0Var.b, usj0Var.c, usj0Var.d, usj0Var.e, bVarI, 0);
            int i3 = i2 << 21;
            aza.a(hib0.a(aVar3, 20.0f, bVarI, aVar3, 1.0f), pwo.e(R.string.page_payment__continue_betting, bVarI), null, null, null, null, null, null, function0, null, bVarI, (i3 & 234881024) | 6, 764);
            ty0.a(bVarI, j.i(aVar3, 20.0f));
            ddd0.b(null, false, null, null, null, 0.0f, false, null, null, function1, h1a.b, null, h1a.c, bVarI, i3 & 1879048192, 390, 2559);
            bVarI = bVarI;
            function2 = function1;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function2, i) { // from class: ssj0
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    tsj0.d(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(final vsj0 vsj0Var, final Function0<Unit> function0, final Function0<Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        vsj0Var.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(1147389520);
        int i2 = (bVarI.A(vsj0Var) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            ytw ytwVarC = wyh.c(vsj0Var.d, bVarI, 0, 7);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = b40.a(bVarI);
            }
            v3a0 v3a0Var = (v3a0) objY;
            String strA = cb40.a(R.string.page_payment__transaction_has_been_initiated_wait_minutes_for_credit, new Object[0], bVarI);
            Unit unit = Unit.a;
            boolean zM = bVarI.M(strA);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                objY2 = new a(v3a0Var, strA, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, unit, (Function2) objY2);
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
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
            d((usj0) ytwVarC.getValue(), function0, function1, bVarI, i2 & 1008);
            s3a0.b(v3a0Var, androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.h), h1a.a, bVarI, 390, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, i) { // from class: rsj0
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    tsj0.e(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
