package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f46993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f46994b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, ConditionVariable conditionVariable) {
        super("SimpleCache.initialize()");
        this.f46994b = lVar;
        this.f46993a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f46994b) {
            this.f46993a.open();
            try {
                l.a(this.f46994b);
            } catch (a e10) {
                this.f46994b.f47000f = e10;
            }
            this.f46994b.f46996b.getClass();
        }
    }
}
