package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class mqz extends RecyclerView.h {
    public final /* synthetic */ w540 a;

    public mqz(w540 w540Var) {
        this.a = w540Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void d(int i, int i2) {
        w540 w540Var = this.a;
        if (w540Var.getStateRestorationPolicy() == RecyclerView.f.a.c && !w540Var.a) {
            w540Var.setStateRestorationPolicy(RecyclerView.f.a.a);
        }
        w540Var.unregisterAdapterDataObserver(this);
    }
}
