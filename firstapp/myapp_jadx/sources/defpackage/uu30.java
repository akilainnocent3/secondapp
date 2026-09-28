package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class uu30 extends RecyclerView.h {
    public final RecyclerView a;
    public final View b;

    public uu30(RecyclerView recyclerView, View view) {
        this.a = recyclerView;
        this.b = view;
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void a() {
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void d(int i, int i2) {
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void f(int i, int i2) {
        h();
    }

    public final void h() {
        RecyclerView recyclerView = this.a;
        RecyclerView.f adapter = recyclerView.getAdapter();
        boolean z = adapter != null && adapter.getItemCount() == 0;
        this.b.setVisibility(z ? 0 : 8);
        recyclerView.setVisibility(z ? 8 : 0);
    }
}
