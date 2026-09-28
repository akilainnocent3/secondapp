package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class dor extends RecyclerView.n {
    public final int a;

    public dor(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        rect.getClass();
        view.getClass();
        zVar.getClass();
        super.f(rect, view, recyclerView, zVar);
        if (RecyclerView.P(view) == zVar.b() - 1) {
            rect.set(0, 0, 0, this.a);
        }
    }
}
