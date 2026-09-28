package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sportybet.android.instantwin.presentation.widget.RoundTicketBetDetailReturnInfoLayout;

/* JADX INFO: loaded from: classes.dex */
public final class f5p implements g6i0 {
    public final RoundTicketBetDetailReturnInfoLayout a;
    public final LinearLayout b;
    public final TextView c;
    public final LinearLayout d;
    public final TextView e;
    public final TextView f;
    public final TextView i;
    public final LinearLayout v;
    public final TextView w;

    public f5p(RoundTicketBetDetailReturnInfoLayout roundTicketBetDetailReturnInfoLayout, LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, TextView textView2, TextView textView3, TextView textView4, LinearLayout linearLayout3, TextView textView5) {
        this.a = roundTicketBetDetailReturnInfoLayout;
        this.b = linearLayout;
        this.c = textView;
        this.d = linearLayout2;
        this.e = textView2;
        this.f = textView3;
        this.i = textView4;
        this.v = linearLayout3;
        this.w = textView5;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
