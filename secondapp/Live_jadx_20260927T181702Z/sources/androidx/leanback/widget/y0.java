package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class y0 extends RecyclerView.h implements z {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f13138r = "ItemBridgeAdapter";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f13139s = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i1 f13140k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f13141l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b2 f13142m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b0 f13143n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f13144o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList<a2> f13145p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i1.b f13146q;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends i1.b {
        public a() {
        }

        @Override // androidx.leanback.widget.i1.b
        public void a() {
            y0.this.notifyDataSetChanged();
        }

        @Override // androidx.leanback.widget.i1.b
        public void b(int i10, int i11) {
            y0.this.notifyItemMoved(i10, i11);
        }

        @Override // androidx.leanback.widget.i1.b
        public void c(int i10, int i11) {
            y0.this.notifyItemRangeChanged(i10, i11);
        }

        @Override // androidx.leanback.widget.i1.b
        public void d(int i10, int i11, Object obj) {
            y0.this.notifyItemRangeChanged(i10, i11, obj);
        }

        @Override // androidx.leanback.widget.i1.b
        public void e(int i10, int i11) {
            y0.this.notifyItemRangeInserted(i10, i11);
        }

        @Override // androidx.leanback.widget.i1.b
        public void f(int i10, int i11) {
            y0.this.notifyItemRangeRemoved(i10, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View.OnFocusChangeListener f13148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f13149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b0 f13150d;

        public c(View.OnFocusChangeListener onFocusChangeListener, boolean z10, b0 b0Var) {
            this.f13148b = onFocusChangeListener;
            this.f13149c = z10;
            this.f13150d = b0Var;
        }

        public void a(boolean z10, b0 b0Var) {
            this.f13149c = z10;
            this.f13150d = b0Var;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            if (this.f13149c) {
                view = (View) view.getParent();
            }
            this.f13150d.a(view, z10);
            View.OnFocusChangeListener onFocusChangeListener = this.f13148b;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d extends RecyclerView.f0 implements y {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final a2 f13151l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final a2.a f13152m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f13153n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f13154o;

        public d(a2 a2Var, View view, a2.a aVar) {
            super(view);
            this.f13151l = a2Var;
            this.f13152m = aVar;
        }

        @Override // androidx.leanback.widget.y
        public Object a(Class<?> cls) {
            return this.f13152m.a(cls);
        }

        public final Object c() {
            return this.f13154o;
        }

        public final Object d() {
            return this.f13153n;
        }

        public final a2 e() {
            return this.f13151l;
        }

        public final a2.a f() {
            return this.f13152m;
        }

        public void g(Object obj) {
            this.f13154o = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class e {
        public abstract View a(View view);

        public abstract void b(View view, View view2);
    }

    public y0(i1 i1Var, b2 b2Var) {
        this.f13145p = new ArrayList<>();
        this.f13146q = new a();
        n(i1Var);
        this.f13142m = b2Var;
    }

    @Override // androidx.leanback.widget.z
    public y a(int i10) {
        return this.f13145p.get(i10);
    }

    public void e() {
        n(null);
    }

    public ArrayList<a2> f() {
        return this.f13145p;
    }

    public e g() {
        return this.f13141l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        i1 i1Var = this.f13140k;
        if (i1Var != null) {
            return i1Var.s();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        return this.f13140k.b(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        b2 b2VarD = this.f13142m;
        if (b2VarD == null) {
            b2VarD = this.f13140k.d();
        }
        a2 a2VarA = b2VarD.a(this.f13140k.a(i10));
        int iIndexOf = this.f13145p.indexOf(a2VarA);
        if (iIndexOf < 0) {
            this.f13145p.add(a2VarA);
            iIndexOf = this.f13145p.indexOf(a2VarA);
            h(a2VarA, iIndexOf);
            b bVar = this.f13144o;
            if (bVar != null) {
                bVar.a(a2VarA, iIndexOf);
            }
        }
        return iIndexOf;
    }

    public void n(i1 i1Var) {
        i1 i1Var2 = this.f13140k;
        if (i1Var == i1Var2) {
            return;
        }
        if (i1Var2 != null) {
            i1Var2.u(this.f13146q);
        }
        this.f13140k = i1Var;
        if (i1Var == null) {
            notifyDataSetChanged();
            return;
        }
        i1Var.p(this.f13146q);
        if (hasStableIds() != this.f13140k.f()) {
            setHasStableIds(this.f13140k.f());
        }
        notifyDataSetChanged();
    }

    public void o(b bVar) {
        this.f13144o = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i10) {
        d dVar = (d) f0Var;
        Object objA = this.f13140k.a(i10);
        dVar.f13153n = objA;
        dVar.f13151l.c(dVar.f13152m, objA);
        j(dVar);
        b bVar = this.f13144o;
        if (bVar != null) {
            bVar.c(dVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        a2.a aVarE;
        View viewA;
        a2 a2Var = this.f13145p.get(i10);
        e eVar = this.f13141l;
        if (eVar != null) {
            viewA = eVar.a(viewGroup);
            aVarE = a2Var.e(viewGroup);
            this.f13141l.b(viewA, aVarE.f12292a);
        } else {
            aVarE = a2Var.e(viewGroup);
            viewA = aVarE.f12292a;
        }
        d dVar = new d(a2Var, viewA, aVarE);
        k(dVar);
        b bVar = this.f13144o;
        if (bVar != null) {
            bVar.e(dVar);
        }
        View view = dVar.f13152m.f12292a;
        View.OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
        b0 b0Var = this.f13143n;
        if (b0Var == null) {
            if (onFocusChangeListener instanceof c) {
                view.setOnFocusChangeListener(((c) onFocusChangeListener).f13148b);
            }
            return dVar;
        }
        if (onFocusChangeListener instanceof c) {
            ((c) onFocusChangeListener).a(this.f13141l != null, b0Var);
        } else {
            view.setOnFocusChangeListener(new c(onFocusChangeListener, this.f13141l != null, b0Var));
        }
        this.f13143n.b(viewA);
        return dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final boolean onFailedToRecycleView(RecyclerView.f0 f0Var) {
        onViewRecycled(f0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onViewAttachedToWindow(RecyclerView.f0 f0Var) {
        d dVar = (d) f0Var;
        i(dVar);
        b bVar = this.f13144o;
        if (bVar != null) {
            bVar.b(dVar);
        }
        dVar.f13151l.g(dVar.f13152m);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onViewDetachedFromWindow(RecyclerView.f0 f0Var) {
        d dVar = (d) f0Var;
        dVar.f13151l.h(dVar.f13152m);
        l(dVar);
        b bVar = this.f13144o;
        if (bVar != null) {
            bVar.f(dVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onViewRecycled(RecyclerView.f0 f0Var) {
        d dVar = (d) f0Var;
        dVar.f13151l.f(dVar.f13152m);
        m(dVar);
        b bVar = this.f13144o;
        if (bVar != null) {
            bVar.g(dVar);
        }
        dVar.f13153n = null;
    }

    public void p(b0 b0Var) {
        this.f13143n = b0Var;
    }

    public void q(b2 b2Var) {
        this.f13142m = b2Var;
        notifyDataSetChanged();
    }

    public void r(ArrayList<a2> arrayList) {
        this.f13145p = arrayList;
    }

    public void s(e eVar) {
        this.f13141l = eVar;
    }

    public y0(i1 i1Var) {
        this(i1Var, null);
    }

    public y0() {
        this.f13145p = new ArrayList<>();
        this.f13146q = new a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i10, List list) {
        d dVar = (d) f0Var;
        Object objA = this.f13140k.a(i10);
        dVar.f13153n = objA;
        dVar.f13151l.d(dVar.f13152m, objA, list);
        j(dVar);
        b bVar = this.f13144o;
        if (bVar != null) {
            bVar.d(dVar, list);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {
        public void d(d dVar, List list) {
            c(dVar);
        }

        public void b(d dVar) {
        }

        public void c(d dVar) {
        }

        public void e(d dVar) {
        }

        public void f(d dVar) {
        }

        public void g(d dVar) {
        }

        public void a(a2 a2Var, int i10) {
        }
    }

    public void i(d dVar) {
    }

    public void j(d dVar) {
    }

    public void k(d dVar) {
    }

    public void l(d dVar) {
    }

    public void m(d dVar) {
    }

    public void h(a2 a2Var, int i10) {
    }
}
