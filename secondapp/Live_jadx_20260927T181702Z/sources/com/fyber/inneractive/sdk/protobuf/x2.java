package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class x2 extends d3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e3 f47622b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(e3 e3Var) {
        super(e3Var);
        this.f47622b = e3Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new w2(this.f47622b);
    }
}
