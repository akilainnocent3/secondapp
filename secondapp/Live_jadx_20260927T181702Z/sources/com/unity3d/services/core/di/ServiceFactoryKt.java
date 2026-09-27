package com.unity3d.services.core.di;

import dr.i0;
import ds.a;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ServiceFactoryKt {
    @l
    public static final <T> i0<T> factoryOf(@l a<? extends T> initializer) {
        m0.p(initializer, "initializer");
        return new Factory(initializer);
    }
}
