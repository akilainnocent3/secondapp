package com.startapp.sdk.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f75524d = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f75525a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f75526b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f75527c = new HashMap();

    public final synchronized void a(s sVar) {
        try {
            this.f75525a.add(0, sVar);
            List arrayList = (List) this.f75526b.get(sVar.f75479b);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f75526b.put(sVar.f75479b, arrayList);
            }
            arrayList.add(0, sVar);
            List arrayList2 = (List) this.f75527c.get(sVar.f75480c);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.f75527c.put(sVar.f75480c, arrayList2);
            }
            arrayList2.add(0, sVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
