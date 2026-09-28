package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class i0 extends RecyclerView.l {
    public boolean g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean a(RecyclerView.d0 d0Var, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i;
        int i2;
        if (bVar != null && ((i = bVar.a) != (i2 = bVar2.a) || bVar.b != bVar2.b)) {
            return o(d0Var, i, bVar.b, i2, bVar2.b);
        }
        m(d0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean b(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i;
        int i2 = bVar.a;
        int i3 = bVar.b;
        if (d0Var2.shouldIgnore()) {
            i = bVar.a;
        } else {
            i = bVar2.a;
            bVar = bVar2;
        }
        return n(d0Var, d0Var2, i2, i3, i, bVar.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean c(RecyclerView.d0 d0Var, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i = bVar.a;
        int i2 = bVar.b;
        View view = d0Var.itemView;
        int left = bVar2 == null ? view.getLeft() : bVar2.a;
        int top = bVar2 == null ? view.getTop() : bVar2.b;
        if (d0Var.isRemoved() || (i == left && i2 == top)) {
            p(d0Var);
            return true;
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return o(d0Var, i, i2, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean d(RecyclerView.d0 d0Var, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i = bVar.a;
        int i2 = bVar2.a;
        if (i != i2 || bVar.b != bVar2.b) {
            return o(d0Var, i, bVar.b, i2, bVar2.b);
        }
        h(d0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean f(RecyclerView.d0 d0Var) {
        return !this.g || d0Var.isInvalid();
    }

    public abstract void m(RecyclerView.d0 d0Var);

    public abstract boolean n(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i, int i2, int i3, int i4);

    public abstract boolean o(RecyclerView.d0 d0Var, int i, int i2, int i3, int i4);

    public abstract void p(RecyclerView.d0 d0Var);
}
