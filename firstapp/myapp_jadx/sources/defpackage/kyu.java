package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class kyu extends RecyclerView.s {
    public final /* synthetic */ lyu a;

    public kyu(lyu lyuVar) {
        this.a = lyuVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void b(RecyclerView recyclerView, int i, int i2) {
        nyu nyuVar;
        lyu lyuVar = this.a;
        if (lyuVar.A || (nyuVar = lyuVar.z) == null) {
            return;
        }
        nyuVar.M(i, i2);
    }
}
