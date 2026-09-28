package defpackage;

import android.accounts.Account;
import com.sporty.android.common.uievent.a;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.account.themes.ThemeConfig;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.security.twofa.TwoFAHintInfo;
import com.sportybet.core.gift.domain.DobGift;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lrhv;", "Lj8i0;", "", "profile"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rhv extends j8i0 {
    public final x890 A;
    public final rdd0 B;
    public final iv1 C;
    public final dil D;
    public final psm E;
    public final y1k0 F;
    public final ku90<a> G;
    public final lyh<AccountInfo> H;
    public final lyh<Account> I;
    public final lyh<ThemeConfig> J;
    public final lyh<Integer> K;
    public final v340 L;
    public final ku90<iev> M;
    public final ku90<Unit> N;
    public final wwd0 O;
    public final v340 P;
    public final ku90<DobGift> Q;
    public final t340 R;
    public final ohv S;
    public boolean T;
    public boolean U;
    public final odd a;
    public final nev b;
    public final qev c;
    public final lfv d;
    public final cu0 e;
    public final sq40 f;
    public final sre i;
    public final syt v;
    public final qfv w;
    public final eoc y;
    public final rev z;

    public rhv(@Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, nev nevVar, qev qevVar, lfv lfvVar, cu0 cu0Var, sq40 sq40Var, sre sreVar, syt sytVar, qfv qfvVar, eoc eocVar, wev wevVar, t8k t8kVar, rev revVar, x890 x890Var, rdd0 rdd0Var, iv1 iv1Var, dil dilVar, psm psmVar, y1k0 y1k0Var, x9k x9kVar) {
        Object value;
        nevVar.getClass();
        qevVar.getClass();
        lfvVar.getClass();
        cu0Var.getClass();
        fhb0 fhb0Var = cu0Var.a;
        sq40Var.getClass();
        sreVar.getClass();
        eocVar.getClass();
        t8kVar.getClass();
        rdd0Var.getClass();
        iv1Var.getClass();
        dilVar.getClass();
        psmVar.getClass();
        y1k0Var.getClass();
        this.a = oddVar;
        this.b = nevVar;
        this.c = qevVar;
        this.d = lfvVar;
        this.e = cu0Var;
        this.f = sq40Var;
        this.i = sreVar;
        this.v = sytVar;
        this.w = qfvVar;
        this.y = eocVar;
        this.z = revVar;
        this.A = x890Var;
        this.B = rdd0Var;
        this.C = iv1Var;
        this.D = dilVar;
        this.E = psmVar;
        this.F = y1k0Var;
        this.G = new ku90<>();
        lyh<AccountInfo> lyhVar = nevVar.h;
        this.H = lyhVar;
        this.I = nevVar.i;
        v340 v340VarB = eocVar.b();
        this.K = nevVar.j;
        this.L = e1i.e(qevVar.f.b().d(Boolean.FALSE), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), Boolean.TRUE);
        this.M = new ku90<>();
        this.N = new ku90<>();
        wwd0 wwd0VarA = xwd0.a(new cgv(null, null, 131071));
        this.O = wwd0VarA;
        et7 et7VarD = o8i0.d(this);
        zfk zfkVar = nevVar.f;
        v340 v340VarE = e1i.e(zfkVar.b.isLogin() ? new yfk(bm50.f(zfkVar.a.E())) : new gzh(new TwoFAHintInfo(false, false)), et7VarD, new mwd0(0L, Long.MAX_VALUE), new TwoFAHintInfo(false, false));
        this.P = v340VarE;
        ku90<DobGift> ku90Var = new ku90<>();
        this.Q = ku90Var;
        this.R = e1i.a(ku90Var);
        this.S = new ohv(x9kVar.a());
        x1(this, new zfv(uzh.b(r0i.f(qfvVar.a.getAccountInfoFlow(), new yfv(null, qfvVar))), qfvVar), null, new ygv(this, null), 3);
        ej5.c(o8i0.d(this), null, null, new ahv(this, null), 3);
        ej5.c(o8i0.d(this), oddVar, null, new wgv(this, null), 2);
        ej5.c(o8i0.d(this), oddVar, null, new ugv(this, null), 2);
        x1(this, new au0(fhb0Var.n, cu0Var), null, new vgv(this, null), 3);
        wwd0VarA.k(null, new cgv(new gv1(62), wevVar, 126943));
        to1 to1Var = to1.a;
        x1(this, r1i.a(lyhVar, qevVar.c.c(), v340VarB, new ngv(4, null)), null, new ogv(this, null), 3);
        ej5.c(o8i0.d(this), null, null, new tgv(this, null), 3);
        ej5.c(o8i0.d(this), null, null, new qgv(this, null), 3);
        x1(this, new bu0(fhb0Var.m, cu0Var), null, new rgv(this, null), 3);
        yp40 yp40Var = new yp40();
        ffy ffyVar = qevVar.d;
        x1(this, r1i.b(ffyVar.a.a(0), ffyVar.b.h(pu0.b.a), ffyVar.c.isShowingBalanceFlow(), ffyVar.d, new dfy(5, null)), oddVar, new sgv(null, this, yp40Var), 2);
        b990 b990Var = t8kVar.a;
        b990.a[] aVarArr = b990.a.a;
        kzh.d(ozh.c(new g1i(r1i.b(v340VarE, b990Var.a(), t8kVar.b.a(h990.REVIEW), new o0i(new or60(new r8k(t8kVar, null))), new s8k(t8kVar, null)), new xgv(this, null)), oddVar), o8i0.d(this));
        do {
            value = wwd0VarA.getValue();
        } while (!wwd0VarA.g(value, cgv.a((cgv) value, false, null, null, null, null, null, 0, 0, null, null, this.E.getCountryCode().getCode(), false, false, null, 122879)));
        nev nevVar2 = this.b;
        et7 et7VarD2 = o8i0.d(this);
        nevVar2.getClass();
        nevVar2.a.b(et7VarD2);
        kzh.d(ozh.c(new g1i(this.S, new zgv(this, null)), this.a), o8i0.d(this));
        x1(this, this.F.getState(), null, new bhv(null, this, new yp40()), 3);
    }

    public static void x1(rhv rhvVar, lyh lyhVar, odd oddVar, Function2 function2, int i) {
        if ((i & 1) != 0) {
            oddVar = rhvVar.a;
        }
        kzh.d(new g1i(ozh.c(lyhVar, oddVar), function2), o8i0.d(rhvVar));
    }

    public final void y1(pdd0 pdd0Var, k00... k00VarArr) {
        pdd0Var.getClass();
        k00[] k00VarArr2 = (k00[]) Arrays.copyOf(k00VarArr, k00VarArr.length);
        rdd0 rdd0Var = this.B;
        rdd0Var.getClass();
        psm psmVar = this.E;
        psmVar.getClass();
        if (psmVar.x()) {
            rdd0Var.a(pdd0Var, (k00[]) Arrays.copyOf(k00VarArr2, k00VarArr2.length));
        }
    }
}
