package com.startapp.sdk.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cj f75572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f75573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f75574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f75575f;

    public ti(int i10, int i11, cj cjVar, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f75570a = i10;
        this.f75571b = i11;
        this.f75572c = cjVar;
        this.f75573d = str;
        this.f75574e = arrayList;
        this.f75575f = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && ti.class == obj.getClass()) {
            ti tiVar = (ti) obj;
            if (this.f75570a == tiVar.f75570a && this.f75571b == tiVar.f75571b) {
                cj cjVar = this.f75572c;
                cj cjVar2 = tiVar.f75572c;
                WeakHashMap weakHashMap = si.f75514a;
                if (cjVar.equals(cjVar2) && si.a((Object) this.f75573d, (Object) tiVar.f75573d) && this.f75574e.equals(tiVar.f75574e) && this.f75575f.equals(tiVar.f75575f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.f75570a), Integer.valueOf(this.f75571b), this.f75572c, this.f75573d, this.f75574e, this.f75575f};
        WeakHashMap weakHashMap = si.f75514a;
        return Arrays.deepHashCode(objArr);
    }
}
