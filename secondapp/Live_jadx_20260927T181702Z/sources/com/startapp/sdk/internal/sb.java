package com.startapp.sdk.internal;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class sb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f75499a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ib f75500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ib f75501c;

    public sb(ib ibVar, ib ibVar2) {
        this.f75500b = ibVar;
        this.f75501c = ibVar2;
    }

    public final rb a(String str) {
        if (this.f75499a.containsKey(str)) {
            return (rb) this.f75499a.get(str);
        }
        rb rbVar = new rb(new a9(this.f75500b, this.f75501c));
        this.f75499a.put(str, rbVar);
        return rbVar;
    }
}
