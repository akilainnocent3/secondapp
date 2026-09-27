package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class w2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f47609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e3 f47610c;

    public w2(e3 e3Var) {
        this.f47610c = e3Var;
        this.f47608a = e3Var.f47458b.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f47608a;
        if (i10 > 0 && i10 <= this.f47610c.f47458b.size()) {
            return true;
        }
        if (this.f47609b == null) {
            this.f47609b = this.f47610c.f47462f.entrySet().iterator();
        }
        return this.f47609b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f47609b == null) {
            this.f47609b = this.f47610c.f47462f.entrySet().iterator();
        }
        if (this.f47609b.hasNext()) {
            if (this.f47609b == null) {
                this.f47609b = this.f47610c.f47462f.entrySet().iterator();
            }
            return (Map.Entry) this.f47609b.next();
        }
        List list = this.f47610c.f47458b;
        int i10 = this.f47608a - 1;
        this.f47608a = i10;
        return (Map.Entry) list.get(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
