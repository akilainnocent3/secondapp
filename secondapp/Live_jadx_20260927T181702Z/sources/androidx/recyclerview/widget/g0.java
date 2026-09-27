package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g0<T2> extends f0.b<T2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView.h<?> f18759b;

    public g0(@SuppressLint({"UnknownNullness", "MissingNullability"}) RecyclerView.h<?> hVar) {
        this.f18759b = hVar;
    }

    @Override // androidx.recyclerview.widget.f0.b
    public void e(int i10, int i11) {
        this.f18759b.notifyItemRangeChanged(i10, i11);
    }

    @Override // androidx.recyclerview.widget.f0.b, androidx.recyclerview.widget.v
    @SuppressLint({"UnknownNullness"})
    public void onChanged(int i10, int i11, Object obj) {
        this.f18759b.notifyItemRangeChanged(i10, i11, obj);
    }

    @Override // androidx.recyclerview.widget.v
    public void onInserted(int i10, int i11) {
        this.f18759b.notifyItemRangeInserted(i10, i11);
    }

    @Override // androidx.recyclerview.widget.v
    public void onMoved(int i10, int i11) {
        this.f18759b.notifyItemMoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.v
    public void onRemoved(int i10, int i11) {
        this.f18759b.notifyItemRangeRemoved(i10, i11);
    }
}
