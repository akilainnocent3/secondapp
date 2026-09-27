package com.startapp.sdk.internal;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class b4 implements i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f74582a;

    public b4(ThreadPoolExecutor threadPoolExecutor) {
        this.f74582a = threadPoolExecutor;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return Integer.valueOf(this.f74582a.getMaximumPoolSize() - this.f74582a.getActiveCount());
    }
}
