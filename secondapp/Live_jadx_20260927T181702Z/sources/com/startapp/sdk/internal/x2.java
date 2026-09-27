package com.startapp.sdk.internal;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class x2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f75812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f75814c;

    public x2(int i10, Object obj) {
        this.f75812a = obj;
        this.f75813b = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f75814c < this.f75813b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f75812a;
        int i10 = this.f75814c;
        this.f75814c = i10 + 1;
        return Array.get(obj, i10);
    }
}
