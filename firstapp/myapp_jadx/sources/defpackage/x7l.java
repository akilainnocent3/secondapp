package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a9l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class x7l<VH extends a9l> extends RecyclerView.f<VH> implements c8l {
    public final ArrayList a = new ArrayList();
    public final int b = 1;
    public e64 c;

    /* JADX INFO: loaded from: classes.dex */
    public class a implements nis {
        public a() {
        }

        @Override // defpackage.nis
        public final void onChanged(int i, int i2, Object obj) {
            x7l.this.notifyItemRangeChanged(i, i2, obj);
        }

        @Override // defpackage.nis
        public final void onInserted(int i, int i2) {
            x7l.this.notifyItemRangeInserted(i, i2);
        }

        @Override // defpackage.nis
        public final void onMoved(int i, int i2) {
            x7l.this.notifyItemMoved(i, i2);
        }

        @Override // defpackage.nis
        public final void onRemoved(int i, int i2) {
            x7l.this.notifyItemRangeRemoved(i, i2);
        }
    }

    public class b extends GridLayoutManager.b {
        public b() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public final int getSpanSize(int i) {
            x7l x7lVar = x7l.this;
            int i2 = x7lVar.b;
            try {
                x7lVar.n(i).getClass();
            } catch (IndexOutOfBoundsException unused) {
            }
            return i2;
        }
    }

    public x7l() {
        new a();
        new b();
    }

    @Override // defpackage.c8l
    public final void b(alx alxVar, int i, int i2) {
        notifyItemRangeInserted(m(alxVar) + i, i2);
    }

    @Override // defpackage.c8l
    public final void g(alx alxVar, int i, int i2) {
        notifyItemRangeRemoved(m(alxVar) + i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return j8l.a(this.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final long getItemId(int i) {
        return n(i).b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        e64 e64VarN = n(i);
        this.c = e64VarN;
        if (e64VarN != null) {
            return e64VarN.h();
        }
        b9p.a(hce0.a(i, "Invalid position "));
        return 0;
    }

    public final void i(w7l w7lVar) {
        if (w7lVar == null) {
            b9p.a("Group cannot be null");
            return;
        }
        ArrayList arrayList = this.a;
        int iA = j8l.a(arrayList);
        w7lVar.c(this);
        arrayList.add(w7lVar);
        notifyItemRangeInserted(iA, w7lVar.a());
    }

    public final void j(Collection<? extends w7l> collection) {
        if (collection.contains(null)) {
            b9p.a("List of groups can't contain null!");
            return;
        }
        ArrayList arrayList = this.a;
        int iA = j8l.a(arrayList);
        int iA2 = 0;
        for (w7l w7lVar : collection) {
            iA2 += w7lVar.a();
            w7lVar.c(this);
        }
        arrayList.addAll(collection);
        notifyItemRangeInserted(iA, iA2);
    }

    public final void k() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((w7l) obj).e(this);
        }
        arrayList.clear();
        notifyDataSetChanged();
    }

    public final int l(y2p y2pVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int iA = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            w7l w7lVar = (w7l) obj;
            int iD = w7lVar.d(y2pVar);
            if (iD >= 0) {
                return iD + iA;
            }
            iA += w7lVar.a();
        }
        return -1;
    }

    public final int m(alx alxVar) {
        ArrayList arrayList = this.a;
        int iIndexOf = arrayList.indexOf(alxVar);
        if (iIndexOf == -1) {
            return -1;
        }
        int iA = 0;
        for (int i = 0; i < iIndexOf; i++) {
            iA += ((w7l) arrayList.get(i)).a();
        }
        return iA;
    }

    public final e64 n(int i) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            w7l w7lVar = (w7l) obj;
            int iA = w7lVar.a() + i2;
            if (iA > i) {
                return w7lVar.getItem(i - i2);
            }
            i2 = iA;
        }
        mae0.a(n36.a("Wanted item at ", i, i2, " but there are only ", " items"));
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i, List list) {
        a9l a9lVar = (a9l) d0Var;
        e64 e64VarN = n(i);
        e64VarN.getClass();
        a9lVar.a = e64VarN;
        e64VarN.g(((b9l) a9lVar).b, i, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        e64 e64Var;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        e64 e64Var2 = this.c;
        if (e64Var2 == null || e64Var2.h() != i) {
            for (int i2 = 0; i2 < j8l.a(this.a); i2++) {
                e64 e64VarN = n(i2);
                if (e64VarN.h() == i) {
                    e64Var = e64VarN;
                }
            }
            ib5.a(hce0.a(i, "Could not find model for view type: "));
            return null;
        }
        e64Var = this.c;
        return new b9l(e64Var.i(layoutInflaterFrom.inflate(e64Var.h(), viewGroup, false)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final boolean onFailedToRecycleView(RecyclerView.d0 d0Var) {
        ((a9l) d0Var).a.getClass();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onViewAttachedToWindow(RecyclerView.d0 d0Var) {
        a9l a9lVar = (a9l) d0Var;
        super.onViewAttachedToWindow(a9lVar);
        a9lVar.a.getClass();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onViewDetachedFromWindow(RecyclerView.d0 d0Var) {
        a9l a9lVar = (a9l) d0Var;
        super.onViewDetachedFromWindow(a9lVar);
        a9lVar.a.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onViewRecycled(RecyclerView.d0 d0Var) {
        a9l a9lVar = (a9l) d0Var;
        a9lVar.a.j(a9lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
    }
}
