package com.cleveradssolutions.internal.threads;

import com.cleveradssolutions.internal.services.q;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f43829b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Runnable runnable, String str, ThreadGroup threadGroup) {
        super(threadGroup, runnable, str, 0L);
        this.f43829b = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        try {
            super.run();
        } catch (Throwable th2) {
            q qVar = q.f43760b;
            q.F(this.f43829b, th2);
        }
    }
}
