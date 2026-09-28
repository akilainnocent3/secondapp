package androidx.recyclerview.widget;

import defpackage.nis;

/* JADX INFO: loaded from: classes.dex */
public final class b implements nis {
    public final RecyclerView.f a;

    public b(RecyclerView.f fVar) {
        this.a = fVar;
    }

    @Override // defpackage.nis
    public final void onChanged(int i, int i2, Object obj) {
        this.a.notifyItemRangeChanged(i, i2, obj);
    }

    @Override // defpackage.nis
    public final void onInserted(int i, int i2) {
        this.a.notifyItemRangeInserted(i, i2);
    }

    @Override // defpackage.nis
    public final void onMoved(int i, int i2) {
        this.a.notifyItemMoved(i, i2);
    }

    @Override // defpackage.nis
    public final void onRemoved(int i, int i2) {
        this.a.notifyItemRangeRemoved(i, i2);
    }
}
