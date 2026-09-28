package com.sportybet.android.instantwin.presentation.racingrace;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import defpackage.c2o;
import defpackage.cmo;
import defpackage.d2o;
import defpackage.e1i;
import defpackage.e2o;
import defpackage.f2o;
import defpackage.fqo;
import defpackage.g1i;
import defpackage.h0o;
import defpackage.j8i0;
import defpackage.ku90;
import defpackage.kzh;
import defpackage.mwd0;
import defpackage.n1i;
import defpackage.o8i0;
import defpackage.psm;
import defpackage.rdd0;
import defpackage.v340;
import defpackage.vch0;
import defpackage.vu60;
import defpackage.wwd0;
import defpackage.x1o;
import defpackage.xwd0;
import defpackage.y8j;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/racingrace/c;", "Lj8i0;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class c extends j8i0 {
    public final psm a;
    public final rdd0 b;
    public final y8j c;
    public final v340 d;
    public final fqo e;
    public final wwd0 f;
    public final ku90<b> i;
    public final v340 v;

    public c(vu60 vu60Var, cmo cmoVar, psm psmVar, rdd0 rdd0Var, y8j y8jVar) {
        ResourceUiText resourceUiText;
        vu60Var.getClass();
        psmVar.getClass();
        rdd0Var.getClass();
        y8jVar.getClass();
        this.a = psmVar;
        this.b = rdd0Var;
        this.c = y8jVar;
        v340 v340VarD = vu60Var.d(null, "ARG_INPUT");
        this.d = v340VarD;
        String strX1 = x1();
        Integer numB = cmoVar.b(strX1);
        Integer numC = cmoVar.c(strX1);
        fqo.a.b bVar = new fqo.a.b(numB);
        if (numC != null) {
            int iIntValue = numC.intValue();
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(iIntValue);
        } else {
            resourceUiText = null;
        }
        fqo fqoVar = new fqo(bVar, resourceUiText);
        this.e = fqoVar;
        wwd0 wwd0VarA = xwd0.a(x1o.a);
        this.f = wwd0VarA;
        this.i = new ku90<>();
        this.v = e1i.e(new n1i(v340VarD, wwd0VarA, new f2o(3, this, c.class, "createUiState", "createUiState(Lcom/sportybet/android/instantwin/router/racingrace/InstantRacingRaceInput;Lcom/sportybet/android/instantwin/presentation/racingrace/model/InstantRacingRaceStage;)Lcom/sportybet/android/instantwin/presentation/racingrace/model/state/InstantRacingRaceUiState;", 4)), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), new c2o(fqoVar, null));
        kzh.d(new g1i(new e2o(wwd0VarA), new d2o(this, null)), o8i0.d(this));
    }

    public final String x1() {
        h0o h0oVar = (h0o) this.d.a.getValue();
        String str = h0oVar != null ? h0oVar.a : null;
        return str == null ? "" : str;
    }
}
