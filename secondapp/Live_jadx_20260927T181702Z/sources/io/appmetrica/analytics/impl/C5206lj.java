package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5206lj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f97844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f97845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5281oj f97846d;

    public C5206lj(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, C5281oj c5281oj) {
        this.f97843a = str;
        this.f97844b = context;
        int i10 = AbstractC5180kj.f97747a[counterConfigurationReporterType.ordinal()];
        if (i10 == 1) {
            this.f97845c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        } else if (i10 != 2) {
            this.f97845c = null;
        } else {
            this.f97845c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
        }
        this.f97846d = c5281oj;
    }
}
