package com.cruxlab.sectionedrecyclerview.lib;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.sportybet.android.gp.tz.R;
import defpackage.b9p;
import defpackage.dy5;
import defpackage.f380;
import defpackage.fil;
import defpackage.g380;
import defpackage.g9i0;
import defpackage.hb5;
import defpackage.j3p;
import defpackage.k3p;
import defpackage.mae0;
import defpackage.n36;
import defpackage.r6i0;
import defpackage.zk1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final ArrayList<Integer> b;
    public final ArrayList<Short> c;
    public final SparseArray<com.cruxlab.sectionedrecyclerview.lib.c> d;
    public final SparseArray<i> e;
    public final SparseArray<Set<Short>> f;
    public C0186d g;
    public final c i;
    public short a = 1;
    public final a h = new a();

    public class a extends RecyclerView.f<j> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final int getItemCount() {
            return d.this.m();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final int getItemViewType(int i) {
            d dVar = d.this;
            int iC = dVar.c(i);
            short sShortValue = dVar.c.get(iC).shortValue();
            int iB = dVar.b(i);
            com.cruxlab.sectionedrecyclerview.lib.c cVar = dVar.d.get(sShortValue);
            boolean zA = cVar.a();
            com.cruxlab.sectionedrecyclerview.lib.b bVar = cVar.a;
            if (zA && dVar.j(iC) == i) {
                return bVar.c;
            }
            return (sShortValue << 16) + bVar.b(iB);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
            j jVar = (j) d0Var;
            int itemViewType = getItemViewType(i) >> 16;
            boolean z = itemViewType == 0;
            d dVar = d.this;
            SparseArray<com.cruxlab.sectionedrecyclerview.lib.c> sparseArray = dVar.d;
            if (z) {
                sparseArray.get(dVar.c.get(dVar.c(i)).shortValue()).a.i((com.cruxlab.sectionedrecyclerview.lib.a.AbstractC0185a) jVar.a);
            } else {
                sparseArray.get((short) itemViewType).a.f((com.cruxlab.sectionedrecyclerview.lib.a.b) jVar.a, dVar.b(i));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v16 */
        /* JADX WARN: Type inference failed for: r3v17 */
        /* JADX WARN: Type inference failed for: r3v4, types: [com.cruxlab.sectionedrecyclerview.lib.a$c] */
        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            ?? G;
            int i2 = i >> 16;
            boolean z = i2 == 0;
            d dVar = d.this;
            SparseArray<com.cruxlab.sectionedrecyclerview.lib.c> sparseArray = dVar.d;
            if (z) {
                G = sparseArray.get(dVar.f.get((short) i).iterator().next().shortValue()).a.j(viewGroup);
            } else {
                G = sparseArray.get((short) i2).a.g(viewGroup, (short) i);
            }
            return new j(G);
        }
    }

    public class b extends r.d {
        public b() {
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void clearView(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            if (d0Var.getAdapterPosition() < 0) {
                super.clearView(recyclerView, d0Var);
                return;
            }
            if (d.this.l(d0Var) != null) {
                com.cruxlab.sectionedrecyclerview.lib.a.b bVar = (com.cruxlab.sectionedrecyclerview.lib.a.b) ((j) d0Var).a;
                j3p defaultUIUtil = r.d.getDefaultUIUtil();
                View view = bVar.a;
                ((k3p) defaultUIUtil).getClass();
                Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
                if (tag instanceof Float) {
                    float fFloatValue = ((Float) tag).floatValue();
                    WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                    r6i0.d.l(view, fFloatValue);
                }
                view.setTag(R.id.item_touch_helper_previous_elevation, null);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
            }
        }

        @Override // androidx.recyclerview.widget.r.d
        public final int getMovementFlags(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            int iA;
            i iVarL;
            if ((d0Var.getItemViewType() >> 16) == 0 || (iVarL = d.this.l(d0Var)) == null) {
                iA = 0;
            } else {
                iA = iVarL.a();
            }
            return r.d.makeMovementFlags(0, iA);
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f, float f2, int i, boolean z) {
            if (d0Var.getAdapterPosition() < 0) {
                super.onChildDraw(canvas, recyclerView, d0Var, f, f2, i, z);
                return;
            }
            if (d.this.l(d0Var) != null) {
                com.cruxlab.sectionedrecyclerview.lib.a.b bVar = (com.cruxlab.sectionedrecyclerview.lib.a.b) ((j) d0Var).a;
                j3p defaultUIUtil = r.d.getDefaultUIUtil();
                View view = bVar.a;
                ((k3p) defaultUIUtil).getClass();
                if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                    WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                    Float fValueOf = Float.valueOf(r6i0.d.e(view));
                    int childCount = recyclerView.getChildCount();
                    float f3 = 0.0f;
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = recyclerView.getChildAt(i2);
                        if (childAt != view) {
                            WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
                            float fE = r6i0.d.e(childAt);
                            if (fE > f3) {
                                f3 = fE;
                            }
                        }
                    }
                    r6i0.d.l(view, f3 + 1.0f);
                    view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
                }
                view.setTranslationX(f);
                view.setTranslationY(f2);
            }
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f, float f2, int i, boolean z) {
            if (d0Var.getAdapterPosition() < 0) {
                super.onChildDrawOver(canvas, recyclerView, d0Var, f, f2, i, z);
            } else if (d.this.l(d0Var) != null) {
                com.cruxlab.sectionedrecyclerview.lib.a.b bVar = (com.cruxlab.sectionedrecyclerview.lib.a.b) ((j) d0Var).a;
                j3p defaultUIUtil = r.d.getDefaultUIUtil();
                View view = bVar.a;
                defaultUIUtil.getClass();
            }
        }

        @Override // androidx.recyclerview.widget.r.d
        public final boolean onMove(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            return false;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void onSelectedChanged(RecyclerView.d0 d0Var, int i) {
            if (d0Var == null) {
                return;
            }
            if (d0Var.getAdapterPosition() < 0) {
                super.onSelectedChanged(d0Var, i);
            } else {
                if (d.this.l(d0Var) == null || ((com.cruxlab.sectionedrecyclerview.lib.a.b) ((j) d0Var).a) == null) {
                    return;
                }
                r.d.getDefaultUIUtil().getClass();
            }
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void onSwiped(RecyclerView.d0 d0Var, int i) {
            i iVarL = d.this.l(d0Var);
            if (iVarL != null) {
                iVarL.b();
            }
        }
    }

    public class c {
        public c() {
        }
    }

    /* JADX INFO: renamed from: com.cruxlab.sectionedrecyclerview.lib.d$d, reason: collision with other inner class name */
    public class C0186d {
        public final fil c;
        public short a = 0;
        public short b = -1;
        public final SparseArray<com.cruxlab.sectionedrecyclerview.lib.a.AbstractC0185a> d = new SparseArray<>();

        public C0186d(SectionHeaderLayout.a aVar) {
            this.c = aVar;
        }

        public final void a() {
            SectionHeaderLayout sectionHeaderLayout = SectionHeaderLayout.this;
            int i = SectionHeaderLayout.e;
            RecyclerView recyclerView = sectionHeaderLayout.a;
            recyclerView.getViewTreeObserver().addOnPreDrawListener(new g380(recyclerView, new f380(sectionHeaderLayout, 0)));
        }

        public final void b() {
            fil filVar = this.c;
            SectionHeaderLayout.a aVar = (SectionHeaderLayout.a) filVar;
            int iF1 = ((LinearLayoutManager) SectionHeaderLayout.this.a.getLayoutManager()).f1();
            d dVar = d.this;
            int iM = dVar.m();
            SparseArray<com.cruxlab.sectionedrecyclerview.lib.c> sparseArray = dVar.d;
            ArrayList<Short> arrayList = dVar.c;
            if (!d.d(iF1, iM)) {
                if (this.a != 0) {
                    SectionHeaderLayout.a aVar2 = (SectionHeaderLayout.a) filVar;
                    SectionHeaderLayout sectionHeaderLayout = SectionHeaderLayout.this;
                    if (sectionHeaderLayout.getChildCount() > 1) {
                        sectionHeaderLayout.post(new g(aVar2));
                    }
                    this.a = (short) 0;
                    this.b = (short) -1;
                    return;
                }
                return;
            }
            int iC = dVar.c(iF1);
            short sShortValue = arrayList.get(iC).shortValue();
            com.cruxlab.sectionedrecyclerview.lib.c cVar = sparseArray.get(sShortValue);
            if (!cVar.a()) {
                if (this.a != 0) {
                    SectionHeaderLayout.a aVar3 = (SectionHeaderLayout.a) filVar;
                    SectionHeaderLayout sectionHeaderLayout2 = SectionHeaderLayout.this;
                    if (sectionHeaderLayout2.getChildCount() > 1) {
                        sectionHeaderLayout2.post(new g(aVar3));
                    }
                    this.a = (short) 0;
                    this.b = (short) -1;
                    return;
                }
                return;
            }
            com.cruxlab.sectionedrecyclerview.lib.b bVar = cVar.a;
            if (sShortValue == this.a) {
                int iJ = dVar.j(iC + 1);
                SectionHeaderLayout sectionHeaderLayout3 = SectionHeaderLayout.this;
                if (sectionHeaderLayout3.getChildCount() > 1) {
                    View childAt = sectionHeaderLayout3.getChildAt(sectionHeaderLayout3.getChildCount() - 1);
                    h hVar = new h(aVar, childAt, iJ);
                    int i = SectionHeaderLayout.e;
                    childAt.getViewTreeObserver().addOnPreDrawListener(new g380(childAt, hVar));
                    return;
                }
                return;
            }
            if (bVar.c == this.b) {
                this.a = sShortValue;
                com.cruxlab.sectionedrecyclerview.lib.a.AbstractC0185a abstractC0185aC = c(sShortValue);
                com.cruxlab.sectionedrecyclerview.lib.c cVar2 = dVar.d.get(sShortValue);
                abstractC0185aC.getClass();
                cVar2.a.i(abstractC0185aC);
                int iJ2 = dVar.j(iC + 1);
                SectionHeaderLayout sectionHeaderLayout4 = SectionHeaderLayout.this;
                if (sectionHeaderLayout4.getChildCount() > 1) {
                    View childAt2 = sectionHeaderLayout4.getChildAt(sectionHeaderLayout4.getChildCount() - 1);
                    h hVar2 = new h(aVar, childAt2, iJ2);
                    int i2 = SectionHeaderLayout.e;
                    childAt2.getViewTreeObserver().addOnPreDrawListener(new g380(childAt2, hVar2));
                    return;
                }
                return;
            }
            short sShortValue2 = arrayList.get(iC).shortValue();
            this.a = sShortValue2;
            com.cruxlab.sectionedrecyclerview.lib.c cVar3 = sparseArray.get(sShortValue2);
            this.b = cVar3.a.c;
            com.cruxlab.sectionedrecyclerview.lib.a.AbstractC0185a abstractC0185aC2 = c(this.a);
            abstractC0185aC2.getClass();
            cVar3.a.i(abstractC0185aC2);
            int iJ3 = dVar.j(iC + 1);
            View view = abstractC0185aC2.a;
            aVar.getClass();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(view.getLayoutParams());
            layoutParams.addRule(6);
            view.setLayoutParams(layoutParams);
            view.getViewTreeObserver().addOnPreDrawListener(new g380(view, new e(aVar, view, iJ3)));
            SectionHeaderLayout.this.post(new f(aVar, view));
        }

        public final com.cruxlab.sectionedrecyclerview.lib.a.AbstractC0185a c(short s) {
            com.cruxlab.sectionedrecyclerview.lib.c cVar = d.this.d.get(s);
            short s2 = cVar.a.c;
            if (s2 == -1) {
                return null;
            }
            SparseArray<com.cruxlab.sectionedrecyclerview.lib.a.AbstractC0185a> sparseArray = this.d;
            com.cruxlab.sectionedrecyclerview.lib.a.AbstractC0185a abstractC0185a = sparseArray.get(s2);
            if (abstractC0185a != null) {
                return abstractC0185a;
            }
            com.cruxlab.sectionedrecyclerview.lib.a.AbstractC0185a abstractC0185aJ = cVar.a.j(SectionHeaderLayout.this);
            sparseArray.put(s2, abstractC0185aJ);
            return abstractC0185aJ;
        }
    }

    public d() {
        new b();
        this.i = new c();
        this.b = new ArrayList<>();
        this.c = new ArrayList<>();
        this.d = new SparseArray<>();
        this.e = new SparseArray<>();
        this.f = new SparseArray<>();
    }

    public static boolean d(int i, int i2) {
        return i >= 0 && i < i2;
    }

    public final void a(com.cruxlab.sectionedrecyclerview.lib.b bVar, short s) {
        if (s == -1) {
            hb5.a("Header type cannot be equal to NO_HEADER_TYPE that is -1.");
            return;
        }
        short s2 = this.a;
        HashSet hashSet = new HashSet();
        SparseArray<Set<Short>> sparseArray = this.f;
        Set<Short> set = sparseArray.get(s, hashSet);
        set.add(Short.valueOf(s2));
        sparseArray.put(s, set);
        SparseArray<com.cruxlab.sectionedrecyclerview.lib.c> sparseArray2 = this.d;
        int size = sparseArray2.size();
        com.cruxlab.sectionedrecyclerview.lib.c cVar = new com.cruxlab.sectionedrecyclerview.lib.c(bVar, s);
        if (this.a < 0) {
            b9p.a("Exceeded number of created sections, so there is no available section type.");
            return;
        }
        f(size, true);
        bVar.a = size;
        bVar.b = this.i;
        int iJ = j(size);
        int iA = (cVar.a() ? 1 : 0) + bVar.a();
        ArrayList<Integer> arrayList = this.b;
        int iIntValue = size > 0 ? arrayList.get(size - 1).intValue() : 0;
        sparseArray2.put(this.a, cVar);
        this.c.add(size, Short.valueOf(this.a));
        arrayList.add(size, Integer.valueOf(iIntValue + iA));
        this.a = (short) (this.a + 1);
        n(size + 1, iA, true);
        this.h.notifyItemRangeInserted(iJ, iA);
        C0186d c0186d = this.g;
        if (c0186d != null) {
            c0186d.a();
        }
    }

    public final int b(int i) {
        int iIntValue;
        if (!d(i, m())) {
            return -1;
        }
        int iC = c(i);
        com.cruxlab.sectionedrecyclerview.lib.c cVar = this.d.get(this.c.get(iC).shortValue());
        if (iC > 0) {
            iIntValue = this.b.get(iC - 1).intValue();
        } else {
            iIntValue = 0;
        }
        return (i - iIntValue) - (cVar.a() ? 1 : 0);
    }

    public final int c(int i) {
        if (!d(i, m())) {
            return -1;
        }
        ArrayList<Integer> arrayList = this.b;
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 != size) {
            if (i2 + 1 == size) {
                if (i >= arrayList.get(i2).intValue()) {
                    return i < arrayList.get(size).intValue() ? size : size + 1;
                }
                return i2;
            }
            int i3 = (i2 + size) / 2;
            if (i < arrayList.get(i3).intValue()) {
                size = i3;
            } else {
                i2 = i3 + 1;
            }
        }
        if (i >= arrayList.get(i2).intValue()) {
            return i2 + 1;
        }
        return i2;
    }

    public final void e(int i, int i2, int i3) {
        int iK = k(i);
        if (d((i2 + i3) - 1, iK)) {
            return;
        }
        mae0.a(zk1.a(iK, ".", dy5.a("Position count ", i3, i2, " starting from position ", " is out of range. Current item count is ")));
    }

    public final void f(int i, boolean z) {
        int size = this.d.size();
        if (d(i, (z ? 1 : 0) + size)) {
            return;
        }
        mae0.a(n36.a("Section index ", i, size, " is out of range. Current section count is ", "."));
    }

    public final void g(int i, int i2) {
        com.cruxlab.sectionedrecyclerview.lib.c cVar = this.d.get(this.c.get(i).shortValue());
        int iK = k(i) + i2;
        int iA = cVar.a.a();
        if (iK == iA) {
            return;
        }
        b9p.a(n36.a("Inconsistency detected. Section item count should be ", iK, iA, ", but BaseSectionAdapter returned ", "."));
    }

    public final void h(int i, int i2, boolean z) {
        int iK = k(i);
        if (d(i2, (z ? 1 : 0) + iK)) {
            return;
        }
        mae0.a(zk1.a(iK, ".", dy5.a("Item position ", i2, i, " in section ", " is out of range. Current section item count is ")));
    }

    public final int i(int i, int i2) {
        int iIntValue = 0;
        f(i, false);
        com.cruxlab.sectionedrecyclerview.lib.c cVar = this.d.get(this.c.get(i).shortValue());
        if (i > 0) {
            iIntValue = this.b.get(i - 1).intValue();
        }
        return (cVar.a() ? 1 : 0) + iIntValue + i2;
    }

    public final int j(int i) {
        f(i, true);
        if (i > 0) {
            return this.b.get(i - 1).intValue();
        }
        return 0;
    }

    public final int k(int i) {
        com.cruxlab.sectionedrecyclerview.lib.c cVar = this.d.get(this.c.get(i).shortValue());
        f(i, false);
        ArrayList<Integer> arrayList = this.b;
        return (arrayList.get(i).intValue() - (i > 0 ? arrayList.get(i - 1).intValue() : 0)) - (cVar.a() ? 1 : 0);
    }

    public final i l(RecyclerView.d0 d0Var) {
        int adapterPosition = d0Var.getAdapterPosition();
        if (!d(adapterPosition, m())) {
            return null;
        }
        return this.e.get(this.c.get(c(adapterPosition)).shortValue());
    }

    public final int m() {
        SparseArray<com.cruxlab.sectionedrecyclerview.lib.c> sparseArray = this.d;
        if (sparseArray.size() <= 0) {
            return 0;
        }
        return this.b.get(sparseArray.size() - 1).intValue();
    }

    public final void n(int i, int i2, boolean z) {
        while (true) {
            SparseArray<com.cruxlab.sectionedrecyclerview.lib.c> sparseArray = this.d;
            if (i >= sparseArray.size()) {
                return;
            }
            if (z) {
                sparseArray.get(this.c.get(i).shortValue()).a.a = i;
            }
            ArrayList<Integer> arrayList = this.b;
            arrayList.set(i, Integer.valueOf(arrayList.get(i).intValue() + i2));
            i++;
        }
    }
}
