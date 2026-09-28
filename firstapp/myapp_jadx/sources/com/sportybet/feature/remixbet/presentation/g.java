package com.sportybet.feature.remixbet.presentation;

import com.sporty.android.core.model.remixbet.RemixBetOrderRequest;
import com.sporty.android.core.model.remixbet.RemixBetRequest;
import defpackage.b390;
import defpackage.d390;
import defpackage.e1i;
import defpackage.f450;
import defpackage.i450;
import defpackage.j8i0;
import defpackage.ku90;
import defpackage.m2g;
import defpackage.rdd0;
import defpackage.t340;
import defpackage.u350;
import defpackage.v340;
import defpackage.wwd0;
import defpackage.x450;
import defpackage.xwd0;
import defpackage.y450;
import defpackage.z450;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/remixbet/presentation/g;", "Lj8i0;", "remixbet"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class g extends j8i0 {
    public final wwd0 A;
    public final v340 B;
    public List<f450> C;
    public int D;
    public RemixBetRequest E;
    public RemixBetOrderRequest F;
    public boolean G;
    public boolean H;
    public Boolean I;
    public final i450 a;
    public final y450 b;
    public final rdd0 c;
    public final x450 d;
    public final u350 e;
    public final wwd0 f;
    public final v340 i;
    public final b390 v;
    public final t340 w;
    public final ku90<com.sporty.android.common.uievent.a> y;
    public final ku90 z;

    public g(i450 i450Var, y450 y450Var, rdd0 rdd0Var, x450 x450Var, u350 u350Var) {
        i450Var.getClass();
        y450Var.getClass();
        rdd0Var.getClass();
        u350Var.getClass();
        this.a = i450Var;
        this.b = y450Var;
        this.c = rdd0Var;
        this.d = x450Var;
        this.e = u350Var;
        wwd0 wwd0VarA = xwd0.a(b.C0416b.a);
        this.f = wwd0VarA;
        this.i = e1i.b(wwd0VarA);
        b390 b390VarB = d390.b(0, 0, null, 7);
        this.v = b390VarB;
        this.w = e1i.a(b390VarB);
        ku90<com.sporty.android.common.uievent.a> ku90Var = new ku90<>();
        this.y = ku90Var;
        this.z = ku90Var;
        wwd0 wwd0VarA2 = xwd0.a(Boolean.FALSE);
        this.A = wwd0VarA2;
        this.B = e1i.b(wwd0VarA2);
        this.C = m2g.a;
    }

    public final void x1() {
        b.c cVar = new b.c(new z450(CollectionsKt.t0(CollectionsKt.O(this.C, this.D * 4), 4)));
        wwd0 wwd0Var = this.f;
        wwd0Var.getClass();
        wwd0Var.k(null, cVar);
    }
}
