package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class hl40 extends RecyclerView.s {
    public final /* synthetic */ il40 a;

    public hl40(il40 il40Var) {
        this.a = il40Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void a(RecyclerView recyclerView, int i) {
        il40 il40Var = this.a;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            il40Var.a();
        } else {
            RecyclerView recyclerView2 = il40Var.a;
            gl40 gl40Var = il40Var.f;
            recyclerView2.removeCallbacks(gl40Var);
            recyclerView2.post(gl40Var);
        }
    }
}
