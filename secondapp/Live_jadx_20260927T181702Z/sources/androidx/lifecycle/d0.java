package androidx.lifecycle;

import android.annotation.SuppressLint;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class d0 extends r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oy.l
    public static final a f13328j = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public v.a<a0, b> f13330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public r.b f13331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public final WeakReference<b0> f13332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.l
    public ArrayList<r.b> f13336i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.l
        @k.h1
        @cs.o
        public final d0 a(@oy.l b0 owner) {
            kotlin.jvm.internal.m0.p(owner, "owner");
            return new d0(owner, false, null);
        }

        @oy.l
        @cs.o
        public final r.b b(@oy.l r.b state1, @oy.m r.b bVar) {
            kotlin.jvm.internal.m0.p(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public r.b f13337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public x f13338b;

        public b(@oy.m a0 a0Var, @oy.l r.b initialState) {
            kotlin.jvm.internal.m0.p(initialState, "initialState");
            kotlin.jvm.internal.m0.m(a0Var);
            this.f13338b = h0.f(a0Var);
            this.f13337a = initialState;
        }

        public final void a(@oy.m b0 b0Var, @oy.l r.a event) {
            kotlin.jvm.internal.m0.p(event, "event");
            r.b bVarG = event.g();
            this.f13337a = d0.f13328j.b(this.f13337a, bVarG);
            x xVar = this.f13338b;
            kotlin.jvm.internal.m0.m(b0Var);
            xVar.onStateChanged(b0Var, event);
            this.f13337a = bVarG;
        }

        @oy.l
        public final x b() {
            return this.f13338b;
        }

        @oy.l
        public final r.b c() {
            return this.f13337a;
        }

        public final void d(@oy.l x xVar) {
            kotlin.jvm.internal.m0.p(xVar, "<set-?>");
            this.f13338b = xVar;
        }

        public final void e(@oy.l r.b bVar) {
            kotlin.jvm.internal.m0.p(bVar, "<set-?>");
            this.f13337a = bVar;
        }
    }

    public /* synthetic */ d0(b0 b0Var, boolean z10, kotlin.jvm.internal.x xVar) {
        this(b0Var, z10);
    }

    @oy.l
    @k.h1
    @cs.o
    public static final d0 c(@oy.l b0 b0Var) {
        return f13328j.a(b0Var);
    }

    @oy.l
    @cs.o
    public static final r.b j(@oy.l r.b bVar, @oy.m r.b bVar2) {
        return f13328j.b(bVar, bVar2);
    }

    public final void a(b0 b0Var) {
        Iterator<Map.Entry<a0, b>> itDescendingIterator = this.f13330c.descendingIterator();
        kotlin.jvm.internal.m0.o(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.f13335h) {
            Map.Entry<a0, b> next = itDescendingIterator.next();
            kotlin.jvm.internal.m0.o(next, "next()");
            a0 key = next.getKey();
            b value = next.getValue();
            while (value.c().compareTo(this.f13331d) > 0 && !this.f13335h && this.f13330c.contains(key)) {
                r.a aVarA = r.a.Companion.a(value.c());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + value.c());
                }
                m(aVarA.g());
                value.a(b0Var, aVarA);
                l();
            }
        }
    }

    @Override // androidx.lifecycle.r
    public void addObserver(@oy.l a0 observer) {
        b0 b0Var;
        kotlin.jvm.internal.m0.p(observer, "observer");
        d("addObserver");
        r.b bVar = this.f13331d;
        r.b bVar2 = r.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = r.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (this.f13330c.i(observer, bVar3) == null && (b0Var = this.f13332e.get()) != null) {
            boolean z10 = this.f13333f != 0 || this.f13334g;
            r.b bVarB = b(observer);
            this.f13333f++;
            while (bVar3.c().compareTo(bVarB) < 0 && this.f13330c.contains(observer)) {
                m(bVar3.c());
                r.a aVarC = r.a.Companion.c(bVar3.c());
                if (aVarC == null) {
                    throw new IllegalStateException("no event up from " + bVar3.c());
                }
                bVar3.a(b0Var, aVarC);
                l();
                bVarB = b(observer);
            }
            if (!z10) {
                o();
            }
            this.f13333f--;
        }
    }

    public final r.b b(a0 a0Var) {
        b value;
        Map.Entry<a0, b> entryL = this.f13330c.l(a0Var);
        r.b bVar = null;
        r.b bVarC = (entryL == null || (value = entryL.getValue()) == null) ? null : value.c();
        if (!this.f13336i.isEmpty()) {
            ArrayList<r.b> arrayList = this.f13336i;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        a aVar = f13328j;
        return aVar.b(aVar.b(this.f13331d, bVarC), bVar);
    }

    @SuppressLint({"RestrictedApi"})
    public final void d(String str) {
        if (!this.f13329b || u.c.h().c()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    public final void e(b0 b0Var) {
        v.b<a0, b>.d dVarF = this.f13330c.f();
        kotlin.jvm.internal.m0.o(dVarF, "observerMap.iteratorWithAdditions()");
        while (dVarF.hasNext() && !this.f13335h) {
            Map.Entry next = dVarF.next();
            a0 a0Var = (a0) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.c().compareTo(this.f13331d) < 0 && !this.f13335h && this.f13330c.contains(a0Var)) {
                m(bVar.c());
                r.a aVarC = r.a.Companion.c(bVar.c());
                if (aVarC == null) {
                    throw new IllegalStateException("no event up from " + bVar.c());
                }
                bVar.a(b0Var, aVarC);
                l();
            }
        }
    }

    public int f() {
        d("getObserverCount");
        return this.f13330c.size();
    }

    public void g(@oy.l r.a event) {
        kotlin.jvm.internal.m0.p(event, "event");
        d("handleLifecycleEvent");
        k(event.g());
    }

    @Override // androidx.lifecycle.r
    @oy.l
    public r.b getCurrentState() {
        return this.f13331d;
    }

    public final boolean h() {
        if (this.f13330c.size() == 0) {
            return true;
        }
        Map.Entry<a0, b> entryD = this.f13330c.d();
        kotlin.jvm.internal.m0.m(entryD);
        r.b bVarC = entryD.getValue().c();
        Map.Entry<a0, b> entryG = this.f13330c.g();
        kotlin.jvm.internal.m0.m(entryG);
        r.b bVarC2 = entryG.getValue().c();
        return bVarC == bVarC2 && this.f13331d == bVarC2;
    }

    @k.j0
    @dr.o(message = "Override [currentState].")
    public void i(@oy.l r.b state) {
        kotlin.jvm.internal.m0.p(state, "state");
        d("markState");
        n(state);
    }

    public final void k(r.b bVar) {
        r.b bVar2 = this.f13331d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == r.b.INITIALIZED && bVar == r.b.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.f13331d + " in component " + this.f13332e.get()).toString());
        }
        this.f13331d = bVar;
        if (this.f13334g || this.f13333f != 0) {
            this.f13335h = true;
            return;
        }
        this.f13334g = true;
        o();
        this.f13334g = false;
        if (this.f13331d == r.b.DESTROYED) {
            this.f13330c = new v.a<>();
        }
    }

    public final void l() {
        ArrayList<r.b> arrayList = this.f13336i;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void m(r.b bVar) {
        this.f13336i.add(bVar);
    }

    public void n(@oy.l r.b state) {
        kotlin.jvm.internal.m0.p(state, "state");
        d("setCurrentState");
        k(state);
    }

    public final void o() {
        b0 b0Var = this.f13332e.get();
        if (b0Var == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!h()) {
            this.f13335h = false;
            r.b bVar = this.f13331d;
            Map.Entry<a0, b> entryD = this.f13330c.d();
            kotlin.jvm.internal.m0.m(entryD);
            if (bVar.compareTo(entryD.getValue().c()) < 0) {
                a(b0Var);
            }
            Map.Entry<a0, b> entryG = this.f13330c.g();
            if (!this.f13335h && entryG != null && this.f13331d.compareTo(entryG.getValue().c()) > 0) {
                e(b0Var);
            }
        }
        this.f13335h = false;
    }

    @Override // androidx.lifecycle.r
    public void removeObserver(@oy.l a0 observer) {
        kotlin.jvm.internal.m0.p(observer, "observer");
        d("removeObserver");
        this.f13330c.j(observer);
    }

    public d0(b0 b0Var, boolean z10) {
        this.f13329b = z10;
        this.f13330c = new v.a<>();
        this.f13331d = r.b.INITIALIZED;
        this.f13336i = new ArrayList<>();
        this.f13332e = new WeakReference<>(b0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(@oy.l b0 provider) {
        this(provider, true);
        kotlin.jvm.internal.m0.p(provider, "provider");
    }
}
