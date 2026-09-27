package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class F8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f95819a;

    static {
        int[] iArr = new int[ModuleEvent.Category.values().length];
        iArr[ModuleEvent.Category.GENERAL.ordinal()] = 1;
        iArr[ModuleEvent.Category.SYSTEM.ordinal()] = 2;
        f95819a = iArr;
    }
}
