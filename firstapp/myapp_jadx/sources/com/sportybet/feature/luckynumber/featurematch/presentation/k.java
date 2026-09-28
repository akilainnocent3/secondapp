package com.sportybet.feature.luckynumber.featurematch.presentation;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import defpackage.afy;
import defpackage.b77;
import defpackage.b8q;
import defpackage.bfy;
import defpackage.c8q;
import defpackage.cjr;
import defpackage.djr;
import defpackage.drq;
import defpackage.e1i;
import defpackage.ej5;
import defpackage.et7;
import defpackage.ipq;
import defpackage.j8i0;
import defpackage.ku90;
import defpackage.kwd0;
import defpackage.l1i;
import defpackage.lyh;
import defpackage.n1i;
import defpackage.o8i0;
import defpackage.obq;
import defpackage.odd;
import defpackage.or60;
import defpackage.ozh;
import defpackage.q490;
import defpackage.q7q;
import defpackage.qcn;
import defpackage.r0i;
import defpackage.r1i;
import defpackage.rdd0;
import defpackage.rey;
import defpackage.uhc;
import defpackage.uzh;
import defpackage.v340;
import defpackage.v5u;
import defpackage.vu60;
import defpackage.w5u;
import defpackage.wwd0;
import defpackage.x5u;
import defpackage.xwd0;
import defpackage.y5u;
import defpackage.y8h0;
import defpackage.z5u;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/luckynumber/featurematch/presentation/k;", "Lj8i0;", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class k extends j8i0 {
    public final v340 A;
    public final ku90<b> B;
    public final f a;
    public final drq b;
    public final vu60 c;
    public final rdd0 d;
    public final odd e;
    public final wwd0 f;
    public final ku90<c8q> i;
    public final wwd0 v;
    public final ku90<Unit> w;
    public final v340 y;
    public final lyh<Boolean> z;

    public k(afy afyVar, f fVar, drq drqVar, vu60 vu60Var, rdd0 rdd0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        drqVar.getClass();
        vu60Var.getClass();
        rdd0Var.getClass();
        this.a = fVar;
        this.b = drqVar;
        this.c = vu60Var;
        this.d = rdd0Var;
        this.e = oddVar;
        wwd0 wwd0VarA = xwd0.a(q7q.c.a);
        this.f = wwd0VarA;
        ku90<c8q> ku90Var = new ku90<>();
        this.i = ku90Var;
        v340 v340VarD = vu60Var.d(0, "selected_page_index");
        wwd0 wwd0VarA2 = xwd0.a(Boolean.FALSE);
        this.v = wwd0VarA2;
        this.w = new ku90<>();
        b77 b77VarF = r0i.f(new or60(new bfy(ku90Var, null)), new rey(null, afyVar, wwd0VarA));
        b8q b8qVar = new b8q(null, false, null, 31);
        lyh lyhVarC = ozh.c(b77VarF, oddVar);
        et7 et7VarD = o8i0.d(this);
        kwd0 kwd0Var = q490.a.a;
        v340 v340VarE = e1i.e(lyhVarC, et7VarD, kwd0Var, b8qVar);
        this.y = v340VarE;
        x5u x5uVar = new x5u(v340VarE, this);
        v5u v5uVar = new v5u();
        y8h0.d(2, v5uVar);
        n1i n1iVar = new n1i(v340VarE, r0i.f(uzh.c(x5uVar, uzh.a, v5uVar), new w5u(null, this)), new h(null, this));
        lyh<Boolean> lyhVarB = uzh.b(new y5u(v340VarE));
        this.z = lyhVarB;
        l1i l1iVarB = r1i.b(n1iVar, v340VarD, wwd0VarA2, lyhVarB, new z5u(5, null));
        this.A = e1i.e(ozh.c(l1iVarB, oddVar), o8i0.d(this), kwd0Var, new obq(0));
        this.B = new ku90<>();
    }

    public final void x1(a aVar) {
        aVar.getClass();
        if (aVar instanceof a.h) {
            this.f.setValue(((a.h) aVar).a);
            return;
        }
        boolean z = aVar instanceof a.i;
        ku90<c8q> ku90Var = this.i;
        rdd0 rdd0Var = this.d;
        if (z) {
            djr.a(rdd0Var, cjr.k.a);
            ku90Var.a(new c8q.a(((a.i) aVar).a));
            return;
        }
        boolean zEquals = aVar.equals(a.j.a);
        vu60 vu60Var = this.c;
        wwd0 wwd0Var = this.v;
        if (zEquals) {
            vu60Var.e(0, "selected_page_index");
            Boolean bool = Boolean.FALSE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
            ku90Var.a(c8q.b.a);
            return;
        }
        if (aVar instanceof a.g) {
            vu60Var.e(Integer.valueOf(((a.g) aVar).a), "selected_page_index");
            return;
        }
        boolean z2 = aVar instanceof a.C0403a;
        odd oddVar = this.e;
        if (z2) {
            qcn<Integer> qcnVar = ((a.C0403a) aVar).a;
            djr.a(rdd0Var, cjr.i.a);
            ej5.c(o8i0.d(this), oddVar, null, new i(this, qcnVar, null), 2);
            return;
        }
        if (aVar.equals(a.b.a)) {
            djr.a(rdd0Var, cjr.h.a);
            ej5.c(o8i0.d(this), oddVar, null, new j(null, this), 2);
            return;
        }
        if (aVar.equals(a.e.a)) {
            djr.a(rdd0Var, cjr.j.a);
            this.B.a(new b.a(ipq.NextDraw));
        } else if (aVar.equals(a.c.a)) {
            Boolean bool2 = Boolean.TRUE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool2);
        } else if (aVar.equals(a.d.a)) {
            Boolean bool3 = Boolean.FALSE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool3);
        } else if (aVar.equals(a.f.a)) {
            this.w.a(Unit.a);
        } else {
            uhc.a();
        }
    }
}
