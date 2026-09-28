package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public k(l lVar, int i) {
        this.b = lVar;
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c<?> cVar = this.b.a;
        Month monthA = Month.a(this.a, cVar.f.b);
        CalendarConstraints calendarConstraints = cVar.d;
        Month month = calendarConstraints.b;
        Month month2 = calendarConstraints.a;
        Calendar calendar = monthA.a;
        if (calendar.compareTo(month2.a) < 0) {
            monthA = month2;
        } else if (calendar.compareTo(month.a) > 0) {
            monthA = month;
        }
        cVar.m0(monthA);
        cVar.n0(c.d.a);
        MaterialButton materialButton = cVar.D;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }
}
