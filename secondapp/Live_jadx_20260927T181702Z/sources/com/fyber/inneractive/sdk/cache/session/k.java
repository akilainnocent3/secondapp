package com.fyber.inneractive.sdk.cache.session;

import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends PriorityQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44244a;

    public k(int i10) {
        super(1, new l());
        this.f44244a = i10;
    }

    @Override // java.util.PriorityQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(g gVar) {
        boolean zAdd = super.add(gVar);
        if (super.size() > this.f44244a) {
            poll();
        }
        return zAdd;
    }
}
