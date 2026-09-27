package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends AbstractList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f47483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f47484b;

    public i1(List list, h1 h1Var) {
        this.f47483a = list;
        this.f47484b = h1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        h1 h1Var = this.f47484b;
        Object obj = this.f47483a.get(i10);
        ((com.fyber.inneractive.sdk.bidder.j) h1Var).getClass();
        com.fyber.inneractive.sdk.bidder.l0 l0VarA = com.fyber.inneractive.sdk.bidder.l0.a(((Integer) obj).intValue());
        return l0VarA == null ? com.fyber.inneractive.sdk.bidder.l0.UNRECOGNIZED : l0VarA;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f47483a.size();
    }
}
