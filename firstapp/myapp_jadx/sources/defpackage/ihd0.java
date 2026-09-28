package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;

/* JADX INFO: loaded from: classes5.dex */
public final class ihd0 implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;
    public final Group d;
    public final TextView e;
    public final TextView f;
    public final TextView i;
    public final TextView v;
    public final TextView w;

    public ihd0(ConstraintLayout constraintLayout, TextView textView, TextView textView2, Group group, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = group;
        this.e = textView3;
        this.f = textView4;
        this.i = textView5;
        this.v = textView6;
        this.w = textView7;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
