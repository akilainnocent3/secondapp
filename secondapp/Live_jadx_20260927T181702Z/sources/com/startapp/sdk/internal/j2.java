package com.startapp.sdk.internal;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f75016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i2 f75018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f75019e;

    public j2(Context context, String str, i2 i2Var, int i10) {
        this.f75015a = context;
        this.f75017c = str;
        this.f75018d = i2Var;
        this.f75019e = i10;
    }

    public final void a() {
        ((Executor) com.startapp.sdk.components.a.a(this.f75015a).B.a()).execute(new h2(this));
    }
}
