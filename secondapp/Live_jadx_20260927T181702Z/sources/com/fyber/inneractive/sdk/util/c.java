package com.fyber.inneractive.sdk.util;

import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object[] f47853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.e f47854b;

    public c(com.fyber.inneractive.sdk.web.e eVar) {
        this.f47854b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47854b.getClass();
        com.fyber.inneractive.sdk.web.e eVar = this.f47854b;
        boolean z10 = eVar.f47947f;
        if (z10) {
            return;
        }
        d dVar = new d(eVar);
        eVar.f47945d = dVar;
        if (z10) {
            return;
        }
        try {
            eVar.f47942a.execute(dVar);
        } catch (NullPointerException e10) {
            IAlog.f("AsyncTaskExecutor : execute(): Unable to execute the null task: %s", e10.getMessage());
        } catch (RejectedExecutionException e11) {
            IAlog.f("AsyncTaskExecutor : execute(): Unable to execute the task: %s", e11.getMessage());
        }
    }
}
