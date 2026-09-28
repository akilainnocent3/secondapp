package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.plugin.realsports.betorder.calendar.view.CalendarView;

/* JADX INFO: loaded from: classes5.dex */
public final class ed implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;
    public final CalendarView c;
    public final AppCompatImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView i;

    public ed(ConstraintLayout constraintLayout, TextView textView, CalendarView calendarView, AppCompatImageView appCompatImageView, TextView textView2, TextView textView3, TextView textView4) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = calendarView;
        this.d = appCompatImageView;
        this.e = textView2;
        this.f = textView3;
        this.i = textView4;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
