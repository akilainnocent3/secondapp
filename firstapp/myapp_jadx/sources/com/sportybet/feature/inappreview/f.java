package com.sportybet.feature.inappreview;

import com.sporty.android.core.model.service.CountryCodeName;
import defpackage.e1i;
import defpackage.j8i0;
import defpackage.ku90;
import defpackage.psm;
import defpackage.t340;
import defpackage.v340;
import defpackage.wwd0;
import defpackage.xib0;
import defpackage.xwd0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/inappreview/f;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class f extends j8i0 {
    public final psm a;
    public final ku90<b> b;
    public final t340 c;
    public final wwd0 d;
    public final v340 e;

    public f(psm psmVar) {
        psmVar.getClass();
        this.a = psmVar;
        ku90<b> ku90Var = new ku90<>();
        this.b = ku90Var;
        this.c = e1i.a(ku90Var);
        wwd0 wwd0VarA = xwd0.a(new e(psmVar.getCountryCode() == CountryCodeName.GHANA ? xib0.IN_APP_REVIEW_DIALOG_PEOPLE_GH : xib0.IN_APP_REVIEW_DIALOG_PEOPLE, a.C0373a.a));
        this.d = wwd0VarA;
        this.e = e1i.b(wwd0VarA);
    }
}
