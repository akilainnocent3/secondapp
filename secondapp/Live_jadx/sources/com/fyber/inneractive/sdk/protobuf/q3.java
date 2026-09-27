package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class q3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f47551a;

    public q3(r3 r3Var) {
        this.f47551a = r3Var.f47558a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47551a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f47551a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
