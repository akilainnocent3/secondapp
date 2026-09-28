package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public final o0.b a;
    public final l0.b b;
    public final RecyclerView.f<RecyclerView.d0> c;
    public final b d;
    public int e;

    public class a extends RecyclerView.h {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void a() {
            y yVar = y.this;
            yVar.e = yVar.c.getItemCount();
            g gVar = (g) yVar.d;
            gVar.a.notifyDataSetChanged();
            gVar.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void b(int i, int i2) {
            y yVar = y.this;
            g gVar = (g) yVar.d;
            gVar.a.notifyItemRangeChanged(i + gVar.b(yVar), i2, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void c(int i, int i2, Object obj) {
            y yVar = y.this;
            g gVar = (g) yVar.d;
            gVar.a.notifyItemRangeChanged(i + gVar.b(yVar), i2, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void d(int i, int i2) {
            y yVar = y.this;
            yVar.e += i2;
            b bVar = yVar.d;
            g gVar = (g) bVar;
            gVar.a.notifyItemRangeInserted(i + gVar.b(yVar), i2);
            if (yVar.e <= 0 || yVar.c.getStateRestorationPolicy() != RecyclerView.f.a.b) {
                return;
            }
            ((g) bVar).a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void e(int i, int i2) {
            y yVar = y.this;
            g gVar = (g) yVar.d;
            int iB = gVar.b(yVar);
            gVar.a.notifyItemMoved(i + iB, i2 + iB);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void f(int i, int i2) {
            y yVar = y.this;
            yVar.e -= i2;
            b bVar = yVar.d;
            g gVar = (g) bVar;
            gVar.a.notifyItemRangeRemoved(i + gVar.b(yVar), i2);
            if (yVar.e >= 1 || yVar.c.getStateRestorationPolicy() != RecyclerView.f.a.b) {
                return;
            }
            ((g) bVar).a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void g() {
            ((g) y.this.d).a();
        }
    }

    public interface b {
    }

    public y(RecyclerView.f<RecyclerView.d0> fVar, b bVar, o0 o0Var, l0.b bVar2) {
        a aVar = new a();
        this.c = fVar;
        this.d = bVar;
        this.a = o0Var.b(this);
        this.b = bVar2;
        this.e = fVar.getItemCount();
        fVar.registerAdapterDataObserver(aVar);
    }
}
