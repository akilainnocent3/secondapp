package com.sportybet.android.instantwin.presentation.buildandgo;

import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.instantwin.BuildAndGoTabConfig;
import com.sportybet.android.instantwin.domain.GiftCurrentBalance;
import com.sportybet.android.instantwin.model.InstantWinGiftApplicabilityContext;
import com.sportybet.android.instantwin.newtork.model.request.BuildAndGoTicketCreate;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderInRound;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.Sports;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource;
import defpackage.ae5;
import defpackage.be5;
import defpackage.bm50;
import defpackage.c0d;
import defpackage.cf5;
import defpackage.d5o;
import defpackage.e1i;
import defpackage.e5o;
import defpackage.eg5;
import defpackage.ej5;
import defpackage.eko;
import defpackage.et7;
import defpackage.ex4;
import defpackage.fg5;
import defpackage.fqk;
import defpackage.g1i;
import defpackage.g5o;
import defpackage.h5o;
import defpackage.heo;
import defpackage.ib5;
import defpackage.j8i0;
import defpackage.je5;
import defpackage.jh10;
import defpackage.jqc;
import defpackage.k00;
import defpackage.ki5;
import defpackage.ku90;
import defpackage.kzh;
import defpackage.l48;
import defpackage.ld5;
import defpackage.li5;
import defpackage.lk50;
import defpackage.lni0;
import defpackage.m2l;
import defpackage.m780;
import defpackage.md5;
import defpackage.mgb0;
import defpackage.mi5;
import defpackage.mwd0;
import defpackage.ni5;
import defpackage.nzm;
import defpackage.o8i0;
import defpackage.oc5;
import defpackage.ogx;
import defpackage.oi5;
import defpackage.or60;
import defpackage.pc5;
import defpackage.pdd0;
import defpackage.pi5;
import defpackage.psm;
import defpackage.qc5;
import defpackage.qi5;
import defpackage.r0i;
import defpackage.r1i;
import defpackage.rd5;
import defpackage.rdd0;
import defpackage.ri5;
import defpackage.sd5;
import defpackage.si5;
import defpackage.td5;
import defpackage.ti5;
import defpackage.tje0;
import defpackage.ud5;
import defpackage.uhc;
import defpackage.ui5;
import defpackage.uj50;
import defpackage.uwd0;
import defpackage.uxb;
import defpackage.uy0;
import defpackage.uzh;
import defpackage.v1b;
import defpackage.v340;
import defpackage.v5b;
import defpackage.wd5;
import defpackage.wwd0;
import defpackage.xd5;
import defpackage.xwd0;
import defpackage.xxb;
import defpackage.y5b;
import defpackage.y8j;
import defpackage.yd5;
import defpackage.yy50;
import defpackage.yzh;
import defpackage.zd5;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/buildandgo/f;", "Lj8i0;", "", "Lje5;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class f extends j8i0 implements je5 {
    public final psm A;
    public final ku90<e> B;
    public final wwd0 C;
    public final wwd0 D;
    public final wwd0 E;
    public final wwd0 F;
    public final ti5 G;
    public final wwd0 H;
    public final v340 I;
    public final v340 J;
    public final uy0 a;
    public final eko b;
    public final m2l c;
    public final qc5 d;
    public final be5 e;
    public final je5 f;
    public final xxb i;
    public final mgb0 v;
    public final rdd0 w;
    public final y8j y;
    public final nzm z;

    @c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.BuildAndGoViewModel$endTooltipInternal$1", f = "BuildAndGoViewModel.kt", l = {487}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return f.this.new a(v1bVar);
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
                m2l m2lVar = f.this.c;
                Integer num = new Integer(2);
                this.a = 1;
                if (m2lVar.a.putInt("bng_tooltip_step", num, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.BuildAndGoViewModel$handleUiAction$4", f = "BuildAndGoViewModel.kt", l = {235}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return f.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                m2l m2lVar = f.this.c;
                Boolean bool = Boolean.TRUE;
                this.a = 1;
                if (m2lVar.a.putBoolean("bng_anon_red_dot_consumed", bool, this) == y5bVar) {
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

    public f(uy0 uy0Var, ex4 ex4Var, eko ekoVar, m2l m2lVar, qc5 qc5Var, be5 be5Var, je5 je5Var, xxb xxbVar, mgb0 mgb0Var, rdd0 rdd0Var, y8j y8jVar, nzm nzmVar, psm psmVar) {
        uy0Var.getClass();
        ex4Var.getClass();
        ekoVar.getClass();
        m2lVar.getClass();
        je5Var.getClass();
        mgb0Var.getClass();
        rdd0Var.getClass();
        y8jVar.getClass();
        nzmVar.getClass();
        psmVar.getClass();
        this.a = uy0Var;
        this.b = ekoVar;
        this.c = m2lVar;
        this.d = qc5Var;
        this.e = be5Var;
        this.f = je5Var;
        this.i = xxbVar;
        this.v = mgb0Var;
        this.w = rdd0Var;
        this.y = y8jVar;
        this.z = nzmVar;
        this.A = psmVar;
        this.B = new ku90<>();
        wwd0 wwd0VarA = xwd0.a("");
        this.C = wwd0VarA;
        this.D = xwd0.a(Boolean.FALSE);
        this.E = xwd0.a(new fg5(0));
        this.F = xwd0.a(0L);
        this.G = new ti5(ex4Var.p());
        String strF = psmVar.f();
        String strJ = nzmVar.j();
        strJ.getClass();
        wwd0 wwd0VarA2 = xwd0.a(new ni5(483, strF, strJ, mgb0Var.isLogin()));
        this.H = wwd0VarA2;
        this.I = e1i.e(r1i.a(wwd0VarA2, xxbVar.a, uzh.b(mgb0Var.isLoginFlow()), new ui5(this, null)), o8i0.d(this), new mwd0(5000L, Long.MAX_VALUE), wwd0VarA2.getValue());
        this.J = e1i.e(new or60(new oi5(this, null)), o8i0.d(this), new mwd0(0L, 0L), new md5(mgb0Var.isLogin(), ((ni5) wwd0VarA2.getValue()).i, ld5.c.a));
        je5Var.o0(o8i0.d(this));
        et7 et7VarD = o8i0.d(this);
        uwd0<lk50<Sports>> uwd0VarQ = je5Var.q();
        uwd0<lk50<Round>> uwd0VarW = je5Var.w();
        uwd0VarQ.getClass();
        uwd0VarW.getClass();
        kzh.d(new g1i(new ud5(r0i.f(new td5(r0i.f(be5Var.b, new rd5(null, uwd0VarQ, uwd0VarW))), new sd5(be5Var, null))), new wd5(be5Var, null)), et7VarD);
        kzh.d(new g1i(r1i.a(be5Var.c, be5Var.d, wwd0VarA, new xd5(4, be5Var, be5.class, "createBuildAndGoGiftState", "createBuildAndGoGiftState(Ljava/util/List;Lcom/sportybet/android/instantwin/model/SelectedGiftInfo;Ljava/lang/String;)Lcom/sportybet/android/instantwin/presentation/buildandgo/model/BuildAndGoGiftState;", 4)), new yd5(be5Var, null)), et7VarD);
        et7 et7VarD2 = o8i0.d(this);
        wwd0 wwd0Var = be5Var.c;
        wwd0 wwd0Var2 = be5Var.d;
        wwd0Var.getClass();
        wwd0Var2.getClass();
        kzh.d(new g1i(r1i.c(qc5Var.e, qc5Var.a.p(), wwd0Var, wwd0Var2, wwd0VarA, new oc5(6, qc5Var, qc5.class, "createConfirmDialogState", "createConfirmDialogState(Lcom/sportybet/android/instantwin/model/VisibilityState;Lcom/sporty/android/core/model/config/tax/TaxConfigs;Ljava/util/List;Lcom/sportybet/android/instantwin/model/SelectedGiftInfo;Ljava/lang/String;)Lcom/sportybet/android/instantwin/presentation/compose/dialog/confirm/ConfirmDialogState;", 4)), new pc5(qc5Var, null)), et7VarD2);
        xxbVar.d(o8i0.d(this));
        ej5.c(o8i0.d(this), null, null, new si5(this, null), 3);
        kzh.d(new g1i(wwd0Var2, new pi5(this, null)), o8i0.d(this));
    }

    public final boolean A1(boolean z) {
        wwd0 wwd0Var;
        Object value;
        eg5.a aVar;
        yy50.a.m(new jqc());
        if (!z) {
            return false;
        }
        do {
            wwd0Var = this.E;
            value = wwd0Var.getValue();
            aVar = eg5.a.a;
            ((fg5) value).getClass();
            aVar.getClass();
        } while (!wwd0Var.g(value, new fg5(aVar, true)));
        return true;
    }

    public final void B1(String str, String str2) {
        Object next;
        Object value;
        be5 be5Var = this.e;
        be5Var.getClass();
        if (str2 == null || str2.length() == 0 || !ogx.a("\\d+(\\.\\d+)?", str2)) {
            return;
        }
        Iterator it = ((Iterable) be5Var.c.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.g(((GiftDetails) next).getGiftId(), str));
        GiftDetails giftDetails = (GiftDetails) next;
        if (giftDetails != null) {
            m780 m780Var = new m780(giftDetails, str2);
            wwd0 wwd0Var = be5Var.d;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, m780Var));
        }
    }

    public final void b0() {
        this.e.a();
    }

    @Override // defpackage.je5
    public final void c0() {
        this.f.c0();
    }

    public final void j1(ArrayList arrayList) {
        be5 be5Var = this.e;
        Iterable<GiftDetails> iterable = (Iterable) be5Var.c.getValue();
        ArrayList arrayList2 = new ArrayList(l48.r(iterable, 10));
        for (GiftDetails giftDetails : iterable) {
            arrayList2.add(new GiftCurrentBalance(giftDetails.getGiftId(), giftDetails.getCurrentBalance()));
        }
        if (Intrinsics.g(CollectionsKt.r0(arrayList2, new zd5()), CollectionsKt.r0(arrayList, new ae5()))) {
            return;
        }
        be5Var.b();
    }

    @Override // defpackage.je5
    public final void o0(et7 et7Var) {
        this.f.o0(et7Var);
    }

    @Override // defpackage.je5
    public final uwd0<lk50<Sports>> q() {
        return this.f.q();
    }

    @Override // defpackage.je5
    public final uwd0<lk50<BuildAndGoTabConfig>> s1() {
        return this.f.s1();
    }

    @Override // defpackage.je5
    public final void u0() {
        this.f.u0();
    }

    @Override // defpackage.je5
    public final uwd0<lk50<Round>> w() {
        return this.f.w();
    }

    public final ni5 x1(ni5 ni5Var) {
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
        return ni5.a(ni5Var, null, null, null, null, false, null, null, null, false, false, 2, 511);
    }

    public final void y1(d dVar) {
        pdd0 g5oVar;
        wwd0 wwd0Var;
        Object value;
        e li5Var;
        Object value2;
        long jA;
        String str;
        int i;
        Object value3;
        ni5 ni5Var;
        jh10 jh10Var;
        Object value4;
        d.k kVar;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        ni5 ni5VarA;
        Object value9;
        ni5 ni5VarA2;
        Object value10;
        ni5 ni5VarA3;
        Object value11;
        Object value12;
        dVar.getClass();
        if (dVar.equals(d.i.a)) {
            return;
        }
        boolean zEquals = dVar.equals(d.C0263d.a);
        wwd0 wwd0Var2 = this.H;
        if (zEquals) {
            do {
                value12 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value12, ni5.a((ni5) value12, null, null, null, null, false, null, null, null, true, false, 0, 1791)));
            return;
        }
        if (dVar.equals(d.h.a)) {
            do {
                value11 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value11, ni5.a((ni5) value11, null, null, null, null, false, null, null, null, false, false, 0, 1791)));
            return;
        }
        if (dVar.equals(d.n.a)) {
            if (this.v.isLogin()) {
                do {
                    value10 = wwd0Var2.getValue();
                    ni5VarA3 = (ni5) value10;
                    if (ni5VarA3.k == -1) {
                        ni5VarA3 = ni5.a(ni5VarA3, null, null, null, null, false, null, null, null, false, true, 0, 511);
                    }
                } while (!wwd0Var2.g(value10, ni5VarA3));
                return;
            }
            Boolean bool = Boolean.TRUE;
            wwd0 wwd0Var3 = this.D;
            wwd0Var3.getClass();
            wwd0Var3.k(null, bool);
            ej5.c(o8i0.d(this), null, null, new b(null), 3);
            return;
        }
        if (dVar.equals(d.q.a)) {
            do {
                value9 = wwd0Var2.getValue();
                ni5VarA2 = (ni5) value9;
                int i2 = ni5VarA2.k;
                if (i2 == 0) {
                    ni5VarA2 = ni5.a(ni5VarA2, null, null, null, null, false, null, null, null, false, false, 1, 1023);
                } else if (i2 == 1) {
                    ni5VarA2 = x1(ni5VarA2);
                }
            } while (!wwd0Var2.g(value9, ni5VarA2));
            return;
        }
        if (dVar.equals(d.r.a)) {
            do {
                value8 = wwd0Var2.getValue();
                ni5VarA = (ni5) value8;
                if (ni5VarA.k == 1) {
                    ni5VarA = ni5.a(ni5VarA, null, null, null, null, false, null, null, null, false, false, 0, 1023);
                }
            } while (!wwd0Var2.g(value8, ni5VarA));
            return;
        }
        if (dVar.equals(d.p.a)) {
            do {
                value7 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value7, x1((ni5) value7)));
            return;
        }
        boolean z = dVar instanceof d.c;
        be5 be5Var = this.e;
        if (z) {
            be5Var.a();
            return;
        }
        boolean z2 = dVar instanceof d.o;
        wwd0 wwd0Var4 = this.C;
        if (z2) {
            do {
                value6 = wwd0Var4.getValue();
            } while (!wwd0Var4.g(value6, ((d.o) dVar).a));
            return;
        }
        boolean z3 = dVar instanceof d.k;
        qc5 qc5Var = this.d;
        if (z3) {
            do {
                value4 = wwd0Var2.getValue();
                kVar = (d.k) dVar;
            } while (!wwd0Var2.g(value4, ni5.a((ni5) value4, null, null, null, null, false, null, kVar.b, kVar.a, false, false, 0, 1855)));
            wwd0 wwd0Var5 = qc5Var.e;
            do {
                value5 = wwd0Var5.getValue();
            } while (!wwd0Var5.g(value5, lni0.b));
            return;
        }
        if (dVar.equals(d.b.a)) {
            do {
                value3 = wwd0Var2.getValue();
                ni5Var = (ni5) value3;
                jh10Var = ni5Var.f;
                if (jh10Var instanceof jh10.d) {
                    jh10Var = jh10.c.a;
                }
            } while (!wwd0Var2.g(value3, ni5.a(ni5Var, null, null, null, null, false, jh10Var, null, null, false, false, 0, 1823)));
            qc5Var.a();
            return;
        }
        if (dVar.equals(d.f.a)) {
            ni5 ni5Var2 = (ni5) wwd0Var2.getValue();
            cf5 cf5Var = ni5Var2.h;
            if (cf5Var == null) {
                return;
            }
            BetBuilderInRound betBuilderInRound = ni5Var2.g;
            BigDecimal bigDecimalG = kotlin.text.b.g((String) wwd0Var4.getValue());
            if (bigDecimalG == null) {
                bigDecimalG = BigDecimal.ZERO;
            }
            BigDecimal bigDecimalMultiply = bigDecimalG.multiply(heo.a);
            m780 m780Var = (m780) be5Var.d.getValue();
            if (m780Var != null) {
                GiftDetails giftDetails = m780Var.b;
                String giftId = giftDetails.getGiftId();
                int kind = giftDetails.getKind();
                jA = m780Var.a();
                i = kind;
                str = giftId;
            } else {
                jA = 0;
                str = "";
                i = 0;
            }
            long j = jA;
            String str2 = cf5Var.a;
            String str3 = cf5Var.b.eventId;
            String str4 = betBuilderInRound != null ? betBuilderInRound.id : null;
            kzh.d(new yzh(new g1i(bm50.a(this.b.D(new BuildAndGoTicketCreate(null, str2, null, kotlin.collections.b.f(new BuildAndGoTicketCreate.Selection(str3, null, str4 == null ? "" : str4, 2, null)), kotlin.collections.b.f(new BuildAndGoTicketCreate.Bet(null, Long.valueOf(bigDecimalMultiply.longValue()), null, 5, null)), null, null, null, str, i, j, 229, null), InstantWinBetSource.BETSLIP)), new qi5(this, null)), new ri5(this, null)), o8i0.d(this));
            return;
        }
        if (dVar.equals(d.l.a)) {
            do {
                value2 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value2, ni5.a((ni5) value2, null, null, null, null, false, jh10.c.a, null, null, false, false, 0, 2015)));
            return;
        }
        boolean z4 = dVar instanceof d.j;
        ku90<e> ku90Var = this.B;
        if (z4) {
            d.j jVar = (d.j) dVar;
            if (jVar instanceof d.j.c) {
                li5Var = mi5.a;
            } else if (jVar instanceof d.j.b) {
                BigDecimal bigDecimalG2 = kotlin.text.b.g((String) wwd0Var4.getValue());
                if (bigDecimalG2 == null) {
                    bigDecimalG2 = BigDecimal.ZERO;
                }
                bigDecimalG2.getClass();
                li5Var = new li5(new fqk(146, new InstantWinGiftApplicabilityContext(new InstantWinGiftApplicabilityContext.BetSlipType.Single(bigDecimalG2, new InstantWinGiftApplicabilityContext.BetCount.Single(1, 1))), (m780) be5Var.d.getValue()));
            } else {
                if (!jVar.equals(d.j.a.a)) {
                    uhc.a();
                    return;
                }
                li5Var = ki5.a;
            }
            ku90Var.a(li5Var);
            return;
        }
        if (dVar instanceof d.e) {
            do {
                wwd0Var = this.F;
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, Long.valueOf(((Number) value).longValue() + 1)));
            ku90Var.a(e.a.a);
            u0();
            this.a.g();
            return;
        }
        if (dVar instanceof d.m) {
            u0();
            return;
        }
        if (!(dVar instanceof d.g)) {
            if (!(dVar instanceof d.a)) {
                uhc.a();
                return;
            }
            d.a aVar = (d.a) dVar;
            if (aVar instanceof d.a.C0262d) {
                g5oVar = new h5o(0);
            } else if (aVar instanceof d.a.C0261a) {
                g5oVar = new d5o(0);
            } else if (aVar instanceof d.a.b) {
                g5oVar = new e5o(0);
            } else if (!(aVar instanceof d.a.c)) {
                uhc.a();
                return;
            } else {
                g5oVar = new g5o(0);
                y8j.a(this.y, "bng_stake__change__click");
            }
            this.w.a(g5oVar, k00.d);
            return;
        }
        xxb xxbVar = this.i;
        uxb uxbVar = (uxb) xxbVar.b.getValue();
        if (uxbVar != null) {
            if ((uxbVar instanceof uxb.f) || (uxbVar instanceof uxb.g)) {
                u0();
            } else if (uxbVar instanceof uxb.d) {
                be5Var.b();
            } else if (!(uxbVar instanceof uxb.a) && !(uxbVar instanceof uxb.b) && !(uxbVar instanceof uxb.c) && !(uxbVar instanceof uxb.e) && !(uxbVar instanceof uxb.h) && !(uxbVar instanceof uxb.i)) {
                uhc.a();
                return;
            }
        }
        xxbVar.a();
    }

    public final boolean z1() {
        if (this.v.isLogin()) {
            return ((ni5) this.H.getValue()).k == -1;
        }
        return !((Boolean) this.D.getValue()).booleanValue();
    }
}
