package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class q4 implements i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f75402a;

    public q4(Context context) {
        this.f75402a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        Context context = this.f75402a;
        return new mc(context, new sf(context.getSharedPreferences("StartApp-b36110d5cb803404", 0)), new p4(), new Handler(Looper.getMainLooper()));
    }
}
