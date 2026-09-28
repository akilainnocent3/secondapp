package defpackage;

import android.accounts.Account;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.pocket.common.AssetData;
import com.sporty.android.core.model.pocket.deposit.DepositRequest;
import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;
import com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lf5e;", "Lm02;", "Lmlu;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class f5e extends m02 implements mlu {
    public final wwd0 A0;
    public final wwd0 B0;
    public final v340 C0;
    public final mpe0 D0;
    public final wwd0 E0;
    public final wwd0 F0;
    public final wwd0 G0;
    public final v340 H0;
    public final v340 I0;
    public final v340 J0;
    public final n1i K0;
    public final e5e L0;
    public final ku90<Unit> M0;
    public final v340 N0;
    public final ku90<x7e> O0;
    public final List<lyh<lk50<Object>>> P0;
    public final j4e Q0;
    public final f9e l0;
    public final lyd m0;
    public final zi7 n0;
    public final sr10 o0;
    public final psm p0;
    public final uqm q0;
    public final mlu r0;
    public final q900 s0;
    public final log0 t0;
    public final a300.g u0;
    public final wwd0 v0;
    public final wwd0 w0;
    public final v340 x0;
    public final wwd0 y0;
    public final g1i z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v12, types: [j4e] */
    public f5e(f9e f9eVar, uyx uyxVar, eth0 eth0Var, rdd0 rdd0Var, ei7 ei7Var, lyd lydVar, zi7 zi7Var, uy0 uy0Var, sr10 sr10Var, d100 d100Var, lyz lyzVar, wl wlVar, psm psmVar, mgb0 mgb0Var, uqm uqmVar, u290 u290Var, mlu mluVar, q900 q900Var, cbg cbgVar, vu60 vu60Var) {
        super(uyxVar, eth0Var, rdd0Var, uy0Var, d100Var, lyzVar, wlVar, psmVar, mgb0Var, uqmVar, u290Var, cbgVar, vu60Var);
        rdd0Var.getClass();
        uy0Var.getClass();
        sr10Var.getClass();
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
        this.o0 = sr10Var;
        this.p0 = psmVar;
        this.q0 = uqmVar;
        this.r0 = mluVar;
        this.s0 = q900Var;
        this.t0 = log0.a;
        this.u0 = new a300.g(psmVar.getCountryCode());
        wwd0 wwd0VarA = zjj0.a(null, false);
        this.v0 = wwd0VarA;
        this.w0 = wwd0VarA;
        pu0.b bVar = pu0.b.a;
        wl50 wl50Var = new wl50(sr10Var.a0(bVar), new h4e());
        et7 et7VarD = o8i0.d(this);
        lk50.b bVar2 = lk50.b.a;
        kwd0 kwd0Var = q490.a.a;
        v340 v340VarE = e1i.e(wl50Var, et7VarD, kwd0Var, bVar2);
        this.x0 = v340VarE;
        wwd0 wwd0VarA2 = xwd0.a(null);
        this.y0 = wwd0VarA2;
        this.z0 = new g1i(wwd0VarA2, new b5e(this, null));
        wwd0 wwd0VarA3 = xwd0.a(null);
        this.A0 = wwd0VarA3;
        this.B0 = wwd0VarA3;
        this.C0 = e1i.e(new d5e(wwd0VarA2, this), o8i0.d(this), kwd0Var, 0);
        mpe0 mpe0VarB = hwr.b(new Function0() { // from class: i4e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                f5e f5eVar = this.a;
                return e1i.e(new g1i(new wl50(f5eVar.o0.r(pu0.b.a), new k4e()), new a5e(f5eVar, null)), o8i0.d(f5eVar), q490.a.a, lk50.b.a);
            }
        });
        this.D0 = mpe0VarB;
        wwd0 wwd0VarA4 = xwd0.a("");
        this.E0 = wwd0VarA4;
        this.F0 = wwd0VarA4;
        this.G0 = xwd0.a(null);
        this.H0 = e1i.e(new g1i(r1i.b(this.Y, wwd0VarA3, wwd0VarA4, H1(), new q4e(this, null)), new r4e(this, null)), o8i0.d(this), kwd0Var, Boolean.FALSE);
        this.I0 = e1i.e(new n1i(ei7Var.a.G(), ei7Var.b.r(bVar), new ll50(new di7(), null)), o8i0.d(this), kwd0Var, bVar2);
        mluVar.C0(this.f, this.h0, o8i0.d(this));
        v340 v340VarE2 = e1i.e(new g1i(uzh.b(r0i.d(new n1i(new f1i(wwd0VarA3), mluVar.r0(), new n4e(3, null)), new o4e(this, null))), new p4e(this, null)), o8i0.d(this), kwd0Var, DepositDropAlertStatus.Unavailable.a);
        this.J0 = v340VarE2;
        this.K0 = new n1i(this.O, v340VarE2, new y4e(3, null));
        this.L0 = new e5e(this.Y);
        ku90<Unit> ku90Var = new ku90<>();
        this.M0 = ku90Var;
        this.N0 = e1i.e(r0i.d(new n1i(new c5e(v340VarE2), new xzh(ku90Var, new v4e(2, null)), new w4e(3, null)), new x4e(this, null)), o8i0.d(this), kwd0Var, xi7.b.a);
        ku90<x7e> ku90Var2 = new ku90<>();
        this.O0 = ku90Var2;
        kzh.d(new g1i(ku90Var2, new s4e(this, null)), o8i0.d(this));
        this.P0 = b.k(v340VarE, (uwd0) mpe0VarB.getValue(), d100Var.a(bVar));
        this.Q0 = new iaj() { // from class: j4e
            @Override // defpackage.iaj
            public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                String strA;
                String strA2;
                String str = (String) obj;
                m8h0 m8h0Var = (m8h0) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                m8h0Var.getClass();
                f5e f5eVar = this.a;
                ku90<spg0> ku90Var3 = f5eVar.v;
                log0 log0Var = log0.a;
                String strF = f5eVar.p0.f();
                BigDecimal bigDecimal = f5eVar.S.c;
                BigDecimal bigDecimal2 = BigDecimal.ZERO;
                bigDecimal2.getClass();
                wwd0 wwd0Var = f5eVar.B0;
                jw1 jw1Var = (jw1) wwd0Var.getValue();
                String str2 = jw1Var != null ? jw1Var.c : null;
                jw1 jw1Var2 = (jw1) wwd0Var.getValue();
                String str3 = jw1Var2 != null ? jw1Var2.d : null;
                String str4 = (String) f5eVar.F0.getValue();
                String str5 = "--";
                if (str4 == null || (strA = fu5.a("\\d(?=\\d{4})", str4, "*")) == null) {
                    strA = "--";
                }
                String str6 = (String) f5eVar.G0.getValue();
                if (str6 != null && (strA2 = fu5.a("(?<=\\d{4})\\d", str6, "*")) != null) {
                    str5 = strA2;
                }
                vpg0.c(ku90Var3, new TxSuccessParams.Bank(log0Var, m8h0Var, str, strF, bigDecimal, bigDecimal2, zBooleanValue, str2, str3, strA, str5, null, true));
                return Unit.a;
            }
        };
    }

    @Override // defpackage.k72
    public final List<lyh<lk50<Object>>> A1() {
        return this.P0;
    }

    @Override // defpackage.m02, defpackage.k72
    public final y200 B1() {
        return this.u0;
    }

    @Override // defpackage.mlu
    public final void C0(vtw vtwVar, vtw vtwVar2, et7 et7Var) {
        vtwVar.getClass();
        vtwVar2.getClass();
        this.r0.C0(vtwVar, vtwVar2, et7Var);
    }

    @Override // defpackage.m02, defpackage.k72
    /* JADX INFO: renamed from: C1, reason: from getter */
    public final log0 getU0() {
        return this.t0;
    }

    @Override // defpackage.k72
    public final List<c9p> E1() {
        return b.k(ej5.c(o8i0.d(this), null, null, new u4e(this, null), 3), ej5.c(o8i0.d(this), null, null, new t4e(this, null), 3));
    }

    @Override // defpackage.m02
    /* JADX INFO: renamed from: J1 */
    public final a300 B1() {
        return this.u0;
    }

    @Override // defpackage.mlu
    public final Object M(DepositDropAlertStatus depositDropAlertStatus, v1b<? super ds> v1bVar) {
        return this.r0.M(depositDropAlertStatus, v1bVar);
    }

    public final void N1() {
        this.y0.setValue(null);
        this.A0.setValue(null);
        wwd0 wwd0Var = this.E0;
        wwd0Var.getClass();
        wwd0Var.k(null, "");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object O1(x1b x1bVar) {
        z4e z4eVar;
        String str;
        String str2;
        String accountNumber;
        wwd0 wwd0Var;
        wwd0 wwd0Var2;
        boolean z;
        UiText uiText;
        if (x1bVar instanceof z4e) {
            z4eVar = (z4e) x1bVar;
            int i = z4eVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z4eVar.c = i - Integer.MIN_VALUE;
            } else {
                z4eVar = new z4e(this, x1bVar);
            }
        } else {
            z4eVar = new z4e(this, x1bVar);
        }
        Object obj = z4eVar.a;
        y5b y5bVar = y5b.a;
        int i2 = z4eVar.c;
        wwd0 wwd0Var3 = this.v0;
        wwd0 wwd0Var4 = this.G;
        if (i2 == 0) {
            uj50.b(obj);
            Account account = this.q0.getAccount();
            if (account == null || (str = account.name) == null) {
                return Unit.a;
            }
            jw1 jw1Var = (jw1) this.B0.getValue();
            if (jw1Var == null || (str2 = jw1Var.b) == null) {
                return Unit.a;
            }
            AssetData.AccountsBean accountsBean = (AssetData.AccountsBean) this.y0.getValue();
            if (accountsBean == null || (accountNumber = accountsBean.getAccountNumber()) == null) {
                accountNumber = (String) this.E0.getValue();
            }
            DepositRequest depositRequest = new DepositRequest(Intrinsics.g(z1(), i41.d.a) ? 1 : 0, p54.c(this.S.c), ((Number) this.C0.a.getValue()).intValue(), str, null, this.p0.f(), accountsBean != null ? new Integer(accountsBean.getId()) : null, str2, accountsBean == null ? accountNumber : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16776720, null);
            wwd0Var4.setValue(tzs.b.a);
            wwd0Var3.setValue(c330.b.a);
            b390 b390VarB = d390.b(0, 0, null, 7);
            wzd wzdVarI1 = I1();
            w7e w7eVar = new w7e(CollectionsKt.A0(this.g0), 2);
            z4eVar.c = 1;
            wwd0Var = wwd0Var4;
            wwd0Var2 = wwd0Var3;
            z = false;
            z4e z4eVar2 = z4eVar;
            uiText = null;
            if (this.l0.a(this.u0, depositRequest, wwd0Var, this.f, this.v, this.y, this.A, this.h0, b390VarB, this.O0, this.Q0, this.K, wzdVarI1, w7eVar, null, z4eVar2) == y5bVar) {
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
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:52:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public final void P1(int i) {
        Iterator it;
        Object next;
        AssetData.AccountsBean accountsBean;
        jw1 jw1VarA;
        AssetData.AccountsBean accountsBean2;
        Object next2;
        Object value = this.x0.a.getValue();
        lk50.c cVar = value instanceof lk50.c ? (lk50.c) value : null;
        List list = cVar != null ? (List) cVar.a : null;
        Object value2 = ((uwd0) this.D0.getValue()).getValue();
        lk50.c cVar2 = value2 instanceof lk50.c ? (lk50.c) value2 : null;
        List list2 = cVar2 != null ? (List) cVar2.a : null;
        if (list != null) {
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (((jw1) next2).a != i);
            jw1VarA = (jw1) next2;
            if (jw1VarA == null) {
                if (list2 != null) {
                    return;
                }
                it = list2.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((AssetData.AccountsBean) next).getBankId() != i);
                accountsBean = (AssetData.AccountsBean) next;
                if (accountsBean != null) {
                    return;
                } else {
                    jw1VarA = kw1.a(accountsBean);
                }
            }
        } else {
            if (list2 != null) {
                return;
            }
            it = list2.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((AssetData.AccountsBean) next).getBankId() != i);
            accountsBean = (AssetData.AccountsBean) next;
            if (accountsBean != null) {
                return;
            } else {
                jw1VarA = kw1.a(accountsBean);
            }
        }
        wwd0 wwd0Var = this.y0;
        if (wwd0Var.getValue() != null && (((accountsBean2 = (AssetData.AccountsBean) wwd0Var.getValue()) == null || accountsBean2.getBankId() != i) && wwd0Var.getValue() != null)) {
            N1();
        }
        wwd0 wwd0Var2 = this.A0;
        wwd0Var2.getClass();
        wwd0Var2.k(null, jw1VarA);
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
