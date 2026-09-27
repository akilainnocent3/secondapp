package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class j extends o0 implements ds.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f95296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f95297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f95298c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, Intent intent, int i10) {
        super(0);
        this.f95296a = context;
        this.f95297b = intent;
        this.f95298c = i10;
    }

    @Override // ds.a
    public final Object invoke() {
        return this.f95296a.getPackageManager().resolveService(this.f95297b, this.f95298c);
    }
}
