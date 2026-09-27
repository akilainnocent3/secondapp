package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5509xn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f98623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f98624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f98625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f98626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f98627f;

    public C5509xn(String str, int i10, long j10, String str2, Integer num, List list) {
        this.f98622a = str;
        this.f98623b = i10;
        this.f98624c = j10;
        this.f98625d = str2;
        this.f98626e = num;
        this.f98627f = list == null ? Collections.EMPTY_LIST : CollectionUtils.unmodifiableListCopy(list);
    }
}
