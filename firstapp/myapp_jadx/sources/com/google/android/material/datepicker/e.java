package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import defpackage.rqh0;
import java.util.Calendar;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends RecyclerView.s {
    public final /* synthetic */ j a;
    public final /* synthetic */ c b;

    public e(c cVar, j jVar) {
        this.b = cVar;
        this.a = jVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void b(RecyclerView recyclerView, int i, int i2) {
        CalendarConstraints calendarConstraints = this.a.a;
        c cVar = this.b;
        RecyclerView recyclerView2 = cVar.y;
        int iF1 = i < 0 ? ((LinearLayoutManager) recyclerView2.getLayoutManager()).f1() : ((LinearLayoutManager) recyclerView2.getLayoutManager()).h1();
        Calendar calendarC = rqh0.c(calendarConstraints.a.a);
        calendarC.add(2, iF1);
        Month month = new Month(calendarC);
        cVar.f = month;
        MaterialButton materialButton = cVar.D;
        Calendar calendarC2 = rqh0.c(calendarConstraints.a.a);
        calendarC2.add(2, iF1);
        materialButton.setText(new Month(calendarC2).h());
        cVar.o0(calendarConstraints.a.i(month));
    }
}
