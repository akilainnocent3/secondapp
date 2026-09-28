package com.sportybet.android.instantwin.presentation.bethistory2;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.router.bethistory2.InstantWinBetHistoryInput;
import defpackage.a4h;
import defpackage.a5o;
import defpackage.ado;
import defpackage.b390;
import defpackage.bdo;
import defpackage.bwf0;
import defpackage.cdo;
import defpackage.d150;
import defpackage.d390;
import defpackage.ddo;
import defpackage.e1i;
import defpackage.edo;
import defpackage.ej5;
import defpackage.et7;
import defpackage.fqo;
import defpackage.g1i;
import defpackage.ihi;
import defpackage.j8i0;
import defpackage.jce;
import defpackage.k00;
import defpackage.kqo;
import defpackage.ku90;
import defpackage.kzh;
import defpackage.l48;
import defpackage.lni0;
import defpackage.lyh;
import defpackage.m730;
import defpackage.mwd0;
import defpackage.n1a0;
import defpackage.n1i;
import defpackage.o8i0;
import defpackage.pco;
import defpackage.q3;
import defpackage.qcn;
import defpackage.qco;
import defpackage.r1i;
import defpackage.rdd0;
import defpackage.rgf;
import defpackage.tco;
import defpackage.uag;
import defpackage.uco;
import defpackage.uhc;
import defpackage.v340;
import defpackage.vbo;
import defpackage.vch0;
import defpackage.vco;
import defpackage.vu60;
import defpackage.wco;
import defpackage.wwd0;
import defpackage.xao;
import defpackage.xco;
import defpackage.xwd0;
import defpackage.y9o;
import defpackage.yao;
import defpackage.yco;
import defpackage.yfh0;
import defpackage.zao;
import defpackage.zco;
import defpackage.zs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ranges.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/bethistory2/c;", "Lj8i0;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class c extends j8i0 {
    public final wwd0 A;
    public final wwd0 B;
    public final wwd0 C;
    public vbo.b D;
    public final b390 E;
    public final v340 F;
    public final ihi a;
    public final jce b;
    public final rdd0 c;
    public final InstantWinBetHistoryInput d;
    public final zao e;
    public final ku90<b> f;
    public final wwd0 i;
    public final wwd0 v;
    public final wwd0 w;
    public final wwd0 y;
    public final wwd0 z;

    public c(vu60 vu60Var, d150 d150Var, kqo kqoVar, ihi ihiVar, jce jceVar, rdd0 rdd0Var) {
        Object objB;
        fqo fqoVar;
        int i;
        String str;
        vu60Var.getClass();
        d150Var.getClass();
        rdd0Var.getClass();
        this.a = ihiVar;
        this.b = jceVar;
        this.c = rdd0Var;
        this.d = (InstantWinBetHistoryInput) vu60Var.b("ARG_INPUT");
        m730 m730Var = (m730) d150Var.get(z1());
        zao yfh0Var = (m730Var == null || (yfh0Var = (zao) m730Var.get()) == null) ? new yfh0() : yfh0Var;
        this.e = yfh0Var;
        this.f = new ku90<>();
        if (yfh0Var.j()) {
            uag uagVar = pco.d;
            ArrayList arrayList = new ArrayList(l48.r(uagVar, 10));
            q3.b bVar = new q3.b();
            while (bVar.hasNext()) {
                pco pcoVar = (pco) bVar.next();
                int iOrdinal = pcoVar.ordinal();
                if (iOrdinal == 0) {
                    i = R.string.bet_history__settled;
                    str = "filter_settled_button";
                } else if (iOrdinal == 1) {
                    i = R.string.bet_history__unsettled;
                    str = "filter_unsettled_button";
                } else {
                    if (iOrdinal != 2) {
                        uhc.a();
                        throw null;
                    }
                    i = R.string.bet_history__all;
                    str = "filter_all_button";
                }
                arrayList.add(new qco(pcoVar, i, str));
            }
            objB = a4h.b(arrayList);
        } else {
            objB = n1a0.c;
        }
        wwd0 wwd0VarA = xwd0.a(objB);
        wwd0 wwd0VarA2 = xwd0.a(pco.a);
        this.i = wwd0VarA2;
        wwd0 wwd0VarA3 = xwd0.a(Boolean.FALSE);
        this.v = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a(null);
        this.w = wwd0VarA4;
        lni0 lni0Var = lni0.a;
        wwd0 wwd0VarA5 = xwd0.a(lni0Var);
        this.y = wwd0VarA5;
        wwd0 wwd0VarA6 = xwd0.a(lni0Var);
        this.z = wwd0VarA6;
        zs.a aVar = zs.a.a;
        wwd0 wwd0VarA7 = xwd0.a(aVar);
        this.A = wwd0VarA7;
        wwd0 wwd0VarA8 = xwd0.a(null);
        this.B = wwd0VarA8;
        wwd0 wwd0VarA9 = xwd0.a(null);
        this.C = wwd0VarA9;
        this.D = y1((pco) wwd0VarA2.getValue(), ((Boolean) wwd0VarA3.getValue()).booleanValue(), (e) wwd0VarA4.getValue());
        b390 b390VarB = d390.b(0, 1, null, 5);
        this.E = b390VarB;
        ddo ddoVar = new ddo(new lyh[]{kqoVar.d, wwd0VarA, wwd0VarA2, wwd0VarA3, wwd0VarA4, this.e.a(), wwd0VarA5, wwd0VarA6, wwd0VarA7, wwd0VarA8}, this);
        et7 et7VarD = o8i0.d(this);
        mwd0 mwd0Var = new mwd0(0L, Long.MAX_VALUE);
        fqo.c.b bVar2 = fqo.c.b.a;
        if (this.e.e()) {
            fqo.a.C0579a c0579a = fqo.a.C0579a.a;
            StringUiText stringUiText = vch0.a;
            fqoVar = new fqo(R.color.bg_brand_main_primary, c0579a, new ResourceUiText(R.string.common_functions__bet_history), bVar2);
        } else {
            fqoVar = null;
        }
        this.F = e1i.e(ddoVar, et7VarD, mwd0Var, new tco(fqoVar, x1((qcn) wwd0VarA.getValue(), (pco) wwd0VarA2.getValue(), ((Boolean) wwd0VarA3.getValue()).booleanValue(), (e) wwd0VarA4.getValue()), y9o.b.a, lni0Var, lni0Var, aVar, null));
        kqoVar.a(o8i0.d(this), false);
        this.e.h(o8i0.d(this), z1(), b390VarB);
        if (z1().equals("sr:sport:1") || z1().equals("sr:sport:1-3-1") || z1().equals("sr:sport:1-3-2")) {
            this.a.c(o8i0.d(this), z1());
        }
        kzh.d(new g1i(r1i.a(wwd0VarA2, wwd0VarA3, wwd0VarA4, new uco(4, this, c.class, "createRequestParams", "createRequestParams(Lcom/sportybet/android/instantwin/presentation/bethistory2/model/InstantWinBetHistorySettlementType;ZLkotlin/ranges/LongRange;)Lcom/sportybet/android/instantwin/presentation/bethistory2/model/InstantWinBetHistoryRequest$Params;", 4)), new vco(null, this)), o8i0.d(this));
        kzh.d(new g1i(this.e.c(), new wco(2, this, c.class, "handleKickOffStatus", "handleKickOffStatus(Lcom/sportybet/android/instantwin/presentation/bethistory2/model/InstantWinBetHistoryKickOffStatus;)V", 4)), o8i0.d(this));
        kzh.d(new g1i(new n1i(e1i.b(this.a.g), wwd0VarA9, new xco(3, this, c.class, "createSkipToResultState", "createSkipToResultState(Lcom/sportybet/android/instantwin/model/VisibilityState;Ljava/lang/String;)Lcom/sportybet/android/instantwin/presentation/bethistory2/model/state/InstantWinBetHistorySkipToResultState;", 4)), new yco(null, this)), o8i0.d(this));
    }

    public static vbo.b y1(pco pcoVar, boolean z, e eVar) {
        pcoVar.getClass();
        boolean z2 = pcoVar == pco.b;
        if (z2) {
            long jE = kotlin.time.b.e(kotlin.time.c.i(29L, rgf.DAYS));
            long jCurrentTimeMillis = System.currentTimeMillis();
            eVar = new e(jCurrentTimeMillis - jE, jCurrentTimeMillis);
        } else if (eVar == null) {
            long jE2 = kotlin.time.b.e(kotlin.time.c.i(29L, rgf.DAYS));
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            eVar = new e(jCurrentTimeMillis2 - jE2, jCurrentTimeMillis2);
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (z2) {
            boolValueOf = null;
        }
        return new vbo.b(pcoVar, boolValueOf != null ? boolValueOf.booleanValue() : false, eVar.a, eVar.b);
    }

    public final void A1(a aVar) {
        wwd0 wwd0Var;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        b dVar;
        b cVar;
        aVar.getClass();
        boolean z = aVar instanceof a.i;
        ku90<b> ku90Var = this.f;
        ihi ihiVar = this.a;
        zao zaoVar = this.e;
        wwd0 wwd0Var2 = this.w;
        if (z) {
            a.i iVar = (a.i) aVar;
            if (iVar instanceof a.i.C0257a) {
                cVar = b.InterfaceC0258b.a.a;
            } else if (iVar instanceof a.i.f) {
                a.i.f fVar = (a.i.f) iVar;
                cVar = new b.InterfaceC0258b.f(fVar.a, fVar.b);
            } else if (iVar instanceof a.i.c) {
                e eVar = (e) wwd0Var2.getValue();
                cVar = new b.InterfaceC0258b.c(eVar != null ? Long.valueOf(eVar.a) : null, eVar != null ? Long.valueOf(eVar.b) : null);
            } else {
                if (iVar instanceof a.i.e) {
                    String strZ1 = z1();
                    this.b.getClass();
                    dVar = new b.InterfaceC0258b.e(jce.a(strZ1), zaoVar.g(z1()));
                } else if (iVar instanceof a.i.b) {
                    dVar = new b.InterfaceC0258b.C0259b(z1(), ((a.i.b) iVar).a);
                } else {
                    if (!(iVar instanceof a.i.d)) {
                        uhc.a();
                        return;
                    }
                    dVar = new b.InterfaceC0258b.d(z1(), ((a.i.d) iVar).a, ihiVar.b());
                }
                cVar = dVar;
            }
            ku90Var.a(cVar);
            return;
        }
        boolean z2 = aVar instanceof a.c;
        wwd0 wwd0Var3 = this.i;
        if (z2) {
            a.c cVar2 = (a.c) aVar;
            do {
                value7 = wwd0Var3.getValue();
            } while (!wwd0Var3.g(value7, cVar2.a));
            return;
        }
        boolean z3 = aVar instanceof a.o;
        wwd0 wwd0Var4 = this.v;
        if (z3) {
            do {
                value6 = wwd0Var4.getValue();
            } while (!wwd0Var4.g(value6, Boolean.valueOf(!((Boolean) value6).booleanValue())));
            return;
        }
        if (aVar instanceof a.h) {
            a.h hVar = (a.h) aVar;
            boolean zEquals = hVar.equals(a.h.b.a);
            wwd0 wwd0Var5 = this.y;
            if (zEquals) {
                do {
                    value5 = wwd0Var5.getValue();
                } while (!wwd0Var5.g(value5, lni0.b));
                return;
            } else {
                if (!hVar.equals(a.h.C0256a.a)) {
                    uhc.a();
                    return;
                }
                do {
                    value4 = wwd0Var5.getValue();
                } while (!wwd0Var5.g(value4, lni0.a));
                return;
            }
        }
        if (aVar instanceof a.m) {
            do {
                value3 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value3, null));
            return;
        }
        if (aVar instanceof a.n) {
            a.n nVar = (a.n) aVar;
            do {
                value2 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value2, new e(nVar.a, nVar.b)));
            return;
        }
        if (aVar instanceof a.j) {
            vbo.b bVarY1 = y1((pco) wwd0Var3.getValue(), ((Boolean) wwd0Var4.getValue()).booleanValue(), (e) wwd0Var2.getValue());
            this.D = bVarY1;
            ej5.c(o8i0.d(this), null, null, new ado(this, new vbo(vbo.a.c, bVarY1), null), 3);
            return;
        }
        if (aVar instanceof a.d) {
            zaoVar.i();
            return;
        }
        if (aVar instanceof a.k) {
            vbo.b bVarY2 = y1((pco) wwd0Var3.getValue(), ((Boolean) wwd0Var4.getValue()).booleanValue(), (e) wwd0Var2.getValue());
            this.D = bVarY2;
            ej5.c(o8i0.d(this), null, null, new bdo(this, new vbo(vbo.a.a, bVarY2), null), 3);
            return;
        }
        if (aVar instanceof a.p) {
            if (zaoVar.b()) {
                ej5.c(o8i0.d(this), null, null, new edo(this, new vbo(vbo.a.b, this.D), null), 3);
                return;
            }
            return;
        }
        if (aVar instanceof a.l) {
            ej5.c(o8i0.d(this), null, null, new cdo(this, new vbo(vbo.a.b, this.D), null), 3);
            return;
        }
        if (aVar instanceof a.f) {
            a.f fVar2 = (a.f) aVar;
            ku90Var.a(new b.a(fVar2.a, fVar2.b));
            return;
        }
        boolean z4 = aVar instanceof a.g;
        rdd0 rdd0Var = this.c;
        if (z4) {
            ej5.c(o8i0.d(this), null, null, new zco(null, this), 3);
            rdd0Var.a(new a5o.g(z1()), k00.d, k00.c);
            return;
        }
        if (aVar instanceof a.e) {
            ihiVar.a();
            return;
        }
        if (!(aVar instanceof a.InterfaceC0253a)) {
            if (!(aVar instanceof a.b)) {
                uhc.a();
                return;
            } else if (((a.b) aVar) instanceof a.b.C0255a) {
                rdd0Var.a(new a5o.h(z1()), k00.d);
                return;
            } else {
                uhc.a();
                return;
            }
        }
        a.InterfaceC0253a interfaceC0253a = (a.InterfaceC0253a) aVar;
        if (interfaceC0253a.equals(a.InterfaceC0253a.b.a)) {
            A1(a.i.e.a);
            return;
        }
        if (!interfaceC0253a.equals(a.InterfaceC0253a.C0254a.a)) {
            uhc.a();
            return;
        }
        do {
            wwd0Var = this.A;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, zs.a.a));
    }

    public final xao x1(qcn<qco> qcnVar, pco pcoVar, boolean z, e eVar) {
        yao yaoVar;
        String str = null;
        if (!this.e.d()) {
            return null;
        }
        boolean z2 = pcoVar == pco.b;
        if (z2) {
            yaoVar = null;
        } else {
            yaoVar = new yao(z, z ? yao.a.CHECKED : yao.a.UNCHECKED);
        }
        boolean z3 = !z2;
        if (!z2 && eVar != null) {
            long j = eVar.a;
            bwf0 bwf0Var = bwf0.a;
            str = bwf0Var.h(j) + "~ " + bwf0Var.h(eVar.b);
        }
        return new xao(qcnVar, pcoVar, yaoVar, z3, str);
    }

    public final String z1() {
        InstantWinBetHistoryInput instantWinBetHistoryInput = this.d;
        String str = instantWinBetHistoryInput != null ? instantWinBetHistoryInput.a : null;
        return str == null ? "" : str;
    }
}
