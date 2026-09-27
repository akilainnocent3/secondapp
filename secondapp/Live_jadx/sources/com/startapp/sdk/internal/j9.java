package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryFilterConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class j9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f75035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f75036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f75037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f75038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f75039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f75040f;

    public j9(i9 i9Var) {
        ArrayList arrayList = i9Var.f74980a;
        WeakHashMap weakHashMap = si.f75514a;
        this.f75035a = arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
        ArrayList arrayList2 = i9Var.f74981b;
        this.f75036b = arrayList2 != null ? Collections.unmodifiableList(arrayList2) : Collections.EMPTY_LIST;
        List list = Collections.EMPTY_LIST;
        this.f75037c = list;
        this.f75038d = list;
        ArrayList arrayList3 = i9Var.f74982c;
        this.f75039e = arrayList3 != null ? Collections.unmodifiableList(arrayList3) : list;
        this.f75040f = Math.max(0L, si.f(i9Var.f74983d));
    }

    public j9(AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig) {
        List listE = analyticsCategoryFilterConfig.e();
        WeakHashMap weakHashMap = si.f75514a;
        this.f75035a = listE != null ? Collections.unmodifiableList(listE) : Collections.EMPTY_LIST;
        List listB = analyticsCategoryFilterConfig.b();
        this.f75036b = listB != null ? Collections.unmodifiableList(listB) : Collections.EMPTY_LIST;
        List listD = analyticsCategoryFilterConfig.d();
        this.f75037c = listD != null ? Collections.unmodifiableList(listD) : Collections.EMPTY_LIST;
        List listA = analyticsCategoryFilterConfig.a();
        this.f75038d = listA != null ? Collections.unmodifiableList(listA) : Collections.EMPTY_LIST;
        List listC = analyticsCategoryFilterConfig.c();
        this.f75039e = listC != null ? Collections.unmodifiableList(listC) : Collections.EMPTY_LIST;
        this.f75040f = Math.max(0L, si.f(analyticsCategoryFilterConfig.f()));
    }
}
