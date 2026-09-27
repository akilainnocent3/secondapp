package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class b extends o0 implements ds.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f95276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f95277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f95278c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, String str, int i10) {
        super(0);
        this.f95276a = context;
        this.f95277b = str;
        this.f95278c = i10;
    }

    @Override // ds.a
    public final Object invoke() {
        return this.f95276a.getPackageManager().getApplicationInfo(this.f95277b, this.f95278c);
    }
}
