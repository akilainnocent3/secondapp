package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class el40 extends RecyclerView.n {
    public final int a;
    public final int b;
    public final int c = 3;

    public el40(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        int iP = RecyclerView.P(view);
        int i = this.c;
        int i2 = iP % i;
        int i3 = this.a;
        rect.left = (i2 * i3) / i;
        rect.right = i3 - (((i2 + 1) * i3) / i);
        rect.bottom = this.b;
    }
}
