package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class y2i0 extends RecyclerView.n {
    public final int a;
    public final int b;
    public final int c;

    public y2i0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        int i;
        rect.getClass();
        view.getClass();
        zVar.getClass();
        super.f(rect, view, recyclerView, zVar);
        rect.left = 0;
        rect.right = 0;
        rect.bottom = 0;
        int iP = RecyclerView.P(view);
        if (iP != 0) {
            rect.top = this.a;
        } else {
            int i2 = this.b;
            if (i2 > 0) {
                rect.top = i2;
            }
        }
        if (iP != zVar.b() - 1 || (i = this.c) <= 0) {
            return;
        }
        rect.bottom = i;
    }
}
