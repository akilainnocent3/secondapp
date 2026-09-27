package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class l1 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f47876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f47877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f47878c;

    public l1(k1 k1Var, Uri uri, List list) {
        this.f47876a = k1Var;
        this.f47877b = uri;
        this.f47878c = list;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f47876a.mPriority.compareTo(((l1) obj).f47876a.mPriority);
    }
}
