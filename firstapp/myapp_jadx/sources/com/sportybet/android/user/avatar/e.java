package com.sportybet.android.user.avatar;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.json.JsonSerializeService;
import defpackage.bnh0;
import defpackage.bp1;
import defpackage.e1i;
import defpackage.ej5;
import defpackage.f47;
import defpackage.i2i;
import defpackage.ihb0;
import defpackage.lk50;
import defpackage.lq1;
import defpackage.lyz;
import defpackage.mgb0;
import defpackage.o8i0;
import defpackage.odd;
import defpackage.q490;
import defpackage.r1i;
import defpackage.r5b;
import defpackage.so1;
import defpackage.ssw;
import defpackage.uo1;
import defpackage.v340;
import defpackage.wwd0;
import defpackage.xwd0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/user/avatar/e;", "Lihb0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class e extends ihb0 {
    public final wwd0 A;
    public final wwd0 B;
    public final wwd0 C;
    public final r5b D;
    public final v340 E;
    public final ssw<lk50<Object>> F;
    public final ssw G;
    public final ssw<lk50<bp1>> H;
    public final ssw I;
    public final lyz d;
    public final lq1 e;
    public final JsonSerializeService f;
    public final uo1 i;
    public final bnh0 v;
    public final mgb0 w;
    public final wwd0 y;
    public final r5b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(lyz lyzVar, lq1 lq1Var, JsonSerializeService jsonSerializeService, uo1 uo1Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, bnh0 bnh0Var, mgb0 mgb0Var) {
        super(0);
        lyzVar.getClass();
        lq1Var.getClass();
        jsonSerializeService.getClass();
        uo1Var.getClass();
        bnh0Var.getClass();
        mgb0Var.getClass();
        this.d = lyzVar;
        this.e = lq1Var;
        this.f = jsonSerializeService;
        this.i = uo1Var;
        this.v = bnh0Var;
        this.w = mgb0Var;
        wwd0 wwd0VarA = xwd0.a(f.b.a);
        this.y = wwd0VarA;
        this.z = i2i.c(wwd0VarA, o8i0.d(this).a, 2);
        wwd0 wwd0VarA2 = xwd0.a("");
        this.A = wwd0VarA2;
        wwd0 wwd0VarA3 = xwd0.a(Boolean.TRUE);
        this.B = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a(Boolean.FALSE);
        this.C = wwd0VarA4;
        this.D = i2i.c(wwd0VarA4, o8i0.d(this).a, 2);
        this.E = e1i.e(r1i.a(wwd0VarA, wwd0VarA2, wwd0VarA3, new b(4, null)), o8i0.d(this), q490.a.a, so1.c.a);
        ssw<lk50<Object>> sswVar = new ssw<>();
        this.F = sswVar;
        this.G = sswVar;
        ssw<lk50<bp1>> sswVar2 = new ssw<>();
        this.H = sswVar2;
        this.I = sswVar2;
        ej5.c(o8i0.d(this), oddVar, null, new f47(this, null), 2);
    }
}
