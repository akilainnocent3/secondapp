package com.sportybet.android.instantwin.presentation.ticketdetail;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.router.ticketdetail.InstantWinTicketDetailInput;
import defpackage.a5o;
import defpackage.bno;
import defpackage.d150;
import defpackage.e1i;
import defpackage.et7;
import defpackage.fpo;
import defpackage.fqo;
import defpackage.gpo;
import defpackage.hgh0;
import defpackage.j8i0;
import defpackage.j8o;
import defpackage.jce;
import defpackage.k00;
import defpackage.kqo;
import defpackage.ku90;
import defpackage.m730;
import defpackage.mwd0;
import defpackage.o8i0;
import defpackage.ono;
import defpackage.r1i;
import defpackage.rdd0;
import defpackage.slo;
import defpackage.t340;
import defpackage.uhc;
import defpackage.v340;
import defpackage.vch0;
import defpackage.vu60;
import defpackage.wwd0;
import defpackage.xwd0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/ticketdetail/d;", "Lj8i0;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class d extends j8i0 {
    public final j8o a;
    public final jce b;
    public final rdd0 c;
    public final InstantWinTicketDetailInput d;
    public final wwd0 e;
    public final ono f;
    public final ku90<c> i;
    public final t340 v;
    public final v340 w;

    public d(vu60 vu60Var, d150 d150Var, j8o j8oVar, jce jceVar, kqo kqoVar, rdd0 rdd0Var) {
        vu60Var.getClass();
        d150Var.getClass();
        j8oVar.getClass();
        rdd0Var.getClass();
        this.a = j8oVar;
        this.b = jceVar;
        this.c = rdd0Var;
        InstantWinTicketDetailInput instantWinTicketDetailInput = (InstantWinTicketDetailInput) vu60Var.b("ARG_INPUT");
        this.d = instantWinTicketDetailInput;
        wwd0 wwd0VarA = xwd0.a(null);
        this.e = wwd0VarA;
        m730 m730Var = (m730) d150Var.get(y1());
        ono hgh0Var = (m730Var == null || (hgh0Var = (ono) m730Var.get()) == null) ? new hgh0() : hgh0Var;
        this.f = hgh0Var;
        ku90<c> ku90Var = new ku90<>();
        this.i = ku90Var;
        this.v = e1i.a(ku90Var);
        this.w = e1i.e(r1i.a(kqoVar.d, hgh0Var.a(), wwd0VarA, new gpo(4, this, d.class, "createUiState", "createUiState(Lcom/sportybet/android/instantwin/presentation/compose/toolbar/InstantWinTopAppBarState$UserStatus;Lcom/sportybet/android/instantwin/presentation/ticketdetail/model/InstantWinTicketDetailContentStatus;Lcom/sportybet/android/instantwin/presentation/compose/bottomsheet/selectiondescription/state/InstantWinSelectionDescriptionBottomSheetState;)Lcom/sportybet/android/instantwin/presentation/ticketdetail/model/state/InstantWinTicketDetailUiState;", 4)), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), new fpo(x1(fqo.c.b.a), bno.b.a, null));
        kqoVar.a(o8i0.d(this), false);
        et7 et7VarD = o8i0.d(this);
        String str = instantWinTicketDetailInput != null ? instantWinTicketDetailInput.b : null;
        hgh0Var.g(et7VarD, str == null ? "" : str);
    }

    public final fqo x1(fqo.c cVar) {
        InstantWinTicketDetailInput.b bVar;
        InstantWinTicketDetailInput instantWinTicketDetailInput = this.d;
        if (instantWinTicketDetailInput != null && (bVar = instantWinTicketDetailInput.c) != null) {
            if (bVar != InstantWinTicketDetailInput.b.b) {
                bVar = null;
            }
            if (bVar != null) {
                fqo.a.C0579a c0579a = fqo.a.C0579a.a;
                StringUiText stringUiText = vch0.a;
                return new fqo(R.color.bg_brand_main_primary, c0579a, new ResourceUiText(R.string.component_betslip__sim_ticket_details), cVar);
            }
        }
        return null;
    }

    public final String y1() {
        InstantWinTicketDetailInput instantWinTicketDetailInput = this.d;
        String str = instantWinTicketDetailInput != null ? instantWinTicketDetailInput.a : null;
        return str == null ? "" : str;
    }

    public final void z1(b bVar) {
        Object value;
        Object value2;
        slo sloVar;
        c c0349c;
        bVar.getClass();
        boolean z = bVar instanceof b.d;
        ku90<c> ku90Var = this.i;
        ono onoVar = this.f;
        if (z) {
            b.d dVar = (b.d) bVar;
            if (dVar instanceof b.d.C0345b) {
                j8o j8oVar = this.a;
                if (j8oVar.d()) {
                    boolean zA = j8oVar.a();
                    String strY1 = y1();
                    this.b.getClass();
                    c0349c = new c.b.C0348b(zA, jce.a(strY1), onoVar.f(y1(), zA));
                } else {
                    c0349c = c.b.a.a;
                }
            } else {
                if (!(dVar instanceof b.d.a)) {
                    uhc.a();
                    return;
                }
                c0349c = new c.b.C0349c(((b.d.a) dVar).a);
            }
            ku90Var.a(c0349c);
            return;
        }
        if (bVar instanceof b.e) {
            onoVar.b();
            return;
        }
        if (bVar instanceof b.C0343b) {
            b.C0343b c0343b = (b.C0343b) bVar;
            ku90Var.a(new c.a(c0343b.a, c0343b.b));
            return;
        }
        if (bVar instanceof b.c) {
            onoVar.e((b.c) bVar);
            return;
        }
        if (bVar instanceof b.h) {
            onoVar.h(((b.h) bVar).a);
            return;
        }
        if (bVar instanceof b.g) {
            b.g gVar = (b.g) bVar;
            if (gVar instanceof b.g.C0347b) {
                onoVar.d(((b.g.C0347b) gVar).a);
                return;
            } else if (gVar instanceof b.g.a) {
                onoVar.c();
                return;
            } else {
                uhc.a();
                return;
            }
        }
        if (!(bVar instanceof b.f)) {
            if (!(bVar instanceof b.a)) {
                uhc.a();
                return;
            } else {
                if (!(((b.a) bVar) instanceof b.a.C0342a)) {
                    uhc.a();
                    return;
                }
                this.c.a(new a5o.f(y1()), k00.d);
                return;
            }
        }
        b.f fVar = (b.f) bVar;
        boolean z2 = fVar instanceof b.f.C0346b;
        wwd0 wwd0Var = this.e;
        if (!z2) {
            if (!(fVar instanceof b.f.a)) {
                uhc.a();
                return;
            }
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, null));
            return;
        }
        do {
            value2 = wwd0Var.getValue();
            int iOrdinal = ((b.f.C0346b) fVar).a.ordinal();
            if (iOrdinal == 0) {
                StringUiText stringUiText = vch0.a;
                sloVar = new slo(new ResourceUiText(R.string.bet_history__1up_early_payout), new ResourceUiText(R.string.bet_history__congratulations_1up_popup));
            } else if (iOrdinal != 1) {
                uhc.a();
                return;
            } else {
                StringUiText stringUiText2 = vch0.a;
                sloVar = new slo(new ResourceUiText(R.string.bet_history__2up_early_payout), new ResourceUiText(R.string.bet_history__congratulations_2up_popup));
            }
        } while (!wwd0Var.g(value2, sloVar));
    }
}
