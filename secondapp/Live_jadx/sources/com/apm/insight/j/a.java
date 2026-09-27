package com.apm.insight.j;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f26005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26006b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f26007c;

    public a(Handler handler, long j10) {
        this.f26005a = handler;
        this.f26007c = j10;
    }

    public final void a() {
        this.f26005a.post(this);
    }

    public final long b() {
        return this.f26007c;
    }

    public final void a(long j10) {
        if (j10 > 0) {
            this.f26005a.postDelayed(this, j10);
        } else {
            this.f26005a.post(this);
        }
    }
}
