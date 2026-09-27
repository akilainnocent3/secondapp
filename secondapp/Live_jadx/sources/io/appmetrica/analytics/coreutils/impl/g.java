package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class g extends o0 implements ds.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f95289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f95290b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str) {
        super(0);
        this.f95289a = context;
        this.f95290b = str;
    }

    @Override // ds.a
    public final Object invoke() {
        return Boolean.valueOf(this.f95289a.getPackageManager().hasSystemFeature(this.f95290b));
    }
}
