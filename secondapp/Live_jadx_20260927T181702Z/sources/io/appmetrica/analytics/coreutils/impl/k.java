package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import dr.w2;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class k extends o0 implements ds.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f95299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f95300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f95301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f95302d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, ComponentName componentName, int i10, int i11) {
        super(0);
        this.f95299a = context;
        this.f95300b = componentName;
        this.f95301c = i10;
        this.f95302d = i11;
    }

    @Override // ds.a
    public final Object invoke() {
        this.f95299a.getPackageManager().setComponentEnabledSetting(this.f95300b, this.f95301c, this.f95302d);
        return w2.f79517a;
    }
}
