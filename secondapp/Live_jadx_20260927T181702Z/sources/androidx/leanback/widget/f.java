package androidx.leanback.widget;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class f extends i1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Boolean f12474i = Boolean.FALSE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f12475j = "ArrayObjectAdapter";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<Object> f12476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<Object> f12477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<?> f12478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.v f12479h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends androidx.recyclerview.widget.k.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f12480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v f12481b;

        public a(List list, v vVar) {
            this.f12480a = list;
            this.f12481b = vVar;
        }

        @Override // androidx.recyclerview.widget.k.b
        public boolean areContentsTheSame(int i10, int i11) {
            return this.f12481b.a(f.this.f12477f.get(i10), this.f12480a.get(i11));
        }

        @Override // androidx.recyclerview.widget.k.b
        public boolean areItemsTheSame(int i10, int i11) {
            return this.f12481b.b(f.this.f12477f.get(i10), this.f12480a.get(i11));
        }

        @Override // androidx.recyclerview.widget.k.b
        public Object getChangePayload(int i10, int i11) {
            return this.f12481b.c(f.this.f12477f.get(i10), this.f12480a.get(i11));
        }

        @Override // androidx.recyclerview.widget.k.b
        public int getNewListSize() {
            return this.f12480a.size();
        }

        @Override // androidx.recyclerview.widget.k.b
        public int getOldListSize() {
            return f.this.f12477f.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements androidx.recyclerview.widget.v {
        public b() {
        }

        @Override // androidx.recyclerview.widget.v
        public void onChanged(int i10, int i11, Object obj) {
            if (f.f12474i.booleanValue()) {
                Log.d(f.f12475j, "onChanged");
            }
            f.this.k(i10, i11, obj);
        }

        @Override // androidx.recyclerview.widget.v
        public void onInserted(int i10, int i11) {
            if (f.f12474i.booleanValue()) {
                Log.d(f.f12475j, "onInserted");
            }
            f.this.l(i10, i11);
        }

        @Override // androidx.recyclerview.widget.v
        public void onMoved(int i10, int i11) {
            if (f.f12474i.booleanValue()) {
                Log.d(f.f12475j, "onMoved");
            }
            f.this.i(i10, i11);
        }

        @Override // androidx.recyclerview.widget.v
        public void onRemoved(int i10, int i11) {
            if (f.f12474i.booleanValue()) {
                Log.d(f.f12475j, "onRemoved");
            }
            f.this.m(i10, i11);
        }
    }

    public f(b2 b2Var) {
        super(b2Var);
        this.f12476e = new ArrayList();
        this.f12477f = new ArrayList();
    }

    public int A(Object obj) {
        return this.f12476e.indexOf(obj);
    }

    public void B(int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        this.f12476e.add(i11, this.f12476e.remove(i10));
        i(i10, i11);
    }

    public void C(int i10, int i11) {
        j(i10, i11);
    }

    public boolean D(Object obj) {
        int iIndexOf = this.f12476e.indexOf(obj);
        if (iIndexOf >= 0) {
            this.f12476e.remove(iIndexOf);
            m(iIndexOf, 1);
        }
        return iIndexOf >= 0;
    }

    public int E(int i10, int i11) {
        int iMin = Math.min(i11, this.f12476e.size() - i10);
        if (iMin <= 0) {
            return 0;
        }
        for (int i12 = 0; i12 < iMin; i12++) {
            this.f12476e.remove(i10);
        }
        m(i10, iMin);
        return iMin;
    }

    public void F(int i10, Object obj) {
        this.f12476e.set(i10, obj);
        j(i10, 1);
    }

    public void G(List list, v vVar) {
        if (vVar == null) {
            this.f12476e.clear();
            this.f12476e.addAll(list);
            h();
            return;
        }
        this.f12477f.clear();
        this.f12477f.addAll(this.f12476e);
        androidx.recyclerview.widget.k.e eVarB = androidx.recyclerview.widget.k.b(new a(list, vVar));
        this.f12476e.clear();
        this.f12476e.addAll(list);
        if (this.f12479h == null) {
            this.f12479h = new b();
        }
        eVarB.d(this.f12479h);
        this.f12477f.clear();
    }

    public <E> List<E> H() {
        if (this.f12478g == null) {
            this.f12478g = Collections.unmodifiableList(this.f12476e);
        }
        return (List<E>) this.f12478g;
    }

    @Override // androidx.leanback.widget.i1
    public Object a(int i10) {
        return this.f12476e.get(i10);
    }

    @Override // androidx.leanback.widget.i1
    public boolean g() {
        return true;
    }

    @Override // androidx.leanback.widget.i1
    public int s() {
        return this.f12476e.size();
    }

    public void w(int i10, Object obj) {
        this.f12476e.add(i10, obj);
        l(i10, 1);
    }

    public void x(Object obj) {
        w(this.f12476e.size(), obj);
    }

    public void y(int i10, Collection<?> collection) {
        int size = collection.size();
        if (size == 0) {
            return;
        }
        this.f12476e.addAll(i10, collection);
        l(i10, size);
    }

    public void z() {
        int size = this.f12476e.size();
        if (size == 0) {
            return;
        }
        this.f12476e.clear();
        m(0, size);
    }

    public f(a2 a2Var) {
        super(a2Var);
        this.f12476e = new ArrayList();
        this.f12477f = new ArrayList();
    }

    public f() {
        this.f12476e = new ArrayList();
        this.f12477f = new ArrayList();
    }
}
