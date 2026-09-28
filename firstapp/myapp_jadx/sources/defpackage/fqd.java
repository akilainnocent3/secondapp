package defpackage;

import android.accounts.Account;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.pocket.deposit.DepositRequest;
import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;
import com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lfqd;", "Lm02;", "Lmlu;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class fqd extends m02 implements mlu {
    public final wwd0 A0;
    public final v340 B0;
    public final wwd0 C0;
    public final wwd0 D0;
    public final v340 E0;
    public final wwd0 F0;
    public final List<lyh<lk50<Object>>> G0;
    public final wwd0 H0;
    public final v340 I0;
    public final v340 J0;
    public final v340 K0;
    public final n1i L0;
    public final ku90<Unit> M0;
    public final v340 N0;
    public final ku90<x7e> O0;
    public final lpd P0;
    public final f9e l0;
    public final rdd0 m0;
    public final lyd n0;
    public final zi7 o0;
    public final sr10 p0;
    public final psm q0;
    public final uqm r0;
    public final mlu s0;
    public final q900 t0;
    public final log0 u0;
    public final a300.a.C0004a v0;
    public final v340 w0;
    public final wwd0 x0;
    public final v340 y0;
    public final v340 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v32, types: [lpd] */
    public fqd(f9e f9eVar, uyx uyxVar, eth0 eth0Var, rdd0 rdd0Var, lyd lydVar, zi7 zi7Var, uy0 uy0Var, d100 d100Var, lyz lyzVar, sr10 sr10Var, wl wlVar, psm psmVar, mgb0 mgb0Var, uqm uqmVar, u290 u290Var, mlu mluVar, q900 q900Var, cbg cbgVar, vu60 vu60Var) {
        super(uyxVar, eth0Var, rdd0Var, uy0Var, d100Var, lyzVar, wlVar, psmVar, mgb0Var, uqmVar, u290Var, cbgVar, vu60Var);
        rdd0Var.getClass();
        uy0Var.getClass();
        d100Var.getClass();
        lyzVar.getClass();
        sr10Var.getClass();
        wlVar.getClass();
        psmVar.getClass();
        mgb0Var.getClass();
        uqmVar.getClass();
        u290Var.getClass();
        mluVar.getClass();
        cbgVar.getClass();
        vu60Var.getClass();
        this.l0 = f9eVar;
        this.m0 = rdd0Var;
        this.n0 = lydVar;
        this.o0 = zi7Var;
        this.p0 = sr10Var;
        this.q0 = psmVar;
        this.r0 = uqmVar;
        this.s0 = mluVar;
        this.t0 = q900Var;
        this.u0 = log0.a;
        this.v0 = new a300.a.C0004a(psmVar.getCountryCode());
        pu0.b bVar = pu0.b.a;
        g1i g1iVarV = sr10Var.v(bVar);
        et7 et7VarD = o8i0.d(this);
        lk50.b bVar2 = lk50.b.a;
        kwd0 kwd0Var = q490.a.a;
        v340 v340VarE = e1i.e(g1iVarV, et7VarD, kwd0Var, bVar2);
        this.w0 = v340VarE;
        wwd0 wwd0VarA = xwd0.a(null);
        this.x0 = wwd0VarA;
        this.y0 = e1i.b(wwd0VarA);
        this.z0 = e1i.e(new n1i(bm50.f(v340VarE), wwd0VarA, new eqd(3, null)), o8i0.d(this), kwd0Var, m2g.a);
        wwd0 wwd0VarA2 = xwd0.a(rw1.c);
        this.A0 = wwd0VarA2;
        this.B0 = e1i.b(wwd0VarA2);
        yl50 yl50Var = new yl50(sr10Var.g0(bVar), sry.c);
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0VarA3 = xwd0.a(bool);
        this.C0 = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a(bool);
        this.D0 = wwd0VarA4;
        this.E0 = e1i.e(r1i.a(yl50Var, wwd0VarA3, wwd0VarA4, new zpd(4, null)), o8i0.d(this), kwd0Var, x3e.e);
        this.F0 = xwd0.a(bool);
        this.G0 = b.k(d100Var.a(bVar), v340VarE);
        wwd0 wwd0VarA5 = zjj0.a(null, false);
        this.H0 = wwd0VarA5;
        this.I0 = e1i.e(new n1i(wwd0VarA5, wwd0VarA, new ypd(3, null)), o8i0.d(this), kwd0Var, new c330.a(null, false));
        this.J0 = e1i.e(new g1i(r1i.a(this.Y, H1(), wwd0VarA, new qpd(4, null)), new rpd(this, null)), o8i0.d(this), kwd0Var, bool);
        mluVar.C0(this.f, this.h0, o8i0.d(this));
        v340 v340VarE2 = e1i.e(new g1i(uzh.b(r0i.d(new n1i(new dqd(wwd0VarA), mluVar.r0(), new npd(3, null)), new opd(this, null))), new ppd(this, null)), o8i0.d(this), kwd0Var, DepositDropAlertStatus.Unavailable.a);
        this.K0 = v340VarE2;
        this.L0 = new n1i(this.O, v340VarE2, new aqd(3, null));
        ku90<Unit> ku90Var = new ku90<>();
        this.M0 = ku90Var;
        this.N0 = e1i.e(r0i.d(new n1i(new cqd(v340VarE2), new xzh(ku90Var, new vpd(2, null)), new wpd(3, null)), new xpd(this, null)), o8i0.d(this), kwd0Var, xi7.b.a);
        ku90<x7e> ku90Var2 = new ku90<>();
        this.O0 = ku90Var2;
        kzh.d(new g1i(ku90Var2, new tpd(this, null)), o8i0.d(this));
        this.P0 = new iaj() { // from class: lpd
            @Override // defpackage.iaj
            public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                String str = (String) obj;
                m8h0 m8h0Var = (m8h0) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                m8h0Var.getClass();
                fqd fqdVar = this.a;
                ku90<spg0> ku90Var3 = fqdVar.v;
                log0 log0Var = log0.a;
                String strF = fqdVar.q0.f();
                BigDecimal bigDecimal = fqdVar.S.c;
                BigDecimal bigDecimal2 = BigDecimal.ZERO;
                bigDecimal2.getClass();
                vpg0.c(ku90Var3, new TxSuccessParams.Card(log0Var, m8h0Var, str, strF, bigDecimal, bigDecimal2, zBooleanValue, null, null));
                return Unit.a;
            }
        };
    }

    @Override // defpackage.k72
    public final List<lyh<lk50<Object>>> A1() {
        return this.G0;
    }

    @Override // defpackage.m02, defpackage.k72
    public final y200 B1() {
        return this.v0;
    }

    @Override // defpackage.mlu
    public final void C0(vtw vtwVar, vtw vtwVar2, et7 et7Var) {
        vtwVar.getClass();
        vtwVar2.getClass();
        this.s0.C0(vtwVar, vtwVar2, et7Var);
    }

    @Override // defpackage.m02, defpackage.k72
    /* JADX INFO: renamed from: C1, reason: from getter */
    public final log0 getT0() {
        return this.u0;
    }

    @Override // defpackage.k72
    public final List<c9p> E1() {
        return b.k(ej5.c(o8i0.d(this), null, null, new spd(this, null), 3), ej5.c(o8i0.d(this), null, null, new upd(this, null), 3));
    }

    @Override // defpackage.m02
    /* JADX INFO: renamed from: J1 */
    public final a300 B1() {
        return this.v0;
    }

    @Override // defpackage.mlu
    public final Object M(DepositDropAlertStatus depositDropAlertStatus, v1b<? super ds> v1bVar) {
        return this.s0.M(depositDropAlertStatus, v1bVar);
    }

    public final void N1(w3e w3eVar) {
        wwd0 wwd0Var;
        Object value;
        wwd0 wwd0Var2;
        Object value2;
        Boolean bool;
        if (w3eVar.equals(w3e.c.a)) {
            do {
                wwd0Var2 = this.F0;
                value2 = wwd0Var2.getValue();
                bool = (Boolean) value2;
                bool.getClass();
            } while (!wwd0Var2.g(value2, Boolean.TRUE));
            if (bool.booleanValue()) {
                return;
            }
            this.m0.a(new hnd(), k00.d);
            return;
        }
        boolean zEquals = w3eVar.equals(w3e.b.a);
        wwd0 wwd0Var3 = this.C0;
        if (zEquals) {
            Boolean bool2 = Boolean.TRUE;
            wwd0Var3.getClass();
            wwd0Var3.k(null, bool2);
        } else if (w3eVar.equals(w3e.d.a)) {
            Boolean bool3 = Boolean.FALSE;
            wwd0Var3.getClass();
            wwd0Var3.k(null, bool3);
        } else {
            if (!w3eVar.equals(w3e.a.a)) {
                uhc.a();
                return;
            }
            do {
                wwd0Var = this.D0;
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, Boolean.valueOf(!((Boolean) value).booleanValue())));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object O1(x1b x1bVar) throws Exception {
        bqd bqdVar;
        String str;
        wwd0 wwd0Var;
        wwd0 wwd0Var2;
        boolean z;
        UiText uiText;
        if (x1bVar instanceof bqd) {
            bqdVar = (bqd) x1bVar;
            int i = bqdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bqdVar.c = i - Integer.MIN_VALUE;
            } else {
                bqdVar = new bqd(this, x1bVar);
            }
        } else {
            bqdVar = new bqd(this, x1bVar);
        }
        Object obj = bqdVar.a;
        y5b y5bVar = y5b.a;
        int i2 = bqdVar.c;
        wwd0 wwd0Var3 = this.H0;
        wwd0 wwd0Var4 = this.G;
        if (i2 == 0) {
            uj50.b(obj);
            Account account = this.r0.getAccount();
            if (account == null || (str = account.name) == null) {
                return Unit.a;
            }
            jw1 jw1Var = (jw1) this.x0.getValue();
            if (jw1Var == null) {
                return Unit.a;
            }
            int i3 = jw1Var.a;
            boolean zG = Intrinsics.g(z1(), i41.d.a);
            BigDecimal bigDecimalC = p54.c(this.S.c);
            this.v0.e();
            DepositRequest depositRequest = new DepositRequest(zG ? 1 : 0, bigDecimalC, 25, str, null, this.q0.f(), null, null, null, new Integer(i3), null, null, null, null, null, null, null, null, null, null, null, null, null, this.f0 ? "game_flow" : null, 8388048, null);
            wwd0Var4.setValue(tzs.b.a);
            wwd0Var3.setValue(c330.b.a);
            b390 b390VarB = d390.b(0, 0, null, 7);
            wzd wzdVarI1 = I1();
            w7e w7eVar = new w7e((List<String>) CollectionsKt.A0(this.g0), ((x3e) this.E0.a.getValue()).a.a ? "promotion banner" : null);
            bqdVar.c = 1;
            wwd0Var = wwd0Var4;
            wwd0Var2 = wwd0Var3;
            z = false;
            bqd bqdVar2 = bqdVar;
            uiText = null;
            if (this.l0.a(this.v0, depositRequest, wwd0Var, this.f, this.v, this.y, this.A, this.h0, b390VarB, this.O0, this.P0, this.K, wzdVarI1, w7eVar, null, bqdVar2) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            wwd0Var2 = wwd0Var3;
            z = false;
            wwd0Var = wwd0Var4;
            uiText = null;
        }
        wwd0Var.setValue(tzs.a.a);
        c330.a aVar = new c330.a(uiText, z);
        wwd0Var2.getClass();
        wwd0Var2.k(uiText, aVar);
        vpg0.d(this.v);
        x1("");
        return Unit.a;
    }

    @Override // defpackage.mlu
    public final Object f0(DepositDropAlertStatus depositDropAlertStatus, boolean z, x000 x000Var, v1b<? super z000> v1bVar) {
        return this.s0.f0(depositDropAlertStatus, z, x000Var, v1bVar);
    }

    @Override // defpackage.mlu
    public final void q1(Long l) {
        this.s0.q1(l);
    }

    @Override // defpackage.mlu
    public final uwd0<Boolean> r0() {
        return this.s0.r0();
    }
}
