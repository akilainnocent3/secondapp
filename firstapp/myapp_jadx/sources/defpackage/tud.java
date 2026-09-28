package defpackage;

import android.accounts.Account;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.pocket.common.AssetData;
import com.sporty.android.core.model.pocket.deposit.CardStatusData;
import com.sporty.android.core.model.security.sportypin.SportyPinStatus;
import com.sporty.android.core.model.security.sportypin.WithdrawalPinStatusInfo;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;
import com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Ltud;", "Lm02;", "Lmlu;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tud extends m02 implements mlu {
    public final a300.b A0;
    public final ResourceUiText B0;
    public final v340 C0;
    public final n1i D0;
    public final nud E0;
    public final v340 F0;
    public final wwd0 G0;
    public final wwd0 H0;
    public final v340 I0;
    public final v340 J0;
    public final wwd0 K0;
    public final wwd0 L0;
    public final wwd0 M0;
    public final wwd0 N0;
    public final wwd0 O0;
    public zyx P0;
    public final g1i Q0;
    public final wwd0 R0;
    public final wwd0 S0;
    public final wwd0 T0;
    public yyx U0;
    public final g1i V0;
    public final wwd0 W0;
    public final wwd0 X0;
    public final wwd0 Y0;
    public final wwd0 Z0;
    public final wwd0 a1;
    public final wwd0 b1;
    public final g1i c1;
    public final g1i d1;
    public final lyh<List<String>> e1;
    public final v340 f1;
    public final ku90<eg6> g1;
    public final ku90 h1;
    public final lyh<Boolean> i1;
    public final n1i j1;
    public final List<lyh<lk50<Object>>> k1;
    public final f9e l0;
    public final ku90<cg6> l1;
    public final wyx m0;
    public final ku90 m1;
    public final vyx n0;
    public final ku90<Unit> n1;
    public final lyd o0;
    public final ku90 o1;
    public final zi7 p0;
    public final ku90<Unit> p1;
    public final pi80 q0;
    public final v340 q1;
    public final d100 r0;
    public final ku90<x7e> r1;
    public final sr10 s0;
    public boolean s1;
    public final lyz t0;
    public final dtd t1;
    public final psm u0;
    public final uqm v0;
    public final b700 w0;
    public final q900 x0;
    public final rdd0 y0;
    public final mlu z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v22, types: [dtd] */
    public tud(f9e f9eVar, wyx wyxVar, vyx vyxVar, uyx uyxVar, eth0 eth0Var, ffk ffkVar, lyd lydVar, zi7 zi7Var, pi80 pi80Var, uy0 uy0Var, d100 d100Var, wl wlVar, sr10 sr10Var, lyz lyzVar, psm psmVar, mgb0 mgb0Var, uqm uqmVar, b700 b700Var, q900 q900Var, u290 u290Var, rdd0 rdd0Var, mlu mluVar, cbg cbgVar, vu60 vu60Var) {
        ResourceUiText resourceUiText;
        super(uyxVar, eth0Var, rdd0Var, uy0Var, d100Var, lyzVar, wlVar, psmVar, mgb0Var, uqmVar, u290Var, cbgVar, vu60Var);
        uy0Var.getClass();
        d100Var.getClass();
        wlVar.getClass();
        sr10Var.getClass();
        lyzVar.getClass();
        psmVar.getClass();
        mgb0Var.getClass();
        uqmVar.getClass();
        b700Var.getClass();
        u290Var.getClass();
        rdd0Var.getClass();
        mluVar.getClass();
        cbgVar.getClass();
        vu60Var.getClass();
        this.l0 = f9eVar;
        this.m0 = wyxVar;
        this.n0 = vyxVar;
        this.o0 = lydVar;
        this.p0 = zi7Var;
        this.q0 = pi80Var;
        this.r0 = d100Var;
        this.s0 = sr10Var;
        this.t0 = lyzVar;
        this.u0 = psmVar;
        this.v0 = uqmVar;
        this.w0 = b700Var;
        this.x0 = q900Var;
        this.y0 = rdd0Var;
        this.z0 = mluVar;
        CountryCodeName countryCode = psmVar.getCountryCode();
        this.A0 = new a300.b(countryCode);
        int i = a300.b.a.a[countryCode.ordinal()];
        if (i == 1) {
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(R.string.page_payment__card_hint__GH);
        } else if (i != 2) {
            StringUiText stringUiText2 = vch0.a;
            resourceUiText = new ResourceUiText(R.string.page_payment__card_hint__NG);
        } else {
            StringUiText stringUiText3 = vch0.a;
            resourceUiText = new ResourceUiText(R.string.page_payment__card_hint__NG);
        }
        this.B0 = resourceUiText;
        mluVar.C0(this.f, this.h0, o8i0.d(this));
        g1i g1iVar = new g1i(uzh.b(r0i.d(new n1i(new lud(this.D), mluVar.r0(), new ktd(3, null)), new ltd(this, null))), new mtd(this, null));
        et7 et7VarD = o8i0.d(this);
        DepositDropAlertStatus.Unavailable unavailable = DepositDropAlertStatus.Unavailable.a;
        kwd0 kwd0Var = q490.a.a;
        v340 v340VarE = e1i.e(g1iVar, et7VarD, kwd0Var, unavailable);
        this.C0 = v340VarE;
        this.D0 = new n1i(this.O, v340VarE, new ytd(3, null));
        this.E0 = new nud(this.Y);
        pu0.b bVar = pu0.b.a;
        v340 v340VarE2 = e1i.e(new oud(bm50.f(sr10Var.G(bVar))), o8i0.d(this), kwd0Var, m2g.a);
        this.F0 = v340VarE2;
        wwd0 wwd0VarA = xwd0.a(null);
        this.G0 = wwd0VarA;
        this.H0 = wwd0VarA;
        v340 v340VarE3 = e1i.e(new pud(wwd0VarA, this), o8i0.d(this), kwd0Var, null);
        this.I0 = v340VarE3;
        w100 w100VarD = d100Var.d();
        et7 et7VarD2 = o8i0.d(this);
        Boolean bool = Boolean.FALSE;
        this.J0 = e1i.e(w100VarD, et7VarD2, kwd0Var, bool);
        wwd0 wwd0VarA2 = zjj0.a(null, false);
        this.K0 = wwd0VarA2;
        this.L0 = wwd0VarA2;
        wwd0 wwd0VarA3 = zjj0.a(null, false);
        this.M0 = wwd0VarA3;
        this.N0 = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a("");
        this.O0 = wwd0VarA4;
        this.P0 = zyx.d;
        g1i g1iVar2 = new g1i(new qud(wwd0VarA4, this), new xtd(this, null));
        this.Q0 = g1iVar2;
        wwd0 wwd0VarA5 = xwd0.a(bool);
        this.R0 = wwd0VarA5;
        this.S0 = wwd0VarA5;
        wwd0 wwd0VarA6 = xwd0.a("");
        this.T0 = wwd0VarA6;
        this.U0 = yyx.d;
        g1i g1iVar3 = new g1i(new rud(wwd0VarA6, this), new wtd(this, null));
        this.V0 = g1iVar3;
        wwd0 wwd0VarA7 = xwd0.a(bool);
        this.W0 = wwd0VarA7;
        this.X0 = wwd0VarA7;
        wwd0 wwd0VarA8 = xwd0.a(null);
        this.Y0 = wwd0VarA8;
        this.Z0 = wwd0VarA8;
        wwd0 wwd0VarA9 = xwd0.a(Boolean.TRUE);
        this.a1 = wwd0VarA9;
        wwd0 wwd0VarA10 = xwd0.a(bool);
        this.b1 = wwd0VarA10;
        this.c1 = new g1i(wwd0VarA9, new gud(this, null));
        this.d1 = new g1i(wwd0VarA10, new iud(this, null));
        this.e1 = uzh.b(bm50.f(bm50.m(wo5.b(ffkVar.a, "card_deposit_card_imgs", null, 4), new efk(0))));
        v340 v340VarE4 = e1i.e(new g1i(new kud(new lyh[]{g1iVar2, wwd0VarA5, g1iVar3, wwd0VarA7, wwd0VarA8, H1(), this.Y}), new vtd(this, null)), o8i0.d(this), kwd0Var, bool);
        this.f1 = e1i.e(new g1i(r1i.a(v340VarE2, v340VarE4, r1i.c(wwd0VarA, v340VarE3, wwd0VarA8, H1(), this.Y, new hud(null)), new ntd(4, null)), new otd(this, null)), o8i0.d(this), kwd0Var, bool);
        ku90<eg6> ku90Var = new ku90<>();
        this.g1 = ku90Var;
        this.h1 = ku90Var;
        lyh<Boolean> lyhVarNeedShow = b700Var.needShow("PREF_KEY_NEW_FEATURE_SET_CARD_AS_DEFAULT");
        this.i1 = lyhVarNeedShow;
        this.j1 = new n1i(v340VarE2, lyhVarNeedShow, new jud(3, null));
        this.k1 = b.k(sr10Var.G(bVar), lyzVar.j0(bVar), this.P, d100Var.a(bVar));
        ku90<cg6> ku90Var2 = new ku90<>();
        this.l1 = ku90Var2;
        this.m1 = ku90Var2;
        ku90<Unit> ku90Var3 = new ku90<>();
        this.n1 = ku90Var3;
        this.o1 = ku90Var3;
        ku90<Unit> ku90Var4 = new ku90<>();
        this.p1 = ku90Var4;
        this.q1 = e1i.e(r0i.d(r1i.b(new mud(v340VarE), wwd0VarA, v340VarE4, new xzh(ku90Var4, new std(2, null)), new ttd(5, null)), new utd(this, null)), o8i0.d(this), kwd0Var, xi7.b.a);
        ku90<x7e> ku90Var5 = new ku90<>();
        this.r1 = ku90Var5;
        kzh.d(new g1i(ku90Var5, new qtd(this, null)), o8i0.d(this));
        this.t1 = new iaj() { // from class: dtd
            @Override // defpackage.iaj
            public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                String cardNumber;
                String str = (String) obj;
                m8h0 m8h0Var = (m8h0) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                String str2 = (String) obj4;
                m8h0Var.getClass();
                tud tudVar = this.a;
                ku90<spg0> ku90Var6 = tudVar.v;
                log0 log0Var = log0.a;
                String strF = tudVar.u0.f();
                BigDecimal bigDecimal = tudVar.S.c;
                BigDecimal bigDecimal2 = BigDecimal.ZERO;
                bigDecimal2.getClass();
                if (tudVar.s1) {
                    String str3 = tudVar.P0.c;
                    if (str3 == null || (cardNumber = fu5.a("\\d(?=\\d{4})", str3, "*")) == null) {
                        cardNumber = "--";
                    }
                } else {
                    AssetData.CardsBean cardsBean = (AssetData.CardsBean) tudVar.H0.getValue();
                    cardNumber = cardsBean != null ? cardsBean.getCardNumber() : null;
                }
                vpg0.c(ku90Var6, new TxSuccessParams.Card(log0Var, m8h0Var, str, strF, bigDecimal, bigDecimal2, zBooleanValue, str2, cardNumber));
                com.sporty.android.common.uievent.b.b(tudVar.f);
                return Unit.a;
            }
        };
    }

    @Override // defpackage.k72
    public final List<lyh<lk50<Object>>> A1() {
        return this.k1;
    }

    @Override // defpackage.m02, defpackage.k72
    public final y200 B1() {
        return this.A0;
    }

    @Override // defpackage.mlu
    public final void C0(vtw vtwVar, vtw vtwVar2, et7 et7Var) {
        vtwVar.getClass();
        vtwVar2.getClass();
        this.z0.C0(vtwVar, vtwVar2, et7Var);
    }

    @Override // defpackage.k72
    public final List<c9p> E1() {
        return a.c(V1());
    }

    @Override // defpackage.m02
    /* JADX INFO: renamed from: J1 */
    public final a300 B1() {
        return this.A0;
    }

    @Override // defpackage.mlu
    public final Object M(DepositDropAlertStatus depositDropAlertStatus, v1b<? super ds> v1bVar) {
        return this.z0.M(depositDropAlertStatus, v1bVar);
    }

    public final void N1(String str) {
        str.getClass();
        wwd0 wwd0Var = this.T0;
        wwd0Var.getClass();
        wwd0Var.k(null, str);
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0Var2 = this.W0;
        wwd0Var2.getClass();
        wwd0Var2.k(null, bool);
    }

    public final void O1(boolean z) {
        osa0.a(!z && this.U0.b(), this.W0, null);
    }

    public final void P1(String str) {
        str.getClass();
        wwd0 wwd0Var = this.O0;
        wwd0Var.getClass();
        wwd0Var.k(null, str);
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0Var2 = this.R0;
        wwd0Var2.getClass();
        wwd0Var2.k(null, bool);
    }

    public final void Q1(boolean z) {
        osa0.a((z || this.P0.a() || this.P0.c.length() == 0) ? false : true, this.R0, null);
    }

    public final void R1(String str) {
        this.Y0.setValue(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        if (r7 == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S1(defpackage.x1b r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tud.S1(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object T1(x1b x1bVar) throws Throwable {
        ftd ftdVar;
        if (x1bVar instanceof ftd) {
            ftdVar = (ftd) x1bVar;
            int i = ftdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ftdVar.c = i - Integer.MIN_VALUE;
            } else {
                ftdVar = new ftd(this, x1bVar);
            }
        } else {
            ftdVar = new ftd(this, x1bVar);
        }
        Object objO = ftdVar.a;
        y5b y5bVar = y5b.a;
        int i2 = ftdVar.c;
        if (i2 == 0) {
            uj50.b(objO);
            if (!((ncx) this.Y.a.getValue()).a() || this.u0.n()) {
                return Boolean.TRUE;
            }
            ftdVar.c = 1;
            bc6 bc6Var = new bc6(1, yzo.b(ftdVar));
            bc6Var.q();
            this.y.a(new m480.f(bc6Var));
            objO = bc6Var.o();
            if (objO == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objO);
        }
        return Boolean.valueOf(Intrinsics.g((AlertDialogCallbackType) objO, AlertDialogCallbackType.Positive.a));
    }

    public final void U1() {
        StringUiText stringUiText = vch0.a;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.page_payment__the_cvv_is_the_three_digits_security_code_tip);
        Integer numValueOf = Integer.valueOf(R.drawable.cvv_help);
        ResourceUiText resourceUiText2 = new ResourceUiText(R.string.common_functions__ok);
        ku90<com.sporty.android.common.uievent.a> ku90Var = this.f;
        ku90Var.getClass();
        ku90Var.a(new com.sporty.android.common.uievent.a.l(null, resourceUiText, numValueOf, resourceUiText2, null, null));
    }

    public final jvd0 V1() {
        return ej5.c(o8i0.d(this), null, null, new rtd(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W1(AssetData.CardsBean cardsBean, x1b x1bVar) {
        ztd ztdVar;
        AssetData.CardsBean cardsBean2;
        Throwable th;
        AssetData.CardsBean cardsBean3;
        tud tudVar;
        Object bVar;
        Throwable thA;
        String cardNumber;
        String strA;
        String cardNumber2;
        String strReplace;
        if (x1bVar instanceof ztd) {
            ztdVar = (ztd) x1bVar;
            int i = ztdVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ztdVar.e = i - Integer.MIN_VALUE;
            } else {
                ztdVar = new ztd(this, x1bVar);
            }
        } else {
            ztdVar = new ztd(this, x1bVar);
        }
        Object objE = ztdVar.c;
        y5b y5bVar = y5b.a;
        int i2 = ztdVar.e;
        String str = "--";
        ku90<eg6> ku90Var = this.g1;
        if (i2 == 0) {
            uj50.b(objE);
            ku90Var.a(eg6.c.a);
            try {
                zi50.a aVar = zi50.b;
                sr10 sr10Var = this.s0;
                int id = cardsBean.getId();
                ztdVar.a = cardsBean;
                ztdVar.b = this;
                ztdVar.e = 1;
                objE = sr10Var.E(id, ztdVar);
                if (objE != y5bVar) {
                    cardsBean3 = cardsBean;
                    tudVar = this;
                }
                return y5bVar;
            } catch (Throwable th2) {
                cardsBean2 = cardsBean;
                th = th2;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tudVar = ztdVar.b;
                cardsBean2 = ztdVar.a;
                try {
                    uj50.b(objE);
                    ku90<com.sporty.android.common.uievent.a> ku90Var2 = tudVar.f;
                    cardNumber2 = cardsBean2.getCardNumber();
                    if (cardNumber2 != null || (strReplace = new Regex("\\d(?=\\d{4})").replace(cardNumber2, "*")) == null) {
                        strReplace = "--";
                    }
                    StringUiText stringUiText = vch0.a;
                    com.sporty.android.common.uievent.b.i(ku90Var2, new ResourceUiText(R.string.page_payment__successfully_deleted_the_card_vcard, ay0.S(new Object[]{strReplace})), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    bVar = Boolean.valueOf(tudVar.g1.a.a(eg6.a.a));
                    zi50.a aVar3 = zi50.b;
                } catch (Throwable th3) {
                    th = th3;
                    zi50.a aVar4 = zi50.b;
                    bVar = new zi50.b(th);
                }
                thA = zi50.a(bVar);
                if (thA != null) {
                    itf0.a.e(thA);
                    cardNumber = cardsBean2.getCardNumber();
                    if (cardNumber != null && (strA = fu5.a("\\d(?=\\d{4})", cardNumber, "*")) != null) {
                        str = strA;
                    }
                    StringUiText stringUiText2 = vch0.a;
                    com.sporty.android.common.uievent.b.i(this.f, new ResourceUiText(R.string.page_payment__failed_to_delete_the_card_vcard, ay0.S(new Object[]{str})), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    ku90Var.a(eg6.b.a);
                }
                return Unit.a;
            }
            tudVar = ztdVar.b;
            cardsBean3 = ztdVar.a;
            try {
                uj50.b(objE);
            } catch (Throwable th4) {
                th = th4;
                cardsBean2 = cardsBean3;
                zi50.a aVar5 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        n52.b((BaseResponse) objE);
        jvd0 jvd0VarV1 = tudVar.V1();
        ztdVar.a = cardsBean3;
        ztdVar.b = tudVar;
        ztdVar.e = 2;
        if (jvd0VarV1.join(ztdVar) != y5bVar) {
            cardsBean2 = cardsBean3;
            ku90<com.sporty.android.common.uievent.a> ku90Var3 = tudVar.f;
            cardNumber2 = cardsBean2.getCardNumber();
            if (cardNumber2 != null) {
                strReplace = "--";
            } else {
                strReplace = "--";
            }
            StringUiText stringUiText3 = vch0.a;
            com.sporty.android.common.uievent.b.i(ku90Var3, new ResourceUiText(R.string.page_payment__successfully_deleted_the_card_vcard, ay0.S(new Object[]{strReplace})), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            bVar = Boolean.valueOf(tudVar.g1.a.a(eg6.a.a));
            zi50.a aVar6 = zi50.b;
            thA = zi50.a(bVar);
            if (thA != null) {
                itf0.a.e(thA);
                cardNumber = cardsBean2.getCardNumber();
                if (cardNumber != null) {
                    str = strA;
                }
                StringUiText stringUiText4 = vch0.a;
                com.sporty.android.common.uievent.b.i(this.f, new ResourceUiText(R.string.page_payment__failed_to_delete_the_card_vcard, ay0.S(new Object[]{str})), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                ku90Var.a(eg6.b.a);
            }
            return Unit.a;
        }
        return y5bVar;
    }

    public final void X1() {
        String str;
        Account account = this.v0.getAccount();
        if (account == null || (str = account.name) == null) {
            ej5.c(o8i0.d(this), null, null, new bud(this, null), 3);
        } else {
            ej5.c(o8i0.d(this), null, null, new aud(this, str, null), 3);
        }
    }

    public final void Y1() {
        wwd0 wwd0Var = this.a1;
        if (!((Boolean) wwd0Var.getValue()).booleanValue()) {
            Boolean bool = Boolean.TRUE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
            return;
        }
        StringUiText stringUiText = vch0.a;
        com.sporty.android.common.uievent.b.e(this.f, new ResourceUiText(R.string.page_payment__dont_save_card), null, new ResourceUiText(R.string.page_payment__saving_card_info_reduces_failed_deposits_tip), new ResourceUiText(R.string.common_functions__save), new ResourceUiText(R.string.page_payment__dont_save), null, new Function1() { // from class: ctd
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj;
                alertDialogCallbackType.getClass();
                wwd0 wwd0Var2 = this.a.a1;
                Boolean boolValueOf = Boolean.valueOf(alertDialogCallbackType.equals(AlertDialogCallbackType.Positive.a));
                wwd0Var2.getClass();
                wwd0Var2.k(null, boolValueOf);
                return Unit.a;
            }
        }, 194);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object Z1(x1b x1bVar) throws Throwable {
        sud sudVar;
        CardStatusData cardStatusData;
        WithdrawalPinStatusInfo withdrawalPinStatusInfo;
        if (x1bVar instanceof sud) {
            sudVar = (sud) x1bVar;
            int i = sudVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sudVar.c = i - Integer.MIN_VALUE;
            } else {
                sudVar = new sud(this, x1bVar);
            }
        } else {
            sudVar = new sud(this, x1bVar);
        }
        Object objP = sudVar.a;
        y5b y5bVar = y5b.a;
        int i2 = sudVar.c;
        if (i2 == 0) {
            uj50.b(objP);
            a300.b bVar = this.A0;
            bVar.getClass();
            if (a.c(CountryCodeName.NIGERIA).contains(bVar.a) && (cardStatusData = (CardStatusData) this.I0.a.getValue()) != null && cardStatusData.getEnablePin()) {
                lyh<lk50<WithdrawalPinStatusInfo>> lyhVarI0 = this.t0.i0(new pu0.a(0));
                sudVar.c = 1;
                objP = bm50.p(lyhVarI0, sudVar);
                if (objP != y5bVar) {
                }
            }
            return v1i0.e.a;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(objP);
                return objP;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(objP);
        lk50 lk50Var = (lk50) objP;
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        if (cVar == null || (withdrawalPinStatusInfo = (WithdrawalPinStatusInfo) cVar.a) == null) {
            return v1i0.b.a;
        }
        if (b.k(SportyPinStatus.Enabled, SportyPinStatus.Blocked).contains(withdrawalPinStatusInfo.getSportyPinStatus())) {
            sudVar.c = 2;
            bc6 bc6Var = new bc6(1, yzo.b(sudVar));
            bc6Var.q();
            this.y.a(new m480.k(new s8d0.a(withdrawalPinStatusInfo), bc6Var));
            Object objO = bc6Var.o();
            return objO == y5bVar ? y5bVar : objO;
        }
        return v1i0.e.a;
    }

    @Override // defpackage.mlu
    public final Object f0(DepositDropAlertStatus depositDropAlertStatus, boolean z, x000 x000Var, v1b<? super z000> v1bVar) {
        return this.z0.f0(depositDropAlertStatus, z, x000Var, v1bVar);
    }

    @Override // defpackage.mlu
    public final void q1(Long l) {
        this.z0.q1(l);
    }

    @Override // defpackage.mlu
    public final uwd0<Boolean> r0() {
        return this.z0.r0();
    }
}
