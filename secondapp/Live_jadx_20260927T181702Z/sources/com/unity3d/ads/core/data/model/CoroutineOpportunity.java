package com.unity3d.ads.core.data.model;

import com.google.protobuf.ByteString;
import ds.p;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import or.j;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class CoroutineOpportunity implements j.b {

    @l
    public static final Key Key = new Key(null);

    @l
    private final ByteString value;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Key implements j.c<CoroutineOpportunity> {
        public /* synthetic */ Key(x xVar) {
            this();
        }

        private Key() {
        }
    }

    public CoroutineOpportunity(@l ByteString value) {
        m0.p(value, "value");
        this.value = value;
    }

    @Override // or.j.b, or.j
    public <R> R fold(R r10, @l p<? super R, ? super j.b, ? extends R> pVar) {
        return (R) j.b.a.a(this, r10, pVar);
    }

    @Override // or.j.b, or.j
    @m
    public <E extends j.b> E get(@l j.c<E> cVar) {
        return (E) j.b.a.b(this, cVar);
    }

    @Override // or.j.b
    @l
    public j.c<?> getKey() {
        return Key;
    }

    @l
    public final ByteString getValue() {
        return this.value;
    }

    @Override // or.j.b, or.j
    @l
    public j minusKey(@l j.c<?> cVar) {
        return j.b.a.c(this, cVar);
    }

    @Override // or.j
    @l
    public j plus(@l j jVar) {
        return j.b.a.d(this, jVar);
    }
}
