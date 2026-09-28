package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ybq.android.spinkit.SpinKitView;

/* JADX INFO: loaded from: classes7.dex */
public final class c2g0 implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;
    public final RecyclerView c;
    public final TextView d;
    public final TextView e;
    public final ConstraintLayout f;
    public final TextView i;
    public final SpinKitView v;
    public final TextView w;
    public final TextView y;
    public final TextView z;

    public c2g0(ConstraintLayout constraintLayout, TextView textView, RecyclerView recyclerView, TextView textView2, TextView textView3, ConstraintLayout constraintLayout2, TextView textView4, SpinKitView spinKitView, TextView textView5, TextView textView6, TextView textView7) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = recyclerView;
        this.d = textView2;
        this.e = textView3;
        this.f = constraintLayout2;
        this.i = textView4;
        this.v = spinKitView;
        this.w = textView5;
        this.y = textView6;
        this.z = textView7;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
