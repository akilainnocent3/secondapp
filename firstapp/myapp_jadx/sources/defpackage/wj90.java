package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class wj90 extends RecyclerView.n {
    public final int a;

    public wj90(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        if (RecyclerView.P(view) == recyclerView.getAdapter().getItemCount() - 1) {
            rect.bottom = this.a;
        } else {
            rect.set(0, 0, 0, 0);
        }
    }
}
