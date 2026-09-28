package com.sportybet.android.instantwin.presentation.scheduledfootballopenbets;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.router.openbet.ScheduledFootballOpenBetsInput;
import defpackage.ac70;
import defpackage.bb70;
import defpackage.bre0;
import defpackage.cc70;
import defpackage.cmo;
import defpackage.dc70;
import defpackage.de2;
import defpackage.e1i;
import defpackage.ej5;
import defpackage.et7;
import defpackage.fa70;
import defpackage.fqo;
import defpackage.g1i;
import defpackage.ga70;
import defpackage.j8i0;
import defpackage.k00;
import defpackage.k1i;
import defpackage.kqo;
import defpackage.ku90;
import defpackage.kzh;
import defpackage.mwd0;
import defpackage.o8i0;
import defpackage.p48;
import defpackage.pdd0;
import defpackage.r0i;
import defpackage.r1i;
import defpackage.rb70;
import defpackage.rdd0;
import defpackage.rqf0;
import defpackage.t340;
import defpackage.tc70;
import defpackage.tz60;
import defpackage.uc70;
import defpackage.uhc;
import defpackage.uzh;
import defpackage.v340;
import defpackage.vb70;
import defpackage.vc70;
import defpackage.vch0;
import defpackage.vu60;
import defpackage.wb70;
import defpackage.wc70;
import defpackage.wwd0;
import defpackage.xb70;
import defpackage.xc70;
import defpackage.xwd0;
import defpackage.yb70;
import defpackage.zb70;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/scheduledfootballopenbets/b;", "Lj8i0;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class b extends j8i0 {
    public final v340 A;
    public final cmo a;
    public final cc70 b;
    public final rqf0 c;
    public final bre0 d;
    public final rdd0 e;
    public final ScheduledFootballOpenBetsInput f;
    public final SimpleDateFormat i;
    public final SimpleDateFormat v;
    public final wwd0 w;
    public final ku90<vc70> y;
    public final t340 z;

    public b(vu60 vu60Var, cmo cmoVar, kqo kqoVar, cc70 cc70Var, rqf0 rqf0Var, bre0 bre0Var, rdd0 rdd0Var) {
        ResourceUiText resourceUiText;
        vu60Var.getClass();
        rdd0Var.getClass();
        this.a = cmoVar;
        this.b = cc70Var;
        this.c = rqf0Var;
        this.d = bre0Var;
        this.e = rdd0Var;
        this.f = (ScheduledFootballOpenBetsInput) vu60Var.b("ARG_INPUT");
        this.i = new SimpleDateFormat("dd/MM", Locale.getDefault());
        this.v = new SimpleDateFormat("HH:mm", Locale.getDefault());
        wwd0 wwd0VarA = xwd0.a(null);
        this.w = wwd0VarA;
        ku90<vc70> ku90Var = new ku90<>();
        this.y = ku90Var;
        this.z = e1i.a(ku90Var);
        wwd0 wwd0Var = kqoVar.d;
        wwd0 wwd0Var2 = cc70Var.f;
        k1i k1iVarA = r1i.a(wwd0Var, e1i.b(wwd0Var2), wwd0VarA, new xc70(4, this, b.class, "createUiState", "createUiState(Lcom/sportybet/android/instantwin/presentation/compose/toolbar/InstantWinTopAppBarState$UserStatus;Lcom/sportybet/android/instantwin/presentation/scheduledfootballopenbets/model/ScheduledFootballOpenBetsDataStatus;Ljava/lang/String;)Lcom/sportybet/android/instantwin/presentation/scheduledfootballopenbets/model/state/ScheduledFootballOpenBetsUiState;", 4));
        et7 et7VarD = o8i0.d(this);
        mwd0 mwd0Var = new mwd0(0L, Long.MAX_VALUE);
        fqo.c.b bVar = fqo.c.b.a;
        fqo.a.C0579a c0579a = fqo.a.C0579a.a;
        Integer numC = cmoVar.c(y1());
        if (numC != null) {
            int iIntValue = numC.intValue();
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(iIntValue);
        } else {
            resourceUiText = null;
        }
        this.A = e1i.e(k1iVarA, et7VarD, mwd0Var, new wc70(new fqo(R.color.bg_brand_main_primary, c0579a, resourceUiText, bVar), x1(dc70.b.a), bb70.c.a));
        kqoVar.a(o8i0.d(this), true);
        et7 et7VarD2 = o8i0.d(this);
        ej5.c(et7VarD2, null, null, new yb70(cc70Var, y1(), null), 3);
        kzh.d(new g1i(r0i.f(uzh.c(e1i.b(wwd0Var2), new de2(1), uzh.b), new xb70(null, cc70Var)), new zb70(null, cc70Var)), et7VarD2);
        kzh.d(new g1i(new vb70(new wb70(e1i.b(wwd0Var2))), new ac70(null, cc70Var)), et7VarD2);
    }

    public final rb70 x1(dc70 dc70Var) {
        int size;
        ga70 ga70Var;
        List<fa70> list;
        dc70.c cVar = dc70Var instanceof dc70.c ? (dc70.c) dc70Var : null;
        if (cVar == null || (ga70Var = cVar.a) == null || (list = ga70Var.d) == null) {
            size = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                p48.w(((fa70) it.next()).f, arrayList);
            }
            size = arrayList.size();
        }
        return new rb70(this.a.a(y1()), String.valueOf(size));
    }

    public final String y1() {
        ScheduledFootballOpenBetsInput scheduledFootballOpenBetsInput = this.f;
        String str = scheduledFootballOpenBetsInput != null ? scheduledFootballOpenBetsInput.a : null;
        return str == null ? "" : str;
    }

    public final void z1(a aVar) {
        pdd0 iVar;
        String str;
        wwd0 wwd0Var;
        Object value;
        Object value2;
        vc70 uc70Var;
        aVar.getClass();
        if (aVar instanceof a.b) {
            a.b bVar = (a.b) aVar;
            if (bVar instanceof a.b.C0339a) {
                uc70Var = tc70.a;
            } else {
                if (!(bVar instanceof a.b.C0340b)) {
                    uhc.a();
                    return;
                }
                uc70Var = new uc70(y1());
            }
            this.y.a(uc70Var);
            return;
        }
        if (aVar instanceof a.c) {
            wwd0 wwd0Var2 = this.b.d;
            do {
                value2 = wwd0Var2.getValue();
                ((Number) value2).longValue();
            } while (!wwd0Var2.g(value2, Long.valueOf(System.currentTimeMillis())));
            return;
        }
        if (aVar instanceof a.d) {
            a.d dVar = (a.d) aVar;
            if (dVar instanceof a.d.b) {
                str = ((a.d.b) dVar).a;
            } else {
                if (!(dVar instanceof a.d.C0341a)) {
                    uhc.a();
                    return;
                }
                str = null;
            }
            do {
                wwd0Var = this.w;
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, str));
            return;
        }
        if (!(aVar instanceof a.InterfaceC0337a)) {
            uhc.a();
            return;
        }
        a.InterfaceC0337a interfaceC0337a = (a.InterfaceC0337a) aVar;
        if (interfaceC0337a instanceof a.InterfaceC0337a.b) {
            iVar = new tz60.j(0);
        } else {
            if (!(interfaceC0337a instanceof a.InterfaceC0337a.C0338a)) {
                uhc.a();
                return;
            }
            iVar = new tz60.i(0);
        }
        this.e.a(iVar, k00.d, k00.c);
    }
}
