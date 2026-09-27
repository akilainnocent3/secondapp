package com.startapp.sdk.internal;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f74980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f74981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f74982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f74983d;

    public final i9 a(String... strArr) {
        ArrayList arrayList = this.f74982c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f74982c = arrayList;
        }
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str);
            }
        }
        return this;
    }
}
