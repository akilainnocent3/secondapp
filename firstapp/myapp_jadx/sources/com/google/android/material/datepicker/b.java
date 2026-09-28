package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.rqh0;
import java.util.Calendar;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements View.OnClickListener {
    public final /* synthetic */ j a;
    public final /* synthetic */ c b;

    public b(c cVar, j jVar) {
        this.b = cVar;
        this.a = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c cVar = this.b;
        int iH1 = ((LinearLayoutManager) cVar.y.getLayoutManager()).h1() - 1;
        Calendar calendarC = rqh0.c(this.a.a.a.a);
        calendarC.add(2, iH1);
        cVar.m0(new Month(calendarC));
    }
}
