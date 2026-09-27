package com.google.protobuf.kotlin;

import es.a;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class UnmodifiableSet<E> extends UnmodifiableCollection<E> implements Set<E>, a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnmodifiableSet(@l Collection<? extends E> delegate) {
        super(delegate);
        m0.p(delegate, "delegate");
    }
}
