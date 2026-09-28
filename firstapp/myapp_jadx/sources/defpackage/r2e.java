package defpackage;

import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.patron.UserPhone;
import com.sporty.android.core.model.pocket.common.ChannelAsset;
import com.sporty.android.core.model.pocket.common.UserAdditionalPhoneConfig;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;
import com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lr2e;", "Lm02;", "", "Lmlu;", "Lauo;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class r2e extends m02 implements mlu, auo {
    public final auo A0;
    public final a300.f B0;
    public final v340 C0;
    public final wwd0 D0;
    public final wwd0 E0;
    public final wwd0 F0;
    public final wwd0 G0;
    public final wwd0 H0;
    public final ku90<String> I0;
    public final ku90 J0;
    public final lyh<lk50<UserAdditionalPhoneConfig>> K0;
    public final wwd0 L0;
    public boolean M0;
    public final v340 N0;
    public final lyh<Boolean> O0;
    public final lyh<Boolean> P0;
    public final n1i Q0;
    public final v340 R0;
    public final v340 S0;
    public final wwd0 T0;
    public final wwd0 U0;
    public jvd0 V0;
    public final p2e W0;
    public final wwd0 X0;
    public final wwd0 Y0;
    public final v340 Z0;
    public final v340 a1;
    public final k1i b1;
    public final ku90<x7e> c1;
    public final ngs d1;
    public final r1e e1;
    public final f9e l0;
    public final rak m0;
    public final c4k n0;
    public final lyd o0;
    public final pgk p0;
    public final v2k q0;
    public final sr10 r0;
    public final lyz s0;
    public final psm t0;
    public final b700 u0;
    public final q900 v0;
    public final i390 w0;
    public final rdd0 x0;
    public final bod y0;
    public final mlu z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v15, types: [r1e] */
    public r2e(f9e f9eVar, uyx uyxVar, eth0 eth0Var, rak rakVar, c4k c4kVar, lyd lydVar, pgk pgkVar, v2k v2kVar, d100 d100Var, wl wlVar, uy0 uy0Var, sr10 sr10Var, lyz lyzVar, psm psmVar, b700 b700Var, mgb0 mgb0Var, uqm uqmVar, q900 q900Var, i390 i390Var, u290 u290Var, rdd0 rdd0Var, bod bodVar, mlu mluVar, auo auoVar, cbg cbgVar, vu60 vu60Var) throws Exception {
        v1b v1bVar;
        lyh<Boolean> lyhVarA;
        super(uyxVar, eth0Var, rdd0Var, uy0Var, d100Var, lyzVar, wlVar, psmVar, mgb0Var, uqmVar, u290Var, cbgVar, vu60Var);
        d100Var.getClass();
        wlVar.getClass();
        uy0Var.getClass();
        sr10Var.getClass();
        lyzVar.getClass();
        psmVar.getClass();
        b700Var.getClass();
        mgb0Var.getClass();
        uqmVar.getClass();
        i390Var.getClass();
        u290Var.getClass();
        rdd0Var.getClass();
        bodVar.getClass();
        mluVar.getClass();
        auoVar.getClass();
        cbgVar.getClass();
        vu60Var.getClass();
        this.l0 = f9eVar;
        this.m0 = rakVar;
        this.n0 = c4kVar;
        this.o0 = lydVar;
        this.p0 = pgkVar;
        this.q0 = v2kVar;
        this.r0 = sr10Var;
        this.s0 = lyzVar;
        this.t0 = psmVar;
        this.u0 = b700Var;
        this.v0 = q900Var;
        this.w0 = i390Var;
        this.x0 = rdd0Var;
        this.y0 = bodVar;
        this.z0 = mluVar;
        this.A0 = auoVar;
        CountryCodeName countryCode = psmVar.getCountryCode();
        a300.f fVar = new a300.f(countryCode);
        this.B0 = fVar;
        pu0.b bVar = pu0.b.a;
        wl50 wl50Var = new wl50(sr10Var.R(bVar), new q1e());
        et7 et7VarD = o8i0.d(this);
        lk50.b bVar2 = lk50.b.a;
        kwd0 kwd0Var = q490.a.a;
        v340 v340VarE = e1i.e(wl50Var, et7VarD, kwd0Var, bVar2);
        this.C0 = v340VarE;
        wwd0 wwd0VarA = xwd0.a(null);
        this.D0 = wwd0VarA;
        this.E0 = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(null);
        this.F0 = wwd0VarA2;
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0VarA3 = xwd0.a(bool);
        this.G0 = wwd0VarA3;
        this.H0 = xwd0.a(null);
        ku90<String> ku90Var = new ku90<>();
        this.I0 = ku90Var;
        this.J0 = ku90Var;
        wl50 wl50VarK = d100Var.k();
        this.K0 = wl50VarK;
        wwd0 wwd0VarA4 = xwd0.a(null);
        this.L0 = wwd0VarA4;
        v340 v340VarE2 = e1i.e(new g1i(lyzVar.y(bVar), new q2e(null, this)), o8i0.d(this), kwd0Var, bVar2);
        this.N0 = v340VarE2;
        int i = a300.f.a.a[countryCode.ordinal()];
        if (i == 1) {
            v1bVar = null;
            lyhVarA = r1i.a(wl50VarK, v340VarE2, this.Y, new h2e(4, null));
        } else {
            if (i != 2 && i != 3 && i != 4) {
                throw new Exception(l4j0.a("`isPhoneSwitchable` undefine for ", countryCode, " in PayMethodWithdraw.Momo"));
            }
            lyhVarA = xwd0.a(bool);
            v1bVar = null;
        }
        this.O0 = lyhVarA;
        lyh<Boolean> lyhVarNeedShow = b700Var.needShow("PREF_KEY_NEW_FEATURE_MULTI_PHONES");
        this.P0 = lyhVarNeedShow;
        this.Q0 = new n1i(lyhVarA, lyhVarNeedShow, new n2e(3, v1bVar));
        v340 v340VarE3 = e1i.e(uzh.b(r1i.a(lyhVarA, wwd0VarA4, new sl50(v340VarE2), new l2e(4, v1bVar))), o8i0.d(this), kwd0Var, v1bVar);
        this.R0 = v340VarE3;
        this.S0 = e1i.e(uzh.b(new o2e(wwd0VarA2, this)), o8i0.d(this), kwd0Var, bool);
        wwd0 wwd0VarA5 = xwd0.a(rr00.b.a);
        this.T0 = wwd0VarA5;
        this.U0 = wwd0VarA5;
        this.W0 = new p2e(v340VarE3, this);
        wwd0 wwd0VarA6 = zjj0.a(null, false);
        this.X0 = wwd0VarA6;
        this.Y0 = wwd0VarA6;
        this.Z0 = e1i.e(new g1i(r1i.a(H1(), wwd0VarA, wwd0VarA5, new y1e(4, null)), new z1e(null, this)), o8i0.d(this), kwd0Var, bool);
        v340 v340VarE4 = e1i.e(new g1i(uzh.b(r0i.d(new n1i(new f1i(wwd0VarA), mluVar.r0(), new v1e(3, null)), new w1e(null, this))), new x1e(null, this)), o8i0.d(this), kwd0Var, DepositDropAlertStatus.Unavailable.a);
        this.a1 = v340VarE4;
        this.b1 = r1i.a(this.O, v340VarE4, wwd0VarA5, new i2e(4, null));
        ku90<x7e> ku90Var2 = new ku90<>();
        this.c1 = ku90Var2;
        ngs ngsVarB = a.b();
        ngsVarB.add(v340VarE);
        ngsVarB.add(this.P);
        ngsVarB.add(d100Var.a(bVar));
        ngsVarB.add(lyzVar.y(bVar));
        x300 x300VarN = fVar.n();
        x300 x300Var = x300.a;
        if (x300VarN == x300Var) {
            ngsVarB.add(sr10Var.W(bVar));
        }
        this.d1 = a.a(ngsVarB);
        ngs ngsVarB2 = a.b();
        ngsVarB2.add(new f1i(v340VarE3));
        if (fVar.n() == x300Var) {
            ngsVarB2.add(sr10Var.W(bVar));
        }
        kzh.d(new e2e((lyh[]) CollectionsKt.A0(a.a(ngsVarB2)).toArray(new lyh[0]), this), o8i0.d(this));
        kzh.d(new g1i(wwd0VarA3, new f2e(null, this)), o8i0.d(this));
        kzh.d(new g1i(ku90Var2, new d2e(null, this)), o8i0.d(this));
        mluVar.C0(this.f, this.h0, o8i0.d(this));
        auoVar.n(this.f, this.h0, v340VarE4, v340VarE3, wwd0VarA, this.v, o8i0.d(this));
        bodVar.a(this.f, this.h0, this.v);
        this.e1 = new iaj() { // from class: r1e
            @Override // defpackage.iaj
            public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                String channelShowName;
                String phone;
                String str = (String) obj;
                m8h0 m8h0Var = (m8h0) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                m8h0Var.getClass();
                r2e r2eVar = this.a;
                ku90<spg0> ku90Var3 = r2eVar.v;
                log0 log0Var = log0.a;
                String strF = r2eVar.t0.f();
                BigDecimal bigDecimal = r2eVar.S.c;
                BigDecimal bigDecimal2 = BigDecimal.ZERO;
                bigDecimal2.getClass();
                wwd0 wwd0Var = r2eVar.E0;
                ChannelAsset.Channel channel = (ChannelAsset.Channel) wwd0Var.getValue();
                if (channel == null || (channelShowName = channel.getChannelShowName()) == null) {
                    channelShowName = "--";
                }
                ChannelAsset.Channel channel2 = (ChannelAsset.Channel) wwd0Var.getValue();
                String channelIconUrl = channel2 != null ? channel2.getChannelIconUrl() : null;
                UserPhone userPhone = (UserPhone) r2eVar.R0.a.getValue();
                if (userPhone == null || (phone = userPhone.getPhone()) == null) {
                    phone = "--";
                }
                vpg0.c(ku90Var3, new TxSuccessParams.Momo(log0Var, m8h0Var, str, strF, bigDecimal, bigDecimal2, zBooleanValue, channelShowName, channelIconUrl, null, phone));
                b.b(r2eVar.f);
                return Unit.a;
            }
        };
    }

    @Override // defpackage.k72
    public List<lyh<lk50<Object>>> A1() {
        return this.d1;
    }

    @Override // defpackage.m02, defpackage.k72
    public final y200 B1() {
        return this.B0;
    }

    @Override // defpackage.mlu
    public final void C0(vtw vtwVar, vtw vtwVar2, et7 et7Var) {
        vtwVar.getClass();
        vtwVar2.getClass();
        this.z0.C0(vtwVar, vtwVar2, et7Var);
    }

    @Override // defpackage.auo
    public final Object E0(xi7 xi7Var, ChannelAsset.Channel channel, v1b<? super ds> v1bVar) {
        return this.A0.E0(xi7Var, channel, v1bVar);
    }

    @Override // defpackage.k72
    public List<c9p> E1() throws Exception {
        ngs ngsVarB = a.b();
        ngsVarB.add(ej5.c(o8i0.d(this), null, null, new g2e(null, this), 3));
        et7 et7VarD = o8i0.d(this);
        log0 log0Var = this.e0;
        log0Var.getClass();
        i390 i390Var = this.w0;
        ngsVarB.add(i390Var.c(et7VarD, log0Var));
        a300.f fVar = this.B0;
        if (fVar.n() == x300.a) {
            ngsVarB.add(i390Var.b(o8i0.d(this), log0Var));
        }
        CountryCodeName countryCodeName = fVar.a;
        int i = a300.f.a.a[countryCodeName.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                ngsVarB.add(i390Var.a(o8i0.d(this)));
            } else if (i != 4) {
                throw new Exception(l4j0.a("`isDefaultChannelNeeded` undefine for ", countryCodeName, " in PayMethodDeposit.Momo"));
            }
        }
        return a.a(ngsVarB);
    }

    @Override // defpackage.m02
    /* JADX INFO: renamed from: J1 */
    public final a300 B1() {
        return this.B0;
    }

    @Override // defpackage.mlu
    public final Object M(DepositDropAlertStatus depositDropAlertStatus, v1b<? super ds> v1bVar) {
        return this.z0.M(depositDropAlertStatus, v1bVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (r12 == r0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N1(defpackage.x1b r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.t1e
            if (r0 == 0) goto L14
            r0 = r12
            t1e r0 = (defpackage.t1e) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            t1e r0 = new t1e
            r0.<init>(r11, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r9.a
            y5b r0 = defpackage.y5b.a
            int r1 = r9.c
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L38
            if (r1 == r3) goto L34
            if (r1 != r4) goto L2e
            defpackage.uj50.b(r12)
            goto Lab
        L2e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            return r2
        L34:
            defpackage.uj50.b(r12)
            goto L59
        L38:
            defpackage.uj50.b(r12)
            wwd0 r12 = r11.F0
            java.lang.Object r12 = r12.getValue()
            com.sporty.android.core.model.pocket.common.ChannelAsset$Channel r12 = (com.sporty.android.core.model.pocket.common.ChannelAsset.Channel) r12
            if (r12 == 0) goto Lba
            java.lang.String r12 = r12.getChannelSendName()
            if (r12 != 0) goto L4c
            goto Lba
        L4c:
            r9.c = r3
            c4k r1 = r11.n0
            log0 r3 = r11.e0
            java.lang.Object r12 = r1.d(r3, r12, r9)
            if (r12 != r0) goto L59
            goto Laa
        L59:
            com.sporty.android.core.model.pocket.common.ChannelAsset$Channel r12 = (com.sporty.android.core.model.pocket.common.ChannelAsset.Channel) r12
            if (r12 == 0) goto Lb7
            java.lang.String r12 = r12.getChannelShowName()
            if (r12 != 0) goto L64
            goto Lb7
        L64:
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            com.sporty.android.common_ui.uitext.StringUiText r1 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r3 = new com.sporty.android.common_ui.uitext.ResourceUiText
            java.util.List r12 = defpackage.ay0.S(r12)
            r1 = 2132022926(0x7f14168e, float:1.9684285E38)
            r3.<init>(r1, r12)
            com.sporty.android.common_ui.uitext.ResourceUiText r5 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r12 = 2132018532(0x7f140564, float:1.9675373E38)
            r5.<init>(r12)
            com.sporty.android.common_ui.uitext.ResourceUiText r12 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r1 = 2132018506(0x7f14054a, float:1.967532E38)
            r12.<init>(r1)
            java.lang.Integer r1 = new java.lang.Integer
            r6 = 2131101717(0x7f060815, float:1.7815852E38)
            r1.<init>(r6)
            com.sporty.android.common_ui.uitext.ColoredUiText r6 = new com.sporty.android.common_ui.uitext.ColoredUiText
            r6.<init>(r12, r1, r2)
            java.lang.Integer r7 = new java.lang.Integer
            r12 = 2132084280(0x7f150638, float:1.9808726E38)
            r7.<init>(r12)
            r9.c = r4
            ku90<com.sporty.android.common.uievent.a> r1 = r11.f
            r2 = 0
            r4 = 0
            r8 = 0
            r10 = 165(0xa5, float:2.31E-43)
            java.lang.Object r12 = com.sporty.android.common.uievent.b.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto Lab
        Laa:
            return r0
        Lab:
            com.sporty.android.common.uievent.AlertDialogCallbackType r12 = (com.sporty.android.common.uievent.AlertDialogCallbackType) r12
            r12.getClass()
            boolean r11 = r12 instanceof com.sporty.android.common.uievent.AlertDialogCallbackType.Negative
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        Lb7:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            return r11
        Lba:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r2e.N1(x1b):java.lang.Object");
    }

    public final Object O1(tje0 tje0Var) {
        ChannelAsset.Channel channel = (ChannelAsset.Channel) this.E0.getValue();
        ku90<spg0> ku90Var = this.v;
        if (channel == null) {
            int i = vpg0.a;
            ku90Var.getClass();
            ku90Var.a(spg0.e.a);
            return Unit.a;
        }
        UiText uiTextA = this.p0.a(channel);
        if (uiTextA != null) {
            return gi8.a(this.f, uiTextA, ku90Var, tje0Var);
        }
        int i2 = vpg0.a;
        ku90Var.getClass();
        ku90Var.a(spg0.e.a);
        return Unit.a;
    }

    public final void P1() {
        Object value = this.N0.a.getValue();
        lk50.c cVar = value instanceof lk50.c ? (lk50.c) value : null;
        List<UserPhone> list = cVar != null ? (List) cVar.a : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            for (UserPhone userPhone : list) {
                UserPhone userPhone2 = (UserPhone) this.R0.a.getValue();
                String phone = userPhone2 != null ? userPhone2.getPhone() : null;
                userPhone.getClass();
                arrayList.add(new aoe0.g(userPhone.getPhone(), userPhone.getPhone(), Intrinsics.g(userPhone.getPhone(), phone), false, userPhone.isDefault(), userPhone.isPrimary()));
            }
            wne0 wne0Var = new wne0(10, arrayList);
            wwd0 wwd0Var = this.U;
            wwd0Var.getClass();
            wwd0Var.k(null, wne0Var);
        }
    }

    @Override // defpackage.auo
    public final uwd0<xi7> U() {
        return this.A0.U();
    }

    @Override // defpackage.mlu
    public final Object f0(DepositDropAlertStatus depositDropAlertStatus, boolean z, x000 x000Var, v1b<? super z000> v1bVar) {
        return this.z0.f0(depositDropAlertStatus, z, x000Var, v1bVar);
    }

    @Override // defpackage.auo
    public final void g0() {
        this.A0.g0();
    }

    @Override // defpackage.auo
    public final void n(vtw vtwVar, vtw vtwVar2, v340 v340Var, v340 v340Var2, wwd0 wwd0Var, vtw vtwVar3, et7 et7Var) {
        vtwVar.getClass();
        vtwVar2.getClass();
        vtwVar3.getClass();
        this.A0.n(vtwVar, vtwVar2, v340Var, v340Var2, wwd0Var, vtwVar3, et7Var);
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
