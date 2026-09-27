package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class ht {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private int f2401;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<List<Field>> f2402;

    public ht() {
        ArrayList arrayList = new ArrayList();
        this.f2402 = arrayList;
        int i10 = (-1) + 1;
        this.f2401 = i10;
        arrayList.add(i10, new ArrayList());
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2300(Field field) {
        this.f2402.get(this.f2401).remove(field);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2301() {
        int i10 = this.f2401 + 1;
        this.f2401 = i10;
        this.f2402.add(i10, new ArrayList());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2302(Field field) {
        this.f2402.get(this.f2401).add(field);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2303() {
        this.f2402.remove(this.f2401);
        this.f2401--;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final List<List<Field>> m2299() {
        return this.f2402;
    }
}
