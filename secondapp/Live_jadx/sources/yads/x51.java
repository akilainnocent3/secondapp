package yads;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class x51 implements jx0, vh3, d61, uu1, nn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f157683a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f157684b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f157685c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f157686d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f157687e = new LinkedHashSet();

    public final void a(jx0 jx0Var) {
        this.f157683a.add(jx0Var);
    }

    @Override // yads.uu1
    public final void b() {
        Iterator it = this.f157687e.iterator();
        while (it.hasNext()) {
            ((uu1) it.next()).b();
        }
    }

    @Override // yads.d61
    public final void c() {
        Iterator it = this.f157686d.iterator();
        while (it.hasNext()) {
            ((d61) it.next()).c();
        }
    }

    @Override // yads.vh3
    public final void d() {
        Iterator it = this.f157684b.iterator();
        while (it.hasNext()) {
            ((vh3) it.next()).d();
        }
    }

    @Override // yads.uu1
    public final void e() {
        Iterator it = this.f157687e.iterator();
        while (it.hasNext()) {
            ((uu1) it.next()).e();
        }
    }

    @Override // yads.nn2
    public final void f() {
        Iterator it = this.f157685c.iterator();
        while (it.hasNext()) {
            ((nn2) it.next()).f();
        }
    }

    @Override // yads.d61
    public final void g() {
        Iterator it = this.f157686d.iterator();
        while (it.hasNext()) {
            ((d61) it.next()).g();
        }
    }

    @Override // yads.vh3
    public final void h() {
        Iterator it = this.f157684b.iterator();
        while (it.hasNext()) {
            ((vh3) it.next()).h();
        }
    }

    @Override // yads.jx0
    public final void a() {
        Iterator it = this.f157683a.iterator();
        while (it.hasNext()) {
            ((jx0) it.next()).a();
        }
    }
}
