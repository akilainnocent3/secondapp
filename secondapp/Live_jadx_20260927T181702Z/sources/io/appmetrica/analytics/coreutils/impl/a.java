package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class a extends o0 implements ds.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f95273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f95274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f95275c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, ComponentName componentName, int i10) {
        super(0);
        this.f95273a = context;
        this.f95274b = componentName;
        this.f95275c = i10;
    }

    @Override // ds.a
    public final Object invoke() {
        return this.f95273a.getPackageManager().getActivityInfo(this.f95274b, this.f95275c);
    }
}
