package io.appmetrica.analytics.impl;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4936b7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J6 f97011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f97012b;

    public C4936b7(File file) {
        ArrayList arrayList = new ArrayList();
        this.f97012b = arrayList;
        if (file != null) {
            this.f97011a = new C5350re(file, new O6());
            arrayList.add(new C5350re(file, new C5175ke()));
        } else {
            this.f97011a = new K6(new O6());
        }
        arrayList.add(new K6(new C5175ke()));
    }
}
