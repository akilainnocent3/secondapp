package fr;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class q1<E> extends d<E> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final List<E> f85141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85143d;

    /* JADX WARN: Multi-variable type inference failed */
    public q1(@oy.l List<? extends E> list) {
        kotlin.jvm.internal.m0.p(list, "list");
        this.f85141b = list;
    }

    public final void d(int i10, int i11) {
        d.Companion.d(i10, i11, this.f85141b.size());
        this.f85142c = i10;
        this.f85143d = i11 - i10;
    }

    @Override // fr.d, java.util.List
    public E get(int i10) {
        d.Companion.b(i10, this.f85143d);
        return this.f85141b.get(this.f85142c + i10);
    }

    @Override // fr.d, fr.b
    public int getSize() {
        return this.f85143d;
    }
}
