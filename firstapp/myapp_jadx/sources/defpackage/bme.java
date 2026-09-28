package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.widget.BubbleView;

/* JADX INFO: loaded from: classes6.dex */
public final class bme implements g6i0 {
    public final RecyclerView A;
    public final ConstraintLayout a;
    public final ConstraintLayout b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final Group f;
    public final TextView i;
    public final Group v;
    public final TextView w;
    public final FrameLayout y;
    public final BubbleView z;

    public bme(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3, Group group, TextView textView4, Group group2, TextView textView5, FrameLayout frameLayout, BubbleView bubbleView, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = group;
        this.i = textView4;
        this.v = group2;
        this.w = textView5;
        this.y = frameLayout;
        this.z = bubbleView;
        this.A = recyclerView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
