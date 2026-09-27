package com.yandex.div.core.util;

import f0.m3;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class SparseArraysKt {
    @l
    public static final <T> Iterable<T> toIterable(@l m3<T> m3Var) {
        return new SparseArrayIterable(m3Var);
    }
}
