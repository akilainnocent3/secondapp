package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes8.dex */
public final class ft80 implements g6i0 {
    public final AppCompatTextView A;
    public final AppCompatTextView B;
    public final SpinKitView C;
    public final ConstraintLayout D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;
    public final AppCompatTextView H;
    public final AppCompatTextView I;
    public final AppCompatTextView J;
    public final AppCompatTextView K;
    public final AppCompatTextView L;
    public final ConstraintLayout a;
    public final RecyclerView b;
    public final AppCompatTextView c;
    public final AppCompatTextView d;
    public final FloatingActionButton e;
    public final TextView f;
    public final AppCompatTextView i;
    public final AppCompatTextView v;
    public final AppCompatTextView w;
    public final AppCompatTextView y;
    public final AppCompatTextView z;

    public ft80(ConstraintLayout constraintLayout, RecyclerView recyclerView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, FloatingActionButton floatingActionButton, TextView textView, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8, AppCompatTextView appCompatTextView9, SpinKitView spinKitView, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView10, AppCompatTextView appCompatTextView11, AppCompatTextView appCompatTextView12, AppCompatTextView appCompatTextView13, AppCompatTextView appCompatTextView14, AppCompatTextView appCompatTextView15, AppCompatTextView appCompatTextView16, AppCompatTextView appCompatTextView17) {
        this.a = constraintLayout;
        this.b = recyclerView;
        this.c = appCompatTextView;
        this.d = appCompatTextView2;
        this.e = floatingActionButton;
        this.f = textView;
        this.i = appCompatTextView3;
        this.v = appCompatTextView4;
        this.w = appCompatTextView5;
        this.y = appCompatTextView6;
        this.z = appCompatTextView7;
        this.A = appCompatTextView8;
        this.B = appCompatTextView9;
        this.C = spinKitView;
        this.D = constraintLayout2;
        this.E = appCompatTextView10;
        this.F = appCompatTextView11;
        this.G = appCompatTextView12;
        this.H = appCompatTextView13;
        this.I = appCompatTextView14;
        this.J = appCompatTextView15;
        this.K = appCompatTextView16;
        this.L = appCompatTextView17;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
