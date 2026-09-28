package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ybq.android.spinkit.SpinKitView;

/* JADX INFO: loaded from: classes7.dex */
public final class fw2 implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;
    public final RecyclerView c;
    public final CardView d;
    public final TextView e;
    public final ConstraintLayout f;
    public final TextView i;
    public final SpinKitView v;
    public final TextView w;
    public final TextView y;
    public final TextView z;

    public fw2(ConstraintLayout constraintLayout, TextView textView, RecyclerView recyclerView, CardView cardView, TextView textView2, ConstraintLayout constraintLayout2, TextView textView3, SpinKitView spinKitView, TextView textView4, TextView textView5, TextView textView6) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = recyclerView;
        this.d = cardView;
        this.e = textView2;
        this.f = constraintLayout2;
        this.i = textView3;
        this.v = spinKitView;
        this.w = textView4;
        this.y = textView5;
        this.z = textView6;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
