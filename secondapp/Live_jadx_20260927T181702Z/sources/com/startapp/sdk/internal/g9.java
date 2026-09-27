package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryConfig;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryFilterConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f74864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f74865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f74866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f74867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f74868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f74869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f74870g;

    public g9(f9 f9Var) {
        this.f74864a = f9Var.f74792a;
        this.f74865b = f9Var.f74793b;
        this.f74866c = f9Var.f74794c;
        this.f74867d = f9Var.f74795d;
        this.f74868e = Math.max(60000L, si.f(f9Var.f74796e));
        this.f74869f = Math.max(0L, si.f(f9Var.f74797f));
        ArrayList arrayList = f9Var.f74798g;
        this.f74870g = arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public g9(g9 g9Var, AnalyticsCategoryConfig analyticsCategoryConfig) {
        long jMax;
        long jMax2;
        Double dValueOf = Double.valueOf(g9Var.f74864a);
        Double dA = analyticsCategoryConfig.a();
        this.f74864a = (dA != null ? dA : dValueOf).doubleValue();
        Integer numValueOf = Integer.valueOf(g9Var.f74865b);
        Integer numD = analyticsCategoryConfig.d();
        this.f74865b = (numD != null ? numD : numValueOf).intValue();
        Integer numValueOf2 = Integer.valueOf(g9Var.f74866c);
        Integer numE = analyticsCategoryConfig.e();
        this.f74866c = (numE != null ? numE : numValueOf2).intValue();
        Boolean boolValueOf = Boolean.valueOf(g9Var.f74867d);
        Boolean boolF = analyticsCategoryConfig.f();
        this.f74867d = (boolF != null ? boolF : boolValueOf).booleanValue();
        if (analyticsCategoryConfig.g() == null) {
            jMax = g9Var.f74868e;
        } else {
            jMax = Math.max(60000L, si.f(analyticsCategoryConfig.g()));
        }
        this.f74868e = jMax;
        if (analyticsCategoryConfig.c() == null) {
            jMax2 = g9Var.f74869f;
        } else {
            jMax2 = Math.max(0L, si.f(analyticsCategoryConfig.c()));
        }
        this.f74869f = jMax2;
        List list = g9Var.f74870g;
        List<AnalyticsCategoryFilterConfig> listB = analyticsCategoryConfig.b();
        List listUnmodifiableList = null;
        if (listB != null) {
            for (AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig : listB) {
                if (analyticsCategoryFilterConfig != null) {
                    listUnmodifiableList = listUnmodifiableList == null ? new ArrayList(listB.size()) : listUnmodifiableList;
                    listUnmodifiableList.add(new j9(analyticsCategoryFilterConfig));
                }
            }
            if (listUnmodifiableList != null) {
                WeakHashMap weakHashMap = si.f75514a;
                listUnmodifiableList = Collections.unmodifiableList(listUnmodifiableList);
            }
        }
        this.f74870g = listUnmodifiableList != null ? listUnmodifiableList : list;
    }
}
