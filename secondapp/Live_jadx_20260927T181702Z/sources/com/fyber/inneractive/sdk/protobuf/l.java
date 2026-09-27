package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47514a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f47516c;

    public l(s sVar) {
        this.f47516c = sVar;
        this.f47515b = sVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47514a < this.f47515b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f47514a;
        if (i10 >= this.f47515b) {
            throw new NoSuchElementException();
        }
        this.f47514a = i10 + 1;
        return Byte.valueOf(this.f47516c.d(i10));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
