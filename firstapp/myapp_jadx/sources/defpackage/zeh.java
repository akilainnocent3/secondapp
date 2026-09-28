package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.sportybet.plugin.realsports.event.LiveTimerTextView;
import com.sportybet.plugin.realsports.widget.OutcomeView;

/* JADX INFO: loaded from: classes7.dex */
public final class zeh implements g6i0 {
    public final AppCompatImageView A;
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final TextView D;
    public final TextView E;
    public final LiveTimerTextView F;
    public final TextView G;
    public final OutcomeView H;
    public final OutcomeView I;
    public final OutcomeView J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final TextView O;
    public final ConstraintLayout a;
    public final View b;
    public final Group c;
    public final Group d;
    public final AppCompatImageView e;
    public final AppCompatImageView f;
    public final AppCompatImageView i;
    public final AppCompatImageView v;
    public final AppCompatImageView w;
    public final AppCompatImageView y;
    public final AppCompatImageView z;

    public zeh(ConstraintLayout constraintLayout, View view, Group group, Group group2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, AppCompatImageView appCompatImageView6, AppCompatImageView appCompatImageView7, AppCompatImageView appCompatImageView8, AppCompatImageView appCompatImageView9, AppCompatImageView appCompatImageView10, TextView textView, TextView textView2, LiveTimerTextView liveTimerTextView, TextView textView3, OutcomeView outcomeView, OutcomeView outcomeView2, OutcomeView outcomeView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.a = constraintLayout;
        this.b = view;
        this.c = group;
        this.d = group2;
        this.e = appCompatImageView;
        this.f = appCompatImageView2;
        this.i = appCompatImageView3;
        this.v = appCompatImageView4;
        this.w = appCompatImageView5;
        this.y = appCompatImageView6;
        this.z = appCompatImageView7;
        this.A = appCompatImageView8;
        this.B = appCompatImageView9;
        this.C = appCompatImageView10;
        this.D = textView;
        this.E = textView2;
        this.F = liveTimerTextView;
        this.G = textView3;
        this.H = outcomeView;
        this.I = outcomeView2;
        this.J = outcomeView3;
        this.K = textView4;
        this.L = textView5;
        this.M = textView6;
        this.N = textView7;
        this.O = textView8;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
