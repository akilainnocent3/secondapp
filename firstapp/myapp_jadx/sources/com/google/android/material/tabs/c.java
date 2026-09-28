package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.ib5;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public final TabLayout a;
    public final ViewPager2 b;
    public final boolean c;
    public final boolean d;
    public final b e;
    public RecyclerView.f<?> f;
    public boolean g;
    public C0196c h;
    public d i;
    public a j;

    public class a extends RecyclerView.h {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void a() {
            c.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void b(int i, int i2) {
            c.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void c(int i, int i2, Object obj) {
            c.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void d(int i, int i2) {
            c.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void e(int i, int i2) {
            c.this.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void f(int i, int i2) {
            c.this.c();
        }
    }

    public interface b {
        void a(TabLayout.g gVar, int i);
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.c$c, reason: collision with other inner class name */
    public static class C0196c extends ViewPager2.g {
        public final WeakReference<TabLayout> a;
        public int c = 0;
        public int b = 0;

        public C0196c(TabLayout tabLayout) {
            this.a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void a(int i) {
            this.b = this.c;
            this.c = i;
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                tabLayout.n0 = this.c;
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void b(float f, int i, int i2) {
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                int i3 = this.c;
                boolean z = true;
                if (i3 == 2 && this.b != 1) {
                    z = false;
                }
                if (i3 == 2 && this.b == 0) {
                    z = false;
                }
                tabLayout.u(f, i, z, z, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void c(int i) {
            TabLayout tabLayout = this.a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.c;
            tabLayout.s(tabLayout.k(i), i2 == 0 || (i2 == 2 && this.b == 0));
        }
    }

    public static class d implements TabLayout.d {
        public final ViewPager2 a;
        public final boolean b;

        public d(ViewPager2 viewPager2, boolean z) {
            this.a = viewPager2;
            this.b = z;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void A0(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void G(TabLayout.g gVar) {
            this.a.setCurrentItem(gVar.e, this.b);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void g0(TabLayout.g gVar) {
        }
    }

    public c(TabLayout tabLayout, ViewPager2 viewPager2, boolean z, boolean z2, b bVar) {
        this.a = tabLayout;
        this.b = viewPager2;
        this.c = z;
        this.d = z2;
        this.e = bVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a() {
        if (this.g) {
            ib5.a("TabLayoutMediator is already attached");
            return;
        }
        ViewPager2 viewPager2 = this.b;
        RecyclerView.f adapter = viewPager2.getAdapter();
        this.f = adapter;
        if (adapter == null) {
            ib5.a("TabLayoutMediator attached before ViewPager2 has an adapter");
            return;
        }
        this.g = true;
        TabLayout tabLayout = this.a;
        C0196c c0196c = new C0196c(tabLayout);
        this.h = c0196c;
        viewPager2.c(c0196c);
        d dVar = new d(viewPager2, this.d);
        this.i = dVar;
        tabLayout.a(dVar);
        if (this.c) {
            a aVar = new a();
            this.j = aVar;
            this.f.registerAdapterDataObserver(aVar);
        }
        c();
        tabLayout.setScrollPosition(viewPager2.getCurrentItem(), 0.0f, true);
    }

    public final void b() {
        RecyclerView.f<?> fVar;
        if (this.g) {
            if (this.c && (fVar = this.f) != null) {
                fVar.unregisterAdapterDataObserver(this.j);
                this.j = null;
            }
            this.a.o(this.i);
            this.b.f(this.h);
            this.i = null;
            this.h = null;
            this.f = null;
            this.g = false;
        }
    }

    public final void c() {
        TabLayout tabLayout = this.a;
        tabLayout.n();
        RecyclerView.f<?> fVar = this.f;
        if (fVar != null) {
            int itemCount = fVar.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.g gVarL = tabLayout.l();
                this.e.a(gVarL, i);
                tabLayout.d(gVarL, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.b.getCurrentItem(), tabLayout.getTabCount() - 1);
                if (iMin != tabLayout.getSelectedTabPosition()) {
                    tabLayout.s(tabLayout.k(iMin), true);
                }
            }
        }
    }

    public c(TabLayout tabLayout, ViewPager2 viewPager2, b bVar) {
        this(tabLayout, viewPager2, true, true, bVar);
    }
}
