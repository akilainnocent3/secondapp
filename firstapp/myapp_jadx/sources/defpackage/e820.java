package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes7.dex */
public final class e820 implements g6i0 {
    public final AppCompatTextView A;
    public final AppCompatTextView B;
    public final AppCompatTextView C;
    public final SpinKitView D;
    public final ConstraintLayout E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;
    public final AppCompatTextView H;
    public final AppCompatTextView I;
    public final AppCompatTextView J;
    public final AppCompatTextView K;
    public final AppCompatTextView L;
    public final AppCompatTextView M;
    public final ConstraintLayout a;
    public final RecyclerView b;
    public final AppCompatTextView c;
    public final AppCompatTextView d;
    public final FloatingActionButton e;
    public final TextView f;
    public final LinearLayout i;
    public final AppCompatTextView v;
    public final AppCompatTextView w;
    public final AppCompatTextView y;
    public final AppCompatTextView z;

    public e820(ConstraintLayout constraintLayout, RecyclerView recyclerView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, FloatingActionButton floatingActionButton, TextView textView, LinearLayout linearLayout, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8, AppCompatTextView appCompatTextView9, SpinKitView spinKitView, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView10, AppCompatTextView appCompatTextView11, AppCompatTextView appCompatTextView12, AppCompatTextView appCompatTextView13, AppCompatTextView appCompatTextView14, AppCompatTextView appCompatTextView15, AppCompatTextView appCompatTextView16, AppCompatTextView appCompatTextView17) {
        this.a = constraintLayout;
        this.b = recyclerView;
        this.c = appCompatTextView;
        this.d = appCompatTextView2;
        this.e = floatingActionButton;
        this.f = textView;
        this.i = linearLayout;
        this.v = appCompatTextView3;
        this.w = appCompatTextView4;
        this.y = appCompatTextView5;
        this.z = appCompatTextView6;
        this.A = appCompatTextView7;
        this.B = appCompatTextView8;
        this.C = appCompatTextView9;
        this.D = spinKitView;
        this.E = constraintLayout2;
        this.F = appCompatTextView10;
        this.G = appCompatTextView11;
        this.H = appCompatTextView12;
        this.I = appCompatTextView13;
        this.J = appCompatTextView14;
        this.K = appCompatTextView15;
        this.L = appCompatTextView16;
        this.M = appCompatTextView17;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
