package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class W8 extends X8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f96670a;

    public W8(List<Object> list) {
        this.f96670a = CollectionUtils.unmodifiableListCopy(list);
    }

    public final List<Object> a() {
        return this.f96670a;
    }
}
