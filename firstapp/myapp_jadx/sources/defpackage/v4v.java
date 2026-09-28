package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class v4v extends RecyclerView.s {
    public final /* synthetic */ y4v a;

    public v4v(y4v y4vVar) {
        this.a = y4vVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void b(RecyclerView recyclerView, int i, int i2) {
        b5v b5vVar;
        y4v y4vVar = this.a;
        if (y4vVar.C || (b5vVar = y4vVar.B) == null) {
            return;
        }
        b5vVar.C0(i, i2);
    }
}
