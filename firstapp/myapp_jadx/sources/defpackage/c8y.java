package defpackage;

import com.appsflyer.oaid.BuildConfig;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sporty.android.core.model.pocket.common.BankTradeResponse;
import com.sporty.android.core.model.pocket.deposit.DepositHistoryStatusData;
import com.sportybet.android.globalpay.data.KycLimitData;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc8y;", "Levw;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class c8y extends evw {
    public final vu60 Z;
    public final xsm a0;
    public final m800 b0;
    public final v800 c0;
    public final k5k d0;
    public final y8j e0;
    public final to6 f0;
    public final wwd0 g0;
    public final v340 h0;
    public final ku90<a7y> i0;
    public final ku90 j0;
    public final qxd0<UiText> k0;
    public final qxd0<List<String>> l0;
    public final qxd0<Integer> m0;
    public final qxd0<UiText> n0;
    public final qxd0<UiText> o0;
    public final qxd0<z900> p0;
    public final qxd0<UiText> q0;
    public final qxd0<UiText> r0;
    public final qxd0<uxs> s0;
    public final qxd0<gtp> t0;
    public final qxd0<dh30> u0;
    public final qxd0<wg8> v0;
    public final qxd0<vc8> w0;
    public boolean x0;

    @c0d(c = "com.sportybet.android.globalpay.nuvei.deposit.NuveiDepositViewModel$startPullingConfig$1", f = "NuveiDepositViewModel.kt", l = {157}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return c8y.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0071  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objA;
            qxd0<vc8> qxd0Var;
            y5b y5bVar = y5b.a;
            int i = this.a;
            boolean z = true;
            c8y c8yVar = c8y.this;
            if (i == 0) {
                uj50.b(obj);
                c8yVar.e2();
                k5k k5kVar = c8yVar.d0;
                this.a = 1;
                objA = k5kVar.a(this);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objA = ((zi50) obj).a;
            }
            if (zi50.a(objA) != null) {
                c8yVar.x1(h000.a.a);
            }
            if (!(objA instanceof zi50.b)) {
                DepositHistoryStatusData depositHistoryStatusData = (DepositHistoryStatusData) objA;
                depositHistoryStatusData.getClass();
                if (c8yVar.X && (qxd0Var = c8yVar.w0) != null) {
                    vc8 vc8VarInvoke = qxd0Var.a.invoke();
                    vc8VarInvoke.getClass();
                    int state = depositHistoryStatusData.getState();
                    d0e[] d0eVarArr = d0e.a;
                    if (state != 91) {
                        if (depositHistoryStatusData.getState() == 93) {
                            int payRecordStatus = depositHistoryStatusData.getPayRecordStatus();
                            i400[] i400VarArr = i400.a;
                            if (payRecordStatus != 15) {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                    }
                    qxd0Var.a(vc8.a(vc8VarInvoke, null, false, null, z, 7));
                }
            }
            c8yVar.T1();
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8y(w9e w9eVar, psm psmVar, uqm uqmVar, l0e.a aVar, iod.a aVar2, mod modVar, i9e i9eVar, x0l x0lVar, hg30.a aVar3, a8y.a aVar4, d9k d9kVar, vu60 vu60Var, m800 m800Var, v800 v800Var, k5k k5kVar, y8j y8jVar, to6 to6Var, u290 u290Var) {
        super(vu60Var, uqmVar, v800Var, aVar, w9eVar, aVar2, modVar, i9eVar, x0lVar, aVar3, psmVar, d9kVar, u290Var);
        v4c v4cVar = v4c.a;
        w9eVar.getClass();
        psmVar.getClass();
        uqmVar.getClass();
        vu60Var.getClass();
        v800Var.getClass();
        y8jVar.getClass();
        u290Var.getClass();
        this.Z = vu60Var;
        this.a0 = v4cVar;
        this.b0 = m800Var;
        this.c0 = v800Var;
        this.d0 = k5kVar;
        this.e0 = y8jVar;
        this.f0 = to6Var;
        char cA = this.a.a();
        m2g m2gVar = m2g.a;
        z900 z900Var = new z900(3, (StringUiText) null);
        StringUiText stringUiText = vch0.a;
        wwd0 wwd0VarA = xwd0.a(new b7y(cA, null, null, m2gVar, null, null, z900Var, stringUiText, stringUiText, new gtp(0), new wg8(0), dh30.b.a, uxs.DISABLE, new vc8(0), false));
        this.g0 = wwd0VarA;
        this.h0 = e1i.b(wwd0VarA);
        ku90<a7y> ku90Var = new ku90<>();
        this.i0 = ku90Var;
        this.j0 = ku90Var;
        a8y a8yVar = new a8y(wwd0VarA);
        this.k0 = a8yVar.b;
        this.l0 = a8yVar.c;
        this.m0 = a8yVar.d;
        this.n0 = a8yVar.e;
        this.o0 = a8yVar.f;
        this.p0 = a8yVar.g;
        this.q0 = a8yVar.h;
        this.r0 = a8yVar.i;
        this.s0 = a8yVar.j;
        this.t0 = a8yVar.k;
        this.u0 = a8yVar.l;
        this.v0 = a8yVar.m;
        this.w0 = a8yVar.n;
    }

    @Override // defpackage.n000
    public final qxd0<UiText> A1() {
        return this.o0;
    }

    @Override // defpackage.wrd
    public final void A2(fg30 fg30Var) {
        if (this.c0.l) {
            fg30Var.c = true;
        }
    }

    @Override // defpackage.n000
    public final qxd0<UiText> B1() {
        return this.n0;
    }

    @Override // defpackage.n000
    public final qxd0<UiText> C1() {
        return this.q0;
    }

    @Override // defpackage.n000
    public final qxd0<UiText> D1() {
        return this.r0;
    }

    @Override // defpackage.n000
    public final UiText F1() {
        Integer intOrNull = StringsKt.toIntOrNull(E1());
        if (intOrNull != null) {
            int iIntValue = intOrNull.intValue();
            this.b0.getClass();
            ResourceUiText resourceUiTextA = m800.a(iIntValue);
            if (resourceUiTextA != null) {
                return resourceUiTextA;
            }
        }
        return new ResourceUiText(R.string.int_provider_nuvei_pay);
    }

    @Override // defpackage.n000
    public final qxd0<wg8> G1() {
        return this.v0;
    }

    @Override // defpackage.n000
    public final n000.a H1() {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        c100 c100VarA = sg8.a(((n6y) fnf.a(this.Z, jq40.a(n6y.class), o2gVar)).a);
        c100VarA.getClass();
        return new n000.a(c100VarA, h400.NUVEI, BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE);
    }

    @Override // defpackage.n000
    public final qxd0<List<String>> I1() {
        return this.l0;
    }

    @Override // defpackage.n000
    public final qxd0<gtp> J1() {
        return this.t0;
    }

    @Override // defpackage.n000
    public final qxd0<Integer> K1() {
        return this.m0;
    }

    @Override // defpackage.n000
    public final Integer L1() {
        int i;
        c100 c100VarN1 = N1();
        this.f0.getClass();
        c100VarN1.getClass();
        switch (c100VarN1.ordinal()) {
            case 40:
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                i = R.drawable.spei_logo;
                break;
            case 41:
                i = R.drawable.nuvei_oxxo_logo;
                break;
            default:
                i = R.drawable.nuvei_credit_card_logo;
                break;
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.n000
    public final qxd0<UiText> S1() {
        return this.k0;
    }

    @Override // defpackage.evw, defpackage.wrd, defpackage.n000
    public final void U1() {
        wwd0 wwd0Var;
        Object value;
        String str;
        super.U1();
        do {
            wwd0Var = this.g0;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, b7y.a((b7y) value, null, null, null, null, new ResourceUiText(R.string.page_payment__min_vnum, kotlin.collections.a.c(this.a0.e(z600.a().c.a))), null, null, null, null, null, null, null, null, false, 32735)));
        String strE1 = E1();
        c100 c100Var = c100.e;
        if (Intrinsics.g(strE1, String.valueOf(31001))) {
            str = "credit card";
        } else {
            str = Intrinsics.g(strE1, String.valueOf(31006)) ? "cash" : "nuvei";
        }
        z8j.a(this.e0, new mnd(str));
    }

    @Override // defpackage.n000
    public final void W1() {
        c2(r700.a, z1().a.b, F1(), "");
    }

    @Override // defpackage.n000
    public final UiText b2(BankTradeData bankTradeData) {
        String str;
        String str2;
        if (bankTradeData == null || (str = bankTradeData.counterAuthority) == null) {
            str = "Nuvei";
        }
        BankTradeResponse bankTradeResponse = this.Q;
        if (bankTradeResponse == null || (str2 = bankTradeResponse.counterPart) == null) {
            str2 = bankTradeData != null ? bankTradeData.counterPart : null;
        }
        if (str2 != null) {
            String str3 = StringsKt.U(str2) ? null : str2;
            if (str3 != null) {
                return new ResourceUiText(R.string.int_nuvei_success_title, b.k(str, str3));
            }
        }
        StringUiText stringUiText = vch0.a;
        return new StringUiText(str);
    }

    @Override // defpackage.n000
    public final void g2() {
        super.g2();
        if (this.x0) {
            this.x0 = false;
        } else {
            ej5.c(o8i0.d(this), null, null, new a(null), 3);
        }
    }

    @Override // defpackage.wrd
    public final qxd0<vc8> i2() {
        return this.w0;
    }

    @Override // defpackage.wrd
    public final qxd0<uxs> k2() {
        return this.s0;
    }

    @Override // defpackage.wrd
    public final qxd0<dh30> n2() {
        return this.u0;
    }

    @Override // defpackage.wrd
    public final void o2(x7e.b.d dVar) {
        this.Q = dVar.d;
        this.x0 = true;
        ej5.c(o8i0.d(this), null, null, new b8y(this, new a7y.a(dVar.c), null), 3);
    }

    @Override // defpackage.wrd
    public final void q2(BankTradeData bankTradeData) {
        bankTradeData.getClass();
        KycLimitData kycLimitData = O1().l;
        if ((kycLimitData != null ? kycLimitData.getCurrentLevel() : 0) < O1().j) {
            p2(bankTradeData);
        } else {
            super.q2(bankTradeData);
        }
    }

    @Override // defpackage.wrd
    public final boolean x2(x7e x7eVar) {
        wwd0 wwd0Var;
        Object value;
        x7eVar.getClass();
        if (x7eVar instanceof x7e.d.o) {
            qxd0<vc8> qxd0Var = this.w0;
            qxd0Var.getClass();
            vc8 vc8VarInvoke = qxd0Var.a.invoke();
            vc8VarInvoke.getClass();
            qxd0Var.a(vc8.a(vc8VarInvoke, null, true, null, false, 13));
            return true;
        }
        if (!(x7eVar instanceof x7e.d.e)) {
            return false;
        }
        do {
            wwd0Var = this.g0;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, b7y.a((b7y) value, null, null, null, null, null, null, null, null, null, null, null, null, null, true, 16383)));
        return true;
    }

    @Override // defpackage.n000
    public final qxd0<z900> y1() {
        return this.p0;
    }
}
