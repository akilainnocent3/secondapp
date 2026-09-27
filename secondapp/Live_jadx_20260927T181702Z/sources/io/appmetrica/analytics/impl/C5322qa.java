package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5322qa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f98186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f98187b;

    public C5322qa() {
        this(false);
    }

    public final void a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f98186a.get(obj);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(obj2);
    }

    public final String toString() {
        return this.f98186a.toString();
    }

    public C5322qa(boolean z10) {
        this.f98186a = new HashMap();
        this.f98187b = z10;
    }
}
