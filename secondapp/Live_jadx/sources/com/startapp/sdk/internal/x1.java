package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f75809b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f75811d = new Runnable() { // from class: com.startapp.sdk.internal.ln
        @Override // java.lang.Runnable
        public final void run() {
            this.f75159b.a();
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f75810c = new Handler(Looper.getMainLooper());

    public x1(Context context, wd wdVar) {
        this.f75808a = context;
        this.f75809b = new w1(this, wdVar);
    }

    public abstract void a();
}
