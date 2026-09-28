package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ybq.android.spinkit.SpinKitView;

/* JADX INFO: loaded from: classes8.dex */
public final class pq80 implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final LinearLayout e;
    public final TextView f;
    public final SpinKitView i;
    public final LinearLayout v;
    public final RecyclerView w;
    public final ConstraintLayout y;
    public final TextView z;

    public pq80(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout, TextView textView4, SpinKitView spinKitView, LinearLayout linearLayout2, RecyclerView recyclerView, ConstraintLayout constraintLayout2, TextView textView5) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = linearLayout;
        this.f = textView4;
        this.i = spinKitView;
        this.v = linearLayout2;
        this.w = recyclerView;
        this.y = constraintLayout2;
        this.z = textView5;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
