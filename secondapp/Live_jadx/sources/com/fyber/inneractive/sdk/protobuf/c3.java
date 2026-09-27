package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47444a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f47445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f47446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e3 f47447d;

    public c3(e3 e3Var) {
        this.f47447d = e3Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f47444a + 1 >= this.f47447d.f47458b.size()) {
            if (this.f47447d.f47459c.isEmpty()) {
                return false;
            }
            if (this.f47446c == null) {
                this.f47446c = this.f47447d.f47459c.entrySet().iterator();
            }
            if (!this.f47446c.hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f47445b = true;
        int i10 = this.f47444a + 1;
        this.f47444a = i10;
        if (i10 < this.f47447d.f47458b.size()) {
            return (Map.Entry) this.f47447d.f47458b.get(this.f47444a);
        }
        if (this.f47446c == null) {
            this.f47446c = this.f47447d.f47459c.entrySet().iterator();
        }
        return (Map.Entry) this.f47446c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f47445b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f47445b = false;
        e3 e3Var = this.f47447d;
        int i10 = e3.f47456h;
        e3Var.a();
        if (this.f47444a >= this.f47447d.f47458b.size()) {
            if (this.f47446c == null) {
                this.f47446c = this.f47447d.f47459c.entrySet().iterator();
            }
            this.f47446c.remove();
            return;
        }
        e3 e3Var2 = this.f47447d;
        int i11 = this.f47444a;
        this.f47444a = i11 - 1;
        e3Var2.a();
        Object obj = ((b3) e3Var2.f47458b.remove(i11)).f47440b;
        if (e3Var2.f47459c.isEmpty()) {
            return;
        }
        Iterator it = e3Var2.c().entrySet().iterator();
        e3Var2.f47458b.add(new b3(e3Var2, (Map.Entry) it.next()));
        it.remove();
    }
}
