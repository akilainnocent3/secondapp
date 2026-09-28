package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class ame implements g6i0 {
    public final ConstraintLayout a;
    public final LinearLayout b;
    public final TextView c;
    public final FrameLayout d;
    public final RecyclerView e;

    public ame(ConstraintLayout constraintLayout, LinearLayout linearLayout, TextView textView, FrameLayout frameLayout, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = linearLayout;
        this.c = textView;
        this.d = frameLayout;
        this.e = recyclerView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
