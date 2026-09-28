package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes7.dex */
public final class vo40 implements g6i0 {
    public final ConstraintLayout a;
    public final FloatingActionButton b;
    public final RecyclerView c;
    public final TextView d;

    public vo40(ConstraintLayout constraintLayout, FloatingActionButton floatingActionButton, RecyclerView recyclerView, TextView textView) {
        this.a = constraintLayout;
        this.b = floatingActionButton;
        this.c = recyclerView;
        this.d = textView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
