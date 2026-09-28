package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.d0;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class bs60<VH extends RecyclerView.d0> extends RecyclerView.f<VH> {
    public RecyclerView a;

    public final void i() {
        RecyclerView recyclerView = this.a;
        if (recyclerView != null && (recyclerView.V() || recyclerView.getScrollState() != 0)) {
            recyclerView.post(new Runnable() { // from class: wr60
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.notifyDataSetChanged();
                }
            });
        } else {
            notifyDataSetChanged();
            Unit unit = Unit.a;
        }
    }

    public final void j(final int i) {
        RecyclerView recyclerView = this.a;
        if (recyclerView != null && (recyclerView.V() || recyclerView.getScrollState() != 0)) {
            recyclerView.post(new Runnable() { // from class: yr60
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.notifyItemChanged(i);
                }
            });
        } else {
            notifyItemChanged(i);
            Unit unit = Unit.a;
        }
    }

    public final void k(final int i, final int i2) {
        RecyclerView recyclerView = this.a;
        if (recyclerView != null && (recyclerView.V() || recyclerView.getScrollState() != 0)) {
            recyclerView.post(new Runnable() { // from class: xr60
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.notifyItemRangeInserted(i, i2);
                }
            });
        } else {
            notifyItemRangeInserted(i, i2);
            Unit unit = Unit.a;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        super.onAttachedToRecyclerView(recyclerView);
        this.a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        super.onDetachedFromRecyclerView(recyclerView);
        this.a = null;
    }
}
