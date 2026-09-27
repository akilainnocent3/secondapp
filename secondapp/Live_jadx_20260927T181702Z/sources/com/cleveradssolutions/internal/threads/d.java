package com.cleveradssolutions.internal.threads;

import android.os.Handler;
import com.cleveradssolutions.internal.l;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements com.cleveradssolutions.sdk.base.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f43833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f43834c;

    public d(Runnable work, Handler handler) {
        m0.p(work, "work");
        this.f43833b = handler;
        this.f43834c = new l(new WeakReference(work));
    }

    @Override // com.cleveradssolutions.sdk.base.d
    public final void N() {
        WeakReference weakReference = this.f43834c.f43574a;
        Runnable runnable = (Runnable) (weakReference != null ? weakReference.get() : null);
        if (runnable != null) {
            Handler handler = this.f43833b;
            if (handler != null) {
                handler.removeCallbacks(runnable);
            }
            this.f43834c.f43574a = null;
        }
        this.f43833b = null;
    }

    @Override // com.cleveradssolutions.sdk.base.d
    public final Handler S() {
        return this.f43833b;
    }

    @Override // com.cleveradssolutions.sdk.base.d
    public final boolean e0() {
        WeakReference weakReference = this.f43834c.f43574a;
        return (((Runnable) (weakReference != null ? weakReference.get() : null)) == null || this.f43833b == null) ? false : true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference = this.f43834c.f43574a;
        Runnable runnable = (Runnable) (weakReference != null ? weakReference.get() : null);
        if (runnable != null) {
            runnable.run();
        }
        this.f43834c.f43574a = null;
        this.f43833b = null;
    }

    @Override // com.cleveradssolutions.sdk.base.d
    public final void y0(Handler handler) {
        this.f43833b = handler;
    }
}
