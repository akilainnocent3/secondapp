package defpackage;

import android.accounts.Account;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.pocket.deposit.DepositRequest;
import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;
import com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vzd extends m02 implements mlu {
    public final v340 A0;
    public final n1i B0;
    public final ku90<Unit> C0;
    public final v340 D0;
    public final ku90<x7e> E0;
    public final ezd F0;
    public final fzd G0;
    public final f9e l0;
    public final lyd m0;
    public final zi7 n0;
    public final d100 o0;
    public final psm p0;
    public final uqm q0;
    public final mlu r0;
    public final q900 s0;
    public final log0 t0;
    public final wwd0 u0;
    public final wwd0 v0;
    public final List<lyh<lk50<BOConfigValueBundle>>> w0;
    public final wwd0 x0;
    public final wwd0 y0;
    public final v340 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v14, types: [ezd] */
    public vzd(wl wlVar, uy0 uy0Var, zi7 zi7Var, lyd lydVar, f9e f9eVar, cbg cbgVar, uqm uqmVar, psm psmVar, mlu mluVar, uyx uyxVar, lyz lyzVar, d100 d100Var, q900 q900Var, vu60 vu60Var, u290 u290Var, mgb0 mgb0Var, rdd0 rdd0Var, eth0 eth0Var) {
        super(uyxVar, eth0Var, rdd0Var, uy0Var, d100Var, lyzVar, wlVar, psmVar, mgb0Var, uqmVar, u290Var, cbgVar, vu60Var);
        rdd0Var.getClass();
        uy0Var.getClass();
        d100Var.getClass();
        lyzVar.getClass();
        wlVar.getClass();
        psmVar.getClass();
        mgb0Var.getClass();
        uqmVar.getClass();
        u290Var.getClass();
        mluVar.getClass();
        cbgVar.getClass();
        vu60Var.getClass();
        this.l0 = f9eVar;
        this.m0 = lydVar;
        this.n0 = zi7Var;
        this.o0 = d100Var;
        this.p0 = psmVar;
        this.q0 = uqmVar;
        this.r0 = mluVar;
        this.s0 = q900Var;
        this.t0 = log0.a;
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0VarA = xwd0.a(bool);
        this.u0 = wwd0VarA;
        this.v0 = wwd0VarA;
        this.w0 = a.c(d100Var.a(pu0.b.a));
        wwd0 wwd0VarA2 = zjj0.a(null, false);
        this.x0 = wwd0VarA2;
        this.y0 = wwd0VarA2;
        this.z0 = e1i.e(new g1i(new n1i(this.Y, H1(), new kzd(3, null)), new lzd(this, null)), o8i0.d(this), q490.a.a, bool);
        mluVar.C0(this.f, this.h0, o8i0.d(this));
        g1i g1iVar = new g1i(uzh.b(r0i.d(new n1i(new szd(this.D), mluVar.r0(), new hzd(3, null)), new izd(this, null))), new jzd(this, null));
        et7 et7VarD = o8i0.d(this);
        DepositDropAlertStatus.Unavailable unavailable = DepositDropAlertStatus.Unavailable.a;
        lwd0 lwd0Var = q490.a.b;
        v340 v340VarE = e1i.e(g1iVar, et7VarD, lwd0Var, unavailable);
        this.A0 = v340VarE;
        this.B0 = new n1i(this.O, v340VarE, new qzd(3, null));
        ku90<Unit> ku90Var = new ku90<>();
        this.C0 = ku90Var;
        this.D0 = e1i.e(r0i.d(new n1i(new tzd(v340VarE), new xzh(ku90Var, new nzd(2, null)), new ozd(3, null)), new pzd(this, null)), o8i0.d(this), lwd0Var, xi7.b.a);
        ku90<x7e> ku90Var2 = new ku90<>();
        this.E0 = ku90Var2;
        kzh.d(new g1i(ku90Var2, new mzd(this, null)), o8i0.d(this));
        this.F0 = new iaj() { // from class: ezd
            @Override // defpackage.iaj
            public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                String str = (String) obj;
                m8h0 m8h0Var = (m8h0) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                m8h0Var.getClass();
                vzd vzdVar = this.a;
                ku90<spg0> ku90Var3 = vzdVar.v;
                log0 log0Var = log0.a;
                String strF = vzdVar.p0.f();
                BigDecimal bigDecimal = vzdVar.S.c;
                BigDecimal bigDecimal2 = BigDecimal.ZERO;
                bigDecimal2.getClass();
                vpg0.c(ku90Var3, new TxSuccessParams.Card(log0Var, m8h0Var, str, strF, bigDecimal, bigDecimal2, zBooleanValue, null, null));
                return Unit.a;
            }
        };
        this.G0 = new fzd();
    }

    @Override // defpackage.k72
    public final List<lyh<lk50<BOConfigValueBundle>>> A1() {
        return this.w0;
    }

    @Override // defpackage.mlu
    public final void C0(vtw vtwVar, vtw vtwVar2, et7 et7Var) {
        vtwVar.getClass();
        vtwVar2.getClass();
        this.r0.C0(vtwVar, vtwVar2, et7Var);
    }

    @Override // defpackage.m02, defpackage.k72
    /* JADX INFO: renamed from: C1 */
    public final log0 getT0() {
        return this.t0;
    }

    @Override // defpackage.k72
    public final List<c9p> E1() {
        return m2g.a;
    }

    @Override // defpackage.mlu
    public final Object M(DepositDropAlertStatus depositDropAlertStatus, v1b<? super ds> v1bVar) {
        return this.r0.M(depositDropAlertStatus, v1bVar);
    }

    @Override // defpackage.m02
    /* JADX INFO: renamed from: N1, reason: merged with bridge method [inline-methods] */
    public abstract a300.e B1();

    public Function1<Boolean, Unit> O1() {
        return this.G0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object P1(x1b x1bVar) {
        rzd rzdVar;
        String str;
        wwd0 wwd0Var;
        c330 c330Var;
        if (x1bVar instanceof rzd) {
            rzdVar = (rzd) x1bVar;
            int i = rzdVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rzdVar.d = i - Integer.MIN_VALUE;
            } else {
                rzdVar = new rzd(this, x1bVar);
            }
        } else {
            rzdVar = new rzd(this, x1bVar);
        }
        Object obj = rzdVar.b;
        y5b y5bVar = y5b.a;
        int i2 = rzdVar.d;
        wwd0 wwd0Var2 = this.G;
        wwd0 wwd0Var3 = this.x0;
        if (i2 == 0) {
            uj50.b(obj);
            Account account = this.q0.getAccount();
            if (account == null || (str = account.name) == null) {
                return Unit.a;
            }
            boolean zG = Intrinsics.g(z1(), i41.d.a);
            DepositRequest depositRequest = new DepositRequest(zG ? 1 : 0, p54.c(this.S.c), B1().e(), str, null, this.p0.f(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f0 ? "game_flow" : null, 8388560, null);
            c330 c330Var2 = (c330) wwd0Var3.getValue();
            wwd0Var2.setValue(tzs.b.a);
            wwd0Var3.setValue(c330.b.a);
            a300.e eVarB1 = B1();
            b390 b390VarB = d390.b(0, 0, null, 7);
            wzd wzdVarI1 = I1();
            w7e w7eVar = new w7e(CollectionsKt.A0(this.g0), 2);
            rzdVar.a = c330Var2;
            rzdVar.d = 1;
            wwd0Var = wwd0Var3;
            if (this.l0.a(eVarB1, depositRequest, wwd0Var2, this.f, this.v, this.y, this.A, this.h0, b390VarB, this.E0, this.F0, this.K, wzdVarI1, w7eVar, null, rzdVar) == y5bVar) {
                return y5bVar;
            }
            c330Var = c330Var2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c330Var = rzdVar.a;
            uj50.b(obj);
            wwd0Var = wwd0Var3;
        }
        wwd0Var2.setValue(tzs.a.a);
        wwd0Var.setValue(c330Var);
        vpg0.d(this.v);
        return Unit.a;
    }

    public final void Q1(Boolean bool) {
        Boolean boolValueOf = Boolean.valueOf(bool.booleanValue());
        wwd0 wwd0Var = this.u0;
        wwd0Var.getClass();
        wwd0Var.k(null, boolValueOf);
    }

    @Override // defpackage.mlu
    public final Object f0(DepositDropAlertStatus depositDropAlertStatus, boolean z, x000 x000Var, v1b<? super z000> v1bVar) {
        return this.r0.f0(depositDropAlertStatus, z, x000Var, v1bVar);
    }

    @Override // defpackage.mlu
    public final void q1(Long l) {
        this.r0.q1(l);
    }

    @Override // defpackage.mlu
    public final uwd0<Boolean> r0() {
        return this.r0.r0();
    }
}
