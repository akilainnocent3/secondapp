package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5509xn f96592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f96593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f96594c;

    public V(C5509xn c5509xn, ArrayList arrayList, String str) {
        this.f96592a = c5509xn;
        this.f96593b = arrayList == null ? Collections.EMPTY_LIST : CollectionUtils.unmodifiableListCopy(arrayList);
        this.f96594c = str;
    }
}
