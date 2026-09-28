package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.sportybet.plugin.realsports.betorder.calendar.view.CalendarView;

/* JADX INFO: loaded from: classes5.dex */
public final class yfd0 implements g6i0 {
    public final RelativeLayout a;
    public final TextView b;
    public final CalendarView c;
    public final AppCompatImageView d;
    public final RelativeLayout e;
    public final TextView f;
    public final TextView i;
    public final TextView v;
    public final TextView w;

    public yfd0(RelativeLayout relativeLayout, TextView textView, CalendarView calendarView, AppCompatImageView appCompatImageView, RelativeLayout relativeLayout2, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.a = relativeLayout;
        this.b = textView;
        this.c = calendarView;
        this.d = appCompatImageView;
        this.e = relativeLayout2;
        this.f = textView2;
        this.i = textView3;
        this.v = textView4;
        this.w = textView5;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
