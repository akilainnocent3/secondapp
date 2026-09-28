package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class aiw extends RecyclerView.n {
    public final int a;

    public aiw(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        rect.getClass();
        view.getClass();
        zVar.getClass();
        int i = this.a;
        rect.left = i;
        rect.right = i;
        int iP = RecyclerView.P(view);
        RecyclerView.f adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (iP == 0) {
            rect.left = 0;
        }
        if (iP == itemCount - 1) {
            rect.right = 0;
        }
    }
}
