package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.d0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ixs<VH extends RecyclerView.d0> extends RecyclerView.f<VH> {
    public hxs a;

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        hxs hxsVar = this.a;
        hxsVar.getClass();
        return ((hxsVar instanceof hxs.b) || (hxsVar instanceof hxs.a)) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        this.a.getClass();
        return 0;
    }

    public abstract void i(VH vh, hxs hxsVar);

    public abstract b440 j(ViewGroup viewGroup, hxs hxsVar);

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(VH vh, int i) {
        vh.getClass();
        i(vh, this.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return j(viewGroup, this.a);
    }
}
