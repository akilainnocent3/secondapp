package com.fyber.inneractive.sdk.web;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.util.e f47944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.util.d f47945d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f47948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f47949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f47950i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f47951j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f47952k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f47953l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f47943b = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f47946e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f47947f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f47942a = Executors.newSingleThreadExecutor(new com.fyber.inneractive.sdk.util.b());

    public e(i1 i1Var, String str, boolean z10, String str2, String str3, String str4) {
        this.f47953l = i1Var;
        this.f47948g = str;
        this.f47949h = z10;
        this.f47950i = str2;
        this.f47951j = str3;
        this.f47952k = str4;
    }

    public final Handler a() {
        if (this.f47943b == null) {
            synchronized (this.f47946e) {
                this.f47943b = new Handler(Looper.getMainLooper());
            }
        }
        return this.f47943b;
    }
}
