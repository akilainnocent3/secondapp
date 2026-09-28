package com.sportybet.feature.luckynumber.winningpopup.presentation;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetEntrance;
import defpackage.cjr;
import defpackage.clr;
import defpackage.djr;
import defpackage.dlr;
import defpackage.e1i;
import defpackage.elr;
import defpackage.et7;
import defpackage.flr;
import defpackage.j8i0;
import defpackage.ku90;
import defpackage.kwd0;
import defpackage.l5u;
import defpackage.lcr;
import defpackage.lkr;
import defpackage.lyh;
import defpackage.mkr;
import defpackage.n1a0;
import defpackage.o8i0;
import defpackage.odd;
import defpackage.ozh;
import defpackage.q490;
import defpackage.qcn;
import defpackage.rdd0;
import defpackage.rkd0;
import defpackage.uhc;
import defpackage.v340;
import defpackage.vu60;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/luckynumber/winningpopup/presentation/c;", "Lj8i0;", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class c extends j8i0 {
    public final mkr a;
    public final rdd0 b;
    public final v340 c;
    public final ku90<b> d;
    public final v340 e;

    public c(vu60 vu60Var, mkr mkrVar, rdd0 rdd0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        vu60Var.getClass();
        rdd0Var.getClass();
        this.a = mkrVar;
        this.b = rdd0Var;
        flr flrVar = new flr(vu60Var.d("", "key_json_data"), this);
        rkd0.Companion.getClass();
        lkr lkrVar = new lkr("", rkd0.b, "", "", false, false, n1a0.c);
        lyh lyhVarC = ozh.c(flrVar, oddVar);
        et7 et7VarD = o8i0.d(this);
        kwd0 kwd0Var = q490.a.a;
        v340 v340VarE = e1i.e(lyhVarC, et7VarD, kwd0Var, lkrVar);
        this.c = v340VarE;
        this.d = new ku90<>();
        elr elrVar = new elr(v340VarE);
        this.e = e1i.e(ozh.c(elrVar, oddVar), o8i0.d(this), kwd0Var, new clr(0));
    }

    public final void x1(a aVar) {
        dlr dlrVar;
        aVar.getClass();
        boolean zEquals = aVar.equals(a.C0411a.a);
        ku90<b> ku90Var = this.d;
        v340 v340Var = this.c;
        rdd0 rdd0Var = this.b;
        if (zEquals) {
            djr.a(rdd0Var, cjr.k0.a);
            qcn<dlr> qcnVar = ((lkr) v340Var.a.getValue()).g;
            if (qcnVar.size() != 1) {
                qcnVar = null;
            }
            if (qcnVar == null || (dlrVar = (dlr) CollectionsKt.firstOrNull(qcnVar)) == null) {
                return;
            }
            ku90Var.a(new b.a(new l5u.c(dlrVar.a, LNPlaceBetEntrance.WINNING_POPUP.getFromScreenName(), (String) null, 4)));
            return;
        }
        if (aVar.equals(a.b.a)) {
            djr.a(rdd0Var, cjr.l0.a);
            v340 v340Var2 = this.e;
            ku90Var.a(new b.C0412b(new lcr(((clr) v340Var2.a.getValue()).a, ((lkr) v340Var.a.getValue()).a, ((clr) v340Var2.a.getValue()).b)));
        } else if (aVar.equals(a.c.a)) {
            ku90Var.a(new b.a(new l5u.d(((lkr) v340Var.a.getValue()).a)));
        } else if (aVar.equals(a.d.a)) {
            djr.a(rdd0Var, cjr.j0.a);
        } else {
            uhc.a();
        }
    }
}
