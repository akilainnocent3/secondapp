package androidx.recyclerview.widget;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Runnable {
    public final /* synthetic */ r.c a;
    public final /* synthetic */ int b;
    public final /* synthetic */ r c;

    public s(r rVar, r.c cVar, int i) {
        this.c = rVar;
        this.a = cVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r.c cVar = this.a;
        RecyclerView.d0 d0Var = cVar.e;
        r rVar = this.c;
        RecyclerView recyclerView = rVar.r;
        if (recyclerView == null || !recyclerView.I || cVar.z || d0Var.getAbsoluteAdapterPosition() == -1) {
            return;
        }
        RecyclerView.l itemAnimator = rVar.r.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.k()) {
            ArrayList arrayList = rVar.p;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((r.f) arrayList.get(i)).A) {
                }
            }
            rVar.m.onSwiped(d0Var, this.b);
            return;
        }
        rVar.r.post(this);
    }
}
